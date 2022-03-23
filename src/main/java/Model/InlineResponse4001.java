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
import Model.InlineResponse4001Fields;
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
 * Error Bean
 */
@ApiModel(description = "Error Bean")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-16T15:14:23.160+05:30")
public class InlineResponse4001 {
  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("localizationKey")
  private String localizationKey = null;

  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("fields")
  private List<InlineResponse4001Fields> fields = null;

  public InlineResponse4001 code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Error code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Error code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public InlineResponse4001 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Error message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse4001 localizationKey(String localizationKey) {
    this.localizationKey = localizationKey;
    return this;
  }

   /**
   * Localization Key Name
   * @return localizationKey
  **/
  @ApiModelProperty(value = "Localization Key Name")
  public String getLocalizationKey() {
    return localizationKey;
  }

  public void setLocalizationKey(String localizationKey) {
    this.localizationKey = localizationKey;
  }

  public InlineResponse4001 correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Correlation Id
   * @return correlationId
  **/
  @ApiModelProperty(value = "Correlation Id")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public InlineResponse4001 detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Error Detail
   * @return detail
  **/
  @ApiModelProperty(value = "Error Detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public InlineResponse4001 fields(List<InlineResponse4001Fields> fields) {
    this.fields = fields;
    return this;
  }

  public InlineResponse4001 addFieldsItem(InlineResponse4001Fields fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<InlineResponse4001Fields>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Error fields List
   * @return fields
  **/
  @ApiModelProperty(value = "Error fields List")
  public List<InlineResponse4001Fields> getFields() {
    return fields;
  }

  public void setFields(List<InlineResponse4001Fields> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4001 inlineResponse4001 = (InlineResponse4001) o;
    return Objects.equals(this.code, inlineResponse4001.code) &&
        Objects.equals(this.message, inlineResponse4001.message) &&
        Objects.equals(this.localizationKey, inlineResponse4001.localizationKey) &&
        Objects.equals(this.correlationId, inlineResponse4001.correlationId) &&
        Objects.equals(this.detail, inlineResponse4001.detail) &&
        Objects.equals(this.fields, inlineResponse4001.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, localizationKey, correlationId, detail, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4001 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    localizationKey: ").append(toIndentedString(localizationKey)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

