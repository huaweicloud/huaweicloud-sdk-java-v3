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
 * ContentCompareResultOverview
 */
public class ContentCompareResultOverview {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_name")

    private String sourceDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_name")

    private String targetDbName;

    /**
     * 对比结果。 - CONSISTENT-一致 - INCONSISTENT-不一致 - COMPARING-正在对比 - WAITING_FOR_COMPARISON-等待对比 - FAILED_TO_COMPARE-对比失败 - TARGET_DB_NOT_EXIT-目标库不存在 - CAN_NOT_COMPARE-无法对比
     */
    public static final class ContentCompareResultEnum {

        /**
         * Enum CONSISTENT for value: "CONSISTENT"
         */
        public static final ContentCompareResultEnum CONSISTENT = new ContentCompareResultEnum("CONSISTENT");

        /**
         * Enum INCONSISTENT for value: "INCONSISTENT"
         */
        public static final ContentCompareResultEnum INCONSISTENT = new ContentCompareResultEnum("INCONSISTENT");

        /**
         * Enum COMPARING for value: "COMPARING"
         */
        public static final ContentCompareResultEnum COMPARING = new ContentCompareResultEnum("COMPARING");

        /**
         * Enum WAITING_FOR_COMPARISON for value: "WAITING_FOR_COMPARISON"
         */
        public static final ContentCompareResultEnum WAITING_FOR_COMPARISON =
            new ContentCompareResultEnum("WAITING_FOR_COMPARISON");

        /**
         * Enum FAILED_TO_COMPARE for value: "FAILED_TO_COMPARE"
         */
        public static final ContentCompareResultEnum FAILED_TO_COMPARE =
            new ContentCompareResultEnum("FAILED_TO_COMPARE");

        /**
         * Enum TARGET_DB_NOT_EXIT for value: "TARGET_DB_NOT_EXIT"
         */
        public static final ContentCompareResultEnum TARGET_DB_NOT_EXIT =
            new ContentCompareResultEnum("TARGET_DB_NOT_EXIT");

        /**
         * Enum CAN_NOT_COMPARE for value: "CAN_NOT_COMPARE"
         */
        public static final ContentCompareResultEnum CAN_NOT_COMPARE = new ContentCompareResultEnum("CAN_NOT_COMPARE");

        private static final Map<String, ContentCompareResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ContentCompareResultEnum> createStaticFields() {
            Map<String, ContentCompareResultEnum> map = new HashMap<>();
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

        ContentCompareResultEnum(String value) {
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
        public static ContentCompareResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ContentCompareResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ContentCompareResultEnum(value);
            }
            return result;
        }

        public static ContentCompareResultEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof ContentCompareResultEnum) {
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
    @JsonProperty(value = "content_compare_result")

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
     * 对比结果。 - CONSISTENT-一致 - INCONSISTENT-不一致 - COMPARING-正在对比 - WAITING_FOR_COMPARISON-等待对比 - FAILED_TO_COMPARE-对比失败 - TARGET_DB_NOT_EXIT-目标库不存在 - CAN_NOT_COMPARE-无法对比
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
        return Objects.equals(this.sourceDbName, contentCompareResultOverview.sourceDbName)
            && Objects.equals(this.targetDbName, contentCompareResultOverview.targetDbName)
            && Objects.equals(this.contentCompareResult, contentCompareResultOverview.contentCompareResult);
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
