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
import java.util.ArrayList;
import java.util.List;

/**
 * TssV2TransactionsGet200ResponseRiskInformationScore
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class TssV2TransactionsGet200ResponseRiskInformationScore {
  @SerializedName("factorCodes")
  private List<String> factorCodes = null;

  @SerializedName("result")
  private Integer result = null;

  public TssV2TransactionsGet200ResponseRiskInformationScore factorCodes(List<String> factorCodes) {
    this.factorCodes = factorCodes;
    return this;
  }

  public TssV2TransactionsGet200ResponseRiskInformationScore addFactorCodesItem(String factorCodesItem) {
    if (this.factorCodes == null) {
      this.factorCodes = new ArrayList<String>();
    }
    this.factorCodes.add(factorCodesItem);
    return this;
  }

   /**
   * Array of factor codes.
   * @return factorCodes
  **/
  @ApiModelProperty(value = "Array of factor codes.")
  public List<String> getFactorCodes() {
    return factorCodes;
  }

  public void setFactorCodes(List<String> factorCodes) {
    this.factorCodes = factorCodes;
  }

  public TssV2TransactionsGet200ResponseRiskInformationScore result(Integer result) {
    this.result = result;
    return this;
  }

   /**
   * The description for this field is not available. 
   * @return result
  **/
  @ApiModelProperty(value = "The description for this field is not available. ")
  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseRiskInformationScore tssV2TransactionsGet200ResponseRiskInformationScore = (TssV2TransactionsGet200ResponseRiskInformationScore) o;
    return Objects.equals(this.factorCodes, tssV2TransactionsGet200ResponseRiskInformationScore.factorCodes) &&
        Objects.equals(this.result, tssV2TransactionsGet200ResponseRiskInformationScore.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factorCodes, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseRiskInformationScore {\n");
    
    sb.append("    factorCodes: ").append(toIndentedString(factorCodes)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

