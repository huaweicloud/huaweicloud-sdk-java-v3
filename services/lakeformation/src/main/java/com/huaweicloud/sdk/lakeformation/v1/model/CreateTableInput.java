package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建表输入模型
 */
public class CreateTableInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    /**
     * 表格式，支持HIVE、ICEBERG、LANCE
     */
    public static final class TableFormatEnum {

        /**
         * Enum HIVE for value: "HIVE"
         */
        public static final TableFormatEnum HIVE = new TableFormatEnum("HIVE");

        /**
         * Enum ICEBERG for value: "ICEBERG"
         */
        public static final TableFormatEnum ICEBERG = new TableFormatEnum("ICEBERG");

        /**
         * Enum LANCE for value: "LANCE"
         */
        public static final TableFormatEnum LANCE = new TableFormatEnum("LANCE");

        private static final Map<String, TableFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TableFormatEnum> createStaticFields() {
            Map<String, TableFormatEnum> map = new HashMap<>();
            map.put("HIVE", HIVE);
            map.put("ICEBERG", ICEBERG);
            map.put("LANCE", LANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TableFormatEnum(String value) {
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
        public static TableFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableFormatEnum(value));
        }

        public static TableFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TableFormatEnum) {
                return this.value.equals(((TableFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_format")

    private TableFormatEnum tableFormat;

    /**
     * 表类型，MANAGED_TABLE-内表、EXTERNAL_TABLE-外表、VIRTUAL_VIEW-视图、MATERIALIZED_VIEW-物化视图、DICTIONARY_TABLE-字典表、LAKE_TABLE-内表
     */
    public static final class TableTypeEnum {

        /**
         * Enum MANAGED_TABLE for value: "MANAGED_TABLE"
         */
        public static final TableTypeEnum MANAGED_TABLE = new TableTypeEnum("MANAGED_TABLE");

        /**
         * Enum EXTERNAL_TABLE for value: "EXTERNAL_TABLE"
         */
        public static final TableTypeEnum EXTERNAL_TABLE = new TableTypeEnum("EXTERNAL_TABLE");

        /**
         * Enum VIRTUAL_VIEW for value: "VIRTUAL_VIEW"
         */
        public static final TableTypeEnum VIRTUAL_VIEW = new TableTypeEnum("VIRTUAL_VIEW");

        /**
         * Enum MATERIALIZED_VIEW for value: "MATERIALIZED_VIEW"
         */
        public static final TableTypeEnum MATERIALIZED_VIEW = new TableTypeEnum("MATERIALIZED_VIEW");

        /**
         * Enum DICTIONARY_TABLE for value: "DICTIONARY_TABLE"
         */
        public static final TableTypeEnum DICTIONARY_TABLE = new TableTypeEnum("DICTIONARY_TABLE");

        /**
         * Enum LAKE_TABLE for value: "LAKE_TABLE"
         */
        public static final TableTypeEnum LAKE_TABLE = new TableTypeEnum("LAKE_TABLE");

        private static final Map<String, TableTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TableTypeEnum> createStaticFields() {
            Map<String, TableTypeEnum> map = new HashMap<>();
            map.put("MANAGED_TABLE", MANAGED_TABLE);
            map.put("EXTERNAL_TABLE", EXTERNAL_TABLE);
            map.put("VIRTUAL_VIEW", VIRTUAL_VIEW);
            map.put("MATERIALIZED_VIEW", MATERIALIZED_VIEW);
            map.put("DICTIONARY_TABLE", DICTIONARY_TABLE);
            map.put("LAKE_TABLE", LAKE_TABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TableTypeEnum(String value) {
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
        public static TableTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableTypeEnum(value));
        }

        public static TableTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TableTypeEnum) {
                return this.value.equals(((TableTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private TableTypeEnum tableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    /**
     * 所有者类型，USER-用户、GROUP-组、ROLE-角色
     */
    public static final class OwnerTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final OwnerTypeEnum USER = new OwnerTypeEnum("USER");

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final OwnerTypeEnum GROUP = new OwnerTypeEnum("GROUP");

        /**
         * Enum ROLE for value: "ROLE"
         */
        public static final OwnerTypeEnum ROLE = new OwnerTypeEnum("ROLE");

        private static final Map<String, OwnerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OwnerTypeEnum> createStaticFields() {
            Map<String, OwnerTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("GROUP", GROUP);
            map.put("ROLE", ROLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OwnerTypeEnum(String value) {
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
        public static OwnerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OwnerTypeEnum(value));
        }

        public static OwnerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OwnerTypeEnum) {
                return this.value.equals(((OwnerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_type")

    private OwnerTypeEnum ownerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_access_time")

    private OffsetDateTime lastAccessTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_analyzed_time")

    private OffsetDateTime lastAnalyzedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_keys")

    private List<Column> partitionKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention")

    private Integer retention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_descriptor")

    private StorageDescriptor storageDescriptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, String> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comments")

    private String comments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_expanded_text")

    private String viewExpandedText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_original_text")

    private String viewOriginalText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_obs_checked")

    private Boolean ignoreObsChecked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_statistic_enable")

    private Boolean dataStatisticEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_open_table_format_input")

    private CreateOpenTableFormatInput createOpenTableFormatInput;

    public CreateTableInput withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称。只能包含中文、字母、数字和下划线，且长度为1~256个字符。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public CreateTableInput withTableFormat(TableFormatEnum tableFormat) {
        this.tableFormat = tableFormat;
        return this;
    }

    /**
     * 表格式，支持HIVE、ICEBERG、LANCE
     * @return tableFormat
     */
    public TableFormatEnum getTableFormat() {
        return tableFormat;
    }

    public void setTableFormat(TableFormatEnum tableFormat) {
        this.tableFormat = tableFormat;
    }

    public CreateTableInput withTableType(TableTypeEnum tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表类型，MANAGED_TABLE-内表、EXTERNAL_TABLE-外表、VIRTUAL_VIEW-视图、MATERIALIZED_VIEW-物化视图、DICTIONARY_TABLE-字典表、LAKE_TABLE-内表
     * @return tableType
     */
    public TableTypeEnum getTableType() {
        return tableType;
    }

    public void setTableType(TableTypeEnum tableType) {
        this.tableType = tableType;
    }

    public CreateTableInput withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 表所有者。只能包含字母、数字和下划线，且长度为0~49个字符。可以为null。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CreateTableInput withOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * 所有者类型，USER-用户、GROUP-组、ROLE-角色
     * @return ownerType
     */
    public OwnerTypeEnum getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
    }

    public CreateTableInput withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public CreateTableInput withLastAccessTime(OffsetDateTime lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * 最近一次访问时间
     * @return lastAccessTime
     */
    public OffsetDateTime getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(OffsetDateTime lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public CreateTableInput withLastAnalyzedTime(OffsetDateTime lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
        return this;
    }

    /**
     * 最近一次分析统计时间
     * @return lastAnalyzedTime
     */
    public OffsetDateTime getLastAnalyzedTime() {
        return lastAnalyzedTime;
    }

    public void setLastAnalyzedTime(OffsetDateTime lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
    }

    public CreateTableInput withPartitionKeys(List<Column> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }

    public CreateTableInput addPartitionKeysItem(Column partitionKeysItem) {
        if (this.partitionKeys == null) {
            this.partitionKeys = new ArrayList<>();
        }
        this.partitionKeys.add(partitionKeysItem);
        return this;
    }

    public CreateTableInput withPartitionKeys(Consumer<List<Column>> partitionKeysSetter) {
        if (this.partitionKeys == null) {
            this.partitionKeys = new ArrayList<>();
        }
        partitionKeysSetter.accept(this.partitionKeys);
        return this;
    }

    /**
     * 分区列的信息
     * @return partitionKeys
     */
    public List<Column> getPartitionKeys() {
        return partitionKeys;
    }

    public void setPartitionKeys(List<Column> partitionKeys) {
        this.partitionKeys = partitionKeys;
    }

    public CreateTableInput withRetention(Integer retention) {
        this.retention = retention;
        return this;
    }

    /**
     * 表保留时间
     * minimum: 0
     * maximum: 2147483647
     * @return retention
     */
    public Integer getRetention() {
        return retention;
    }

    public void setRetention(Integer retention) {
        this.retention = retention;
    }

    public CreateTableInput withStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
        return this;
    }

    public CreateTableInput withStorageDescriptor(Consumer<StorageDescriptor> storageDescriptorSetter) {
        if (this.storageDescriptor == null) {
            this.storageDescriptor = new StorageDescriptor();
            storageDescriptorSetter.accept(this.storageDescriptor);
        }

        return this;
    }

    /**
     * Get storageDescriptor
     * @return storageDescriptor
     */
    public StorageDescriptor getStorageDescriptor() {
        return storageDescriptor;
    }

    public void setStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
    }

    public CreateTableInput withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public CreateTableInput putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public CreateTableInput withParameters(Consumer<Map<String, String>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 表参数信息，每个键是一个键字符串，不少于 1 个字节或超过 255 个字节 每个值是一个 UTF-8 字符串，不超过 4000 个字节
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public CreateTableInput withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * 表描述信息。由用户创建表时输入，最大长度为4000个字符。
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public CreateTableInput withViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }

    /**
     * 如果表是视图，则为视图的扩展文本；否则为 null
     * @return viewExpandedText
     */
    public String getViewExpandedText() {
        return viewExpandedText;
    }

    public void setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
    }

    public CreateTableInput withViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }

    /**
     * 如果表是视图，则为视图的原始文本；否则为 null
     * @return viewOriginalText
     */
    public String getViewOriginalText() {
        return viewOriginalText;
    }

    public void setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
    }

    public CreateTableInput withIgnoreObsChecked(Boolean ignoreObsChecked) {
        this.ignoreObsChecked = ignoreObsChecked;
        return this;
    }

    /**
     * 是否忽略内表建表时对Obs路径的限制
     * @return ignoreObsChecked
     */
    public Boolean getIgnoreObsChecked() {
        return ignoreObsChecked;
    }

    public void setIgnoreObsChecked(Boolean ignoreObsChecked) {
        this.ignoreObsChecked = ignoreObsChecked;
    }

    public CreateTableInput withDataStatisticEnable(Boolean dataStatisticEnable) {
        this.dataStatisticEnable = dataStatisticEnable;
        return this;
    }

    /**
     * 数据概况统计开关。默认状态为开，修改table开关状态后，还需检查所属database的开关状态。例如：table与所属database开关同时打开，则数据概况统计开启。否则关闭
     * @return dataStatisticEnable
     */
    public Boolean getDataStatisticEnable() {
        return dataStatisticEnable;
    }

    public void setDataStatisticEnable(Boolean dataStatisticEnable) {
        this.dataStatisticEnable = dataStatisticEnable;
    }

    public CreateTableInput withCreateOpenTableFormatInput(CreateOpenTableFormatInput createOpenTableFormatInput) {
        this.createOpenTableFormatInput = createOpenTableFormatInput;
        return this;
    }

    public CreateTableInput withCreateOpenTableFormatInput(
        Consumer<CreateOpenTableFormatInput> createOpenTableFormatInputSetter) {
        if (this.createOpenTableFormatInput == null) {
            this.createOpenTableFormatInput = new CreateOpenTableFormatInput();
            createOpenTableFormatInputSetter.accept(this.createOpenTableFormatInput);
        }

        return this;
    }

    /**
     * Get createOpenTableFormatInput
     * @return createOpenTableFormatInput
     */
    public CreateOpenTableFormatInput getCreateOpenTableFormatInput() {
        return createOpenTableFormatInput;
    }

    public void setCreateOpenTableFormatInput(CreateOpenTableFormatInput createOpenTableFormatInput) {
        this.createOpenTableFormatInput = createOpenTableFormatInput;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTableInput that = (CreateTableInput) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.tableFormat, that.tableFormat)
            && Objects.equals(this.tableType, that.tableType) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.ownerType, that.ownerType) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastAccessTime, that.lastAccessTime)
            && Objects.equals(this.lastAnalyzedTime, that.lastAnalyzedTime)
            && Objects.equals(this.partitionKeys, that.partitionKeys) && Objects.equals(this.retention, that.retention)
            && Objects.equals(this.storageDescriptor, that.storageDescriptor)
            && Objects.equals(this.parameters, that.parameters) && Objects.equals(this.comments, that.comments)
            && Objects.equals(this.viewExpandedText, that.viewExpandedText)
            && Objects.equals(this.viewOriginalText, that.viewOriginalText)
            && Objects.equals(this.ignoreObsChecked, that.ignoreObsChecked)
            && Objects.equals(this.dataStatisticEnable, that.dataStatisticEnable)
            && Objects.equals(this.createOpenTableFormatInput, that.createOpenTableFormatInput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            tableFormat,
            tableType,
            owner,
            ownerType,
            createTime,
            lastAccessTime,
            lastAnalyzedTime,
            partitionKeys,
            retention,
            storageDescriptor,
            parameters,
            comments,
            viewExpandedText,
            viewOriginalText,
            ignoreObsChecked,
            dataStatisticEnable,
            createOpenTableFormatInput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableInput {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableFormat: ").append(toIndentedString(tableFormat)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastAccessTime: ").append(toIndentedString(lastAccessTime)).append("\n");
        sb.append("    lastAnalyzedTime: ").append(toIndentedString(lastAnalyzedTime)).append("\n");
        sb.append("    partitionKeys: ").append(toIndentedString(partitionKeys)).append("\n");
        sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
        sb.append("    storageDescriptor: ").append(toIndentedString(storageDescriptor)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    viewExpandedText: ").append(toIndentedString(viewExpandedText)).append("\n");
        sb.append("    viewOriginalText: ").append(toIndentedString(viewOriginalText)).append("\n");
        sb.append("    ignoreObsChecked: ").append(toIndentedString(ignoreObsChecked)).append("\n");
        sb.append("    dataStatisticEnable: ").append(toIndentedString(dataStatisticEnable)).append("\n");
        sb.append("    createOpenTableFormatInput: ").append(toIndentedString(createOpenTableFormatInput)).append("\n");
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
