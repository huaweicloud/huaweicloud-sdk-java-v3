package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListProjectGeipBindingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geip_bindings")

    private List<GeipBindingsInternalResp> geipBindings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListProjectGeipBindingsResponse withGeipBindings(List<GeipBindingsInternalResp> geipBindings) {
        this.geipBindings = geipBindings;
        return this;
    }

    public ListProjectGeipBindingsResponse addGeipBindingsItem(GeipBindingsInternalResp geipBindingsItem) {
        if (this.geipBindings == null) {
            this.geipBindings = new ArrayList<>();
        }
        this.geipBindings.add(geipBindingsItem);
        return this;
    }

    public ListProjectGeipBindingsResponse withGeipBindings(
        Consumer<List<GeipBindingsInternalResp>> geipBindingsSetter) {
        if (this.geipBindings == null) {
            this.geipBindings = new ArrayList<>();
        }
        geipBindingsSetter.accept(this.geipBindings);
        return this;
    }

    /**
     * geip绑定关系对象
     * @return geipBindings
     */
    public List<GeipBindingsInternalResp> getGeipBindings() {
        return geipBindings;
    }

    public void setGeipBindings(List<GeipBindingsInternalResp> geipBindings) {
        this.geipBindings = geipBindings;
    }

    public ListProjectGeipBindingsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectGeipBindingsResponse that = (ListProjectGeipBindingsResponse) obj;
        return Objects.equals(this.geipBindings, that.geipBindings) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(geipBindings, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectGeipBindingsResponse {\n");
        sb.append("    geipBindings: ").append(toIndentedString(geipBindings)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
