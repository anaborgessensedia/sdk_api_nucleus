/* 
 * API Agillitas Cartões Pré-pagos
 *
 * API para manipular recursos relacionadas à cartões pré-pagos Agillitas.
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
    /// SetSaldo
    /// </summary>
    [DataContract]
    public partial class SetSaldo :  IEquatable<SetSaldo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SetSaldo" /> class.
        /// </summary>
        /// <param name="Saldo">Saldo.</param>
        public SetSaldo(SetSaldoValor Saldo = default(SetSaldoValor))
        {
            this.Saldo = Saldo;
        }
        
        /// <summary>
        /// Gets or Sets Saldo
        /// </summary>
        [DataMember(Name="saldo", EmitDefaultValue=false)]
        public SetSaldoValor Saldo { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SetSaldo {\n");
            sb.Append("  Saldo: ").Append(Saldo).Append("\n");
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
            return this.Equals(obj as SetSaldo);
        }

        /// <summary>
        /// Returns true if SetSaldo instances are equal
        /// </summary>
        /// <param name="other">Instance of SetSaldo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SetSaldo other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Saldo == other.Saldo ||
                    this.Saldo != null &&
                    this.Saldo.Equals(other.Saldo)
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
                if (this.Saldo != null)
                    hash = hash * 59 + this.Saldo.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
