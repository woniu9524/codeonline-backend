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
 * QuotaUpdateReq
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class QuotaUpdateReq {
  @SerializedName("hard")
  private ResourceList hard = null;

  public QuotaUpdateReq hard(ResourceList hard) {
    this.hard = hard;
    return this;
  }

   /**
   * The new hard limits for the quota
   * @return hard
  **/
  @ApiModelProperty(value = "The new hard limits for the quota")
  public ResourceList getHard() {
    return hard;
  }

  public void setHard(ResourceList hard) {
    this.hard = hard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaUpdateReq quotaUpdateReq = (QuotaUpdateReq) o;
    return Objects.equals(this.hard, quotaUpdateReq.hard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaUpdateReq {\n");
    
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
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

