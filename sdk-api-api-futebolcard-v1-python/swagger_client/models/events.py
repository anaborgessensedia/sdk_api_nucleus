# coding: utf-8

"""
    API do Futebolcard

    Futebolcard manipulation API

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class Events(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, event_id=None, categorie_name=None, internet_sale_start_date=None, internet_sale_end_date=None, sale_start_date=None, sale_end_date=None, member_sale_start_date=None, member_sale_end_date=None, event_date=None, event_time=None, stadium_name=None, city=None, state=None, principal_club=None, opponent_club=None, principal_club_image=None, opponent_club_image=None, express_sale=None):
        """
        Events - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'event_id': 'str',
            'categorie_name': 'str',
            'internet_sale_start_date': 'str',
            'internet_sale_end_date': 'str',
            'sale_start_date': 'str',
            'sale_end_date': 'str',
            'member_sale_start_date': 'str',
            'member_sale_end_date': 'str',
            'event_date': 'str',
            'event_time': 'str',
            'stadium_name': 'str',
            'city': 'str',
            'state': 'str',
            'principal_club': 'str',
            'opponent_club': 'str',
            'principal_club_image': 'str',
            'opponent_club_image': 'str',
            'express_sale': 'str'
        }

        self.attribute_map = {
            'event_id': 'eventId',
            'categorie_name': 'categorieName',
            'internet_sale_start_date': 'internetSaleStartDate',
            'internet_sale_end_date': 'internetSaleEndDate',
            'sale_start_date': 'saleStartDate',
            'sale_end_date': 'saleEndDate',
            'member_sale_start_date': 'memberSaleStartDate',
            'member_sale_end_date': 'memberSaleEndDate',
            'event_date': 'eventDate',
            'event_time': 'eventTime',
            'stadium_name': 'stadiumName',
            'city': 'city',
            'state': 'state',
            'principal_club': 'principalClub',
            'opponent_club': 'opponentClub',
            'principal_club_image': 'principalClubImage',
            'opponent_club_image': 'opponentClubImage',
            'express_sale': 'expressSale'
        }

        self._event_id = event_id
        self._categorie_name = categorie_name
        self._internet_sale_start_date = internet_sale_start_date
        self._internet_sale_end_date = internet_sale_end_date
        self._sale_start_date = sale_start_date
        self._sale_end_date = sale_end_date
        self._member_sale_start_date = member_sale_start_date
        self._member_sale_end_date = member_sale_end_date
        self._event_date = event_date
        self._event_time = event_time
        self._stadium_name = stadium_name
        self._city = city
        self._state = state
        self._principal_club = principal_club
        self._opponent_club = opponent_club
        self._principal_club_image = principal_club_image
        self._opponent_club_image = opponent_club_image
        self._express_sale = express_sale

    @property
    def event_id(self):
        """
        Gets the event_id of this Events.

        :return: The event_id of this Events.
        :rtype: str
        """
        return self._event_id

    @event_id.setter
    def event_id(self, event_id):
        """
        Sets the event_id of this Events.

        :param event_id: The event_id of this Events.
        :type: str
        """

        self._event_id = event_id

    @property
    def categorie_name(self):
        """
        Gets the categorie_name of this Events.

        :return: The categorie_name of this Events.
        :rtype: str
        """
        return self._categorie_name

    @categorie_name.setter
    def categorie_name(self, categorie_name):
        """
        Sets the categorie_name of this Events.

        :param categorie_name: The categorie_name of this Events.
        :type: str
        """

        self._categorie_name = categorie_name

    @property
    def internet_sale_start_date(self):
        """
        Gets the internet_sale_start_date of this Events.

        :return: The internet_sale_start_date of this Events.
        :rtype: str
        """
        return self._internet_sale_start_date

    @internet_sale_start_date.setter
    def internet_sale_start_date(self, internet_sale_start_date):
        """
        Sets the internet_sale_start_date of this Events.

        :param internet_sale_start_date: The internet_sale_start_date of this Events.
        :type: str
        """

        self._internet_sale_start_date = internet_sale_start_date

    @property
    def internet_sale_end_date(self):
        """
        Gets the internet_sale_end_date of this Events.

        :return: The internet_sale_end_date of this Events.
        :rtype: str
        """
        return self._internet_sale_end_date

    @internet_sale_end_date.setter
    def internet_sale_end_date(self, internet_sale_end_date):
        """
        Sets the internet_sale_end_date of this Events.

        :param internet_sale_end_date: The internet_sale_end_date of this Events.
        :type: str
        """

        self._internet_sale_end_date = internet_sale_end_date

    @property
    def sale_start_date(self):
        """
        Gets the sale_start_date of this Events.

        :return: The sale_start_date of this Events.
        :rtype: str
        """
        return self._sale_start_date

    @sale_start_date.setter
    def sale_start_date(self, sale_start_date):
        """
        Sets the sale_start_date of this Events.

        :param sale_start_date: The sale_start_date of this Events.
        :type: str
        """

        self._sale_start_date = sale_start_date

    @property
    def sale_end_date(self):
        """
        Gets the sale_end_date of this Events.

        :return: The sale_end_date of this Events.
        :rtype: str
        """
        return self._sale_end_date

    @sale_end_date.setter
    def sale_end_date(self, sale_end_date):
        """
        Sets the sale_end_date of this Events.

        :param sale_end_date: The sale_end_date of this Events.
        :type: str
        """

        self._sale_end_date = sale_end_date

    @property
    def member_sale_start_date(self):
        """
        Gets the member_sale_start_date of this Events.

        :return: The member_sale_start_date of this Events.
        :rtype: str
        """
        return self._member_sale_start_date

    @member_sale_start_date.setter
    def member_sale_start_date(self, member_sale_start_date):
        """
        Sets the member_sale_start_date of this Events.

        :param member_sale_start_date: The member_sale_start_date of this Events.
        :type: str
        """

        self._member_sale_start_date = member_sale_start_date

    @property
    def member_sale_end_date(self):
        """
        Gets the member_sale_end_date of this Events.

        :return: The member_sale_end_date of this Events.
        :rtype: str
        """
        return self._member_sale_end_date

    @member_sale_end_date.setter
    def member_sale_end_date(self, member_sale_end_date):
        """
        Sets the member_sale_end_date of this Events.

        :param member_sale_end_date: The member_sale_end_date of this Events.
        :type: str
        """

        self._member_sale_end_date = member_sale_end_date

    @property
    def event_date(self):
        """
        Gets the event_date of this Events.

        :return: The event_date of this Events.
        :rtype: str
        """
        return self._event_date

    @event_date.setter
    def event_date(self, event_date):
        """
        Sets the event_date of this Events.

        :param event_date: The event_date of this Events.
        :type: str
        """

        self._event_date = event_date

    @property
    def event_time(self):
        """
        Gets the event_time of this Events.

        :return: The event_time of this Events.
        :rtype: str
        """
        return self._event_time

    @event_time.setter
    def event_time(self, event_time):
        """
        Sets the event_time of this Events.

        :param event_time: The event_time of this Events.
        :type: str
        """

        self._event_time = event_time

    @property
    def stadium_name(self):
        """
        Gets the stadium_name of this Events.

        :return: The stadium_name of this Events.
        :rtype: str
        """
        return self._stadium_name

    @stadium_name.setter
    def stadium_name(self, stadium_name):
        """
        Sets the stadium_name of this Events.

        :param stadium_name: The stadium_name of this Events.
        :type: str
        """

        self._stadium_name = stadium_name

    @property
    def city(self):
        """
        Gets the city of this Events.

        :return: The city of this Events.
        :rtype: str
        """
        return self._city

    @city.setter
    def city(self, city):
        """
        Sets the city of this Events.

        :param city: The city of this Events.
        :type: str
        """

        self._city = city

    @property
    def state(self):
        """
        Gets the state of this Events.

        :return: The state of this Events.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this Events.

        :param state: The state of this Events.
        :type: str
        """

        self._state = state

    @property
    def principal_club(self):
        """
        Gets the principal_club of this Events.

        :return: The principal_club of this Events.
        :rtype: str
        """
        return self._principal_club

    @principal_club.setter
    def principal_club(self, principal_club):
        """
        Sets the principal_club of this Events.

        :param principal_club: The principal_club of this Events.
        :type: str
        """

        self._principal_club = principal_club

    @property
    def opponent_club(self):
        """
        Gets the opponent_club of this Events.

        :return: The opponent_club of this Events.
        :rtype: str
        """
        return self._opponent_club

    @opponent_club.setter
    def opponent_club(self, opponent_club):
        """
        Sets the opponent_club of this Events.

        :param opponent_club: The opponent_club of this Events.
        :type: str
        """

        self._opponent_club = opponent_club

    @property
    def principal_club_image(self):
        """
        Gets the principal_club_image of this Events.

        :return: The principal_club_image of this Events.
        :rtype: str
        """
        return self._principal_club_image

    @principal_club_image.setter
    def principal_club_image(self, principal_club_image):
        """
        Sets the principal_club_image of this Events.

        :param principal_club_image: The principal_club_image of this Events.
        :type: str
        """

        self._principal_club_image = principal_club_image

    @property
    def opponent_club_image(self):
        """
        Gets the opponent_club_image of this Events.

        :return: The opponent_club_image of this Events.
        :rtype: str
        """
        return self._opponent_club_image

    @opponent_club_image.setter
    def opponent_club_image(self, opponent_club_image):
        """
        Sets the opponent_club_image of this Events.

        :param opponent_club_image: The opponent_club_image of this Events.
        :type: str
        """

        self._opponent_club_image = opponent_club_image

    @property
    def express_sale(self):
        """
        Gets the express_sale of this Events.

        :return: The express_sale of this Events.
        :rtype: str
        """
        return self._express_sale

    @express_sale.setter
    def express_sale(self, express_sale):
        """
        Sets the express_sale of this Events.

        :param express_sale: The express_sale of this Events.
        :type: str
        """

        self._express_sale = express_sale

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, Events):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
