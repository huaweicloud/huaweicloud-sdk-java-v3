package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BindGlobalEipsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eips")

    private ListBindingGeip globalEips;

    public BindGlobalEipsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public BindGlobalEipsResponse withGlobalEips(ListBindingGeip globalEips) {
        this.globalEips = globalEips;
        return this;
    }

    public BindGlobalEipsResponse withGlobalEips(Consumer<ListBindingGeip> globalEipsSetter) {
        if (this.globalEips == null) {
            this.globalEips = new ListBindingGeip();
            globalEipsSetter.accept(this.globalEips);
        }

        return this;
    }

    /**
     * Get globalEips
     * @return globalEips
     */
    public ListBindingGeip getGlobalEips() {
        return globalEips;
    }

    public void setGlobalEips(ListBindingGeip globalEips) {
        this.globalEips = globalEips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindGlobalEipsResponse that = (BindGlobalEipsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.globalEips, that.globalEips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, globalEips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindGlobalEipsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    globalEips: ").append(toIndentedString(globalEips)).append("\n");
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
