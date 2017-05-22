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
 * Events
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-22T17:08:03.639Z")
public class Events {
  @SerializedName("eventId")
  private String eventId = null;

  @SerializedName("categorieName")
  private String categorieName = null;

  @SerializedName("internetSaleStartDate")
  private String internetSaleStartDate = null;

  @SerializedName("internetSaleEndDate")
  private String internetSaleEndDate = null;

  @SerializedName("saleStartDate")
  private String saleStartDate = null;

  @SerializedName("saleEndDate")
  private String saleEndDate = null;

  @SerializedName("memberSaleStartDate")
  private String memberSaleStartDate = null;

  @SerializedName("memberSaleEndDate")
  private String memberSaleEndDate = null;

  @SerializedName("eventDate")
  private String eventDate = null;

  @SerializedName("eventTime")
  private String eventTime = null;

  @SerializedName("stadiumName")
  private String stadiumName = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("principalClub")
  private String principalClub = null;

  @SerializedName("opponentClub")
  private String opponentClub = null;

  @SerializedName("principalClubImage")
  private String principalClubImage = null;

  @SerializedName("opponentClubImage")
  private String opponentClubImage = null;

  @SerializedName("expressSale")
  private String expressSale = null;

  public Events eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(example = "3127", value = "")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public Events categorieName(String categorieName) {
    this.categorieName = categorieName;
    return this;
  }

   /**
   * Get categorieName
   * @return categorieName
  **/
  @ApiModelProperty(example = "Campeonato Brasileiro", value = "")
  public String getCategorieName() {
    return categorieName;
  }

  public void setCategorieName(String categorieName) {
    this.categorieName = categorieName;
  }

  public Events internetSaleStartDate(String internetSaleStartDate) {
    this.internetSaleStartDate = internetSaleStartDate;
    return this;
  }

   /**
   * Get internetSaleStartDate
   * @return internetSaleStartDate
  **/
  @ApiModelProperty(example = "2017-04-18 00:00:00.000", value = "")
  public String getInternetSaleStartDate() {
    return internetSaleStartDate;
  }

  public void setInternetSaleStartDate(String internetSaleStartDate) {
    this.internetSaleStartDate = internetSaleStartDate;
  }

  public Events internetSaleEndDate(String internetSaleEndDate) {
    this.internetSaleEndDate = internetSaleEndDate;
    return this;
  }

   /**
   * Get internetSaleEndDate
   * @return internetSaleEndDate
  **/
  @ApiModelProperty(example = "2017-12-31 00:00:00.000", value = "")
  public String getInternetSaleEndDate() {
    return internetSaleEndDate;
  }

  public void setInternetSaleEndDate(String internetSaleEndDate) {
    this.internetSaleEndDate = internetSaleEndDate;
  }

  public Events saleStartDate(String saleStartDate) {
    this.saleStartDate = saleStartDate;
    return this;
  }

   /**
   * Get saleStartDate
   * @return saleStartDate
  **/
  @ApiModelProperty(example = "2017-04-18 00:00:00.000", value = "")
  public String getSaleStartDate() {
    return saleStartDate;
  }

  public void setSaleStartDate(String saleStartDate) {
    this.saleStartDate = saleStartDate;
  }

  public Events saleEndDate(String saleEndDate) {
    this.saleEndDate = saleEndDate;
    return this;
  }

   /**
   * Get saleEndDate
   * @return saleEndDate
  **/
  @ApiModelProperty(example = "2017-12-31 00:00:00.000", value = "")
  public String getSaleEndDate() {
    return saleEndDate;
  }

  public void setSaleEndDate(String saleEndDate) {
    this.saleEndDate = saleEndDate;
  }

  public Events memberSaleStartDate(String memberSaleStartDate) {
    this.memberSaleStartDate = memberSaleStartDate;
    return this;
  }

   /**
   * Get memberSaleStartDate
   * @return memberSaleStartDate
  **/
  @ApiModelProperty(example = "2017-04-18 00:00:00.000", value = "")
  public String getMemberSaleStartDate() {
    return memberSaleStartDate;
  }

  public void setMemberSaleStartDate(String memberSaleStartDate) {
    this.memberSaleStartDate = memberSaleStartDate;
  }

  public Events memberSaleEndDate(String memberSaleEndDate) {
    this.memberSaleEndDate = memberSaleEndDate;
    return this;
  }

   /**
   * Get memberSaleEndDate
   * @return memberSaleEndDate
  **/
  @ApiModelProperty(example = "2017-12-31 00:00:00.000", value = "")
  public String getMemberSaleEndDate() {
    return memberSaleEndDate;
  }

  public void setMemberSaleEndDate(String memberSaleEndDate) {
    this.memberSaleEndDate = memberSaleEndDate;
  }

  public Events eventDate(String eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Get eventDate
   * @return eventDate
  **/
  @ApiModelProperty(example = "2017-12-31 00:00:00.000", value = "")
  public String getEventDate() {
    return eventDate;
  }

  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }

  public Events eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Get eventTime
   * @return eventTime
  **/
  @ApiModelProperty(example = "00:00:00.0000000", value = "")
  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public Events stadiumName(String stadiumName) {
    this.stadiumName = stadiumName;
    return this;
  }

