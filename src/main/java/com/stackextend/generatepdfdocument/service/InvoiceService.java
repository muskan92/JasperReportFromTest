package com.stackextend.generatepdfdocument.service;

import com.stackextend.generatepdfdocument.model.OrderModel;
import com.stackextend.generatepdfdocument.model.TollingData;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.jasperreports.JasperReportsUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@Service
public class InvoiceService {

    private static Logger logger = LogManager.getLogger(InvoiceService.class);

    //@Value("${invoice.logo.path}")
    private String logo_path = "/jasper/images/logo_azuga.png";

    //@Value("${invoice.template.path}")
    private String invoice_template = "/jasper/localization/tollingi95.jrxml";

    public File generateInvoiceFor(OrderModel order, Locale locale) throws IOException {

        File pdfFile = File.createTempFile("my-invoice", ".pdf");

        logger.info(String.format("Invoice pdf path : %s", pdfFile.getAbsolutePath()));

        try(FileOutputStream pos = new FileOutputStream(pdfFile))
        {
            // Load invoice JRXML template.
            final JasperReport report = loadTemplate();

            // Fill parameters map.
            final Map<String, Object> parameters = parameters(order, locale);

            // Create an empty datasource.
            final JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(Collections.singletonList("Invoice"));

            // Render the invoice as a PDF file.
            JasperReportsUtils.renderAsPdf(report, parameters, dataSource, pos);

            // return file.
            return pdfFile;
        }
        catch (final Exception e)
        {
            logger.error(String.format("An error occured during PDF creation: %s", e));
            throw new RuntimeException(e);
        }
    }

    public void generateInvoiceForMuskan(TollingData tollingData, Locale locale) throws IOException {

        HashMap<String, Object> parameterMap = new HashMap<String, Object>();
        parameterMap.put("PeriodStartDate", new Date());
        parameterMap.put("PeriodEndDate", new Date());
        parameterMap.put("monthName", "august");
        parameterMap.put("UserId", "123");
        parameterMap.put("imageDirPath", "C:\\Users\\Azuga\\gitMuskan\\jasperreports-pdf-generation-example\\src\\main\\resources\\jasper\\images\\");
        parameterMap.put("jrxmlDirPath", "/jasper/localization/");
        parameterMap.put("contactNumber", "122355");
        parameterMap.put("contactEmail", "sakhk@dhu");
        parameterMap.put("testp", "testparam");
        parameterMap.put("muskanDate", new Date());


        File pdfFile = File.createTempFile("my-invoice", ".pdf");

        logger.info(String.format("Invoice pdf path : %s", pdfFile.getAbsolutePath()));

        try(FileOutputStream pos = new FileOutputStream(pdfFile))
        {
            // Load invoice JRXML template.
            final JasperReport report = loadTemplate();

            // Fill parameters map.
            // final Map<String, Object> parameters = parameters(order, locale);

            // Create an empty datasource.
            final JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(Collections.singletonList(tollingData));

            // Render the invoice as a PDF file.
            JasperReportsUtils.renderAsPdf(report, parameterMap, dataSource, pos);

            pos.close();
        }
        catch (final Exception e)
        {
            logger.error(String.format("An error occured during PDF creation: %s", e));
            throw new RuntimeException(e);
        }
    }




    // Fill template order params
    private Map<String, Object> parameters(OrderModel order, Locale locale) {
        final Map<String, Object> parameters = new HashMap<>();
        parameters.put("logo", getClass().getResourceAsStream(logo_path));
        parameters.put("order",  order);
        parameters.put("REPORT_LOCALE", locale);
        return parameters;
    }

    // Load invoice JRXML template
    private JasperReport loadTemplate() throws JRException {

        logger.info(String.format("Invoice template path : %s", invoice_template));

        final InputStream reportInputStream = getClass().getResourceAsStream(invoice_template);
        final JasperDesign jasperDesign = JRXmlLoader.load(reportInputStream);

        return JasperCompileManager.compileReport(jasperDesign);
    }

}
