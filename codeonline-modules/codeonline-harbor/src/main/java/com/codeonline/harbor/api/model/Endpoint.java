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
 * Endpoint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class Endpoint {
  @SerializedName("url")
  private String url = null;

  @SerializedName("verify_cert")
  private Boolean verifyCert = null;

  public Endpoint url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of OIDC endpoint to be tested.
   * @return url
  **/
  @ApiModelProperty(value = "The URL of OIDC endpoint to be tested.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Endpoint verifyCert(Boolean verifyCert) {
    this.verifyCert = verifyCert;
    return this;
  }

   /**
   * Whether the certificate should be verified
   * @return verifyCert
  **/
  @ApiModelProperty(value = "Whether the certificate should be verified")
  public Boolean isVerifyCert() {
    return verifyCert;
  }

  public void setVerifyCert(Boolean verifyCert) {
    this.verifyCert = verifyCert;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Endpoint endpoint = (Endpoint) o;
    return Objects.equals(this.url, endpoint.url) &&
        Objects.equals(this.verifyCert, endpoint.verifyCert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, verifyCert);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endpoint {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    verifyCert: ").append(toIndentedString(verifyCert)).append("\n");
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

