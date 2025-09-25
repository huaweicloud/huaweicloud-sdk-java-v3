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
public class ShowClusterDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private ClusterDetailDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<ClusterDetailInstances> instances = null;

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
    @JsonProperty(value = "vpcepIp")

    private String vpcepIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcepIpv6Address")

    private String vpcepIpv6Address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidthSize")

    private Integer bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpsEnable")

    private Boolean httpsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskEncrypted")

    private Boolean diskEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorityEnable")

    private Boolean authorityEnable;

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

    private List<ClusterDetailTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedReason")

    private ClusterDetailFailedReasons failedReason;

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
    @JsonProperty(value = "supportVpcep")

    private Boolean supportVpcep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmkId")

    private String cmkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderId")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentSubnetIds")

    private String currentSubnetIds;

    public ShowClusterDetailResponse withDatastore(ClusterDetailDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public ShowClusterDetailResponse withDatastore(Consumer<ClusterDetailDatastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new ClusterDetailDatastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public ClusterDetailDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(ClusterDetailDatastore datastore) {
        this.datastore = datastore;
    }

    public ShowClusterDetailResponse withInstances(List<ClusterDetailInstances> instances) {
        this.instances = instances;
        return this;
    }

    public ShowClusterDetailResponse addInstancesItem(ClusterDetailInstances instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ShowClusterDetailResponse withInstances(Consumer<List<ClusterDetailInstances>> instancesSetter) {
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
    public List<ClusterDetailInstances> getInstances() {
        return instances;
    }

    public void setInstances(List<ClusterDetailInstances> instances) {
        this.instances = instances;
    }

    public ShowClusterDetailResponse withPublicKibanaResp(PublicKibanaRespBody publicKibanaResp) {
        this.publicKibanaResp = publicKibanaResp;
        return this;
    }

    public ShowClusterDetailResponse withPublicKibanaResp(Consumer<PublicKibanaRespBody> publicKibanaRespSetter) {
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

    public ShowClusterDetailResponse withElbWhiteList(ElbWhiteListResp elbWhiteList) {
        this.elbWhiteList = elbWhiteList;
        return this;
    }

    public ShowClusterDetailResponse withElbWhiteList(Consumer<ElbWhiteListResp> elbWhiteListSetter) {
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

    public ShowClusterDetailResponse withUpdated(String updated) {
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

    public ShowClusterDetailResponse withName(String name) {
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

    public ShowClusterDetailResponse withPublicIp(String publicIp) {
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

    public ShowClusterDetailResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 集群创建时间，格式为ISO8601： CCYY-MM-DDThh:mm:ss。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowClusterDetailResponse withId(String id) {
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

    public ShowClusterDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 集群状态值。  - 100：操作进行中，如创建中。 - 200：可用。 - 303：不可用，如创建失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowClusterDetailResponse withEndpoint(String endpoint) {
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

    public ShowClusterDetailResponse withVpcId(String vpcId) {
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

    public ShowClusterDetailResponse withSubnetId(String subnetId) {
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

    public ShowClusterDetailResponse withSecurityGroupId(String securityGroupId) {
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

    public ShowClusterDetailResponse withVpcepIp(String vpcepIp) {
        this.vpcepIp = vpcepIp;
        return this;
    }

    /**
     * 终端节点IP。
     * @return vpcepIp
     */
    public String getVpcepIp() {
        return vpcepIp;
    }

    public void setVpcepIp(String vpcepIp) {
        this.vpcepIp = vpcepIp;
    }

    public ShowClusterDetailResponse withVpcepIpv6Address(String vpcepIpv6Address) {
        this.vpcepIpv6Address = vpcepIpv6Address;
        return this;
    }

    /**
     * 终端节点IPv6。
     * @return vpcepIpv6Address
     */
    public String getVpcepIpv6Address() {
        return vpcepIpv6Address;
    }

    public void setVpcepIpv6Address(String vpcepIpv6Address) {
        this.vpcepIpv6Address = vpcepIpv6Address;
    }

    public ShowClusterDetailResponse withBandwidthSize(Integer bandwidthSize) {
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

    public ShowClusterDetailResponse withHttpsEnable(Boolean httpsEnable) {
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

    public ShowClusterDetailResponse withDiskEncrypted(Boolean diskEncrypted) {
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

    public ShowClusterDetailResponse withAuthorityEnable(Boolean authorityEnable) {
        this.authorityEnable = authorityEnable;
        return this;
    }

    /**
     * 是否开启认证，取值范围为true或false。默认关闭认证功能。 - true：表示集群开启认证。 - false：表示集群不开启认证。
     * @return authorityEnable
     */
    public Boolean getAuthorityEnable() {
        return authorityEnable;
    }

    public void setAuthorityEnable(Boolean authorityEnable) {
        this.authorityEnable = authorityEnable;
    }

    public ShowClusterDetailResponse withBackupAvailable(Boolean backupAvailable) {
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

    public ShowClusterDetailResponse withActionProgress(Object actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    /**
     * 集群行为进度，显示创建或扩容进度的百分比。
     * @return actionProgress
     */
    public Object getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(Object actionProgress) {
        this.actionProgress = actionProgress;
    }

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

    public ShowClusterDetailResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 集群所属的企业项目ID。  如果集群所属用户没有开通企业项目，则不会返回该参数。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowClusterDetailResponse withTags(List<ClusterDetailTags> tags) {
        this.tags = tags;
        return this;
    }

    public ShowClusterDetailResponse addTagsItem(ClusterDetailTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowClusterDetailResponse withTags(Consumer<List<ClusterDetailTags>> tagsSetter) {
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
    public List<ClusterDetailTags> getTags() {
        return tags;
    }

    public void setTags(List<ClusterDetailTags> tags) {
        this.tags = tags;
    }

    public ShowClusterDetailResponse withFailedReason(ClusterDetailFailedReasons failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    public ShowClusterDetailResponse withFailedReason(Consumer<ClusterDetailFailedReasons> failedReasonSetter) {
        if (this.failedReason == null) {
            this.failedReason = new ClusterDetailFailedReasons();
            failedReasonSetter.accept(this.failedReason);
        }

        return this;
    }

    /**
     * Get failedReason
     * @return failedReason
     */
    public ClusterDetailFailedReasons getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(ClusterDetailFailedReasons failedReason) {
        this.failedReason = failedReason;
    }

    public ShowClusterDetailResponse withPeriod(Boolean period) {
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

    public ShowClusterDetailResponse withBandwidthResourceId(String bandwidthResourceId) {
        this.bandwidthResourceId = bandwidthResourceId;
        return this;
    }

    /**
     * es公网访问的资源id
     * @return bandwidthResourceId
     */
    public String getBandwidthResourceId() {
        return bandwidthResourceId;
    }

    public void setBandwidthResourceId(String bandwidthResourceId) {
        this.bandwidthResourceId = bandwidthResourceId;
    }

    public ShowClusterDetailResponse withIpv6Endpoint(String ipv6Endpoint) {
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

    public ShowClusterDetailResponse withSupportVpcep(Boolean supportVpcep) {
        this.supportVpcep = supportVpcep;
        return this;
    }

    /**
     * 当前集群是否支持开启终端节点服务。
     * @return supportVpcep
     */
    public Boolean getSupportVpcep() {
        return supportVpcep;
    }

    public void setSupportVpcep(Boolean supportVpcep) {
        this.supportVpcep = supportVpcep;
    }

    public ShowClusterDetailResponse withCmkId(String cmkId) {
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

    public ShowClusterDetailResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 包周期集群的订单号。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ShowClusterDetailResponse withCurrentSubnetIds(String currentSubnetIds) {
        this.currentSubnetIds = currentSubnetIds;
        return this;
    }

    /**
     * 集群当前所有节点用到的子网，如果存在多个（最多支持两个），使用英文逗号隔开。
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
        ShowClusterDetailResponse that = (ShowClusterDetailResponse) obj;
        return Objects.equals(this.datastore, that.datastore) && Objects.equals(this.instances, that.instances)
            && Objects.equals(this.publicKibanaResp, that.publicKibanaResp)
            && Objects.equals(this.elbWhiteList, that.elbWhiteList) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.name, that.name) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.created, that.created) && Objects.equals(this.id, that.id)
            && Objects.equals(this.status, that.status) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId) && Objects.equals(this.vpcepIp, that.vpcepIp)
            && Objects.equals(this.vpcepIpv6Address, that.vpcepIpv6Address)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize)
            && Objects.equals(this.httpsEnable, that.httpsEnable)
            && Objects.equals(this.diskEncrypted, that.diskEncrypted)
            && Objects.equals(this.authorityEnable, that.authorityEnable)
            && Objects.equals(this.backupAvailable, that.backupAvailable)
            && Objects.equals(this.actionProgress, that.actionProgress) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.failedReason, that.failedReason)
            && Objects.equals(this.period, that.period)
            && Objects.equals(this.bandwidthResourceId, that.bandwidthResourceId)
            && Objects.equals(this.ipv6Endpoint, that.ipv6Endpoint)
            && Objects.equals(this.supportVpcep, that.supportVpcep) && Objects.equals(this.cmkId, that.cmkId)
            && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.currentSubnetIds, that.currentSubnetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastore,
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
            vpcepIp,
            vpcepIpv6Address,
            bandwidthSize,
            httpsEnable,
            diskEncrypted,
            authorityEnable,
            backupAvailable,
            actionProgress,
            actions,
            enterpriseProjectId,
            tags,
            failedReason,
            period,
            bandwidthResourceId,
            ipv6Endpoint,
            supportVpcep,
            cmkId,
            orderId,
            currentSubnetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterDetailResponse {\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
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
        sb.append("    vpcepIp: ").append(toIndentedString(vpcepIp)).append("\n");
        sb.append("    vpcepIpv6Address: ").append(toIndentedString(vpcepIpv6Address)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    httpsEnable: ").append(toIndentedString(httpsEnable)).append("\n");
        sb.append("    diskEncrypted: ").append(toIndentedString(diskEncrypted)).append("\n");
        sb.append("    authorityEnable: ").append(toIndentedString(authorityEnable)).append("\n");
        sb.append("    backupAvailable: ").append(toIndentedString(backupAvailable)).append("\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    bandwidthResourceId: ").append(toIndentedString(bandwidthResourceId)).append("\n");
        sb.append("    ipv6Endpoint: ").append(toIndentedString(ipv6Endpoint)).append("\n");
        sb.append("    supportVpcep: ").append(toIndentedString(supportVpcep)).append("\n");
        sb.append("    cmkId: ").append(toIndentedString(cmkId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
