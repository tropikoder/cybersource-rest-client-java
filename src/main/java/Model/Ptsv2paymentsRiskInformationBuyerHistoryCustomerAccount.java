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
 * Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-30T13:05:11.653+05:30")
public class Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount {
  @SerializedName("lastChangeDate")
  private String lastChangeDate = null;

  @SerializedName("creationHistory")
  private String creationHistory = null;

  @SerializedName("modificationHistory")
  private String modificationHistory = null;

  @SerializedName("passwordHistory")
  private String passwordHistory = null;

  @SerializedName("createDate")
  private String createDate = null;

  @SerializedName("passwordChangeDate")
  private String passwordChangeDate = null;

  public Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount lastChangeDate(String lastChangeDate) {
    this.lastChangeDate = lastChangeDate;
    return this;
  }

   /**
   * Date the cardholder’s account was last changed. This includes changes to the billing or shipping address, new payment accounts or new users added. Recommended for Discover ProtectBuy. 
   * @return lastChangeDate
  **/
  @ApiModelProperty(value = "Date the cardholder’s account was last changed. This includes changes to the billing or shipping address, new payment accounts or new users added. Recommended for Discover ProtectBuy. ")
  public String getLastChangeDate() {
    return lastChangeDate;
  }

  public void setLastChangeDate(String lastChangeDate) {
    this.lastChangeDate = lastChangeDate;
  }

  public Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount creationHistory(String creationHistory) {
    this.creationHistory = creationHistory;
    return this;
  }

   /**
   * The values from the enum can be: - GUEST - NEW_ACCOUNT - EXISTING_ACCOUNT 
   * @return creationHistory
  **/
  @ApiModelProperty(value = "The values from the enum can be: - GUEST - NEW_ACCOUNT - EXISTING_ACCOUNT ")
  public String getCreationHistory() {
    return creationHistory;
  }

  public void setCreationHistory(String creationHistory) {
    this.creationHistory = creationHistory;
  }

  public Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount modificationHistory(String modificationHistory) {
    this.modificationHistory = modificationHistory;
    return this;
  }

   /**
   * This field is applicable only in case of EXISTING_ACCOUNT in creationHistory. Possible values: - ACCOUNT_UPDATED_NOW - ACCOUNT_UPDATED_PAST 
   * @return modificationHistory
  **/
  @ApiModelProperty(value = "This field is applicable only in case of EXISTING_ACCOUNT in creationHistory. Possible values: - ACCOUNT_UPDATED_NOW - ACCOUNT_UPDATED_PAST ")
  public String getModificationHistory() {
    return modificationHistory;
  }

  public void setModificationHistory(String modificationHistory) {
    this.modificationHistory = modificationHistory;
  }

  public Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount passwordHistory(String passwordHistory) {
    this.passwordHistory = passwordHistory;
    return this;
  }

   /**
   * This only applies for EXISTING_ACCOUNT in creationHistory. The values from the enum can be: - PASSWORD_CHANGED_NOW - PASSWORD_CHANGED_PAST - PASSWORD_NEVER_CHANGED 
   * @return passwordHistory
  **/
  @ApiModelProperty(value = "This only applies for EXISTING_ACCOUNT in creationHistory. The values from the enum can be: - PASSWORD_CHANGED_NOW - PASSWORD_CHANGED_PAST - PASSWORD_NEVER_CHANGED ")
  public String getPasswordHistory() {
    return passwordHistory;
  }

  public void setPasswordHistory(String passwordHistory) {
    this.passwordHistory = passwordHistory;
  }

  public Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Date the cardholder opened the account. Recommended for Discover ProtectBuy. This only applies for EXISTING_ACCOUNT in creationHistory. 
   * @return createDate
  **/
  @ApiModelProperty(value = "Date the cardholder opened the account. Recommended for Discover ProtectBuy. This only applies for EXISTING_ACCOUNT in creationHistory. ")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount passwordChangeDate(String passwordChangeDate) {
    this.passwordChangeDate = passwordChangeDate;
    return this;
  }

   /**
   * Date the cardholder last changed or reset password on account. Recommended for Discover ProtectBuy. This only applies for PASSWORD_CHANGED_PAST in passwordHistory. 
   * @return passwordChangeDate
  **/
  @ApiModelProperty(value = "Date the cardholder last changed or reset password on account. Recommended for Discover ProtectBuy. This only applies for PASSWORD_CHANGED_PAST in passwordHistory. ")
  public String getPasswordChangeDate() {
    return passwordChangeDate;
  }

  public void setPasswordChangeDate(String passwordChangeDate) {
    this.passwordChangeDate = passwordChangeDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount = (Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount) o;
    return Objects.equals(this.lastChangeDate, ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount.lastChangeDate) &&
        Objects.equals(this.creationHistory, ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount.creationHistory) &&
        Objects.equals(this.modificationHistory, ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount.modificationHistory) &&
        Objects.equals(this.passwordHistory, ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount.passwordHistory) &&
        Objects.equals(this.createDate, ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount.createDate) &&
        Objects.equals(this.passwordChangeDate, ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount.passwordChangeDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastChangeDate, creationHistory, modificationHistory, passwordHistory, createDate, passwordChangeDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount {\n");
    
    sb.append("    lastChangeDate: ").append(toIndentedString(lastChangeDate)).append("\n");
    sb.append("    creationHistory: ").append(toIndentedString(creationHistory)).append("\n");
    sb.append("    modificationHistory: ").append(toIndentedString(modificationHistory)).append("\n");
    sb.append("    passwordHistory: ").append(toIndentedString(passwordHistory)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    passwordChangeDate: ").append(toIndentedString(passwordChangeDate)).append("\n");
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

