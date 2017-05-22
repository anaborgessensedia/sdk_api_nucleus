/* 
 * API do Futebolcard
 *
 * Futebolcard manipulation API
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;

namespace IO.Swagger.Model
{
    /// <summary>
    /// EventseventIdsectorssectorIdsubsectorssubsectorIdSeats
    /// </summary>
    [DataContract]
    public partial class EventseventIdsectorssectorIdsubsectorssubsectorIdSeats :  IEquatable<EventseventIdsectorssectorIdsubsectorssubsectorIdSeats>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EventseventIdsectorssectorIdsubsectorssubsectorIdSeats" /> class.
        /// </summary>
        /// <param name="TicketId">TicketId.</param>
        /// <param name="TicketStatus">TicketStatus.</param>
        /// <param name="OwnerId">OwnerId.</param>
        /// <param name="SeatNumber">SeatNumber.</param>
        public EventseventIdsectorssectorIdsubsectorssubsectorIdSeats(string TicketId = default(string), string TicketStatus = default(string), string OwnerId = default(string), string SeatNumber = default(string))
        {
            this.TicketId = TicketId;
            this.TicketStatus = TicketStatus;
            this.OwnerId = OwnerId;
            this.SeatNumber = SeatNumber;
        }
        
        /// <summary>
        /// Gets or Sets TicketId
        /// </summary>
        [DataMember(Name="ticketId", EmitDefaultValue=false)]
        public string TicketId { get; set; }
        /// <summary>
        /// Gets or Sets TicketStatus
        /// </summary>
        [DataMember(Name="ticketStatus", EmitDefaultValue=false)]
        public string TicketStatus { get; set; }
        /// <summary>
        /// Gets or Sets OwnerId
        /// </summary>
        [DataMember(Name="ownerId", EmitDefaultValue=false)]
        public string OwnerId { get; set; }
        /// <summary>
        /// Gets or Sets SeatNumber
        /// </summary>
        [DataMember(Name="seatNumber", EmitDefaultValue=false)]
        public string SeatNumber { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EventseventIdsectorssectorIdsubsectorssubsectorIdSeats {\n");
            sb.Append("  TicketId: ").Append(TicketId).Append("\n");
            sb.Append("  TicketStatus: ").Append(TicketStatus).Append("\n");
            sb.Append("  OwnerId: ").Append(OwnerId).Append("\n");
            sb.Append("  SeatNumber: ").Append(SeatNumber).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as EventseventIdsectorssectorIdsubsectorssubsectorIdSeats);
        }

        /// <summary>
        /// Returns true if EventseventIdsectorssectorIdsubsectorssubsectorIdSeats instances are equal
        /// </summary>
        /// <param name="other">Instance of EventseventIdsectorssectorIdsubsectorssubsectorIdSeats to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EventseventIdsectorssectorIdsubsectorssubsectorIdSeats other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.TicketId == other.TicketId ||
                    this.TicketId != null &&
                    this.TicketId.Equals(other.TicketId)
                ) && 
                (
                    this.TicketStatus == other.TicketStatus ||
                    this.TicketStatus != null &&
                    this.TicketStatus.Equals(other.TicketStatus)
                ) && 
                (
                    this.OwnerId == other.OwnerId ||
                    this.OwnerId != null &&
                    this.OwnerId.Equals(other.OwnerId)
                ) && 
                (
                    this.SeatNumber == other.SeatNumber ||
                    this.SeatNumber != null &&
                    this.SeatNumber.Equals(other.SeatNumber)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.TicketId != null)
                    hash = hash * 59 + this.TicketId.GetHashCode();
                if (this.TicketStatus != null)
                    hash = hash * 59 + this.TicketStatus.GetHashCode();
                if (this.OwnerId != null)
                    hash = hash * 59 + this.OwnerId.GetHashCode();
                if (this.SeatNumber != null)
                    hash = hash * 59 + this.SeatNumber.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
