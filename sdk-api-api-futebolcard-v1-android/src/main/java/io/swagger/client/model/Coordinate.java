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
public class Coordinate {
  
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
    Coordinate coordinate = (Coordinate) o;
    return (this.id == null ? coordinate.id == null : this.id.equals(coordinate.id)) &&
        (this.coordinate == null ? coordinate.coordinate == null : this.coordinate.equals(coordinate.coordinate)) &&
        (this.shape == null ? coordinate.shape == null : this.shape.equals(coordinate.shape));
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
    sb.append("class Coordinate {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  coordinate: ").append(coordinate).append("\n");
    sb.append("  shape: ").append(shape).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}