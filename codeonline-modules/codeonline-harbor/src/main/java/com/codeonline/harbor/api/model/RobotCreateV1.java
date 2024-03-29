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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RobotCreateV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class RobotCreateV1 {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("expires_at")
  private Integer expiresAt = null;

  @SerializedName("access")
  private List<Access> access = null;

  public RobotCreateV1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of robot account
   * @return name
  **/
  @ApiModelProperty(value = "The name of robot account")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RobotCreateV1 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of robot account
   * @return description
  **/
  @ApiModelProperty(value = "The description of robot account")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RobotCreateV1 expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The expiration time on or after which the JWT MUST NOT be accepted for processing.
   * @return expiresAt
  **/
  @ApiModelProperty(value = "The expiration time on or after which the JWT MUST NOT be accepted for processing.")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public RobotCreateV1 access(List<Access> access) {
    this.access = access;
    return this;
  }

  public RobotCreateV1 addAccessItem(Access accessItem) {
    if (this.access == null) {
      this.access = new ArrayList<Access>();
    }
    this.access.add(accessItem);
    return this;
  }

   /**
   * The permission of robot account
   * @return access
  **/
  @ApiModelProperty(value = "The permission of robot account")
  public List<Access> getAccess() {
    return access;
  }

  public void setAccess(List<Access> access) {
    this.access = access;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RobotCreateV1 robotCreateV1 = (RobotCreateV1) o;
    return Objects.equals(this.name, robotCreateV1.name) &&
        Objects.equals(this.description, robotCreateV1.description) &&
        Objects.equals(this.expiresAt, robotCreateV1.expiresAt) &&
        Objects.equals(this.access, robotCreateV1.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, expiresAt, access);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RobotCreateV1 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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

