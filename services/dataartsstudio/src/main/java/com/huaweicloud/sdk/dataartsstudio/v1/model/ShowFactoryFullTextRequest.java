package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowFactoryFullTextRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_text")

    private String searchText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_type")

    private String scriptType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_save_or_commit")

    private String newSaveOrCommit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owners")

    private String owners;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_types")

    private String docTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "if_query_parameters")

    private String ifQueryParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private Integer matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_state")

    private String scheduleState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_exact")

    private String isExact;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exact_field")

    private String exactField;

    public ShowFactoryFullTextRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ShowFactoryFullTextRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 搜索空间范围: 默认不传参，在全部空间内搜索。 - 当前工作空间ID: 当前工作空间的ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowFactoryFullTextRequest withSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }

    /**
     * 全局搜索关键字，输入至少两位字符。
     * @return searchText
     */
    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public ShowFactoryFullTextRequest withJobType(String jobType) {
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

    public ShowFactoryFullTextRequest withScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }

    /**
     * 脚本类型: （多选）样例: script_type=HIVE,DLI。 默认为全部，不过滤任何类型脚本。 - HIVE: Hive SQL - DLI: DLI SQL - DWS: DWS SQL - SparkSQL: Spark SQL - SparkPython: Spark Python - FlinkSQL: Flink SQL - RDS: RDS SQL - PRESTO: Presto SQL - HETUENGINE: HeruEngine - ClickHouse: ClickHouse - IMPALA: Impala SQL - SHELL: Shell - PYTHON: Python
     * @return scriptType
     */
    public String getScriptType() {
        return scriptType;
    }

    public void setScriptType(String scriptType) {
        this.scriptType = scriptType;
    }

    public ShowFactoryFullTextRequest withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型: （多选）节点类型列表。样例: node_type=com.cloud.datacraft.processactivity.ExecuteHiveJob 默认为全部。 - com.cloud.datacraft.processactivity.ExecuteHiveJob: MRS Hive SQL - com.cloud.datacraft.activity.ExecuteSparkSQL: MRS Spark SQL - com.cloud.datacraft.activity.MRSSparkPython: MRS Spark Python - com.cloud.datacraft.processactivity.ExecuteImpalaJob: MRS Impala SQL - com.cloud.datacraft.activity.DLISQL: DLI SQL - com.cloud.datacraft.activity.DliFlinkJob: DLI Flink Job - com.cloud.datacraft.processactivity.ExecuteDWSJob: DWS SQL - com.cloud.datacraft.activity.ExecuteQuery: RDS SQL - com.cloud.datacraft.activity.MRSPrestoSQL: MRS Presto SQL - com.cloud.datacraft.processactivity.ExecuteScript: Shell - com.cloud.datacraft.processactivity.ExecutePythonScript: Python - com.cloud.datacraft.processactivity.ExecuteClickHouseJob: ClickHouse - com.cloud.datacraft.processactivity.ExecuteHetuEngineJob: HetuEngine - com.cloud.datacraft.activity.DataMigration: DataMigration
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ShowFactoryFullTextRequest withNewSaveOrCommit(String newSaveOrCommit) {
        this.newSaveOrCommit = newSaveOrCommit;
        return this;
    }

    /**
     * 最新修改: 样例: new_save_or_commit=save 默认为save: 最新保存 - save: 最新保存 - commit: 最新提交
     * @return newSaveOrCommit
     */
    public String getNewSaveOrCommit() {
        return newSaveOrCommit;
    }

    public void setNewSaveOrCommit(String newSaveOrCommit) {
        this.newSaveOrCommit = newSaveOrCommit;
    }

    public ShowFactoryFullTextRequest withOwners(String owners) {
        this.owners = owners;
        return this;
    }

    /**
     * 责任人名称: （多选）人员列表或我的节点。样例: owners=dayu_wm 默认不过滤责任人。
     * @return owners
     */
    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public ShowFactoryFullTextRequest withDocTypes(String docTypes) {
        this.docTypes = docTypes;
        return this;
    }

    /**
     * 搜索范围: （多选）样例: doc_types=script 默认为全部。 - node: 开发作业 - script: 脚本
     * @return docTypes
     */
    public String getDocTypes() {
        return docTypes;
    }

    public void setDocTypes(String docTypes) {
        this.docTypes = docTypes;
    }

    public ShowFactoryFullTextRequest withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 开始时间，配合结束时间参数使用，默认没有时间范围。样例: begin_time=1746633600000
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public ShowFactoryFullTextRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，配合开始时间参数使用，默认没有时间范围。样例: endTime=1746806399999
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowFactoryFullTextRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页返回结果，指定每页最大记录数，范围[1,100]。样例: limit=10 默认值: 10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowFactoryFullTextRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页的起始页，取值范围大于等于0。样例: offset=0 默认值: 0。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowFactoryFullTextRequest withIfQueryParameters(String ifQueryParameters) {
        this.ifQueryParameters = ifQueryParameters;
        return this;
    }

    /**
     * 是否搜索配置参数部分的内容: 样例: if_query_parameters=false 默认为false: 不搜索配置参数部分的内容 - true: 是 - false: 否
     * @return ifQueryParameters
     */
    public String getIfQueryParameters() {
        return ifQueryParameters;
    }

    public void setIfQueryParameters(String ifQueryParameters) {
        this.ifQueryParameters = ifQueryParameters;
    }

    public ShowFactoryFullTextRequest withMatchType(Integer matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 匹配方式: 样例: match_type=0 默认为0: 通用。 - 0: 通用 - 1: 模糊
     * minimum: 0
     * maximum: 1
     * @return matchType
     */
    public Integer getMatchType() {
        return matchType;
    }

    public void setMatchType(Integer matchType) {
        this.matchType = matchType;
    }

    public ShowFactoryFullTextRequest withScheduleState(String scheduleState) {
        this.scheduleState = scheduleState;
        return this;
    }

    /**
     * 调度状态: 仅支持作业查找场景，需配置new_save_or_commit参数为commit 默认为全部。 - running: 已调度 - stop: 未调度
     * @return scheduleState
     */
    public String getScheduleState() {
        return scheduleState;
    }

    public void setScheduleState(String scheduleState) {
        this.scheduleState = scheduleState;
    }

    public ShowFactoryFullTextRequest withIsExact(String isExact) {
        this.isExact = isExact;
        return this;
    }

    /**
     * 是否精确搜索: 开启后配合exact_field参数使用。 默认为false: 非精确搜索 - true: 精确搜索 - false: 非精确搜索
     * @return isExact
     */
    public String getIsExact() {
        return isExact;
    }

    public void setIsExact(String isExact) {
        this.isExact = isExact;
    }

    public ShowFactoryFullTextRequest withExactField(String exactField) {
        this.exactField = exactField;
        return this;
    }

    /**
     * 精确查询的字段, 开启精确搜索时生效: - jobName: 作业名 - scriptName: 脚本名 - jobId: 作业ID - scriptId: 脚本ID
     * @return exactField
     */
    public String getExactField() {
        return exactField;
    }

    public void setExactField(String exactField) {
        this.exactField = exactField;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFactoryFullTextRequest that = (ShowFactoryFullTextRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.searchText, that.searchText) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.scriptType, that.scriptType) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.newSaveOrCommit, that.newSaveOrCommit) && Objects.equals(this.owners, that.owners)
            && Objects.equals(this.docTypes, that.docTypes) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.ifQueryParameters, that.ifQueryParameters)
            && Objects.equals(this.matchType, that.matchType) && Objects.equals(this.scheduleState, that.scheduleState)
            && Objects.equals(this.isExact, that.isExact) && Objects.equals(this.exactField, that.exactField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            workspaceId,
            searchText,
            jobType,
            scriptType,
            nodeType,
            newSaveOrCommit,
            owners,
            docTypes,
            beginTime,
            endTime,
            limit,
            offset,
            ifQueryParameters,
            matchType,
            scheduleState,
            isExact,
            exactField);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFactoryFullTextRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    searchText: ").append(toIndentedString(searchText)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    scriptType: ").append(toIndentedString(scriptType)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    newSaveOrCommit: ").append(toIndentedString(newSaveOrCommit)).append("\n");
        sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
        sb.append("    docTypes: ").append(toIndentedString(docTypes)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    ifQueryParameters: ").append(toIndentedString(ifQueryParameters)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    scheduleState: ").append(toIndentedString(scheduleState)).append("\n");
        sb.append("    isExact: ").append(toIndentedString(isExact)).append("\n");
        sb.append("    exactField: ").append(toIndentedString(exactField)).append("\n");
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
