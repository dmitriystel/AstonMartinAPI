package com.runmylease.astonmartinsummitapi.test;

import com.runmylease.astonmartinsummitapi.astonmartinsummitsteps.DefaultSteps;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DefaultTest {
    // done, GET app/health
    @Test
    public void testAppHealth(){

        Response response = DefaultSteps.getAppHealth();

        int actualStatusCode = response.getStatusCode();
        String actualContentType = response.getContentType();
        String actualBody = (response.getBody()).asString();

        Assert.assertEquals(actualStatusCode, 200, "Status code is not 200");
        Assert.assertEquals(actualContentType, "text/html; charset=utf-8",
                "Content type ia not: text/html; charset=utf-8");
        Assert.assertEquals(actualBody, "true", "Body is false");
    }
    // done, GET /app/permission
    // without body assertion
    @Test
    public void testAppPermission(){

        Response response = DefaultSteps.getAppPermissions();

        int actualStatusCode = response.getStatusCode();
        String actualContentType = response.getContentType();

        Assert.assertEquals(actualStatusCode, 200, "Status code is not 200");
        Assert.assertEquals(actualContentType, "application/json; charset=utf-8",
                "Content type is not: application/json; charset=utf-8");
    }
    // done GET /cms/config
    @Test
    public void testCmsConfig(){

        Response response = DefaultSteps.getCmsConfig();

        int actualStatusCode = response.getStatusCode();
        String actualContentType = response.getContentType();
        String actualBody = (response.getBody()).asString();

        Assert.assertEquals(actualStatusCode,401, "Status code is not 401");
        Assert.assertEquals(actualContentType, "application/json; charset=utf-8", "Content type is not: application/json; charset=utf-8");
        Assert.assertEquals(actualBody, "{\"statusCode\":401,\"message\":\"Unauthorized\"}",
                "Body is not {\"statusCode\":401,\"message\":\"Unauthorized\"}");
    }
    // done, POST /service-api/sites
    @Test
    public void testServiceApiSites(){

        Response response = DefaultSteps.getServiceApiSites();

        int actualStatusCode = response.getStatusCode();
        String actualContentType = response.getContentType();
        String actualBody = (response.getBody()).asString();

        Assert.assertEquals(actualStatusCode,403, "Status code is not 403");
        Assert.assertEquals(actualContentType, "application/json; charset=utf-8", "Content type is not: application/json; charset=utf-8");
        Assert.assertEquals(actualBody, "{\"statusCode\":403,\"message\":\"Forbidden resource\",\"error\":\"Forbidden\"}",
                "Body is not {\"statusCode\":403,\"message\":\"Forbidden resource\",\"error\":\"Forbidden\"}");
    }
    // done, GET /third-party/iodstream
    @Test
    public void testThirdPartyIodstream(){

        Response response = DefaultSteps.getThirdPartyIodstream();

        int actualStatusCode = response.getStatusCode();

        Assert.assertEquals(actualStatusCode,200, "Status code is not 200");
    }
}
