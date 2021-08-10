package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 负载均衡器状态树对象 */
public class StatusResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer")

    private LoadbalancerInStatusResp loadbalancer;

    public StatusResp withLoadbalancer(LoadbalancerInStatusResp loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public StatusResp withLoadbalancer(Consumer<LoadbalancerInStatusResp> loadbalancerSetter) {
        if (this.loadbalancer == null) {
            this.loadbalancer = new LoadbalancerInStatusResp();
            loadbalancerSetter.accept(this.loadbalancer);
        }

        return this;
    }

    /** Get loadbalancer
     * 
     * @return loadbalancer */
    public LoadbalancerInStatusResp getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(LoadbalancerInStatusResp loadbalancer) {
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
        StatusResp statusResp = (StatusResp) o;
        return Objects.equals(this.loadbalancer, statusResp.loadbalancer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusResp {\n");
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
