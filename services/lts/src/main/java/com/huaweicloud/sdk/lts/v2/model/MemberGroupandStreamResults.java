package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MemberGroupandStreamResults
 */
public class MemberGroupandStreamResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_streams")

    private List<MemberGroupandStreamLogStreams> logStreams = null;

    public MemberGroupandStreamResults withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * Get logGroupId
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public MemberGroupandStreamResults withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * Get logGroupName
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public MemberGroupandStreamResults withLogStreams(List<MemberGroupandStreamLogStreams> logStreams) {
        this.logStreams = logStreams;
        return this;
    }

    public MemberGroupandStreamResults addLogStreamsItem(MemberGroupandStreamLogStreams logStreamsItem) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        this.logStreams.add(logStreamsItem);
        return this;
    }

    public MemberGroupandStreamResults withLogStreams(Consumer<List<MemberGroupandStreamLogStreams>> logStreamsSetter) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        logStreamsSetter.accept(this.logStreams);
        return this;
    }

    /**
     * Get logStreams
     * @return logStreams
     */
    public List<MemberGroupandStreamLogStreams> getLogStreams() {
        return logStreams;
    }

    public void setLogStreams(List<MemberGroupandStreamLogStreams> logStreams) {
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
        MemberGroupandStreamResults that = (MemberGroupandStreamResults) obj;
        return Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.logStreams, that.logStreams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupId, logGroupName, logStreams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberGroupandStreamResults {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
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
