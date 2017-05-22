/**
 * API dos Correios
 * Postal Object tracking API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse400 {
  
  @SerializedName("result")
  private String result = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("details")
  private String details = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400 inlineResponse400 = (InlineResponse400) o;
    return (this.result == null ? inlineResponse400.result == null : this.result.equals(inlineResponse400.result)) &&
        (this.status == null ? inlineResponse400.status == null : this.status.equals(inlineResponse400.status)) &&
        (this.details == null ? inlineResponse400.details == null : this.details.equals(inlineResponse400.details));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.result == null ? 0: this.result.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.details == null ? 0: this.details.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400 {\n");
    
    sb.append("  result: ").append(result).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  details: ").append(details).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
