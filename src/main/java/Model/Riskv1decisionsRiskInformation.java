/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.Ptsv2paymentsRiskInformationBuyerHistory;
import Model.Ptsv2paymentsRiskInformationProfile;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1decisionsRiskInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-22T14:46:25.834+05:30")
public class Riskv1decisionsRiskInformation {
  @SerializedName("profile")
  private Ptsv2paymentsRiskInformationProfile profile = null;

  @SerializedName("eventType")
  private String eventType = null;

  @SerializedName("buyerHistory")
  private Ptsv2paymentsRiskInformationBuyerHistory buyerHistory = null;

  public Riskv1decisionsRiskInformation profile(Ptsv2paymentsRiskInformationProfile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsRiskInformationProfile getProfile() {
    return profile;
  }

  public void setProfile(Ptsv2paymentsRiskInformationProfile profile) {
    this.profile = profile;
  }

  public Riskv1decisionsRiskInformation eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Specifies one of the following types of events: - login - account_creation - account_update For regular payment transactions, do not send this field. 
   * @return eventType
  **/
  @ApiModelProperty(value = "Specifies one of the following types of events: - login - account_creation - account_update For regular payment transactions, do not send this field. ")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Riskv1decisionsRiskInformation buyerHistory(Ptsv2paymentsRiskInformationBuyerHistory buyerHistory) {
    this.buyerHistory = buyerHistory;
    return this;
  }

   /**
   * Get buyerHistory
   * @return buyerHistory
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsRiskInformationBuyerHistory getBuyerHistory() {
    return buyerHistory;
  }

  public void setBuyerHistory(Ptsv2paymentsRiskInformationBuyerHistory buyerHistory) {
    this.buyerHistory = buyerHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsRiskInformation riskv1decisionsRiskInformation = (Riskv1decisionsRiskInformation) o;
    return Objects.equals(this.profile, riskv1decisionsRiskInformation.profile) &&
        Objects.equals(this.eventType, riskv1decisionsRiskInformation.eventType) &&
        Objects.equals(this.buyerHistory, riskv1decisionsRiskInformation.buyerHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, eventType, buyerHistory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsRiskInformation {\n");
    
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    buyerHistory: ").append(toIndentedString(buyerHistory)).append("\n");
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

