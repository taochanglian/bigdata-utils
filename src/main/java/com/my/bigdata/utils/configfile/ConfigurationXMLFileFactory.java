package com.my.bigdata.utils.configfile;

import com.my.bigdata.utils.IConstants;
import org.apache.commons.configuration2.XMLConfiguration;

import java.io.File;

/**
 * xml配置文件读取Util
 */
public class ConfigurationXMLFileFactory {

    private static XMLConfiguration conf = null;
    private static File path;

    //private cons
    private ConfigurationXMLFileFactory() {
    }

    //init for load *.xml file
    public static void init(String xmlFilePath) {
        if(xmlFilePath == null) {
            xmlFilePath = IConstants.DEFAULT_XML_CONFIG_FILE_PATH;
        }
    }
}
