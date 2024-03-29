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
 * StartReplicationExecution
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class StartReplicationExecution {
  @SerializedName("policy_id")
  private Long policyId = null;

  public StartReplicationExecution policyId(Long policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * The ID of policy that the execution belongs to.
   * @return policyId
  **/
  @ApiModelProperty(value = "The ID of policy that the execution belongs to.")
  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartReplicationExecution startReplicationExecution = (StartReplicationExecution) o;
    return Objects.equals(this.policyId, startReplicationExecution.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartReplicationExecution {\n");
    
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
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

