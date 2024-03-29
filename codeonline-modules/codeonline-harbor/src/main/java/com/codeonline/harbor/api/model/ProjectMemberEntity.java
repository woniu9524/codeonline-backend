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
 * ProjectMemberEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class ProjectMemberEntity {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("project_id")
  private Integer projectId = null;

  @SerializedName("entity_name")
  private String entityName = null;

  @SerializedName("role_name")
  private String roleName = null;

  @SerializedName("role_id")
  private Integer roleId = null;

  @SerializedName("entity_id")
  private Integer entityId = null;

  @SerializedName("entity_type")
  private String entityType = null;

  public ProjectMemberEntity id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * the project member id
   * @return id
  **/
  @ApiModelProperty(value = "the project member id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ProjectMemberEntity projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * the project id
   * @return projectId
  **/
  @ApiModelProperty(value = "the project id")
  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public ProjectMemberEntity entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

   /**
   * the name of the group member.
   * @return entityName
  **/
  @ApiModelProperty(value = "the name of the group member.")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public ProjectMemberEntity roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * the name of the role
   * @return roleName
  **/
  @ApiModelProperty(value = "the name of the role")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public ProjectMemberEntity roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * the role id
   * @return roleId
  **/
  @ApiModelProperty(value = "the role id")
  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public ProjectMemberEntity entityId(Integer entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * the id of entity, if the member is a user, it is user_id in user table. if the member is a user group, it is the user group&#39;s ID in user_group table.
   * @return entityId
  **/
  @ApiModelProperty(value = "the id of entity, if the member is a user, it is user_id in user table. if the member is a user group, it is the user group's ID in user_group table.")
  public Integer getEntityId() {
    return entityId;
  }

  public void setEntityId(Integer entityId) {
    this.entityId = entityId;
  }

  public ProjectMemberEntity entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * the entity&#39;s type, u for user entity, g for group entity.
   * @return entityType
  **/
  @ApiModelProperty(value = "the entity's type, u for user entity, g for group entity.")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectMemberEntity projectMemberEntity = (ProjectMemberEntity) o;
    return Objects.equals(this.id, projectMemberEntity.id) &&
        Objects.equals(this.projectId, projectMemberEntity.projectId) &&
        Objects.equals(this.entityName, projectMemberEntity.entityName) &&
        Objects.equals(this.roleName, projectMemberEntity.roleName) &&
        Objects.equals(this.roleId, projectMemberEntity.roleId) &&
        Objects.equals(this.entityId, projectMemberEntity.entityId) &&
        Objects.equals(this.entityType, projectMemberEntity.entityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectId, entityName, roleName, roleId, entityId, entityType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectMemberEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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

