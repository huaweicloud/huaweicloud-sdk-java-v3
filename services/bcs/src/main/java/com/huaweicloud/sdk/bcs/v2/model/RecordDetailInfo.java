package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 操作记录详细信息 */
public class RecordDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_id")

    private String blockchainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_name")

    private String blockchainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_info")

    private OprecordCluster clusterInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_process")

    private Map<String, ProcessInfo> operationProcess = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_status")

    private String operationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private List<String> message = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    public RecordDetailInfo withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /** 操作记录ID
     * 
     * @return operationId */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public RecordDetailInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /** 资源类型
     * 
     * @return resourceType */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public RecordDetailInfo withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /** 操作类型
     * 
     * @return operationType */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public RecordDetailInfo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 租户ID
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public RecordDetailInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目ID
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RecordDetailInfo withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /** 区块链ID
     * 
     * @return blockchainId */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    public RecordDetailInfo withBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
        return this;
    }

    /** 区块链名称
     * 
     * @return blockchainName */
    public String getBlockchainName() {
        return blockchainName;
    }

    public void setBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
    }

    public RecordDetailInfo withClusterInfo(OprecordCluster clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }

    public RecordDetailInfo withClusterInfo(Consumer<OprecordCluster> clusterInfoSetter) {
        if (this.clusterInfo == null) {
            this.clusterInfo = new OprecordCluster();
            clusterInfoSetter.accept(this.clusterInfo);
        }

        return this;
    }

    /** Get clusterInfo
     * 
     * @return clusterInfo */
    public OprecordCluster getClusterInfo() {
        return clusterInfo;
    }

    public void setClusterInfo(OprecordCluster clusterInfo) {
        this.clusterInfo = clusterInfo;
    }

    public RecordDetailInfo withOperationProcess(Map<String, ProcessInfo> operationProcess) {
        this.operationProcess = operationProcess;
        return this;
    }

    public RecordDetailInfo putOperationProcessItem(String key, ProcessInfo operationProcessItem) {
        if (this.operationProcess == null) {
            this.operationProcess = new HashMap<>();
        }
        this.operationProcess.put(key, operationProcessItem);
        return this;
    }

    public RecordDetailInfo withOperationProcess(Consumer<Map<String, ProcessInfo>> operationProcessSetter) {
        if (this.operationProcess == null) {
            this.operationProcess = new HashMap<>();
        }
        operationProcessSetter.accept(this.operationProcess);
        return this;
    }

    /** 操作流程，key为流程名，value为流程信息
     * 
     * @return operationProcess */
    public Map<String, ProcessInfo> getOperationProcess() {
        return operationProcess;
    }

    public void setOperationProcess(Map<String, ProcessInfo> operationProcess) {
        this.operationProcess = operationProcess;
    }

    public RecordDetailInfo withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /** 记录更新时间
     * 
     * @return recordTime */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    public RecordDetailInfo withOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    /** 操作状态
     * 
     * @return operationStatus */
    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public RecordDetailInfo withMessage(List<String> message) {
        this.message = message;
        return this;
    }

    public RecordDetailInfo addMessageItem(String messageItem) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        this.message.add(messageItem);
        return this;
    }

    public RecordDetailInfo withMessage(Consumer<List<String>> messageSetter) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        messageSetter.accept(this.message);
        return this;
    }

    /** 操作过程信息记录
     * 
     * @return message */
    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public RecordDetailInfo withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /** 操作描述
     * 
     * @return desc */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordDetailInfo recordDetailInfo = (RecordDetailInfo) o;
        return Objects.equals(this.operationId, recordDetailInfo.operationId)
            && Objects.equals(this.resourceType, recordDetailInfo.resourceType)
            && Objects.equals(this.operationType, recordDetailInfo.operationType)
            && Objects.equals(this.domainId, recordDetailInfo.domainId)
            && Objects.equals(this.projectId, recordDetailInfo.projectId)
            && Objects.equals(this.blockchainId, recordDetailInfo.blockchainId)
            && Objects.equals(this.blockchainName, recordDetailInfo.blockchainName)
            && Objects.equals(this.clusterInfo, recordDetailInfo.clusterInfo)
            && Objects.equals(this.operationProcess, recordDetailInfo.operationProcess)
            && Objects.equals(this.recordTime, recordDetailInfo.recordTime)
            && Objects.equals(this.operationStatus, recordDetailInfo.operationStatus)
            && Objects.equals(this.message, recordDetailInfo.message)
            && Objects.equals(this.desc, recordDetailInfo.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId,
            resourceType,
            operationType,
            domainId,
            projectId,
            blockchainId,
            blockchainName,
            clusterInfo,
            operationProcess,
            recordTime,
            operationStatus,
            message,
            desc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordDetailInfo {\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    blockchainName: ").append(toIndentedString(blockchainName)).append("\n");
        sb.append("    clusterInfo: ").append(toIndentedString(clusterInfo)).append("\n");
        sb.append("    operationProcess: ").append(toIndentedString(operationProcess)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
