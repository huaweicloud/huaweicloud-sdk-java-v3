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
 * ObjectCompareResultOverview
 */
public class ObjectCompareResultOverview {

    /**
     * 对象类型。 - DB-数据库 - TABLE-表 - VIEW-视图 - EVENT-事件 - ROUTINE-存储过程和函数 - INDEX-索引,TRIGGER-触发器 - SYNONYM-同义词 - FUNCTION-函数 - PROCEDURE-存储过程 - TYPE-自定义类型 - RULE-规则 - DEFAULT_TYPE-缺省值 - PLAN_GUIDE-执行计划 - CONSTRAINT-约束 - FILE_GROUP-文件组 - PARTITION_FUNCTION-分区函数 - PARTITION_SCHEME-分区方案 - TABLE_COLLATION-表的排序规则
     */
    public static final class ObjectTypeEnum {

        /**
         * Enum DB for value: "DB"
         */
        public static final ObjectTypeEnum DB = new ObjectTypeEnum("DB");

        /**
         * Enum TABLE for value: "TABLE"
         */
        public static final ObjectTypeEnum TABLE = new ObjectTypeEnum("TABLE");

        /**
         * Enum VIEW for value: "VIEW"
         */
        public static final ObjectTypeEnum VIEW = new ObjectTypeEnum("VIEW");

        /**
         * Enum EVENT for value: "EVENT"
         */
        public static final ObjectTypeEnum EVENT = new ObjectTypeEnum("EVENT");

        /**
         * Enum ROUTINE for value: "ROUTINE"
         */
        public static final ObjectTypeEnum ROUTINE = new ObjectTypeEnum("ROUTINE");

        /**
         * Enum INDEX for value: "INDEX"
         */
        public static final ObjectTypeEnum INDEX = new ObjectTypeEnum("INDEX");

        /**
         * Enum TRIGGER for value: "TRIGGER"
         */
        public static final ObjectTypeEnum TRIGGER = new ObjectTypeEnum("TRIGGER");

        /**
         * Enum SYNONYM for value: "SYNONYM"
         */
        public static final ObjectTypeEnum SYNONYM = new ObjectTypeEnum("SYNONYM");

        /**
         * Enum FUNCTION for value: "FUNCTION"
         */
        public static final ObjectTypeEnum FUNCTION = new ObjectTypeEnum("FUNCTION");

        /**
         * Enum PROCEDURE for value: "PROCEDURE"
         */
        public static final ObjectTypeEnum PROCEDURE = new ObjectTypeEnum("PROCEDURE");

        /**
         * Enum TYPE for value: "TYPE"
         */
        public static final ObjectTypeEnum TYPE = new ObjectTypeEnum("TYPE");

        /**
         * Enum RULE for value: "RULE"
         */
        public static final ObjectTypeEnum RULE = new ObjectTypeEnum("RULE");

        /**
         * Enum DEFAULT_TYPE for value: "DEFAULT_TYPE"
         */
        public static final ObjectTypeEnum DEFAULT_TYPE = new ObjectTypeEnum("DEFAULT_TYPE");

        /**
         * Enum PLAN_GUIDE for value: "PLAN_GUIDE"
         */
        public static final ObjectTypeEnum PLAN_GUIDE = new ObjectTypeEnum("PLAN_GUIDE");

        /**
         * Enum CONSTRAINT for value: "CONSTRAINT"
         */
        public static final ObjectTypeEnum CONSTRAINT = new ObjectTypeEnum("CONSTRAINT");

        /**
         * Enum FILE_GROUP for value: "FILE_GROUP"
         */
        public static final ObjectTypeEnum FILE_GROUP = new ObjectTypeEnum("FILE_GROUP");

        /**
         * Enum PARTITION_FUNCTION for value: "PARTITION_FUNCTION"
         */
        public static final ObjectTypeEnum PARTITION_FUNCTION = new ObjectTypeEnum("PARTITION_FUNCTION");

        /**
         * Enum PARTITION_SCHEME for value: "PARTITION_SCHEME"
         */
        public static final ObjectTypeEnum PARTITION_SCHEME = new ObjectTypeEnum("PARTITION_SCHEME");

        /**
         * Enum TABLE_COLLATION for value: "TABLE_COLLATION"
         */
        public static final ObjectTypeEnum TABLE_COLLATION = new ObjectTypeEnum("TABLE_COLLATION");

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
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

    /**
     * 对比结果。 - CONSISTENT-一致 - INCONSISTENT-不一致 - COMPARING-正在对比 - WAITING_FOR_COMPARISON-等待对比 - FAILED_TO_COMPARE-对比失败 - TARGET_DB_NOT_EXIT-目标库不存在 - CAN_NOT_COMPARE-无法对比
     */
    public static final class ObjectCompareResultEnum {

        /**
         * Enum CONSISTENT for value: "CONSISTENT"
         */
        public static final ObjectCompareResultEnum CONSISTENT = new ObjectCompareResultEnum("CONSISTENT");

        /**
         * Enum INCONSISTENT for value: "INCONSISTENT"
         */
        public static final ObjectCompareResultEnum INCONSISTENT = new ObjectCompareResultEnum("INCONSISTENT");

        /**
         * Enum COMPARING for value: "COMPARING"
         */
        public static final ObjectCompareResultEnum COMPARING = new ObjectCompareResultEnum("COMPARING");

        /**
         * Enum WAITING_FOR_COMPARISON for value: "WAITING_FOR_COMPARISON"
         */
        public static final ObjectCompareResultEnum WAITING_FOR_COMPARISON =
            new ObjectCompareResultEnum("WAITING_FOR_COMPARISON");

