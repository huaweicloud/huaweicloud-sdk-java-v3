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
public class LineCompareDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_table_name")
    
    private String sourceTableName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_table_name")
    
    private String targetTableName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_row_num")
    
    private Integer sourceRowNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_row_num")
    
    private Integer targetRowNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="diff_row_num")
    
    private Integer diffRowNum;
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;

    public LineCompareDetail withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    


    /**
     * 源库的表名称。
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    public LineCompareDetail withTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }

    


    /**
     * 目标库的表名称。
     * @return targetTableName
     */
    public String getTargetTableName() {
        return targetTableName;
    }

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    public LineCompareDetail withSourceRowNum(Integer sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
        return this;
    }

    


    /**
     * 源库的表行数。
     * @return sourceRowNum
     */
    public Integer getSourceRowNum() {
        return sourceRowNum;
    }

    public void setSourceRowNum(Integer sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
    }

    public LineCompareDetail withTargetRowNum(Integer targetRowNum) {
        this.targetRowNum = targetRowNum;
        return this;
    }

    


    /**
     * 目标库的表行数。
     * @return targetRowNum
     */
    public Integer getTargetRowNum() {
        return targetRowNum;
    }

    public void setTargetRowNum(Integer targetRowNum) {
        this.targetRowNum = targetRowNum;
    }

    public LineCompareDetail withDiffRowNum(Integer diffRowNum) {
        this.diffRowNum = diffRowNum;
        return this;
    }

    


    /**
     * 源库的表和目标库的表的差异值。
     * @return diffRowNum
     */
    public Integer getDiffRowNum() {
        return diffRowNum;
    }

    public void setDiffRowNum(Integer diffRowNum) {
        this.diffRowNum = diffRowNum;
    }

    public LineCompareDetail withLineCompareResult(LineCompareResultEnum lineCompareResult) {
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

    public LineCompareDetail withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * 附加信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LineCompareDetail lineCompareDetail = (LineCompareDetail) o;
        return Objects.equals(this.sourceTableName, lineCompareDetail.sourceTableName) &&
            Objects.equals(this.targetTableName, lineCompareDetail.targetTableName) &&
            Objects.equals(this.sourceRowNum, lineCompareDetail.sourceRowNum) &&
            Objects.equals(this.targetRowNum, lineCompareDetail.targetRowNum) &&
            Objects.equals(this.diffRowNum, lineCompareDetail.diffRowNum) &&
            Objects.equals(this.lineCompareResult, lineCompareDetail.lineCompareResult) &&
            Objects.equals(this.message, lineCompareDetail.message);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sourceTableName, targetTableName, sourceRowNum, targetRowNum, diffRowNum, lineCompareResult, message);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineCompareDetail {\n");
        sb.append("    sourceTableName: ").append(toIndentedString(sourceTableName)).append("\n");
        sb.append("    targetTableName: ").append(toIndentedString(targetTableName)).append("\n");
        sb.append("    sourceRowNum: ").append(toIndentedString(sourceRowNum)).append("\n");
        sb.append("    targetRowNum: ").append(toIndentedString(targetRowNum)).append("\n");
        sb.append("    diffRowNum: ").append(toIndentedString(diffRowNum)).append("\n");
        sb.append("    lineCompareResult: ").append(toIndentedString(lineCompareResult)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

