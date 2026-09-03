package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowExecuteResultWithoutKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_values")

    private List<Object> columnValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private List<Column> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_type")

    private String resultType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private Integer rows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_delay")

    private Long timeDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_edit")

    private Boolean canEdit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_export")

    private Boolean canExport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_db_name")

    private String editDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_table")

    private String editTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_primary_keys")

    private List<String> editPrimaryKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cannot_edit_reason")

    private Integer cannotEditReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_datas")

    private List<Object> extendDatas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sum")

    private Integer dataSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "big_table")

    private Boolean bigTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warning")

    private List<String> warning = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "explain_sql")

    private Boolean explainSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_state")

    private String pageState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exceed_data")

    private Boolean exceedData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_status")

    private String executeStatus;

    public ShowExecuteResultWithoutKeyResponse withColumnValues(List<Object> columnValues) {
        this.columnValues = columnValues;
        return this;
    }

    public ShowExecuteResultWithoutKeyResponse addColumnValuesItem(Object columnValuesItem) {
        if (this.columnValues == null) {
            this.columnValues = new ArrayList<>();
        }
        this.columnValues.add(columnValuesItem);
        return this;
    }

    public ShowExecuteResultWithoutKeyResponse withColumnValues(Consumer<List<Object>> columnValuesSetter) {
        if (this.columnValues == null) {
            this.columnValues = new ArrayList<>();
        }
        columnValuesSetter.accept(this.columnValues);
        return this;
    }

    /**
     * 字段值
     * @return columnValues
     */
    public List<Object> getColumnValues() {
        return columnValues;
    }

    public void setColumnValues(List<Object> columnValues) {
        this.columnValues = columnValues;
    }

    public ShowExecuteResultWithoutKeyResponse withMetadata(List<Column> metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowExecuteResultWithoutKeyResponse addMetadataItem(Column metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    public ShowExecuteResultWithoutKeyResponse withMetadata(Consumer<List<Column>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 字段属性，字段名等
     * @return metadata
     */
    public List<Column> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Column> metadata) {
        this.metadata = metadata;
    }

    public ShowExecuteResultWithoutKeyResponse withResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }

    /**
     * 结果集类型
     * @return resultType
     */
    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public ShowExecuteResultWithoutKeyResponse withRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * 行数
     * @return rows
     */
    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public ShowExecuteResultWithoutKeyResponse withTimeDelay(Long timeDelay) {
        this.timeDelay = timeDelay;
        return this;
    }

    /**
     * 执行耗时
     * @return timeDelay
     */
    public Long getTimeDelay() {
        return timeDelay;
    }

    public void setTimeDelay(Long timeDelay) {
        this.timeDelay = timeDelay;
    }

    public ShowExecuteResultWithoutKeyResponse withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    /**
     * 结果集是否可编辑
     * @return canEdit
     */
    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    public ShowExecuteResultWithoutKeyResponse withCanExport(Boolean canExport) {
        this.canExport = canExport;
        return this;
    }

    /**
     * 结果集是否可导出
     * @return canExport
     */
    public Boolean getCanExport() {
        return canExport;
    }

    public void setCanExport(Boolean canExport) {
        this.canExport = canExport;
    }

    public ShowExecuteResultWithoutKeyResponse withEditDbName(String editDbName) {
        this.editDbName = editDbName;
        return this;
    }

    /**
     * 编辑库名
     * @return editDbName
     */
    public String getEditDbName() {
        return editDbName;
    }

    public void setEditDbName(String editDbName) {
        this.editDbName = editDbName;
    }

    public ShowExecuteResultWithoutKeyResponse withEditTable(String editTable) {
        this.editTable = editTable;
        return this;
    }

    /**
     * 编辑表名
     * @return editTable
     */
    public String getEditTable() {
        return editTable;
    }

    public void setEditTable(String editTable) {
        this.editTable = editTable;
    }

    public ShowExecuteResultWithoutKeyResponse withEditPrimaryKeys(List<String> editPrimaryKeys) {
        this.editPrimaryKeys = editPrimaryKeys;
        return this;
    }

    public ShowExecuteResultWithoutKeyResponse addEditPrimaryKeysItem(String editPrimaryKeysItem) {
        if (this.editPrimaryKeys == null) {
            this.editPrimaryKeys = new ArrayList<>();
        }
        this.editPrimaryKeys.add(editPrimaryKeysItem);
        return this;
    }

    public ShowExecuteResultWithoutKeyResponse withEditPrimaryKeys(Consumer<List<String>> editPrimaryKeysSetter) {
        if (this.editPrimaryKeys == null) {
            this.editPrimaryKeys = new ArrayList<>();
        }
        editPrimaryKeysSetter.accept(this.editPrimaryKeys);
        return this;
    }

    /**
     * 主键信息
     * @return editPrimaryKeys
     */
    public List<String> getEditPrimaryKeys() {
        return editPrimaryKeys;
    }

    public void setEditPrimaryKeys(List<String> editPrimaryKeys) {
        this.editPrimaryKeys = editPrimaryKeys;
    }

    public ShowExecuteResultWithoutKeyResponse withCannotEditReason(Integer cannotEditReason) {
        this.cannotEditReason = cannotEditReason;
        return this;
    }

    /**
     * 不能编辑的原因
     * @return cannotEditReason
     */
    public Integer getCannotEditReason() {
        return cannotEditReason;
    }

    public void setCannotEditReason(Integer cannotEditReason) {
        this.cannotEditReason = cannotEditReason;
    }

    public ShowExecuteResultWithoutKeyResponse withExtendDatas(List<Object> extendDatas) {
        this.extendDatas = extendDatas;
        return this;
    }

    public ShowExecuteResultWithoutKeyResponse addExtendDatasItem(Object extendDatasItem) {
        if (this.extendDatas == null) {
            this.extendDatas = new ArrayList<>();
        }
        this.extendDatas.add(extendDatasItem);
        return this;
    }

    public ShowExecuteResultWithoutKeyResponse withExtendDatas(Consumer<List<Object>> extendDatasSetter) {
        if (this.extendDatas == null) {
            this.extendDatas = new ArrayList<>();
        }
        extendDatasSetter.accept(this.extendDatas);
        return this;
    }

    /**
     * 额外信息
     * @return extendDatas
     */
    public List<Object> getExtendDatas() {
        return extendDatas;
    }

    public void setExtendDatas(List<Object> extendDatas) {
        this.extendDatas = extendDatas;
    }

    public ShowExecuteResultWithoutKeyResponse withDataSum(Integer dataSum) {
        this.dataSum = dataSum;
        return this;
    }

    /**
     * 数据总量
     * @return dataSum
     */
    public Integer getDataSum() {
        return dataSum;
    }

    public void setDataSum(Integer dataSum) {
        this.dataSum = dataSum;
    }

    public ShowExecuteResultWithoutKeyResponse withBigTable(Boolean bigTable) {
        this.bigTable = bigTable;
        return this;
    }

    /**
     * 是否为大表
     * @return bigTable
     */
    public Boolean getBigTable() {
        return bigTable;
    }

    public void setBigTable(Boolean bigTable) {
        this.bigTable = bigTable;
    }

    public ShowExecuteResultWithoutKeyResponse withWarning(List<String> warning) {
        this.warning = warning;
        return this;
    }

    public ShowExecuteResultWithoutKeyResponse addWarningItem(String warningItem) {
        if (this.warning == null) {
            this.warning = new ArrayList<>();
        }
        this.warning.add(warningItem);
        return this;
    }

    public ShowExecuteResultWithoutKeyResponse withWarning(Consumer<List<String>> warningSetter) {
        if (this.warning == null) {
            this.warning = new ArrayList<>();
        }
        warningSetter.accept(this.warning);
        return this;
    }

    /**
     * 执行命令告警信息
     * @return warning
     */
    public List<String> getWarning() {
        return warning;
    }

    public void setWarning(List<String> warning) {
        this.warning = warning;
    }

    public ShowExecuteResultWithoutKeyResponse withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 要执行的SQL语句
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public ShowExecuteResultWithoutKeyResponse withExplainSql(Boolean explainSql) {
        this.explainSql = explainSql;
        return this;
    }

    /**
     * 是否为执行计划语句
     * @return explainSql
     */
    public Boolean getExplainSql() {
        return explainSql;
    }

    public void setExplainSql(Boolean explainSql) {
        this.explainSql = explainSql;
    }

    public ShowExecuteResultWithoutKeyResponse withPageState(String pageState) {
        this.pageState = pageState;
        return this;
    }

    /**
     * 页面状态
     * @return pageState
     */
    public String getPageState() {
        return pageState;
    }

    public void setPageState(String pageState) {
        this.pageState = pageState;
    }

    public ShowExecuteResultWithoutKeyResponse withExceedData(Boolean exceedData) {
        this.exceedData = exceedData;
        return this;
    }

    /**
     * 查询结果是否超过规定大小
     * @return exceedData
     */
    public Boolean getExceedData() {
        return exceedData;
    }

    public void setExceedData(Boolean exceedData) {
        this.exceedData = exceedData;
    }

    public ShowExecuteResultWithoutKeyResponse withExecuteStatus(String executeStatus) {
        this.executeStatus = executeStatus;
        return this;
    }

    /**
     * 执行状态（finished：执行完毕，pending：执行中）
     * @return executeStatus
     */
    public String getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(String executeStatus) {
        this.executeStatus = executeStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowExecuteResultWithoutKeyResponse that = (ShowExecuteResultWithoutKeyResponse) obj;
        return Objects.equals(this.columnValues, that.columnValues) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.resultType, that.resultType) && Objects.equals(this.rows, that.rows)
            && Objects.equals(this.timeDelay, that.timeDelay) && Objects.equals(this.canEdit, that.canEdit)
            && Objects.equals(this.canExport, that.canExport) && Objects.equals(this.editDbName, that.editDbName)
            && Objects.equals(this.editTable, that.editTable)
            && Objects.equals(this.editPrimaryKeys, that.editPrimaryKeys)
            && Objects.equals(this.cannotEditReason, that.cannotEditReason)
            && Objects.equals(this.extendDatas, that.extendDatas) && Objects.equals(this.dataSum, that.dataSum)
            && Objects.equals(this.bigTable, that.bigTable) && Objects.equals(this.warning, that.warning)
            && Objects.equals(this.sql, that.sql) && Objects.equals(this.explainSql, that.explainSql)
            && Objects.equals(this.pageState, that.pageState) && Objects.equals(this.exceedData, that.exceedData)
            && Objects.equals(this.executeStatus, that.executeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnValues,
            metadata,
            resultType,
            rows,
            timeDelay,
            canEdit,
            canExport,
            editDbName,
            editTable,
            editPrimaryKeys,
            cannotEditReason,
            extendDatas,
            dataSum,
            bigTable,
            warning,
            sql,
            explainSql,
            pageState,
            exceedData,
            executeStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExecuteResultWithoutKeyResponse {\n");
        sb.append("    columnValues: ").append(toIndentedString(columnValues)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    timeDelay: ").append(toIndentedString(timeDelay)).append("\n");
        sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
        sb.append("    canExport: ").append(toIndentedString(canExport)).append("\n");
        sb.append("    editDbName: ").append(toIndentedString(editDbName)).append("\n");
        sb.append("    editTable: ").append(toIndentedString(editTable)).append("\n");
        sb.append("    editPrimaryKeys: ").append(toIndentedString(editPrimaryKeys)).append("\n");
        sb.append("    cannotEditReason: ").append(toIndentedString(cannotEditReason)).append("\n");
        sb.append("    extendDatas: ").append(toIndentedString(extendDatas)).append("\n");
        sb.append("    dataSum: ").append(toIndentedString(dataSum)).append("\n");
        sb.append("    bigTable: ").append(toIndentedString(bigTable)).append("\n");
        sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    explainSql: ").append(toIndentedString(explainSql)).append("\n");
        sb.append("    pageState: ").append(toIndentedString(pageState)).append("\n");
        sb.append("    exceedData: ").append(toIndentedString(exceedData)).append("\n");
        sb.append("    executeStatus: ").append(toIndentedString(executeStatus)).append("\n");
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
