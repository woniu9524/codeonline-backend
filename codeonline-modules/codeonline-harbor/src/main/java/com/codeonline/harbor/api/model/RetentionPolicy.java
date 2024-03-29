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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * retention policy
 */
@ApiModel(description = "retention policy")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class RetentionPolicy {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("algorithm")
  private String algorithm = null;

  @SerializedName("rules")
  private List<RetentionRule> rules = null;

  @SerializedName("trigger")
  private RetentionRuleTrigger trigger = null;

  @SerializedName("scope")
  private RetentionPolicyScope scope = null;

  public RetentionPolicy id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RetentionPolicy algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Get algorithm
   * @return algorithm
  **/
  @ApiModelProperty(value = "")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public RetentionPolicy rules(List<RetentionRule> rules) {
    this.rules = rules;
    return this;
  }

  public RetentionPolicy addRulesItem(RetentionRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<RetentionRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")
  public List<RetentionRule> getRules() {
    return rules;
  }

  public void setRules(List<RetentionRule> rules) {
    this.rules = rules;
  }

  public RetentionPolicy trigger(RetentionRuleTrigger trigger) {
    this.trigger = trigger;
    return this;
  }

   /**
   * Get trigger
   * @return trigger
  **/
  @ApiModelProperty(value = "")
  public RetentionRuleTrigger getTrigger() {
    return trigger;
  }

  public void setTrigger(RetentionRuleTrigger trigger) {
    this.trigger = trigger;
  }

  public RetentionPolicy scope(RetentionPolicyScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")
  public RetentionPolicyScope getScope() {
    return scope;
  }

  public void setScope(RetentionPolicyScope scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionPolicy retentionPolicy = (RetentionPolicy) o;
    return Objects.equals(this.id, retentionPolicy.id) &&
        Objects.equals(this.algorithm, retentionPolicy.algorithm) &&
        Objects.equals(this.rules, retentionPolicy.rules) &&
        Objects.equals(this.trigger, retentionPolicy.trigger) &&
        Objects.equals(this.scope, retentionPolicy.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, algorithm, rules, trigger, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionPolicy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

