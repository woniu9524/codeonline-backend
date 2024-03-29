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
 * ExecHistory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class ExecHistory {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("job_name")
  private String jobName = null;

  @SerializedName("job_kind")
  private String jobKind = null;

  @SerializedName("job_parameters")
  private String jobParameters = null;

  @SerializedName("schedule")
  private ScheduleObj schedule = null;

  @SerializedName("job_status")
  private String jobStatus = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("creation_time")
  private String creationTime = null;

  @SerializedName("update_time")
  private String updateTime = null;

  public ExecHistory id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * the id of purge job.
   * @return id
  **/
  @ApiModelProperty(value = "the id of purge job.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ExecHistory jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

   /**
   * the job name of purge job.
   * @return jobName
  **/
  @ApiModelProperty(value = "the job name of purge job.")
  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public ExecHistory jobKind(String jobKind) {
    this.jobKind = jobKind;
    return this;
  }

   /**
   * the job kind of purge job.
   * @return jobKind
  **/
  @ApiModelProperty(value = "the job kind of purge job.")
  public String getJobKind() {
    return jobKind;
  }

  public void setJobKind(String jobKind) {
    this.jobKind = jobKind;
  }

  public ExecHistory jobParameters(String jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

   /**
   * the job parameters of purge job.
   * @return jobParameters
  **/
  @ApiModelProperty(value = "the job parameters of purge job.")
  public String getJobParameters() {
    return jobParameters;
  }

  public void setJobParameters(String jobParameters) {
    this.jobParameters = jobParameters;
  }

  public ExecHistory schedule(ScheduleObj schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")
  public ScheduleObj getSchedule() {
    return schedule;
  }

  public void setSchedule(ScheduleObj schedule) {
    this.schedule = schedule;
  }

  public ExecHistory jobStatus(String jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

   /**
   * the status of purge job.
   * @return jobStatus
  **/
  @ApiModelProperty(value = "the status of purge job.")
  public String getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(String jobStatus) {
    this.jobStatus = jobStatus;
  }

  public ExecHistory deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * if purge job was deleted.
   * @return deleted
  **/
  @ApiModelProperty(value = "if purge job was deleted.")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public ExecHistory creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * the creation time of purge job.
   * @return creationTime
  **/
  @ApiModelProperty(value = "the creation time of purge job.")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public ExecHistory updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * the update time of purge job.
   * @return updateTime
  **/
  @ApiModelProperty(value = "the update time of purge job.")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecHistory execHistory = (ExecHistory) o;
    return Objects.equals(this.id, execHistory.id) &&
        Objects.equals(this.jobName, execHistory.jobName) &&
        Objects.equals(this.jobKind, execHistory.jobKind) &&
        Objects.equals(this.jobParameters, execHistory.jobParameters) &&
        Objects.equals(this.schedule, execHistory.schedule) &&
        Objects.equals(this.jobStatus, execHistory.jobStatus) &&
        Objects.equals(this.deleted, execHistory.deleted) &&
        Objects.equals(this.creationTime, execHistory.creationTime) &&
        Objects.equals(this.updateTime, execHistory.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobName, jobKind, jobParameters, schedule, jobStatus, deleted, creationTime, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecHistory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    jobKind: ").append(toIndentedString(jobKind)).append("\n");
    sb.append("    jobParameters: ").append(toIndentedString(jobParameters)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

