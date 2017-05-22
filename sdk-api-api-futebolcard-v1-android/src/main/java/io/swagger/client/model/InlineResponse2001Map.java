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

import io.swagger.client.model.InlineResponse2001Coordinates;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse2001Map {
  
  @SerializedName("url")
  private String url = null;
  @SerializedName("coordinates")
  private List<InlineResponse2001Coordinates> coordinates = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001Coordinates> getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(List<InlineResponse2001Coordinates> coordinates) {
    this.coordinates = coordinates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Map inlineResponse2001Map = (InlineResponse2001Map) o;
    return (this.url == null ? inlineResponse2001Map.url == null : this.url.equals(inlineResponse2001Map.url)) &&
        (this.coordinates == null ? inlineResponse2001Map.coordinates == null : this.coordinates.equals(inlineResponse2001Map.coordinates));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.coordinates == null ? 0: this.coordinates.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Map {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  coordinates: ").append(coordinates).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
