package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListGlobalConnectionBandwidthConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private ListGlobalConnectionBandwidthConfigs configs;

    public ListGlobalConnectionBandwidthConfigsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListGlobalConnectionBandwidthConfigsResponse withConfigs(ListGlobalConnectionBandwidthConfigs configs) {
        this.configs = configs;
        return this;
    }

    public ListGlobalConnectionBandwidthConfigsResponse withConfigs(
        Consumer<ListGlobalConnectionBandwidthConfigs> configsSetter) {
        if (this.configs == null) {
            this.configs = new ListGlobalConnectionBandwidthConfigs();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public ListGlobalConnectionBandwidthConfigs getConfigs() {
        return configs;
    }

    public void setConfigs(ListGlobalConnectionBandwidthConfigs configs) {
        this.configs = configs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalConnectionBandwidthConfigsResponse that = (ListGlobalConnectionBandwidthConfigsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalConnectionBandwidthConfigsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
