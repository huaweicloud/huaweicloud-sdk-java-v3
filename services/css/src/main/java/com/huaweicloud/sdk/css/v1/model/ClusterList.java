package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 集群对象。 */
public class ClusterList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private ClusterListDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<ClusterListInstances> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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
    @JsonProperty(value = "actionProgress")

    private ClusterListActionProgress actionProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reasons")

    private ClusterListFailedReasons failedReasons;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorityEnable")

    private Boolean authorityEnable;

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
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Boolean period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpsEnable")

    private Boolean httpsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ClusterListTags> tags = null;

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

    /** Get datastore
     * 
     * @return datastore */
    public ClusterListDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(ClusterListDatastore datastore) {
        this.datastore = datastore;
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

    /** 节点对象列表。
     * 
     * @return instances */
    public List<ClusterListInstances> getInstances() {
        return instances;
    }

    public void setInstances(List<ClusterListInstances> instances) {
        this.instances = instances;
    }

    public ClusterList withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /** 集群上次修改时间，格式为ISO8601: CCYY-MM-DDThh:mm:ss。
     * 
     * @return updated */
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

    /** 集群名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterList withCreated(String created) {
        this.created = created;
        return this;
    }

    /** 集群创建时间，格式为ISO8601: CCYY-MM-DDThh:mm:ss。 说明：返回的集群列表信息按照创建时间降序排序，即创建时间最新的集群排在最前。
     * 
     * @return created */
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

    /** 集群ID。
     * 
     * @return id */
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

    /** 查询返回值。 - 100：创建中。 - 200：可用。 - 303：不可用，如创建失败。
     * 
     * @return status */
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

    /** 用户VPC访问IP地址和端口号。
     * 
     * @return endpoint */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ClusterList withActionProgress(ClusterListActionProgress actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    public ClusterList withActionProgress(Consumer<ClusterListActionProgress> actionProgressSetter) {
        if (this.actionProgress == null) {
            this.actionProgress = new ClusterListActionProgress();
            actionProgressSetter.accept(this.actionProgress);
        }

        return this;
    }

    /** Get actionProgress
     * 
     * @return actionProgress */
    public ClusterListActionProgress getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(ClusterListActionProgress actionProgress) {
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

    /** 集群当前行为，REBOOTING表示重启，GROWING表示扩容，RESTORING表示恢复集群，SNAPSHOTTING表示创建快照。
     * 
     * @return actions */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public ClusterList withFailedReasons(ClusterListFailedReasons failedReasons) {
        this.failedReasons = failedReasons;
        return this;
    }

    public ClusterList withFailedReasons(Consumer<ClusterListFailedReasons> failedReasonsSetter) {
        if (this.failedReasons == null) {
            this.failedReasons = new ClusterListFailedReasons();
            failedReasonsSetter.accept(this.failedReasons);
        }

        return this;
    }

    /** Get failedReasons
     * 
     * @return failedReasons */
    public ClusterListFailedReasons getFailedReasons() {
        return failedReasons;
    }

    public void setFailedReasons(ClusterListFailedReasons failedReasons) {
        this.failedReasons = failedReasons;
    }

    public ClusterList withAuthorityEnable(Boolean authorityEnable) {
        this.authorityEnable = authorityEnable;
        return this;
    }

    /** 是否开启认证，取值范围为true或false。默认关闭认证功能。当开启认证时，httpsEnable需要设置为true。 - true：表示集群开启认证。 - false：表示集群不开启认证。
     * 
     * @return authorityEnable */
    public Boolean getAuthorityEnable() {
        return authorityEnable;
    }

    public void setAuthorityEnable(Boolean authorityEnable) {
        this.authorityEnable = authorityEnable;
    }

    public ClusterList withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** VPC ID。
     * 
     * @return vpcId */
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

    /** 子网ID。
     * 
     * @return subnetId */
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

    /** 安全组ID。
     * 
     * @return securityGroupId */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ClusterList withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 集群所属的企业项目ID。 如果集群所属用户没有开通企业项目，则不会返回该参数。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ClusterList withPeriod(Boolean period) {
        this.period = period;
        return this;
    }

    /** Get period
     * 
     * @return period */
    public Boolean getPeriod() {
        return period;
    }

    public void setPeriod(Boolean period) {
        this.period = period;
    }

    public ClusterList withHttpsEnable(Boolean httpsEnable) {
        this.httpsEnable = httpsEnable;
        return this;
    }

    /** 是否开启https访问
     * 
     * @return httpsEnable */
    public Boolean getHttpsEnable() {
        return httpsEnable;
    }

    public void setHttpsEnable(Boolean httpsEnable) {
        this.httpsEnable = httpsEnable;
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

    /** 集群标签。
     * 
     * @return tags */
    public List<ClusterListTags> getTags() {
        return tags;
    }

    public void setTags(List<ClusterListTags> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterList clusterList = (ClusterList) o;
        return Objects.equals(this.datastore, clusterList.datastore)
            && Objects.equals(this.instances, clusterList.instances)
            && Objects.equals(this.updated, clusterList.updated) && Objects.equals(this.name, clusterList.name)
            && Objects.equals(this.created, clusterList.created) && Objects.equals(this.id, clusterList.id)
            && Objects.equals(this.status, clusterList.status) && Objects.equals(this.endpoint, clusterList.endpoint)
            && Objects.equals(this.actionProgress, clusterList.actionProgress)
            && Objects.equals(this.actions, clusterList.actions)
            && Objects.equals(this.failedReasons, clusterList.failedReasons)
            && Objects.equals(this.authorityEnable, clusterList.authorityEnable)
            && Objects.equals(this.vpcId, clusterList.vpcId) && Objects.equals(this.subnetId, clusterList.subnetId)
            && Objects.equals(this.securityGroupId, clusterList.securityGroupId)
            && Objects.equals(this.enterpriseProjectId, clusterList.enterpriseProjectId)
            && Objects.equals(this.period, clusterList.period)
            && Objects.equals(this.httpsEnable, clusterList.httpsEnable) && Objects.equals(this.tags, clusterList.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastore,
            instances,
            updated,
            name,
            created,
            id,
            status,
            endpoint,
            actionProgress,
            actions,
            failedReasons,
            authorityEnable,
            vpcId,
            subnetId,
            securityGroupId,
            enterpriseProjectId,
            period,
            httpsEnable,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterList {\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    failedReasons: ").append(toIndentedString(failedReasons)).append("\n");
        sb.append("    authorityEnable: ").append(toIndentedString(authorityEnable)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    httpsEnable: ").append(toIndentedString(httpsEnable)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
