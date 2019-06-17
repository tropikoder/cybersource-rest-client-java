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
import Model.Riskv1authenticationsDeviceInformationRawData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Riskv1authenticationsDeviceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class Riskv1authenticationsDeviceInformation {
  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("rawData")
  private List<Riskv1authenticationsDeviceInformationRawData> rawData = null;

  @SerializedName("httpAcceptBrowserValue")
  private String httpAcceptBrowserValue = null;

  @SerializedName("httpAcceptContent")
  private String httpAcceptContent = null;

  @SerializedName("userAgentBrowserValue")
  private String userAgentBrowserValue = null;

  public Riskv1authenticationsDeviceInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the customer. 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address of the customer. ")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Riskv1authenticationsDeviceInformation rawData(List<Riskv1authenticationsDeviceInformationRawData> rawData) {
    this.rawData = rawData;
    return this;
  }

  public Riskv1authenticationsDeviceInformation addRawDataItem(Riskv1authenticationsDeviceInformationRawData rawDataItem) {
    if (this.rawData == null) {
      this.rawData = new ArrayList<Riskv1authenticationsDeviceInformationRawData>();
    }
    this.rawData.add(rawDataItem);
    return this;
  }

   /**
   * Get rawData
   * @return rawData
  **/
  @ApiModelProperty(value = "")
  public List<Riskv1authenticationsDeviceInformationRawData> getRawData() {
    return rawData;
  }

  public void setRawData(List<Riskv1authenticationsDeviceInformationRawData> rawData) {
    this.rawData = rawData;
  }

  public Riskv1authenticationsDeviceInformation httpAcceptBrowserValue(String httpAcceptBrowserValue) {
    this.httpAcceptBrowserValue = httpAcceptBrowserValue;
    return this;
  }

   /**
   * Value of the Accept header sent by the customer’s web browser. **Note** If the customer’s browser provides a value, you must include it in your request. 
   * @return httpAcceptBrowserValue
  **/
  @ApiModelProperty(value = "Value of the Accept header sent by the customer’s web browser. **Note** If the customer’s browser provides a value, you must include it in your request. ")
  public String getHttpAcceptBrowserValue() {
    return httpAcceptBrowserValue;
  }

  public void setHttpAcceptBrowserValue(String httpAcceptBrowserValue) {
    this.httpAcceptBrowserValue = httpAcceptBrowserValue;
  }

  public Riskv1authenticationsDeviceInformation httpAcceptContent(String httpAcceptContent) {
    this.httpAcceptContent = httpAcceptContent;
    return this;
  }

   /**
   * The exact content of the HTTP accept header. 
   * @return httpAcceptContent
  **/
  @ApiModelProperty(value = "The exact content of the HTTP accept header. ")
  public String getHttpAcceptContent() {
    return httpAcceptContent;
  }

  public void setHttpAcceptContent(String httpAcceptContent) {
    this.httpAcceptContent = httpAcceptContent;
  }

  public Riskv1authenticationsDeviceInformation userAgentBrowserValue(String userAgentBrowserValue) {
    this.userAgentBrowserValue = userAgentBrowserValue;
    return this;
  }

   /**
   * Value of the User-Agent header sent by the customer’s web browser. Note If the customer’s browser provides a value, you must include it in your request. 
   * @return userAgentBrowserValue
  **/
  @ApiModelProperty(value = "Value of the User-Agent header sent by the customer’s web browser. Note If the customer’s browser provides a value, you must include it in your request. ")
  public String getUserAgentBrowserValue() {
    return userAgentBrowserValue;
  }

  public void setUserAgentBrowserValue(String userAgentBrowserValue) {
    this.userAgentBrowserValue = userAgentBrowserValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsDeviceInformation riskv1authenticationsDeviceInformation = (Riskv1authenticationsDeviceInformation) o;
    return Objects.equals(this.ipAddress, riskv1authenticationsDeviceInformation.ipAddress) &&
        Objects.equals(this.rawData, riskv1authenticationsDeviceInformation.rawData) &&
        Objects.equals(this.httpAcceptBrowserValue, riskv1authenticationsDeviceInformation.httpAcceptBrowserValue) &&
        Objects.equals(this.httpAcceptContent, riskv1authenticationsDeviceInformation.httpAcceptContent) &&
        Objects.equals(this.userAgentBrowserValue, riskv1authenticationsDeviceInformation.userAgentBrowserValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, rawData, httpAcceptBrowserValue, httpAcceptContent, userAgentBrowserValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsDeviceInformation {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
    sb.append("    httpAcceptBrowserValue: ").append(toIndentedString(httpAcceptBrowserValue)).append("\n");
    sb.append("    httpAcceptContent: ").append(toIndentedString(httpAcceptContent)).append("\n");
    sb.append("    userAgentBrowserValue: ").append(toIndentedString(userAgentBrowserValue)).append("\n");
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

