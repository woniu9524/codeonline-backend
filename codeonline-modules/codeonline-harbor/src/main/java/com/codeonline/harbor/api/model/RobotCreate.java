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
 * The request for robot account creation.
 */
@ApiModel(description = "The request for robot account creation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class RobotCreate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("level")
  private String level = null;

  @SerializedName("disable")
  private Boolean disable = null;

  @SerializedName("duration")
  private Long duration = null;

  @SerializedName("permissions")
  private List<RobotPermission> permissions = null;

  public RobotCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the tag
   * @return name
  **/
  @ApiModelProperty(value = "The name of the tag")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RobotCreate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the robot
   * @return description
  **/
  @ApiModelProperty(value = "The description of the robot")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RobotCreate secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * The secret of the robot
   * @return secret
  **/
  @ApiModelProperty(value = "The secret of the robot")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public RobotCreate level(String level) {
    this.level = level;
    return this;
  }

   /**
   * The level of the robot, project or system
   * @return level
  **/
  @ApiModelProperty(value = "The level of the robot, project or system")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public RobotCreate disable(Boolean disable) {
    this.disable = disable;
    return this;
  }

   /**
   * The disable status of the robot
   * @return disable
  **/
  @ApiModelProperty(value = "The disable status of the robot")
  public Boolean isDisable() {
    return disable;
  }

  public void setDisable(Boolean disable) {
    this.disable = disable;
  }

  public RobotCreate duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the robot in days
   * @return duration
  **/
  @ApiModelProperty(value = "The duration of the robot in days")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public RobotCreate permissions(List<RobotPermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public RobotCreate addPermissionsItem(RobotPermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<RobotPermission>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(value = "")
  public List<RobotPermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<RobotPermission> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RobotCreate robotCreate = (RobotCreate) o;
    return Objects.equals(this.name, robotCreate.name) &&
        Objects.equals(this.description, robotCreate.description) &&
        Objects.equals(this.secret, robotCreate.secret) &&
        Objects.equals(this.level, robotCreate.level) &&
        Objects.equals(this.disable, robotCreate.disable) &&
        Objects.equals(this.duration, robotCreate.duration) &&
        Objects.equals(this.permissions, robotCreate.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, secret, level, disable, duration, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RobotCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

