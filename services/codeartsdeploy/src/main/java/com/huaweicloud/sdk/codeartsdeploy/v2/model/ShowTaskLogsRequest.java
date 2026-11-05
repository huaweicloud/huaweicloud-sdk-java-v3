package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTaskLogsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_offset")

    private String endOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_id")

    private String stepId;

    public ShowTaskLogsRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowTaskLogsRequest withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * 部署记录id
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public ShowTaskLogsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 起始位置，默认0；长度1-19
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ShowTaskLogsRequest withEndOffset(String endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * 结束位置，开始为0；长度1-19
     * @return endOffset
     */
    public String getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(String endOffset) {
        this.endOffset = endOffset;
    }

    public ShowTaskLogsRequest withStepId(String stepId) {
        this.stepId = stepId;
        return this;
    }

    /**
     * 步骤id；如果传，则按step查询日志；长度1-60
     * @return stepId
     */
    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskLogsRequest that = (ShowTaskLogsRequest) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.recordId, that.recordId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.endOffset, that.endOffset)
            && Objects.equals(this.stepId, that.stepId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, recordId, offset, endOffset, stepId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskLogsRequest {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    endOffset: ").append(toIndentedString(endOffset)).append("\n");
        sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
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
