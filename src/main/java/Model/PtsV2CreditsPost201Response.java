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
import Model.PtsV2CreditsPost201ResponseCreditAmountDetails;
import Model.PtsV2CreditsPost201ResponsePaymentInformation;
import Model.PtsV2CreditsPost201ResponseProcessingInformation;
import Model.PtsV2PaymentsCapturesPost201ResponsePointOfSaleInformation;
import Model.PtsV2PaymentsPost201ResponseClientReferenceInformation;
import Model.PtsV2PaymentsRefundPost201ResponseLinks;
import Model.PtsV2PaymentsRefundPost201ResponseOrderInformation;
import Model.PtsV2PaymentsRefundPost201ResponseProcessorInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2CreditsPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-16T15:14:23.160+05:30")
public class PtsV2CreditsPost201Response {
  @SerializedName("_links")
  private PtsV2PaymentsRefundPost201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("creditAmountDetails")
  private PtsV2CreditsPost201ResponseCreditAmountDetails creditAmountDetails = null;

  @SerializedName("processingInformation")
  private PtsV2CreditsPost201ResponseProcessingInformation processingInformation = null;

  @SerializedName("processorInformation")
  private PtsV2PaymentsRefundPost201ResponseProcessorInformation processorInformation = null;

  @SerializedName("paymentInformation")
  private PtsV2CreditsPost201ResponsePaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private PtsV2PaymentsRefundPost201ResponseOrderInformation orderInformation = null;

  @SerializedName("pointOfSaleInformation")
  private PtsV2PaymentsCapturesPost201ResponsePointOfSaleInformation pointOfSaleInformation = null;

  public PtsV2CreditsPost201Response links(PtsV2PaymentsRefundPost201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsRefundPost201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2PaymentsRefundPost201ResponseLinks links) {
    this.links = links;
  }

  public PtsV2CreditsPost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV2CreditsPost201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public PtsV2CreditsPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - PENDING  - COMPLETED (as in the case of PIN Debit Full Financial Credit) 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - PENDING  - COMPLETED (as in the case of PIN Debit Full Financial Credit) ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PtsV2CreditsPost201Response reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Reference number for the transaction. Depending on how your Cybersource account is configured, this value could either be provided in the API request or generated by CyberSource. The actual value used in the request to the processor is provided back to you by Cybersource in the response. 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Reference number for the transaction. Depending on how your Cybersource account is configured, this value could either be provided in the API request or generated by CyberSource. The actual value used in the request to the processor is provided back to you by Cybersource in the response. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public PtsV2CreditsPost201Response clientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public PtsV2CreditsPost201Response creditAmountDetails(PtsV2CreditsPost201ResponseCreditAmountDetails creditAmountDetails) {
    this.creditAmountDetails = creditAmountDetails;
    return this;
  }

   /**
   * Get creditAmountDetails
   * @return creditAmountDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2CreditsPost201ResponseCreditAmountDetails getCreditAmountDetails() {
    return creditAmountDetails;
  }

  public void setCreditAmountDetails(PtsV2CreditsPost201ResponseCreditAmountDetails creditAmountDetails) {
    this.creditAmountDetails = creditAmountDetails;
  }

  public PtsV2CreditsPost201Response processingInformation(PtsV2CreditsPost201ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2CreditsPost201ResponseProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(PtsV2CreditsPost201ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public PtsV2CreditsPost201Response processorInformation(PtsV2PaymentsRefundPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsRefundPost201ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PtsV2PaymentsRefundPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public PtsV2CreditsPost201Response paymentInformation(PtsV2CreditsPost201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2CreditsPost201ResponsePaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(PtsV2CreditsPost201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public PtsV2CreditsPost201Response orderInformation(PtsV2PaymentsRefundPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsRefundPost201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(PtsV2PaymentsRefundPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public PtsV2CreditsPost201Response pointOfSaleInformation(PtsV2PaymentsCapturesPost201ResponsePointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsCapturesPost201ResponsePointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(PtsV2PaymentsCapturesPost201ResponsePointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2CreditsPost201Response ptsV2CreditsPost201Response = (PtsV2CreditsPost201Response) o;
    return Objects.equals(this.links, ptsV2CreditsPost201Response.links) &&
        Objects.equals(this.id, ptsV2CreditsPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, ptsV2CreditsPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, ptsV2CreditsPost201Response.status) &&
        Objects.equals(this.reconciliationId, ptsV2CreditsPost201Response.reconciliationId) &&
        Objects.equals(this.clientReferenceInformation, ptsV2CreditsPost201Response.clientReferenceInformation) &&
        Objects.equals(this.creditAmountDetails, ptsV2CreditsPost201Response.creditAmountDetails) &&
        Objects.equals(this.processingInformation, ptsV2CreditsPost201Response.processingInformation) &&
        Objects.equals(this.processorInformation, ptsV2CreditsPost201Response.processorInformation) &&
        Objects.equals(this.paymentInformation, ptsV2CreditsPost201Response.paymentInformation) &&
        Objects.equals(this.orderInformation, ptsV2CreditsPost201Response.orderInformation) &&
        Objects.equals(this.pointOfSaleInformation, ptsV2CreditsPost201Response.pointOfSaleInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, reconciliationId, clientReferenceInformation, creditAmountDetails, processingInformation, processorInformation, paymentInformation, orderInformation, pointOfSaleInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2CreditsPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    creditAmountDetails: ").append(toIndentedString(creditAmountDetails)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
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

