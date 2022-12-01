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
 * 对象对比结果信息体。
 */
public class ObjectsCompareOverviewInfo {

    /**
     * 对象类型。取值： - DB：数据库。 - TABLE：表。 - VIEW：视图。 - EVENT：事件。 - ROUTINE：存储过程和函数。 - INDEX：索引。 - TRIGGER：触发器。 - SYNONYM：同义词。 - FUNCTION：函数。 - PROCEDURE：存储过程。 - TYPE：自定义类型。 - RULE：规则。 - DEFAULT_TYPE：缺省值。 - PLAN_GUIDE：执行计划。 - CONSTRAINT：约束。 - FILE_GROUP：文件组。 - PARTITION_FUNCTION：分区函数。 - PARTITION_SCHEME：分区方案。 - TABLE_COLLATION：表的排序规则。 - EXTENSIONS：插件。
     */
    public static final class TypeEnum {

        /**
         * Enum DB for value: "DB"
         */
        public static final TypeEnum DB = new TypeEnum("DB");

        /**
         * Enum TABLE for value: "TABLE"
         */
        public static final TypeEnum TABLE = new TypeEnum("TABLE");

        /**
         * Enum VIEW for value: "VIEW"
         */
        public static final TypeEnum VIEW = new TypeEnum("VIEW");

        /**
         * Enum EVENT for value: "EVENT"
         */
        public static final TypeEnum EVENT = new TypeEnum("EVENT");

        /**
         * Enum ROUTINE for value: "ROUTINE"
         */
        public static final TypeEnum ROUTINE = new TypeEnum("ROUTINE");

        /**
         * Enum INDEX for value: "INDEX"
         */
        public static final TypeEnum INDEX = new TypeEnum("INDEX");

        /**
         * Enum TRIGGER for value: "TRIGGER"
         */
        public static final TypeEnum TRIGGER = new TypeEnum("TRIGGER");

        /**
         * Enum SYNONYM for value: "SYNONYM"
         */
        public static final TypeEnum SYNONYM = new TypeEnum("SYNONYM");

        /**
         * Enum FUNCTION for value: "FUNCTION"
         */
        public static final TypeEnum FUNCTION = new TypeEnum("FUNCTION");

        /**
         * Enum PROCEDURE for value: "PROCEDURE"
         */
        public static final TypeEnum PROCEDURE = new TypeEnum("PROCEDURE");

        /**
         * Enum TYPE for value: "TYPE"
         */
        public static final TypeEnum TYPE = new TypeEnum("TYPE");

        /**
         * Enum RULE for value: "RULE"
         */
        public static final TypeEnum RULE = new TypeEnum("RULE");

        /**
         * Enum DEFAULT_TYPE for value: "DEFAULT_TYPE"
         */
        public static final TypeEnum DEFAULT_TYPE = new TypeEnum("DEFAULT_TYPE");

        /**
         * Enum PLAN_GUIDE for value: "PLAN_GUIDE"
         */
        public static final TypeEnum PLAN_GUIDE = new TypeEnum("PLAN_GUIDE");

        /**
         * Enum CONSTRAINT for value: "CONSTRAINT"
         */
        public static final TypeEnum CONSTRAINT = new TypeEnum("CONSTRAINT");

        /**
         * Enum FILE_GROUP for value: "FILE_GROUP"
         */
        public static final TypeEnum FILE_GROUP = new TypeEnum("FILE_GROUP");

        /**
         * Enum PARTITION_FUNCTION for value: "PARTITION_FUNCTION"
         */
        public static final TypeEnum PARTITION_FUNCTION = new TypeEnum("PARTITION_FUNCTION");

        /**
         * Enum PARTITION_SCHEME for value: "PARTITION_SCHEME"
         */
        public static final TypeEnum PARTITION_SCHEME = new TypeEnum("PARTITION_SCHEME");

        /**
         * Enum TABLE_COLLATION for value: "TABLE_COLLATION"
         */
        public static final TypeEnum TABLE_COLLATION = new TypeEnum("TABLE_COLLATION");

        /**
         * Enum EXTENSIONS for value: "EXTENSIONS"
         */
        public static final TypeEnum EXTENSIONS = new TypeEnum("EXTENSIONS");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DB", DB);
            map.put("TABLE", TABLE);
            map.put("VIEW", VIEW);
            map.put("EVENT", EVENT);
            map.put("ROUTINE", ROUTINE);
            map.put("INDEX", INDEX);
            map.put("TRIGGER", TRIGGER);
            map.put("SYNONYM", SYNONYM);
            map.put("FUNCTION", FUNCTION);
            map.put("PROCEDURE", PROCEDURE);
            map.put("TYPE", TYPE);
            map.put("RULE", RULE);
            map.put("DEFAULT_TYPE", DEFAULT_TYPE);
            map.put("PLAN_GUIDE", PLAN_GUIDE);
            map.put("CONSTRAINT", CONSTRAINT);
            map.put("FILE_GROUP", FILE_GROUP);
            map.put("PARTITION_FUNCTION", PARTITION_FUNCTION);
            map.put("PARTITION_SCHEME", PARTITION_SCHEME);
            map.put("TABLE_COLLATION", TABLE_COLLATION);
            map.put("EXTENSIONS", EXTENSIONS);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "source_count")

