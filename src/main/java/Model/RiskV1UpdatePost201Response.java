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
import Model.PtsV2IncrementalAuthorizationPatch201ResponseLinks;
import Model.RiskV1DecisionsPost201ResponseClientReferenceInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskV1UpdatePost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class RiskV1UpdatePost201Response {
  @SerializedName("_links")
  private PtsV2IncrementalAuthorizationPatch201ResponseLinks links = null;

  @SerializedName("clientReferenceInformaton")
  private RiskV1DecisionsPost201ResponseClientReferenceInformation clientReferenceInformaton = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  public RiskV1UpdatePost201Response links(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
  }

  public RiskV1UpdatePost201Response clientReferenceInformaton(RiskV1DecisionsPost201ResponseClientReferenceInformation clientReferenceInformaton) {
    this.clientReferenceInformaton = clientReferenceInformaton;
    return this;
  }

   /**
   * Get clientReferenceInformaton
   * @return clientReferenceInformaton
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseClientReferenceInformation getClientReferenceInformaton() {
    return clientReferenceInformaton;
  }

  public void setClientReferenceInformaton(RiskV1DecisionsPost201ResponseClientReferenceInformation clientReferenceInformaton) {
    this.clientReferenceInformaton = clientReferenceInformaton;
  }

  public RiskV1UpdatePost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number to identify the submitted request. It is also appended to the endpoint of the resource.  On incremental authorizations, this value with be the same as the identification number returned in the original authorization response.  #### PIN debit Returned for all PIN debit services. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number to identify the submitted request. It is also appended to the endpoint of the resource.  On incremental authorizations, this value with be the same as the identification number returned in the original authorization response.  #### PIN debit Returned for all PIN debit services. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RiskV1UpdatePost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status for risk update 201 calls. Possible values are: - INVALID_REQUEST - COMPLETED 
   * @return status
  **/
  @ApiModelProperty(value = "The status for risk update 201 calls. Possible values are: - INVALID_REQUEST - COMPLETED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RiskV1UpdatePost201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by authorization service.  #### PIN debit Time when the PIN debit credit, PIN debit purchase or PIN debit reversal was requested.  Returned by PIN debit credit, PIN debit purchase or PIN debit reversal. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by authorization service.  #### PIN debit Time when the PIN debit credit, PIN debit purchase or PIN debit reversal was requested.  Returned by PIN debit credit, PIN debit purchase or PIN debit reversal. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1UpdatePost201Response riskV1UpdatePost201Response = (RiskV1UpdatePost201Response) o;
    return Objects.equals(this.links, riskV1UpdatePost201Response.links) &&
        Objects.equals(this.clientReferenceInformaton, riskV1UpdatePost201Response.clientReferenceInformaton) &&
        Objects.equals(this.id, riskV1UpdatePost201Response.id) &&
        Objects.equals(this.status, riskV1UpdatePost201Response.status) &&
        Objects.equals(this.submitTimeUtc, riskV1UpdatePost201Response.submitTimeUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, clientReferenceInformaton, id, status, submitTimeUtc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1UpdatePost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    clientReferenceInformaton: ").append(toIndentedString(clientReferenceInformaton)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
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

