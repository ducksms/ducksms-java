/*
 * Ducksms
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@ducksms.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ducksms.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SmsSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-20T08:27:51.507139Z[Etc/UTC]")
public class SmsSchema {
  /**
   * Preview the sms information
   */
  @JsonAdapter(PreviewEnum.Adapter.class)
  public enum PreviewEnum {
    YES("yes"),
    
    NO("no");

    private String value;

    PreviewEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PreviewEnum fromValue(String value) {
      for (PreviewEnum b : PreviewEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PreviewEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PreviewEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PreviewEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PreviewEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PREVIEW = "preview";
  @SerializedName(SERIALIZED_NAME_PREVIEW)
  private PreviewEnum preview;

  public static final String SERIALIZED_NAME_MOBILE_NUMBERS = "mobile_numbers";
  @SerializedName(SERIALIZED_NAME_MOBILE_NUMBERS)
  private List<String> mobileNumbers = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SENDER_ID = "sender_id";
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private String senderId;

  public static final String SERIALIZED_NAME_SCHEDULED_AT = "scheduled_at";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_AT)
  private String scheduledAt;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callback_url";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;


  public SmsSchema preview(PreviewEnum preview) {
    
    this.preview = preview;
    return this;
  }

   /**
   * Preview the sms information
   * @return preview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yes", value = "Preview the sms information")

  public PreviewEnum getPreview() {
    return preview;
  }


  public void setPreview(PreviewEnum preview) {
    this.preview = preview;
  }


  public SmsSchema mobileNumbers(List<String> mobileNumbers) {
    
    this.mobileNumbers = mobileNumbers;
    return this;
  }

  public SmsSchema addMobileNumbersItem(String mobileNumbersItem) {
    if (this.mobileNumbers == null) {
      this.mobileNumbers = new ArrayList<>();
    }
    this.mobileNumbers.add(mobileNumbersItem);
    return this;
  }

   /**
   * Get mobileNumbers
   * @return mobileNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"60121234567\",\"60131234567\",\"60141234567\",\"60151234567\",\"60161234567\",\"60171234567\",\"60181234567\"]", value = "")

  public List<String> getMobileNumbers() {
    return mobileNumbers;
  }


  public void setMobileNumbers(List<String> mobileNumbers) {
    this.mobileNumbers = mobileNumbers;
  }


  public SmsSchema message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hello world", value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SmsSchema senderId(String senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * Get senderId
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DUCKSMS", value = "")

  public String getSenderId() {
    return senderId;
  }


  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }


  public SmsSchema scheduledAt(String scheduledAt) {
    
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * Get scheduledAt
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-12-06T15:19", value = "")

  public String getScheduledAt() {
    return scheduledAt;
  }


  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public SmsSchema callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Get callbackUrl
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://webhook.site/2a88e4b4-56f7-46ee-b3a4-2f05d8b8456e", value = "")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsSchema smsSchema = (SmsSchema) o;
    return Objects.equals(this.preview, smsSchema.preview) &&
        Objects.equals(this.mobileNumbers, smsSchema.mobileNumbers) &&
        Objects.equals(this.message, smsSchema.message) &&
        Objects.equals(this.senderId, smsSchema.senderId) &&
        Objects.equals(this.scheduledAt, smsSchema.scheduledAt) &&
        Objects.equals(this.callbackUrl, smsSchema.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preview, mobileNumbers, message, senderId, scheduledAt, callbackUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsSchema {\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    mobileNumbers: ").append(toIndentedString(mobileNumbers)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

