package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RecognizeShortAudioResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    @JacksonXmlProperty(localName = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private Result result;

    public RecognizeShortAudioResponse withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * 服务内部的令牌，可用于在日志中追溯具体流程，调用失败无此字段。  在某些错误情况下可能没有此令牌字符串。
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public RecognizeShortAudioResponse withResult(Result result) {
        this.result = result;
        return this;
    }

    public RecognizeShortAudioResponse withResult(Consumer<Result> resultSetter) {
        if (this.result == null) {
            this.result = new Result();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
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
        RecognizeShortAudioResponse recognizeShortAudioResponse = (RecognizeShortAudioResponse) o;
        return Objects.equals(this.traceId, recognizeShortAudioResponse.traceId)
            && Objects.equals(this.result, recognizeShortAudioResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traceId, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeShortAudioResponse {\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
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
