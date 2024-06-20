package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowPipelineLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_more")

    private Boolean hasMore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_offset")

    private String endOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_offset")

    private String startOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    private String log;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_run_id")

    private String stepRunId;

    public ShowPipelineLogResponse withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * 是否有更多日志
     * @return hasMore
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public ShowPipelineLogResponse withEndOffset(String endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * 查询日志结束偏移。填入请求体end_offset字段，用于查询下一页日志。
     * @return endOffset
     */
    public String getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(String endOffset) {
        this.endOffset = endOffset;
    }

    public ShowPipelineLogResponse withStartOffset(String startOffset) {
        this.startOffset = startOffset;
        return this;
    }

    /**
     * 查询日志起始偏移。填入请求体start_offset字段，用于查询下一页日志。
     * @return startOffset
     */
    public String getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(String startOffset) {
        this.startOffset = startOffset;
    }

    public ShowPipelineLogResponse withLog(String log) {
        this.log = log;
        return this;
    }

    /**
     * 日志内容
     * @return log
     */
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public ShowPipelineLogResponse withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 日志存储位置
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ShowPipelineLogResponse withStepRunId(String stepRunId) {
        this.stepRunId = stepRunId;
        return this;
    }

    /**
     * 所属步骤ID
     * @return stepRunId
     */
    public String getStepRunId() {
        return stepRunId;
    }

    public void setStepRunId(String stepRunId) {
        this.stepRunId = stepRunId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPipelineLogResponse that = (ShowPipelineLogResponse) obj;
        return Objects.equals(this.hasMore, that.hasMore) && Objects.equals(this.endOffset, that.endOffset)
            && Objects.equals(this.startOffset, that.startOffset) && Objects.equals(this.log, that.log)
            && Objects.equals(this.location, that.location) && Objects.equals(this.stepRunId, that.stepRunId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasMore, endOffset, startOffset, log, location, stepRunId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPipelineLogResponse {\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
        sb.append("    endOffset: ").append(toIndentedString(endOffset)).append("\n");
        sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    stepRunId: ").append(toIndentedString(stepRunId)).append("\n");
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
