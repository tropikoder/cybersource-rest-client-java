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
import Model.KmsV2KeysAsymPost201ResponseCertificateInformation;
import Model.KmsV2KeysAsymPost201ResponseKeyInformation;
import Model.Kmsv2keyssymClientReferenceInformation;
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
 * KmsV2KeysAsymPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class KmsV2KeysAsymPost201Response {
  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("clientReferenceInformation")
  private Kmsv2keyssymClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("keyInformation")
  private List<KmsV2KeysAsymPost201ResponseKeyInformation> keyInformation = null;

  @SerializedName("certificateInformation")
  private List<KmsV2KeysAsymPost201ResponseCertificateInformation> certificateInformation = null;

  public KmsV2KeysAsymPost201Response submitTimeUtc(String submitTimeUtc) {
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

  public KmsV2KeysAsymPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - ACCEPTED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - ACCEPTED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public KmsV2KeysAsymPost201Response clientReferenceInformation(Kmsv2keyssymClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Kmsv2keyssymClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Kmsv2keyssymClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public KmsV2KeysAsymPost201Response keyInformation(List<KmsV2KeysAsymPost201ResponseKeyInformation> keyInformation) {
    this.keyInformation = keyInformation;
    return this;
  }

  public KmsV2KeysAsymPost201Response addKeyInformationItem(KmsV2KeysAsymPost201ResponseKeyInformation keyInformationItem) {
    if (this.keyInformation == null) {
      this.keyInformation = new ArrayList<KmsV2KeysAsymPost201ResponseKeyInformation>();
    }
    this.keyInformation.add(keyInformationItem);
    return this;
  }

   /**
   * Get keyInformation
   * @return keyInformation
  **/
  @ApiModelProperty(value = "")
  public List<KmsV2KeysAsymPost201ResponseKeyInformation> getKeyInformation() {
    return keyInformation;
  }

  public void setKeyInformation(List<KmsV2KeysAsymPost201ResponseKeyInformation> keyInformation) {
    this.keyInformation = keyInformation;
  }

  public KmsV2KeysAsymPost201Response certificateInformation(List<KmsV2KeysAsymPost201ResponseCertificateInformation> certificateInformation) {
    this.certificateInformation = certificateInformation;
    return this;
  }

  public KmsV2KeysAsymPost201Response addCertificateInformationItem(KmsV2KeysAsymPost201ResponseCertificateInformation certificateInformationItem) {
    if (this.certificateInformation == null) {
      this.certificateInformation = new ArrayList<KmsV2KeysAsymPost201ResponseCertificateInformation>();
    }
    this.certificateInformation.add(certificateInformationItem);
    return this;
  }

   /**
   * Get certificateInformation
   * @return certificateInformation
  **/
  @ApiModelProperty(value = "")
  public List<KmsV2KeysAsymPost201ResponseCertificateInformation> getCertificateInformation() {
    return certificateInformation;
  }

  public void setCertificateInformation(List<KmsV2KeysAsymPost201ResponseCertificateInformation> certificateInformation) {
    this.certificateInformation = certificateInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KmsV2KeysAsymPost201Response kmsV2KeysAsymPost201Response = (KmsV2KeysAsymPost201Response) o;
    return Objects.equals(this.submitTimeUtc, kmsV2KeysAsymPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, kmsV2KeysAsymPost201Response.status) &&
        Objects.equals(this.clientReferenceInformation, kmsV2KeysAsymPost201Response.clientReferenceInformation) &&
        Objects.equals(this.keyInformation, kmsV2KeysAsymPost201Response.keyInformation) &&
        Objects.equals(this.certificateInformation, kmsV2KeysAsymPost201Response.certificateInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitTimeUtc, status, clientReferenceInformation, keyInformation, certificateInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KmsV2KeysAsymPost201Response {\n");
    
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    keyInformation: ").append(toIndentedString(keyInformation)).append("\n");
    sb.append("    certificateInformation: ").append(toIndentedString(certificateInformation)).append("\n");
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

