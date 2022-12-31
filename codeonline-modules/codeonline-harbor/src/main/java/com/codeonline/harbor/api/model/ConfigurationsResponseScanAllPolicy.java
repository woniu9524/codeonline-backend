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
 * ConfigurationsResponseScanAllPolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class ConfigurationsResponseScanAllPolicy {
  @SerializedName("type")
  private String type = null;

  @SerializedName("parameter")
  private ConfigurationsResponseScanAllPolicyParameter parameter = null;

  public ConfigurationsResponseScanAllPolicy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of scan all policy, currently the valid values are \&quot;none\&quot; and \&quot;daily\&quot;
   * @return type
  **/
  @ApiModelProperty(value = "The type of scan all policy, currently the valid values are \"none\" and \"daily\"")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ConfigurationsResponseScanAllPolicy parameter(ConfigurationsResponseScanAllPolicyParameter parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @ApiModelProperty(value = "")
  public ConfigurationsResponseScanAllPolicyParameter getParameter() {
    return parameter;
  }

  public void setParameter(ConfigurationsResponseScanAllPolicyParameter parameter) {
    this.parameter = parameter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationsResponseScanAllPolicy configurationsResponseScanAllPolicy = (ConfigurationsResponseScanAllPolicy) o;
    return Objects.equals(this.type, configurationsResponseScanAllPolicy.type) &&
        Objects.equals(this.parameter, configurationsResponseScanAllPolicy.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parameter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationsResponseScanAllPolicy {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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

