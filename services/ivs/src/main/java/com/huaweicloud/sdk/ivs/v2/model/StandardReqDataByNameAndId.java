package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StandardReqDataByNameAndId
 */
public class StandardReqDataByNameAndId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_name")

    private String verificationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_id")

    private String verificationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_image")

    private String faceImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private Boolean detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crop")

    private Boolean crop;

    public StandardReqDataByNameAndId withVerificationName(String verificationName) {
        this.verificationName = verificationName;
        return this;
    }

    /**
     * 被验证人的姓名。
     * @return verificationName
     */
    public String getVerificationName() {
        return verificationName;
    }

    public void setVerificationName(String verificationName) {
        this.verificationName = verificationName;
    }

    public StandardReqDataByNameAndId withVerificationId(String verificationId) {
        this.verificationId = verificationId;
        return this;
    }

    /**
     * 被验证人的身份证号码。
     * @return verificationId
     */
    public String getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    public StandardReqDataByNameAndId withFaceImage(String faceImage) {
        this.faceImage = faceImage;
        return this;
    }

    /**
     * 现场人像图像数据，使用base64编码，要求base64编码后大小不超过4M。图像各边的像素大小在300到4000之间，支持JPG格式。
     * @return faceImage
     */
    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    public StandardReqDataByNameAndId withDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 响应参数similarity是否详细显示，默认为false。 - true表示响应中的similarity为0~1000的小数。 - false表示响应中的similarity为0~100的整数。
     * @return detail
     */
    public Boolean getDetail() {
        return detail;
    }

    public void setDetail(Boolean detail) {
        this.detail = detail;
    }

    public StandardReqDataByNameAndId withCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }

    /**
     * 是否允许对入参face_image进行人脸检测及图片裁剪，默认为true，表示允许。
     * @return crop
     */
    public Boolean getCrop() {
        return crop;
    }

    public void setCrop(Boolean crop) {
        this.crop = crop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StandardReqDataByNameAndId that = (StandardReqDataByNameAndId) obj;
        return Objects.equals(this.verificationName, that.verificationName)
            && Objects.equals(this.verificationId, that.verificationId)
            && Objects.equals(this.faceImage, that.faceImage) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.crop, that.crop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verificationName, verificationId, faceImage, detail, crop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardReqDataByNameAndId {\n");
        sb.append("    verificationName: ").append(toIndentedString(verificationName)).append("\n");
        sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
        sb.append("    faceImage: ").append(toIndentedString(faceImage)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    crop: ").append(toIndentedString(crop)).append("\n");
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
