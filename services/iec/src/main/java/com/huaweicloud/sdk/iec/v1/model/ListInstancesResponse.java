package com.huaweicloud.sdk.iec.v1.model;

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
public class ListInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_sites")

    private List<String> errSites = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<Instance> servers = null;

    public ListInstancesResponse withErrSites(List<String> errSites) {
        this.errSites = errSites;
        return this;
    }

    public ListInstancesResponse addErrSitesItem(String errSitesItem) {
        if (this.errSites == null) {
            this.errSites = new ArrayList<>();
        }
        this.errSites.add(errSitesItem);
        return this;
    }

    public ListInstancesResponse withErrSites(Consumer<List<String>> errSitesSetter) {
        if (this.errSites == null) {
            this.errSites = new ArrayList<>();
        }
        errSitesSetter.accept(this.errSites);
        return this;
    }

    /**
     * 异常站点。
     * @return errSites
     */
    public List<String> getErrSites() {
        return errSites;
    }

    public void setErrSites(List<String> errSites) {
        this.errSites = errSites;
    }

    public ListInstancesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 边缘实例列表的总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListInstancesResponse withServers(List<Instance> servers) {
        this.servers = servers;
        return this;
    }

    public ListInstancesResponse addServersItem(Instance serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public ListInstancesResponse withServers(Consumer<List<Instance>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 边缘实例列表。
     * @return servers
     */
    public List<Instance> getServers() {
        return servers;
    }

    public void setServers(List<Instance> servers) {
        this.servers = servers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesResponse that = (ListInstancesResponse) obj;
        return Objects.equals(this.errSites, that.errSites) && Objects.equals(this.count, that.count)
            && Objects.equals(this.servers, that.servers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errSites, count, servers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesResponse {\n");
        sb.append("    errSites: ").append(toIndentedString(errSites)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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
