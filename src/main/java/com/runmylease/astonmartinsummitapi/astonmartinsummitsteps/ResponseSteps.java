package com.runmylease.astonmartinsummitapi.astonmartinsummitsteps;

import com.fasterxml.jackson.core.type.TypeReference;
import com.runmylease.astonmartinsummitapi.utils.JSONCustomParser;
import com.runmylease.astonmartinsummitapi.utils.logger.CustomLogger;
import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ResponseSteps {

    public static <T> T getObject(Response response, TypeReference<T> tClass) {
        CustomLogger.info(String.format("ResponseSteps.getObject() : %s", tClass));
        return JSONCustomParser.getObjectFromString(response.body().asString(), tClass);
    }

    public static String getJsonStringFromResponse(Response response) {
        return response.jsonPath().prettify();
    }
}
