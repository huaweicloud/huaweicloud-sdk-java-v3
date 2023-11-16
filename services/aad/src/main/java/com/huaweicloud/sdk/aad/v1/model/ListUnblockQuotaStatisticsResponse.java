package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ListUnblockQuotaStatisticsResponse extends SdkResponse {

    /**
     * 用户类型：common_user , native_protection_user
     */
    public static final class TypeEnum {

        /**
         * Enum COMMON_USER for value: "common_user"
         */
        public static final TypeEnum COMMON_USER = new TypeEnum("common_user");

        /**
         * Enum NATIVE_PROTECTION_USER for value: "native_protection_user"
         */
        public static final TypeEnum NATIVE_PROTECTION_USER = new TypeEnum("native_protection_user");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("common_user", COMMON_USER);
            map.put("native_protection_user", NATIVE_PROTECTION_USER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_unblocking_quota")

    private Integer totalUnblockingQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_unblocking_quota")

    private Integer remainingUnblockingQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unblocking_quota_today")

    private Integer unblockingQuotaToday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_unblocking_quota_today")

    private Integer remainingUnblockingQuotaToday;

    public ListUnblockQuotaStatisticsResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 用户类型：common_user , native_protection_user
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListUnblockQuotaStatisticsResponse withTotalUnblockingQuota(Integer totalUnblockingQuota) {
        this.totalUnblockingQuota = totalUnblockingQuota;
        return this;
    }

    /**
     * 解封总配额
     * minimum: 0
     * maximum: 2097152
     * @return totalUnblockingQuota
     */
    public Integer getTotalUnblockingQuota() {
        return totalUnblockingQuota;
    }

    public void setTotalUnblockingQuota(Integer totalUnblockingQuota) {
        this.totalUnblockingQuota = totalUnblockingQuota;
    }

    public ListUnblockQuotaStatisticsResponse withRemainingUnblockingQuota(Integer remainingUnblockingQuota) {
        this.remainingUnblockingQuota = remainingUnblockingQuota;
        return this;
    }

    /**
     * 剩余解封配额
     * minimum: 0
     * maximum: 2097152
     * @return remainingUnblockingQuota
     */
    public Integer getRemainingUnblockingQuota() {
        return remainingUnblockingQuota;
    }

    public void setRemainingUnblockingQuota(Integer remainingUnblockingQuota) {
        this.remainingUnblockingQuota = remainingUnblockingQuota;
    }

    public ListUnblockQuotaStatisticsResponse withUnblockingQuotaToday(Integer unblockingQuotaToday) {
        this.unblockingQuotaToday = unblockingQuotaToday;
        return this;
    }

    /**
     * 今日解封配额
     * minimum: 0
     * maximum: 2097152
     * @return unblockingQuotaToday
     */
    public Integer getUnblockingQuotaToday() {
        return unblockingQuotaToday;
    }

    public void setUnblockingQuotaToday(Integer unblockingQuotaToday) {
        this.unblockingQuotaToday = unblockingQuotaToday;
    }

    public ListUnblockQuotaStatisticsResponse withRemainingUnblockingQuotaToday(Integer remainingUnblockingQuotaToday) {
        this.remainingUnblockingQuotaToday = remainingUnblockingQuotaToday;
        return this;
    }

    /**
     * 今日剩余解封配额
     * minimum: 0
     * maximum: 2097152
     * @return remainingUnblockingQuotaToday
     */
    public Integer getRemainingUnblockingQuotaToday() {
        return remainingUnblockingQuotaToday;
    }

    public void setRemainingUnblockingQuotaToday(Integer remainingUnblockingQuotaToday) {
        this.remainingUnblockingQuotaToday = remainingUnblockingQuotaToday;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUnblockQuotaStatisticsResponse that = (ListUnblockQuotaStatisticsResponse) obj;
        return Objects.equals(this.type, that.type)
            && Objects.equals(this.totalUnblockingQuota, that.totalUnblockingQuota)
            && Objects.equals(this.remainingUnblockingQuota, that.remainingUnblockingQuota)
            && Objects.equals(this.unblockingQuotaToday, that.unblockingQuotaToday)
            && Objects.equals(this.remainingUnblockingQuotaToday, that.remainingUnblockingQuotaToday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            totalUnblockingQuota,
            remainingUnblockingQuota,
            unblockingQuotaToday,
            remainingUnblockingQuotaToday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUnblockQuotaStatisticsResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    totalUnblockingQuota: ").append(toIndentedString(totalUnblockingQuota)).append("\n");
        sb.append("    remainingUnblockingQuota: ").append(toIndentedString(remainingUnblockingQuota)).append("\n");
        sb.append("    unblockingQuotaToday: ").append(toIndentedString(unblockingQuotaToday)).append("\n");
        sb.append("    remainingUnblockingQuotaToday: ")
            .append(toIndentedString(remainingUnblockingQuotaToday))
            .append("\n");
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
