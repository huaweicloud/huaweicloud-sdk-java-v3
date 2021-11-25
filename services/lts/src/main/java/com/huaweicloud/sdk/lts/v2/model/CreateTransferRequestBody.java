package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 创建OBS转储，DIS转储，DMS转储 */
public class CreateTransferRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_streams")

    private List<CreateTransferRequestBodyLogStreams> logStreams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_info")

    private CreateTransferRequestBodyLogTransferInfo logTransferInfo;

    public CreateTransferRequestBody withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /** 日志组ID
     * 
     * @return logGroupId */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public CreateTransferRequestBody withLogStreams(List<CreateTransferRequestBodyLogStreams> logStreams) {
        this.logStreams = logStreams;
        return this;
    }

    public CreateTransferRequestBody addLogStreamsItem(CreateTransferRequestBodyLogStreams logStreamsItem) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        this.logStreams.add(logStreamsItem);
        return this;
    }

    public CreateTransferRequestBody withLogStreams(
        Consumer<List<CreateTransferRequestBodyLogStreams>> logStreamsSetter) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        logStreamsSetter.accept(this.logStreams);
        return this;
    }

    /** 日志流ID集合
     * 
     * @return logStreams */
    public List<CreateTransferRequestBodyLogStreams> getLogStreams() {
        return logStreams;
    }

    public void setLogStreams(List<CreateTransferRequestBodyLogStreams> logStreams) {
        this.logStreams = logStreams;
    }

    public CreateTransferRequestBody withLogTransferInfo(CreateTransferRequestBodyLogTransferInfo logTransferInfo) {
        this.logTransferInfo = logTransferInfo;
        return this;
    }

    public CreateTransferRequestBody withLogTransferInfo(
        Consumer<CreateTransferRequestBodyLogTransferInfo> logTransferInfoSetter) {
        if (this.logTransferInfo == null) {
            this.logTransferInfo = new CreateTransferRequestBodyLogTransferInfo();
            logTransferInfoSetter.accept(this.logTransferInfo);
        }

        return this;
    }

    /** Get logTransferInfo
     * 
     * @return logTransferInfo */
    public CreateTransferRequestBodyLogTransferInfo getLogTransferInfo() {
        return logTransferInfo;
    }

    public void setLogTransferInfo(CreateTransferRequestBodyLogTransferInfo logTransferInfo) {
        this.logTransferInfo = logTransferInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTransferRequestBody createTransferRequestBody = (CreateTransferRequestBody) o;
        return Objects.equals(this.logGroupId, createTransferRequestBody.logGroupId)
            && Objects.equals(this.logStreams, createTransferRequestBody.logStreams)
            && Objects.equals(this.logTransferInfo, createTransferRequestBody.logTransferInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupId, logStreams, logTransferInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTransferRequestBody {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreams: ").append(toIndentedString(logStreams)).append("\n");
        sb.append("    logTransferInfo: ").append(toIndentedString(logTransferInfo)).append("\n");
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
