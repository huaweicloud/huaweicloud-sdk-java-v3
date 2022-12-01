package com.huaweicloud.sdk.drs.v5.model;

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
 * 数据库对象信息体。实时迁移、实时同步需要迁移或同步的库或者表，支持实时同步场景对数据库对象进行加工，即可以为数据库对象添加过滤规则、高级设置、列加工、附加列等。 数据加工相关具体约束参考：https://support.huaweicloud.com/realtimesyn-drs/drs_03_0035.html
 */
public class DbObject {

    /**
     * 数据库对象迁移或同步范围。取值： - all：全部迁移。 - database：库级迁移或同步。 - table：表级迁移或同步。
     */
    public static final class ObjectScopeEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final ObjectScopeEnum ALL = new ObjectScopeEnum("all");

        /**
         * Enum DATABASE for value: "database"
         */
        public static final ObjectScopeEnum DATABASE = new ObjectScopeEnum("database");

        /**
         * Enum TABLE for value: "table"
         */
        public static final ObjectScopeEnum TABLE = new ObjectScopeEnum("table");

        private static final Map<String, ObjectScopeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectScopeEnum> createStaticFields() {
            Map<String, ObjectScopeEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("database", DATABASE);
            map.put("table", TABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectScopeEnum(String value) {
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
        public static ObjectScopeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ObjectScopeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ObjectScopeEnum(value);
            }
            return result;
        }

        public static ObjectScopeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ObjectScopeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObjectScopeEnum) {
                return this.value.equals(((ObjectScopeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_scope")

    private ObjectScopeEnum objectScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_root_db")

    private TargetRootDb targetRootDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_info")

    private Map<String, DatabaseObject> objectInfo = null;

    public DbObject withObjectScope(ObjectScopeEnum objectScope) {
        this.objectScope = objectScope;
        return this;
    }

    /**
     * 数据库对象迁移或同步范围。取值： - all：全部迁移。 - database：库级迁移或同步。 - table：表级迁移或同步。
     * @return objectScope
     */
    public ObjectScopeEnum getObjectScope() {
        return objectScope;
    }

    public void setObjectScope(ObjectScopeEnum objectScope) {
        this.objectScope = objectScope;
    }

    public DbObject withTargetRootDb(TargetRootDb targetRootDb) {
        this.targetRootDb = targetRootDb;
        return this;
    }

    public DbObject withTargetRootDb(Consumer<TargetRootDb> targetRootDbSetter) {
        if (this.targetRootDb == null) {
            this.targetRootDb = new TargetRootDb();
            targetRootDbSetter.accept(this.targetRootDb);
        }

        return this;
    }

    /**
     * Get targetRootDb
     * @return targetRootDb
     */
    public TargetRootDb getTargetRootDb() {
        return targetRootDb;
    }

    public void setTargetRootDb(TargetRootDb targetRootDb) {
        this.targetRootDb = targetRootDb;
    }

    public DbObject withObjectInfo(Map<String, DatabaseObject> objectInfo) {
        this.objectInfo = objectInfo;
        return this;
    }

    public DbObject putObjectInfoItem(String key, DatabaseObject objectInfoItem) {
        if (this.objectInfo == null) {
            this.objectInfo = new HashMap<>();
        }
        this.objectInfo.put(key, objectInfoItem);
        return this;
    }

    public DbObject withObjectInfo(Consumer<Map<String, DatabaseObject>> objectInfoSetter) {
        if (this.objectInfo == null) {
            this.objectInfo = new HashMap<>();
        }
        objectInfoSetter.accept(this.objectInfo);
        return this;
    }

    /**
     * 数据库对象迁移或同步信息，object_scope为all时不填，为库级或表级时必填。
     * @return objectInfo
     */
    public Map<String, DatabaseObject> getObjectInfo() {
        return objectInfo;
    }

    public void setObjectInfo(Map<String, DatabaseObject> objectInfo) {
        this.objectInfo = objectInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DbObject dbObject = (DbObject) o;
        return Objects.equals(this.objectScope, dbObject.objectScope)
            && Objects.equals(this.targetRootDb, dbObject.targetRootDb)
            && Objects.equals(this.objectInfo, dbObject.objectInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectScope, targetRootDb, objectInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbObject {\n");
        sb.append("    objectScope: ").append(toIndentedString(objectScope)).append("\n");
        sb.append("    targetRootDb: ").append(toIndentedString(targetRootDb)).append("\n");
        sb.append("    objectInfo: ").append(toIndentedString(objectInfo)).append("\n");
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
