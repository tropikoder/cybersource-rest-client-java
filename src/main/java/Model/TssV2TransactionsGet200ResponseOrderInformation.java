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
import Model.TssV2TransactionsGet200ResponseOrderInformationAmountDetails;
import Model.TssV2TransactionsGet200ResponseOrderInformationBillTo;
import Model.TssV2TransactionsGet200ResponseOrderInformationInvoiceDetails;
import Model.TssV2TransactionsGet200ResponseOrderInformationLineItems;
import Model.TssV2TransactionsGet200ResponseOrderInformationShipTo;
import Model.TssV2TransactionsGet200ResponseOrderInformationShippingDetails;
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
 * TssV2TransactionsGet200ResponseOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class TssV2TransactionsGet200ResponseOrderInformation {
  @SerializedName("billTo")
  private TssV2TransactionsGet200ResponseOrderInformationBillTo billTo = null;

  @SerializedName("shipTo")
  private TssV2TransactionsGet200ResponseOrderInformationShipTo shipTo = null;

  @SerializedName("lineItems")
  private List<TssV2TransactionsGet200ResponseOrderInformationLineItems> lineItems = null;

  @SerializedName("amountDetails")
  private TssV2TransactionsGet200ResponseOrderInformationAmountDetails amountDetails = null;

  @SerializedName("shippingDetails")
  private TssV2TransactionsGet200ResponseOrderInformationShippingDetails shippingDetails = null;

  @SerializedName("invoiceDetails")
  private TssV2TransactionsGet200ResponseOrderInformationInvoiceDetails invoiceDetails = null;

  public TssV2TransactionsGet200ResponseOrderInformation billTo(TssV2TransactionsGet200ResponseOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(TssV2TransactionsGet200ResponseOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public TssV2TransactionsGet200ResponseOrderInformation shipTo(TssV2TransactionsGet200ResponseOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(TssV2TransactionsGet200ResponseOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public TssV2TransactionsGet200ResponseOrderInformation lineItems(List<TssV2TransactionsGet200ResponseOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public TssV2TransactionsGet200ResponseOrderInformation addLineItemsItem(TssV2TransactionsGet200ResponseOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<TssV2TransactionsGet200ResponseOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Transaction Line Item data.
   * @return lineItems
  **/
  @ApiModelProperty(value = "Transaction Line Item data.")
  public List<TssV2TransactionsGet200ResponseOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<TssV2TransactionsGet200ResponseOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }

  public TssV2TransactionsGet200ResponseOrderInformation amountDetails(TssV2TransactionsGet200ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(TssV2TransactionsGet200ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public TssV2TransactionsGet200ResponseOrderInformation shippingDetails(TssV2TransactionsGet200ResponseOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

   /**
   * Get shippingDetails
   * @return shippingDetails
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseOrderInformationShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public void setShippingDetails(TssV2TransactionsGet200ResponseOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }

  public TssV2TransactionsGet200ResponseOrderInformation invoiceDetails(TssV2TransactionsGet200ResponseOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseOrderInformationInvoiceDetails getInvoiceDetails() {
    return invoiceDetails;
  }

  public void setInvoiceDetails(TssV2TransactionsGet200ResponseOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseOrderInformation tssV2TransactionsGet200ResponseOrderInformation = (TssV2TransactionsGet200ResponseOrderInformation) o;
    return Objects.equals(this.billTo, tssV2TransactionsGet200ResponseOrderInformation.billTo) &&
        Objects.equals(this.shipTo, tssV2TransactionsGet200ResponseOrderInformation.shipTo) &&
        Objects.equals(this.lineItems, tssV2TransactionsGet200ResponseOrderInformation.lineItems) &&
        Objects.equals(this.amountDetails, tssV2TransactionsGet200ResponseOrderInformation.amountDetails) &&
        Objects.equals(this.shippingDetails, tssV2TransactionsGet200ResponseOrderInformation.shippingDetails) &&
        Objects.equals(this.invoiceDetails, tssV2TransactionsGet200ResponseOrderInformation.invoiceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billTo, shipTo, lineItems, amountDetails, shippingDetails, invoiceDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseOrderInformation {\n");
    
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    shippingDetails: ").append(toIndentedString(shippingDetails)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
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

