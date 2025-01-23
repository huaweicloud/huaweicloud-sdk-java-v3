package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class BatchCreateLoadBalancersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer")

    private BatchCreateLoadBalancerOption loadbalancer;

    public BatchCreateLoadBalancersRequestBody withLoadbalancer(BatchCreateLoadBalancerOption loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public BatchCreateLoadBalancersRequestBody withLoadbalancer(
        Consumer<BatchCreateLoadBalancerOption> loadbalancerSetter) {
        if (this.loadbalancer == null) {
            this.loadbalancer = new BatchCreateLoadBalancerOption();
            loadbalancerSetter.accept(this.loadbalancer);
        }

        return this;
    }

    /**
     * Get loadbalancer
     * @return loadbalancer
     */
    public BatchCreateLoadBalancerOption getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(BatchCreateLoadBalancerOption loadbalancer) {
        this.loadbalancer = loadbalancer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateLoadBalancersRequestBody that = (BatchCreateLoadBalancersRequestBody) obj;
        return Objects.equals(this.loadbalancer, that.loadbalancer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateLoadBalancersRequestBody {\n");
        sb.append("    loadbalancer: ").append(toIndentedString(loadbalancer)).append("\n");
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
