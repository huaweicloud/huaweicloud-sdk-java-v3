package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 返回结果
 */
public class ListEndPointsResultResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<EndPointResponse> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListEndPointsResultResponseBodyResult withEndpoints(List<EndPointResponse> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ListEndPointsResultResponseBodyResult addEndpointsItem(EndPointResponse endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public ListEndPointsResultResponseBodyResult withEndpoints(Consumer<List<EndPointResponse>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * **参数解释**： 私有仓库列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return endpoints
     */
    public List<EndPointResponse> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<EndPointResponse> endpoints) {
        this.endpoints = endpoints;
    }

    public ListEndPointsResultResponseBodyResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 返回数据量。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
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
        ListEndPointsResultResponseBodyResult that = (ListEndPointsResultResponseBodyResult) obj;
        return Objects.equals(this.endpoints, that.endpoints) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoints, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEndPointsResultResponseBodyResult {\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
