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
public class ContentCompareResultOverview  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_db_name")
    
    private String sourceDbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_db_name")
    
    private String targetDbName;
    /**
     * 对比结果。
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

    public ContentCompareResultOverview withSourceDbName(String sourceDbName) {
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

    public ContentCompareResultOverview withTargetDbName(String targetDbName) {
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

    public ContentCompareResultOverview withContentCompareResult(ContentCompareResultEnum contentCompareResult) {
        this.contentCompareResult = contentCompareResult;
        return this;
    }

    


    /**
     * 对比结果。
     * @return contentCompareResult
     */
    public ContentCompareResultEnum getContentCompareResult() {
        return contentCompareResult;
    }

    public void setContentCompareResult(ContentCompareResultEnum contentCompareResult) {
        this.contentCompareResult = contentCompareResult;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentCompareResultOverview contentCompareResultOverview = (ContentCompareResultOverview) o;
        return Objects.equals(this.sourceDbName, contentCompareResultOverview.sourceDbName) &&
            Objects.equals(this.targetDbName, contentCompareResultOverview.targetDbName) &&
            Objects.equals(this.contentCompareResult, contentCompareResultOverview.contentCompareResult);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sourceDbName, targetDbName, contentCompareResult);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentCompareResultOverview {\n");
        sb.append("    sourceDbName: ").append(toIndentedString(sourceDbName)).append("\n");
        sb.append("    targetDbName: ").append(toIndentedString(targetDbName)).append("\n");
        sb.append("    contentCompareResult: ").append(toIndentedString(contentCompareResult)).append("\n");
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

