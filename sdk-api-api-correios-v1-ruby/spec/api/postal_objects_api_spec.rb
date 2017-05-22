=begin
#API dos Correios

#Postal Object tracking API

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::PostalObjectsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PostalObjectsApi' do
  before do
    # run before each test
    @instance = SwaggerClient::PostalObjectsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PostalObjectsApi' do
    it 'should create an instact of PostalObjectsApi' do
      expect(@instance).to be_instance_of(SwaggerClient::PostalObjectsApi)
    end
  end

  # unit tests for events_event_type_get
  # 
  # Returns the list of possible event status for a given postal events.
  # @param client_id Customer identifier used for authentication.
  # @param access_token Access token used in the authentication.
  # @param event_type Event type to be searched.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :event_status Filter the search by a certain event status.
  # @return [Array<InlineResponse2002>]
  describe 'events_event_type_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for objects_get
  # 
  # Searches for the events related to a list of postal objects.
  # @param client_id Customer identifier used for authentication.
  # @param access_token Access token used in the authentication.
  # @param object_code List of comma separated codes to be consulted.
  # @param [Hash] opts the optional parameters
  # @return [Array<InlineResponse2003>]
  describe 'objects_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for objects_object_code_get
  # 
  # Searches for the informations related to a specific postal object.
  # @param client_id Customer identifier used for authentication.
  # @param access_token Access token used in the authentication.
  # @param object_code Code of the object to be consulted.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :event_type Event type to be filtered.
  # @return [Array<ObjectsEventos>]
  describe 'objects_object_code_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
