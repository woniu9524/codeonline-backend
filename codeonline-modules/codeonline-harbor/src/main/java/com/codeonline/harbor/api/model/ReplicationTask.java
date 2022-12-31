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
 * The replication task
 */
@ApiModel(description = "The replication task")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class ReplicationTask {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("execution_id")
  private Integer executionId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("job_id")
  private String jobId = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("resource_type")
  private String resourceType = null;

  @SerializedName("src_resource")
  private String srcResource = null;

  @SerializedName("dst_resource")
  private String dstResource = null;

  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("end_time")
  private String endTime = null;

  public ReplicationTask id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the task
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the task")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ReplicationTask executionId(Integer executionId) {
    this.executionId = executionId;
    return this;
  }

   /**
   * The ID of the execution that the task belongs to
   * @return executionId
  **/
  @ApiModelProperty(value = "The ID of the execution that the task belongs to")
  public Integer getExecutionId() {
    return executionId;
  }

  public void setExecutionId(Integer executionId) {
    this.executionId = executionId;
  }

  public ReplicationTask status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the task
   * @return status
  **/
  @ApiModelProperty(value = "The status of the task")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ReplicationTask jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * The ID of the underlying job that the task related to
   * @return jobId
  **/
  @ApiModelProperty(value = "The ID of the underlying job that the task related to")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public ReplicationTask operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * The operation of the task
   * @return operation
  **/
  @ApiModelProperty(value = "The operation of the task")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public ReplicationTask resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * The type of the resource that the task operates
   * @return resourceType
  **/
  @ApiModelProperty(value = "The type of the resource that the task operates")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public ReplicationTask srcResource(String srcResource) {
    this.srcResource = srcResource;
    return this;
  }

   /**
   * The source resource that the task operates
   * @return srcResource
  **/
  @ApiModelProperty(value = "The source resource that the task operates")
  public String getSrcResource() {
    return srcResource;
  }

  public void setSrcResource(String srcResource) {
    this.srcResource = srcResource;
  }

  public ReplicationTask dstResource(String dstResource) {
    this.dstResource = dstResource;
    return this;
  }

   /**
   * The destination resource that the task operates
   * @return dstResource
  **/
  @ApiModelProperty(value = "The destination resource that the task operates")
  public String getDstResource() {
    return dstResource;
  }

  public void setDstResource(String dstResource) {
    this.dstResource = dstResource;
  }

  public ReplicationTask startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time of the task
   * @return startTime
  **/
  @ApiModelProperty(value = "The start time of the task")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public ReplicationTask endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end time of the task
   * @return endTime
  **/
  @ApiModelProperty(value = "The end time of the task")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplicationTask replicationTask = (ReplicationTask) o;
    return Objects.equals(this.id, replicationTask.id) &&
        Objects.equals(this.executionId, replicationTask.executionId) &&
        Objects.equals(this.status, replicationTask.status) &&
        Objects.equals(this.jobId, replicationTask.jobId) &&
        Objects.equals(this.operation, replicationTask.operation) &&
        Objects.equals(this.resourceType, replicationTask.resourceType) &&
        Objects.equals(this.srcResource, replicationTask.srcResource) &&
        Objects.equals(this.dstResource, replicationTask.dstResource) &&
        Objects.equals(this.startTime, replicationTask.startTime) &&
        Objects.equals(this.endTime, replicationTask.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, executionId, status, jobId, operation, resourceType, srcResource, dstResource, startTime, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicationTask {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    srcResource: ").append(toIndentedString(srcResource)).append("\n");
    sb.append("    dstResource: ").append(toIndentedString(dstResource)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

