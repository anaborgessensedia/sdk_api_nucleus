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


class InlineResponse2003(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, row_id=None, row_alias=None, row_name=None, seats=None):
        """
        InlineResponse2003 - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'row_id': 'str',
            'row_alias': 'str',
            'row_name': 'str',
            'seats': 'list[EventseventIdsectorssectorIdsubsectorssubsectorIdSeats]'
        }

        self.attribute_map = {
            'row_id': 'rowId',
            'row_alias': 'rowAlias',
            'row_name': 'rowName',
            'seats': 'seats'
        }

        self._row_id = row_id
        self._row_alias = row_alias
        self._row_name = row_name
        self._seats = seats

    @property
    def row_id(self):
        """
        Gets the row_id of this InlineResponse2003.

        :return: The row_id of this InlineResponse2003.
        :rtype: str
        """
        return self._row_id

    @row_id.setter
    def row_id(self, row_id):
        """
        Sets the row_id of this InlineResponse2003.

        :param row_id: The row_id of this InlineResponse2003.
        :type: str
        """

        self._row_id = row_id

    @property
    def row_alias(self):
        """
        Gets the row_alias of this InlineResponse2003.

        :return: The row_alias of this InlineResponse2003.
        :rtype: str
        """
        return self._row_alias

    @row_alias.setter
    def row_alias(self, row_alias):
        """
        Sets the row_alias of this InlineResponse2003.

        :param row_alias: The row_alias of this InlineResponse2003.
        :type: str
        """

        self._row_alias = row_alias

    @property
    def row_name(self):
        """
        Gets the row_name of this InlineResponse2003.

        :return: The row_name of this InlineResponse2003.
        :rtype: str
        """
        return self._row_name

    @row_name.setter
    def row_name(self, row_name):
        """
        Sets the row_name of this InlineResponse2003.

        :param row_name: The row_name of this InlineResponse2003.
        :type: str
        """

        self._row_name = row_name

    @property
    def seats(self):
        """
        Gets the seats of this InlineResponse2003.

        :return: The seats of this InlineResponse2003.
        :rtype: list[EventseventIdsectorssectorIdsubsectorssubsectorIdSeats]
        """
        return self._seats

    @seats.setter
    def seats(self, seats):
        """
        Sets the seats of this InlineResponse2003.

        :param seats: The seats of this InlineResponse2003.
        :type: list[EventseventIdsectorssectorIdsubsectorssubsectorIdSeats]
        """

        self._seats = seats

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
        if not isinstance(other, InlineResponse2003):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
