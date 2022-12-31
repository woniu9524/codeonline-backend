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
 * Robot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class Robot {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("level")
  private String level = null;

  @SerializedName("duration")
  private Long duration = null;

  @SerializedName("editable")
  private Boolean editable = null;

  @SerializedName("disable")
  private Boolean disable = null;

  @SerializedName("expires_at")
  private Long expiresAt = null;

  @SerializedName("permissions")
  private List<RobotPermission> permissions = null;

  @SerializedName("creation_time")
  private String creationTime = null;

  @SerializedName("update_time")
  private String updateTime = null;

  public Robot id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the robot
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the robot")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Robot name(String name) {
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

  public Robot description(String description) {
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

  public Robot secret(String secret) {
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

  public Robot level(String level) {
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

  public Robot duration(Long duration) {
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

  public Robot editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

   /**
   * The editable status of the robot
   * @return editable
  **/
  @ApiModelProperty(value = "The editable status of the robot")
  public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public Robot disable(Boolean disable) {
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

  public Robot expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The expiration data of the robot
   * @return expiresAt
  **/
  @ApiModelProperty(value = "The expiration data of the robot")
  public Long getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Robot permissions(List<RobotPermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Robot addPermissionsItem(RobotPermission permissionsItem) {
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

  public Robot creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * The creation time of the robot.
   * @return creationTime
  **/
  @ApiModelProperty(value = "The creation time of the robot.")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public Robot updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The update time of the robot.
   * @return updateTime
  **/
  @ApiModelProperty(value = "The update time of the robot.")
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
    Robot robot = (Robot) o;
    return Objects.equals(this.id, robot.id) &&
        Objects.equals(this.name, robot.name) &&
        Objects.equals(this.description, robot.description) &&
        Objects.equals(this.secret, robot.secret) &&
        Objects.equals(this.level, robot.level) &&
        Objects.equals(this.duration, robot.duration) &&
        Objects.equals(this.editable, robot.editable) &&
        Objects.equals(this.disable, robot.disable) &&
        Objects.equals(this.expiresAt, robot.expiresAt) &&
        Objects.equals(this.permissions, robot.permissions) &&
        Objects.equals(this.creationTime, robot.creationTime) &&
        Objects.equals(this.updateTime, robot.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, secret, level, duration, editable, disable, expiresAt, permissions, creationTime, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Robot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

