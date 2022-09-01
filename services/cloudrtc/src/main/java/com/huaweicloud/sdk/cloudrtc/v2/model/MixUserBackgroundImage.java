package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 指定用户的背景图，优先级大于default_user_background_image
 */
public class MixUserBackgroundImage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    @JacksonXmlProperty(localName = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_uri")

    @JacksonXmlProperty(localName = "image_uri")

    private String imageUri;

    public MixUserBackgroundImage withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 需要设置背景图的用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public MixUserBackgroundImage withImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }

    /**
     * 需要设置背景图的地址，图片先上传obs，格式s3://bucket/object
     * @return imageUri
     */
    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MixUserBackgroundImage mixUserBackgroundImage = (MixUserBackgroundImage) o;
        return Objects.equals(this.userId, mixUserBackgroundImage.userId)
            && Objects.equals(this.imageUri, mixUserBackgroundImage.imageUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, imageUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MixUserBackgroundImage {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
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
