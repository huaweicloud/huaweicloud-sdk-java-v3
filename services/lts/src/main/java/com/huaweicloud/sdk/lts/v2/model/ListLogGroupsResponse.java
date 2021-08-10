package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListLogGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_groups")

    private List<LogGroup> logGroups = null;

    public ListLogGroupsResponse withLogGroups(List<LogGroup> logGroups) {
        this.logGroups = logGroups;
        return this;
    }

    public ListLogGroupsResponse addLogGroupsItem(LogGroup logGroupsItem) {
        if (this.logGroups == null) {
            this.logGroups = new ArrayList<>();
        }
        this.logGroups.add(logGroupsItem);
        return this;
    }

    public ListLogGroupsResponse withLogGroups(Consumer<List<LogGroup>> logGroupsSetter) {
        if (this.logGroups == null) {
            this.logGroups = new ArrayList<>();
        }
        logGroupsSetter.accept(this.logGroups);
        return this;
    }

    /** 日志组信息。
     * 
     * @return logGroups */
    public List<LogGroup> getLogGroups() {
        return logGroups;
    }

    public void setLogGroups(List<LogGroup> logGroups) {
        this.logGroups = logGroups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLogGroupsResponse listLogGroupsResponse = (ListLogGroupsResponse) o;
        return Objects.equals(this.logGroups, listLogGroupsResponse.logGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogGroupsResponse {\n");
        sb.append("    logGroups: ").append(toIndentedString(logGroups)).append("\n");
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
