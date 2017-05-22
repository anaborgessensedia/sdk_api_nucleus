/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse2001Coordinates {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("coordinate")
  private String coordinate = null;
  @SerializedName("shape")
  private String shape = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCoordinate() {
    return coordinate;
  }
  public void setCoordinate(String coordinate) {
    this.coordinate = coordinate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getShape() {
    return shape;
  }
  public void setShape(String shape) {
    this.shape = shape;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Coordinates inlineResponse2001Coordinates = (InlineResponse2001Coordinates) o;
    return (this.id == null ? inlineResponse2001Coordinates.id == null : this.id.equals(inlineResponse2001Coordinates.id)) &&
        (this.coordinate == null ? inlineResponse2001Coordinates.coordinate == null : this.coordinate.equals(inlineResponse2001Coordinates.coordinate)) &&
        (this.shape == null ? inlineResponse2001Coordinates.shape == null : this.shape.equals(inlineResponse2001Coordinates.shape));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.coordinate == null ? 0: this.coordinate.hashCode());
    result = 31 * result + (this.shape == null ? 0: this.shape.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Coordinates {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  coordinate: ").append(coordinate).append("\n");
    sb.append("  shape: ").append(shape).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
