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
 * Supportted webhook event types and notify types.
 */
@ApiModel(description = "Supportted webhook event types and notify types.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-30T20:20:43.840Z")
public class SupportedWebhookEventTypes {
  @SerializedName("event_type")
  private List<String> eventType = null;

  @SerializedName("notify_type")
  private List<String> notifyType = null;

  public SupportedWebhookEventTypes eventType(List<String> eventType) {
    this.eventType = eventType;
    return this;
  }

  public SupportedWebhookEventTypes addEventTypeItem(String eventTypeItem) {
    if (this.eventType == null) {
      this.eventType = new ArrayList<String>();
    }
    this.eventType.add(eventTypeItem);
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(value = "")
  public List<String> getEventType() {
    return eventType;
  }

  public void setEventType(List<String> eventType) {
    this.eventType = eventType;
  }

  public SupportedWebhookEventTypes notifyType(List<String> notifyType) {
    this.notifyType = notifyType;
    return this;
  }

  public SupportedWebhookEventTypes addNotifyTypeItem(String notifyTypeItem) {
    if (this.notifyType == null) {
      this.notifyType = new ArrayList<String>();
    }
    this.notifyType.add(notifyTypeItem);
    return this;
  }

   /**
   * Get notifyType
   * @return notifyType
  **/
  @ApiModelProperty(value = "")
  public List<String> getNotifyType() {
    return notifyType;
  }

  public void setNotifyType(List<String> notifyType) {
    this.notifyType = notifyType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedWebhookEventTypes supportedWebhookEventTypes = (SupportedWebhookEventTypes) o;
    return Objects.equals(this.eventType, supportedWebhookEventTypes.eventType) &&
        Objects.equals(this.notifyType, supportedWebhookEventTypes.notifyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, notifyType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedWebhookEventTypes {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    notifyType: ").append(toIndentedString(notifyType)).append("\n");
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

