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
 * Contains all of the customer-related fields for the invoice.
 */
@ApiModel(description = "Contains all of the customer-related fields for the invoice.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-26T01:49:30.319+05:30")
public class Invoicingv2invoicesCustomerInformation {
  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  public Invoicingv2invoicesCustomerInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Payer name for the invoice.
   * @return name
  **/
  @ApiModelProperty(value = "Payer name for the invoice.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Invoicingv2invoicesCustomerInformation email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s email address, including the full domain name.  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the &#x60;customer_email&#x60; request-level field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  #### Invoicing Email address for the customer for sending the invoice. If the invoice is in SENT status and email is updated, the old email customer payment link won&#39;t work and you must resend the invoice with the new payment link. 
   * @return email
  **/
  @ApiModelProperty(value = "Customer's email address, including the full domain name.  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the `customer_email` request-level field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  #### Invoicing Email address for the customer for sending the invoice. If the invoice is in SENT status and email is updated, the old email customer payment link won't work and you must resend the invoice with the new payment link. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoicingv2invoicesCustomerInformation invoicingv2invoicesCustomerInformation = (Invoicingv2invoicesCustomerInformation) o;
    return Objects.equals(this.name, invoicingv2invoicesCustomerInformation.name) &&
        Objects.equals(this.email, invoicingv2invoicesCustomerInformation.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoicingv2invoicesCustomerInformation {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

