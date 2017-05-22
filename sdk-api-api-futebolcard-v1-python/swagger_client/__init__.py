# coding: utf-8

"""
    API do Futebolcard

    Futebolcard manipulation API

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

# import models into sdk package
from .models.coordinate import Coordinate
from .models.error import Error
from .models.events import Events
from .models.eventsevent_idsectorssector_idsubsectorssubsector_id_seats import EventseventIdsectorssectorIdsubsectorssubsectorIdSeats
from .models.gates import Gates
from .models.inline_response_200 import InlineResponse200
from .models.inline_response_200_1 import InlineResponse2001
from .models.inline_response_200_1_coordinates import InlineResponse2001Coordinates
from .models.inline_response_200_1_gates import InlineResponse2001Gates
from .models.inline_response_200_1_map import InlineResponse2001Map
from .models.inline_response_200_1_sectors import InlineResponse2001Sectors
from .models.inline_response_200_2 import InlineResponse2002
from .models.inline_response_200_2_subsectors import InlineResponse2002Subsectors
from .models.inline_response_200_3 import InlineResponse2003
from .models.inline_response_400 import InlineResponse400
from .models.map import Map
from .models.row import Row
from .models.seat import Seat
from .models.sector_detail import SectorDetail
from .models.sectors import Sectors
from .models.sub_sector_details import SubSectorDetails
from .models.sub_sectors import SubSectors

# import apis into sdk package
from .apis.events_api import EventsApi

# import ApiClient
from .api_client import ApiClient

from .configuration import Configuration

configuration = Configuration()
