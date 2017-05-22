=begin
#API do Futebolcard

#Futebolcard manipulation API

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient

  class Events
    attr_accessor :event_id

    attr_accessor :categorie_name

    attr_accessor :internet_sale_start_date

    attr_accessor :internet_sale_end_date

    attr_accessor :sale_start_date

    attr_accessor :sale_end_date

    attr_accessor :member_sale_start_date

    attr_accessor :member_sale_end_date

    attr_accessor :event_date

    attr_accessor :event_time

    attr_accessor :stadium_name

    attr_accessor :city

    attr_accessor :state

    attr_accessor :principal_club

    attr_accessor :opponent_club

    attr_accessor :principal_club_image

    attr_accessor :opponent_club_image

    attr_accessor :express_sale


    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'event_id' => :'eventId',
        :'categorie_name' => :'categorieName',
        :'internet_sale_start_date' => :'internetSaleStartDate',
        :'internet_sale_end_date' => :'internetSaleEndDate',
        :'sale_start_date' => :'saleStartDate',
        :'sale_end_date' => :'saleEndDate',
        :'member_sale_start_date' => :'memberSaleStartDate',
        :'member_sale_end_date' => :'memberSaleEndDate',
        :'event_date' => :'eventDate',
        :'event_time' => :'eventTime',
        :'stadium_name' => :'stadiumName',
        :'city' => :'city',
        :'state' => :'state',
        :'principal_club' => :'principalClub',
        :'opponent_club' => :'opponentClub',
        :'principal_club_image' => :'principalClubImage',
        :'opponent_club_image' => :'opponentClubImage',
        :'express_sale' => :'expressSale'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'event_id' => :'String',
        :'categorie_name' => :'String',
        :'internet_sale_start_date' => :'String',
        :'internet_sale_end_date' => :'String',
        :'sale_start_date' => :'String',
        :'sale_end_date' => :'String',
        :'member_sale_start_date' => :'String',
        :'member_sale_end_date' => :'String',
        :'event_date' => :'String',
        :'event_time' => :'String',
        :'stadium_name' => :'String',
        :'city' => :'String',
        :'state' => :'String',
        :'principal_club' => :'String',
        :'opponent_club' => :'String',
        :'principal_club_image' => :'String',
        :'opponent_club_image' => :'String',
        :'express_sale' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'eventId')
        self.event_id = attributes[:'eventId']
      end

      if attributes.has_key?(:'categorieName')
        self.categorie_name = attributes[:'categorieName']
      end

      if attributes.has_key?(:'internetSaleStartDate')
        self.internet_sale_start_date = attributes[:'internetSaleStartDate']
      end

      if attributes.has_key?(:'internetSaleEndDate')
        self.internet_sale_end_date = attributes[:'internetSaleEndDate']
      end

      if attributes.has_key?(:'saleStartDate')
        self.sale_start_date = attributes[:'saleStartDate']
      end

      if attributes.has_key?(:'saleEndDate')
        self.sale_end_date = attributes[:'saleEndDate']
      end

      if attributes.has_key?(:'memberSaleStartDate')
        self.member_sale_start_date = attributes[:'memberSaleStartDate']
      end

      if attributes.has_key?(:'memberSaleEndDate')
        self.member_sale_end_date = attributes[:'memberSaleEndDate']
      end

      if attributes.has_key?(:'eventDate')
        self.event_date = attributes[:'eventDate']
      end

      if attributes.has_key?(:'eventTime')
        self.event_time = attributes[:'eventTime']
      end

      if attributes.has_key?(:'stadiumName')
        self.stadium_name = attributes[:'stadiumName']
      end

      if attributes.has_key?(:'city')
        self.city = attributes[:'city']
      end

      if attributes.has_key?(:'state')
        self.state = attributes[:'state']
      end

      if attributes.has_key?(:'principalClub')
        self.principal_club = attributes[:'principalClub']
      end

      if attributes.has_key?(:'opponentClub')
        self.opponent_club = attributes[:'opponentClub']
      end

      if attributes.has_key?(:'principalClubImage')
        self.principal_club_image = attributes[:'principalClubImage']
      end

      if attributes.has_key?(:'opponentClubImage')
        self.opponent_club_image = attributes[:'opponentClubImage']
      end

      if attributes.has_key?(:'expressSale')
        self.express_sale = attributes[:'expressSale']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          event_id == o.event_id &&
          categorie_name == o.categorie_name &&
          internet_sale_start_date == o.internet_sale_start_date &&
          internet_sale_end_date == o.internet_sale_end_date &&
          sale_start_date == o.sale_start_date &&
          sale_end_date == o.sale_end_date &&
          member_sale_start_date == o.member_sale_start_date &&
          member_sale_end_date == o.member_sale_end_date &&
          event_date == o.event_date &&
          event_time == o.event_time &&
          stadium_name == o.stadium_name &&
          city == o.city &&
          state == o.state &&
          principal_club == o.principal_club &&
          opponent_club == o.opponent_club &&
          principal_club_image == o.principal_club_image &&
          opponent_club_image == o.opponent_club_image &&
          express_sale == o.express_sale
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [event_id, categorie_name, internet_sale_start_date, internet_sale_end_date, sale_start_date, sale_end_date, member_sale_start_date, member_sale_end_date, event_date, event_time, stadium_name, city, state, principal_club, opponent_club, principal_club_image, opponent_club_image, express_sale].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map{ |v| _deserialize($1, v) } )
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = SwaggerClient.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map{ |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
