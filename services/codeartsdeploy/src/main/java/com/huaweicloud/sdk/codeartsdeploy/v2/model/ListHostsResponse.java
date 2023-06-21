package com.huaweicloud.sdk.codeartsdeploy.v2.model;

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
public class ListHostsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<DeploymentHostDetail> hosts = null;

    public ListHostsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 主机数量
     * minimum: 0
     * maximum: 200
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListHostsResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 主机集群名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ListHostsResponse withHosts(List<DeploymentHostDetail> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ListHostsResponse addHostsItem(DeploymentHostDetail hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListHostsResponse withHosts(Consumer<List<DeploymentHostDetail>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 主机列表信息
     * @return hosts
     */
    public List<DeploymentHostDetail> getHosts() {
        return hosts;
    }

    public void setHosts(List<DeploymentHostDetail> hosts) {
        this.hosts = hosts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHostsResponse listHostsResponse = (ListHostsResponse) o;
        return Objects.equals(this.total, listHostsResponse.total)
            && Objects.equals(this.groupName, listHostsResponse.groupName)
            && Objects.equals(this.hosts, listHostsResponse.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, groupName, hosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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
