package com.huaweicloud.sdk.dcs.v2.model;

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
public class ShowInstanceTopologyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_server")

    private List<TopologyInfo> redisServer = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_lvs")

    private List<TopologyInfo> clusterLvs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_admin")

    private List<TopologyInfo> clusterAdmin = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_proxy")

    private List<TopologyInfo> clusterProxy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master")

    private List<TopologyInfo> master = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcendpoint")

    private List<TopologyInfo> vpcendpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb")

    private List<TopologyInfo> elb = null;

    public ShowInstanceTopologyResponse withRedisServer(List<TopologyInfo> redisServer) {
        this.redisServer = redisServer;
        return this;
    }

    public ShowInstanceTopologyResponse addRedisServerItem(TopologyInfo redisServerItem) {
        if (this.redisServer == null) {
            this.redisServer = new ArrayList<>();
        }
        this.redisServer.add(redisServerItem);
        return this;
    }

    public ShowInstanceTopologyResponse withRedisServer(Consumer<List<TopologyInfo>> redisServerSetter) {
        if (this.redisServer == null) {
            this.redisServer = new ArrayList<>();
        }
        redisServerSetter.accept(this.redisServer);
        return this;
    }

    /**
     * **参数解释**： 集群角色：redis-server实例拓朴图。 
     * @return redisServer
     */
    public List<TopologyInfo> getRedisServer() {
        return redisServer;
    }

    public void setRedisServer(List<TopologyInfo> redisServer) {
        this.redisServer = redisServer;
    }

    public ShowInstanceTopologyResponse withClusterLvs(List<TopologyInfo> clusterLvs) {
        this.clusterLvs = clusterLvs;
        return this;
    }

    public ShowInstanceTopologyResponse addClusterLvsItem(TopologyInfo clusterLvsItem) {
        if (this.clusterLvs == null) {
            this.clusterLvs = new ArrayList<>();
        }
        this.clusterLvs.add(clusterLvsItem);
        return this;
    }

    public ShowInstanceTopologyResponse withClusterLvs(Consumer<List<TopologyInfo>> clusterLvsSetter) {
        if (this.clusterLvs == null) {
            this.clusterLvs = new ArrayList<>();
        }
        clusterLvsSetter.accept(this.clusterLvs);
        return this;
    }

    /**
     * **参数解释**： 集群角色：lvs实例拓朴图（当前已下线），只适用于Redis 3.0版本实例。 
     * @return clusterLvs
     */
    public List<TopologyInfo> getClusterLvs() {
        return clusterLvs;
    }

    public void setClusterLvs(List<TopologyInfo> clusterLvs) {
        this.clusterLvs = clusterLvs;
    }

    public ShowInstanceTopologyResponse withClusterAdmin(List<TopologyInfo> clusterAdmin) {
        this.clusterAdmin = clusterAdmin;
        return this;
    }

    public ShowInstanceTopologyResponse addClusterAdminItem(TopologyInfo clusterAdminItem) {
        if (this.clusterAdmin == null) {
            this.clusterAdmin = new ArrayList<>();
        }
        this.clusterAdmin.add(clusterAdminItem);
        return this;
    }

    public ShowInstanceTopologyResponse withClusterAdmin(Consumer<List<TopologyInfo>> clusterAdminSetter) {
        if (this.clusterAdmin == null) {
            this.clusterAdmin = new ArrayList<>();
        }
        clusterAdminSetter.accept(this.clusterAdmin);
        return this;
    }

    /**
     * **参数解释**： 集群角色：admin实例拓朴图（当前已下线），只适用于Redis 3.0版本实例。 
     * @return clusterAdmin
     */
    public List<TopologyInfo> getClusterAdmin() {
        return clusterAdmin;
    }

    public void setClusterAdmin(List<TopologyInfo> clusterAdmin) {
        this.clusterAdmin = clusterAdmin;
    }

    public ShowInstanceTopologyResponse withClusterProxy(List<TopologyInfo> clusterProxy) {
        this.clusterProxy = clusterProxy;
        return this;
    }

    public ShowInstanceTopologyResponse addClusterProxyItem(TopologyInfo clusterProxyItem) {
        if (this.clusterProxy == null) {
            this.clusterProxy = new ArrayList<>();
        }
        this.clusterProxy.add(clusterProxyItem);
        return this;
    }

    public ShowInstanceTopologyResponse withClusterProxy(Consumer<List<TopologyInfo>> clusterProxySetter) {
        if (this.clusterProxy == null) {
            this.clusterProxy = new ArrayList<>();
        }
        clusterProxySetter.accept(this.clusterProxy);
        return this;
    }

    /**
     * **参数解释**： 集群角色：proxy实例拓朴图。 
     * @return clusterProxy
     */
    public List<TopologyInfo> getClusterProxy() {
        return clusterProxy;
    }

    public void setClusterProxy(List<TopologyInfo> clusterProxy) {
        this.clusterProxy = clusterProxy;
    }

    public ShowInstanceTopologyResponse withMaster(List<TopologyInfo> master) {
        this.master = master;
        return this;
    }

    public ShowInstanceTopologyResponse addMasterItem(TopologyInfo masterItem) {
        if (this.master == null) {
            this.master = new ArrayList<>();
        }
        this.master.add(masterItem);
        return this;
    }

    public ShowInstanceTopologyResponse withMaster(Consumer<List<TopologyInfo>> masterSetter) {
        if (this.master == null) {
            this.master = new ArrayList<>();
        }
        masterSetter.accept(this.master);
        return this;
    }

    /**
     * **参数解释**： Redis的角色master实例拓朴图，只适用于Redis 3.0版本实例。 
     * @return master
     */
    public List<TopologyInfo> getMaster() {
        return master;
    }

    public void setMaster(List<TopologyInfo> master) {
        this.master = master;
    }

    public ShowInstanceTopologyResponse withVpcendpoint(List<TopologyInfo> vpcendpoint) {
        this.vpcendpoint = vpcendpoint;
        return this;
    }

    public ShowInstanceTopologyResponse addVpcendpointItem(TopologyInfo vpcendpointItem) {
        if (this.vpcendpoint == null) {
            this.vpcendpoint = new ArrayList<>();
        }
        this.vpcendpoint.add(vpcendpointItem);
        return this;
    }

    public ShowInstanceTopologyResponse withVpcendpoint(Consumer<List<TopologyInfo>> vpcendpointSetter) {
        if (this.vpcendpoint == null) {
            this.vpcendpoint = new ArrayList<>();
        }
        vpcendpointSetter.accept(this.vpcendpoint);
        return this;
    }

    /**
     * **参数解释**： 集群角色：VPC Endpoint服务实例拓朴图，适用于4.0及以上版本实例。 
     * @return vpcendpoint
     */
    public List<TopologyInfo> getVpcendpoint() {
        return vpcendpoint;
    }

    public void setVpcendpoint(List<TopologyInfo> vpcendpoint) {
        this.vpcendpoint = vpcendpoint;
    }

    public ShowInstanceTopologyResponse withElb(List<TopologyInfo> elb) {
        this.elb = elb;
        return this;
    }

    public ShowInstanceTopologyResponse addElbItem(TopologyInfo elbItem) {
        if (this.elb == null) {
            this.elb = new ArrayList<>();
        }
        this.elb.add(elbItem);
        return this;
    }

    public ShowInstanceTopologyResponse withElb(Consumer<List<TopologyInfo>> elbSetter) {
        if (this.elb == null) {
            this.elb = new ArrayList<>();
        }
        elbSetter.accept(this.elb);
        return this;
    }

    /**
     * **参数解释**： 集群角色：ELB服务实例拓朴图，适用于Redis 4.0及以上版本实例。 
     * @return elb
     */
    public List<TopologyInfo> getElb() {
        return elb;
    }

    public void setElb(List<TopologyInfo> elb) {
        this.elb = elb;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceTopologyResponse that = (ShowInstanceTopologyResponse) obj;
        return Objects.equals(this.redisServer, that.redisServer) && Objects.equals(this.clusterLvs, that.clusterLvs)
            && Objects.equals(this.clusterAdmin, that.clusterAdmin)
            && Objects.equals(this.clusterProxy, that.clusterProxy) && Objects.equals(this.master, that.master)
            && Objects.equals(this.vpcendpoint, that.vpcendpoint) && Objects.equals(this.elb, that.elb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redisServer, clusterLvs, clusterAdmin, clusterProxy, master, vpcendpoint, elb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceTopologyResponse {\n");
        sb.append("    redisServer: ").append(toIndentedString(redisServer)).append("\n");
        sb.append("    clusterLvs: ").append(toIndentedString(clusterLvs)).append("\n");
        sb.append("    clusterAdmin: ").append(toIndentedString(clusterAdmin)).append("\n");
        sb.append("    clusterProxy: ").append(toIndentedString(clusterProxy)).append("\n");
        sb.append("    master: ").append(toIndentedString(master)).append("\n");
        sb.append("    vpcendpoint: ").append(toIndentedString(vpcendpoint)).append("\n");
        sb.append("    elb: ").append(toIndentedString(elb)).append("\n");
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
