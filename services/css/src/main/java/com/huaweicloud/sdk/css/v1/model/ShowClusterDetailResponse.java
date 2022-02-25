package com.huaweicloud.sdk.css.v1.model;

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
    @JsonProperty(value = "datastore")

    private ClusterDetailDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<ClusterDetailInstances> instances = null;

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

    private ClusterDetailActionProgress actionProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<ActionReq> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reasons")

    private ClusterDetailFailedReasons failedReasons;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorityEnable")

    private Boolean authorityEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpsEnable")

    private Boolean httpsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ClusterDetailTags> tags = null;

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

    /** Get datastore
     * 
     * @return datastore */
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

    /** 节点对象列表。
     * 
     * @return instances */
    public List<ClusterDetailInstances> getInstances() {
        return instances;
    }

    public void setInstances(List<ClusterDetailInstances> instances) {
        this.instances = instances;
    }

    public ShowClusterDetailResponse withUpdated(String updated) {
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

    public ShowClusterDetailResponse withName(String name) {
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

    public ShowClusterDetailResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /** 集群创建时间，格式为ISO8601: CCYY-MM-DDThh:mm:ss。
     * 
     * @return created */
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

    /** 集群ID。
     * 
     * @return id */
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

    /** 查询返回值。 - 100：操作进行中，如创建中。 - 200：可用。 - 303：不可用，如创建失败。
     * 
     * @return status */
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

    /** 用户VPC访问IP地址和端口号。
     * 
     * @return endpoint */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ShowClusterDetailResponse withActionProgress(ClusterDetailActionProgress actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    public ShowClusterDetailResponse withActionProgress(Consumer<ClusterDetailActionProgress> actionProgressSetter) {
        if (this.actionProgress == null) {
            this.actionProgress = new ClusterDetailActionProgress();
            actionProgressSetter.accept(this.actionProgress);
        }

        return this;
    }

    /** Get actionProgress
     * 
     * @return actionProgress */
    public ClusterDetailActionProgress getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(ClusterDetailActionProgress actionProgress) {
        this.actionProgress = actionProgress;
    }

    public ShowClusterDetailResponse withActions(List<ActionReq> actions) {
        this.actions = actions;
        return this;
    }

    public ShowClusterDetailResponse addActionsItem(ActionReq actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ShowClusterDetailResponse withActions(Consumer<List<ActionReq>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /** 集群当前行为集合。
     * 
     * @return actions */
    public List<ActionReq> getActions() {
        return actions;
    }

    public void setActions(List<ActionReq> actions) {
        this.actions = actions;
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

    /** Get failedReasons
     * 
     * @return failedReasons */
    public ClusterDetailFailedReasons getFailedReasons() {
        return failedReasons;
    }

    public void setFailedReasons(ClusterDetailFailedReasons failedReasons) {
        this.failedReasons = failedReasons;
    }

    public ShowClusterDetailResponse withAuthorityEnable(Boolean authorityEnable) {
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

    public ShowClusterDetailResponse withHttpsEnable(Boolean httpsEnable) {
        this.httpsEnable = httpsEnable;
        return this;
    }

    /** Get httpsEnable
     * 
     * @return httpsEnable */
    public Boolean getHttpsEnable() {
        return httpsEnable;
    }

    public void setHttpsEnable(Boolean httpsEnable) {
        this.httpsEnable = httpsEnable;
    }

    public ShowClusterDetailResponse withEnterpriseProjectId(String enterpriseProjectId) {
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

    /** 集群标签。
     * 
     * @return tags */
    public List<ClusterDetailTags> getTags() {
        return tags;
    }

    public void setTags(List<ClusterDetailTags> tags) {
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
        ShowClusterDetailResponse showClusterDetailResponse = (ShowClusterDetailResponse) o;
        return Objects.equals(this.datastore, showClusterDetailResponse.datastore)
            && Objects.equals(this.instances, showClusterDetailResponse.instances)
            && Objects.equals(this.updated, showClusterDetailResponse.updated)
            && Objects.equals(this.name, showClusterDetailResponse.name)
            && Objects.equals(this.created, showClusterDetailResponse.created)
            && Objects.equals(this.id, showClusterDetailResponse.id)
            && Objects.equals(this.status, showClusterDetailResponse.status)
            && Objects.equals(this.endpoint, showClusterDetailResponse.endpoint)
            && Objects.equals(this.actionProgress, showClusterDetailResponse.actionProgress)
            && Objects.equals(this.actions, showClusterDetailResponse.actions)
            && Objects.equals(this.failedReasons, showClusterDetailResponse.failedReasons)
            && Objects.equals(this.authorityEnable, showClusterDetailResponse.authorityEnable)
            && Objects.equals(this.httpsEnable, showClusterDetailResponse.httpsEnable)
            && Objects.equals(this.enterpriseProjectId, showClusterDetailResponse.enterpriseProjectId)
            && Objects.equals(this.tags, showClusterDetailResponse.tags);
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
            httpsEnable,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterDetailResponse {\n");
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
        sb.append("    httpsEnable: ").append(toIndentedString(httpsEnable)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
