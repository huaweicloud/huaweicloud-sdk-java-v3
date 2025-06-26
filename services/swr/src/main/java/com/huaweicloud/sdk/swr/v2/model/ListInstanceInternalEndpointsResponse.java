package com.huaweicloud.sdk.swr.v2.model;

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
public class ListInstanceInternalEndpointsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_endpoints")

    private List<InternalEndpoint> internalEndpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInstanceInternalEndpointsResponse withInternalEndpoints(List<InternalEndpoint> internalEndpoints) {
        this.internalEndpoints = internalEndpoints;
        return this;
    }

    public ListInstanceInternalEndpointsResponse addInternalEndpointsItem(InternalEndpoint internalEndpointsItem) {
        if (this.internalEndpoints == null) {
            this.internalEndpoints = new ArrayList<>();
        }
        this.internalEndpoints.add(internalEndpointsItem);
        return this;
    }

    public ListInstanceInternalEndpointsResponse withInternalEndpoints(
        Consumer<List<InternalEndpoint>> internalEndpointsSetter) {
        if (this.internalEndpoints == null) {
            this.internalEndpoints = new ArrayList<>();
        }
        internalEndpointsSetter.accept(this.internalEndpoints);
        return this;
    }

    /**
     * 内网访问列表
     * @return internalEndpoints
     */
    public List<InternalEndpoint> getInternalEndpoints() {
        return internalEndpoints;
    }

    public void setInternalEndpoints(List<InternalEndpoint> internalEndpoints) {
        this.internalEndpoints = internalEndpoints;
    }

    public ListInstanceInternalEndpointsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 内网访问总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceInternalEndpointsResponse that = (ListInstanceInternalEndpointsResponse) obj;
        return Objects.equals(this.internalEndpoints, that.internalEndpoints) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internalEndpoints, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceInternalEndpointsResponse {\n");
        sb.append("    internalEndpoints: ").append(toIndentedString(internalEndpoints)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
