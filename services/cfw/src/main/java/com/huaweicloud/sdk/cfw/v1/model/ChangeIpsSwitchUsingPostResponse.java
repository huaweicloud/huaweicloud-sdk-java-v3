package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ChangeIpsSwitchUsingPostResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private CommonResponseDTOData data;

    public ChangeIpsSwitchUsingPostResponse withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * trace_id
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public ChangeIpsSwitchUsingPostResponse withData(CommonResponseDTOData data) {
        this.data = data;
        return this;
    }

    public ChangeIpsSwitchUsingPostResponse withData(Consumer<CommonResponseDTOData> dataSetter) {
        if (this.data == null) {
            this.data = new CommonResponseDTOData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public CommonResponseDTOData getData() {
        return data;
    }

    public void setData(CommonResponseDTOData data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeIpsSwitchUsingPostResponse changeIpsSwitchUsingPostResponse = (ChangeIpsSwitchUsingPostResponse) o;
        return Objects.equals(this.traceId, changeIpsSwitchUsingPostResponse.traceId)
            && Objects.equals(this.data, changeIpsSwitchUsingPostResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traceId, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeIpsSwitchUsingPostResponse {\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
