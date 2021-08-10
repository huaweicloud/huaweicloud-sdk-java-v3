package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListHostGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_groups")

    private List<DeploymentGroupDetail> hostGroups = null;

    public ListHostGroupsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 主机组个数 minimum: 0 maximum: 1000
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListHostGroupsResponse withHostGroups(List<DeploymentGroupDetail> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }

    public ListHostGroupsResponse addHostGroupsItem(DeploymentGroupDetail hostGroupsItem) {
        if (this.hostGroups == null) {
            this.hostGroups = new ArrayList<>();
        }
        this.hostGroups.add(hostGroupsItem);
        return this;
    }

    public ListHostGroupsResponse withHostGroups(Consumer<List<DeploymentGroupDetail>> hostGroupsSetter) {
        if (this.hostGroups == null) {
            this.hostGroups = new ArrayList<>();
        }
        hostGroupsSetter.accept(this.hostGroups);
        return this;
    }

    /** 主机组详情响应体
     * 
     * @return hostGroups */
    public List<DeploymentGroupDetail> getHostGroups() {
        return hostGroups;
    }

    public void setHostGroups(List<DeploymentGroupDetail> hostGroups) {
        this.hostGroups = hostGroups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHostGroupsResponse listHostGroupsResponse = (ListHostGroupsResponse) o;
        return Objects.equals(this.total, listHostGroupsResponse.total)
            && Objects.equals(this.hostGroups, listHostGroupsResponse.hostGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, hostGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostGroupsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    hostGroups: ").append(toIndentedString(hostGroups)).append("\n");
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
