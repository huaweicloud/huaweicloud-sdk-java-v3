package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群对象。
 */
public class ClusterList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private ClusterListDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshotPolicy")

    private Object snapshotPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<ClusterListInstances> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicKibanaResp")

    private PublicKibanaRespBody publicKibanaResp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elbWhiteList")

    private ElbWhiteListResp elbWhiteList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicIp")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcId")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetId")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securityGroupId")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidthSize")

    private Integer bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpsEnable")

    private Boolean httpsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorityEnable")

    private Boolean authorityEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskEncrypted")

    private Boolean diskEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backupAvailable")

    private Boolean backupAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actionProgress")

    private Object actionProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProjectId")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ClusterListTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedReason")

    private ClusterListFailedReasons failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Boolean period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidthResourceId")

    private String bandwidthResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6Endpoint")

    private String ipv6Endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmkId")

    private String cmkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentSubnetIds")

    private String currentSubnetIds;

    public ClusterList withDatastore(ClusterListDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public ClusterList withDatastore(Consumer<ClusterListDatastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new ClusterListDatastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public ClusterListDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(ClusterListDatastore datastore) {
        this.datastore = datastore;
    }

    public ClusterList withSnapshotPolicy(Object snapshotPolicy) {
        this.snapshotPolicy = snapshotPolicy;
        return this;
    }

    /**
     * 集群自动快照策略相关信息。
     * @return snapshotPolicy
     */
    public Object getSnapshotPolicy() {
        return snapshotPolicy;
    }

    public void setSnapshotPolicy(Object snapshotPolicy) {
        this.snapshotPolicy = snapshotPolicy;
    }

    public ClusterList withInstances(List<ClusterListInstances> instances) {
        this.instances = instances;
        return this;
    }

    public ClusterList addInstancesItem(ClusterListInstances instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ClusterList withInstances(Consumer<List<ClusterListInstances>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 节点对象列表。
     * @return instances
     */
    public List<ClusterListInstances> getInstances() {
        return instances;
    }

    public void setInstances(List<ClusterListInstances> instances) {
        this.instances = instances;
    }

    public ClusterList withPublicKibanaResp(PublicKibanaRespBody publicKibanaResp) {
        this.publicKibanaResp = publicKibanaResp;
        return this;
    }

    public ClusterList withPublicKibanaResp(Consumer<PublicKibanaRespBody> publicKibanaRespSetter) {
        if (this.publicKibanaResp == null) {
            this.publicKibanaResp = new PublicKibanaRespBody();
            publicKibanaRespSetter.accept(this.publicKibanaResp);
        }

        return this;
    }

    /**
     * Get publicKibanaResp
     * @return publicKibanaResp
     */
    public PublicKibanaRespBody getPublicKibanaResp() {
        return publicKibanaResp;
    }

    public void setPublicKibanaResp(PublicKibanaRespBody publicKibanaResp) {
        this.publicKibanaResp = publicKibanaResp;
    }

    public ClusterList withElbWhiteList(ElbWhiteListResp elbWhiteList) {
        this.elbWhiteList = elbWhiteList;
        return this;
    }

    public ClusterList withElbWhiteList(Consumer<ElbWhiteListResp> elbWhiteListSetter) {
        if (this.elbWhiteList == null) {
            this.elbWhiteList = new ElbWhiteListResp();
            elbWhiteListSetter.accept(this.elbWhiteList);
        }

        return this;
    }

    /**
     * Get elbWhiteList
     * @return elbWhiteList
     */
    public ElbWhiteListResp getElbWhiteList() {
        return elbWhiteList;
    }

    public void setElbWhiteList(ElbWhiteListResp elbWhiteList) {
        this.elbWhiteList = elbWhiteList;
    }

    public ClusterList withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 集群上次修改时间，格式为ISO8601： CCYY-MM-DDThh:mm:ss。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ClusterList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 集群名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterList withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 公网IP信息。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ClusterList withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 集群创建时间，格式为ISO8601：CCYY-MM-DDThh:mm:ss。  返回的集群列表信息按照创建时间降序排序，即创建时间最新的集群排在最前。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ClusterList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 集群ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 集群状态值。  - 100：创建中。 - 200：可用。 - 303：不可用，如创建失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClusterList withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 用户VPC访问IP地址和端口号。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ClusterList withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ClusterList withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ClusterList withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ClusterList withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 公网带宽大小。单位：Mbit/s
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public ClusterList withHttpsEnable(Boolean httpsEnable) {
        this.httpsEnable = httpsEnable;
        return this;
    }

    /**
     * 通信加密状态。 - false：未设置通信加密。 - true：已设置通信加密。
     * @return httpsEnable
     */
    public Boolean getHttpsEnable() {
        return httpsEnable;
    }

    public void setHttpsEnable(Boolean httpsEnable) {
        this.httpsEnable = httpsEnable;
    }

    public ClusterList withAuthorityEnable(Boolean authorityEnable) {
        this.authorityEnable = authorityEnable;
        return this;
    }

    /**
     * 是否开启认证。 - true：表示集群开启认证。 - false：表示集群不开启认证。
     * @return authorityEnable
     */
    public Boolean getAuthorityEnable() {
        return authorityEnable;
    }

    public void setAuthorityEnable(Boolean authorityEnable) {
        this.authorityEnable = authorityEnable;
    }

    public ClusterList withDiskEncrypted(Boolean diskEncrypted) {
        this.diskEncrypted = diskEncrypted;
        return this;
    }

    /**
     * 磁盘是否加密。  - true : 磁盘已加密。 - false : 磁盘未加密。
     * @return diskEncrypted
     */
    public Boolean getDiskEncrypted() {
        return diskEncrypted;
    }

    public void setDiskEncrypted(Boolean diskEncrypted) {
        this.diskEncrypted = diskEncrypted;
    }

    public ClusterList withBackupAvailable(Boolean backupAvailable) {
        this.backupAvailable = backupAvailable;
        return this;
    }

    /**
     * 快照是否开启。 - true: 快照开启状态。 - false: 快照关闭状态。
     * @return backupAvailable
     */
    public Boolean getBackupAvailable() {
        return backupAvailable;
    }

    public void setBackupAvailable(Boolean backupAvailable) {
        this.backupAvailable = backupAvailable;
    }

    public ClusterList withActionProgress(Object actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    /**
     * 集群行为进度，显示创建或扩容进度的百分比等。CREATING表示创建的百分比。
     * @return actionProgress
     */
    public Object getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(Object actionProgress) {
        this.actionProgress = actionProgress;
    }

    public ClusterList withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public ClusterList addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ClusterList withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 集群当前行为。REBOOTING表示重启、GROWING表示扩容、RESTORING表示恢复集群、SNAPSHOTTING表示创建快照等。
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public ClusterList withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 集群所属的企业项目ID。 如果集群所属用户没有开通企业项目，则不会返回该参数。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ClusterList withTags(List<ClusterListTags> tags) {
        this.tags = tags;
        return this;
    }

    public ClusterList addTagsItem(ClusterListTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ClusterList withTags(Consumer<List<ClusterListTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 集群标签。
     * @return tags
     */
    public List<ClusterListTags> getTags() {
        return tags;
    }

    public void setTags(List<ClusterListTags> tags) {
        this.tags = tags;
    }

    public ClusterList withFailedReason(ClusterListFailedReasons failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    public ClusterList withFailedReason(Consumer<ClusterListFailedReasons> failedReasonSetter) {
        if (this.failedReason == null) {
            this.failedReason = new ClusterListFailedReasons();
            failedReasonSetter.accept(this.failedReason);
        }

        return this;
    }

    /**
     * Get failedReason
     * @return failedReason
     */
    public ClusterListFailedReasons getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(ClusterListFailedReasons failedReason) {
        this.failedReason = failedReason;
    }

    public ClusterList withPeriod(Boolean period) {
        this.period = period;
        return this;
    }

    /**
     * 是否为包周期集群。 - \"true\" 表示是包周期计费的集群。 - \"false\" 表示是按需计费的集群。
     * @return period
     */
    public Boolean getPeriod() {
        return period;
    }

    public void setPeriod(Boolean period) {
        this.period = period;
    }

    public ClusterList withBandwidthResourceId(String bandwidthResourceId) {
        this.bandwidthResourceId = bandwidthResourceId;
        return this;
    }

    /**
     * es公网访问的资源id。
     * @return bandwidthResourceId
     */
    public String getBandwidthResourceId() {
        return bandwidthResourceId;
    }

    public void setBandwidthResourceId(String bandwidthResourceId) {
        this.bandwidthResourceId = bandwidthResourceId;
    }

    public ClusterList withIpv6Endpoint(String ipv6Endpoint) {
        this.ipv6Endpoint = ipv6Endpoint;
        return this;
    }

    /**
     * 集群内网访问IPv6地址和端口号。
     * @return ipv6Endpoint
     */
    public String getIpv6Endpoint() {
        return ipv6Endpoint;
    }

    public void setIpv6Endpoint(String ipv6Endpoint) {
        this.ipv6Endpoint = ipv6Endpoint;
    }

    public ClusterList withCmkId(String cmkId) {
        this.cmkId = cmkId;
        return this;
    }

    /**
     * 当前集群使用的磁盘加密密钥ID。
     * @return cmkId
     */
    public String getCmkId() {
        return cmkId;
    }

    public void setCmkId(String cmkId) {
        this.cmkId = cmkId;
    }

    public ClusterList withCurrentSubnetIds(String currentSubnetIds) {
        this.currentSubnetIds = currentSubnetIds;
        return this;
    }

    /**
     * 集群节点的当前子网。
     * @return currentSubnetIds
     */
    public String getCurrentSubnetIds() {
        return currentSubnetIds;
    }

    public void setCurrentSubnetIds(String currentSubnetIds) {
        this.currentSubnetIds = currentSubnetIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterList that = (ClusterList) obj;
        return Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.snapshotPolicy, that.snapshotPolicy)
            && Objects.equals(this.instances, that.instances)
            && Objects.equals(this.publicKibanaResp, that.publicKibanaResp)
            && Objects.equals(this.elbWhiteList, that.elbWhiteList) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.name, that.name) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.created, that.created) && Objects.equals(this.id, that.id)
            && Objects.equals(this.status, that.status) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize)
            && Objects.equals(this.httpsEnable, that.httpsEnable)
            && Objects.equals(this.authorityEnable, that.authorityEnable)
            && Objects.equals(this.diskEncrypted, that.diskEncrypted)
            && Objects.equals(this.backupAvailable, that.backupAvailable)
            && Objects.equals(this.actionProgress, that.actionProgress) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.failedReason, that.failedReason)
            && Objects.equals(this.period, that.period)
            && Objects.equals(this.bandwidthResourceId, that.bandwidthResourceId)
            && Objects.equals(this.ipv6Endpoint, that.ipv6Endpoint) && Objects.equals(this.cmkId, that.cmkId)
            && Objects.equals(this.currentSubnetIds, that.currentSubnetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastore,
            snapshotPolicy,
            instances,
            publicKibanaResp,
            elbWhiteList,
            updated,
            name,
            publicIp,
            created,
            id,
            status,
            endpoint,
            vpcId,
            subnetId,
            securityGroupId,
            bandwidthSize,
            httpsEnable,
            authorityEnable,
            diskEncrypted,
            backupAvailable,
            actionProgress,
            actions,
            enterpriseProjectId,
            tags,
            failedReason,
            period,
            bandwidthResourceId,
            ipv6Endpoint,
            cmkId,
            currentSubnetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterList {\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    snapshotPolicy: ").append(toIndentedString(snapshotPolicy)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    publicKibanaResp: ").append(toIndentedString(publicKibanaResp)).append("\n");
        sb.append("    elbWhiteList: ").append(toIndentedString(elbWhiteList)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    httpsEnable: ").append(toIndentedString(httpsEnable)).append("\n");
        sb.append("    authorityEnable: ").append(toIndentedString(authorityEnable)).append("\n");
        sb.append("    diskEncrypted: ").append(toIndentedString(diskEncrypted)).append("\n");
        sb.append("    backupAvailable: ").append(toIndentedString(backupAvailable)).append("\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    bandwidthResourceId: ").append(toIndentedString(bandwidthResourceId)).append("\n");
        sb.append("    ipv6Endpoint: ").append(toIndentedString(ipv6Endpoint)).append("\n");
        sb.append("    cmkId: ").append(toIndentedString(cmkId)).append("\n");
        sb.append("    currentSubnetIds: ").append(toIndentedString(currentSubnetIds)).append("\n");
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
