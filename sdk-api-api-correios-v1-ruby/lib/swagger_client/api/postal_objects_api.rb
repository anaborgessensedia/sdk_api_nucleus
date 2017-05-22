=begin
#API dos Correios

#Postal Object tracking API

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require "uri"

module SwaggerClient
  class PostalObjectsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # 
    # Returns the list of possible event status for a given postal events.
    # @param client_id Customer identifier used for authentication.
    # @param access_token Access token used in the authentication.
    # @param event_type Event type to be searched.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :event_status Filter the search by a certain event status.
    # @return [Array<InlineResponse2002>]
    def events_event_type_get(client_id, access_token, event_type, opts = {})
      data, _status_code, _headers = events_event_type_get_with_http_info(client_id, access_token, event_type, opts)
      return data
    end

    # 
    # Returns the list of possible event status for a given postal events.
    # @param client_id Customer identifier used for authentication.
    # @param access_token Access token used in the authentication.
    # @param event_type Event type to be searched.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :event_status Filter the search by a certain event status.
    # @return [Array<(Array<InlineResponse2002>, Fixnum, Hash)>] Array<InlineResponse2002> data, response status code and response headers
    def events_event_type_get_with_http_info(client_id, access_token, event_type, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: PostalObjectsApi.events_event_type_get ..."
      end
      # verify the required parameter 'client_id' is set
      fail ArgumentError, "Missing the required parameter 'client_id' when calling PostalObjectsApi.events_event_type_get" if client_id.nil?
      # verify the required parameter 'access_token' is set
      fail ArgumentError, "Missing the required parameter 'access_token' when calling PostalObjectsApi.events_event_type_get" if access_token.nil?
      # verify the required parameter 'event_type' is set
      fail ArgumentError, "Missing the required parameter 'event_type' when calling PostalObjectsApi.events_event_type_get" if event_type.nil?
      # resource path
      local_var_path = "/events/{eventType}".sub('{format}','json').sub('{' + 'eventType' + '}', event_type.to_s)

      # query parameters
      query_params = {}
      query_params[:'eventStatus'] = opts[:'event_status'] if !opts[:'event_status'].nil?

      # header parameters
      header_params = {}
      header_params[:'client_id'] = client_id
      header_params[:'access_token'] = access_token

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<InlineResponse2002>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PostalObjectsApi#events_event_type_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # 
    # Searches for the events related to a list of postal objects.
    # @param client_id Customer identifier used for authentication.
    # @param access_token Access token used in the authentication.
    # @param object_code List of comma separated codes to be consulted.
    # @param [Hash] opts the optional parameters
    # @return [Array<InlineResponse2003>]
    def objects_get(client_id, access_token, object_code, opts = {})
      data, _status_code, _headers = objects_get_with_http_info(client_id, access_token, object_code, opts)
      return data
    end

    # 
    # Searches for the events related to a list of postal objects.
    # @param client_id Customer identifier used for authentication.
    # @param access_token Access token used in the authentication.
    # @param object_code List of comma separated codes to be consulted.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<InlineResponse2003>, Fixnum, Hash)>] Array<InlineResponse2003> data, response status code and response headers
    def objects_get_with_http_info(client_id, access_token, object_code, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: PostalObjectsApi.objects_get ..."
      end
      # verify the required parameter 'client_id' is set
      fail ArgumentError, "Missing the required parameter 'client_id' when calling PostalObjectsApi.objects_get" if client_id.nil?
      # verify the required parameter 'access_token' is set
      fail ArgumentError, "Missing the required parameter 'access_token' when calling PostalObjectsApi.objects_get" if access_token.nil?
      # verify the required parameter 'object_code' is set
      fail ArgumentError, "Missing the required parameter 'object_code' when calling PostalObjectsApi.objects_get" if object_code.nil?
      # resource path
      local_var_path = "/objects".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'objectCode'] = object_code

      # header parameters
      header_params = {}
      header_params[:'client_id'] = client_id
      header_params[:'access_token'] = access_token

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<InlineResponse2003>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PostalObjectsApi#objects_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # 
    # Searches for the informations related to a specific postal object.
    # @param client_id Customer identifier used for authentication.
    # @param access_token Access token used in the authentication.
    # @param object_code Code of the object to be consulted.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :event_type Event type to be filtered.
    # @return [Array<ObjectsEventos>]
    def objects_object_code_get(client_id, access_token, object_code, opts = {})
      data, _status_code, _headers = objects_object_code_get_with_http_info(client_id, access_token, object_code, opts)
      return data
    end

    # 
    # Searches for the informations related to a specific postal object.
    # @param client_id Customer identifier used for authentication.
    # @param access_token Access token used in the authentication.
    # @param object_code Code of the object to be consulted.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :event_type Event type to be filtered.
    # @return [Array<(Array<ObjectsEventos>, Fixnum, Hash)>] Array<ObjectsEventos> data, response status code and response headers
    def objects_object_code_get_with_http_info(client_id, access_token, object_code, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: PostalObjectsApi.objects_object_code_get ..."
      end
      # verify the required parameter 'client_id' is set
      fail ArgumentError, "Missing the required parameter 'client_id' when calling PostalObjectsApi.objects_object_code_get" if client_id.nil?
      # verify the required parameter 'access_token' is set
      fail ArgumentError, "Missing the required parameter 'access_token' when calling PostalObjectsApi.objects_object_code_get" if access_token.nil?
      # verify the required parameter 'object_code' is set
      fail ArgumentError, "Missing the required parameter 'object_code' when calling PostalObjectsApi.objects_object_code_get" if object_code.nil?
      # resource path
      local_var_path = "/objects/{objectCode}".sub('{format}','json').sub('{' + 'objectCode' + '}', object_code.to_s)

      # query parameters
      query_params = {}
      query_params[:'eventType'] = opts[:'event_type'] if !opts[:'event_type'].nil?

      # header parameters
      header_params = {}
      header_params[:'client_id'] = client_id
      header_params[:'access_token'] = access_token

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<ObjectsEventos>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PostalObjectsApi#objects_object_code_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
