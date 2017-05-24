/*
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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Customer Model
 */
@ApiModel(description = "Customer Model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-22T17:11:14.521Z")
public class ZipcodeRange {
  @SerializedName("county")
  private String county = null;

  @SerializedName("start")
  private String start = null;

  @SerializedName("end")
  private String end = null;

  public ZipcodeRange county(String county) {
    this.county = county;
    return this;
  }

   /**
   * County's name
   * @return county
  **/
  @ApiModelProperty(example = "Campinas", value = "County's name")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public ZipcodeRange start(String start) {
    this.start = start;
    return this;
  }

   /**
   * Zipcode range start
   * @return start
  **/
  @ApiModelProperty(example = "13000001", value = "Zipcode range start")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public ZipcodeRange end(String end) {
    this.end = end;
    return this;
  }

   /**
   * Zipcode range end
   * @return end
  **/
  @ApiModelProperty(example = "13139999", value = "Zipcode range end")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipcodeRange zipcodeRange = (ZipcodeRange) o;
    return Objects.equals(this.county, zipcodeRange.county) &&
        Objects.equals(this.start, zipcodeRange.start) &&
        Objects.equals(this.end, zipcodeRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(county, start, end);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipcodeRange {\n");
    
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
