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
 * BlockListBlockingList
 */
public class BlockListBlockingList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_time")

    private Long blockingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_unblocking_time")

    private Long estimatedUnblockingTime;

    /**
     * 状态。unblocking：解封中；success：成功；failed：失败
     */
    public static final class StatusEnum {

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum UNBLOCKING for value: "unblocking"
         */
        public static final StatusEnum UNBLOCKING = new StatusEnum("unblocking");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("failed", FAILED);
            map.put("success", SUCCESS);
            map.put("unblocking", UNBLOCKING);
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

    public BlockListBlockingList withIp(String ip) {
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

    public BlockListBlockingList withBlockingTime(Long blockingTime) {
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

    public BlockListBlockingList withEstimatedUnblockingTime(Long estimatedUnblockingTime) {
        this.estimatedUnblockingTime = estimatedUnblockingTime;
        return this;
    }

    /**
     * 预计解封时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return estimatedUnblockingTime
     */
    public Long getEstimatedUnblockingTime() {
        return estimatedUnblockingTime;
    }

    public void setEstimatedUnblockingTime(Long estimatedUnblockingTime) {
        this.estimatedUnblockingTime = estimatedUnblockingTime;
    }

    public BlockListBlockingList withStatus(StatusEnum status) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BlockListBlockingList that = (BlockListBlockingList) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.blockingTime, that.blockingTime)
            && Objects.equals(this.estimatedUnblockingTime, that.estimatedUnblockingTime)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, blockingTime, estimatedUnblockingTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlockListBlockingList {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    blockingTime: ").append(toIndentedString(blockingTime)).append("\n");
        sb.append("    estimatedUnblockingTime: ").append(toIndentedString(estimatedUnblockingTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
