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
 * LineCompareDetail
 */
public class LineCompareDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table_name")

    private String sourceTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_name")

    private String targetTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_row_num")

    private Integer sourceRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_row_num")

    private Integer targetRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_row_num")

    private Integer diffRowNum;

    /**
     * 对比结果。 - CONSISTENT-一致 - INCONSISTENT-不一致 - COMPARING-正在对比 - WAITING_FOR_COMPARISON-等待对比 - FAILED_TO_COMPARE-对比失败 - TARGET_DB_NOT_EXIT-目标库不存在 - CAN_NOT_COMPARE-无法对比
     */
    public static final class LineCompareResultEnum {

        /**
         * Enum CONSISTENT for value: "CONSISTENT"
         */
        public static final LineCompareResultEnum CONSISTENT = new LineCompareResultEnum("CONSISTENT");

        /**
         * Enum INCONSISTENT for value: "INCONSISTENT"
         */
        public static final LineCompareResultEnum INCONSISTENT = new LineCompareResultEnum("INCONSISTENT");

        /**
         * Enum COMPARING for value: "COMPARING"
         */
        public static final LineCompareResultEnum COMPARING = new LineCompareResultEnum("COMPARING");

        /**
         * Enum WAITING_FOR_COMPARISON for value: "WAITING_FOR_COMPARISON"
         */
        public static final LineCompareResultEnum WAITING_FOR_COMPARISON =
            new LineCompareResultEnum("WAITING_FOR_COMPARISON");

        /**
         * Enum FAILED_TO_COMPARE for value: "FAILED_TO_COMPARE"
         */
        public static final LineCompareResultEnum FAILED_TO_COMPARE = new LineCompareResultEnum("FAILED_TO_COMPARE");

        /**
         * Enum TARGET_DB_NOT_EXIT for value: "TARGET_DB_NOT_EXIT"
         */
        public static final LineCompareResultEnum TARGET_DB_NOT_EXIT = new LineCompareResultEnum("TARGET_DB_NOT_EXIT");

        /**
         * Enum CAN_NOT_COMPARE for value: "CAN_NOT_COMPARE"
         */
        public static final LineCompareResultEnum CAN_NOT_COMPARE = new LineCompareResultEnum("CAN_NOT_COMPARE");

        private static final Map<String, LineCompareResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LineCompareResultEnum> createStaticFields() {
            Map<String, LineCompareResultEnum> map = new HashMap<>();
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

        LineCompareResultEnum(String value) {
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
        public static LineCompareResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LineCompareResultEnum(value));
        }

        public static LineCompareResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LineCompareResultEnum) {
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
    @JsonProperty(value = "line_compare_result")

    private LineCompareResultEnum lineCompareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

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
     * 对比结果。 - CONSISTENT-一致 - INCONSISTENT-不一致 - COMPARING-正在对比 - WAITING_FOR_COMPARISON-等待对比 - FAILED_TO_COMPARE-对比失败 - TARGET_DB_NOT_EXIT-目标库不存在 - CAN_NOT_COMPARE-无法对比
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineCompareDetail that = (LineCompareDetail) obj;
        return Objects.equals(this.sourceTableName, that.sourceTableName)
            && Objects.equals(this.targetTableName, that.targetTableName)
            && Objects.equals(this.sourceRowNum, that.sourceRowNum)
            && Objects.equals(this.targetRowNum, that.targetRowNum) && Objects.equals(this.diffRowNum, that.diffRowNum)
            && Objects.equals(this.lineCompareResult, that.lineCompareResult)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(sourceTableName, targetTableName, sourceRowNum, targetRowNum, diffRowNum, lineCompareResult, message);
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