        /**
         * Enum FAILED_TO_COMPARE for value: "FAILED_TO_COMPARE"
         */
        public static final ObjectCompareResultEnum FAILED_TO_COMPARE =
            new ObjectCompareResultEnum("FAILED_TO_COMPARE");

        /**
         * Enum TARGET_DB_NOT_EXIT for value: "TARGET_DB_NOT_EXIT"
         */
        public static final ObjectCompareResultEnum TARGET_DB_NOT_EXIT =
            new ObjectCompareResultEnum("TARGET_DB_NOT_EXIT");

        /**
         * Enum CAN_NOT_COMPARE for value: "CAN_NOT_COMPARE"
         */
        public static final ObjectCompareResultEnum CAN_NOT_COMPARE = new ObjectCompareResultEnum("CAN_NOT_COMPARE");

        private static final Map<String, ObjectCompareResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectCompareResultEnum> createStaticFields() {
            Map<String, ObjectCompareResultEnum> map = new HashMap<>();
            map.put("CONSISTENT", CONSISTENT);
            map.put("INCONSISTENT", INCONSISTENT);
            map.put("COMPARING", COMPARING);
            map.put("WAITING_FOR_COMPARISON", WAITING_FOR_COMPARISON);
            map.put("FAILED_TO_COMPARE", FAILED_TO_COMPARE);
            map.put("TARGET_DB_NOT_EXIT", TARGET_DB_NOT_EXIT);
            map.put("CAN_NOT_COMPARE", CAN_NOT_COMPARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectCompareResultEnum(String value) {
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
        public static ObjectCompareResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ObjectCompareResultEnum(value));
        }

        public static ObjectCompareResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObjectCompareResultEnum) {
                return this.value.equals(((ObjectCompareResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_compare_result")

    private ObjectCompareResultEnum objectCompareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_count")

    private Integer targetCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_count")

    private Integer sourceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_count")

    private Integer diffCount;

    public ObjectCompareResultOverview withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型。 - DB-数据库 - TABLE-表 - VIEW-视图 - EVENT-事件 - ROUTINE-存储过程和函数 - INDEX-索引,TRIGGER-触发器 - SYNONYM-同义词 - FUNCTION-函数 - PROCEDURE-存储过程 - TYPE-自定义类型 - RULE-规则 - DEFAULT_TYPE-缺省值 - PLAN_GUIDE-执行计划 - CONSTRAINT-约束 - FILE_GROUP-文件组 - PARTITION_FUNCTION-分区函数 - PARTITION_SCHEME-分区方案 - TABLE_COLLATION-表的排序规则
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }

    public ObjectCompareResultOverview withObjectCompareResult(ObjectCompareResultEnum objectCompareResult) {
        this.objectCompareResult = objectCompareResult;
        return this;
    }

    /**
     * 对比结果。 - CONSISTENT-一致 - INCONSISTENT-不一致 - COMPARING-正在对比 - WAITING_FOR_COMPARISON-等待对比 - FAILED_TO_COMPARE-对比失败 - TARGET_DB_NOT_EXIT-目标库不存在 - CAN_NOT_COMPARE-无法对比
     * @return objectCompareResult
     */
    public ObjectCompareResultEnum getObjectCompareResult() {
        return objectCompareResult;
    }

    public void setObjectCompareResult(ObjectCompareResultEnum objectCompareResult) {
        this.objectCompareResult = objectCompareResult;
    }

    public ObjectCompareResultOverview withTargetCount(Integer targetCount) {
        this.targetCount = targetCount;
        return this;
    }

    /**
     * 该类型的对象在目标库的个数。
     * @return targetCount
     */
    public Integer getTargetCount() {
        return targetCount;
    }

    public void setTargetCount(Integer targetCount) {
        this.targetCount = targetCount;
    }

    public ObjectCompareResultOverview withSourceCount(Integer sourceCount) {
        this.sourceCount = sourceCount;
        return this;
    }

    /**
     * 该类型的对象在源库的个数。
     * @return sourceCount
     */
    public Integer getSourceCount() {
        return sourceCount;
    }

    public void setSourceCount(Integer sourceCount) {
        this.sourceCount = sourceCount;
    }

    public ObjectCompareResultOverview withDiffCount(Integer diffCount) {
        this.diffCount = diffCount;
        return this;
    }

    /**
     * 源库和目标库的差异数量。
     * @return diffCount
     */
    public Integer getDiffCount() {
        return diffCount;
    }

    public void setDiffCount(Integer diffCount) {
        this.diffCount = diffCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectCompareResultOverview that = (ObjectCompareResultOverview) obj;
        return Objects.equals(this.objectType, that.objectType)
            && Objects.equals(this.objectCompareResult, that.objectCompareResult)
            && Objects.equals(this.targetCount, that.targetCount) && Objects.equals(this.sourceCount, that.sourceCount)
            && Objects.equals(this.diffCount, that.diffCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectType, objectCompareResult, targetCount, sourceCount, diffCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectCompareResultOverview {\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectCompareResult: ").append(toIndentedString(objectCompareResult)).append("\n");
        sb.append("    targetCount: ").append(toIndentedString(targetCount)).append("\n");
        sb.append("    sourceCount: ").append(toIndentedString(sourceCount)).append("\n");
        sb.append("    diffCount: ").append(toIndentedString(diffCount)).append("\n");
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
