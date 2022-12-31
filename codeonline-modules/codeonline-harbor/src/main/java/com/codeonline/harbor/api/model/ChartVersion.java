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
 * A specified chart entry
 */
@ApiModel(description = "A specified chart entry")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class ChartVersion extends ChartMetadata {
  @SerializedName("labels")
  private List<Label> labels = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("removed")
  private Boolean removed = null;

  @SerializedName("digest")
  private String digest = null;

  @SerializedName("urls")
  private List<String> urls = null;

  public ChartVersion labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public ChartVersion addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Label>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * A list of label
   * @return labels
  **/
  @ApiModelProperty(value = "A list of label")
  public List<Label> getLabels() {
    return labels;
  }

  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }

  public ChartVersion created(String created) {
    this.created = created;
    return this;
  }

   /**
   * The created time of the chart entry
   * @return created
  **/
  @ApiModelProperty(value = "The created time of the chart entry")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public ChartVersion removed(Boolean removed) {
    this.removed = removed;
    return this;
  }

   /**
   * A flag to indicate if the chart entry is removed
   * @return removed
  **/
  @ApiModelProperty(value = "A flag to indicate if the chart entry is removed")
  public Boolean isRemoved() {
    return removed;
  }

  public void setRemoved(Boolean removed) {
    this.removed = removed;
  }

  public ChartVersion digest(String digest) {
    this.digest = digest;
    return this;
  }

   /**
   * The digest value of the chart entry
   * @return digest
  **/
  @ApiModelProperty(value = "The digest value of the chart entry")
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }

  public ChartVersion urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public ChartVersion addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<String>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * The urls of the chart entry
   * @return urls
  **/
  @ApiModelProperty(value = "The urls of the chart entry")
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartVersion chartVersion = (ChartVersion) o;
    return Objects.equals(this.labels, chartVersion.labels) &&
        Objects.equals(this.created, chartVersion.created) &&
        Objects.equals(this.removed, chartVersion.removed) &&
        Objects.equals(this.digest, chartVersion.digest) &&
        Objects.equals(this.urls, chartVersion.urls) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, created, removed, digest, urls, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartVersion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

