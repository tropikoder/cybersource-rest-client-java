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
 * Contains response information about the payment.
 */
@ApiModel(description = "Contains response information about the payment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-22T14:46:25.834+05:30")
public class RiskV1DecisionsPost201ResponsePaymentInformation {
  @SerializedName("binCountry")
  private String binCountry = null;

  @SerializedName("accountType")
  private String accountType = null;

  @SerializedName("issuer")
  private String issuer = null;

  @SerializedName("scheme")
  private String scheme = null;

  @SerializedName("bin")
  private String bin = null;

  public RiskV1DecisionsPost201ResponsePaymentInformation binCountry(String binCountry) {
    this.binCountry = binCountry;
    return this;
  }

   /**
   * Country (two-digit country code) associated with the BIN of the customer’s card used for the payment. Returned if the information is available. Use this field for additional information when reviewing orders. This information is also displayed in the details page of the CyberSource Business Center.  For all possible values, see the &#x60;bin_country&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return binCountry
  **/
  @ApiModelProperty(value = "Country (two-digit country code) associated with the BIN of the customer’s card used for the payment. Returned if the information is available. Use this field for additional information when reviewing orders. This information is also displayed in the details page of the CyberSource Business Center.  For all possible values, see the `bin_country` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getBinCountry() {
    return binCountry;
  }

  public void setBinCountry(String binCountry) {
    this.binCountry = binCountry;
  }

  public RiskV1DecisionsPost201ResponsePaymentInformation accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of payment card account. This field can refer to a credit card, debit card, or prepaid card account type.  For all possible values, see the &#x60;score_card_account_type&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return accountType
  **/
  @ApiModelProperty(value = "Type of payment card account. This field can refer to a credit card, debit card, or prepaid card account type.  For all possible values, see the `score_card_account_type` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public RiskV1DecisionsPost201ResponsePaymentInformation issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Name of the bank or entity that issued the card account.  For all possible values, see the &#x60;score_card_issuer&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return issuer
  **/
  @ApiModelProperty(value = "Name of the bank or entity that issued the card account.  For all possible values, see the `score_card_issuer` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public RiskV1DecisionsPost201ResponsePaymentInformation scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

   /**
   * Subtype of card account. This field can contain one of the following values: - Maestro International - Maestro UK Domestic - MasterCard Credit - MasterCard Debit - Visa Credit - Visa Debit - Visa Electron  **Note** Additional values may be present.  For all possible values, see the &#x60;score_card_scheme&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return scheme
  **/
  @ApiModelProperty(value = "Subtype of card account. This field can contain one of the following values: - Maestro International - Maestro UK Domestic - MasterCard Credit - MasterCard Debit - Visa Credit - Visa Debit - Visa Electron  **Note** Additional values may be present.  For all possible values, see the `score_card_scheme` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public RiskV1DecisionsPost201ResponsePaymentInformation bin(String bin) {
    this.bin = bin;
    return this;
  }

   /**
   * Credit card BIN (the first six digits of the credit card).Derived either from the &#x60;cc_bin&#x60; request field or from the first six characters of the &#x60;customer_cc_num&#x60; field.  For all possible values, see the &#x60;score_cc_bin&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return bin
  **/
  @ApiModelProperty(value = "Credit card BIN (the first six digits of the credit card).Derived either from the `cc_bin` request field or from the first six characters of the `customer_cc_num` field.  For all possible values, see the `score_cc_bin` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1DecisionsPost201ResponsePaymentInformation riskV1DecisionsPost201ResponsePaymentInformation = (RiskV1DecisionsPost201ResponsePaymentInformation) o;
    return Objects.equals(this.binCountry, riskV1DecisionsPost201ResponsePaymentInformation.binCountry) &&
        Objects.equals(this.accountType, riskV1DecisionsPost201ResponsePaymentInformation.accountType) &&
        Objects.equals(this.issuer, riskV1DecisionsPost201ResponsePaymentInformation.issuer) &&
        Objects.equals(this.scheme, riskV1DecisionsPost201ResponsePaymentInformation.scheme) &&
        Objects.equals(this.bin, riskV1DecisionsPost201ResponsePaymentInformation.bin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binCountry, accountType, issuer, scheme, bin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1DecisionsPost201ResponsePaymentInformation {\n");
    
    sb.append("    binCountry: ").append(toIndentedString(binCountry)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
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

