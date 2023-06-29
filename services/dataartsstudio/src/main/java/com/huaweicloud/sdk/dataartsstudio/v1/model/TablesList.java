package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * schema信息
 */
public class TablesList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name_cn")

    private String tableNameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private String columns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_name")

    private String dwName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "life_cycle")

    private Integer lifeCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_size")

    private Integer tableSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private Integer isValid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_setting")

    private String extraSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitioned")

    private Boolean partitioned;

    public TablesList withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public TablesList withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 表id
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public TablesList withTableNameCn(String tableNameCn) {
        this.tableNameCn = tableNameCn;
        return this;
    }

    /**
     * 表的中文名称
     * @return tableNameCn
     */
    public String getTableNameCn() {
        return tableNameCn;
    }

    public void setTableNameCn(String tableNameCn) {
        this.tableNameCn = tableNameCn;
    }

    public TablesList withColumns(String columns) {
        this.columns = columns;
        return this;
    }

    /**
     * 表中字段
     * @return columns
     */
    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public TablesList withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 数据连接id
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public TablesList withDwName(String dwName) {
        this.dwName = dwName;
        return this;
    }

    /**
     * 数据连接名称
     * @return dwName
     */
    public String getDwName() {
        return dwName;
    }

    public void setDwName(String dwName) {
        this.dwName = dwName;
    }

    public TablesList withDwType(String dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型
     * @return dwType
     */
    public String getDwType() {
        return dwType;
    }

    public void setDwType(String dwType) {
        this.dwType = dwType;
    }

    public TablesList withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public TablesList withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public TablesList withLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }

    /**
     * 表的生命周期
     * minimum: 0
     * maximum: 1
     * @return lifeCycle
     */
    public Integer getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public TablesList withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 表的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TablesList withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TablesList withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public TablesList withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 数据连接id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TablesList withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表的创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TablesList withTableSize(Integer tableSize) {
        this.tableSize = tableSize;
        return this;
    }

    /**
     * 表的大小
     * minimum: 0
     * maximum: 4096
     * @return tableSize
     */
    public Integer getTableSize() {
        return tableSize;
    }

    public void setTableSize(Integer tableSize) {
        this.tableSize = tableSize;
    }

    public TablesList withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 当前查询条件下表的总记录数
     * minimum: 0
     * maximum: 100
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public TablesList withIsValid(Integer isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * 表是否合规
     * minimum: 0
     * maximum: 1
     * @return isValid
     */
    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public TablesList withExtraSetting(String extraSetting) {
        this.extraSetting = extraSetting;
        return this;
    }

    /**
     * 表的额外设置
     * @return extraSetting
     */
    public String getExtraSetting() {
        return extraSetting;
    }

    public void setExtraSetting(String extraSetting) {
        this.extraSetting = extraSetting;
    }

    public TablesList withPartitioned(Boolean partitioned) {
        this.partitioned = partitioned;
        return this;
    }

    /**
     * 是否进行数据分区
     * @return partitioned
     */
    public Boolean getPartitioned() {
        return partitioned;
    }

    public void setPartitioned(Boolean partitioned) {
        this.partitioned = partitioned;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TablesList that = (TablesList) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.tableId, that.tableId)
            && Objects.equals(this.tableNameCn, that.tableNameCn) && Objects.equals(this.columns, that.columns)
            && Objects.equals(this.dwId, that.dwId) && Objects.equals(this.dwName, that.dwName)
            && Objects.equals(this.dwType, that.dwType) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.lifeCycle, that.lifeCycle)
            && Objects.equals(this.description, that.description) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.tableSize, that.tableSize)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.isValid, that.isValid)
            && Objects.equals(this.extraSetting, that.extraSetting)
            && Objects.equals(this.partitioned, that.partitioned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            tableId,
            tableNameCn,
            columns,
            dwId,
            dwName,
            dwType,
            databaseName,
            schemaName,
            lifeCycle,
            description,
            userId,
            userName,
            projectId,
            createTime,
            tableSize,
            totalCount,
            isValid,
            extraSetting,
            partitioned);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TablesList {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    tableNameCn: ").append(toIndentedString(tableNameCn)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    dwName: ").append(toIndentedString(dwName)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    lifeCycle: ").append(toIndentedString(lifeCycle)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    tableSize: ").append(toIndentedString(tableSize)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
        sb.append("    extraSetting: ").append(toIndentedString(extraSetting)).append("\n");
        sb.append("    partitioned: ").append(toIndentedString(partitioned)).append("\n");
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
