package com.runmylease.astonmartinsummitapi.astonmartinsummitsteps;

import com.runmylease.astonmartinsummitapi.data.ConfigDataManager;
import com.runmylease.astonmartinsummitapi.utils.logger.CustomFilter;
import com.runmylease.astonmartinsummitapi.utils.logger.CustomLogger;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public abstract class BaseSteps {

    private final static String BASE_API_URL = ConfigDataManager.getBaseRequestURL();

    protected static RequestSpecification baseRequest() {
        CustomLogger.info(String.format("BaseSteps.baseRequest() : %s", BASE_API_URL));
        return given()
                .filter(new CustomFilter())
                .baseUri(BASE_API_URL)
                .contentType(ContentType.JSON);
    }
}
