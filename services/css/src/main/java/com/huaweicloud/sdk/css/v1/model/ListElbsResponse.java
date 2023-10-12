package com.huaweicloud.sdk.css.v1.model;

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
public class ListElbsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancers")

    private List<LoadbalancersResource> loadbalancers = null;

    public ListElbsResponse withLoadbalancers(List<LoadbalancersResource> loadbalancers) {
        this.loadbalancers = loadbalancers;
        return this;
    }

    public ListElbsResponse addLoadbalancersItem(LoadbalancersResource loadbalancersItem) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        this.loadbalancers.add(loadbalancersItem);
        return this;
    }

    public ListElbsResponse withLoadbalancers(Consumer<List<LoadbalancersResource>> loadbalancersSetter) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        loadbalancersSetter.accept(this.loadbalancers);
        return this;
    }

    /**
     * 负载均衡器列表。
     * @return loadbalancers
     */
    public List<LoadbalancersResource> getLoadbalancers() {
        return loadbalancers;
    }

    public void setLoadbalancers(List<LoadbalancersResource> loadbalancers) {
        this.loadbalancers = loadbalancers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListElbsResponse that = (ListElbsResponse) obj;
        return Objects.equals(this.loadbalancers, that.loadbalancers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListElbsResponse {\n");
        sb.append("    loadbalancers: ").append(toIndentedString(loadbalancers)).append("\n");
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
