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
 * 
 */
public class LineCompareResultOverview  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_db_name")
    
    private String sourceDbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_db_name")
    
    private String targetDbName;
    /**
     * 对比结果。
     */
    public static final class LineCompareResultEnum {

        
        /**
         * Enum CONSISTENT_ for value: "CONSISTENT-一致"
         */
        public static final LineCompareResultEnum CONSISTENT_ = new LineCompareResultEnum("CONSISTENT-一致");
        
        /**
         * Enum INCONSISTENT_ for value: "INCONSISTENT-不一致"
         */
        public static final LineCompareResultEnum INCONSISTENT_ = new LineCompareResultEnum("INCONSISTENT-不一致");
        
        /**
         * Enum COMPARING_ for value: "COMPARING-正在对比"
         */
        public static final LineCompareResultEnum COMPARING_ = new LineCompareResultEnum("COMPARING-正在对比");
        
        /**
         * Enum WAITING_FOR_COMPARISON_ for value: "WAITING_FOR_COMPARISON-等待对比"
         */
        public static final LineCompareResultEnum WAITING_FOR_COMPARISON_ = new LineCompareResultEnum("WAITING_FOR_COMPARISON-等待对比");
        
        /**
         * Enum FAILED_TO_COMPARE_ for value: "FAILED_TO_COMPARE-对比失败"
         */
        public static final LineCompareResultEnum FAILED_TO_COMPARE_ = new LineCompareResultEnum("FAILED_TO_COMPARE-对比失败");
        
        /**
         * Enum TARGET_DB_NOT_EXIT_ for value: "TARGET_DB_NOT_EXIT-目标库不存在"
         */
        public static final LineCompareResultEnum TARGET_DB_NOT_EXIT_ = new LineCompareResultEnum("TARGET_DB_NOT_EXIT-目标库不存在");
        
        /**
         * Enum CAN_NOT_COMPARE_ for value: "CAN_NOT_COMPARE-无法对比"
         */
        public static final LineCompareResultEnum CAN_NOT_COMPARE_ = new LineCompareResultEnum("CAN_NOT_COMPARE-无法对比");
        

        private static final Map<String, LineCompareResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LineCompareResultEnum> createStaticFields() {
            Map<String, LineCompareResultEnum> map = new HashMap<>();
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

        LineCompareResultEnum(String value) {
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
        public static LineCompareResultEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            LineCompareResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LineCompareResultEnum(value);
            }
            return result;
        }

        public static LineCompareResultEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LineCompareResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof LineCompareResultEnum) {
                return this.value.equals(((LineCompareResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="line_compare_result")
    
    private LineCompareResultEnum lineCompareResult;

    public LineCompareResultOverview withSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
        return this;
    }

    


    /**
     * 源库名称。
     * @return sourceDbName
     */
    public String getSourceDbName() {
        return sourceDbName;
    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }

    public LineCompareResultOverview withTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
        return this;
    }

    


    /**
     * 目标库名称。
     * @return targetDbName
     */
    public String getTargetDbName() {
        return targetDbName;
    }

    public void setTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
    }

    public LineCompareResultOverview withLineCompareResult(LineCompareResultEnum lineCompareResult) {
        this.lineCompareResult = lineCompareResult;
        return this;
    }

    


    /**
     * 对比结果。
     * @return lineCompareResult
     */
    public LineCompareResultEnum getLineCompareResult() {
        return lineCompareResult;
    }

    public void setLineCompareResult(LineCompareResultEnum lineCompareResult) {
        this.lineCompareResult = lineCompareResult;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LineCompareResultOverview lineCompareResultOverview = (LineCompareResultOverview) o;
        return Objects.equals(this.sourceDbName, lineCompareResultOverview.sourceDbName) &&
            Objects.equals(this.targetDbName, lineCompareResultOverview.targetDbName) &&
            Objects.equals(this.lineCompareResult, lineCompareResultOverview.lineCompareResult);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sourceDbName, targetDbName, lineCompareResult);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineCompareResultOverview {\n");
        sb.append("    sourceDbName: ").append(toIndentedString(sourceDbName)).append("\n");
        sb.append("    targetDbName: ").append(toIndentedString(targetDbName)).append("\n");
        sb.append("    lineCompareResult: ").append(toIndentedString(lineCompareResult)).append("\n");
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

