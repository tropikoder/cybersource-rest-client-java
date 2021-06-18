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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * Settlement Status Section Values.
 */
@ApiModel(description = "Settlement Status Section Values.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("settlementTime")
  private DateTime settlementTime = null;

  @SerializedName("reasonCode")
  private String reasonCode = null;

  @SerializedName("errorText")
  private String errorText = null;

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request.
   * @return requestId
  **/
  @ApiModelProperty(example = "12345678901234567890123456", value = "An unique identification number assigned by CyberSource to identify the submitted request.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Settlement Status
   * @return status
  **/
  @ApiModelProperty(example = "Settlement Status", value = "Settlement Status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses settlementTime(DateTime settlementTime) {
    this.settlementTime = settlementTime;
    return this;
  }

   /**
   * Settlement Date
   * @return settlementTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Settlement Date")
  public DateTime getSettlementTime() {
    return settlementTime;
  }

  public void setSettlementTime(DateTime settlementTime) {
    this.settlementTime = settlementTime;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * ReasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(example = "reasonCode", value = "ReasonCode")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses errorText(String errorText) {
    this.errorText = errorText;
    return this;
  }

   /**
   * errorText
   * @return errorText
  **/
  @ApiModelProperty(example = "errorText", value = "errorText")
  public String getErrorText() {
    return errorText;
  }

  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses reportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses = (ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses) o;
    return Objects.equals(this.requestId, reportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses.requestId) &&
        Objects.equals(this.status, reportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses.status) &&
        Objects.equals(this.settlementTime, reportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses.settlementTime) &&
        Objects.equals(this.reasonCode, reportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses.reasonCode) &&
        Objects.equals(this.errorText, reportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses.errorText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, status, settlementTime, reasonCode, errorText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3PurchaseRefundDetailsGet200ResponseSettlementStatuses {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    settlementTime: ").append(toIndentedString(settlementTime)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
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

