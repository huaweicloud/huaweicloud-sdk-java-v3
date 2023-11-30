package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchStopTransferTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchStopTransferTaskReq body;

    public BatchStopTransferTaskRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 需要查询的通道名称。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public BatchStopTransferTaskRequest withBody(BatchStopTransferTaskReq body) {
        this.body = body;
        return this;
    }

    public BatchStopTransferTaskRequest withBody(Consumer<BatchStopTransferTaskReq> bodySetter) {
        if (this.body == null) {
            this.body = new BatchStopTransferTaskReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchStopTransferTaskReq getBody() {
        return body;
    }

    public void setBody(BatchStopTransferTaskReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchStopTransferTaskRequest that = (BatchStopTransferTaskRequest) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStopTransferTaskRequest {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
