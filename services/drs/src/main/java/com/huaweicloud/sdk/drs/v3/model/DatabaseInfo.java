package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据库对象选择信息
 */
public class DatabaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    /**
     * **参数解释**：  数据库对象的类型，用于标识迁移或同步对象是数据库、表、模式还是视图。  **约束限制**：  不涉及。  **取值范围**：  - database：数据库 - table：表 - schema：模式 - view：视图  **默认取值**：  不涉及
     */
    public static final class ObjectTypeEnum {

        /**
         * Enum DATABASE for value: "database"
         */
        public static final ObjectTypeEnum DATABASE = new ObjectTypeEnum("database");

        /**
         * Enum TABLE for value: "table"
         */
        public static final ObjectTypeEnum TABLE = new ObjectTypeEnum("table");

        /**
         * Enum SCHEMA for value: "schema"
         */
        public static final ObjectTypeEnum SCHEMA = new ObjectTypeEnum("schema");

        /**
         * Enum VIEW for value: "view"
         */
        public static final ObjectTypeEnum VIEW = new ObjectTypeEnum("view");

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("database", DATABASE);
            map.put("table", TABLE);
            map.put("schema", SCHEMA);
            map.put("view", VIEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectTypeEnum(String value) {
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
        public static ObjectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ObjectTypeEnum(value));
        }

        public static ObjectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObjectTypeEnum) {
                return this.value.equals(((ObjectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private ObjectTypeEnum objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_alias_name")

    private String objectAliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select")

    private String select;

    public DatabaseInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  数据库对象的标识，具体含义取决于object_type的取值。object_type为database时，为库名；object_type为table或view时，字段值参考请求示例。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DatabaseInfo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释**：  数据库对象的父级标识，object_type为table或view时需要填写，为库名。  **约束限制**：  - object_type为table或view时必填。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public DatabaseInfo withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * **参数解释**：  数据库对象的类型，用于标识迁移或同步对象是数据库、表、模式还是视图。  **约束限制**：  不涉及。  **取值范围**：  - database：数据库 - table：表 - schema：模式 - view：视图  **默认取值**：  不涉及
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }

    public DatabaseInfo withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * **参数解释**：  数据库对象名称，可以是库名、表名或视图名。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public DatabaseInfo withObjectAliasName(String objectAliasName) {
        this.objectAliasName = objectAliasName;
        return this;
    }

    /**
     * **参数解释**：  数据库对象的别名，即映射后的新名称。  **约束限制**：  - 仅支持同步任务使用。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return objectAliasName
     */
    public String getObjectAliasName() {
        return objectAliasName;
    }

    public void setObjectAliasName(String objectAliasName) {
        this.objectAliasName = objectAliasName;
    }

    public DatabaseInfo withSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * **参数解释**：  是否选中该数据库对象进行迁移，用于控制对象级别的迁移选择。  **约束限制**：  不涉及。  **取值范围**：  - true：选中，该数据库对象会进行迁移 - false：不选中，该数据库对象不会迁移 - partial：部分选择，迁移库下面的部分表  **默认取值**：  false
     * @return select
     */
    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseInfo that = (DatabaseInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.objectType, that.objectType) && Objects.equals(this.objectName, that.objectName)
            && Objects.equals(this.objectAliasName, that.objectAliasName) && Objects.equals(this.select, that.select);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, objectType, objectName, objectAliasName, select);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    objectAliasName: ").append(toIndentedString(objectAliasName)).append("\n");
        sb.append("    select: ").append(toIndentedString(select)).append("\n");
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
