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
    /// InlineResponse2001Sectors
    /// </summary>
    [DataContract]
    public partial class InlineResponse2001Sectors :  IEquatable<InlineResponse2001Sectors>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2001Sectors" /> class.
        /// </summary>
        /// <param name="Id">Id.</param>
        /// <param name="Name">Name.</param>
        /// <param name="SelectSeats">SelectSeats.</param>
        /// <param name="Available">Available.</param>
        /// <param name="HasTickets">HasTickets.</param>
        public InlineResponse2001Sectors(string Id = default(string), string Name = default(string), string SelectSeats = default(string), int? Available = default(int?), int? HasTickets = default(int?))
        {
            this.Id = Id;
            this.Name = Name;
            this.SelectSeats = SelectSeats;
            this.Available = Available;
            this.HasTickets = HasTickets;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }
        /// <summary>
        /// Gets or Sets SelectSeats
        /// </summary>
        [DataMember(Name="selectSeats", EmitDefaultValue=false)]
        public string SelectSeats { get; set; }
        /// <summary>
        /// Gets or Sets Available
        /// </summary>
        [DataMember(Name="available", EmitDefaultValue=false)]
        public int? Available { get; set; }
        /// <summary>
        /// Gets or Sets HasTickets
        /// </summary>
        [DataMember(Name="hasTickets", EmitDefaultValue=false)]
        public int? HasTickets { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2001Sectors {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  SelectSeats: ").Append(SelectSeats).Append("\n");
            sb.Append("  Available: ").Append(Available).Append("\n");
            sb.Append("  HasTickets: ").Append(HasTickets).Append("\n");
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
            return this.Equals(obj as InlineResponse2001Sectors);
        }

        /// <summary>
        /// Returns true if InlineResponse2001Sectors instances are equal
        /// </summary>
        /// <param name="other">Instance of InlineResponse2001Sectors to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2001Sectors other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this.Name == other.Name ||
                    this.Name != null &&
                    this.Name.Equals(other.Name)
                ) && 
                (
                    this.SelectSeats == other.SelectSeats ||
                    this.SelectSeats != null &&
                    this.SelectSeats.Equals(other.SelectSeats)
                ) && 
                (
                    this.Available == other.Available ||
                    this.Available != null &&
                    this.Available.Equals(other.Available)
                ) && 
                (
                    this.HasTickets == other.HasTickets ||
                    this.HasTickets != null &&
                    this.HasTickets.Equals(other.HasTickets)
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
                if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                if (this.Name != null)
                    hash = hash * 59 + this.Name.GetHashCode();
                if (this.SelectSeats != null)
                    hash = hash * 59 + this.SelectSeats.GetHashCode();
                if (this.Available != null)
                    hash = hash * 59 + this.Available.GetHashCode();
                if (this.HasTickets != null)
                    hash = hash * 59 + this.HasTickets.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
