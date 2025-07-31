package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 防护配额统计信息
 */
public class QuotaStatisticsInfo {

    /**
     * version
     */
    public static final class VersionEnum {

        /**
         * Enum HSS_VERSION_BASIC for value: "hss.version.basic"
         */
        public static final VersionEnum HSS_VERSION_BASIC = new VersionEnum("hss.version.basic");

        /**
         * Enum HSS_VERSION_ENTERPRISE for value: "hss.version.enterprise"
         */
        public static final VersionEnum HSS_VERSION_ENTERPRISE = new VersionEnum("hss.version.enterprise");

        /**
         * Enum HSS_VERSION_PREMIUM for value: "hss.version.premium"
         */
        public static final VersionEnum HSS_VERSION_PREMIUM = new VersionEnum("hss.version.premium");

        /**
         * Enum HSS_VERSION_WTP for value: "hss.version.wtp"
         */
        public static final VersionEnum HSS_VERSION_WTP = new VersionEnum("hss.version.wtp");

        /**
         * Enum HSS_VERSION_CONTAINER_ENTERPRISE for value: "hss.version.container.enterprise"
         */
        public static final VersionEnum HSS_VERSION_CONTAINER_ENTERPRISE =
            new VersionEnum("hss.version.container.enterprise");

        private static final Map<String, VersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VersionEnum> createStaticFields() {
            Map<String, VersionEnum> map = new HashMap<>();
            map.put("hss.version.basic", HSS_VERSION_BASIC);
            map.put("hss.version.enterprise", HSS_VERSION_ENTERPRISE);
            map.put("hss.version.premium", HSS_VERSION_PREMIUM);
            map.put("hss.version.wtp", HSS_VERSION_WTP);
            map.put("hss.version.container.enterprise", HSS_VERSION_CONTAINER_ENTERPRISE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VersionEnum(String value) {
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
        public static VersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VersionEnum(value));
        }

        public static VersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VersionEnum) {
                return this.value.equals(((VersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private VersionEnum version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_num")

    private Integer idleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_num")

    private Integer usedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public QuotaStatisticsInfo withVersion(VersionEnum version) {
        this.version = version;
        return this;
    }

    /**
     * version
     * @return version
     */
    public VersionEnum getVersion() {
        return version;
    }

    public void setVersion(VersionEnum version) {
        this.version = version;
    }

    public QuotaStatisticsInfo withIdleNum(Integer idleNum) {
        this.idleNum = idleNum;
        return this;
    }

    /**
     * 空闲总数
     * minimum: 0
     * maximum: 300000
     * @return idleNum
     */
    public Integer getIdleNum() {
        return idleNum;
    }

    public void setIdleNum(Integer idleNum) {
        this.idleNum = idleNum;
    }

    public QuotaStatisticsInfo withUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
        return this;
    }

    /**
     * 使用中总数
     * minimum: 0
     * maximum: 300000
     * @return usedNum
     */
    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    public QuotaStatisticsInfo withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 300000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaStatisticsInfo that = (QuotaStatisticsInfo) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.idleNum, that.idleNum)
            && Objects.equals(this.usedNum, that.usedNum) && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, idleNum, usedNum, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaStatisticsInfo {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    idleNum: ").append(toIndentedString(idleNum)).append("\n");
        sb.append("    usedNum: ").append(toIndentedString(usedNum)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
