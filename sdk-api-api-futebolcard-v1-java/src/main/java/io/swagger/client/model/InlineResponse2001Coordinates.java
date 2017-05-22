/*
 * API do Futebolcard
 * Futebolcard manipulation API
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
 * InlineResponse2001Coordinates
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-22T17:08:03.639Z")
public class InlineResponse2001Coordinates {
  @SerializedName("id")
  private String id = null;

  @SerializedName("coordinate")
  private String coordinate = null;

  @SerializedName("shape")
  private String shape = null;

  public InlineResponse2001Coordinates id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "831313", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2001Coordinates coordinate(String coordinate) {
    this.coordinate = coordinate;
    return this;
  }

   /**
   * Get coordinate
   * @return coordinate
  **/
  @ApiModelProperty(example = "495,439,213,433,204,452,189,444,175,478,230,491,224,515,271,515,268,537,459,535,452,517,500,515,496,492,521,489,518,458,498,455", value = "")
  public String getCoordinate() {
    return coordinate;
  }

  public void setCoordinate(String coordinate) {
    this.coordinate = coordinate;
  }

  public InlineResponse2001Coordinates shape(String shape) {
    this.shape = shape;
    return this;
  }

   /**
   * Get shape
   * @return shape
  **/
  @ApiModelProperty(example = "poly", value = "")
  public String getShape() {
    return shape;
  }

  public void setShape(String shape) {
    this.shape = shape;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Coordinates inlineResponse2001Coordinates = (InlineResponse2001Coordinates) o;
    return Objects.equals(this.id, inlineResponse2001Coordinates.id) &&
        Objects.equals(this.coordinate, inlineResponse2001Coordinates.coordinate) &&
        Objects.equals(this.shape, inlineResponse2001Coordinates.shape);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, coordinate, shape);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Coordinates {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    coordinate: ").append(toIndentedString(coordinate)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
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

