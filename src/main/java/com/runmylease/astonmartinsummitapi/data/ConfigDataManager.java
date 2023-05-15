package com.runmylease.astonmartinsummitapi.data;

import com.runmylease.astonmartinsummitapi.constants.FilePaths;
import com.runmylease.astonmartinsummitapi.utils.JSONCustomParser;

public class ConfigDataManager {

    private static final String BASE_URL = "baseUrl";
    private static final String BASE_REQUEST_URL = "baseRequestUrl";
    private static final String API_VERSION = "apiVersion";

    public static String getURL() {
        return JSONCustomParser.parseElementByName(FilePaths.CONFIG_FILE_PATH, BASE_URL);
    }

    public static String getBaseRequestURL() {
        return JSONCustomParser.parseElementByName(FilePaths.CONFIG_FILE_PATH, BASE_REQUEST_URL);
    }

    public static String getApiVersion() {
        return JSONCustomParser.parseElementByName(FilePaths.CONFIG_FILE_PATH, API_VERSION);
    }
}
