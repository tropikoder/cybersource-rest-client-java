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

/**
 * Ptsv2payoutsProcessingInformationPayoutsOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class Ptsv2payoutsProcessingInformationPayoutsOptions {
  @SerializedName("acquirerMerchantId")
  private String acquirerMerchantId = null;

  @SerializedName("acquirerBin")
  private String acquirerBin = null;

  @SerializedName("retrievalReferenceNumber")
  private String retrievalReferenceNumber = null;

  @SerializedName("accountFundingReferenceId")
  private String accountFundingReferenceId = null;

  public Ptsv2payoutsProcessingInformationPayoutsOptions acquirerMerchantId(String acquirerMerchantId) {
    this.acquirerMerchantId = acquirerMerchantId;
    return this;
  }

   /**
   * This field identifies the card acceptor for defining the point of service terminal in both local and interchange environments. An acquirer-assigned code identifying the card acceptor for the transaction.  Depending on the acquirer and merchant billing and reporting requirements, the code can represent a merchant, a specific merchant location, or a specific merchant location terminal. Acquiring Institution Identification Code uniquely identifies the merchant. The value from the original is required in any subsequent messages, including reversals, chargebacks, and representments. * Applicable only for CTV for Payouts. 
   * @return acquirerMerchantId
  **/
  @ApiModelProperty(value = "This field identifies the card acceptor for defining the point of service terminal in both local and interchange environments. An acquirer-assigned code identifying the card acceptor for the transaction.  Depending on the acquirer and merchant billing and reporting requirements, the code can represent a merchant, a specific merchant location, or a specific merchant location terminal. Acquiring Institution Identification Code uniquely identifies the merchant. The value from the original is required in any subsequent messages, including reversals, chargebacks, and representments. * Applicable only for CTV for Payouts. ")
  public String getAcquirerMerchantId() {
    return acquirerMerchantId;
  }

  public void setAcquirerMerchantId(String acquirerMerchantId) {
    this.acquirerMerchantId = acquirerMerchantId;
  }

  public Ptsv2payoutsProcessingInformationPayoutsOptions acquirerBin(String acquirerBin) {
    this.acquirerBin = acquirerBin;
    return this;
  }

   /**
   * This code identifies the financial institution acting as the acquirer of this customer transaction. The acquirer is the member or system user that signed the merchant or ADM or dispensed cash.  This number is usually Visa-assigned. * Applicable only for CTV for Payouts. 
   * @return acquirerBin
  **/
  @ApiModelProperty(value = "This code identifies the financial institution acting as the acquirer of this customer transaction. The acquirer is the member or system user that signed the merchant or ADM or dispensed cash.  This number is usually Visa-assigned. * Applicable only for CTV for Payouts. ")
  public String getAcquirerBin() {
    return acquirerBin;
  }

  public void setAcquirerBin(String acquirerBin) {
    this.acquirerBin = acquirerBin;
  }

  public Ptsv2payoutsProcessingInformationPayoutsOptions retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

   /**
   * This field contains a number that is used with other data elements as a key to identify and track all messages related to a given cardholder transaction; that is, to a given transaction set.  Format:   Positions 1-4: The &#x60;yddd&#x60; equivalent of the date, where &#x60;y&#x60; &#x3D; 0-9 and &#x60;ddd&#x60; &#x3D; 001 – 366.   Positions 5-12: A unique identification number generated by the merchant  * Applicable only for CTV for Payouts. 
   * @return retrievalReferenceNumber
  **/
  @ApiModelProperty(value = "This field contains a number that is used with other data elements as a key to identify and track all messages related to a given cardholder transaction; that is, to a given transaction set.  Format:   Positions 1-4: The `yddd` equivalent of the date, where `y` = 0-9 and `ddd` = 001 – 366.   Positions 5-12: A unique identification number generated by the merchant  * Applicable only for CTV for Payouts. ")
  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }

  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
  }

  public Ptsv2payoutsProcessingInformationPayoutsOptions accountFundingReferenceId(String accountFundingReferenceId) {
    this.accountFundingReferenceId = accountFundingReferenceId;
    return this;
  }

   /**
   * Visa-generated transaction identifier (TID) that is unique for each original authorization and financial request. * Applicable only for CTV for Payouts. 
   * @return accountFundingReferenceId
  **/
  @ApiModelProperty(value = "Visa-generated transaction identifier (TID) that is unique for each original authorization and financial request. * Applicable only for CTV for Payouts. ")
  public String getAccountFundingReferenceId() {
    return accountFundingReferenceId;
  }

  public void setAccountFundingReferenceId(String accountFundingReferenceId) {
    this.accountFundingReferenceId = accountFundingReferenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2payoutsProcessingInformationPayoutsOptions ptsv2payoutsProcessingInformationPayoutsOptions = (Ptsv2payoutsProcessingInformationPayoutsOptions) o;
    return Objects.equals(this.acquirerMerchantId, ptsv2payoutsProcessingInformationPayoutsOptions.acquirerMerchantId) &&
        Objects.equals(this.acquirerBin, ptsv2payoutsProcessingInformationPayoutsOptions.acquirerBin) &&
        Objects.equals(this.retrievalReferenceNumber, ptsv2payoutsProcessingInformationPayoutsOptions.retrievalReferenceNumber) &&
        Objects.equals(this.accountFundingReferenceId, ptsv2payoutsProcessingInformationPayoutsOptions.accountFundingReferenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquirerMerchantId, acquirerBin, retrievalReferenceNumber, accountFundingReferenceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2payoutsProcessingInformationPayoutsOptions {\n");
    
    sb.append("    acquirerMerchantId: ").append(toIndentedString(acquirerMerchantId)).append("\n");
    sb.append("    acquirerBin: ").append(toIndentedString(acquirerBin)).append("\n");
    sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
    sb.append("    accountFundingReferenceId: ").append(toIndentedString(accountFundingReferenceId)).append("\n");
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

