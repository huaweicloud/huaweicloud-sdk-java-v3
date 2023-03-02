package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RunImageWisedesignCombineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_base64")

    private String resultBase64;

    public RunImageWisedesignCombineResponse withResultBase64(String resultBase64) {
        this.resultBase64 = resultBase64;
        return this;
    }

    /**
     * 图片合成后图像的64位编码
     * @return resultBase64
     */
    public String getResultBase64() {
        return resultBase64;
    }

    public void setResultBase64(String resultBase64) {
        this.resultBase64 = resultBase64;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunImageWisedesignCombineResponse runImageWisedesignCombineResponse = (RunImageWisedesignCombineResponse) o;
        return Objects.equals(this.resultBase64, runImageWisedesignCombineResponse.resultBase64);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultBase64);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunImageWisedesignCombineResponse {\n");
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
