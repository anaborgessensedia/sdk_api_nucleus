=begin
#API Agillitas Cartões Pré-pagos

#API para manipular recursos relacionadas à cartões pré-pagos Agillitas.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require "uri"

module SwaggerClient
  class PagamentosApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Pagamento de boletos.
    # <p>Permite o pagamento de boletos.</p>
    # @param boleto Objeto de requisição
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def pagamentos_post(boleto, opts = {})
      pagamentos_post_with_http_info(boleto, opts)
      return nil
    end

    # Pagamento de boletos.
    # &lt;p&gt;Permite o pagamento de boletos.&lt;/p&gt;
    # @param boleto Objeto de requisição
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def pagamentos_post_with_http_info(boleto, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: PagamentosApi.pagamentos_post ..."
      end
      # verify the required parameter 'boleto' is set
      fail ArgumentError, "Missing the required parameter 'boleto' when calling PagamentosApi.pagamentos_post" if boleto.nil?
      # resource path
      local_var_path = "/pagamentos".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(boleto)
      auth_names = ['access_token', 'key_id', 'client_id']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PagamentosApi#pagamentos_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end