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
import Model.PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures;
import Model.PtsV2PaymentsPost201ResponsePaymentInformationBank;
import Model.PtsV2PaymentsPost201ResponsePaymentInformationCard;
import Model.PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponsePaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-26T01:49:30.319+05:30")
public class PtsV2PaymentsPost201ResponsePaymentInformation {
  @SerializedName("card")
  private PtsV2PaymentsPost201ResponsePaymentInformationCard card = null;

  @SerializedName("tokenizedCard")
  private PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("accountFeatures")
  private PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures accountFeatures = null;

  @SerializedName("bank")
  private PtsV2PaymentsPost201ResponsePaymentInformationBank bank = null;

  public PtsV2PaymentsPost201ResponsePaymentInformation card(PtsV2PaymentsPost201ResponsePaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationCard getCard() {
    return card;
  }

  public void setCard(PtsV2PaymentsPost201ResponsePaymentInformationCard card) {
    this.card = card;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation tokenizedCard(PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation accountFeatures(PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures accountFeatures) {
    this.accountFeatures = accountFeatures;
    return this;
  }

   /**
   * Get accountFeatures
   * @return accountFeatures
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures getAccountFeatures() {
    return accountFeatures;
  }

  public void setAccountFeatures(PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures accountFeatures) {
    this.accountFeatures = accountFeatures;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformation bank(PtsV2PaymentsPost201ResponsePaymentInformationBank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationBank getBank() {
    return bank;
  }

  public void setBank(PtsV2PaymentsPost201ResponsePaymentInformationBank bank) {
    this.bank = bank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInformation ptsV2PaymentsPost201ResponsePaymentInformation = (PtsV2PaymentsPost201ResponsePaymentInformation) o;
    return Objects.equals(this.card, ptsV2PaymentsPost201ResponsePaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, ptsV2PaymentsPost201ResponsePaymentInformation.tokenizedCard) &&
        Objects.equals(this.accountFeatures, ptsV2PaymentsPost201ResponsePaymentInformation.accountFeatures) &&
        Objects.equals(this.bank, ptsV2PaymentsPost201ResponsePaymentInformation.bank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, tokenizedCard, accountFeatures, bank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    accountFeatures: ").append(toIndentedString(accountFeatures)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
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

