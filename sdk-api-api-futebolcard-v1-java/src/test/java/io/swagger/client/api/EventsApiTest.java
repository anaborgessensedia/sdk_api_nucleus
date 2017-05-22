/*
 * API do Futebolcard
 * Futebolcard manipulation API
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
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
@Ignore
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    
    /**
     * 
     *
     * Returns the details for a specific event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventsEventIdGetTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String eventId = null;
        InlineResponse200 response = api.eventsEventIdGet(clientId, accessToken, eventId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of sector for the given event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventsEventIdSectorsGetTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String eventId = null;
        InlineResponse2001 response = api.eventsEventIdSectorsGet(clientId, accessToken, eventId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the details of a specific sector.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventsEventIdSectorsSectorIdGetTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String eventId = null;
        String sectorId = null;
        InlineResponse2002 response = api.eventsEventIdSectorsSectorIdGet(clientId, accessToken, eventId, sectorId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of subcsectors for a given sector.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventsEventIdSectorsSectorIdSubsectorsGetTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String eventId = null;
        String sectorId = null;
        List<InlineResponse2002> response = api.eventsEventIdSectorsSectorIdSubsectorsGet(clientId, accessToken, eventId, sectorId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of seat&#39;s information for each row of a given subsector.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGetTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String eventId = null;
        String sectorId = null;
        String subsectorId = null;
        List<InlineResponse2003> response = api.eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet(clientId, accessToken, eventId, sectorId, subsectorId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of existing events.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventsGetTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        List<InlineResponse200> response = api.eventsGet(clientId, accessToken);

        // TODO: test validations
    }
    
}
