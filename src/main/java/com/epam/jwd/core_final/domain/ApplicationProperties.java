package com.epam.jwd.core_final.domain;

import com.epam.jwd.core_final.util.PropertyReaderUtil;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Properties;

/**
 * This class should be IMMUTABLE!
 * <p>
 * Expected fields:
 * <p>
 * inputRootDir {@link String} - base dir for all input files
 * outputRootDir {@link String} - base dir for all output files
 * crewFileName {@link String}
 * missionsFileName {@link String}
 * spaceshipsFileName {@link String}
 * <p>
 * fileRefreshRate {@link Integer}
 * dateTimeFormat {@link String} - date/time format for {@link java.time.format.DateTimeFormatter} pattern
 */
public class ApplicationProperties {
    private String inputRootDir;
    private String outputRootDir;
    private String crewFileName;
    private String missionsFileName;
    private String spaceshipsFileName;
    private String spaceMapFileName;
    private Integer fileRefreshRate;
    private String dateTimeFormat;
    private String rootDir = "src/main/resources/";
    private String delimiterForCrewFileName = ";";
    private String delimiterForSpaceshipFile = "\n";
    private String delimiterForSpaceMapFileName = " ";
    PropertyReaderUtil propertyReaderUtil = PropertyReaderUtil.getInstance();
    Properties properties = propertyReaderUtil.getProperties();

    public String getInputRootDir() {
        inputRootDir = properties.getProperty("inputRootDir");
        return inputRootDir;
    }

    public String getOutputRootDir() {
        outputRootDir = properties.getProperty("outputRootDir");
        return outputRootDir;
    }

    public String getCrewFileName() {
        crewFileName = properties.getProperty("crewFileName");
        return crewFileName;
    }

    public String getMissionsFileName() {
        missionsFileName = properties.getProperty("missionsFileName");
        return missionsFileName;
    }

    public String getSpaceshipsFileName() {
        spaceshipsFileName = properties.getProperty("spaceshipsFileName");
        return spaceshipsFileName;
    }

    public String getSpaceMapFileName() {
        spaceMapFileName = properties.getProperty("spaceMapFileName");
        return spaceMapFileName;
    }

    public Integer getFileRefreshRate() {
        fileRefreshRate = Integer.parseInt(properties.getProperty("fileRefreshRate"));
        return fileRefreshRate;
    }

    public FormatStyle getDateTimeFormat() {
        FormatStyle formatStyle =  FormatStyle.valueOf(properties.getProperty("dateTimeFormat"));
        return formatStyle;
    }

    public String getRootDir() {
        return rootDir;
    }

    public String getIndexForCrewFileName() {
        return delimiterForCrewFileName;
    }

    public String getIndexForSpaceshipFileName() {
        return delimiterForSpaceshipFile;
    }

    public String getIndexForSpaceMapFileName() {
        return delimiterForSpaceMapFileName;
    }
}
