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
import Model.TmsV1InstrumentIdentifiersPost200ResponseCard;
import Model.Tmsv1instrumentidentifiersBankAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EmbeddedInstrumentIdentifierRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-26T01:49:30.319+05:30")
public class EmbeddedInstrumentIdentifierRequest {
  @SerializedName("id")
  private String id = null;

  @SerializedName("card")
  private TmsV1InstrumentIdentifiersPost200ResponseCard card = null;

  @SerializedName("bankAccount")
  private Tmsv1instrumentidentifiersBankAccount bankAccount = null;

  public EmbeddedInstrumentIdentifierRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the existing instrument identifier to be linked to the newly created payment instrument.
   * @return id
  **/
  @ApiModelProperty(example = "1234567890123456789", value = "The ID of the existing instrument identifier to be linked to the newly created payment instrument.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmbeddedInstrumentIdentifierRequest card(TmsV1InstrumentIdentifiersPost200ResponseCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseCard getCard() {
    return card;
  }

  public void setCard(TmsV1InstrumentIdentifiersPost200ResponseCard card) {
    this.card = card;
  }

  public EmbeddedInstrumentIdentifierRequest bankAccount(Tmsv1instrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public Tmsv1instrumentidentifiersBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(Tmsv1instrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedInstrumentIdentifierRequest embeddedInstrumentIdentifierRequest = (EmbeddedInstrumentIdentifierRequest) o;
    return Objects.equals(this.id, embeddedInstrumentIdentifierRequest.id) &&
        Objects.equals(this.card, embeddedInstrumentIdentifierRequest.card) &&
        Objects.equals(this.bankAccount, embeddedInstrumentIdentifierRequest.bankAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, card, bankAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedInstrumentIdentifierRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
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

