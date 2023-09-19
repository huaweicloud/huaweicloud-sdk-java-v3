package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用于制作数字人名片的图片下载URL。
 */
public class BusinessCardImageUrl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_image_url")

    private String humanImageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_image")

    private String logoImage;

    public BusinessCardImageUrl withHumanImageUrl(String humanImageUrl) {
        this.humanImageUrl = humanImageUrl;
        return this;
    }

    /**
     * 任务照片下载URL。
     * @return humanImageUrl
     */
    public String getHumanImageUrl() {
        return humanImageUrl;
    }

    public void setHumanImageUrl(String humanImageUrl) {
        this.humanImageUrl = humanImageUrl;
    }

    public BusinessCardImageUrl withLogoImage(String logoImage) {
        this.logoImage = logoImage;
        return this;
    }

    /**
     * Logo图片下载URL。
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
        BusinessCardImageUrl that = (BusinessCardImageUrl) obj;
        return Objects.equals(this.humanImageUrl, that.humanImageUrl) && Objects.equals(this.logoImage, that.logoImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanImageUrl, logoImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessCardImageUrl {\n");
        sb.append("    humanImageUrl: ").append(toIndentedString(humanImageUrl)).append("\n");
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
