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

import java.util.Objects;

/**
 * the job queue info
 */
@ApiModel(description = "the job queue info")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class JobQueue {
  @SerializedName("job_type")
  private String jobType = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("latency")
  private Integer latency = null;

  @SerializedName("paused")
  private Boolean paused = null;

  public JobQueue jobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

   /**
   * The type of the job queue
   * @return jobType
  **/
  @ApiModelProperty(value = "The type of the job queue")
  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public JobQueue count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The count of jobs in the job queue
   * @return count
  **/
  @ApiModelProperty(value = "The count of jobs in the job queue")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public JobQueue latency(Integer latency) {
    this.latency = latency;
    return this;
  }

   /**
   * The latency the job queue (seconds)
   * @return latency
  **/
  @ApiModelProperty(value = "The latency the job queue (seconds)")
  public Integer getLatency() {
    return latency;
  }

  public void setLatency(Integer latency) {
    this.latency = latency;
  }

  public JobQueue paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * The paused status of the job queue
   * @return paused
  **/
  @ApiModelProperty(value = "The paused status of the job queue")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobQueue jobQueue = (JobQueue) o;
    return Objects.equals(this.jobType, jobQueue.jobType) &&
        Objects.equals(this.count, jobQueue.count) &&
        Objects.equals(this.latency, jobQueue.latency) &&
        Objects.equals(this.paused, jobQueue.paused);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobType, count, latency, paused);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobQueue {\n");
    
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
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
