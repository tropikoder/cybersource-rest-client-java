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
 * Ptsv2paymentsPromotionInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-26T01:49:30.319+05:30")
public class Ptsv2paymentsPromotionInformation {
  @SerializedName("additionalCode")
  private String additionalCode = null;

  @SerializedName("code")
  private String code = null;

  public Ptsv2paymentsPromotionInformation additionalCode(String additionalCode) {
    this.additionalCode = additionalCode;
    return this;
  }

   /**
   * Additional rental agency marketed coupons for consumers to discount the rate of the vehicle rental agreement. 
   * @return additionalCode
  **/
  @ApiModelProperty(value = "Additional rental agency marketed coupons for consumers to discount the rate of the vehicle rental agreement. ")
  public String getAdditionalCode() {
    return additionalCode;
  }

  public void setAdditionalCode(String additionalCode) {
    this.additionalCode = additionalCode;
  }

  public Ptsv2paymentsPromotionInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code for a promotion or discount. 
   * @return code
  **/
  @ApiModelProperty(value = "Code for a promotion or discount. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPromotionInformation ptsv2paymentsPromotionInformation = (Ptsv2paymentsPromotionInformation) o;
    return Objects.equals(this.additionalCode, ptsv2paymentsPromotionInformation.additionalCode) &&
        Objects.equals(this.code, ptsv2paymentsPromotionInformation.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalCode, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPromotionInformation {\n");
    
    sb.append("    additionalCode: ").append(toIndentedString(additionalCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

