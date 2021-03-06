# coding: utf-8

"""
    API Agillitas Cartões Pré-pagos

    API para manipular recursos relacionadas à cartões pré-pagos Agillitas.

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class TransferenciaCadastroBenificiario(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, beneficiario=None):
        """
        TransferenciaCadastroBenificiario - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'beneficiario': 'CadastroBenificiario'
        }

        self.attribute_map = {
            'beneficiario': 'beneficiario'
        }

        self._beneficiario = beneficiario

    @property
    def beneficiario(self):
        """
        Gets the beneficiario of this TransferenciaCadastroBenificiario.

        :return: The beneficiario of this TransferenciaCadastroBenificiario.
        :rtype: CadastroBenificiario
        """
        return self._beneficiario

    @beneficiario.setter
    def beneficiario(self, beneficiario):
        """
        Sets the beneficiario of this TransferenciaCadastroBenificiario.

        :param beneficiario: The beneficiario of this TransferenciaCadastroBenificiario.
        :type: CadastroBenificiario
        """

        self._beneficiario = beneficiario

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
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
