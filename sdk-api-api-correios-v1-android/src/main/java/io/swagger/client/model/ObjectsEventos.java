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

/**
 * Customer Model
 **/
@ApiModel(description = "Customer Model")
public class ObjectsEventos {
  
  @SerializedName("objectCode")
  private String objectCode = null;
  @SerializedName("eventType")
  private String eventType = null;
  @SerializedName("eventStatus")
  private Integer eventStatus = null;
  @SerializedName("eventDescription")
  private String eventDescription = null;
  @SerializedName("unitName")
  private String unitName = null;
  @SerializedName("SROCode")
  private String sROCode = null;
  @SerializedName("county")
  private String county = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("MCUCode")
  private String mCUCode = null;
  @SerializedName("DRCode")
  private String dRCode = null;
  @SerializedName("DRAbbreviation")
  private String dRAbbreviation = null;
  @SerializedName("listNumber")
  private String listNumber = null;
  @SerializedName("station")
  private Integer station = null;
  @SerializedName("user")
  private String user = null;
  @SerializedName("recordingDate")
  private String recordingDate = null;
  @SerializedName("deliveryman")
  private String deliveryman = null;
  @SerializedName("creationDate")
  private String creationDate = null;
  @SerializedName("blockAction")
  private Integer blockAction = null;

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getObjectCode() {
    return objectCode;
  }
  public void setObjectCode(String objectCode) {
    this.objectCode = objectCode;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getEventType() {
    return eventType;
  }
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getEventStatus() {
    return eventStatus;
  }
  public void setEventStatus(Integer eventStatus) {
    this.eventStatus = eventStatus;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getEventDescription() {
    return eventDescription;
  }
  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getUnitName() {
    return unitName;
  }
  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getSROCode() {
    return sROCode;
  }
  public void setSROCode(String sROCode) {
    this.sROCode = sROCode;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCounty() {
    return county;
  }
  public void setCounty(String county) {
    this.county = county;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getMCUCode() {
    return mCUCode;
  }
  public void setMCUCode(String mCUCode) {
    this.mCUCode = mCUCode;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getDRCode() {
    return dRCode;
  }
  public void setDRCode(String dRCode) {
    this.dRCode = dRCode;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getDRAbbreviation() {
    return dRAbbreviation;
  }
  public void setDRAbbreviation(String dRAbbreviation) {
    this.dRAbbreviation = dRAbbreviation;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getListNumber() {
    return listNumber;
  }
  public void setListNumber(String listNumber) {
    this.listNumber = listNumber;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getStation() {
    return station;
  }
  public void setStation(Integer station) {
    this.station = station;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getRecordingDate() {
    return recordingDate;
  }
  public void setRecordingDate(String recordingDate) {
    this.recordingDate = recordingDate;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getDeliveryman() {
    return deliveryman;
  }
  public void setDeliveryman(String deliveryman) {
    this.deliveryman = deliveryman;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getBlockAction() {
    return blockAction;
  }
  public void setBlockAction(Integer blockAction) {
    this.blockAction = blockAction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectsEventos objectsEventos = (ObjectsEventos) o;
    return (this.objectCode == null ? objectsEventos.objectCode == null : this.objectCode.equals(objectsEventos.objectCode)) &&
        (this.eventType == null ? objectsEventos.eventType == null : this.eventType.equals(objectsEventos.eventType)) &&
        (this.eventStatus == null ? objectsEventos.eventStatus == null : this.eventStatus.equals(objectsEventos.eventStatus)) &&
        (this.eventDescription == null ? objectsEventos.eventDescription == null : this.eventDescription.equals(objectsEventos.eventDescription)) &&
        (this.unitName == null ? objectsEventos.unitName == null : this.unitName.equals(objectsEventos.unitName)) &&
        (this.sROCode == null ? objectsEventos.sROCode == null : this.sROCode.equals(objectsEventos.sROCode)) &&
        (this.county == null ? objectsEventos.county == null : this.county.equals(objectsEventos.county)) &&
        (this.state == null ? objectsEventos.state == null : this.state.equals(objectsEventos.state)) &&
        (this.mCUCode == null ? objectsEventos.mCUCode == null : this.mCUCode.equals(objectsEventos.mCUCode)) &&
        (this.dRCode == null ? objectsEventos.dRCode == null : this.dRCode.equals(objectsEventos.dRCode)) &&
        (this.dRAbbreviation == null ? objectsEventos.dRAbbreviation == null : this.dRAbbreviation.equals(objectsEventos.dRAbbreviation)) &&
        (this.listNumber == null ? objectsEventos.listNumber == null : this.listNumber.equals(objectsEventos.listNumber)) &&
        (this.station == null ? objectsEventos.station == null : this.station.equals(objectsEventos.station)) &&
        (this.user == null ? objectsEventos.user == null : this.user.equals(objectsEventos.user)) &&
        (this.recordingDate == null ? objectsEventos.recordingDate == null : this.recordingDate.equals(objectsEventos.recordingDate)) &&
        (this.deliveryman == null ? objectsEventos.deliveryman == null : this.deliveryman.equals(objectsEventos.deliveryman)) &&
        (this.creationDate == null ? objectsEventos.creationDate == null : this.creationDate.equals(objectsEventos.creationDate)) &&
        (this.blockAction == null ? objectsEventos.blockAction == null : this.blockAction.equals(objectsEventos.blockAction));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objectCode == null ? 0: this.objectCode.hashCode());
    result = 31 * result + (this.eventType == null ? 0: this.eventType.hashCode());
    result = 31 * result + (this.eventStatus == null ? 0: this.eventStatus.hashCode());
    result = 31 * result + (this.eventDescription == null ? 0: this.eventDescription.hashCode());
    result = 31 * result + (this.unitName == null ? 0: this.unitName.hashCode());
    result = 31 * result + (this.sROCode == null ? 0: this.sROCode.hashCode());
    result = 31 * result + (this.county == null ? 0: this.county.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.mCUCode == null ? 0: this.mCUCode.hashCode());
    result = 31 * result + (this.dRCode == null ? 0: this.dRCode.hashCode());
    result = 31 * result + (this.dRAbbreviation == null ? 0: this.dRAbbreviation.hashCode());
    result = 31 * result + (this.listNumber == null ? 0: this.listNumber.hashCode());
    result = 31 * result + (this.station == null ? 0: this.station.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    result = 31 * result + (this.recordingDate == null ? 0: this.recordingDate.hashCode());
    result = 31 * result + (this.deliveryman == null ? 0: this.deliveryman.hashCode());
    result = 31 * result + (this.creationDate == null ? 0: this.creationDate.hashCode());
    result = 31 * result + (this.blockAction == null ? 0: this.blockAction.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectsEventos {\n");
    
    sb.append("  objectCode: ").append(objectCode).append("\n");
    sb.append("  eventType: ").append(eventType).append("\n");
    sb.append("  eventStatus: ").append(eventStatus).append("\n");
    sb.append("  eventDescription: ").append(eventDescription).append("\n");
    sb.append("  unitName: ").append(unitName).append("\n");
    sb.append("  sROCode: ").append(sROCode).append("\n");
    sb.append("  county: ").append(county).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  mCUCode: ").append(mCUCode).append("\n");
    sb.append("  dRCode: ").append(dRCode).append("\n");
    sb.append("  dRAbbreviation: ").append(dRAbbreviation).append("\n");
    sb.append("  listNumber: ").append(listNumber).append("\n");
    sb.append("  station: ").append(station).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  recordingDate: ").append(recordingDate).append("\n");
    sb.append("  deliveryman: ").append(deliveryman).append("\n");
    sb.append("  creationDate: ").append(creationDate).append("\n");
    sb.append("  blockAction: ").append(blockAction).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
