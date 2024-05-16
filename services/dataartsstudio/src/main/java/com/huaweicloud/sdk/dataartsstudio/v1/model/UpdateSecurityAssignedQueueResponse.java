package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateSecurityAssignedQueueResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_type")

    private String queueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_attr")

    private Integer queueAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conn_id")

    private String connId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conn_name")

    private String connName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateSecurityAssignedQueueResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 队列资源id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateSecurityAssignedQueueResponse withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 队列资源服务名称。
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public UpdateSecurityAssignedQueueResponse withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public UpdateSecurityAssignedQueueResponse withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    /**
     * 队列类型。
     * @return queueType
     */
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public UpdateSecurityAssignedQueueResponse withQueueAttr(Integer queueAttr) {
        this.queueAttr = queueAttr;
        return this;
    }

    /**
     * 队列属性(0:默认,1:实时队列,2:离线队列), 当前只有yarn队列涉及。
     * minimum: 0
     * maximum: 127
     * @return queueAttr
     */
    public Integer getQueueAttr() {
        return queueAttr;
    }

    public void setQueueAttr(Integer queueAttr) {
        this.queueAttr = queueAttr;
    }

    public UpdateSecurityAssignedQueueResponse withConnId(String connId) {
        this.connId = connId;
        return this;
    }

    /**
     * 数据连接id。
     * @return connId
     */
    public String getConnId() {
        return connId;
    }

    public void setConnId(String connId) {
        this.connId = connId;
    }

    public UpdateSecurityAssignedQueueResponse withConnName(String connName) {
        this.connName = connName;
        return this;
    }

    /**
     * 数据连接名称。
     * @return connName
     */
    public String getConnName() {
        return connName;
    }

    public void setConnName(String connName) {
        this.connName = connName;
    }

    public UpdateSecurityAssignedQueueResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateSecurityAssignedQueueResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public UpdateSecurityAssignedQueueResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 队列加入此空间的时间。
     * minimum: 0
     * maximum: 4070880010000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UpdateSecurityAssignedQueueResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 队列加入此的操作人。
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public UpdateSecurityAssignedQueueResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 当前空间下管理的队列更新时间。
     * minimum: 0
     * maximum: 4070880010000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateSecurityAssignedQueueResponse withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 当前空间下管理的队列更新人。
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public UpdateSecurityAssignedQueueResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateSecurityAssignedQueueResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 当前空间分配资源附加的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSecurityAssignedQueueResponse that = (UpdateSecurityAssignedQueueResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.queueName, that.queueName) && Objects.equals(this.queueType, that.queueType)
            && Objects.equals(this.queueAttr, that.queueAttr) && Objects.equals(this.connId, that.connId)
            && Objects.equals(this.connName, that.connName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateUser, that.updateUser) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            sourceType,
            queueName,
            queueType,
            queueAttr,
            connId,
            connName,
            clusterId,
            clusterName,
            createTime,
            createUser,
            updateTime,
            updateUser,
            projectId,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityAssignedQueueResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    queueAttr: ").append(toIndentedString(queueAttr)).append("\n");
        sb.append("    connId: ").append(toIndentedString(connId)).append("\n");
        sb.append("    connName: ").append(toIndentedString(connName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
