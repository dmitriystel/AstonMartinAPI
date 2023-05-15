package com.runmylease.astonmartinsummitapi.data;

import com.runmylease.astonmartinsummitapi.constants.FilePaths;
import com.runmylease.astonmartinsummitapi.utils.JSONCustomParser;

public class TestDataManager {

    private static final String USER_ID = "userID";
    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
    private static final String USER_TOKEN = "token";
    private static final String VIN = "vin";
    private static final String DEALER = "dealer";


    public static int getUserID() {
        return Integer.parseInt(JSONCustomParser.parseElementByName(FilePaths.CREDENTIALS_FILE_PATH, USER_ID));
    }

    public static String getUserPhone() {
        return JSONCustomParser.parseElementByName(FilePaths.CREDENTIALS_FILE_PATH, LOGIN);
    }

    public static String getUserEmail() {
        return JSONCustomParser.parseElementByName(FilePaths.CREDENTIALS_FILE_PATH, PASSWORD);
    }

    public static String getUserToken() {
        return JSONCustomParser.parseElementByName(FilePaths.CREDENTIALS_FILE_PATH, USER_TOKEN);
    }

    public static String getVin() {
        return JSONCustomParser.parseElementByName(FilePaths.CREDENTIALS_FILE_PATH, VIN);
    }

    public static String getDealer() {
        return JSONCustomParser.parseElementByName(FilePaths.CREDENTIALS_FILE_PATH, DEALER);
    }



}
