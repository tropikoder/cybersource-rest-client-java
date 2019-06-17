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
import Model.ReportingV3ReportsGet200ResponseReports;
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
 * ReportingV3ReportsGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class ReportingV3ReportsGet200Response {
  @SerializedName("reports")
  private List<ReportingV3ReportsGet200ResponseReports> reports = null;

  public ReportingV3ReportsGet200Response reports(List<ReportingV3ReportsGet200ResponseReports> reports) {
    this.reports = reports;
    return this;
  }

  public ReportingV3ReportsGet200Response addReportsItem(ReportingV3ReportsGet200ResponseReports reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<ReportingV3ReportsGet200ResponseReports>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @ApiModelProperty(value = "")
  public List<ReportingV3ReportsGet200ResponseReports> getReports() {
    return reports;
  }

  public void setReports(List<ReportingV3ReportsGet200ResponseReports> reports) {
    this.reports = reports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportsGet200Response reportingV3ReportsGet200Response = (ReportingV3ReportsGet200Response) o;
    return Objects.equals(this.reports, reportingV3ReportsGet200Response.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportsGet200Response {\n");
    
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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

