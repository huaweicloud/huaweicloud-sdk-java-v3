package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListHostsDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_hosts")

    private List<ListHostsRspDedicatedHosts> dedicatedHosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListHostsDetailResponse withDedicatedHosts(List<ListHostsRspDedicatedHosts> dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }

    public ListHostsDetailResponse addDedicatedHostsItem(ListHostsRspDedicatedHosts dedicatedHostsItem) {
        if (this.dedicatedHosts == null) {
            this.dedicatedHosts = new ArrayList<>();
        }
        this.dedicatedHosts.add(dedicatedHostsItem);
        return this;
    }

    public ListHostsDetailResponse withDedicatedHosts(Consumer<List<ListHostsRspDedicatedHosts>> dedicatedHostsSetter) {
        if (this.dedicatedHosts == null) {
            this.dedicatedHosts = new ArrayList<>();
        }
        dedicatedHostsSetter.accept(this.dedicatedHosts);
        return this;
    }

    /**
     * 云办公主机列表。
     * @return dedicatedHosts
     */
    public List<ListHostsRspDedicatedHosts> getDedicatedHosts() {
        return dedicatedHosts;
    }

    public void setDedicatedHosts(List<ListHostsRspDedicatedHosts> dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
    }

    public ListHostsDetailResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总共条数。
     * minimum: 0
     * maximum: 2147483647
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
        ListHostsDetailResponse that = (ListHostsDetailResponse) obj;
        return Objects.equals(this.dedicatedHosts, that.dedicatedHosts) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHosts, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostsDetailResponse {\n");
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
