package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class InsurancePolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_direction")

    private Boolean detectDirection;

    public InsurancePolicyRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /** 图像数据，base64编码，要求base64编码后大小不超过10MB。图片最小边不小于15px，最长边不超过8192px，支持JPEG、JPG、PNG、BMP、TIFF格式。
     * 图片文件Base64编码字符串，点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)查看详细获取方式。
     * 
     * @return image */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public InsurancePolicyRequestBody withDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    /** 为Boolean类型，若不传该字段，默认不检测图像倾斜角度文字方向，为True时，会检测倾斜角度并矫正识别
     * 
     * @return detectDirection */
    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public void setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InsurancePolicyRequestBody insurancePolicyRequestBody = (InsurancePolicyRequestBody) o;
        return Objects.equals(this.image, insurancePolicyRequestBody.image)
            && Objects.equals(this.detectDirection, insurancePolicyRequestBody.detectDirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, detectDirection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsurancePolicyRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    detectDirection: ").append(toIndentedString(detectDirection)).append("\n");
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
