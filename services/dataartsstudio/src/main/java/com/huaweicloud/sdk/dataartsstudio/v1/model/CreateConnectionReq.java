package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建资源组网络连接的请求body体。
 */
public class CreateConnectionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_vpc_id")

    private String destVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_network_id")

    private String destNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusters")

    private List<String> clusters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<ConnectionsHost> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable_id")

    private String routetableId;

    public CreateConnectionReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 连接名称。长度64，数字字母下划线组成。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateConnectionReq withDestVpcId(String destVpcId) {
        this.destVpcId = destVpcId;
        return this;
    }

    /**
     * 对应服务的vpc的ID。
     * @return destVpcId
     */
    public String getDestVpcId() {
        return destVpcId;
    }

    public void setDestVpcId(String destVpcId) {
        this.destVpcId = destVpcId;
    }

    public CreateConnectionReq withDestNetworkId(String destNetworkId) {
        this.destNetworkId = destNetworkId;
        return this;
    }

    /**
     * 对应服务的子网网络ID，即为需要建立连接的服务所在的子网。
     * @return destNetworkId
     */
    public String getDestNetworkId() {
        return destNetworkId;
    }

    public void setDestNetworkId(String destNetworkId) {
        this.destNetworkId = destNetworkId;
    }

    public CreateConnectionReq withClusters(List<String> clusters) {
        this.clusters = clusters;
        return this;
    }

    public CreateConnectionReq addClustersItem(String clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    public CreateConnectionReq withClusters(Consumer<List<String>> clustersSetter) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        clustersSetter.accept(this.clusters);
        return this;
    }

    /**
     * 需要使用连接的集群ID列表。单条最大长度128字符。
     * @return clusters
     */
    public List<String> getClusters() {
        return clusters;
    }

    public void setClusters(List<String> clusters) {
        this.clusters = clusters;
    }

    public CreateConnectionReq withHosts(List<ConnectionsHost> hosts) {
        this.hosts = hosts;
        return this;
    }

    public CreateConnectionReq addHostsItem(ConnectionsHost hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public CreateConnectionReq withHosts(Consumer<List<ConnectionsHost>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 用户自定义主机信息，最大支持2万条记录。
     * @return hosts
     */
    public List<ConnectionsHost> getHosts() {
        return hosts;
    }

    public void setHosts(List<ConnectionsHost> hosts) {
        this.hosts = hosts;
    }

    public CreateConnectionReq withRoutetableId(String routetableId) {
        this.routetableId = routetableId;
        return this;
    }

    /**
     * 对应服务的子网关联的路由表。
     * @return routetableId
     */
    public String getRoutetableId() {
        return routetableId;
    }

    public void setRoutetableId(String routetableId) {
        this.routetableId = routetableId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateConnectionReq that = (CreateConnectionReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.destVpcId, that.destVpcId)
            && Objects.equals(this.destNetworkId, that.destNetworkId) && Objects.equals(this.clusters, that.clusters)
            && Objects.equals(this.hosts, that.hosts) && Objects.equals(this.routetableId, that.routetableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, destVpcId, destNetworkId, clusters, hosts, routetableId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConnectionReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    destVpcId: ").append(toIndentedString(destVpcId)).append("\n");
        sb.append("    destNetworkId: ").append(toIndentedString(destNetworkId)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    routetableId: ").append(toIndentedString(routetableId)).append("\n");
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
