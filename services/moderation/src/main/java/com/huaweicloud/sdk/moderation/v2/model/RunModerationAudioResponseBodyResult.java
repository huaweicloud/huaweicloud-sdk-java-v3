package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 调用成功时表示调用结果。 调用失败时无此字段。 */
public class RunModerationAudioResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private RunModerationAudioResponseBodyResultDetail detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    public RunModerationAudioResponseBodyResult withDetail(RunModerationAudioResponseBodyResultDetail detail) {
        this.detail = detail;
        return this;
    }

    public RunModerationAudioResponseBodyResult withDetail(
        Consumer<RunModerationAudioResponseBodyResultDetail> detailSetter) {
        if (this.detail == null) {
            this.detail = new RunModerationAudioResponseBodyResultDetail();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /** Get detail
     * 
     * @return detail */
    public RunModerationAudioResponseBodyResultDetail getDetail() {
        return detail;
    }

    public void setDetail(RunModerationAudioResponseBodyResultDetail detail) {
        this.detail = detail;
    }

    public RunModerationAudioResponseBodyResult withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /** 检测结果是否通过。 block：包含敏感信息，不通过。 pass：不包含敏感信息，通过。 review：需要人工复查
     * 
     * @return suggestion */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunModerationAudioResponseBodyResult runModerationAudioResponseBodyResult =
            (RunModerationAudioResponseBodyResult) o;
        return Objects.equals(this.detail, runModerationAudioResponseBodyResult.detail)
            && Objects.equals(this.suggestion, runModerationAudioResponseBodyResult.suggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail, suggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunModerationAudioResponseBodyResult {\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
