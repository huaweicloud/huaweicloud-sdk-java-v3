package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * WorkspaceVO
 */
public class WorkspaceVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_physical")

    private Boolean isPhysical;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequent")

    private Boolean frequent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Boolean top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private ModelLevel level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    /**
     * 工作区类型枚举。 枚举值：   - THIRD_NF: 关系建模   - DIMENSION: 维度建模 
     */
    public static final class TypeEnum {

        /**
         * Enum THIRD_NF for value: "THIRD_NF"
         */
        public static final TypeEnum THIRD_NF = new TypeEnum("THIRD_NF");

        /**
         * Enum DIMENSION for value: "DIMENSION"
         */
        public static final TypeEnum DIMENSION = new TypeEnum("DIMENSION");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("THIRD_NF", THIRD_NF);
            map.put("DIMENSION", DIMENSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_catalog_ids")

    private String bizCatalogIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<String> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_model_prefix")

    private String tableModelPrefix;

    public WorkspaceVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编号，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WorkspaceVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作区名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkspaceVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkspaceVO withIsPhysical(Boolean isPhysical) {
        this.isPhysical = isPhysical;
        return this;
    }

    /**
     * 是否为物理表。
     * @return isPhysical
     */
    public Boolean getIsPhysical() {
        return isPhysical;
    }

    public void setIsPhysical(Boolean isPhysical) {
        this.isPhysical = isPhysical;
    }

    public WorkspaceVO withFrequent(Boolean frequent) {
        this.frequent = frequent;
        return this;
    }

    /**
     * 是否为常用。
     * @return frequent
     */
    public Boolean getFrequent() {
        return frequent;
    }

    public void setFrequent(Boolean frequent) {
        this.frequent = frequent;
    }

    public WorkspaceVO withTop(Boolean top) {
        this.top = top;
        return this;
    }

    /**
     * 分层治理。
     * @return top
     */
    public Boolean getTop() {
        return top;
    }

    public void setTop(Boolean top) {
        this.top = top;
    }

    public WorkspaceVO withLevel(ModelLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get level
     * @return level
     */
    public ModelLevel getLevel() {
        return level;
    }

    public void setLevel(ModelLevel level) {
        this.level = level;
    }

    public WorkspaceVO withDwType(String dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型，对应表所在的数仓类型，取值可以为DLI、DWS、MRS_HIVE、POSTGRESQL、MRS_SPARK、CLICKHOUSE、MYSQL、ORACLE和DORIS等。
     * @return dwType
     */
    public String getDwType() {
        return dwType;
    }

    public void setDwType(String dwType) {
        this.dwType = dwType;
    }

    public WorkspaceVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public WorkspaceVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public WorkspaceVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public WorkspaceVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public WorkspaceVO withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 工作区类型枚举。 枚举值：   - THIRD_NF: 关系建模   - DIMENSION: 维度建模 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public WorkspaceVO withBizCatalogIds(String bizCatalogIds) {
        this.bizCatalogIds = bizCatalogIds;
        return this;
    }

    /**
     * 关联的业务分层的ID列表 {\"l1Ids\":[],\"l2Ids\":[],\"l3Ids\":[]}。
     * @return bizCatalogIds
     */
    public String getBizCatalogIds() {
        return bizCatalogIds;
    }

    public void setBizCatalogIds(String bizCatalogIds) {
        this.bizCatalogIds = bizCatalogIds;
    }

    public WorkspaceVO withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    public WorkspaceVO addDatabasesItem(String databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public WorkspaceVO withDatabases(Consumer<List<String>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库名称数组。
     * @return databases
     */
    public List<String> getDatabases() {
        return databases;
    }

    public void setDatabases(List<String> databases) {
        this.databases = databases;
    }

    public WorkspaceVO withTableModelPrefix(String tableModelPrefix) {
        this.tableModelPrefix = tableModelPrefix;
        return this;
    }

    /**
     * 模型校验前缀，长度不超过100，数字字母下划线组成，字母开头
     * @return tableModelPrefix
     */
    public String getTableModelPrefix() {
        return tableModelPrefix;
    }

    public void setTableModelPrefix(String tableModelPrefix) {
        this.tableModelPrefix = tableModelPrefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkspaceVO that = (WorkspaceVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.isPhysical, that.isPhysical)
            && Objects.equals(this.frequent, that.frequent) && Objects.equals(this.top, that.top)
            && Objects.equals(this.level, that.level) && Objects.equals(this.dwType, that.dwType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.type, that.type) && Objects.equals(this.bizCatalogIds, that.bizCatalogIds)
            && Objects.equals(this.databases, that.databases)
            && Objects.equals(this.tableModelPrefix, that.tableModelPrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            isPhysical,
            frequent,
            top,
            level,
            dwType,
            createTime,
            updateTime,
            createBy,
            updateBy,
            type,
            bizCatalogIds,
            databases,
            tableModelPrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkspaceVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isPhysical: ").append(toIndentedString(isPhysical)).append("\n");
        sb.append("    frequent: ").append(toIndentedString(frequent)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    bizCatalogIds: ").append(toIndentedString(bizCatalogIds)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    tableModelPrefix: ").append(toIndentedString(tableModelPrefix)).append("\n");
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
