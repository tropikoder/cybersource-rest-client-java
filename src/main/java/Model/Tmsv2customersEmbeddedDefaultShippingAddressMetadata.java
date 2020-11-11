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
 * Tmsv2customersEmbeddedDefaultShippingAddressMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-30T13:05:11.653+05:30")
public class Tmsv2customersEmbeddedDefaultShippingAddressMetadata {
  @SerializedName("creator")
  private String creator = null;

   /**
   * The creator of the Shipping Address token.
   * @return creator
  **/
  @ApiModelProperty(value = "The creator of the Shipping Address token.")
  public String getCreator() {
    return creator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultShippingAddressMetadata tmsv2customersEmbeddedDefaultShippingAddressMetadata = (Tmsv2customersEmbeddedDefaultShippingAddressMetadata) o;
    return Objects.equals(this.creator, tmsv2customersEmbeddedDefaultShippingAddressMetadata.creator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultShippingAddressMetadata {\n");
    
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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

