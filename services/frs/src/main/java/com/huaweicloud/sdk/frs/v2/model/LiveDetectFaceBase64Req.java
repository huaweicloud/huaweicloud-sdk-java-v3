package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * LiveDetectFaceBase64Req
 */
public class LiveDetectFaceBase64Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_base64")

    @JacksonXmlProperty(localName = "image_base64")

    private String imageBase64;

    public LiveDetectFaceBase64Req withImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }

    /**
     * 图像数据，Base64编码，要求： • Base64编码后大小不超过8MB。 • 图片编码格式： JPG、PNG、JPEG、BMP格式的图片。
     * @return imageBase64
     */
    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveDetectFaceBase64Req liveDetectFaceBase64Req = (LiveDetectFaceBase64Req) o;
        return Objects.equals(this.imageBase64, liveDetectFaceBase64Req.imageBase64);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageBase64);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveDetectFaceBase64Req {\n");
        sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
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
