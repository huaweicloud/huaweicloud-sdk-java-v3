package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskTableReferenceDetailResponse
 */
public class TaskTableReferenceDetailResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Long jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private String dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_base")

    private String dataBase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_submit_time")

    private Long lastSubmitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_type")

    private Integer ioType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_dynamic")

    private Boolean isDynamic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_user")

    private String executeUser;

    public TaskTableReferenceDetailResponse withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id。
     * @return jobId
     */
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public TaskTableReferenceDetailResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public TaskTableReferenceDetailResponse withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * 数据库类型。
     * @return dbType
     */
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public TaskTableReferenceDetailResponse withDataBase(String dataBase) {
        this.dataBase = dataBase;
        return this;
    }

    /**
     * 数据库名。
     * @return dataBase
     */
    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public TaskTableReferenceDetailResponse withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 数据表名。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public TaskTableReferenceDetailResponse withClusterName(String clusterName) {
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

    public TaskTableReferenceDetailResponse withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 作业的工作空间名。
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public TaskTableReferenceDetailResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 作业的工作空间Id。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public TaskTableReferenceDetailResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 作业责任人。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TaskTableReferenceDetailResponse withLastSubmitTime(Long lastSubmitTime) {
        this.lastSubmitTime = lastSubmitTime;
        return this;
    }

    /**
     * 作业最后提交时间。
     * @return lastSubmitTime
     */
    public Long getLastSubmitTime() {
        return lastSubmitTime;
    }

    public void setLastSubmitTime(Long lastSubmitTime) {
        this.lastSubmitTime = lastSubmitTime;
    }

    public TaskTableReferenceDetailResponse withIoType(Integer ioType) {
        this.ioType = ioType;
        return this;
    }

    /**
     * 作业和表的关系，0表示作业是读表，1表示作业写表。
     * @return ioType
     */
    public Integer getIoType() {
        return ioType;
    }

    public void setIoType(Integer ioType) {
        this.ioType = ioType;
    }

    public TaskTableReferenceDetailResponse withIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    /**
     * 是否是动态表。
     * @return isDynamic
     */
    public Boolean getIsDynamic() {
        return isDynamic;
    }

    public void setIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
    }

    public TaskTableReferenceDetailResponse withExecuteUser(String executeUser) {
        this.executeUser = executeUser;
        return this;
    }

    /**
     * 作业执行用户。
     * @return executeUser
     */
    public String getExecuteUser() {
        return executeUser;
    }

    public void setExecuteUser(String executeUser) {
        this.executeUser = executeUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskTableReferenceDetailResponse that = (TaskTableReferenceDetailResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.dbType, that.dbType) && Objects.equals(this.dataBase, that.dataBase)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.workspaceName, that.workspaceName)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.lastSubmitTime, that.lastSubmitTime) && Objects.equals(this.ioType, that.ioType)
            && Objects.equals(this.isDynamic, that.isDynamic) && Objects.equals(this.executeUser, that.executeUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            jobName,
            dbType,
            dataBase,
            tableName,
            clusterName,
            workspaceName,
            workspaceId,
            owner,
            lastSubmitTime,
            ioType,
            isDynamic,
            executeUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskTableReferenceDetailResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    dataBase: ").append(toIndentedString(dataBase)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    lastSubmitTime: ").append(toIndentedString(lastSubmitTime)).append("\n");
        sb.append("    ioType: ").append(toIndentedString(ioType)).append("\n");
        sb.append("    isDynamic: ").append(toIndentedString(isDynamic)).append("\n");
        sb.append("    executeUser: ").append(toIndentedString(executeUser)).append("\n");
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
