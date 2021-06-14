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
 * TssV2TransactionsGet200ResponseInstallmentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class TssV2TransactionsGet200ResponseInstallmentInformation {
  @SerializedName("numberOfInstallments")
  private String numberOfInstallments = null;

  public TssV2TransactionsGet200ResponseInstallmentInformation numberOfInstallments(String numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
    return this;
  }

   /**
   * Number of Installments.
   * @return numberOfInstallments
  **/
  @ApiModelProperty(value = "Number of Installments.")
  public String getNumberOfInstallments() {
    return numberOfInstallments;
  }

  public void setNumberOfInstallments(String numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseInstallmentInformation tssV2TransactionsGet200ResponseInstallmentInformation = (TssV2TransactionsGet200ResponseInstallmentInformation) o;
    return Objects.equals(this.numberOfInstallments, tssV2TransactionsGet200ResponseInstallmentInformation.numberOfInstallments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfInstallments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseInstallmentInformation {\n");
    
    sb.append("    numberOfInstallments: ").append(toIndentedString(numberOfInstallments)).append("\n");
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

