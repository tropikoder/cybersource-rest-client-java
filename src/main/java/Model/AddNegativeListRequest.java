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
import Model.Riskv1liststypeentriesBuyerInformation;
import Model.Riskv1liststypeentriesClientReferenceInformation;
import Model.Riskv1liststypeentriesDeviceInformation;
import Model.Riskv1liststypeentriesOrderInformation;
import Model.Riskv1liststypeentriesPaymentInformation;
import Model.Riskv1liststypeentriesRiskInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddNegativeListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class AddNegativeListRequest {
  @SerializedName("orderInformation")
  private Riskv1liststypeentriesOrderInformation orderInformation = null;

  @SerializedName("paymentInformation")
  private Riskv1liststypeentriesPaymentInformation paymentInformation = null;

  @SerializedName("clientReferenceInformation")
  private Riskv1liststypeentriesClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("deviceInformation")
  private Riskv1liststypeentriesDeviceInformation deviceInformation = null;

  @SerializedName("riskInformation")
  private Riskv1liststypeentriesRiskInformation riskInformation = null;

  @SerializedName("buyerInformation")
  private Riskv1liststypeentriesBuyerInformation buyerInformation = null;

  public AddNegativeListRequest orderInformation(Riskv1liststypeentriesOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Riskv1liststypeentriesOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public AddNegativeListRequest paymentInformation(Riskv1liststypeentriesPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Riskv1liststypeentriesPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public AddNegativeListRequest clientReferenceInformation(Riskv1liststypeentriesClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Riskv1liststypeentriesClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public AddNegativeListRequest deviceInformation(Riskv1liststypeentriesDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(Riskv1liststypeentriesDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public AddNegativeListRequest riskInformation(Riskv1liststypeentriesRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(Riskv1liststypeentriesRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }

  public AddNegativeListRequest buyerInformation(Riskv1liststypeentriesBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Riskv1liststypeentriesBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddNegativeListRequest addNegativeListRequest = (AddNegativeListRequest) o;
    return Objects.equals(this.orderInformation, addNegativeListRequest.orderInformation) &&
        Objects.equals(this.paymentInformation, addNegativeListRequest.paymentInformation) &&
        Objects.equals(this.clientReferenceInformation, addNegativeListRequest.clientReferenceInformation) &&
        Objects.equals(this.deviceInformation, addNegativeListRequest.deviceInformation) &&
        Objects.equals(this.riskInformation, addNegativeListRequest.riskInformation) &&
        Objects.equals(this.buyerInformation, addNegativeListRequest.buyerInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderInformation, paymentInformation, clientReferenceInformation, deviceInformation, riskInformation, buyerInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddNegativeListRequest {\n");
    
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
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

