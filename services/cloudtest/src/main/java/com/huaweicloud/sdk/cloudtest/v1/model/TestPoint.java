package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TestPoint
 */
public class TestPoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_num")

    private String creatorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private String deleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private String deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mindmap_id")

    private String mindmapId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requirement_id")

    private String requirementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requirement_name")

    private String requirementName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_type")

    private String statusType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tc_counts")

    private String tcCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_cases")

    private String testCases;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_name")

    private String updateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_num")

    private String updateNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public TestPoint withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * app
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public TestPoint withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TestPoint withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public TestPoint withCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
        return this;
    }

    /**
     * 创建人工号
     * @return creatorNum
     */
    public String getCreatorNum() {
        return creatorNum;
    }

    public void setCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
    }

    public TestPoint withDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * 删除时间
     * @return deleteTime
     */
    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public TestPoint withDeleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * 逻辑删除字段
     * @return deleted
     */
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public TestPoint withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public TestPoint withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id 主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TestPoint withMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
        return this;
    }

    /**
     * 脑图id
     * @return mindmapId
     */
    public String getMindmapId() {
        return mindmapId;
    }

    public void setMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
    }

    public TestPoint withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestPoint withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点id
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TestPoint withRequirementId(String requirementId) {
        this.requirementId = requirementId;
        return this;
    }

    /**
     * 需求id
     * @return requirementId
     */
    public String getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    public TestPoint withRequirementName(String requirementName) {
        this.requirementName = requirementName;
        return this;
    }

    /**
     * 需求名称
     * @return requirementName
     */
    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public TestPoint withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务id
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public TestPoint withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TestPoint withStatusType(String statusType) {
        this.statusType = statusType;
        return this;
    }

    /**
     * 状体类型
     * @return statusType
     */
    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public TestPoint withTcCounts(String tcCounts) {
        this.tcCounts = tcCounts;
        return this;
    }

    /**
     * tc数量
     * @return tcCounts
     */
    public String getTcCounts() {
        return tcCounts;
    }

    public void setTcCounts(String tcCounts) {
        this.tcCounts = tcCounts;
    }

    public TestPoint withTestCases(String testCases) {
        this.testCases = testCases;
        return this;
    }

    /**
     * 测试用例
     * @return testCases
     */
    public String getTestCases() {
        return testCases;
    }

    public void setTestCases(String testCases) {
        this.testCases = testCases;
    }

    public TestPoint withUpdateName(String updateName) {
        this.updateName = updateName;
        return this;
    }

    /**
     * 更新人名称
     * @return updateName
     */
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public TestPoint withUpdateNum(String updateNum) {
        this.updateNum = updateNum;
        return this;
    }

    /**
     * 更新人工号
     * @return updateNum
     */
    public String getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(String updateNum) {
        this.updateNum = updateNum;
    }

    public TestPoint withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public TestPoint withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestPoint that = (TestPoint) obj;
        return Objects.equals(this.app, that.app) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.creatorNum, that.creatorNum)
            && Objects.equals(this.deleteTime, that.deleteTime) && Objects.equals(this.deleted, that.deleted)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.mindmapId, that.mindmapId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.requirementId, that.requirementId)
            && Objects.equals(this.requirementName, that.requirementName)
            && Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusType, that.statusType) && Objects.equals(this.tcCounts, that.tcCounts)
            && Objects.equals(this.testCases, that.testCases) && Objects.equals(this.updateName, that.updateName)
            && Objects.equals(this.updateNum, that.updateNum) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app,
            createTime,
            creatorName,
            creatorNum,
            deleteTime,
            deleted,
            groupId,
            id,
            mindmapId,
            name,
            nodeId,
            requirementId,
            requirementName,
            serviceId,
            status,
            statusType,
            tcCounts,
            testCases,
            updateName,
            updateNum,
            updateTime,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestPoint {\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    creatorNum: ").append(toIndentedString(creatorNum)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mindmapId: ").append(toIndentedString(mindmapId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    requirementId: ").append(toIndentedString(requirementId)).append("\n");
        sb.append("    requirementName: ").append(toIndentedString(requirementName)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
        sb.append("    tcCounts: ").append(toIndentedString(tcCounts)).append("\n");
        sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
        sb.append("    updateName: ").append(toIndentedString(updateName)).append("\n");
        sb.append("    updateNum: ").append(toIndentedString(updateNum)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
