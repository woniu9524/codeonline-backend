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
 * Statistic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class Statistic {
  @SerializedName("private_project_count")
  private Long privateProjectCount = null;

  @SerializedName("private_repo_count")
  private Long privateRepoCount = null;

  @SerializedName("public_project_count")
  private Long publicProjectCount = null;

  @SerializedName("public_repo_count")
  private Long publicRepoCount = null;

  @SerializedName("total_project_count")
  private Long totalProjectCount = null;

  @SerializedName("total_repo_count")
  private Long totalRepoCount = null;

  @SerializedName("total_storage_consumption")
  private Long totalStorageConsumption = null;

  public Statistic privateProjectCount(Long privateProjectCount) {
    this.privateProjectCount = privateProjectCount;
    return this;
  }

   /**
   * The count of the private projects
   * @return privateProjectCount
  **/
  @ApiModelProperty(value = "The count of the private projects")
  public Long getPrivateProjectCount() {
    return privateProjectCount;
  }

  public void setPrivateProjectCount(Long privateProjectCount) {
    this.privateProjectCount = privateProjectCount;
  }

  public Statistic privateRepoCount(Long privateRepoCount) {
    this.privateRepoCount = privateRepoCount;
    return this;
  }

   /**
   * The count of the private repositories
   * @return privateRepoCount
  **/
  @ApiModelProperty(value = "The count of the private repositories")
  public Long getPrivateRepoCount() {
    return privateRepoCount;
  }

  public void setPrivateRepoCount(Long privateRepoCount) {
    this.privateRepoCount = privateRepoCount;
  }

  public Statistic publicProjectCount(Long publicProjectCount) {
    this.publicProjectCount = publicProjectCount;
    return this;
  }

   /**
   * The count of the public projects
   * @return publicProjectCount
  **/
  @ApiModelProperty(value = "The count of the public projects")
  public Long getPublicProjectCount() {
    return publicProjectCount;
  }

  public void setPublicProjectCount(Long publicProjectCount) {
    this.publicProjectCount = publicProjectCount;
  }

  public Statistic publicRepoCount(Long publicRepoCount) {
    this.publicRepoCount = publicRepoCount;
    return this;
  }

   /**
   * The count of the public repositories
   * @return publicRepoCount
  **/
  @ApiModelProperty(value = "The count of the public repositories")
  public Long getPublicRepoCount() {
    return publicRepoCount;
  }

  public void setPublicRepoCount(Long publicRepoCount) {
    this.publicRepoCount = publicRepoCount;
  }

  public Statistic totalProjectCount(Long totalProjectCount) {
    this.totalProjectCount = totalProjectCount;
    return this;
  }

   /**
   * The count of the total projects, only be seen by the system admin
   * @return totalProjectCount
  **/
  @ApiModelProperty(value = "The count of the total projects, only be seen by the system admin")
  public Long getTotalProjectCount() {
    return totalProjectCount;
  }

  public void setTotalProjectCount(Long totalProjectCount) {
    this.totalProjectCount = totalProjectCount;
  }

  public Statistic totalRepoCount(Long totalRepoCount) {
    this.totalRepoCount = totalRepoCount;
    return this;
  }

   /**
   * The count of the total repositories, only be seen by the system admin
   * @return totalRepoCount
  **/
  @ApiModelProperty(value = "The count of the total repositories, only be seen by the system admin")
  public Long getTotalRepoCount() {
    return totalRepoCount;
  }

  public void setTotalRepoCount(Long totalRepoCount) {
    this.totalRepoCount = totalRepoCount;
  }

  public Statistic totalStorageConsumption(Long totalStorageConsumption) {
    this.totalStorageConsumption = totalStorageConsumption;
    return this;
  }

   /**
   * The total storage consumption of blobs, only be seen by the system admin
   * @return totalStorageConsumption
  **/
  @ApiModelProperty(value = "The total storage consumption of blobs, only be seen by the system admin")
  public Long getTotalStorageConsumption() {
    return totalStorageConsumption;
  }

  public void setTotalStorageConsumption(Long totalStorageConsumption) {
    this.totalStorageConsumption = totalStorageConsumption;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statistic statistic = (Statistic) o;
    return Objects.equals(this.privateProjectCount, statistic.privateProjectCount) &&
        Objects.equals(this.privateRepoCount, statistic.privateRepoCount) &&
        Objects.equals(this.publicProjectCount, statistic.publicProjectCount) &&
        Objects.equals(this.publicRepoCount, statistic.publicRepoCount) &&
        Objects.equals(this.totalProjectCount, statistic.totalProjectCount) &&
        Objects.equals(this.totalRepoCount, statistic.totalRepoCount) &&
        Objects.equals(this.totalStorageConsumption, statistic.totalStorageConsumption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateProjectCount, privateRepoCount, publicProjectCount, publicRepoCount, totalProjectCount, totalRepoCount, totalStorageConsumption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statistic {\n");
    
    sb.append("    privateProjectCount: ").append(toIndentedString(privateProjectCount)).append("\n");
    sb.append("    privateRepoCount: ").append(toIndentedString(privateRepoCount)).append("\n");
    sb.append("    publicProjectCount: ").append(toIndentedString(publicProjectCount)).append("\n");
    sb.append("    publicRepoCount: ").append(toIndentedString(publicRepoCount)).append("\n");
    sb.append("    totalProjectCount: ").append(toIndentedString(totalProjectCount)).append("\n");
    sb.append("    totalRepoCount: ").append(toIndentedString(totalRepoCount)).append("\n");
    sb.append("    totalStorageConsumption: ").append(toIndentedString(totalStorageConsumption)).append("\n");
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

