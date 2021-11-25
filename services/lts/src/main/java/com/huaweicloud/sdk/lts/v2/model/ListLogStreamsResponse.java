package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListLogStreamsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_streams")

    private List<ListLogStreamsResponseBody1LogStreams> logStreams = null;

    public ListLogStreamsResponse withLogStreams(List<ListLogStreamsResponseBody1LogStreams> logStreams) {
        this.logStreams = logStreams;
        return this;
    }

    public ListLogStreamsResponse addLogStreamsItem(ListLogStreamsResponseBody1LogStreams logStreamsItem) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        this.logStreams.add(logStreamsItem);
        return this;
    }

    public ListLogStreamsResponse withLogStreams(
        Consumer<List<ListLogStreamsResponseBody1LogStreams>> logStreamsSetter) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        logStreamsSetter.accept(this.logStreams);
        return this;
    }

    /** 日志流数组
     * 
     * @return logStreams */
    public List<ListLogStreamsResponseBody1LogStreams> getLogStreams() {
        return logStreams;
    }

    public void setLogStreams(List<ListLogStreamsResponseBody1LogStreams> logStreams) {
        this.logStreams = logStreams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLogStreamsResponse listLogStreamsResponse = (ListLogStreamsResponse) o;
        return Objects.equals(this.logStreams, listLogStreamsResponse.logStreams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logStreams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogStreamsResponse {\n");
        sb.append("    logStreams: ").append(toIndentedString(logStreams)).append("\n");
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
