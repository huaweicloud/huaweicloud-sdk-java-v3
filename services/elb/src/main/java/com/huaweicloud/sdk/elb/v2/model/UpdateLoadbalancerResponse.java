package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateLoadbalancerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer")

    private LoadbalancerResp loadbalancer;

    public UpdateLoadbalancerResponse withLoadbalancer(LoadbalancerResp loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public UpdateLoadbalancerResponse withLoadbalancer(Consumer<LoadbalancerResp> loadbalancerSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLoadbalancerResponse updateLoadbalancerResponse = (UpdateLoadbalancerResponse) o;
        return Objects.equals(this.loadbalancer, updateLoadbalancerResponse.loadbalancer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoadbalancerResponse {\n");
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
