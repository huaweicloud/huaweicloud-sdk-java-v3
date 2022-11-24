package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 原域名所有配置
 */
public class BatchCopyErrorRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private BatchCopyErrorRspError error;

    public BatchCopyErrorRsp withError(BatchCopyErrorRspError error) {
        this.error = error;
        return this;
    }

    public BatchCopyErrorRsp withError(Consumer<BatchCopyErrorRspError> errorSetter) {
        if (this.error == null) {
            this.error = new BatchCopyErrorRspError();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public BatchCopyErrorRspError getError() {
        return error;
    }

    public void setError(BatchCopyErrorRspError error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCopyErrorRsp batchCopyErrorRsp = (BatchCopyErrorRsp) o;
        return Objects.equals(this.error, batchCopyErrorRsp.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCopyErrorRsp {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
