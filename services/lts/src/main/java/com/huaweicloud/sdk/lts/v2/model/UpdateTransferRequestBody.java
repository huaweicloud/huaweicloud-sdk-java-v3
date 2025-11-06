package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateTransferRequestBody
 */
public class UpdateTransferRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_id")

    private String logTransferId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_info")

    private UpdateTransferRequestBodyLogTransferInfo logTransferInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_streams")

    private List<LogStreams> logStreams = null;

    public UpdateTransferRequestBody withLogTransferId(String logTransferId) {
        this.logTransferId = logTransferId;
        return this;
    }

    /**
     * 日志转储ID
     * @return logTransferId
     */
    public String getLogTransferId() {
        return logTransferId;
    }

    public void setLogTransferId(String logTransferId) {
        this.logTransferId = logTransferId;
    }

    public UpdateTransferRequestBody withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组ID
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public UpdateTransferRequestBody withLogTransferInfo(UpdateTransferRequestBodyLogTransferInfo logTransferInfo) {
        this.logTransferInfo = logTransferInfo;
        return this;
    }

    public UpdateTransferRequestBody withLogTransferInfo(
        Consumer<UpdateTransferRequestBodyLogTransferInfo> logTransferInfoSetter) {
        if (this.logTransferInfo == null) {
            this.logTransferInfo = new UpdateTransferRequestBodyLogTransferInfo();
            logTransferInfoSetter.accept(this.logTransferInfo);
        }

        return this;
    }

    /**
     * Get logTransferInfo
     * @return logTransferInfo
     */
    public UpdateTransferRequestBodyLogTransferInfo getLogTransferInfo() {
        return logTransferInfo;
    }

    public void setLogTransferInfo(UpdateTransferRequestBodyLogTransferInfo logTransferInfo) {
        this.logTransferInfo = logTransferInfo;
    }

    public UpdateTransferRequestBody withLogStreams(List<LogStreams> logStreams) {
        this.logStreams = logStreams;
        return this;
    }

    public UpdateTransferRequestBody addLogStreamsItem(LogStreams logStreamsItem) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        this.logStreams.add(logStreamsItem);
        return this;
    }

    public UpdateTransferRequestBody withLogStreams(Consumer<List<LogStreams>> logStreamsSetter) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        logStreamsSetter.accept(this.logStreams);
        return this;
    }

    /**
     * 日志流信息
     * @return logStreams
     */
    public List<LogStreams> getLogStreams() {
        return logStreams;
    }

    public void setLogStreams(List<LogStreams> logStreams) {
        this.logStreams = logStreams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTransferRequestBody that = (UpdateTransferRequestBody) obj;
        return Objects.equals(this.logTransferId, that.logTransferId)
            && Objects.equals(this.logGroupId, that.logGroupId)
            && Objects.equals(this.logTransferInfo, that.logTransferInfo)
            && Objects.equals(this.logStreams, that.logStreams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logTransferId, logGroupId, logTransferInfo, logStreams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTransferRequestBody {\n");
        sb.append("    logTransferId: ").append(toIndentedString(logTransferId)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logTransferInfo: ").append(toIndentedString(logTransferInfo)).append("\n");
        sb.append("    logStreams: ").append(toIndentedString(logStreams)).append("\n");
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
