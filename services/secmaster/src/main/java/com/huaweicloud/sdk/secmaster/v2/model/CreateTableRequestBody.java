package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTableRequestBody
 */
public class CreateTableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias")

    private String tableAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias_en")

    private String tableAliasEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias_fr")

    private String tableAliasFr;

    /**
     * **参数解释**: 目录类型 - STREAMING 实时流 - INDEX 索引 - APPLICATION 应用 - TENANT_BUCKET 租户桶 - LAKE 数据湖  **约束限制** 不涉及 **取值范围**: - STREAMING - INDEX - APPLICATION - TENANT_BUCKET - LAKE  **默认值** 不涉及
     */
    public static final class CategoryEnum {

        /**
         * Enum STREAMING for value: "STREAMING"
         */
        public static final CategoryEnum STREAMING = new CategoryEnum("STREAMING");

        /**
         * Enum INDEX for value: "INDEX"
         */
        public static final CategoryEnum INDEX = new CategoryEnum("INDEX");

        /**
         * Enum APPLICATION for value: "APPLICATION"
         */
        public static final CategoryEnum APPLICATION = new CategoryEnum("APPLICATION");

        /**
         * Enum TENANT_BUCKET for value: "TENANT_BUCKET"
         */
        public static final CategoryEnum TENANT_BUCKET = new CategoryEnum("TENANT_BUCKET");

        /**
         * Enum LAKE for value: "LAKE"
         */
        public static final CategoryEnum LAKE = new CategoryEnum("LAKE");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("STREAMING", STREAMING);
            map.put("INDEX", INDEX);
            map.put("APPLICATION", APPLICATION);
            map.put("TENANT_BUCKET", TENANT_BUCKET);
            map.put("LAKE", LAKE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    /**
     * **参数解释**: 表格式 - JSON Json格式 - DEBEZIUM_JSON Debezium JSON 格式 - CSV CSV格式 - PARQUET PARQUET格式 - ORC ORC格式  **约束限制** 不涉及 **取值范围**: - JSON - DEBEZIUM_JSON - CSV - PARQUET - ORC  **默认值** 不涉及
     */
    public static final class FormatEnum {

        /**
         * Enum JSON for value: "JSON"
         */
        public static final FormatEnum JSON = new FormatEnum("JSON");

        /**
         * Enum DEBEZIUM_JSON for value: "DEBEZIUM_JSON"
         */
        public static final FormatEnum DEBEZIUM_JSON = new FormatEnum("DEBEZIUM_JSON");

        /**
         * Enum CSV for value: "CSV"
         */
        public static final FormatEnum CSV = new FormatEnum("CSV");

        /**
         * Enum PARQUET for value: "PARQUET"
         */
        public static final FormatEnum PARQUET = new FormatEnum("PARQUET");

        /**
         * Enum ORC for value: "ORC"
         */
        public static final FormatEnum ORC = new FormatEnum("ORC");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("JSON", JSON);
            map.put("DEBEZIUM_JSON", DEBEZIUM_JSON);
            map.put("CSV", CSV);
            map.put("PARQUET", PARQUET);
            map.put("ORC", ORC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FormatEnum(value));
        }

        public static FormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FormatEnum) {
                return this.value.equals(((FormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private FormatEnum format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_en")

    private String descriptionEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_fr")

    private String descriptionFr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_en")

    private String directoryEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_fr")

    private String directoryFr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_classification")

    private DataClassification dataClassification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private IsapTableSchema schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_setting")

    private TableStorageSetting storageSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_setting")

    private TableDisplaySetting displaySetting;

    /**
     * **参数解释**: 创建政策 - SYS_INIT_INDEX_APP_TBL 系统初始化索引应用表 - DEFAULT 默认  **约束限制** 不涉及 **取值范围**: - SYS_INIT_INDEX_APP_TBL - DEFAULT  **默认值** 不涉及
     */
    public static final class CreatePolicyEnum {

        /**
         * Enum SYS_INIT_INDEX_APP_TBL for value: "SYS_INIT_INDEX_APP_TBL"
         */
        public static final CreatePolicyEnum SYS_INIT_INDEX_APP_TBL = new CreatePolicyEnum("SYS_INIT_INDEX_APP_TBL");

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final CreatePolicyEnum DEFAULT = new CreatePolicyEnum("DEFAULT");

        private static final Map<String, CreatePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CreatePolicyEnum> createStaticFields() {
            Map<String, CreatePolicyEnum> map = new HashMap<>();
            map.put("SYS_INIT_INDEX_APP_TBL", SYS_INIT_INDEX_APP_TBL);
            map.put("DEFAULT", DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CreatePolicyEnum(String value) {
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
        public static CreatePolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CreatePolicyEnum(value));
        }

        public static CreatePolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CreatePolicyEnum) {
                return this.value.equals(((CreatePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_policy")

    private CreatePolicyEnum createPolicy;

    public CreateTableRequestBody withTableName(String tableName) {
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

    public CreateTableRequestBody withTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
        return this;
    }

    /**
     * 表别名
     * @return tableAlias
     */
    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public CreateTableRequestBody withTableAliasEn(String tableAliasEn) {
        this.tableAliasEn = tableAliasEn;
        return this;
    }

    /**
     * 表别名
     * @return tableAliasEn
     */
    public String getTableAliasEn() {
        return tableAliasEn;
    }

    public void setTableAliasEn(String tableAliasEn) {
        this.tableAliasEn = tableAliasEn;
    }

    public CreateTableRequestBody withTableAliasFr(String tableAliasFr) {
        this.tableAliasFr = tableAliasFr;
        return this;
    }

    /**
     * 表别名
     * @return tableAliasFr
     */
    public String getTableAliasFr() {
        return tableAliasFr;
    }

    public void setTableAliasFr(String tableAliasFr) {
        this.tableAliasFr = tableAliasFr;
    }

    public CreateTableRequestBody withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**: 目录类型 - STREAMING 实时流 - INDEX 索引 - APPLICATION 应用 - TENANT_BUCKET 租户桶 - LAKE 数据湖  **约束限制** 不涉及 **取值范围**: - STREAMING - INDEX - APPLICATION - TENANT_BUCKET - LAKE  **默认值** 不涉及
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public CreateTableRequestBody withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * **参数解释**: 表格式 - JSON Json格式 - DEBEZIUM_JSON Debezium JSON 格式 - CSV CSV格式 - PARQUET PARQUET格式 - ORC ORC格式  **约束限制** 不涉及 **取值范围**: - JSON - DEBEZIUM_JSON - CSV - PARQUET - ORC  **默认值** 不涉及
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public CreateTableRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 表相关描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateTableRequestBody withDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
        return this;
    }

    /**
     * 表相关描述
     * @return descriptionEn
     */
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public CreateTableRequestBody withDescriptionFr(String descriptionFr) {
        this.descriptionFr = descriptionFr;
        return this;
    }

    /**
     * 表相关描述
     * @return descriptionFr
     */
    public String getDescriptionFr() {
        return descriptionFr;
    }

    public void setDescriptionFr(String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    public CreateTableRequestBody withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 目录分组
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public CreateTableRequestBody withDirectoryEn(String directoryEn) {
        this.directoryEn = directoryEn;
        return this;
    }

    /**
     * 目录分组
     * @return directoryEn
     */
    public String getDirectoryEn() {
        return directoryEn;
    }

    public void setDirectoryEn(String directoryEn) {
        this.directoryEn = directoryEn;
    }

    public CreateTableRequestBody withDirectoryFr(String directoryFr) {
        this.directoryFr = directoryFr;
        return this;
    }

    /**
     * 目录分组
     * @return directoryFr
     */
    public String getDirectoryFr() {
        return directoryFr;
    }

    public void setDirectoryFr(String directoryFr) {
        this.directoryFr = directoryFr;
    }

    public CreateTableRequestBody withDataClassification(DataClassification dataClassification) {
        this.dataClassification = dataClassification;
        return this;
    }

    /**
     * Get dataClassification
     * @return dataClassification
     */
    public DataClassification getDataClassification() {
        return dataClassification;
    }

    public void setDataClassification(DataClassification dataClassification) {
        this.dataClassification = dataClassification;
    }

    public CreateTableRequestBody withSchema(IsapTableSchema schema) {
        this.schema = schema;
        return this;
    }

    public CreateTableRequestBody withSchema(Consumer<IsapTableSchema> schemaSetter) {
        if (this.schema == null) {
            this.schema = new IsapTableSchema();
            schemaSetter.accept(this.schema);
        }

        return this;
    }

    /**
     * Get schema
     * @return schema
     */
    public IsapTableSchema getSchema() {
        return schema;
    }

    public void setSchema(IsapTableSchema schema) {
        this.schema = schema;
    }

    public CreateTableRequestBody withStorageSetting(TableStorageSetting storageSetting) {
        this.storageSetting = storageSetting;
        return this;
    }

    public CreateTableRequestBody withStorageSetting(Consumer<TableStorageSetting> storageSettingSetter) {
        if (this.storageSetting == null) {
            this.storageSetting = new TableStorageSetting();
            storageSettingSetter.accept(this.storageSetting);
        }

        return this;
    }

    /**
     * Get storageSetting
     * @return storageSetting
     */
    public TableStorageSetting getStorageSetting() {
        return storageSetting;
    }

    public void setStorageSetting(TableStorageSetting storageSetting) {
        this.storageSetting = storageSetting;
    }

    public CreateTableRequestBody withDisplaySetting(TableDisplaySetting displaySetting) {
        this.displaySetting = displaySetting;
        return this;
    }

    public CreateTableRequestBody withDisplaySetting(Consumer<TableDisplaySetting> displaySettingSetter) {
        if (this.displaySetting == null) {
            this.displaySetting = new TableDisplaySetting();
            displaySettingSetter.accept(this.displaySetting);
        }

        return this;
    }

    /**
     * Get displaySetting
     * @return displaySetting
     */
    public TableDisplaySetting getDisplaySetting() {
        return displaySetting;
    }

    public void setDisplaySetting(TableDisplaySetting displaySetting) {
        this.displaySetting = displaySetting;
    }

    public CreateTableRequestBody withCreatePolicy(CreatePolicyEnum createPolicy) {
        this.createPolicy = createPolicy;
        return this;
    }

    /**
     * **参数解释**: 创建政策 - SYS_INIT_INDEX_APP_TBL 系统初始化索引应用表 - DEFAULT 默认  **约束限制** 不涉及 **取值范围**: - SYS_INIT_INDEX_APP_TBL - DEFAULT  **默认值** 不涉及
     * @return createPolicy
     */
    public CreatePolicyEnum getCreatePolicy() {
        return createPolicy;
    }

    public void setCreatePolicy(CreatePolicyEnum createPolicy) {
        this.createPolicy = createPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTableRequestBody that = (CreateTableRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.tableAlias, that.tableAlias)
            && Objects.equals(this.tableAliasEn, that.tableAliasEn)
            && Objects.equals(this.tableAliasFr, that.tableAliasFr) && Objects.equals(this.category, that.category)
            && Objects.equals(this.format, that.format) && Objects.equals(this.description, that.description)
            && Objects.equals(this.descriptionEn, that.descriptionEn)
            && Objects.equals(this.descriptionFr, that.descriptionFr) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.directoryEn, that.directoryEn) && Objects.equals(this.directoryFr, that.directoryFr)
            && Objects.equals(this.dataClassification, that.dataClassification)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.storageSetting, that.storageSetting)
            && Objects.equals(this.displaySetting, that.displaySetting)
            && Objects.equals(this.createPolicy, that.createPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            tableAlias,
            tableAliasEn,
            tableAliasFr,
            category,
            format,
            description,
            descriptionEn,
            descriptionFr,
            directory,
            directoryEn,
            directoryFr,
            dataClassification,
            schema,
            storageSetting,
            displaySetting,
            createPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableAlias: ").append(toIndentedString(tableAlias)).append("\n");
        sb.append("    tableAliasEn: ").append(toIndentedString(tableAliasEn)).append("\n");
        sb.append("    tableAliasFr: ").append(toIndentedString(tableAliasFr)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionEn: ").append(toIndentedString(descriptionEn)).append("\n");
        sb.append("    descriptionFr: ").append(toIndentedString(descriptionFr)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    directoryEn: ").append(toIndentedString(directoryEn)).append("\n");
        sb.append("    directoryFr: ").append(toIndentedString(directoryFr)).append("\n");
        sb.append("    dataClassification: ").append(toIndentedString(dataClassification)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    storageSetting: ").append(toIndentedString(storageSetting)).append("\n");
        sb.append("    displaySetting: ").append(toIndentedString(displaySetting)).append("\n");
        sb.append("    createPolicy: ").append(toIndentedString(createPolicy)).append("\n");
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
