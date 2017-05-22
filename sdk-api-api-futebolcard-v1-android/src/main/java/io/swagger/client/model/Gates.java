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

import io.swagger.client.model.InlineResponse2001Sectors;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Gates {
  
  @SerializedName("gateId")
  private String gateId = null;
  @SerializedName("gateName")
  private String gateName = null;
  @SerializedName("sectors")
  private List<InlineResponse2001Sectors> sectors = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGateId() {
    return gateId;
  }
  public void setGateId(String gateId) {
    this.gateId = gateId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGateName() {
    return gateName;
  }
  public void setGateName(String gateName) {
    this.gateName = gateName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2001Sectors> getSectors() {
    return sectors;
  }
  public void setSectors(List<InlineResponse2001Sectors> sectors) {
    this.sectors = sectors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gates gates = (Gates) o;
    return (this.gateId == null ? gates.gateId == null : this.gateId.equals(gates.gateId)) &&
        (this.gateName == null ? gates.gateName == null : this.gateName.equals(gates.gateName)) &&
        (this.sectors == null ? gates.sectors == null : this.sectors.equals(gates.sectors));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.gateId == null ? 0: this.gateId.hashCode());
    result = 31 * result + (this.gateName == null ? 0: this.gateName.hashCode());
    result = 31 * result + (this.sectors == null ? 0: this.sectors.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gates {\n");
    
    sb.append("  gateId: ").append(gateId).append("\n");
    sb.append("  gateName: ").append(gateName).append("\n");
    sb.append("  sectors: ").append(sectors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
