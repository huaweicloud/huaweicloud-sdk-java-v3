package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RunImageWisedesignCropResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ImageWisedesignCropResponseResult result;

    public RunImageWisedesignCropResponse withResult(ImageWisedesignCropResponseResult result) {
        this.result = result;
        return this;
    }

    public RunImageWisedesignCropResponse withResult(Consumer<ImageWisedesignCropResponseResult> resultSetter) {
        if (this.result == null) {
            this.result = new ImageWisedesignCropResponseResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public ImageWisedesignCropResponseResult getResult() {
        return result;
    }

    public void setResult(ImageWisedesignCropResponseResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunImageWisedesignCropResponse runImageWisedesignCropResponse = (RunImageWisedesignCropResponse) o;
        return Objects.equals(this.result, runImageWisedesignCropResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunImageWisedesignCropResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
