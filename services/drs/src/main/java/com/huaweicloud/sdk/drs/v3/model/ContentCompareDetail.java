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
 * 内容对比结果详情。
 */
public class ContentCompareDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_db_name")
    
    private String sourceDbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_db_name")
    
    private String targetDbName;


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
     * 行对比结果。
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
    /**
     * 内容对比结果。
     */
    public static final class ContentCompareResultEnum {

        
        /**
         * Enum CONSISTENT_ for value: "CONSISTENT-一致"
         */
        public static final ContentCompareResultEnum CONSISTENT_ = new ContentCompareResultEnum("CONSISTENT-一致");
        
        /**
         * Enum INCONSISTENT_ for value: "INCONSISTENT-不一致"
         */
        public static final ContentCompareResultEnum INCONSISTENT_ = new ContentCompareResultEnum("INCONSISTENT-不一致");
        
        /**
         * Enum COMPARING_ for value: "COMPARING-正在对比"
         */
        public static final ContentCompareResultEnum COMPARING_ = new ContentCompareResultEnum("COMPARING-正在对比");
        
        /**
         * Enum WAITING_FOR_COMPARISON_ for value: "WAITING_FOR_COMPARISON-等待对比"
         */
        public static final ContentCompareResultEnum WAITING_FOR_COMPARISON_ = new ContentCompareResultEnum("WAITING_FOR_COMPARISON-等待对比");
        
        /**
         * Enum FAILED_TO_COMPARE_ for value: "FAILED_TO_COMPARE-对比失败"
         */
        public static final ContentCompareResultEnum FAILED_TO_COMPARE_ = new ContentCompareResultEnum("FAILED_TO_COMPARE-对比失败");
        
        /**
         * Enum TARGET_DB_NOT_EXIT_ for value: "TARGET_DB_NOT_EXIT-目标库不存在"
         */
        public static final ContentCompareResultEnum TARGET_DB_NOT_EXIT_ = new ContentCompareResultEnum("TARGET_DB_NOT_EXIT-目标库不存在");
        
        /**
         * Enum CAN_NOT_COMPARE_ for value: "CAN_NOT_COMPARE-无法对比"
         */
        public static final ContentCompareResultEnum CAN_NOT_COMPARE_ = new ContentCompareResultEnum("CAN_NOT_COMPARE-无法对比");
        

        private static final Map<String, ContentCompareResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ContentCompareResultEnum> createStaticFields() {
            Map<String, ContentCompareResultEnum> map = new HashMap<>();
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

        ContentCompareResultEnum(String value) {
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
        public static ContentCompareResultEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ContentCompareResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ContentCompareResultEnum(value);
            }
            return result;
        }

        public static ContentCompareResultEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ContentCompareResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ContentCompareResultEnum) {
                return this.value.equals(((ContentCompareResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_compare_result")
    
    private ContentCompareResultEnum contentCompareResult;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;

    public ContentCompareDetail withSourceDbName(String sourceDbName) {
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

    

    public ContentCompareDetail withTargetDbName(String targetDbName) {
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

    

    public ContentCompareDetail withSourceTableName(String sourceTableName) {
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

    

    public ContentCompareDetail withTargetTableName(String targetTableName) {
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

    

    public ContentCompareDetail withSourceRowNum(Integer sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
        return this;
    }

    


    /**
     * 源库的表的行数。
     * @return sourceRowNum
     */
    public Integer getSourceRowNum() {
        return sourceRowNum;
    }

    public void setSourceRowNum(Integer sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
    }

    

    public ContentCompareDetail withTargetRowNum(Integer targetRowNum) {
        this.targetRowNum = targetRowNum;
        return this;
    }

    


    /**
     * 目标库的表的行数。
     * @return targetRowNum
     */
    public Integer getTargetRowNum() {
        return targetRowNum;
    }

    public void setTargetRowNum(Integer targetRowNum) {
        this.targetRowNum = targetRowNum;
    }

    

    public ContentCompareDetail withDiffRowNum(Integer diffRowNum) {
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

    

    public ContentCompareDetail withLineCompareResult(LineCompareResultEnum lineCompareResult) {
        this.lineCompareResult = lineCompareResult;
        return this;
    }

    


    /**
     * 行对比结果。
     * @return lineCompareResult
     */
    public LineCompareResultEnum getLineCompareResult() {
        return lineCompareResult;
    }

    public void setLineCompareResult(LineCompareResultEnum lineCompareResult) {
        this.lineCompareResult = lineCompareResult;
    }

    

    public ContentCompareDetail withContentCompareResult(ContentCompareResultEnum contentCompareResult) {
        this.contentCompareResult = contentCompareResult;
        return this;
    }

    


    /**
     * 内容对比结果。
     * @return contentCompareResult
     */
    public ContentCompareResultEnum getContentCompareResult() {
        return contentCompareResult;
    }

    public void setContentCompareResult(ContentCompareResultEnum contentCompareResult) {
        this.contentCompareResult = contentCompareResult;
    }

    

    public ContentCompareDetail withMessage(String message) {
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
        ContentCompareDetail contentCompareDetail = (ContentCompareDetail) o;
        return Objects.equals(this.sourceDbName, contentCompareDetail.sourceDbName) &&
            Objects.equals(this.targetDbName, contentCompareDetail.targetDbName) &&
            Objects.equals(this.sourceTableName, contentCompareDetail.sourceTableName) &&
            Objects.equals(this.targetTableName, contentCompareDetail.targetTableName) &&
            Objects.equals(this.sourceRowNum, contentCompareDetail.sourceRowNum) &&
            Objects.equals(this.targetRowNum, contentCompareDetail.targetRowNum) &&
            Objects.equals(this.diffRowNum, contentCompareDetail.diffRowNum) &&
            Objects.equals(this.lineCompareResult, contentCompareDetail.lineCompareResult) &&
            Objects.equals(this.contentCompareResult, contentCompareDetail.contentCompareResult) &&
            Objects.equals(this.message, contentCompareDetail.message);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sourceDbName, targetDbName, sourceTableName, targetTableName, sourceRowNum, targetRowNum, diffRowNum, lineCompareResult, contentCompareResult, message);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentCompareDetail {\n");
        sb.append("    sourceDbName: ").append(toIndentedString(sourceDbName)).append("\n");
        sb.append("    targetDbName: ").append(toIndentedString(targetDbName)).append("\n");
        sb.append("    sourceTableName: ").append(toIndentedString(sourceTableName)).append("\n");
        sb.append("    targetTableName: ").append(toIndentedString(targetTableName)).append("\n");
        sb.append("    sourceRowNum: ").append(toIndentedString(sourceRowNum)).append("\n");
        sb.append("    targetRowNum: ").append(toIndentedString(targetRowNum)).append("\n");
        sb.append("    diffRowNum: ").append(toIndentedString(diffRowNum)).append("\n");
        sb.append("    lineCompareResult: ").append(toIndentedString(lineCompareResult)).append("\n");
        sb.append("    contentCompareResult: ").append(toIndentedString(contentCompareResult)).append("\n");
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

