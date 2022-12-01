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
 * 行数对比任务表级详情。
 */
public class TableLineCompareDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table_name")

    private String sourceTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_row_num")

    private String sourceRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_name")

    private String targetTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_row_num")

    private String targetRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "difference_row_num")

    private String differenceRowNum;

    /**
     * 对比结果。取值： - CONSISTENT：一致。 - INCONSISTENT：不一致。 - COMPARING：正在对比。 - WAITING_FOR_COMPARISON：等待对比。 - FAILED_TO_COMPARE：对比失败。 - TARGET_DB_NOT_EXIST：目标库不存在。 - CAN_NOT_COMPARE：无法对比。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public TableLineCompareDetailInfo withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * 源库表名称。
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    public TableLineCompareDetailInfo withSourceRowNum(String sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
        return this;
    }

    /**
     * 源库表行数。
     * @return sourceRowNum
     */
    public String getSourceRowNum() {
        return sourceRowNum;
    }

    public void setSourceRowNum(String sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
    }

    public TableLineCompareDetailInfo withTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }

    /**
     * 目标库表名称。
     * @return targetTableName
     */
    public String getTargetTableName() {
        return targetTableName;
    }

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    public TableLineCompareDetailInfo withTargetRowNum(String targetRowNum) {
        this.targetRowNum = targetRowNum;
        return this;
    }

    /**
     * 目标库表行数。
     * @return targetRowNum
     */
    public String getTargetRowNum() {
        return targetRowNum;
    }

    public void setTargetRowNum(String targetRowNum) {
        this.targetRowNum = targetRowNum;
    }

    public TableLineCompareDetailInfo withDifferenceRowNum(String differenceRowNum) {
        this.differenceRowNum = differenceRowNum;
        return this;
    }

    /**
     * 差异值。
     * @return differenceRowNum
     */
    public String getDifferenceRowNum() {
        return differenceRowNum;
    }

    public void setDifferenceRowNum(String differenceRowNum) {
        this.differenceRowNum = differenceRowNum;
    }

    public TableLineCompareDetailInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 对比结果。取值： - CONSISTENT：一致。 - INCONSISTENT：不一致。 - COMPARING：正在对比。 - WAITING_FOR_COMPARISON：等待对比。 - FAILED_TO_COMPARE：对比失败。 - TARGET_DB_NOT_EXIST：目标库不存在。 - CAN_NOT_COMPARE：无法对比。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public TableLineCompareDetailInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 信息。
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
        TableLineCompareDetailInfo tableLineCompareDetailInfo = (TableLineCompareDetailInfo) o;
        return Objects.equals(this.sourceTableName, tableLineCompareDetailInfo.sourceTableName)
            && Objects.equals(this.sourceRowNum, tableLineCompareDetailInfo.sourceRowNum)
            && Objects.equals(this.targetTableName, tableLineCompareDetailInfo.targetTableName)
            && Objects.equals(this.targetRowNum, tableLineCompareDetailInfo.targetRowNum)
            && Objects.equals(this.differenceRowNum, tableLineCompareDetailInfo.differenceRowNum)
            && Objects.equals(this.status, tableLineCompareDetailInfo.status)
            && Objects.equals(this.message, tableLineCompareDetailInfo.message);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(sourceTableName, sourceRowNum, targetTableName, targetRowNum, differenceRowNum, status, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableLineCompareDetailInfo {\n");
        sb.append("    sourceTableName: ").append(toIndentedString(sourceTableName)).append("\n");
        sb.append("    sourceRowNum: ").append(toIndentedString(sourceRowNum)).append("\n");
        sb.append("    targetTableName: ").append(toIndentedString(targetTableName)).append("\n");
        sb.append("    targetRowNum: ").append(toIndentedString(targetRowNum)).append("\n");
        sb.append("    differenceRowNum: ").append(toIndentedString(differenceRowNum)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
