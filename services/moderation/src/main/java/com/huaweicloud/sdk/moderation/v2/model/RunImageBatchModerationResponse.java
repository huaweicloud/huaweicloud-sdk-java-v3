package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class RunImageBatchModerationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<ImageBatchModerationResultBody> result = null;

    public RunImageBatchModerationResponse withResult(List<ImageBatchModerationResultBody> result) {
        this.result = result;
        return this;
    }

    public RunImageBatchModerationResponse addResultItem(ImageBatchModerationResultBody resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public RunImageBatchModerationResponse withResult(Consumer<List<ImageBatchModerationResultBody>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /** 调用成功时表示调用结果。 调用失败时无此字段。
     * 
     * @return result */
    public List<ImageBatchModerationResultBody> getResult() {
        return result;
    }

    public void setResult(List<ImageBatchModerationResultBody> result) {
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
        RunImageBatchModerationResponse runImageBatchModerationResponse = (RunImageBatchModerationResponse) o;
        return Objects.equals(this.result, runImageBatchModerationResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunImageBatchModerationResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
