package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RunImageMainObjectDetectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private List<ImageMainObjectDetectionInstance> result = null;

    public RunImageMainObjectDetectionResponse withResult(List<ImageMainObjectDetectionInstance> result) {
        this.result = result;
        return this;
    }

    public RunImageMainObjectDetectionResponse addResultItem(ImageMainObjectDetectionInstance resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public RunImageMainObjectDetectionResponse withResult(
        Consumer<List<ImageMainObjectDetectionInstance>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 主体列表集合。
     * @return result
     */
    public List<ImageMainObjectDetectionInstance> getResult() {
        return result;
    }

    public void setResult(List<ImageMainObjectDetectionInstance> result) {
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
        RunImageMainObjectDetectionResponse runImageMainObjectDetectionResponse =
            (RunImageMainObjectDetectionResponse) o;
        return Objects.equals(this.result, runImageMainObjectDetectionResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunImageMainObjectDetectionResponse {\n");
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
