package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** FaceDetectBase64Req */
public class FaceDetectBase64Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_base64")

    private String imageBase64;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private String attributes;

    public FaceDetectBase64Req withImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }

    /** 图像数据，Base64编码，要求： • Base64编码后大小不超过8MB，建议小于1MB。 • 图片为JPG/JPEG/BMP/PNG格式。
     * 
     * @return imageBase64 */
    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public FaceDetectBase64Req withAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }

    /** 是否返回人脸属性，希望获取的属性列表，多个属性间使用逗号（,）隔开。目前支持的属性有： • 1：性别 • 2：年龄 • 4：装束（帽子、眼镜） • 6：口罩 • 7：发型 • 8：胡须 • 9：肤色 • 10：民族 •
     * 11：图片类型 • 12：质量 • 13：表情 • 21：人脸图片旋转角（顺时针偏转角度），支持0°、90°、180°和270°图片旋转
     * 
     * @return attributes */
    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FaceDetectBase64Req faceDetectBase64Req = (FaceDetectBase64Req) o;
        return Objects.equals(this.imageBase64, faceDetectBase64Req.imageBase64)
            && Objects.equals(this.attributes, faceDetectBase64Req.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageBase64, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaceDetectBase64Req {\n");
        sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
