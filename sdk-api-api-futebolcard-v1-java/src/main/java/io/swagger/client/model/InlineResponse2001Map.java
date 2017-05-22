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
import io.swagger.client.model.InlineResponse2001Coordinates;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2001Map
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-22T17:08:03.639Z")
public class InlineResponse2001Map {
  @SerializedName("url")
  private String url = null;

  @SerializedName("coordinates")
  private List<InlineResponse2001Coordinates> coordinates = new ArrayList<InlineResponse2001Coordinates>();

  public InlineResponse2001Map url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "http://sge-cdn.futebolcard.com/images/mapas/4f3b25e6364ae.png", value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public InlineResponse2001Map coordinates(List<InlineResponse2001Coordinates> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public InlineResponse2001Map addCoordinatesItem(InlineResponse2001Coordinates coordinatesItem) {
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2001Coordinates> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<InlineResponse2001Coordinates> coordinates) {
    this.coordinates = coordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Map inlineResponse2001Map = (InlineResponse2001Map) o;
    return Objects.equals(this.url, inlineResponse2001Map.url) &&
        Objects.equals(this.coordinates, inlineResponse2001Map.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, coordinates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Map {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

