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

import io.swagger.client.model.ObjectsEventos;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Postal Object model
 **/
@ApiModel(description = "Postal Object model")
public class PostalObjects {
  
  @SerializedName("objectNumber")
  private String objectNumber = null;
  @SerializedName("eventos")
  private List<ObjectsEventos> eventos = null;

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getObjectNumber() {
    return objectNumber;
  }
  public void setObjectNumber(String objectNumber) {
    this.objectNumber = objectNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ObjectsEventos> getEventos() {
    return eventos;
  }
  public void setEventos(List<ObjectsEventos> eventos) {
    this.eventos = eventos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostalObjects postalObjects = (PostalObjects) o;
    return (this.objectNumber == null ? postalObjects.objectNumber == null : this.objectNumber.equals(postalObjects.objectNumber)) &&
        (this.eventos == null ? postalObjects.eventos == null : this.eventos.equals(postalObjects.eventos));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objectNumber == null ? 0: this.objectNumber.hashCode());
    result = 31 * result + (this.eventos == null ? 0: this.eventos.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalObjects {\n");
    
    sb.append("  objectNumber: ").append(objectNumber).append("\n");
    sb.append("  eventos: ").append(eventos).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
