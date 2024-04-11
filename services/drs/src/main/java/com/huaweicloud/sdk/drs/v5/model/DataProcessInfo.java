package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataProcessInfo
 */
public class DataProcessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_conditions")

    private List<DataFilteringCondition> filterConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_batch_process")

    private Boolean isBatchProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_columns")

    private List<AddColumnInfo> addColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_operation")

    private Map<String, String> ddlOperation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dml_operation")

    private String dmlOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_object_column_info")

    private DbObjectColumnInfo dbObjectColumnInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_or_table_rename_rule")

    private DbOrTableRenameRule dbOrTableRenameRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_object")

    private DbObject dbObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_synchronized")

    private Boolean isSynchronized;

    /**
     * 对比的来源 - job 表示数据同步时的过滤 - compare 表示数据对比的过滤
     */
    public static final class SourceEnum {

        /**
         * Enum JOB for value: "job"
         */
        public static final SourceEnum JOB = new SourceEnum("job");

        /**
         * Enum COMPARE for value: "compare"
         */
        public static final SourceEnum COMPARE = new SourceEnum("compare");

        private static final Map<String, SourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceEnum> createStaticFields() {
            Map<String, SourceEnum> map = new HashMap<>();
            map.put("job", JOB);
            map.put("compare", COMPARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceEnum(value));
        }

        public static SourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceEnum) {
                return this.value.equals(((SourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SourceEnum source;

    public DataProcessInfo withFilterConditions(List<DataFilteringCondition> filterConditions) {
        this.filterConditions = filterConditions;
        return this;
    }

    public DataProcessInfo addFilterConditionsItem(DataFilteringCondition filterConditionsItem) {
        if (this.filterConditions == null) {
            this.filterConditions = new ArrayList<>();
        }
        this.filterConditions.add(filterConditionsItem);
        return this;
    }

    public DataProcessInfo withFilterConditions(Consumer<List<DataFilteringCondition>> filterConditionsSetter) {
        if (this.filterConditions == null) {
            this.filterConditions = new ArrayList<>();
        }
        filterConditionsSetter.accept(this.filterConditions);
        return this;
    }

    /**
     * 指定任务数据加工规则请求体
     * @return filterConditions
     */
    public List<DataFilteringCondition> getFilterConditions() {
        return filterConditions;
    }

    public void setFilterConditions(List<DataFilteringCondition> filterConditions) {
        this.filterConditions = filterConditions;
    }

    public DataProcessInfo withIsBatchProcess(Boolean isBatchProcess) {
        this.isBatchProcess = isBatchProcess;
        return this;
    }

    /**
     * 库级、批量表级处理为true，单表操作为false
     * @return isBatchProcess
     */
    public Boolean getIsBatchProcess() {
        return isBatchProcess;
    }

    public void setIsBatchProcess(Boolean isBatchProcess) {
        this.isBatchProcess = isBatchProcess;
    }

    public DataProcessInfo withAddColumns(List<AddColumnInfo> addColumns) {
        this.addColumns = addColumns;
        return this;
    }

    public DataProcessInfo addAddColumnsItem(AddColumnInfo addColumnsItem) {
        if (this.addColumns == null) {
            this.addColumns = new ArrayList<>();
        }
        this.addColumns.add(addColumnsItem);
        return this;
    }

    public DataProcessInfo withAddColumns(Consumer<List<AddColumnInfo>> addColumnsSetter) {
        if (this.addColumns == null) {
            this.addColumns = new ArrayList<>();
        }
        addColumnsSetter.accept(this.addColumns);
        return this;
    }

    /**
     * 附加列 当选择附加列时必须填写 约束：使用多对一操作时，需要使用数据加工的附加列操作来避免数据冲突。
     * @return addColumns
     */
    public List<AddColumnInfo> getAddColumns() {
        return addColumns;
    }

    public void setAddColumns(List<AddColumnInfo> addColumns) {
        this.addColumns = addColumns;
    }

    public DataProcessInfo withDdlOperation(Map<String, String> ddlOperation) {
        this.ddlOperation = ddlOperation;
        return this;
    }

    public DataProcessInfo putDdlOperationItem(String key, String ddlOperationItem) {
        if (this.ddlOperation == null) {
            this.ddlOperation = new HashMap<>();
        }
        this.ddlOperation.put(key, ddlOperationItem);
        return this;
    }

    public DataProcessInfo withDdlOperation(Consumer<Map<String, String>> ddlOperationSetter) {
        if (this.ddlOperation == null) {
            this.ddlOperation = new HashMap<>();
        }
        ddlOperationSetter.accept(this.ddlOperation);
        return this;
    }

    /**
     * 支持DDL的语法 选择增量迁移或同步的DDL操作。取值及意思如下： \"table\": \"CREATE TABLE, ALTER TABLE,DROP TABLE,RENAME TABLE\" 如该值为空，不迁移或同步DDL操作
     * @return ddlOperation
     */
    public Map<String, String> getDdlOperation() {
        return ddlOperation;
    }

    public void setDdlOperation(Map<String, String> ddlOperation) {
        this.ddlOperation = ddlOperation;
    }

    public DataProcessInfo withDmlOperation(String dmlOperation) {
        this.dmlOperation = dmlOperation;
        return this;
    }

    /**
     * 支持DML的语法 选择DML操作时，取值如下： i：INSERT。 u：UPDATE。 d：DELETE。 如该值为空，不增量迁移或同步DML操作。
     * @return dmlOperation
     */
    public String getDmlOperation() {
        return dmlOperation;
    }

    public void setDmlOperation(String dmlOperation) {
        this.dmlOperation = dmlOperation;
    }

    public DataProcessInfo withDbObjectColumnInfo(DbObjectColumnInfo dbObjectColumnInfo) {
        this.dbObjectColumnInfo = dbObjectColumnInfo;
        return this;
    }

    public DataProcessInfo withDbObjectColumnInfo(Consumer<DbObjectColumnInfo> dbObjectColumnInfoSetter) {
        if (this.dbObjectColumnInfo == null) {
            this.dbObjectColumnInfo = new DbObjectColumnInfo();
            dbObjectColumnInfoSetter.accept(this.dbObjectColumnInfo);
        }

        return this;
    }

    /**
     * Get dbObjectColumnInfo
     * @return dbObjectColumnInfo
     */
    public DbObjectColumnInfo getDbObjectColumnInfo() {
        return dbObjectColumnInfo;
    }

    public void setDbObjectColumnInfo(DbObjectColumnInfo dbObjectColumnInfo) {
        this.dbObjectColumnInfo = dbObjectColumnInfo;
    }

    public DataProcessInfo withDbOrTableRenameRule(DbOrTableRenameRule dbOrTableRenameRule) {
        this.dbOrTableRenameRule = dbOrTableRenameRule;
        return this;
    }

    public DataProcessInfo withDbOrTableRenameRule(Consumer<DbOrTableRenameRule> dbOrTableRenameRuleSetter) {
        if (this.dbOrTableRenameRule == null) {
            this.dbOrTableRenameRule = new DbOrTableRenameRule();
            dbOrTableRenameRuleSetter.accept(this.dbOrTableRenameRule);
        }

        return this;
    }

    /**
     * Get dbOrTableRenameRule
     * @return dbOrTableRenameRule
     */
    public DbOrTableRenameRule getDbOrTableRenameRule() {
        return dbOrTableRenameRule;
    }

    public void setDbOrTableRenameRule(DbOrTableRenameRule dbOrTableRenameRule) {
        this.dbOrTableRenameRule = dbOrTableRenameRule;
    }

    public DataProcessInfo withDbObject(DbObject dbObject) {
        this.dbObject = dbObject;
        return this;
    }

    public DataProcessInfo withDbObject(Consumer<DbObject> dbObjectSetter) {
        if (this.dbObject == null) {
            this.dbObject = new DbObject();
            dbObjectSetter.accept(this.dbObject);
        }

        return this;
    }

    /**
     * Get dbObject
     * @return dbObject
     */
    public DbObject getDbObject() {
        return dbObject;
    }

    public void setDbObject(DbObject dbObject) {
        this.dbObject = dbObject;
    }

    public DataProcessInfo withIsSynchronized(Boolean isSynchronized) {
        this.isSynchronized = isSynchronized;
        return this;
    }

    /**
     * 表示该规则是否已同步至目标库
     * @return isSynchronized
     */
    public Boolean getIsSynchronized() {
        return isSynchronized;
    }

    public void setIsSynchronized(Boolean isSynchronized) {
        this.isSynchronized = isSynchronized;
    }

    public DataProcessInfo withSource(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * 对比的来源 - job 表示数据同步时的过滤 - compare 表示数据对比的过滤
     * @return source
     */
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataProcessInfo that = (DataProcessInfo) obj;
        return Objects.equals(this.filterConditions, that.filterConditions)
            && Objects.equals(this.isBatchProcess, that.isBatchProcess)
            && Objects.equals(this.addColumns, that.addColumns) && Objects.equals(this.ddlOperation, that.ddlOperation)
            && Objects.equals(this.dmlOperation, that.dmlOperation)
            && Objects.equals(this.dbObjectColumnInfo, that.dbObjectColumnInfo)
            && Objects.equals(this.dbOrTableRenameRule, that.dbOrTableRenameRule)
            && Objects.equals(this.dbObject, that.dbObject) && Objects.equals(this.isSynchronized, that.isSynchronized)
            && Objects.equals(this.source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterConditions,
            isBatchProcess,
            addColumns,
            ddlOperation,
            dmlOperation,
            dbObjectColumnInfo,
            dbOrTableRenameRule,
            dbObject,
            isSynchronized,
            source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataProcessInfo {\n");
        sb.append("    filterConditions: ").append(toIndentedString(filterConditions)).append("\n");
        sb.append("    isBatchProcess: ").append(toIndentedString(isBatchProcess)).append("\n");
        sb.append("    addColumns: ").append(toIndentedString(addColumns)).append("\n");
        sb.append("    ddlOperation: ").append(toIndentedString(ddlOperation)).append("\n");
        sb.append("    dmlOperation: ").append(toIndentedString(dmlOperation)).append("\n");
        sb.append("    dbObjectColumnInfo: ").append(toIndentedString(dbObjectColumnInfo)).append("\n");
        sb.append("    dbOrTableRenameRule: ").append(toIndentedString(dbOrTableRenameRule)).append("\n");
        sb.append("    dbObject: ").append(toIndentedString(dbObject)).append("\n");
        sb.append("    isSynchronized: ").append(toIndentedString(isSynchronized)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
