package com.huaweicloud.sdk.drs.v3.model;




import java.util.Collections;

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
 * 
 */
public class ObjectCompareResultOverview  {

    /**
     * 对象类型。
     */
    public static final class ObjectTypeEnum {

        
        /**
         * Enum DB_ for value: "DB-数据库"
         */
        public static final ObjectTypeEnum DB_ = new ObjectTypeEnum("DB-数据库");
        
        /**
         * Enum TABLE_ for value: "TABLE-表"
         */
        public static final ObjectTypeEnum TABLE_ = new ObjectTypeEnum("TABLE-表");
        
        /**
         * Enum VIEW_ for value: "VIEW-视图"
         */
        public static final ObjectTypeEnum VIEW_ = new ObjectTypeEnum("VIEW-视图");
        
        /**
         * Enum EVENT_ for value: "EVENT-事件"
         */
        public static final ObjectTypeEnum EVENT_ = new ObjectTypeEnum("EVENT-事件");
        
        /**
         * Enum ROUTINE_ for value: "ROUTINE-存储过程和函数"
         */
        public static final ObjectTypeEnum ROUTINE_ = new ObjectTypeEnum("ROUTINE-存储过程和函数");
        
        /**
         * Enum INDEX_ for value: "INDEX-索引"
         */
        public static final ObjectTypeEnum INDEX_ = new ObjectTypeEnum("INDEX-索引");
        
        /**
         * Enum TRIGGER_ for value: "TRIGGER-触发器"
         */
        public static final ObjectTypeEnum TRIGGER_ = new ObjectTypeEnum("TRIGGER-触发器");
        
        /**
         * Enum SYNONYM_ for value: "SYNONYM-同义词"
         */
        public static final ObjectTypeEnum SYNONYM_ = new ObjectTypeEnum("SYNONYM-同义词");
        
        /**
         * Enum FUNCTION_ for value: "FUNCTION-函数"
         */
        public static final ObjectTypeEnum FUNCTION_ = new ObjectTypeEnum("FUNCTION-函数");
        
        /**
         * Enum PROCEDURE_ for value: "PROCEDURE-存储过程"
         */
        public static final ObjectTypeEnum PROCEDURE_ = new ObjectTypeEnum("PROCEDURE-存储过程");
        
        /**
         * Enum TYPE_ for value: "TYPE-自定义类型"
         */
        public static final ObjectTypeEnum TYPE_ = new ObjectTypeEnum("TYPE-自定义类型");
        
        /**
         * Enum RULE_ for value: "RULE-规则"
         */
        public static final ObjectTypeEnum RULE_ = new ObjectTypeEnum("RULE-规则");
        
        /**
         * Enum DEFAULT_TYPE_ for value: "DEFAULT_TYPE-缺省值"
         */
        public static final ObjectTypeEnum DEFAULT_TYPE_ = new ObjectTypeEnum("DEFAULT_TYPE-缺省值");
        
        /**
         * Enum PLAN_GUIDE_ for value: "PLAN_GUIDE-执行计划"
         */
        public static final ObjectTypeEnum PLAN_GUIDE_ = new ObjectTypeEnum("PLAN_GUIDE-执行计划");
        
        /**
         * Enum CONSTRAINT_ for value: "CONSTRAINT-约束"
         */
        public static final ObjectTypeEnum CONSTRAINT_ = new ObjectTypeEnum("CONSTRAINT-约束");
        
        /**
         * Enum FILE_GROUP_ for value: "FILE_GROUP-文件组"
         */
        public static final ObjectTypeEnum FILE_GROUP_ = new ObjectTypeEnum("FILE_GROUP-文件组");
        
        /**
         * Enum PARTITION_FUNCTION_ for value: "PARTITION_FUNCTION-分区函数"
         */
        public static final ObjectTypeEnum PARTITION_FUNCTION_ = new ObjectTypeEnum("PARTITION_FUNCTION-分区函数");
        
        /**
         * Enum PARTITION_SCHEME_ for value: "PARTITION_SCHEME-分区方案"
         */
        public static final ObjectTypeEnum PARTITION_SCHEME_ = new ObjectTypeEnum("PARTITION_SCHEME-分区方案");
        
