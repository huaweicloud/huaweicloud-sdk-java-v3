package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CreateTransferRequestBodyLogStreams */
public class CreateTransferRequestBodyLogStreams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    public CreateTransferRequestBodyLogStreams withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /** 日志流ID
     * 
     * @return logStreamId */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTransferRequestBodyLogStreams createTransferRequestBodyLogStreams =
            (CreateTransferRequestBodyLogStreams) o;
        return Objects.equals(this.logStreamId, createTransferRequestBodyLogStreams.logStreamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logStreamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTransferRequestBodyLogStreams {\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
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
