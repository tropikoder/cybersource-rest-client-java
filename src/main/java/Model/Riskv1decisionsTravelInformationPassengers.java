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
 * Riskv1decisionsTravelInformationPassengers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class Riskv1decisionsTravelInformationPassengers {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  public Riskv1decisionsTravelInformationPassengers firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the passenger to whom the ticket was issued. If there are multiple passengers, include all listed on the ticket. Do not include special characters such as commas, hyphens, or apostrophes. Only ASCII characters are supported. Required for American Express SafeKey (U.S.) for travel-related requests. 
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the passenger to whom the ticket was issued. If there are multiple passengers, include all listed on the ticket. Do not include special characters such as commas, hyphens, or apostrophes. Only ASCII characters are supported. Required for American Express SafeKey (U.S.) for travel-related requests. ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Riskv1decisionsTravelInformationPassengers lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the passenger to whom the ticket was issued. If there are multiple passengers, include all listed on the ticket. Do not include special characters such as commas, hyphens, or apostrophes. Only ASCII characters are supported. Required for American Express SafeKey (U.S.) for travel-related requests. 
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the passenger to whom the ticket was issued. If there are multiple passengers, include all listed on the ticket. Do not include special characters such as commas, hyphens, or apostrophes. Only ASCII characters are supported. Required for American Express SafeKey (U.S.) for travel-related requests. ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsTravelInformationPassengers riskv1decisionsTravelInformationPassengers = (Riskv1decisionsTravelInformationPassengers) o;
    return Objects.equals(this.firstName, riskv1decisionsTravelInformationPassengers.firstName) &&
        Objects.equals(this.lastName, riskv1decisionsTravelInformationPassengers.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsTravelInformationPassengers {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

