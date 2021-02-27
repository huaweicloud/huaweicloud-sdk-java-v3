package com.huaweicloud.sdk.drs.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库对象选择信息
 */
public class DatabaseInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_id")
    
    private String parentId;
    /**
     * 类型
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ObjectTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ObjectTypeEnum(value);
            }
            return result;
        }

        public static ObjectTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ObjectTypeEnum) {
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
    @JsonProperty(value="object_type")
    
    private ObjectTypeEnum objectType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_name")
    
    private String objectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_alias_name")
    
    private String objectAliasName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="select")
    
    private String select;

    public DatabaseInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * object_type为database时，为库名；object_type为table或者view时，字段值参考示例。
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
     * object_type为table或view时需要填写，为库名
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
     * 类型
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
     * 数据库对象名称，库名、表名、视图名
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
     * 别名，映射的新名称。
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
     * 是否选中，值为true会进行迁移，false该数据库对象不会迁移，partial为迁移库下面的部分表，不填默认为false
     * @return select
     */
    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseInfo databaseInfo = (DatabaseInfo) o;
        return Objects.equals(this.id, databaseInfo.id) &&
            Objects.equals(this.parentId, databaseInfo.parentId) &&
            Objects.equals(this.objectType, databaseInfo.objectType) &&
            Objects.equals(this.objectName, databaseInfo.objectName) &&
            Objects.equals(this.objectAliasName, databaseInfo.objectAliasName) &&
            Objects.equals(this.select, databaseInfo.select);
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

