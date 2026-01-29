package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LtsResponseVoLtsInfos
 */
public class LtsResponseVoLtsInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streams")

    private List<LtsResponseVoStreams> streams = null;

    public LtsResponseVoLtsInfos withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组id
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public LtsResponseVoLtsInfos withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * 组名称
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public LtsResponseVoLtsInfos withStreams(List<LtsResponseVoStreams> streams) {
        this.streams = streams;
        return this;
    }

    public LtsResponseVoLtsInfos addStreamsItem(LtsResponseVoStreams streamsItem) {
        if (this.streams == null) {
            this.streams = new ArrayList<>();
        }
        this.streams.add(streamsItem);
        return this;
    }

    public LtsResponseVoLtsInfos withStreams(Consumer<List<LtsResponseVoStreams>> streamsSetter) {
        if (this.streams == null) {
            this.streams = new ArrayList<>();
        }
        streamsSetter.accept(this.streams);
        return this;
    }

    /**
     * 流列表
     * @return streams
     */
    public List<LtsResponseVoStreams> getStreams() {
        return streams;
    }

    public void setStreams(List<LtsResponseVoStreams> streams) {
        this.streams = streams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsResponseVoLtsInfos that = (LtsResponseVoLtsInfos) obj;
        return Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.streams, that.streams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupId, logGroupName, streams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsResponseVoLtsInfos {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
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
