package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ChangeEwProtectStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private SuccessRspData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    public ChangeEwProtectStatusResponse withData(SuccessRspData data) {
        this.data = data;
        return this;
    }

    public ChangeEwProtectStatusResponse withData(Consumer<SuccessRspData> dataSetter) {
        if (this.data == null) {
            this.data = new SuccessRspData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public SuccessRspData getData() {
        return data;
    }

    public void setData(SuccessRspData data) {
        this.data = data;
    }

    public ChangeEwProtectStatusResponse withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * trace id
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeEwProtectStatusResponse that = (ChangeEwProtectStatusResponse) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.traceId, that.traceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, traceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeEwProtectStatusResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
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
