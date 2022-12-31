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
 * UserGroupSearchItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class UserGroupSearchItem {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("group_name")
  private String groupName = null;

  @SerializedName("group_type")
  private Integer groupType = null;

  public UserGroupSearchItem id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the user group
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the user group")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserGroupSearchItem groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * The name of the user group
   * @return groupName
  **/
  @ApiModelProperty(value = "The name of the user group")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public UserGroupSearchItem groupType(Integer groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * The group type, 1 for LDAP group, 2 for HTTP group, 3 for OIDC group.
   * @return groupType
  **/
  @ApiModelProperty(value = "The group type, 1 for LDAP group, 2 for HTTP group, 3 for OIDC group.")
  public Integer getGroupType() {
    return groupType;
  }

  public void setGroupType(Integer groupType) {
    this.groupType = groupType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroupSearchItem userGroupSearchItem = (UserGroupSearchItem) o;
    return Objects.equals(this.id, userGroupSearchItem.id) &&
        Objects.equals(this.groupName, userGroupSearchItem.groupName) &&
        Objects.equals(this.groupType, userGroupSearchItem.groupType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupName, groupType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroupSearchItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
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

