package com.runmylease.astonmartinsummitapi.astonmartinsummitsteps;

import com.runmylease.astonmartinsummitapi.constants.Endpoints;
import com.runmylease.astonmartinsummitapi.constants.Parameters;
import com.runmylease.astonmartinsummitapi.data.TestDataManager;
import com.runmylease.astonmartinsummitapi.utils.logger.CustomLogger;
import io.restassured.response.Response;

public class SiteBuilderSteps extends BaseSteps {
// in progress
    public static Response getSiteBuilder(){

        CustomLogger.info("getSiteBuilder()");
        return baseRequest()
                .queryParam(Parameters.VIN, TestDataManager.getVin())
                .queryParam(Parameters.DEALER, TestDataManager.getDealer())
                .get(Endpoints.THIRD_PARTY_IODSTREAM);
    }




    public static Response getCmsSites(){

        CustomLogger.info("getCmsSites()");
        return baseRequest()
                .get(Endpoints.CMS_SITES);
    }

}
