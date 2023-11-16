package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UnblockRecordResponseUnblockRecord
 */
public class UnblockRecordResponseUnblockRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor")

    private String executor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_id")

    private String blockId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_time")

    private Long blockingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unblocking_time")

    private Long unblockingTime;

    /**
     * 解封类型。manual：人工；automatic：自动
     */
    public static final class UnblockTypeEnum {

        /**
         * Enum MANUAL for value: "manual"
         */
        public static final UnblockTypeEnum MANUAL = new UnblockTypeEnum("manual");

        /**
         * Enum AUTOMATIC for value: "automatic"
         */
        public static final UnblockTypeEnum AUTOMATIC = new UnblockTypeEnum("automatic");

        private static final Map<String, UnblockTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UnblockTypeEnum> createStaticFields() {
            Map<String, UnblockTypeEnum> map = new HashMap<>();
            map.put("manual", MANUAL);
            map.put("automatic", AUTOMATIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UnblockTypeEnum(String value) {
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
        public static UnblockTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UnblockTypeEnum(value));
        }

        public static UnblockTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UnblockTypeEnum) {
                return this.value.equals(((UnblockTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unblock_type")

    private UnblockTypeEnum unblockType;

    /**
     * 状态。unblocking：解封中；success：成功；failed：失败
     */
    public static final class StatusEnum {

        /**
         * Enum UNBLOCKING for value: "unblocking"
         */
        public static final StatusEnum UNBLOCKING = new StatusEnum("unblocking");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("unblocking", UNBLOCKING);
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
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
    @JsonProperty(value = "sort_time")

    private Long sortTime;

    public UnblockRecordResponseUnblockRecord withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * ip地址
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public UnblockRecordResponseUnblockRecord withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    /**
     * 执行者
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public UnblockRecordResponseUnblockRecord withBlockId(String blockId) {
        this.blockId = blockId;
        return this;
    }

    /**
     * 封堵id
     * @return blockId
     */
    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public UnblockRecordResponseUnblockRecord withBlockingTime(Long blockingTime) {
        this.blockingTime = blockingTime;
        return this;
    }

    /**
     * 封堵时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return blockingTime
     */
    public Long getBlockingTime() {
        return blockingTime;
    }

    public void setBlockingTime(Long blockingTime) {
        this.blockingTime = blockingTime;
    }

    public UnblockRecordResponseUnblockRecord withUnblockingTime(Long unblockingTime) {
        this.unblockingTime = unblockingTime;
        return this;
    }

    /**
     * 解封时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return unblockingTime
     */
    public Long getUnblockingTime() {
        return unblockingTime;
    }

    public void setUnblockingTime(Long unblockingTime) {
        this.unblockingTime = unblockingTime;
    }

    public UnblockRecordResponseUnblockRecord withUnblockType(UnblockTypeEnum unblockType) {
        this.unblockType = unblockType;
        return this;
    }

    /**
     * 解封类型。manual：人工；automatic：自动
     * @return unblockType
     */
    public UnblockTypeEnum getUnblockType() {
        return unblockType;
    }

    public void setUnblockType(UnblockTypeEnum unblockType) {
        this.unblockType = unblockType;
    }

    public UnblockRecordResponseUnblockRecord withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。unblocking：解封中；success：成功；failed：失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UnblockRecordResponseUnblockRecord withSortTime(Long sortTime) {
        this.sortTime = sortTime;
        return this;
    }

    /**
     * 时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return sortTime
     */
    public Long getSortTime() {
        return sortTime;
    }

    public void setSortTime(Long sortTime) {
        this.sortTime = sortTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnblockRecordResponseUnblockRecord that = (UnblockRecordResponseUnblockRecord) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.executor, that.executor)
            && Objects.equals(this.blockId, that.blockId) && Objects.equals(this.blockingTime, that.blockingTime)
            && Objects.equals(this.unblockingTime, that.unblockingTime)
            && Objects.equals(this.unblockType, that.unblockType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.sortTime, that.sortTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, executor, blockId, blockingTime, unblockingTime, unblockType, status, sortTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnblockRecordResponseUnblockRecord {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
        sb.append("    blockingTime: ").append(toIndentedString(blockingTime)).append("\n");
        sb.append("    unblockingTime: ").append(toIndentedString(unblockingTime)).append("\n");
        sb.append("    unblockType: ").append(toIndentedString(unblockType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sortTime: ").append(toIndentedString(sortTime)).append("\n");
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
