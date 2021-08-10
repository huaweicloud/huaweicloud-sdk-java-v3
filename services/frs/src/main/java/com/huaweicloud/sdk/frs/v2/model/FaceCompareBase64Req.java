package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** FaceCompareBase64Req */
public class FaceCompareBase64Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image2_base64")

    private String image2Base64;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image1_base64")

    private String image1Base64;

    public FaceCompareBase64Req withImage2Base64(String image2Base64) {
        this.image2Base64 = image2Base64;
        return this;
    }

    /** 图像数据，Base64编码，要求： • Base64编码后大小不超过8MB，建议小于1MB。 • 图片为JPG/JPEG/BMP/PNG格式。
     * 
     * @return image2Base64 */
    public String getImage2Base64() {
        return image2Base64;
    }

    public void setImage2Base64(String image2Base64) {
        this.image2Base64 = image2Base64;
    }

    public FaceCompareBase64Req withImage1Base64(String image1Base64) {
        this.image1Base64 = image1Base64;
        return this;
    }

    /** 图像数据，Base64编码，要求： • Base64编码后大小不超过8MB，建议小于1MB。 • 图片为JPG/JPEG/BMP/PNG格式。
     * 
     * @return image1Base64 */
    public String getImage1Base64() {
        return image1Base64;
    }

    public void setImage1Base64(String image1Base64) {
        this.image1Base64 = image1Base64;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FaceCompareBase64Req faceCompareBase64Req = (FaceCompareBase64Req) o;
        return Objects.equals(this.image2Base64, faceCompareBase64Req.image2Base64)
            && Objects.equals(this.image1Base64, faceCompareBase64Req.image1Base64);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image2Base64, image1Base64);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaceCompareBase64Req {\n");
        sb.append("    image2Base64: ").append(toIndentedString(image2Base64)).append("\n");
        sb.append("    image1Base64: ").append(toIndentedString(image1Base64)).append("\n");
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
