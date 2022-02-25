package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListLogsJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterLogRecord")

    private List<ClusterLogRecord> clusterLogRecord = null;

    public ListLogsJobResponse withClusterLogRecord(List<ClusterLogRecord> clusterLogRecord) {
        this.clusterLogRecord = clusterLogRecord;
        return this;
    }

    public ListLogsJobResponse addClusterLogRecordItem(ClusterLogRecord clusterLogRecordItem) {
        if (this.clusterLogRecord == null) {
            this.clusterLogRecord = new ArrayList<>();
        }
        this.clusterLogRecord.add(clusterLogRecordItem);
        return this;
    }

    public ListLogsJobResponse withClusterLogRecord(Consumer<List<ClusterLogRecord>> clusterLogRecordSetter) {
        if (this.clusterLogRecord == null) {
            this.clusterLogRecord = new ArrayList<>();
        }
        clusterLogRecordSetter.accept(this.clusterLogRecord);
        return this;
    }

    /** Get clusterLogRecord
     * 
     * @return clusterLogRecord */
    public List<ClusterLogRecord> getClusterLogRecord() {
        return clusterLogRecord;
    }

    public void setClusterLogRecord(List<ClusterLogRecord> clusterLogRecord) {
        this.clusterLogRecord = clusterLogRecord;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLogsJobResponse listLogsJobResponse = (ListLogsJobResponse) o;
        return Objects.equals(this.clusterLogRecord, listLogsJobResponse.clusterLogRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterLogRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogsJobResponse {\n");
        sb.append("    clusterLogRecord: ").append(toIndentedString(clusterLogRecord)).append("\n");
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
