package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 策略信息体。设置迁移、同步策略，包括冲突策略、过滤DROP Datase、对象同步范围等。
 */
public class PolicyConfig {

    /**
     * 过滤DDL策略。取值： - drop_database  场景区别： - 实时迁移场景：MySQL迁移可填\"\"，表示不过滤DROP DATABASE。 - 实时同步场景：MySQL同步只能填\"drop_database\"。
     */
    public static final class FilterDdlPolicyEnum {

        /**
         * Enum DROP_DATABASE for value: "drop_database"
         */
        public static final FilterDdlPolicyEnum DROP_DATABASE = new FilterDdlPolicyEnum("drop_database");

        private static final Map<String, FilterDdlPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterDdlPolicyEnum> createStaticFields() {
            Map<String, FilterDdlPolicyEnum> map = new HashMap<>();
            map.put("drop_database", DROP_DATABASE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilterDdlPolicyEnum(String value) {
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
        public static FilterDdlPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FilterDdlPolicyEnum(value));
        }

        public static FilterDdlPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FilterDdlPolicyEnum) {
                return this.value.equals(((FilterDdlPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_ddl_policy")

    private FilterDdlPolicyEnum filterDdlPolicy;

    /**
     * 增量阶段冲突策略。该冲突策略特指增量同步中的冲突处理策略,全量阶段的冲突默认忽略。取值： - ignore：忽略。当同步数据与目标库已有数据冲突时（主键/唯一键重复等），DRS将忽略源库的冲突数据，并保留目标库中的冲突数据，继续进行后续同步。  - stop：报错。当同步数据与目标库已有数据冲突时（主键/唯一键重复等），同步任务将失败并立即中止。可在同步日志中查看详细信息。  - overwrite：覆盖。当同步数据与目标库已有数据冲突时（主键/唯一键重复等），将覆盖原来的冲突数据。  场景区别： - 实时迁移场景：不支持。 - 实时同步场景：支持。
     */
    public static final class ConflictPolicyEnum {

        /**
         * Enum IGNORE for value: "ignore"
         */
        public static final ConflictPolicyEnum IGNORE = new ConflictPolicyEnum("ignore");

        /**
         * Enum STOP for value: "stop"
         */
        public static final ConflictPolicyEnum STOP = new ConflictPolicyEnum("stop");

        /**
         * Enum OVERWRITE for value: "overwrite"
         */
        public static final ConflictPolicyEnum OVERWRITE = new ConflictPolicyEnum("overwrite");

        private static final Map<String, ConflictPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConflictPolicyEnum> createStaticFields() {
            Map<String, ConflictPolicyEnum> map = new HashMap<>();
            map.put("ignore", IGNORE);
            map.put("stop", STOP);
            map.put("overwrite", OVERWRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConflictPolicyEnum(String value) {
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
        public static ConflictPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConflictPolicyEnum(value));
        }

        public static ConflictPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConflictPolicyEnum) {
                return this.value.equals(((ConflictPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conflict_policy")

    private ConflictPolicyEnum conflictPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_trans")

    private Boolean indexTrans;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_trans")

    private Boolean ddlTrans;

    /**
     * 数据同步拓扑。数据同步功能支持多种同步拓扑，您可以根据业务需求规划您的同步实例。参考链接。取值： - one2one：一对一。 - one2many：一对多。 - many2one：多对一。
     */
    public static final class DataSyncTopologyTypeEnum {

        /**
         * Enum ONE2ONE for value: "one2one"
         */
        public static final DataSyncTopologyTypeEnum ONE2ONE = new DataSyncTopologyTypeEnum("one2one");

        /**
         * Enum ONE2MANY for value: "one2many"
         */
        public static final DataSyncTopologyTypeEnum ONE2MANY = new DataSyncTopologyTypeEnum("one2many");

        /**
         * Enum MANY2ONE for value: "many2one"
         */
        public static final DataSyncTopologyTypeEnum MANY2ONE = new DataSyncTopologyTypeEnum("many2one");

        private static final Map<String, DataSyncTopologyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataSyncTopologyTypeEnum> createStaticFields() {
            Map<String, DataSyncTopologyTypeEnum> map = new HashMap<>();
            map.put("one2one", ONE2ONE);
            map.put("one2many", ONE2MANY);
            map.put("many2one", MANY2ONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataSyncTopologyTypeEnum(String value) {
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
        public static DataSyncTopologyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DataSyncTopologyTypeEnum(value));
        }

        public static DataSyncTopologyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataSyncTopologyTypeEnum) {
                return this.value.equals(((DataSyncTopologyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sync_topology_type")

    private DataSyncTopologyTypeEnum dataSyncTopologyType;

    /**
     * 增量支持的DDL。取值： - \"CREATE_TABLE,ADD_COLUMN,MODIFY_COLUMN,CHANGE_COLUMN,DROP_INDEX,ADD_INDEX,CREATE_INDEX,RENAME_INDEX\"。 - 含义解释： - CREATE_TABLE：创建表。 - ADD_COLUMN：加列。 - MODIFY_COLUMN：改列属性。 - CHANGE_COLUMN：改列属性。 - DROP_INDEX：删除索引。 - ADD_INDEX：加索引。 - CREATE_INDEX：创建索引。 - RENAME_INDEX：重命名索引。 - 使用提示： 1.一对一，一对多场景，如果业务上认为源和目标应该使用保持严格一致，那么高危类DDL也应该勾选并同步。 2.一对一，一对多场景，如果业务上确定某个高危DDL不应该发生，则可以不勾选同步高危类DDL，这样DRS将拦截过滤这个DDL，从而起到保护目标数据的作用，但需要知晓过滤DDL的附带问题是可能导致同步失败，例如过滤删列动作。 3.多对一数据聚合场景，最佳实践是推荐只选择同步加列DDL，其他大部分DDL同步都因目标表修改而导致其他任务失败/数据不一致的情况发生，常见情况有：a、同步truncate导致目标数据全部被清空； b、同步创建索引导致目标表被锁定； c、同步rename导致其他任务找不到目标表而失败；d、同步改列导致其他任务因数据类型不兼容而失败；
     */
    public static final class SupportDdlInfoEnum {

        /**
         * Enum CREATE_TABLE for value: "CREATE_TABLE"
         */
        public static final SupportDdlInfoEnum CREATE_TABLE = new SupportDdlInfoEnum("CREATE_TABLE");

        /**
         * Enum ADD_COLUMN for value: "ADD_COLUMN"
         */
        public static final SupportDdlInfoEnum ADD_COLUMN = new SupportDdlInfoEnum("ADD_COLUMN");

        /**
         * Enum MODIFY_COLUMN for value: "MODIFY_COLUMN"
         */
        public static final SupportDdlInfoEnum MODIFY_COLUMN = new SupportDdlInfoEnum("MODIFY_COLUMN");

        /**
         * Enum CHANGE_COLUMN for value: "CHANGE_COLUMN"
         */
        public static final SupportDdlInfoEnum CHANGE_COLUMN = new SupportDdlInfoEnum("CHANGE_COLUMN");

        /**
         * Enum DROP_INDEX for value: "DROP_INDEX"
         */
        public static final SupportDdlInfoEnum DROP_INDEX = new SupportDdlInfoEnum("DROP_INDEX");

        /**
         * Enum ADD_INDEX for value: "ADD_INDEX"
         */
        public static final SupportDdlInfoEnum ADD_INDEX = new SupportDdlInfoEnum("ADD_INDEX");

        /**
         * Enum CREATE_INDEX for value: "CREATE_INDEX"
         */
        public static final SupportDdlInfoEnum CREATE_INDEX = new SupportDdlInfoEnum("CREATE_INDEX");

        /**
         * Enum RENAME_INDEX for value: "RENAME_INDEX"
         */
        public static final SupportDdlInfoEnum RENAME_INDEX = new SupportDdlInfoEnum("RENAME_INDEX");

        private static final Map<String, SupportDdlInfoEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportDdlInfoEnum> createStaticFields() {
            Map<String, SupportDdlInfoEnum> map = new HashMap<>();
            map.put("CREATE_TABLE", CREATE_TABLE);
            map.put("ADD_COLUMN", ADD_COLUMN);
            map.put("MODIFY_COLUMN", MODIFY_COLUMN);
            map.put("CHANGE_COLUMN", CHANGE_COLUMN);
            map.put("DROP_INDEX", DROP_INDEX);
            map.put("ADD_INDEX", ADD_INDEX);
            map.put("CREATE_INDEX", CREATE_INDEX);
            map.put("RENAME_INDEX", RENAME_INDEX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportDdlInfoEnum(String value) {
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
        public static SupportDdlInfoEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportDdlInfoEnum(value));
        }

        public static SupportDdlInfoEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportDdlInfoEnum) {
                return this.value.equals(((SupportDdlInfoEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ddl_info")

    private SupportDdlInfoEnum supportDdlInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_type_policy")

    private String syncTypePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "increment_read_mode")

    private String incrementReadMode;

    public PolicyConfig withFilterDdlPolicy(FilterDdlPolicyEnum filterDdlPolicy) {
        this.filterDdlPolicy = filterDdlPolicy;
        return this;
    }

    /**
     * 过滤DDL策略。取值： - drop_database  场景区别： - 实时迁移场景：MySQL迁移可填\"\"，表示不过滤DROP DATABASE。 - 实时同步场景：MySQL同步只能填\"drop_database\"。
     * @return filterDdlPolicy
     */
    public FilterDdlPolicyEnum getFilterDdlPolicy() {
        return filterDdlPolicy;
    }

    public void setFilterDdlPolicy(FilterDdlPolicyEnum filterDdlPolicy) {
        this.filterDdlPolicy = filterDdlPolicy;
    }

    public PolicyConfig withConflictPolicy(ConflictPolicyEnum conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }

    /**
     * 增量阶段冲突策略。该冲突策略特指增量同步中的冲突处理策略,全量阶段的冲突默认忽略。取值： - ignore：忽略。当同步数据与目标库已有数据冲突时（主键/唯一键重复等），DRS将忽略源库的冲突数据，并保留目标库中的冲突数据，继续进行后续同步。  - stop：报错。当同步数据与目标库已有数据冲突时（主键/唯一键重复等），同步任务将失败并立即中止。可在同步日志中查看详细信息。  - overwrite：覆盖。当同步数据与目标库已有数据冲突时（主键/唯一键重复等），将覆盖原来的冲突数据。  场景区别： - 实时迁移场景：不支持。 - 实时同步场景：支持。
     * @return conflictPolicy
     */
    public ConflictPolicyEnum getConflictPolicy() {
        return conflictPolicy;
    }

    public void setConflictPolicy(ConflictPolicyEnum conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
    }

    public PolicyConfig withIndexTrans(Boolean indexTrans) {
        this.indexTrans = indexTrans;
        return this;
    }

    /**
     * 对象同步范围：是否同步普通索引。DRS将默认同步主键/唯一索引，普通索引是指除主键/唯一索引以外的其他类型索引。取值： - true：将会同步全部的索引。 - false：仅同步主键/唯一索引，普通索引不会同步。
     * @return indexTrans
     */
    public Boolean getIndexTrans() {
        return indexTrans;
    }

    public void setIndexTrans(Boolean indexTrans) {
        this.indexTrans = indexTrans;
    }

    public PolicyConfig withDdlTrans(Boolean ddlTrans) {
        this.ddlTrans = ddlTrans;
        return this;
    }

    /**
     * 对象同步范围：同步增量阶段是否同步DDL。取值： - true：增量阶段同步DDL。 - false：增量阶段不同步DDL。
     * @return ddlTrans
     */
    public Boolean getDdlTrans() {
        return ddlTrans;
    }

    public void setDdlTrans(Boolean ddlTrans) {
        this.ddlTrans = ddlTrans;
    }

    public PolicyConfig withDataSyncTopologyType(DataSyncTopologyTypeEnum dataSyncTopologyType) {
        this.dataSyncTopologyType = dataSyncTopologyType;
        return this;
    }

    /**
     * 数据同步拓扑。数据同步功能支持多种同步拓扑，您可以根据业务需求规划您的同步实例。参考链接。取值： - one2one：一对一。 - one2many：一对多。 - many2one：多对一。
     * @return dataSyncTopologyType
     */
    public DataSyncTopologyTypeEnum getDataSyncTopologyType() {
        return dataSyncTopologyType;
    }

    public void setDataSyncTopologyType(DataSyncTopologyTypeEnum dataSyncTopologyType) {
        this.dataSyncTopologyType = dataSyncTopologyType;
    }

    public PolicyConfig withSupportDdlInfo(SupportDdlInfoEnum supportDdlInfo) {
        this.supportDdlInfo = supportDdlInfo;
        return this;
    }

    /**
     * 增量支持的DDL。取值： - \"CREATE_TABLE,ADD_COLUMN,MODIFY_COLUMN,CHANGE_COLUMN,DROP_INDEX,ADD_INDEX,CREATE_INDEX,RENAME_INDEX\"。 - 含义解释： - CREATE_TABLE：创建表。 - ADD_COLUMN：加列。 - MODIFY_COLUMN：改列属性。 - CHANGE_COLUMN：改列属性。 - DROP_INDEX：删除索引。 - ADD_INDEX：加索引。 - CREATE_INDEX：创建索引。 - RENAME_INDEX：重命名索引。 - 使用提示： 1.一对一，一对多场景，如果业务上认为源和目标应该使用保持严格一致，那么高危类DDL也应该勾选并同步。 2.一对一，一对多场景，如果业务上确定某个高危DDL不应该发生，则可以不勾选同步高危类DDL，这样DRS将拦截过滤这个DDL，从而起到保护目标数据的作用，但需要知晓过滤DDL的附带问题是可能导致同步失败，例如过滤删列动作。 3.多对一数据聚合场景，最佳实践是推荐只选择同步加列DDL，其他大部分DDL同步都因目标表修改而导致其他任务失败/数据不一致的情况发生，常见情况有：a、同步truncate导致目标数据全部被清空； b、同步创建索引导致目标表被锁定； c、同步rename导致其他任务找不到目标表而失败；d、同步改列导致其他任务因数据类型不兼容而失败；
     * @return supportDdlInfo
     */
    public SupportDdlInfoEnum getSupportDdlInfo() {
        return supportDdlInfo;
    }

    public void setSupportDdlInfo(SupportDdlInfoEnum supportDdlInfo) {
        this.supportDdlInfo = supportDdlInfo;
    }

    public PolicyConfig withSyncTypePolicy(String syncTypePolicy) {
        this.syncTypePolicy = syncTypePolicy;
        return this;
    }

    /**
     * 同步数据类型。取值：supportAllType（同步所有类型），tableData（同步数据），tableStructure（同步表结构），constraintData（索引同步）。 说明：除supportAllType以外，其他类型可组合填写，例如：\"tableData,tableStructure\" 。
     * @return syncTypePolicy
     */
    public String getSyncTypePolicy() {
        return syncTypePolicy;
    }

    public void setSyncTypePolicy(String syncTypePolicy) {
        this.syncTypePolicy = syncTypePolicy;
    }

    public PolicyConfig withIncrementReadMode(String incrementReadMode) {
        this.incrementReadMode = incrementReadMode;
        return this;
    }

    /**
     * oracle-gausssdb增量读取方式：logminer，xstream
     * @return incrementReadMode
     */
    public String getIncrementReadMode() {
        return incrementReadMode;
    }

    public void setIncrementReadMode(String incrementReadMode) {
        this.incrementReadMode = incrementReadMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyConfig that = (PolicyConfig) obj;
        return Objects.equals(this.filterDdlPolicy, that.filterDdlPolicy)
            && Objects.equals(this.conflictPolicy, that.conflictPolicy)
            && Objects.equals(this.indexTrans, that.indexTrans) && Objects.equals(this.ddlTrans, that.ddlTrans)
            && Objects.equals(this.dataSyncTopologyType, that.dataSyncTopologyType)
            && Objects.equals(this.supportDdlInfo, that.supportDdlInfo)
            && Objects.equals(this.syncTypePolicy, that.syncTypePolicy)
            && Objects.equals(this.incrementReadMode, that.incrementReadMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterDdlPolicy,
            conflictPolicy,
            indexTrans,
            ddlTrans,
            dataSyncTopologyType,
            supportDdlInfo,
            syncTypePolicy,
            incrementReadMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyConfig {\n");
        sb.append("    filterDdlPolicy: ").append(toIndentedString(filterDdlPolicy)).append("\n");
        sb.append("    conflictPolicy: ").append(toIndentedString(conflictPolicy)).append("\n");
        sb.append("    indexTrans: ").append(toIndentedString(indexTrans)).append("\n");
        sb.append("    ddlTrans: ").append(toIndentedString(ddlTrans)).append("\n");
        sb.append("    dataSyncTopologyType: ").append(toIndentedString(dataSyncTopologyType)).append("\n");
        sb.append("    supportDdlInfo: ").append(toIndentedString(supportDdlInfo)).append("\n");
        sb.append("    syncTypePolicy: ").append(toIndentedString(syncTypePolicy)).append("\n");
        sb.append("    incrementReadMode: ").append(toIndentedString(incrementReadMode)).append("\n");
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
