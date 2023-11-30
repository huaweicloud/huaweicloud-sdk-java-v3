package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PutRecordsRequest
 */
public class PutRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<PutRecordsRequestEntry> records = null;

    public PutRecordsRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 已创建的通道名称。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public PutRecordsRequest withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * 通道唯一标识符。  当使用stream_name没有找到对应通道且stream_id不为空时，会使用stream_id去查找通道。  说明：  上传数据到被授权的通道时，必须配置此参数。
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public PutRecordsRequest withRecords(List<PutRecordsRequestEntry> records) {
        this.records = records;
        return this;
    }

    public PutRecordsRequest addRecordsItem(PutRecordsRequestEntry recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public PutRecordsRequest withRecords(Consumer<List<PutRecordsRequestEntry>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 待上传的记录列表。
     * @return records
     */
    public List<PutRecordsRequestEntry> getRecords() {
        return records;
    }

    public void setRecords(List<PutRecordsRequestEntry> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutRecordsRequest that = (PutRecordsRequest) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.streamId, that.streamId)
            && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, streamId, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutRecordsRequest {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
