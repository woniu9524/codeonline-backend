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
 * Label
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class Label {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("scope")
  private String scope = null;

  @SerializedName("project_id")
  private Long projectId = null;

  @SerializedName("creation_time")
  private String creationTime = null;

  @SerializedName("update_time")
  private String updateTime = null;

  public Label id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the label
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the label")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Label name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name the label
   * @return name
  **/
  @ApiModelProperty(value = "The name the label")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Label description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description the label
   * @return description
  **/
  @ApiModelProperty(value = "The description the label")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Label color(String color) {
    this.color = color;
    return this;
  }

   /**
   * The color the label
   * @return color
  **/
  @ApiModelProperty(value = "The color the label")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Label scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope the label
   * @return scope
  **/
  @ApiModelProperty(value = "The scope the label")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public Label projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of project that the label belongs to
   * @return projectId
  **/
  @ApiModelProperty(value = "The ID of project that the label belongs to")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public Label creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * The creation time the label
   * @return creationTime
  **/
  @ApiModelProperty(value = "The creation time the label")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public Label updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The update time of the label
   * @return updateTime
  **/
  @ApiModelProperty(value = "The update time of the label")
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
    Label label = (Label) o;
    return Objects.equals(this.id, label.id) &&
        Objects.equals(this.name, label.name) &&
        Objects.equals(this.description, label.description) &&
        Objects.equals(this.color, label.color) &&
        Objects.equals(this.scope, label.scope) &&
        Objects.equals(this.projectId, label.projectId) &&
        Objects.equals(this.creationTime, label.creationTime) &&
        Objects.equals(this.updateTime, label.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, color, scope, projectId, creationTime, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

