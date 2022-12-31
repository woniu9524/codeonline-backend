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
 * The webhook policy target object.
 */
@ApiModel(description = "The webhook policy target object.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class WebhookTargetObject {
  @SerializedName("type")
  private String type = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("auth_header")
  private String authHeader = null;

  @SerializedName("skip_cert_verify")
  private Boolean skipCertVerify = null;

  public WebhookTargetObject type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The webhook target notify type.
   * @return type
  **/
  @ApiModelProperty(value = "The webhook target notify type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public WebhookTargetObject address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The webhook target address.
   * @return address
  **/
  @ApiModelProperty(value = "The webhook target address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public WebhookTargetObject authHeader(String authHeader) {
    this.authHeader = authHeader;
    return this;
  }

   /**
   * The webhook auth header.
   * @return authHeader
  **/
  @ApiModelProperty(value = "The webhook auth header.")
  public String getAuthHeader() {
    return authHeader;
  }

  public void setAuthHeader(String authHeader) {
    this.authHeader = authHeader;
  }

  public WebhookTargetObject skipCertVerify(Boolean skipCertVerify) {
    this.skipCertVerify = skipCertVerify;
    return this;
  }

   /**
   * Whether or not to skip cert verify.
   * @return skipCertVerify
  **/
  @ApiModelProperty(value = "Whether or not to skip cert verify.")
  public Boolean isSkipCertVerify() {
    return skipCertVerify;
  }

  public void setSkipCertVerify(Boolean skipCertVerify) {
    this.skipCertVerify = skipCertVerify;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookTargetObject webhookTargetObject = (WebhookTargetObject) o;
    return Objects.equals(this.type, webhookTargetObject.type) &&
        Objects.equals(this.address, webhookTargetObject.address) &&
        Objects.equals(this.authHeader, webhookTargetObject.authHeader) &&
        Objects.equals(this.skipCertVerify, webhookTargetObject.skipCertVerify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, address, authHeader, skipCertVerify);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookTargetObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    authHeader: ").append(toIndentedString(authHeader)).append("\n");
    sb.append("    skipCertVerify: ").append(toIndentedString(skipCertVerify)).append("\n");
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

