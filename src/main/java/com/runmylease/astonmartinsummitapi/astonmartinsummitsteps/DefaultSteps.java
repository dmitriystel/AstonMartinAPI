package com.runmylease.astonmartinsummitapi.astonmartinsummitsteps;

import com.runmylease.astonmartinsummitapi.constants.Endpoints;
import com.runmylease.astonmartinsummitapi.constants.Parameters;
import com.runmylease.astonmartinsummitapi.data.ConfigDataManager;
import com.runmylease.astonmartinsummitapi.data.TestDataManager;
import com.runmylease.astonmartinsummitapi.utils.logger.CustomLogger;
import io.restassured.response.Response;

public class DefaultSteps extends BaseSteps{

    public static Response getAppHealth(){

        CustomLogger.info("getAppHealth()");
        return baseRequest()
                .get(Endpoints.APP_HEALTH);
    }

    public static Response getAppPermissions(){

        CustomLogger.info("getAppPermissions()");
        return baseRequest()
                .get(Endpoints.APP_PERMISSIONS);
    }

    public static Response getCmsConfig(){

        CustomLogger.info("getCmsConfig()");
        return baseRequest()
                .get(Endpoints.CMS_CONFIG);
    }

    public static Response getServiceApiSites(){

        CustomLogger.info("getServiceApiSites()");
        return baseRequest()
                .post(Endpoints.SERVICE_API_SITES);
    }

    public static Response getThirdPartyIodstream(){

        CustomLogger.info("getThirdPartyIodstream()");
        return baseRequest()
                .queryParam(Parameters.VIN, TestDataManager.getVin())
                .queryParam(Parameters.DEALER, TestDataManager.getDealer())
                .get(Endpoints.THIRD_PARTY_IODSTREAM);
    }















}
