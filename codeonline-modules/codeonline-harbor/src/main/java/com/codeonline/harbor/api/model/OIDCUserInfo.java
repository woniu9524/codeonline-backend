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
 * OIDCUserInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class OIDCUserInfo {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("subiss")
  private String subiss = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("creation_time")
  private String creationTime = null;

  @SerializedName("update_time")
  private String updateTime = null;

  public OIDCUserInfo id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * the ID of the OIDC info record
   * @return id
  **/
  @ApiModelProperty(value = "the ID of the OIDC info record")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OIDCUserInfo userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * the ID of the user
   * @return userId
  **/
  @ApiModelProperty(value = "the ID of the user")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public OIDCUserInfo subiss(String subiss) {
    this.subiss = subiss;
    return this;
  }

   /**
   * the concatenation of sub and issuer in the ID token
   * @return subiss
  **/
  @ApiModelProperty(value = "the concatenation of sub and issuer in the ID token")
  public String getSubiss() {
    return subiss;
  }

  public void setSubiss(String subiss) {
    this.subiss = subiss;
  }

  public OIDCUserInfo secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * the secret of the OIDC user that can be used for CLI to push/pull artifacts
   * @return secret
  **/
  @ApiModelProperty(value = "the secret of the OIDC user that can be used for CLI to push/pull artifacts")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public OIDCUserInfo creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * The creation time of the OIDC user info record.
   * @return creationTime
  **/
  @ApiModelProperty(value = "The creation time of the OIDC user info record.")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public OIDCUserInfo updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The update time of the OIDC user info record.
   * @return updateTime
  **/
  @ApiModelProperty(value = "The update time of the OIDC user info record.")
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
    OIDCUserInfo oiDCUserInfo = (OIDCUserInfo) o;
    return Objects.equals(this.id, oiDCUserInfo.id) &&
        Objects.equals(this.userId, oiDCUserInfo.userId) &&
        Objects.equals(this.subiss, oiDCUserInfo.subiss) &&
        Objects.equals(this.secret, oiDCUserInfo.secret) &&
        Objects.equals(this.creationTime, oiDCUserInfo.creationTime) &&
        Objects.equals(this.updateTime, oiDCUserInfo.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, subiss, secret, creationTime, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCUserInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    subiss: ").append(toIndentedString(subiss)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
