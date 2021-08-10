package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class UpdateLoadbalancerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer")

    private UpdateLoadbalancerReq loadbalancer;

    public UpdateLoadbalancerRequestBody withLoadbalancer(UpdateLoadbalancerReq loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public UpdateLoadbalancerRequestBody withLoadbalancer(Consumer<UpdateLoadbalancerReq> loadbalancerSetter) {
        if (this.loadbalancer == null) {
            this.loadbalancer = new UpdateLoadbalancerReq();
            loadbalancerSetter.accept(this.loadbalancer);
        }

        return this;
    }

    /** Get loadbalancer
     * 
     * @return loadbalancer */
    public UpdateLoadbalancerReq getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(UpdateLoadbalancerReq loadbalancer) {
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
        UpdateLoadbalancerRequestBody updateLoadbalancerRequestBody = (UpdateLoadbalancerRequestBody) o;
        return Objects.equals(this.loadbalancer, updateLoadbalancerRequestBody.loadbalancer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoadbalancerRequestBody {\n");
        sb.append("    loadbalancer: ").append(toIndentedString(loadbalancer)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
