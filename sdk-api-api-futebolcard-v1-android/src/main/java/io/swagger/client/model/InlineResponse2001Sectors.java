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
public class InlineResponse2001Sectors {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("selectSeats")
  private String selectSeats = null;
  @SerializedName("available")
  private Integer available = null;
  @SerializedName("hasTickets")
  private Integer hasTickets = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSelectSeats() {
    return selectSeats;
  }
  public void setSelectSeats(String selectSeats) {
    this.selectSeats = selectSeats;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAvailable() {
    return available;
  }
  public void setAvailable(Integer available) {
    this.available = available;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getHasTickets() {
    return hasTickets;
  }
  public void setHasTickets(Integer hasTickets) {
    this.hasTickets = hasTickets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Sectors inlineResponse2001Sectors = (InlineResponse2001Sectors) o;
    return (this.id == null ? inlineResponse2001Sectors.id == null : this.id.equals(inlineResponse2001Sectors.id)) &&
        (this.name == null ? inlineResponse2001Sectors.name == null : this.name.equals(inlineResponse2001Sectors.name)) &&
        (this.selectSeats == null ? inlineResponse2001Sectors.selectSeats == null : this.selectSeats.equals(inlineResponse2001Sectors.selectSeats)) &&
        (this.available == null ? inlineResponse2001Sectors.available == null : this.available.equals(inlineResponse2001Sectors.available)) &&
        (this.hasTickets == null ? inlineResponse2001Sectors.hasTickets == null : this.hasTickets.equals(inlineResponse2001Sectors.hasTickets));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.selectSeats == null ? 0: this.selectSeats.hashCode());
    result = 31 * result + (this.available == null ? 0: this.available.hashCode());
    result = 31 * result + (this.hasTickets == null ? 0: this.hasTickets.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Sectors {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  selectSeats: ").append(selectSeats).append("\n");
    sb.append("  available: ").append(available).append("\n");
    sb.append("  hasTickets: ").append(hasTickets).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
