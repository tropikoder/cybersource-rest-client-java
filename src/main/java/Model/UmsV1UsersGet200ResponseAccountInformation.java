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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * UmsV1UsersGet200ResponseAccountInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class UmsV1UsersGet200ResponseAccountInformation {
  @SerializedName("userName")
  private String userName = null;

  @SerializedName("roleId")
  private String roleId = null;

  @SerializedName("permissions")
  private List<String> permissions = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    LOCKED("locked"),
    
    DISABLED("disabled"),
    
    FORGOTPASSWORD("forgotpassword"),
    
    DELETED("deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("createdTime")
  private DateTime createdTime = null;

  @SerializedName("lastAccessTime")
  private DateTime lastAccessTime = null;

  @SerializedName("languagePreference")
  private String languagePreference = null;

  @SerializedName("timezone")
  private String timezone = null;

  public UmsV1UsersGet200ResponseAccountInformation userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UmsV1UsersGet200ResponseAccountInformation roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @ApiModelProperty(value = "")
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public UmsV1UsersGet200ResponseAccountInformation permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UmsV1UsersGet200ResponseAccountInformation addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<String>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(value = "")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public UmsV1UsersGet200ResponseAccountInformation status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UmsV1UsersGet200ResponseAccountInformation createdTime(DateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(DateTime createdTime) {
    this.createdTime = createdTime;
  }

  public UmsV1UsersGet200ResponseAccountInformation lastAccessTime(DateTime lastAccessTime) {
    this.lastAccessTime = lastAccessTime;
    return this;
  }

   /**
   * Get lastAccessTime
   * @return lastAccessTime
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastAccessTime() {
    return lastAccessTime;
  }

  public void setLastAccessTime(DateTime lastAccessTime) {
    this.lastAccessTime = lastAccessTime;
  }

  public UmsV1UsersGet200ResponseAccountInformation languagePreference(String languagePreference) {
    this.languagePreference = languagePreference;
    return this;
  }

   /**
   * Get languagePreference
   * @return languagePreference
  **/
  @ApiModelProperty(value = "")
  public String getLanguagePreference() {
    return languagePreference;
  }

  public void setLanguagePreference(String languagePreference) {
    this.languagePreference = languagePreference;
  }

  public UmsV1UsersGet200ResponseAccountInformation timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UmsV1UsersGet200ResponseAccountInformation umsV1UsersGet200ResponseAccountInformation = (UmsV1UsersGet200ResponseAccountInformation) o;
    return Objects.equals(this.userName, umsV1UsersGet200ResponseAccountInformation.userName) &&
        Objects.equals(this.roleId, umsV1UsersGet200ResponseAccountInformation.roleId) &&
        Objects.equals(this.permissions, umsV1UsersGet200ResponseAccountInformation.permissions) &&
        Objects.equals(this.status, umsV1UsersGet200ResponseAccountInformation.status) &&
        Objects.equals(this.createdTime, umsV1UsersGet200ResponseAccountInformation.createdTime) &&
        Objects.equals(this.lastAccessTime, umsV1UsersGet200ResponseAccountInformation.lastAccessTime) &&
        Objects.equals(this.languagePreference, umsV1UsersGet200ResponseAccountInformation.languagePreference) &&
        Objects.equals(this.timezone, umsV1UsersGet200ResponseAccountInformation.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, roleId, permissions, status, createdTime, lastAccessTime, languagePreference, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UmsV1UsersGet200ResponseAccountInformation {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastAccessTime: ").append(toIndentedString(lastAccessTime)).append("\n");
    sb.append("    languagePreference: ").append(toIndentedString(languagePreference)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

