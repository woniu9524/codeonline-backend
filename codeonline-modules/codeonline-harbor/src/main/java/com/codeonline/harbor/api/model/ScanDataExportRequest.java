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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The criteria to select the scan data to export.
 */
@ApiModel(description = "The criteria to select the scan data to export.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class ScanDataExportRequest {
  @SerializedName("job_name")
  private String jobName = null;

  @SerializedName("projects")
  private List<Long> projects = null;

  @SerializedName("labels")
  private List<Long> labels = null;

  @SerializedName("repositories")
  private String repositories = null;

  @SerializedName("cveIds")
  private String cveIds = null;

  @SerializedName("tags")
  private String tags = null;

  public ScanDataExportRequest jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

   /**
   * Name of the scan data export job
   * @return jobName
  **/
  @ApiModelProperty(value = "Name of the scan data export job")
  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public ScanDataExportRequest projects(List<Long> projects) {
    this.projects = projects;
    return this;
  }

  public ScanDataExportRequest addProjectsItem(Long projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<Long>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * A list of one or more projects for which to export the scan data, currently only one project is supported due to performance concerns, but define as array for extension in the future.
   * @return projects
  **/
  @ApiModelProperty(value = "A list of one or more projects for which to export the scan data, currently only one project is supported due to performance concerns, but define as array for extension in the future.")
  public List<Long> getProjects() {
    return projects;
  }

  public void setProjects(List<Long> projects) {
    this.projects = projects;
  }

  public ScanDataExportRequest labels(List<Long> labels) {
    this.labels = labels;
    return this;
  }

  public ScanDataExportRequest addLabelsItem(Long labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Long>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * A list of one or more labels for which to export the scan data, defaults to all if empty
   * @return labels
  **/
  @ApiModelProperty(value = "A list of one or more labels for which to export the scan data, defaults to all if empty")
  public List<Long> getLabels() {
    return labels;
  }

  public void setLabels(List<Long> labels) {
    this.labels = labels;
  }

  public ScanDataExportRequest repositories(String repositories) {
    this.repositories = repositories;
    return this;
  }

   /**
   * A list of repositories for which to export the scan data, defaults to all if empty
   * @return repositories
  **/
  @ApiModelProperty(value = "A list of repositories for which to export the scan data, defaults to all if empty")
  public String getRepositories() {
    return repositories;
  }

  public void setRepositories(String repositories) {
    this.repositories = repositories;
  }

  public ScanDataExportRequest cveIds(String cveIds) {
    this.cveIds = cveIds;
    return this;
  }

   /**
   * CVE-IDs for which to export data. Multiple CVE-IDs can be specified by separating using &#39;,&#39; and enclosed between &#39;{}&#39;. Defaults to all if empty
   * @return cveIds
  **/
  @ApiModelProperty(value = "CVE-IDs for which to export data. Multiple CVE-IDs can be specified by separating using ',' and enclosed between '{}'. Defaults to all if empty")
  public String getCveIds() {
    return cveIds;
  }

  public void setCveIds(String cveIds) {
    this.cveIds = cveIds;
  }

  public ScanDataExportRequest tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * A list of tags enclosed within &#39;{}&#39;. Defaults to all if empty
   * @return tags
  **/
  @ApiModelProperty(value = "A list of tags enclosed within '{}'. Defaults to all if empty")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScanDataExportRequest scanDataExportRequest = (ScanDataExportRequest) o;
    return Objects.equals(this.jobName, scanDataExportRequest.jobName) &&
        Objects.equals(this.projects, scanDataExportRequest.projects) &&
        Objects.equals(this.labels, scanDataExportRequest.labels) &&
        Objects.equals(this.repositories, scanDataExportRequest.repositories) &&
        Objects.equals(this.cveIds, scanDataExportRequest.cveIds) &&
        Objects.equals(this.tags, scanDataExportRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobName, projects, labels, repositories, cveIds, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanDataExportRequest {\n");
    
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    cveIds: ").append(toIndentedString(cveIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

