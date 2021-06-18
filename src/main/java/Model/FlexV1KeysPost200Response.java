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
import Model.FlexV1KeysPost200ResponseDer;
import Model.FlexV1KeysPost200ResponseJwk;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FlexV1KeysPost200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class FlexV1KeysPost200Response {
  @SerializedName("keyId")
  private String keyId = null;

  @SerializedName("der")
  private FlexV1KeysPost200ResponseDer der = null;

  @SerializedName("jwk")
  private FlexV1KeysPost200ResponseJwk jwk = null;

  public FlexV1KeysPost200Response keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Unique identifier for the generated token. Used in the subsequent Tokenize Card request from your customer’s device or browser.
   * @return keyId
  **/
  @ApiModelProperty(value = "Unique identifier for the generated token. Used in the subsequent Tokenize Card request from your customer’s device or browser.")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public FlexV1KeysPost200Response der(FlexV1KeysPost200ResponseDer der) {
    this.der = der;
    return this;
  }

   /**
   * Get der
   * @return der
  **/
  @ApiModelProperty(value = "")
  public FlexV1KeysPost200ResponseDer getDer() {
    return der;
  }

  public void setDer(FlexV1KeysPost200ResponseDer der) {
    this.der = der;
  }

  public FlexV1KeysPost200Response jwk(FlexV1KeysPost200ResponseJwk jwk) {
    this.jwk = jwk;
    return this;
  }

   /**
   * Get jwk
   * @return jwk
  **/
  @ApiModelProperty(value = "")
  public FlexV1KeysPost200ResponseJwk getJwk() {
    return jwk;
  }

  public void setJwk(FlexV1KeysPost200ResponseJwk jwk) {
    this.jwk = jwk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlexV1KeysPost200Response flexV1KeysPost200Response = (FlexV1KeysPost200Response) o;
    return Objects.equals(this.keyId, flexV1KeysPost200Response.keyId) &&
        Objects.equals(this.der, flexV1KeysPost200Response.der) &&
        Objects.equals(this.jwk, flexV1KeysPost200Response.jwk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyId, der, jwk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlexV1KeysPost200Response {\n");
    
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    der: ").append(toIndentedString(der)).append("\n");
    sb.append("    jwk: ").append(toIndentedString(jwk)).append("\n");
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

