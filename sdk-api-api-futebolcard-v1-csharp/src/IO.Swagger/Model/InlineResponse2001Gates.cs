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
    /// InlineResponse2001Gates
    /// </summary>
    [DataContract]
    public partial class InlineResponse2001Gates :  IEquatable<InlineResponse2001Gates>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2001Gates" /> class.
        /// </summary>
        /// <param name="GateId">GateId.</param>
        /// <param name="GateName">GateName.</param>
        /// <param name="Sectors">Sectors.</param>
        public InlineResponse2001Gates(string GateId = default(string), string GateName = default(string), List<InlineResponse2001Sectors> Sectors = default(List<InlineResponse2001Sectors>))
        {
            this.GateId = GateId;
            this.GateName = GateName;
            this.Sectors = Sectors;
        }
        
        /// <summary>
        /// Gets or Sets GateId
        /// </summary>
        [DataMember(Name="gateId", EmitDefaultValue=false)]
        public string GateId { get; set; }
        /// <summary>
        /// Gets or Sets GateName
        /// </summary>
        [DataMember(Name="gateName", EmitDefaultValue=false)]
        public string GateName { get; set; }
        /// <summary>
        /// Gets or Sets Sectors
        /// </summary>
        [DataMember(Name="sectors", EmitDefaultValue=false)]
        public List<InlineResponse2001Sectors> Sectors { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2001Gates {\n");
            sb.Append("  GateId: ").Append(GateId).Append("\n");
            sb.Append("  GateName: ").Append(GateName).Append("\n");
            sb.Append("  Sectors: ").Append(Sectors).Append("\n");
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
            return this.Equals(obj as InlineResponse2001Gates);
        }

        /// <summary>
        /// Returns true if InlineResponse2001Gates instances are equal
        /// </summary>
        /// <param name="other">Instance of InlineResponse2001Gates to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2001Gates other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.GateId == other.GateId ||
                    this.GateId != null &&
                    this.GateId.Equals(other.GateId)
                ) && 
                (
                    this.GateName == other.GateName ||
                    this.GateName != null &&
                    this.GateName.Equals(other.GateName)
                ) && 
                (
                    this.Sectors == other.Sectors ||
                    this.Sectors != null &&
                    this.Sectors.SequenceEqual(other.Sectors)
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
                if (this.GateId != null)
                    hash = hash * 59 + this.GateId.GetHashCode();
                if (this.GateName != null)
                    hash = hash * 59 + this.GateName.GetHashCode();
                if (this.Sectors != null)
                    hash = hash * 59 + this.Sectors.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
