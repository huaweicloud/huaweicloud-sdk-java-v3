package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 图像超分结果信息
 */
public class ImageSuperResolutionResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_base64")

    private String resultBase64;

    public ImageSuperResolutionResponseResult withResultBase64(String resultBase64) {
        this.resultBase64 = resultBase64;
        return this;
    }

    /**
     * 超分结果图片的base64码
     * @return resultBase64
     */
    public String getResultBase64() {
        return resultBase64;
    }

    public void setResultBase64(String resultBase64) {
        this.resultBase64 = resultBase64;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageSuperResolutionResponseResult that = (ImageSuperResolutionResponseResult) obj;
        return Objects.equals(this.resultBase64, that.resultBase64);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultBase64);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageSuperResolutionResponseResult {\n");
        sb.append("    resultBase64: ").append(toIndentedString(resultBase64)).append("\n");
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
