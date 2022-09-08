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
    @JsonProperty(value = "failed_reasons")

    private ClusterDetailFailedReasons failedReasons;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Boolean period;

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

    public ShowClusterDetailResponse withFailedReasons(ClusterDetailFailedReasons failedReasons) {
        this.failedReasons = failedReasons;
        return this;
    }

    public ShowClusterDetailResponse withFailedReasons(Consumer<ClusterDetailFailedReasons> failedReasonsSetter) {
        if (this.failedReasons == null) {
            this.failedReasons = new ClusterDetailFailedReasons();
            failedReasonsSetter.accept(this.failedReasons);
        }

        return this;
    }

    /**
     * Get failedReasons
     * @return failedReasons
     */
    public ClusterDetailFailedReasons getFailedReasons() {
        return failedReasons;
    }

    public void setFailedReasons(ClusterDetailFailedReasons failedReasons) {
        this.failedReasons = failedReasons;
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowClusterDetailResponse showClusterDetailResponse = (ShowClusterDetailResponse) o;
        return Objects.equals(this.datastore, showClusterDetailResponse.datastore)
            && Objects.equals(this.instances, showClusterDetailResponse.instances)
            && Objects.equals(this.publicKibanaResp, showClusterDetailResponse.publicKibanaResp)
            && Objects.equals(this.elbWhiteList, showClusterDetailResponse.elbWhiteList)
            && Objects.equals(this.updated, showClusterDetailResponse.updated)
            && Objects.equals(this.name, showClusterDetailResponse.name)
            && Objects.equals(this.publicIp, showClusterDetailResponse.publicIp)
            && Objects.equals(this.created, showClusterDetailResponse.created)
            && Objects.equals(this.id, showClusterDetailResponse.id)
            && Objects.equals(this.status, showClusterDetailResponse.status)
            && Objects.equals(this.endpoint, showClusterDetailResponse.endpoint)
            && Objects.equals(this.vpcId, showClusterDetailResponse.vpcId)
            && Objects.equals(this.subnetId, showClusterDetailResponse.subnetId)
            && Objects.equals(this.securityGroupId, showClusterDetailResponse.securityGroupId)
            && Objects.equals(this.vpcepIp, showClusterDetailResponse.vpcepIp)
            && Objects.equals(this.bandwidthSize, showClusterDetailResponse.bandwidthSize)
            && Objects.equals(this.httpsEnable, showClusterDetailResponse.httpsEnable)
            && Objects.equals(this.diskEncrypted, showClusterDetailResponse.diskEncrypted)
            && Objects.equals(this.authorityEnable, showClusterDetailResponse.authorityEnable)
            && Objects.equals(this.backupAvailable, showClusterDetailResponse.backupAvailable)
            && Objects.equals(this.actionProgress, showClusterDetailResponse.actionProgress)
            && Objects.equals(this.actions, showClusterDetailResponse.actions)
            && Objects.equals(this.enterpriseProjectId, showClusterDetailResponse.enterpriseProjectId)
            && Objects.equals(this.tags, showClusterDetailResponse.tags)
            && Objects.equals(this.failedReasons, showClusterDetailResponse.failedReasons)
            && Objects.equals(this.period, showClusterDetailResponse.period);
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
            bandwidthSize,
            httpsEnable,
            diskEncrypted,
            authorityEnable,
            backupAvailable,
            actionProgress,
            actions,
            enterpriseProjectId,
            tags,
            failedReasons,
            period);
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
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    httpsEnable: ").append(toIndentedString(httpsEnable)).append("\n");
        sb.append("    diskEncrypted: ").append(toIndentedString(diskEncrypted)).append("\n");
        sb.append("    authorityEnable: ").append(toIndentedString(authorityEnable)).append("\n");
        sb.append("    backupAvailable: ").append(toIndentedString(backupAvailable)).append("\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    failedReasons: ").append(toIndentedString(failedReasons)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
