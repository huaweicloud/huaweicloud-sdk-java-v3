package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 诊断记录详情对象
 */
public class DiagnosisTaskDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_order_id")

    private String workOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_num")

    private Integer instanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    private List<DiagnosisTaskNode> nodeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public DiagnosisTaskDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DiagnosisTaskDetail withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DiagnosisTaskDetail withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 诊断记录所属租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public DiagnosisTaskDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 被诊断实例所属项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DiagnosisTaskDetail withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 诊断记录所属用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DiagnosisTaskDetail withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 诊断记录所属用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DiagnosisTaskDetail withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 诊断进度
     * minimum: 0
     * maximum: 100
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public DiagnosisTaskDetail withWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
        return this;
    }

    /**
     * 诊断任务工单ID
     * @return workOrderId
     */
    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public DiagnosisTaskDetail withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 被诊断的实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DiagnosisTaskDetail withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 被诊断的实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public DiagnosisTaskDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 被诊断实例类别，ECS、RDS等
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DiagnosisTaskDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 诊断任务状态执行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DiagnosisTaskDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 创建时间，遵循RFC3339规范，精确到秒 示例：2020-09-01T18:50:20Z
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public DiagnosisTaskDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，遵循RFC3339规范，精确到秒 示例：2020-09-01T18:50:20Z
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DiagnosisTaskDetail withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    /**
     * 被诊断实例的数量
     * minimum: 1
     * maximum: 200
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    public DiagnosisTaskDetail withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 被诊断实例的操作系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public DiagnosisTaskDetail withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 诊断资源所属局点
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DiagnosisTaskDetail withNodeList(List<DiagnosisTaskNode> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public DiagnosisTaskDetail addNodeListItem(DiagnosisTaskNode nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public DiagnosisTaskDetail withNodeList(Consumer<List<DiagnosisTaskNode>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * 诊断步骤
     * @return nodeList
     */
    public List<DiagnosisTaskNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<DiagnosisTaskNode> nodeList) {
        this.nodeList = nodeList;
    }

    public DiagnosisTaskDetail withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 诊断结果
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiagnosisTaskDetail that = (DiagnosisTaskDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.code, that.code)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.progress, that.progress) && Objects.equals(this.workOrderId, that.workOrderId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.instanceNum, that.instanceNum) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.region, that.region) && Objects.equals(this.nodeList, that.nodeList)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            code,
            domainId,
            projectId,
            userId,
            userName,
            progress,
            workOrderId,
            instanceId,
            instanceName,
            type,
            status,
            startTime,
            endTime,
            instanceNum,
            osType,
            region,
            nodeList,
            message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisTaskDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
