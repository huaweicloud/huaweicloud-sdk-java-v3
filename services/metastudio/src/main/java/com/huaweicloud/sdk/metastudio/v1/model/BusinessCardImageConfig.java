package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户上传的用于制作数字人名片的图片。
 */
public class BusinessCardImageConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_image")

    private String humanImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_image")

    private String logoImage;

    public BusinessCardImageConfig withHumanImage(String humanImage) {
        this.humanImage = humanImage;
        return this;
    }

    /**
     * 人物照片，需要Base64编码。
     * @return humanImage
     */
    public String getHumanImage() {
        return humanImage;
    }

    public void setHumanImage(String humanImage) {
        this.humanImage = humanImage;
    }

    public BusinessCardImageConfig withLogoImage(String logoImage) {
        this.logoImage = logoImage;
        return this;
    }

    /**
     * Logo图片，需要Base64编码。
     * @return logoImage
     */
    public String getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusinessCardImageConfig that = (BusinessCardImageConfig) obj;
        return Objects.equals(this.humanImage, that.humanImage) && Objects.equals(this.logoImage, that.logoImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanImage, logoImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessCardImageConfig {\n");
        sb.append("    humanImage: ").append(toIndentedString(humanImage)).append("\n");
        sb.append("    logoImage: ").append(toIndentedString(logoImage)).append("\n");
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
