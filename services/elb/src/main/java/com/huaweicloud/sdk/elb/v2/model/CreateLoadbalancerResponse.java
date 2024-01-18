package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateLoadbalancerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer")

    private LoadbalancerResp loadbalancer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    public CreateLoadbalancerResponse withLoadbalancer(LoadbalancerResp loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public CreateLoadbalancerResponse withLoadbalancer(Consumer<LoadbalancerResp> loadbalancerSetter) {
        if (this.loadbalancer == null) {
            this.loadbalancer = new LoadbalancerResp();
            loadbalancerSetter.accept(this.loadbalancer);
        }

        return this;
    }

    /**
     * Get loadbalancer
     * @return loadbalancer
     */
    public LoadbalancerResp getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(LoadbalancerResp loadbalancer) {
        this.loadbalancer = loadbalancer;
    }

    public CreateLoadbalancerResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单号[（包周期场景返回该字段）](tag:hws)
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CreateLoadbalancerResponse withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * 负载均衡器的ID[（包周期场景返回该字段）](tag:hws)
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLoadbalancerResponse that = (CreateLoadbalancerResponse) obj;
        return Objects.equals(this.loadbalancer, that.loadbalancer) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.loadbalancerId, that.loadbalancerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer, orderId, loadbalancerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoadbalancerResponse {\n");
        sb.append("    loadbalancer: ").append(toIndentedString(loadbalancer)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
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
