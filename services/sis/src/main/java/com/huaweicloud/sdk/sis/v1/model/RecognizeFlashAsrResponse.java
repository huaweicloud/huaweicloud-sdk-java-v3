package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RecognizeFlashAsrResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_duration")

    private Integer audioDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flash_result")

    private List<FlashResult> flashResult = null;

    public RecognizeFlashAsrResponse withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * 服务内部的令牌，可用于在日志中追溯具体调用流程
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public RecognizeFlashAsrResponse withAudioDuration(Integer audioDuration) {
        this.audioDuration = audioDuration;
        return this;
    }

    /**
     * 音频时长
     * @return audioDuration
     */
    public Integer getAudioDuration() {
        return audioDuration;
    }

    public void setAudioDuration(Integer audioDuration) {
        this.audioDuration = audioDuration;
    }

    public RecognizeFlashAsrResponse withFlashResult(List<FlashResult> flashResult) {
        this.flashResult = flashResult;
        return this;
    }

    public RecognizeFlashAsrResponse addFlashResultItem(FlashResult flashResultItem) {
        if (this.flashResult == null) {
            this.flashResult = new ArrayList<>();
        }
        this.flashResult.add(flashResultItem);
        return this;
    }

    public RecognizeFlashAsrResponse withFlashResult(Consumer<List<FlashResult>> flashResultSetter) {
        if (this.flashResult == null) {
            this.flashResult = new ArrayList<>();
        }
        flashResultSetter.accept(this.flashResult);
        return this;
    }

    /**
     * 识别结果
     * @return flashResult
     */
    public List<FlashResult> getFlashResult() {
        return flashResult;
    }

    public void setFlashResult(List<FlashResult> flashResult) {
        this.flashResult = flashResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecognizeFlashAsrResponse that = (RecognizeFlashAsrResponse) obj;
        return Objects.equals(this.traceId, that.traceId) && Objects.equals(this.audioDuration, that.audioDuration)
            && Objects.equals(this.flashResult, that.flashResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traceId, audioDuration, flashResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeFlashAsrResponse {\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    audioDuration: ").append(toIndentedString(audioDuration)).append("\n");
        sb.append("    flashResult: ").append(toIndentedString(flashResult)).append("\n");
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
