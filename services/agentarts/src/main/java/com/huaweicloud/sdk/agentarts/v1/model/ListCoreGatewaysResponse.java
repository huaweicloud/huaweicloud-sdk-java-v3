package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListCoreGatewaysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateways")

    private List<CoreGatewaySummary> gateways = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListCoreGatewaysResponse withGateways(List<CoreGatewaySummary> gateways) {
        this.gateways = gateways;
        return this;
    }

    public ListCoreGatewaysResponse addGatewaysItem(CoreGatewaySummary gatewaysItem) {
        if (this.gateways == null) {
            this.gateways = new ArrayList<>();
        }
        this.gateways.add(gatewaysItem);
        return this;
    }

    public ListCoreGatewaysResponse withGateways(Consumer<List<CoreGatewaySummary>> gatewaysSetter) {
        if (this.gateways == null) {
            this.gateways = new ArrayList<>();
        }
        gatewaysSetter.accept(this.gateways);
        return this;
    }

    /**
     * 网关列表。
     * @return gateways
     */
    public List<CoreGatewaySummary> getGateways() {
        return gateways;
    }

    public void setGateways(List<CoreGatewaySummary> gateways) {
        this.gateways = gateways;
    }

    public ListCoreGatewaysResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 当前页返回的网关数量。
     * minimum: 0
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListCoreGatewaysResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 网关总数。
     * minimum: 0
     * maximum: 1000000
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
        ListCoreGatewaysResponse that = (ListCoreGatewaysResponse) obj;
        return Objects.equals(this.gateways, that.gateways) && Objects.equals(this.size, that.size)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gateways, size, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreGatewaysResponse {\n");
        sb.append("    gateways: ").append(toIndentedString(gateways)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
