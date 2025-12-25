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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_card_image1")

    private String idCardImage1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_card_image2")

    private String idCardImage2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorize_use_human_image")

    private Boolean authorizeUseHumanImage;

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

    public BusinessCardImageConfig withIdCardImage1(String idCardImage1) {
        this.idCardImage1 = idCardImage1;
        return this;
    }

    /**
     * 身份证国徽面照片，需要Base64编码。
     * @return idCardImage1
     */
    public String getIdCardImage1() {
        return idCardImage1;
    }

    public void setIdCardImage1(String idCardImage1) {
        this.idCardImage1 = idCardImage1;
    }

    public BusinessCardImageConfig withIdCardImage2(String idCardImage2) {
        this.idCardImage2 = idCardImage2;
        return this;
    }

    /**
     * 身份证人像面照片，需要Base64编码。
     * @return idCardImage2
     */
    public String getIdCardImage2() {
        return idCardImage2;
    }

    public void setIdCardImage2(String idCardImage2) {
        this.idCardImage2 = idCardImage2;
    }

    public BusinessCardImageConfig withAuthorizeUseHumanImage(Boolean authorizeUseHumanImage) {
        this.authorizeUseHumanImage = authorizeUseHumanImage;
        return this;
    }

    /**
     * 授权使用照片
     * @return authorizeUseHumanImage
     */
    public Boolean getAuthorizeUseHumanImage() {
        return authorizeUseHumanImage;
    }

    public void setAuthorizeUseHumanImage(Boolean authorizeUseHumanImage) {
        this.authorizeUseHumanImage = authorizeUseHumanImage;
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
        return Objects.equals(this.humanImage, that.humanImage) && Objects.equals(this.logoImage, that.logoImage)
            && Objects.equals(this.idCardImage1, that.idCardImage1)
            && Objects.equals(this.idCardImage2, that.idCardImage2)
            && Objects.equals(this.authorizeUseHumanImage, that.authorizeUseHumanImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanImage, logoImage, idCardImage1, idCardImage2, authorizeUseHumanImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessCardImageConfig {\n");
        sb.append("    humanImage: ").append(toIndentedString(humanImage)).append("\n");
        sb.append("    logoImage: ").append(toIndentedString(logoImage)).append("\n");
        sb.append("    idCardImage1: ").append(toIndentedString(idCardImage1)).append("\n");
        sb.append("    idCardImage2: ").append(toIndentedString(idCardImage2)).append("\n");
        sb.append("    authorizeUseHumanImage: ").append(toIndentedString(authorizeUseHumanImage)).append("\n");
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
