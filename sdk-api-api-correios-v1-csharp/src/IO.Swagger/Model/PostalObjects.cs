/* 
 * API dos Correios
 *
 * Postal Object tracking API
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
    /// Postal Object model
    /// </summary>
    [DataContract]
    public partial class PostalObjects :  IEquatable<PostalObjects>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostalObjects" /> class.
        /// </summary>
        /// <param name="ObjectNumber">.</param>
        /// <param name="Eventos">Eventos.</param>
        public PostalObjects(string ObjectNumber = default(string), List<ObjectsEventos> Eventos = default(List<ObjectsEventos>))
        {
            this.ObjectNumber = ObjectNumber;
            this.Eventos = Eventos;
        }
        
        /// <summary>
        /// 
        /// </summary>
        /// <value></value>
        [DataMember(Name="objectNumber", EmitDefaultValue=false)]
        public string ObjectNumber { get; set; }
        /// <summary>
        /// Gets or Sets Eventos
        /// </summary>
        [DataMember(Name="eventos", EmitDefaultValue=false)]
        public List<ObjectsEventos> Eventos { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PostalObjects {\n");
            sb.Append("  ObjectNumber: ").Append(ObjectNumber).Append("\n");
            sb.Append("  Eventos: ").Append(Eventos).Append("\n");
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
            return this.Equals(obj as PostalObjects);
        }

        /// <summary>
        /// Returns true if PostalObjects instances are equal
        /// </summary>
        /// <param name="other">Instance of PostalObjects to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostalObjects other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.ObjectNumber == other.ObjectNumber ||
                    this.ObjectNumber != null &&
                    this.ObjectNumber.Equals(other.ObjectNumber)
                ) && 
                (
                    this.Eventos == other.Eventos ||
                    this.Eventos != null &&
                    this.Eventos.SequenceEqual(other.Eventos)
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
                if (this.ObjectNumber != null)
                    hash = hash * 59 + this.ObjectNumber.GetHashCode();
                if (this.Eventos != null)
                    hash = hash * 59 + this.Eventos.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
