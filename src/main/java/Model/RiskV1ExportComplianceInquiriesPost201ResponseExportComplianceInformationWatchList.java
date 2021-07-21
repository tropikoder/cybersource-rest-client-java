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
import Model.RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches;
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
 * RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList {
  @SerializedName("matches")
  private List<RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches> matches = null;

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList matches(List<RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches> matches) {
    this.matches = matches;
    return this;
  }

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList addMatchesItem(RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @ApiModelProperty(value = "")
  public List<RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches> getMatches() {
    return matches;
  }

  public void setMatches(List<RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches> matches) {
    this.matches = matches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList riskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList = (RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList) o;
    return Objects.equals(this.matches, riskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchList {\n");
    
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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

