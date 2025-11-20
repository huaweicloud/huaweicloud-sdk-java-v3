package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TranscodeDetailInfo
 */
public class TranscodeDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private String template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_rate_format")

    private String codeRateFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    public TranscodeDetailInfo withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 流名
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public TranscodeDetailInfo withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * 转码模板
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public TranscodeDetailInfo withCodeRateFormat(String codeRateFormat) {
        this.codeRateFormat = codeRateFormat;
        return this;
    }

    /**
     * 转码格式（H264/H265）
     * @return codeRateFormat
     */
    public String getCodeRateFormat() {
        return codeRateFormat;
    }

    public void setCodeRateFormat(String codeRateFormat) {
        this.codeRateFormat = codeRateFormat;
    }

    public TranscodeDetailInfo withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 转码时长
     * minimum: 0
     * maximum: 1844674407
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TranscodeDetailInfo that = (TranscodeDetailInfo) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.template, that.template)
            && Objects.equals(this.codeRateFormat, that.codeRateFormat) && Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, template, codeRateFormat, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscodeDetailInfo {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    codeRateFormat: ").append(toIndentedString(codeRateFormat)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