   /**
   * Get stadiumName
   * @return stadiumName
  **/
  @ApiModelProperty(example = "Orlando Scarpelli", value = "")
  public String getStadiumName() {
    return stadiumName;
  }

  public void setStadiumName(String stadiumName) {
    this.stadiumName = stadiumName;
  }

  public Events city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "Florianopolis", value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Events state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "SC", value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Events principalClub(String principalClub) {
    this.principalClub = principalClub;
    return this;
  }

   /**
   * Get principalClub
   * @return principalClub
  **/
  @ApiModelProperty(example = "Vasco", value = "")
  public String getPrincipalClub() {
    return principalClub;
  }

  public void setPrincipalClub(String principalClub) {
    this.principalClub = principalClub;
  }

  public Events opponentClub(String opponentClub) {
    this.opponentClub = opponentClub;
    return this;
  }

   /**
   * Get opponentClub
   * @return opponentClub
  **/
  @ApiModelProperty(example = "São Paulo", value = "")
  public String getOpponentClub() {
    return opponentClub;
  }

  public void setOpponentClub(String opponentClub) {
    this.opponentClub = opponentClub;
  }

  public Events principalClubImage(String principalClubImage) {
    this.principalClubImage = principalClubImage;
    return this;
  }

   /**
   * Get principalClubImage
   * @return principalClubImage
  **/
  @ApiModelProperty(example = "http://sge-cdn.futebolcard.com/images/clubes/img_13.png", value = "")
  public String getPrincipalClubImage() {
    return principalClubImage;
  }

  public void setPrincipalClubImage(String principalClubImage) {
    this.principalClubImage = principalClubImage;
  }

  public Events opponentClubImage(String opponentClubImage) {
    this.opponentClubImage = opponentClubImage;
    return this;
  }

   /**
   * Get opponentClubImage
   * @return opponentClubImage
  **/
  @ApiModelProperty(example = "http://sge-cdn.futebolcard.com/images/clubes/img_5.png", value = "")
  public String getOpponentClubImage() {
    return opponentClubImage;
  }

  public void setOpponentClubImage(String opponentClubImage) {
    this.opponentClubImage = opponentClubImage;
  }

  public Events expressSale(String expressSale) {
    this.expressSale = expressSale;
    return this;
  }

   /**
   * Get expressSale
   * @return expressSale
  **/
  @ApiModelProperty(example = "1", value = "")
  public String getExpressSale() {
    return expressSale;
  }

  public void setExpressSale(String expressSale) {
    this.expressSale = expressSale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Events events = (Events) o;
    return Objects.equals(this.eventId, events.eventId) &&
        Objects.equals(this.categorieName, events.categorieName) &&
        Objects.equals(this.internetSaleStartDate, events.internetSaleStartDate) &&
        Objects.equals(this.internetSaleEndDate, events.internetSaleEndDate) &&
        Objects.equals(this.saleStartDate, events.saleStartDate) &&
        Objects.equals(this.saleEndDate, events.saleEndDate) &&
        Objects.equals(this.memberSaleStartDate, events.memberSaleStartDate) &&
        Objects.equals(this.memberSaleEndDate, events.memberSaleEndDate) &&
        Objects.equals(this.eventDate, events.eventDate) &&
        Objects.equals(this.eventTime, events.eventTime) &&
        Objects.equals(this.stadiumName, events.stadiumName) &&
        Objects.equals(this.city, events.city) &&
        Objects.equals(this.state, events.state) &&
        Objects.equals(this.principalClub, events.principalClub) &&
        Objects.equals(this.opponentClub, events.opponentClub) &&
        Objects.equals(this.principalClubImage, events.principalClubImage) &&
        Objects.equals(this.opponentClubImage, events.opponentClubImage) &&
        Objects.equals(this.expressSale, events.expressSale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, categorieName, internetSaleStartDate, internetSaleEndDate, saleStartDate, saleEndDate, memberSaleStartDate, memberSaleEndDate, eventDate, eventTime, stadiumName, city, state, principalClub, opponentClub, principalClubImage, opponentClubImage, expressSale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Events {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    categorieName: ").append(toIndentedString(categorieName)).append("\n");
    sb.append("    internetSaleStartDate: ").append(toIndentedString(internetSaleStartDate)).append("\n");
    sb.append("    internetSaleEndDate: ").append(toIndentedString(internetSaleEndDate)).append("\n");
    sb.append("    saleStartDate: ").append(toIndentedString(saleStartDate)).append("\n");
    sb.append("    saleEndDate: ").append(toIndentedString(saleEndDate)).append("\n");
    sb.append("    memberSaleStartDate: ").append(toIndentedString(memberSaleStartDate)).append("\n");
    sb.append("    memberSaleEndDate: ").append(toIndentedString(memberSaleEndDate)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    stadiumName: ").append(toIndentedString(stadiumName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    principalClub: ").append(toIndentedString(principalClub)).append("\n");
    sb.append("    opponentClub: ").append(toIndentedString(opponentClub)).append("\n");
    sb.append("    principalClubImage: ").append(toIndentedString(principalClubImage)).append("\n");
    sb.append("    opponentClubImage: ").append(toIndentedString(opponentClubImage)).append("\n");
    sb.append("    expressSale: ").append(toIndentedString(expressSale)).append("\n");
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

