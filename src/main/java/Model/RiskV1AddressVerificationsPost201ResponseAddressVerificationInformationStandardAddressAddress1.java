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
 * RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-26T01:49:30.319+05:30")
public class RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1 {
  @SerializedName("withApartment")
  private String withApartment = null;

  @SerializedName("withoutApartment")
  private String withoutApartment = null;

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1 withApartment(String withApartment) {
    this.withApartment = withApartment;
    return this;
  }

   /**
   * First line of the standardized address, including apartment information.
   * @return withApartment
  **/
  @ApiModelProperty(value = "First line of the standardized address, including apartment information.")
  public String getWithApartment() {
    return withApartment;
  }

  public void setWithApartment(String withApartment) {
    this.withApartment = withApartment;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1 withoutApartment(String withoutApartment) {
    this.withoutApartment = withoutApartment;
    return this;
  }

   /**
   * First line of the standardized address, without apartment information. Returned for U.S. and Canadian addresses. 
   * @return withoutApartment
  **/
  @ApiModelProperty(value = "First line of the standardized address, without apartment information. Returned for U.S. and Canadian addresses. ")
  public String getWithoutApartment() {
    return withoutApartment;
  }

  public void setWithoutApartment(String withoutApartment) {
    this.withoutApartment = withoutApartment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1 riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1 = (RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1) o;
    return Objects.equals(this.withApartment, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1.withApartment) &&
        Objects.equals(this.withoutApartment, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1.withoutApartment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withApartment, withoutApartment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddressAddress1 {\n");
    
    sb.append("    withApartment: ").append(toIndentedString(withApartment)).append("\n");
    sb.append("    withoutApartment: ").append(toIndentedString(withoutApartment)).append("\n");
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

