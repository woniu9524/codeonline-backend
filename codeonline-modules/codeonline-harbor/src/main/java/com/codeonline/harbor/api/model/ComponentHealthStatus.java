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
 * The health status of component
 */
@ApiModel(description = "The health status of component")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class ComponentHealthStatus {
  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("error")
  private String error = null;

  public ComponentHealthStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The component name
   * @return name
  **/
  @ApiModelProperty(value = "The component name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComponentHealthStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The health status of component
   * @return status
  **/
  @ApiModelProperty(value = "The health status of component")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ComponentHealthStatus error(String error) {
    this.error = error;
    return this;
  }

   /**
   * (optional) The error message when the status is \&quot;unhealthy\&quot;
   * @return error
  **/
  @ApiModelProperty(value = "(optional) The error message when the status is \"unhealthy\"")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentHealthStatus componentHealthStatus = (ComponentHealthStatus) o;
    return Objects.equals(this.name, componentHealthStatus.name) &&
        Objects.equals(this.status, componentHealthStatus.status) &&
        Objects.equals(this.error, componentHealthStatus.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentHealthStatus {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

