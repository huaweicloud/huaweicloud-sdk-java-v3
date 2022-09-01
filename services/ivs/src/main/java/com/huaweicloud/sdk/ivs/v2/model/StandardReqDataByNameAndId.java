package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * StandardReqDataByNameAndId
 */
public class StandardReqDataByNameAndId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_name")

    @JacksonXmlProperty(localName = "verification_name")

    private String verificationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_id")

    @JacksonXmlProperty(localName = "verification_id")

    private String verificationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_image")

    @JacksonXmlProperty(localName = "face_image")

    private String faceImage;

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardReqDataByNameAndId standardReqDataByNameAndId = (StandardReqDataByNameAndId) o;
        return Objects.equals(this.verificationName, standardReqDataByNameAndId.verificationName)
            && Objects.equals(this.verificationId, standardReqDataByNameAndId.verificationId)
            && Objects.equals(this.faceImage, standardReqDataByNameAndId.faceImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verificationName, verificationId, faceImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardReqDataByNameAndId {\n");
        sb.append("    verificationName: ").append(toIndentedString(verificationName)).append("\n");
        sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
        sb.append("    faceImage: ").append(toIndentedString(faceImage)).append("\n");
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
