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
 * UserSysAdminFlag
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class UserSysAdminFlag {
  @SerializedName("sysadmin_flag")
  private Boolean sysadminFlag = null;

  public UserSysAdminFlag sysadminFlag(Boolean sysadminFlag) {
    this.sysadminFlag = sysadminFlag;
    return this;
  }

   /**
   * true-admin, false-not admin.
   * @return sysadminFlag
  **/
  @ApiModelProperty(value = "true-admin, false-not admin.")
  public Boolean isSysadminFlag() {
    return sysadminFlag;
  }

  public void setSysadminFlag(Boolean sysadminFlag) {
    this.sysadminFlag = sysadminFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSysAdminFlag userSysAdminFlag = (UserSysAdminFlag) o;
    return Objects.equals(this.sysadminFlag, userSysAdminFlag.sysadminFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sysadminFlag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSysAdminFlag {\n");
    
    sb.append("    sysadminFlag: ").append(toIndentedString(sysadminFlag)).append("\n");
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

