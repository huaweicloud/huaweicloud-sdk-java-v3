package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListApicInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_instances")

    private List<ApigInstanceDTO> gatewayInstances = null;

    public ListApicInstancesResponse withGatewayInstances(List<ApigInstanceDTO> gatewayInstances) {
        this.gatewayInstances = gatewayInstances;
        return this;
    }

    public ListApicInstancesResponse addGatewayInstancesItem(ApigInstanceDTO gatewayInstancesItem) {
        if (this.gatewayInstances == null) {
            this.gatewayInstances = new ArrayList<>();
        }
        this.gatewayInstances.add(gatewayInstancesItem);
        return this;
    }

    public ListApicInstancesResponse withGatewayInstances(Consumer<List<ApigInstanceDTO>> gatewayInstancesSetter) {
        if (this.gatewayInstances == null) {
            this.gatewayInstances = new ArrayList<>();
        }
        gatewayInstancesSetter.accept(this.gatewayInstances);
        return this;
    }

    /**
     * 网关实例
     * @return gatewayInstances
     */
    public List<ApigInstanceDTO> getGatewayInstances() {
        return gatewayInstances;
    }

    public void setGatewayInstances(List<ApigInstanceDTO> gatewayInstances) {
        this.gatewayInstances = gatewayInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApicInstancesResponse that = (ListApicInstancesResponse) obj;
        return Objects.equals(this.gatewayInstances, that.gatewayInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatewayInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApicInstancesResponse {\n");
        sb.append("    gatewayInstances: ").append(toIndentedString(gatewayInstances)).append("\n");
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
