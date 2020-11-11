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
 * VasV2PaymentsPost201ResponseOrderInformationJurisdiction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-30T13:05:11.653+05:30")
public class VasV2PaymentsPost201ResponseOrderInformationJurisdiction {
  @SerializedName("type")
  private String type = null;

  @SerializedName("taxName")
  private String taxName = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  @SerializedName("taxable")
  private String taxable = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("rate")
  private String rate = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("country")
  private String country = null;

  public VasV2PaymentsPost201ResponseOrderInformationJurisdiction type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of tax jurisdiction for the item. Returned only if the &#x60;taxInformation.showTaxPerLineItem&#x60; field is set to &#x60;Yes&#x60;.  Possible values: - &#x60;city&#x60; - &#x60;county&#x60; - &#x60;state&#x60; - &#x60;country&#x60; - &#x60;special&#x60; 
   * @return type
  **/
  @ApiModelProperty(value = "Type of tax jurisdiction for the item. Returned only if the `taxInformation.showTaxPerLineItem` field is set to `Yes`.  Possible values: - `city` - `county` - `state` - `country` - `special` ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VasV2PaymentsPost201ResponseOrderInformationJurisdiction taxName(String taxName) {
    this.taxName = taxName;
    return this;
  }

   /**
   * Name of the jurisdiction tax for the item. For example, CA State Tax. Returned only if the &#x60;taxInformation.showTaxPerLineItem&#x60; field is set to &#x60;Yes&#x60;. 
   * @return taxName
  **/
  @ApiModelProperty(value = "Name of the jurisdiction tax for the item. For example, CA State Tax. Returned only if the `taxInformation.showTaxPerLineItem` field is set to `Yes`. ")
  public String getTaxName() {
    return taxName;
  }

  public void setTaxName(String taxName) {
    this.taxName = taxName;
  }

  public VasV2PaymentsPost201ResponseOrderInformationJurisdiction taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Jurisdiction tax amount for the item. Returned only if the &#x60;taxInformation.showTaxPerLineItem&#x60; field is set to &#x60;Yes&#x60;. 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Jurisdiction tax amount for the item. Returned only if the `taxInformation.showTaxPerLineItem` field is set to `Yes`. ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public VasV2PaymentsPost201ResponseOrderInformationJurisdiction taxable(String taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Jurisdiction taxable amount for the item, not including product level exemptions. Returned only if the &#x60;taxInformation.showTaxPerLineItem&#x60; field is set to &#x60;Yes&#x60;. 
   * @return taxable
  **/
  @ApiModelProperty(value = "Jurisdiction taxable amount for the item, not including product level exemptions. Returned only if the `taxInformation.showTaxPerLineItem` field is set to `Yes`. ")
  public String getTaxable() {
    return taxable;
  }

  public void setTaxable(String taxable) {
    this.taxable = taxable;
  }

  public VasV2PaymentsPost201ResponseOrderInformationJurisdiction name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Free-text description of the jurisdiction for the item. For example, San Mateo County. Returned only if the &#x60;taxInformation.showTaxPerLineItem&#x60; field is set to &#x60;Yes&#x60;. 
   * @return name
  **/
  @ApiModelProperty(value = "Free-text description of the jurisdiction for the item. For example, San Mateo County. Returned only if the `taxInformation.showTaxPerLineItem` field is set to `Yes`. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VasV2PaymentsPost201ResponseOrderInformationJurisdiction code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Jurisdiction code assigned by the tax provider. Returned only if the &#x60;taxInformation.showTaxPerLineItem&#x60; field is set to &#x60;Yes&#x60;. 
   * @return code
  **/
  @ApiModelProperty(value = "Jurisdiction code assigned by the tax provider. Returned only if the `taxInformation.showTaxPerLineItem` field is set to `Yes`. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public VasV2PaymentsPost201ResponseOrderInformationJurisdiction rate(String rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Jurisdiction tax rate for the item. Returned only if the &#x60;taxInformation.showTaxPerLineItem&#x60; field is set to &#x60;Yes&#x60;. 
   * @return rate
  **/
  @ApiModelProperty(value = "Jurisdiction tax rate for the item. Returned only if the `taxInformation.showTaxPerLineItem` field is set to `Yes`. ")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public VasV2PaymentsPost201ResponseOrderInformationJurisdiction region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Free-text description of the jurisdiction region for the item. For example, CA (California State) or GB (Great Britain). Returned only if the &#x60;taxInformation.showTaxPerLineItem&#x60; field is set to &#x60;Yes&#x60;. 
   * @return region
  **/
  @ApiModelProperty(value = "Free-text description of the jurisdiction region for the item. For example, CA (California State) or GB (Great Britain). Returned only if the `taxInformation.showTaxPerLineItem` field is set to `Yes`. ")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public VasV2PaymentsPost201ResponseOrderInformationJurisdiction country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Tax jurisdiction country for the item. Returned only if the &#x60;taxInformation.showTaxPerLineItem&#x60; field is set to &#x60;Yes&#x60;. 
   * @return country
  **/
  @ApiModelProperty(value = "Tax jurisdiction country for the item. Returned only if the `taxInformation.showTaxPerLineItem` field is set to `Yes`. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VasV2PaymentsPost201ResponseOrderInformationJurisdiction vasV2PaymentsPost201ResponseOrderInformationJurisdiction = (VasV2PaymentsPost201ResponseOrderInformationJurisdiction) o;
    return Objects.equals(this.type, vasV2PaymentsPost201ResponseOrderInformationJurisdiction.type) &&
        Objects.equals(this.taxName, vasV2PaymentsPost201ResponseOrderInformationJurisdiction.taxName) &&
        Objects.equals(this.taxAmount, vasV2PaymentsPost201ResponseOrderInformationJurisdiction.taxAmount) &&
        Objects.equals(this.taxable, vasV2PaymentsPost201ResponseOrderInformationJurisdiction.taxable) &&
        Objects.equals(this.name, vasV2PaymentsPost201ResponseOrderInformationJurisdiction.name) &&
        Objects.equals(this.code, vasV2PaymentsPost201ResponseOrderInformationJurisdiction.code) &&
        Objects.equals(this.rate, vasV2PaymentsPost201ResponseOrderInformationJurisdiction.rate) &&
        Objects.equals(this.region, vasV2PaymentsPost201ResponseOrderInformationJurisdiction.region) &&
        Objects.equals(this.country, vasV2PaymentsPost201ResponseOrderInformationJurisdiction.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, taxName, taxAmount, taxable, name, code, rate, region, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VasV2PaymentsPost201ResponseOrderInformationJurisdiction {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    taxName: ").append(toIndentedString(taxName)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

