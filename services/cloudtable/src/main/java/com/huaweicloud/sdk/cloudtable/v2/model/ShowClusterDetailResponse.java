package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowClusterDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_openTSDB")

    private Boolean enableOpenTSDB;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_lemon")

    private Boolean enableLemon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_num")

    private Integer cuNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tsd_num")

    private Integer tsdNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lemon_num")

    private Integer lemonNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_quota")

    private Integer storageQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_storage_size")

    private Integer usedStorageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_mode")

    private Boolean authMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opentsdb_link")

    private String opentsdbLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tsd_public_endpoint")

    private String tsdPublicEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lemon_link")

    private String lemonLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zookeeper_link")

    private String zookeeperLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hbase_public_endpoint")

    private String hbasePublicEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_frozen")

    private Integer isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_net_id")

    private String subNetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    public ShowClusterDetailResponse withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public ShowClusterDetailResponse addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ShowClusterDetailResponse withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /** 集群当前状态列表： - 创建中 - 扩容中 - 重启中 - 开启opentsdb - 扩容失败 - 重启失败 - 开启opentsdb失败
     * 
     * @return actions */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public ShowClusterDetailResponse withEnableOpenTSDB(Boolean enableOpenTSDB) {
        this.enableOpenTSDB = enableOpenTSDB;
        return this;
    }

    /** 是否打开openTSDB特性。 - false：不开启 - true：开启
     * 
     * @return enableOpenTSDB */
    public Boolean getEnableOpenTSDB() {
        return enableOpenTSDB;
    }

    public void setEnableOpenTSDB(Boolean enableOpenTSDB) {
        this.enableOpenTSDB = enableOpenTSDB;
    }

    public ShowClusterDetailResponse withEnableLemon(Boolean enableLemon) {
        this.enableLemon = enableLemon;
        return this;
    }

    /** 是否打开SQL查询特性。 - false：不开启 - true：开启
     * 
     * @return enableLemon */
    public Boolean getEnableLemon() {
        return enableLemon;
    }

    public void setEnableLemon(Boolean enableLemon) {
        this.enableLemon = enableLemon;
    }

    public ShowClusterDetailResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /** 集群名称。
     * 
     * @return clusterName */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ShowClusterDetailResponse withCuNum(Integer cuNum) {
        this.cuNum = cuNum;
        return this;
    }

    /** RegionServer个数。
     * 
     * @return cuNum */
    public Integer getCuNum() {
        return cuNum;
    }

    public void setCuNum(Integer cuNum) {
        this.cuNum = cuNum;
    }

    public ShowClusterDetailResponse withTsdNum(Integer tsdNum) {
        this.tsdNum = tsdNum;
        return this;
    }

    /** TSD节点个数。
     * 
     * @return tsdNum */
    public Integer getTsdNum() {
        return tsdNum;
    }

    public void setTsdNum(Integer tsdNum) {
        this.tsdNum = tsdNum;
    }

    public ShowClusterDetailResponse withLemonNum(Integer lemonNum) {
        this.lemonNum = lemonNum;
        return this;
    }

    /** Lemon节点个数。
     * 
     * @return lemonNum */
    public Integer getLemonNum() {
        return lemonNum;
    }

    public void setLemonNum(Integer lemonNum) {
        this.lemonNum = lemonNum;
    }

    public ShowClusterDetailResponse withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /** 集群底层存储类型： - OBS - HDFS
     * 
     * @return storageType */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public ShowClusterDetailResponse withStorageQuota(Integer storageQuota) {
        this.storageQuota = storageQuota;
        return this;
    }

    /** 集群存储配额。
     * 
     * @return storageQuota */
    public Integer getStorageQuota() {
        return storageQuota;
    }

    public void setStorageQuota(Integer storageQuota) {
        this.storageQuota = storageQuota;
    }

    public ShowClusterDetailResponse withUsedStorageSize(Integer usedStorageSize) {
        this.usedStorageSize = usedStorageSize;
        return this;
    }

    /** 当前使用存储空间。
     * 
     * @return usedStorageSize */
    public Integer getUsedStorageSize() {
        return usedStorageSize;
    }

    public void setUsedStorageSize(Integer usedStorageSize) {
        this.usedStorageSize = usedStorageSize;
    }

    public ShowClusterDetailResponse withAuthMode(Boolean authMode) {
        this.authMode = authMode;
        return this;
    }

    /** 是否打开IAM认证。 - false：不开启 - true：开启
     * 
     * @return authMode */
    public Boolean getAuthMode() {
        return authMode;
    }

    public void setAuthMode(Boolean authMode) {
        this.authMode = authMode;
    }

    public ShowClusterDetailResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /** 集群更新时间。
     * 
     * @return updated */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowClusterDetailResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /** 集群创建时间。
     * 
     * @return created */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowClusterDetailResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /** 集群唯一标识，集群ID。
     * 
     * @return clusterId */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowClusterDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 集群当前状态： - 200：集群正常 - 300：集群异常 - 400：集群已删除 - 303：集群创建失败
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowClusterDetailResponse withOpentsdbLink(String opentsdbLink) {
        this.opentsdbLink = opentsdbLink;
        return this;
    }

    /** 内网OpenTSDB连接访问地址。
     * 
     * @return opentsdbLink */
    public String getOpentsdbLink() {
        return opentsdbLink;
    }

    public void setOpentsdbLink(String opentsdbLink) {
        this.opentsdbLink = opentsdbLink;
    }

    public ShowClusterDetailResponse withTsdPublicEndpoint(String tsdPublicEndpoint) {
        this.tsdPublicEndpoint = tsdPublicEndpoint;
        return this;
    }

    /** 公网OpenTSDB连接访问地址。
     * 
     * @return tsdPublicEndpoint */
    public String getTsdPublicEndpoint() {
        return tsdPublicEndpoint;
    }

    public void setTsdPublicEndpoint(String tsdPublicEndpoint) {
        this.tsdPublicEndpoint = tsdPublicEndpoint;
    }

    public ShowClusterDetailResponse withLemonLink(String lemonLink) {
        this.lemonLink = lemonLink;
        return this;
    }

    /** 内网Lemon连接访问地址。
     * 
     * @return lemonLink */
    public String getLemonLink() {
        return lemonLink;
    }

    public void setLemonLink(String lemonLink) {
        this.lemonLink = lemonLink;
    }

    public ShowClusterDetailResponse withZookeeperLink(String zookeeperLink) {
        this.zookeeperLink = zookeeperLink;
        return this;
    }

    /** 内网ZooKeeper连接访问地址。
     * 
     * @return zookeeperLink */
    public String getZookeeperLink() {
        return zookeeperLink;
    }

    public void setZookeeperLink(String zookeeperLink) {
        this.zookeeperLink = zookeeperLink;
    }

    public ShowClusterDetailResponse withHbasePublicEndpoint(String hbasePublicEndpoint) {
        this.hbasePublicEndpoint = hbasePublicEndpoint;
        return this;
    }

    /** 公网HBase连接访问地址。
     * 
     * @return hbasePublicEndpoint */
    public String getHbasePublicEndpoint() {
        return hbasePublicEndpoint;
    }

    public void setHbasePublicEndpoint(String hbasePublicEndpoint) {
        this.hbasePublicEndpoint = hbasePublicEndpoint;
    }

    public ShowClusterDetailResponse withIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /** 集群是否被冻结。 - false：不冻结 - true：冻结
     * 
     * @return isFrozen */
    public Integer getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
    }

    public ShowClusterDetailResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** VPC ID，创建集群节点所在的虚拟私有ID。
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowClusterDetailResponse withSubNetId(String subNetId) {
        this.subNetId = subNetId;
        return this;
    }

    /** 子网ID，创建集群所在子网段。
     * 
     * @return subNetId */
    public String getSubNetId() {
        return subNetId;
    }

    public void setSubNetId(String subNetId) {
        this.subNetId = subNetId;
    }

    public ShowClusterDetailResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /** 安全组对应的ID。
     * 
     * @return securityGroupId */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ShowClusterDetailResponse withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /** 集群所属的可用区。
     * 
     * @return availabilityZone */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowClusterDetailResponse showClusterDetailResponse = (ShowClusterDetailResponse) o;
        return Objects.equals(this.actions, showClusterDetailResponse.actions)
            && Objects.equals(this.enableOpenTSDB, showClusterDetailResponse.enableOpenTSDB)
            && Objects.equals(this.enableLemon, showClusterDetailResponse.enableLemon)
            && Objects.equals(this.clusterName, showClusterDetailResponse.clusterName)
            && Objects.equals(this.cuNum, showClusterDetailResponse.cuNum)
            && Objects.equals(this.tsdNum, showClusterDetailResponse.tsdNum)
            && Objects.equals(this.lemonNum, showClusterDetailResponse.lemonNum)
            && Objects.equals(this.storageType, showClusterDetailResponse.storageType)
            && Objects.equals(this.storageQuota, showClusterDetailResponse.storageQuota)
            && Objects.equals(this.usedStorageSize, showClusterDetailResponse.usedStorageSize)
            && Objects.equals(this.authMode, showClusterDetailResponse.authMode)
            && Objects.equals(this.updated, showClusterDetailResponse.updated)
            && Objects.equals(this.created, showClusterDetailResponse.created)
            && Objects.equals(this.clusterId, showClusterDetailResponse.clusterId)
            && Objects.equals(this.status, showClusterDetailResponse.status)
            && Objects.equals(this.opentsdbLink, showClusterDetailResponse.opentsdbLink)
            && Objects.equals(this.tsdPublicEndpoint, showClusterDetailResponse.tsdPublicEndpoint)
            && Objects.equals(this.lemonLink, showClusterDetailResponse.lemonLink)
            && Objects.equals(this.zookeeperLink, showClusterDetailResponse.zookeeperLink)
            && Objects.equals(this.hbasePublicEndpoint, showClusterDetailResponse.hbasePublicEndpoint)
            && Objects.equals(this.isFrozen, showClusterDetailResponse.isFrozen)
            && Objects.equals(this.vpcId, showClusterDetailResponse.vpcId)
            && Objects.equals(this.subNetId, showClusterDetailResponse.subNetId)
            && Objects.equals(this.securityGroupId, showClusterDetailResponse.securityGroupId)
            && Objects.equals(this.availabilityZone, showClusterDetailResponse.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actions,
            enableOpenTSDB,
            enableLemon,
            clusterName,
            cuNum,
            tsdNum,
            lemonNum,
            storageType,
            storageQuota,
            usedStorageSize,
            authMode,
            updated,
            created,
            clusterId,
            status,
            opentsdbLink,
            tsdPublicEndpoint,
            lemonLink,
            zookeeperLink,
            hbasePublicEndpoint,
            isFrozen,
            vpcId,
            subNetId,
            securityGroupId,
            availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterDetailResponse {\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    enableOpenTSDB: ").append(toIndentedString(enableOpenTSDB)).append("\n");
        sb.append("    enableLemon: ").append(toIndentedString(enableLemon)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    cuNum: ").append(toIndentedString(cuNum)).append("\n");
        sb.append("    tsdNum: ").append(toIndentedString(tsdNum)).append("\n");
        sb.append("    lemonNum: ").append(toIndentedString(lemonNum)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    storageQuota: ").append(toIndentedString(storageQuota)).append("\n");
        sb.append("    usedStorageSize: ").append(toIndentedString(usedStorageSize)).append("\n");
        sb.append("    authMode: ").append(toIndentedString(authMode)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    opentsdbLink: ").append(toIndentedString(opentsdbLink)).append("\n");
        sb.append("    tsdPublicEndpoint: ").append(toIndentedString(tsdPublicEndpoint)).append("\n");
        sb.append("    lemonLink: ").append(toIndentedString(lemonLink)).append("\n");
        sb.append("    zookeeperLink: ").append(toIndentedString(zookeeperLink)).append("\n");
        sb.append("    hbasePublicEndpoint: ").append(toIndentedString(hbasePublicEndpoint)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subNetId: ").append(toIndentedString(subNetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
