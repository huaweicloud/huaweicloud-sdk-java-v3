package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReqDataByIdCardImage
 */
public class ReqDataByIdCardImage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_image1")

    private String idcardImage1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_image2")

    private String idcardImage2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_image")

    private String faceImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private Boolean detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crop")

    private Boolean crop;

    public ReqDataByIdCardImage withIdcardImage1(String idcardImage1) {
        this.idcardImage1 = idcardImage1;
        return this;
    }

    /**
     * 身份证人像面图像数据，使用base64编码，要求base64编码后大小不超过4M。图像各边的像素大小在300到4000之间，支持JPG格式。
     * @return idcardImage1
     */
    public String getIdcardImage1() {
        return idcardImage1;
    }

    public void setIdcardImage1(String idcardImage1) {
        this.idcardImage1 = idcardImage1;
    }

    public ReqDataByIdCardImage withIdcardImage2(String idcardImage2) {
        this.idcardImage2 = idcardImage2;
        return this;
    }

    /**
     * 身份证国徽面图像数据，使用base64编码，要求base64编码后大小不超过4M。图像各边的像素大小在300到4000之间，支持JPG格式。
     * @return idcardImage2
     */
    public String getIdcardImage2() {
        return idcardImage2;
    }

    public void setIdcardImage2(String idcardImage2) {
        this.idcardImage2 = idcardImage2;
    }

    public ReqDataByIdCardImage withFaceImage(String faceImage) {
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

    public ReqDataByIdCardImage withDetail(Boolean detail) {
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

    public ReqDataByIdCardImage withCrop(Boolean crop) {
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
        ReqDataByIdCardImage that = (ReqDataByIdCardImage) obj;
        return Objects.equals(this.idcardImage1, that.idcardImage1)
            && Objects.equals(this.idcardImage2, that.idcardImage2) && Objects.equals(this.faceImage, that.faceImage)
            && Objects.equals(this.detail, that.detail) && Objects.equals(this.crop, that.crop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcardImage1, idcardImage2, faceImage, detail, crop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqDataByIdCardImage {\n");
        sb.append("    idcardImage1: ").append(toIndentedString(idcardImage1)).append("\n");
        sb.append("    idcardImage2: ").append(toIndentedString(idcardImage2)).append("\n");
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
