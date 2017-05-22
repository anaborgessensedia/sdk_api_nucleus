/*
 * API dos Correios
 * Postal Object tracking API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressesApi
 */
@Ignore
public class AddressesApiTest {

    private final AddressesApi api = new AddressesApi();

    
    /**
     * 
     *
     * Searches for the address of a given zipcodes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressesZipcodeGetTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String zipcode = null;
        List<InlineResponse2001> response = api.addressesZipcodeGet(clientId, accessToken, zipcode);

        // TODO: test validations
    }
    
}
