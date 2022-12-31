/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.codeonline.harbor.api.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ProjectSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class ProjectSummary {
  @SerializedName("repo_count")
  private Integer repoCount = null;

  @SerializedName("chart_count")
  private Integer chartCount = null;

  @SerializedName("project_admin_count")
  private Integer projectAdminCount = null;

  @SerializedName("maintainer_count")
  private Integer maintainerCount = null;

  @SerializedName("developer_count")
  private Integer developerCount = null;

  @SerializedName("guest_count")
  private Integer guestCount = null;

  @SerializedName("limited_guest_count")
  private Integer limitedGuestCount = null;

  @SerializedName("quota")
  private ProjectSummaryQuota quota = null;

  @SerializedName("registry")
  private Registry registry = null;

  public ProjectSummary repoCount(Integer repoCount) {
    this.repoCount = repoCount;
    return this;
  }

   /**
   * The number of the repositories under this project.
   * @return repoCount
  **/
  @ApiModelProperty(value = "The number of the repositories under this project.")
  public Integer getRepoCount() {
    return repoCount;
  }

  public void setRepoCount(Integer repoCount) {
    this.repoCount = repoCount;
  }

  public ProjectSummary chartCount(Integer chartCount) {
    this.chartCount = chartCount;
    return this;
  }

   /**
   * The total number of charts under this project.
   * @return chartCount
  **/
  @ApiModelProperty(value = "The total number of charts under this project.")
  public Integer getChartCount() {
    return chartCount;
  }

  public void setChartCount(Integer chartCount) {
    this.chartCount = chartCount;
  }

  public ProjectSummary projectAdminCount(Integer projectAdminCount) {
    this.projectAdminCount = projectAdminCount;
    return this;
  }

   /**
   * The total number of project admin members.
   * @return projectAdminCount
  **/
  @ApiModelProperty(value = "The total number of project admin members.")
  public Integer getProjectAdminCount() {
    return projectAdminCount;
  }

  public void setProjectAdminCount(Integer projectAdminCount) {
    this.projectAdminCount = projectAdminCount;
  }

  public ProjectSummary maintainerCount(Integer maintainerCount) {
    this.maintainerCount = maintainerCount;
    return this;
  }

   /**
   * The total number of maintainer members.
   * @return maintainerCount
  **/
  @ApiModelProperty(value = "The total number of maintainer members.")
  public Integer getMaintainerCount() {
    return maintainerCount;
  }

  public void setMaintainerCount(Integer maintainerCount) {
    this.maintainerCount = maintainerCount;
  }

  public ProjectSummary developerCount(Integer developerCount) {
    this.developerCount = developerCount;
    return this;
  }

   /**
   * The total number of developer members.
   * @return developerCount
  **/
  @ApiModelProperty(value = "The total number of developer members.")
  public Integer getDeveloperCount() {
    return developerCount;
  }

  public void setDeveloperCount(Integer developerCount) {
    this.developerCount = developerCount;
  }

  public ProjectSummary guestCount(Integer guestCount) {
    this.guestCount = guestCount;
    return this;
  }

   /**
   * The total number of guest members.
   * @return guestCount
  **/
  @ApiModelProperty(value = "The total number of guest members.")
  public Integer getGuestCount() {
    return guestCount;
  }

  public void setGuestCount(Integer guestCount) {
    this.guestCount = guestCount;
  }

  public ProjectSummary limitedGuestCount(Integer limitedGuestCount) {
    this.limitedGuestCount = limitedGuestCount;
    return this;
  }

   /**
   * The total number of limited guest members.
   * @return limitedGuestCount
  **/
  @ApiModelProperty(value = "The total number of limited guest members.")
  public Integer getLimitedGuestCount() {
    return limitedGuestCount;
  }

  public void setLimitedGuestCount(Integer limitedGuestCount) {
    this.limitedGuestCount = limitedGuestCount;
  }

  public ProjectSummary quota(ProjectSummaryQuota quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @ApiModelProperty(value = "")
  public ProjectSummaryQuota getQuota() {
    return quota;
  }

  public void setQuota(ProjectSummaryQuota quota) {
    this.quota = quota;
  }

  public ProjectSummary registry(Registry registry) {
    this.registry = registry;
    return this;
  }

   /**
   * Get registry
   * @return registry
  **/
  @ApiModelProperty(value = "")
  public Registry getRegistry() {
    return registry;
  }

  public void setRegistry(Registry registry) {
    this.registry = registry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSummary projectSummary = (ProjectSummary) o;
    return Objects.equals(this.repoCount, projectSummary.repoCount) &&
        Objects.equals(this.chartCount, projectSummary.chartCount) &&
        Objects.equals(this.projectAdminCount, projectSummary.projectAdminCount) &&
        Objects.equals(this.maintainerCount, projectSummary.maintainerCount) &&
        Objects.equals(this.developerCount, projectSummary.developerCount) &&
        Objects.equals(this.guestCount, projectSummary.guestCount) &&
        Objects.equals(this.limitedGuestCount, projectSummary.limitedGuestCount) &&
        Objects.equals(this.quota, projectSummary.quota) &&
        Objects.equals(this.registry, projectSummary.registry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoCount, chartCount, projectAdminCount, maintainerCount, developerCount, guestCount, limitedGuestCount, quota, registry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSummary {\n");
    
    sb.append("    repoCount: ").append(toIndentedString(repoCount)).append("\n");
    sb.append("    chartCount: ").append(toIndentedString(chartCount)).append("\n");
    sb.append("    projectAdminCount: ").append(toIndentedString(projectAdminCount)).append("\n");
    sb.append("    maintainerCount: ").append(toIndentedString(maintainerCount)).append("\n");
    sb.append("    developerCount: ").append(toIndentedString(developerCount)).append("\n");
    sb.append("    guestCount: ").append(toIndentedString(guestCount)).append("\n");
    sb.append("    limitedGuestCount: ").append(toIndentedString(limitedGuestCount)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

