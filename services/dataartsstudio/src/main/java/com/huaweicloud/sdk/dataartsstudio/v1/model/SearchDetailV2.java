package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SearchDetailV2
 */
public class SearchDetailV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dgc_instance_id")

    private String dgcInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_type")

    private String docType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_save_or_commit")

    private String newSaveOrCommit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private Long lastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_params")

    private String jobParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_type")

    private String scriptType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_params")

    private String scriptParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cdm_cluster_name")

    private String cdmClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cdm_job_name")

    private String cdmJobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cdm_params")

    private String cdmParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_node_job_type")

    private String singleNodeJobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_state")

    private String scheduleState;

    public SearchDetailV2 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识符
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SearchDetailV2 withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public SearchDetailV2 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public SearchDetailV2 withDgcInstanceId(String dgcInstanceId) {
        this.dgcInstanceId = dgcInstanceId;
        return this;
    }

    /**
     * DGC实例ID
     * @return dgcInstanceId
     */
    public String getDgcInstanceId() {
        return dgcInstanceId;
    }

    public void setDgcInstanceId(String dgcInstanceId) {
        this.dgcInstanceId = dgcInstanceId;
    }

    public SearchDetailV2 withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public SearchDetailV2 withDocType(String docType) {
        this.docType = docType;
        return this;
    }

    /**
     * 搜索范围: （多选） 默认为全部。 - node: 开发作业 - script: 脚本
     * @return docType
     */
    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public SearchDetailV2 withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 负责人
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public SearchDetailV2 withNewSaveOrCommit(String newSaveOrCommit) {
        this.newSaveOrCommit = newSaveOrCommit;
        return this;
    }

    /**
     * 最新修改:  默认为save: 最新保存 - save: 最新保存 - commit: 最新提交
     * @return newSaveOrCommit
     */
    public String getNewSaveOrCommit() {
        return newSaveOrCommit;
    }

    public void setNewSaveOrCommit(String newSaveOrCommit) {
        this.newSaveOrCommit = newSaveOrCommit;
    }

    public SearchDetailV2 withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 数字版本号或草稿标识
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public SearchDetailV2 withLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * 最后修改时间
     * @return lastModifiedTime
     */
    public Long getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public SearchDetailV2 withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public SearchDetailV2 withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型: （多选）样例: job_type=BATCH 默认为全部。 - BATCH: 批作业 - REAL_TIME: 流作业
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public SearchDetailV2 withJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }

    /**
     * 作业参数
     * @return jobParams
     */
    public String getJobParams() {
        return jobParams;
    }

    public void setJobParams(String jobParams) {
        this.jobParams = jobParams;
    }

    public SearchDetailV2 withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public SearchDetailV2 withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型: （多选）节点类型列表。 默认为全部。   - com.cloud.datacraft.processactivity.ExecuteHiveJob: MRS Hive SQL   - com.cloud.datacraft.activity.ExecuteSparkSQL: MRS Spark SQL   - com.cloud.datacraft.activity.MRSSparkPython: MRS Spark Python   - com.cloud.datacraft.processactivity.ExecuteImpalaJob: MRS Impala SQL   - [com.cloud.datacraft.activity.DLISQL: DLI SQL](tag:nohcs)   - [com.cloud.datacraft.activity.DliFlinkJob: DLI Flink Job](tag:nohcs)   - com.cloud.datacraft.processactivity.ExecuteDWSJob: DWS SQL   - com.cloud.datacraft.activity.ExecuteQuery: RDS SQL   - com.cloud.datacraft.activity.MRSPrestoSQL: MRS Presto SQL   - com.cloud.datacraft.processactivity.ExecuteScript: Shell   - com.cloud.datacraft.processactivity.ExecutePythonScript: Python   - com.cloud.datacraft.processactivity.ExecuteClickHouseJob: ClickHouse   - com.cloud.datacraft.processactivity.ExecuteHetuEngineJob: HetuEngine   - com.cloud.datacraft.activity.DataMigration: DataMigration
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public SearchDetailV2 withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * 脚本名称
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public SearchDetailV2 withScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }

    /**
     * 脚本类型: （多选）样例: script_type=HIVE,DLI。 默认为全部，不过滤任何类型脚本。 - HIVE: Hive SQL - [DLI: DLI SQL](tag:nohcs) - DWS: DWS SQL - SparkSQL: Spark SQL - Spark Python: Spark Python - FlinkSQL: Flink SQL - [RDS: RDS SQL](tag:nohcs) - PRESTO: Presto SQL - HETUENGINE: HeruEngine - ClickHouse: ClickHouse - IMPALA: Impala SQL - SHELL: Shell - PYTHON: Python
     * @return scriptType
     */
    public String getScriptType() {
        return scriptType;
    }

    public void setScriptType(String scriptType) {
        this.scriptType = scriptType;
    }

    public SearchDetailV2 withScriptParams(String scriptParams) {
        this.scriptParams = scriptParams;
        return this;
    }

    /**
     * 脚本参数
     * @return scriptParams
     */
    public String getScriptParams() {
        return scriptParams;
    }

    public void setScriptParams(String scriptParams) {
        this.scriptParams = scriptParams;
    }

    public SearchDetailV2 withCdmClusterName(String cdmClusterName) {
        this.cdmClusterName = cdmClusterName;
        return this;
    }

    /**
     * CDM集群名称
     * @return cdmClusterName
     */
    public String getCdmClusterName() {
        return cdmClusterName;
    }

    public void setCdmClusterName(String cdmClusterName) {
        this.cdmClusterName = cdmClusterName;
    }

    public SearchDetailV2 withCdmJobName(String cdmJobName) {
        this.cdmJobName = cdmJobName;
        return this;
    }

    /**
     * CDM作业名称
     * @return cdmJobName
     */
    public String getCdmJobName() {
        return cdmJobName;
    }

    public void setCdmJobName(String cdmJobName) {
        this.cdmJobName = cdmJobName;
    }

    public SearchDetailV2 withCdmParams(String cdmParams) {
        this.cdmParams = cdmParams;
        return this;
    }

    /**
     * CDM参数
     * @return cdmParams
     */
    public String getCdmParams() {
        return cdmParams;
    }

    public void setCdmParams(String cdmParams) {
        this.cdmParams = cdmParams;
    }

    public SearchDetailV2 withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 工作空间名称
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public SearchDetailV2 withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SearchDetailV2 withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * 脚本ID
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public SearchDetailV2 withSingleNodeJobType(String singleNodeJobType) {
        this.singleNodeJobType = singleNodeJobType;
        return this;
    }

    /**
     * 单节点作业类型
     * @return singleNodeJobType
     */
    public String getSingleNodeJobType() {
        return singleNodeJobType;
    }

    public void setSingleNodeJobType(String singleNodeJobType) {
        this.singleNodeJobType = singleNodeJobType;
    }

    public SearchDetailV2 withScheduleState(String scheduleState) {
        this.scheduleState = scheduleState;
        return this;
    }

    /**
     * 调度状态:  默认为全部。 - running: 已调度 - stop: 未调度
     * @return scheduleState
     */
    public String getScheduleState() {
        return scheduleState;
    }

    public void setScheduleState(String scheduleState) {
        this.scheduleState = scheduleState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchDetailV2 that = (SearchDetailV2) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.dgcInstanceId, that.dgcInstanceId)
            && Objects.equals(this.workspace, that.workspace) && Objects.equals(this.docType, that.docType)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.newSaveOrCommit, that.newSaveOrCommit)
            && Objects.equals(this.version, that.version)
            && Objects.equals(this.lastModifiedTime, that.lastModifiedTime)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.jobParams, that.jobParams) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.scriptName, that.scriptName)
            && Objects.equals(this.scriptType, that.scriptType) && Objects.equals(this.scriptParams, that.scriptParams)
            && Objects.equals(this.cdmClusterName, that.cdmClusterName)
            && Objects.equals(this.cdmJobName, that.cdmJobName) && Objects.equals(this.cdmParams, that.cdmParams)
            && Objects.equals(this.workspaceName, that.workspaceName) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.scriptId, that.scriptId)
            && Objects.equals(this.singleNodeJobType, that.singleNodeJobType)
            && Objects.equals(this.scheduleState, that.scheduleState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            projectId,
            dgcInstanceId,
            workspace,
            docType,
            owner,
            newSaveOrCommit,
            version,
            lastModifiedTime,
            jobName,
            jobType,
            jobParams,
            nodeName,
            nodeType,
            scriptName,
            scriptType,
            scriptParams,
            cdmClusterName,
            cdmJobName,
            cdmParams,
            workspaceName,
            jobId,
            scriptId,
            singleNodeJobType,
            scheduleState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchDetailV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    dgcInstanceId: ").append(toIndentedString(dgcInstanceId)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    newSaveOrCommit: ").append(toIndentedString(newSaveOrCommit)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobParams: ").append(toIndentedString(jobParams)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    scriptType: ").append(toIndentedString(scriptType)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
        sb.append("    cdmClusterName: ").append(toIndentedString(cdmClusterName)).append("\n");
        sb.append("    cdmJobName: ").append(toIndentedString(cdmJobName)).append("\n");
        sb.append("    cdmParams: ").append(toIndentedString(cdmParams)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    singleNodeJobType: ").append(toIndentedString(singleNodeJobType)).append("\n");
        sb.append("    scheduleState: ").append(toIndentedString(scheduleState)).append("\n");
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
