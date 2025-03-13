package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiagnosePermissionDetail
 */
public class DiagnosePermissionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_type")

    private String permissionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_action")

    private String permissionAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_source")

    private String permissionSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_type")

    private String datasourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    public DiagnosePermissionDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 权限配置编号。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DiagnosePermissionDetail withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 诊断任务id。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public DiagnosePermissionDetail withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DiagnosePermissionDetail withPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }

    /**
     * 权限类型。
     * @return permissionType
     */
    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public DiagnosePermissionDetail withPermissionAction(String permissionAction) {
        this.permissionAction = permissionAction;
        return this;
    }

    /**
     * 权限操作。
     * @return permissionAction
     */
    public String getPermissionAction() {
        return permissionAction;
    }

    public void setPermissionAction(String permissionAction) {
        this.permissionAction = permissionAction;
    }

    public DiagnosePermissionDetail withPermissionSource(String permissionSource) {
        this.permissionSource = permissionSource;
        return this;
    }

    /**
     * 权限来源。
     * @return permissionSource
     */
    public String getPermissionSource() {
        return permissionSource;
    }

    public void setPermissionSource(String permissionSource) {
        this.permissionSource = permissionSource;
    }

    public DiagnosePermissionDetail withDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据源类型。
     * @return datasourceType
     */
    public String getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
    }

    public DiagnosePermissionDetail withClusterName(String clusterName) {
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

    public DiagnosePermissionDetail withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public DiagnosePermissionDetail withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * schema名。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public DiagnosePermissionDetail withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 表名。
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public DiagnosePermissionDetail withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiagnosePermissionDetail that = (DiagnosePermissionDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.permissionType, that.permissionType)
            && Objects.equals(this.permissionAction, that.permissionAction)
            && Objects.equals(this.permissionSource, that.permissionSource)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.database, that.database)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.table, that.table)
            && Objects.equals(this.remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            taskId,
            userName,
            permissionType,
            permissionAction,
            permissionSource,
            datasourceType,
            clusterName,
            database,
            schema,
            table,
            remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosePermissionDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
        sb.append("    permissionAction: ").append(toIndentedString(permissionAction)).append("\n");
        sb.append("    permissionSource: ").append(toIndentedString(permissionSource)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
