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
import Model.Invoicingv2invoiceSettingsInvoiceSettingsInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InvoiceSettingsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class InvoiceSettingsRequest {
  @SerializedName("invoiceSettingsInformation")
  private Invoicingv2invoiceSettingsInvoiceSettingsInformation invoiceSettingsInformation = null;

  public InvoiceSettingsRequest invoiceSettingsInformation(Invoicingv2invoiceSettingsInvoiceSettingsInformation invoiceSettingsInformation) {
    this.invoiceSettingsInformation = invoiceSettingsInformation;
    return this;
  }

   /**
   * Get invoiceSettingsInformation
   * @return invoiceSettingsInformation
  **/
  @ApiModelProperty(value = "")
  public Invoicingv2invoiceSettingsInvoiceSettingsInformation getInvoiceSettingsInformation() {
    return invoiceSettingsInformation;
  }

  public void setInvoiceSettingsInformation(Invoicingv2invoiceSettingsInvoiceSettingsInformation invoiceSettingsInformation) {
    this.invoiceSettingsInformation = invoiceSettingsInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceSettingsRequest invoiceSettingsRequest = (InvoiceSettingsRequest) o;
    return Objects.equals(this.invoiceSettingsInformation, invoiceSettingsRequest.invoiceSettingsInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceSettingsInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceSettingsRequest {\n");
    
    sb.append("    invoiceSettingsInformation: ").append(toIndentedString(invoiceSettingsInformation)).append("\n");
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

