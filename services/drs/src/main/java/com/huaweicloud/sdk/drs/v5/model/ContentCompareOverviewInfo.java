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
 * 内容对比概览信息体。
 */
public class ContentCompareOverviewInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db")

    private String sourceDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db")

    private String targetDb;

    /**
     * 对比结果。取值： - CONSISTENT：一致。 - INCONSISTENT：不一致。 - COMPARING：正在对比。 - WAITING_FOR_COMPARISON：等待对比。 - FAILED_TO_COMPARE：对比失败。 - TARGET_DB_NOT_EXIST：目标库不存在。 - CAN_NOT_COMPARE：无法对比。 - WAIT_FOR_COMPARE：命令已下发，等待对比结果 - CANCELED：已取消
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

        /**
         * Enum WAIT_FOR_COMPARE for value: "WAIT_FOR_COMPARE"
         */
        public static final StatusEnum WAIT_FOR_COMPARE = new StatusEnum("WAIT_FOR_COMPARE");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StatusEnum CANCELED = new StatusEnum("CANCELED");

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
            map.put("WAIT_FOR_COMPARE", WAIT_FOR_COMPARE);
            map.put("CANCELED", CANCELED);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "compare_result")

    private Boolean compareResult;

    public ContentCompareOverviewInfo withSourceDb(String sourceDb) {
        this.sourceDb = sourceDb;
        return this;
    }

    /**
     * 源库库名。
     * @return sourceDb
     */
    public String getSourceDb() {
        return sourceDb;
    }

    public void setSourceDb(String sourceDb) {
        this.sourceDb = sourceDb;
    }

    public ContentCompareOverviewInfo withTargetDb(String targetDb) {
        this.targetDb = targetDb;
        return this;
    }

    /**
     * 目标库库名。
     * @return targetDb
     */
    public String getTargetDb() {
        return targetDb;
    }

    public void setTargetDb(String targetDb) {
        this.targetDb = targetDb;
    }

    public ContentCompareOverviewInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 对比结果。取值： - CONSISTENT：一致。 - INCONSISTENT：不一致。 - COMPARING：正在对比。 - WAITING_FOR_COMPARISON：等待对比。 - FAILED_TO_COMPARE：对比失败。 - TARGET_DB_NOT_EXIST：目标库不存在。 - CAN_NOT_COMPARE：无法对比。 - WAIT_FOR_COMPARE：命令已下发，等待对比结果 - CANCELED：已取消
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ContentCompareOverviewInfo withCompareResult(Boolean compareResult) {
        this.compareResult = compareResult;
        return this;
    }

    /**
     * 对比结果。
     * @return compareResult
     */
    public Boolean getCompareResult() {
        return compareResult;
    }

    public void setCompareResult(Boolean compareResult) {
        this.compareResult = compareResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContentCompareOverviewInfo that = (ContentCompareOverviewInfo) obj;
        return Objects.equals(this.sourceDb, that.sourceDb) && Objects.equals(this.targetDb, that.targetDb)
            && Objects.equals(this.status, that.status) && Objects.equals(this.compareResult, that.compareResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDb, targetDb, status, compareResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentCompareOverviewInfo {\n");
        sb.append("    sourceDb: ").append(toIndentedString(sourceDb)).append("\n");
        sb.append("    targetDb: ").append(toIndentedString(targetDb)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    compareResult: ").append(toIndentedString(compareResult)).append("\n");
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
