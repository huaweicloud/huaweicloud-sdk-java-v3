package com.huaweicloud.sdk.deh.v1.model;

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
public class ListDedicatedHostsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_hosts")

    private List<RespDedicatedHost> dedicatedHosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListDedicatedHostsResponse withDedicatedHosts(List<RespDedicatedHost> dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }

    public ListDedicatedHostsResponse addDedicatedHostsItem(RespDedicatedHost dedicatedHostsItem) {
        if (this.dedicatedHosts == null) {
            this.dedicatedHosts = new ArrayList<>();
        }
        this.dedicatedHosts.add(dedicatedHostsItem);
        return this;
    }

    public ListDedicatedHostsResponse withDedicatedHosts(Consumer<List<RespDedicatedHost>> dedicatedHostsSetter) {
        if (this.dedicatedHosts == null) {
            this.dedicatedHosts = new ArrayList<>();
        }
        dedicatedHostsSetter.accept(this.dedicatedHosts);
        return this;
    }

    /**
     * 满足查询条件的专属主机。
     * @return dedicatedHosts
     */
    public List<RespDedicatedHost> getDedicatedHosts() {
        return dedicatedHosts;
    }

    public void setDedicatedHosts(List<RespDedicatedHost> dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
    }

    public ListDedicatedHostsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 满足查询条件的专属主机数量。
     * minimum: 0
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDedicatedHostsResponse listDedicatedHostsResponse = (ListDedicatedHostsResponse) o;
        return Objects.equals(this.dedicatedHosts, listDedicatedHostsResponse.dedicatedHosts)
            && Objects.equals(this.total, listDedicatedHostsResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHosts, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDedicatedHostsResponse {\n");
        sb.append("    dedicatedHosts: ").append(toIndentedString(dedicatedHosts)).append("\n");
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