    private Long sourceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_count")

    private Long targetCount;

    /**
     * 对比结果。取值： CONSISTENT：一致。 INCONSISTENT：不一致。 COMPARING：正在对比。 WAITING_FOR_COMPARISON：等待对比。 FAILED_TO_COMPARE：对比失败。 TARGET_DB_NOT_EXIST：目标库不存在。 CAN_NOT_COMPARE：无法对比。
     */
    public static final class StatusEnum {

        /**
         * Enum CONSISTENT for value: "CONSISTENT"
         */
        public static final StatusEnum CONSISTENT = new StatusEnum("CONSISTENT");

        /**
         * Enum INCONSISTENT for value: "INCONSISTENT"
         */
        public static final StatusEnum INCONSISTENT = new StatusEnum("INCONSISTENT");

        /**
         * Enum COMPARING for value: "COMPARING"
         */
        public static final StatusEnum COMPARING = new StatusEnum("COMPARING");

        /**
         * Enum WAITING_FOR_COMPARISON for value: "WAITING_FOR_COMPARISON"
         */
        public static final StatusEnum WAITING_FOR_COMPARISON = new StatusEnum("WAITING_FOR_COMPARISON");

        /**
         * Enum FAILED_TO_COMPARE for value: "FAILED_TO_COMPARE"
         */
        public static final StatusEnum FAILED_TO_COMPARE = new StatusEnum("FAILED_TO_COMPARE");

        /**
         * Enum TARGET_DB_NOT_EXIST for value: "TARGET_DB_NOT_EXIST"
         */
        public static final StatusEnum TARGET_DB_NOT_EXIST = new StatusEnum("TARGET_DB_NOT_EXIST");

        /**
         * Enum CAN_NOT_COMPARE for value: "CAN_NOT_COMPARE"
         */
        public static final StatusEnum CAN_NOT_COMPARE = new StatusEnum("CAN_NOT_COMPARE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CONSISTENT", CONSISTENT);
            map.put("INCONSISTENT", INCONSISTENT);
            map.put("COMPARING", COMPARING);
            map.put("WAITING_FOR_COMPARISON", WAITING_FOR_COMPARISON);
            map.put("FAILED_TO_COMPARE", FAILED_TO_COMPARE);
            map.put("TARGET_DB_NOT_EXIST", TARGET_DB_NOT_EXIST);
            map.put("CAN_NOT_COMPARE", CAN_NOT_COMPARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    public ObjectsCompareOverviewInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 对象类型。取值： - DB：数据库。 - TABLE：表。 - VIEW：视图。 - EVENT：事件。 - ROUTINE：存储过程和函数。 - INDEX：索引。 - TRIGGER：触发器。 - SYNONYM：同义词。 - FUNCTION：函数。 - PROCEDURE：存储过程。 - TYPE：自定义类型。 - RULE：规则。 - DEFAULT_TYPE：缺省值。 - PLAN_GUIDE：执行计划。 - CONSTRAINT：约束。 - FILE_GROUP：文件组。 - PARTITION_FUNCTION：分区函数。 - PARTITION_SCHEME：分区方案。 - TABLE_COLLATION：表的排序规则。 - EXTENSIONS：插件。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ObjectsCompareOverviewInfo withSourceCount(Long sourceCount) {
        this.sourceCount = sourceCount;
        return this;
    }

    /**
     * 源数量。
     * @return sourceCount
     */
    public Long getSourceCount() {
        return sourceCount;
    }

    public void setSourceCount(Long sourceCount) {
        this.sourceCount = sourceCount;
    }

    public ObjectsCompareOverviewInfo withTargetCount(Long targetCount) {
        this.targetCount = targetCount;
        return this;
    }

    /**
     * 目标数量。
     * @return targetCount
     */
    public Long getTargetCount() {
        return targetCount;
    }

    public void setTargetCount(Long targetCount) {
        this.targetCount = targetCount;
    }

    public ObjectsCompareOverviewInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 对比结果。取值： CONSISTENT：一致。 INCONSISTENT：不一致。 COMPARING：正在对比。 WAITING_FOR_COMPARISON：等待对比。 FAILED_TO_COMPARE：对比失败。 TARGET_DB_NOT_EXIST：目标库不存在。 CAN_NOT_COMPARE：无法对比。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObjectsCompareOverviewInfo objectsCompareOverviewInfo = (ObjectsCompareOverviewInfo) o;
        return Objects.equals(this.type, objectsCompareOverviewInfo.type)
            && Objects.equals(this.sourceCount, objectsCompareOverviewInfo.sourceCount)
            && Objects.equals(this.targetCount, objectsCompareOverviewInfo.targetCount)
            && Objects.equals(this.status, objectsCompareOverviewInfo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sourceCount, targetCount, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectsCompareOverviewInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sourceCount: ").append(toIndentedString(sourceCount)).append("\n");
        sb.append("    targetCount: ").append(toIndentedString(targetCount)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
