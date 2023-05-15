package com.runmylease.astonmartinsummitapi.test;

import com.runmylease.astonmartinsummitapi.astonmartinsummitsteps.SiteBuilderSteps;
import io.restassured.response.Response;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class SiteBuilderTest {

    @Test
    public void testCmsSites(){

        Response response = SiteBuilderSteps.getCmsSites();
        int actual = response.getStatusCode();

        Assert.assertEquals(401, actual);
    }


}
