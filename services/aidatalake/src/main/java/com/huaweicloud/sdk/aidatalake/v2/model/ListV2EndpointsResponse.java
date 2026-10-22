package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ListV2EndpointsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<V2EndpointBriefInfo> endpoints = null;

    public ListV2EndpointsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：总记录数。 **取值范围**：不涉及。 
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListV2EndpointsResponse withEndpoints(List<V2EndpointBriefInfo> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ListV2EndpointsResponse addEndpointsItem(V2EndpointBriefInfo endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public ListV2EndpointsResponse withEndpoints(Consumer<List<V2EndpointBriefInfo>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * **参数解释**：端点列表。 
     * @return endpoints
     */
    public List<V2EndpointBriefInfo> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<V2EndpointBriefInfo> endpoints) {
        this.endpoints = endpoints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2EndpointsResponse that = (ListV2EndpointsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.endpoints, that.endpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, endpoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2EndpointsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
