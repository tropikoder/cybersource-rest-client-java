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
 * PtsV2PaymentsPost201ResponseErrorInformationDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-22T14:46:25.834+05:30")
public class PtsV2PaymentsPost201ResponseErrorInformationDetails {
  @SerializedName("field")
  private String field = null;

  @SerializedName("reason")
  private String reason = null;

  public PtsV2PaymentsPost201ResponseErrorInformationDetails field(String field) {
    this.field = field;
    return this;
  }

   /**
   * This is the flattened JSON object field name/path that is either missing or invalid.
   * @return field
  **/
  @ApiModelProperty(value = "This is the flattened JSON object field name/path that is either missing or invalid.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public PtsV2PaymentsPost201ResponseErrorInformationDetails reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Possible reasons for the error.  Possible values:  - MISSING_FIELD  - INVALID_DATA 
   * @return reason
  **/
  @ApiModelProperty(value = "Possible reasons for the error.  Possible values:  - MISSING_FIELD  - INVALID_DATA ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseErrorInformationDetails ptsV2PaymentsPost201ResponseErrorInformationDetails = (PtsV2PaymentsPost201ResponseErrorInformationDetails) o;
    return Objects.equals(this.field, ptsV2PaymentsPost201ResponseErrorInformationDetails.field) &&
        Objects.equals(this.reason, ptsV2PaymentsPost201ResponseErrorInformationDetails.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseErrorInformationDetails {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

