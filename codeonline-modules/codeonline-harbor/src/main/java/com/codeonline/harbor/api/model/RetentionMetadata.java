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
 * the tag retention metadata
 */
@ApiModel(description = "the tag retention metadata")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class RetentionMetadata {
  @SerializedName("templates")
  private List<RetentionRuleMetadata> templates = null;

  @SerializedName("scope_selectors")
  private List<RetentionSelectorMetadata> scopeSelectors = null;

  @SerializedName("tag_selectors")
  private List<RetentionSelectorMetadata> tagSelectors = null;

  public RetentionMetadata templates(List<RetentionRuleMetadata> templates) {
    this.templates = templates;
    return this;
  }

  public RetentionMetadata addTemplatesItem(RetentionRuleMetadata templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<RetentionRuleMetadata>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * templates
   * @return templates
  **/
  @ApiModelProperty(value = "templates")
  public List<RetentionRuleMetadata> getTemplates() {
    return templates;
  }

  public void setTemplates(List<RetentionRuleMetadata> templates) {
    this.templates = templates;
  }

  public RetentionMetadata scopeSelectors(List<RetentionSelectorMetadata> scopeSelectors) {
    this.scopeSelectors = scopeSelectors;
    return this;
  }

  public RetentionMetadata addScopeSelectorsItem(RetentionSelectorMetadata scopeSelectorsItem) {
    if (this.scopeSelectors == null) {
      this.scopeSelectors = new ArrayList<RetentionSelectorMetadata>();
    }
    this.scopeSelectors.add(scopeSelectorsItem);
    return this;
  }

   /**
   * supported scope selectors
   * @return scopeSelectors
  **/
  @ApiModelProperty(value = "supported scope selectors")
  public List<RetentionSelectorMetadata> getScopeSelectors() {
    return scopeSelectors;
  }

  public void setScopeSelectors(List<RetentionSelectorMetadata> scopeSelectors) {
    this.scopeSelectors = scopeSelectors;
  }

  public RetentionMetadata tagSelectors(List<RetentionSelectorMetadata> tagSelectors) {
    this.tagSelectors = tagSelectors;
    return this;
  }

  public RetentionMetadata addTagSelectorsItem(RetentionSelectorMetadata tagSelectorsItem) {
    if (this.tagSelectors == null) {
      this.tagSelectors = new ArrayList<RetentionSelectorMetadata>();
    }
    this.tagSelectors.add(tagSelectorsItem);
    return this;
  }

   /**
   * supported tag selectors
   * @return tagSelectors
  **/
  @ApiModelProperty(value = "supported tag selectors")
  public List<RetentionSelectorMetadata> getTagSelectors() {
    return tagSelectors;
  }

  public void setTagSelectors(List<RetentionSelectorMetadata> tagSelectors) {
    this.tagSelectors = tagSelectors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionMetadata retentionMetadata = (RetentionMetadata) o;
    return Objects.equals(this.templates, retentionMetadata.templates) &&
        Objects.equals(this.scopeSelectors, retentionMetadata.scopeSelectors) &&
        Objects.equals(this.tagSelectors, retentionMetadata.tagSelectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates, scopeSelectors, tagSelectors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionMetadata {\n");
    
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    scopeSelectors: ").append(toIndentedString(scopeSelectors)).append("\n");
    sb.append("    tagSelectors: ").append(toIndentedString(tagSelectors)).append("\n");
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