        /**
         * Enum TABLE_COLLATION_ for value: "TABLE_COLLATION-表的排序规则"
         */
        public static final ObjectTypeEnum TABLE_COLLATION_ = new ObjectTypeEnum("TABLE_COLLATION-表的排序规则");
        

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("DB-数据库", DB_);
            map.put("TABLE-表", TABLE_);
            map.put("VIEW-视图", VIEW_);
            map.put("EVENT-事件", EVENT_);
            map.put("ROUTINE-存储过程和函数", ROUTINE_);
            map.put("INDEX-索引", INDEX_);
            map.put("TRIGGER-触发器", TRIGGER_);
            map.put("SYNONYM-同义词", SYNONYM_);
            map.put("FUNCTION-函数", FUNCTION_);
            map.put("PROCEDURE-存储过程", PROCEDURE_);
            map.put("TYPE-自定义类型", TYPE_);
            map.put("RULE-规则", RULE_);
            map.put("DEFAULT_TYPE-缺省值", DEFAULT_TYPE_);
            map.put("PLAN_GUIDE-执行计划", PLAN_GUIDE_);
            map.put("CONSTRAINT-约束", CONSTRAINT_);
            map.put("FILE_GROUP-文件组", FILE_GROUP_);
            map.put("PARTITION_FUNCTION-分区函数", PARTITION_FUNCTION_);
            map.put("PARTITION_SCHEME-分区方案", PARTITION_SCHEME_);
            map.put("TABLE_COLLATION-表的排序规则", TABLE_COLLATION_);
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
    @JsonProperty(value="object_type")
    
    private ObjectTypeEnum objectType;
    /**
     * 对比结果。
     */
    public static final class ObjectCompareResultEnum {

        
        /**
         * Enum CONSISTENT_ for value: "CONSISTENT-一致"
         */
        public static final ObjectCompareResultEnum CONSISTENT_ = new ObjectCompareResultEnum("CONSISTENT-一致");
        
        /**
         * Enum INCONSISTENT_ for value: "INCONSISTENT-不一致"
         */
        public static final ObjectCompareResultEnum INCONSISTENT_ = new ObjectCompareResultEnum("INCONSISTENT-不一致");
        
        /**
         * Enum COMPARING_ for value: "COMPARING-正在对比"
         */
        public static final ObjectCompareResultEnum COMPARING_ = new ObjectCompareResultEnum("COMPARING-正在对比");
        
        /**
         * Enum WAITING_FOR_COMPARISON_ for value: "WAITING_FOR_COMPARISON-等待对比"
         */
        public static final ObjectCompareResultEnum WAITING_FOR_COMPARISON_ = new ObjectCompareResultEnum("WAITING_FOR_COMPARISON-等待对比");
        
        /**
         * Enum FAILED_TO_COMPARE_ for value: "FAILED_TO_COMPARE-对比失败"
         */
        public static final ObjectCompareResultEnum FAILED_TO_COMPARE_ = new ObjectCompareResultEnum("FAILED_TO_COMPARE-对比失败");
        
        /**
         * Enum TARGET_DB_NOT_EXIT_ for value: "TARGET_DB_NOT_EXIT-目标库不存在"
         */
        public static final ObjectCompareResultEnum TARGET_DB_NOT_EXIT_ = new ObjectCompareResultEnum("TARGET_DB_NOT_EXIT-目标库不存在");
        
        /**
         * Enum CAN_NOT_COMPARE_ for value: "CAN_NOT_COMPARE-无法对比"
         */
        public static final ObjectCompareResultEnum CAN_NOT_COMPARE_ = new ObjectCompareResultEnum("CAN_NOT_COMPARE-无法对比");
        

        private static final Map<String, ObjectCompareResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectCompareResultEnum> createStaticFields() {
            Map<String, ObjectCompareResultEnum> map = new HashMap<>();
            map.put("CONSISTENT-一致", CONSISTENT_);
            map.put("INCONSISTENT-不一致", INCONSISTENT_);
            map.put("COMPARING-正在对比", COMPARING_);
            map.put("WAITING_FOR_COMPARISON-等待对比", WAITING_FOR_COMPARISON_);
            map.put("FAILED_TO_COMPARE-对比失败", FAILED_TO_COMPARE_);
            map.put("TARGET_DB_NOT_EXIT-目标库不存在", TARGET_DB_NOT_EXIT_);
            map.put("CAN_NOT_COMPARE-无法对比", CAN_NOT_COMPARE_);
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
            if( value == null ){
                return null;
            }
            ObjectCompareResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ObjectCompareResultEnum(value);
            }
            return result;
        }

        public static ObjectCompareResultEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ObjectCompareResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="object_compare_result")
    
    private ObjectCompareResultEnum objectCompareResult;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_count")
    
    private Integer targetCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_count")
    
    private Integer sourceCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="diff_count")
    
    private Integer diffCount;

    public ObjectCompareResultOverview withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    


    /**
     * 对象类型。
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
     * 对比结果。
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObjectCompareResultOverview objectCompareResultOverview = (ObjectCompareResultOverview) o;
        return Objects.equals(this.objectType, objectCompareResultOverview.objectType) &&
            Objects.equals(this.objectCompareResult, objectCompareResultOverview.objectCompareResult) &&
            Objects.equals(this.targetCount, objectCompareResultOverview.targetCount) &&
            Objects.equals(this.sourceCount, objectCompareResultOverview.sourceCount) &&
            Objects.equals(this.diffCount, objectCompareResultOverview.diffCount);
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

