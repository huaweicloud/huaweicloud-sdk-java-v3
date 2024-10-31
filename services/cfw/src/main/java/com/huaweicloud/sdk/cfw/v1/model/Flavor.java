package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Flavor
 */
public class Flavor {

    /**
     * 防火墙版本，0：标准版，1：专业版，3：基础版，购买时，当防火墙“charge_mode”为“postPaid”时，仅支持专业版。“charge_mode”为“prePaid”时，支持标准版、专业版。
     */
    public static final class VersionEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final VersionEnum NUMBER_0 = new VersionEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final VersionEnum NUMBER_1 = new VersionEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final VersionEnum NUMBER_2 = new VersionEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final VersionEnum NUMBER_3 = new VersionEnum(3);

        private static final Map<Integer, VersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, VersionEnum> createStaticFields() {
            Map<Integer, VersionEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        VersionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VersionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VersionEnum(value));
        }

        public static VersionEnum valueOf(Integer value) {
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
    @JsonProperty(value = "eip_count")

    private Integer eipCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_count")

    private Integer vpcCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_storage")

    private Integer logStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_bandwidth")

    private Integer defaultBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_eip_count")

    private Integer defaultEipCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_log_storage")

    private Integer defaultLogStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_vpc_count")

    private Integer defaultVpcCount;

    public Flavor withVersion(VersionEnum version) {
        this.version = version;
        return this;
    }

    /**
     * 防火墙版本，0：标准版，1：专业版，3：基础版，购买时，当防火墙“charge_mode”为“postPaid”时，仅支持专业版。“charge_mode”为“prePaid”时，支持标准版、专业版。
     * @return version
     */
    public VersionEnum getVersion() {
        return version;
    }

    public void setVersion(VersionEnum version) {
        this.version = version;
    }

    public Flavor withEipCount(Integer eipCount) {
        this.eipCount = eipCount;
        return this;
    }

    /**
     * eip数量
     * minimum: 1
     * @return eipCount
     */
    public Integer getEipCount() {
        return eipCount;
    }

    public void setEipCount(Integer eipCount) {
        this.eipCount = eipCount;
    }

    public Flavor withVpcCount(Integer vpcCount) {
        this.vpcCount = vpcCount;
        return this;
    }

    /**
     * vpc数量
     * minimum: 1
     * @return vpcCount
     */
    public Integer getVpcCount() {
        return vpcCount;
    }

    public void setVpcCount(Integer vpcCount) {
        this.vpcCount = vpcCount;
    }

    public Flavor withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 带宽，单位为mbps
     * minimum: 1
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Flavor withLogStorage(Integer logStorage) {
        this.logStorage = logStorage;
        return this;
    }

    /**
     * 日志存储，单位为byte
     * @return logStorage
     */
    public Integer getLogStorage() {
        return logStorage;
    }

    public void setLogStorage(Integer logStorage) {
        this.logStorage = logStorage;
    }

    public Flavor withDefaultBandwidth(Integer defaultBandwidth) {
        this.defaultBandwidth = defaultBandwidth;
        return this;
    }

    /**
     * 默认防火墙带宽，单位为mbps，标准版为10，专业版为50，按需专业版为200
     * @return defaultBandwidth
     */
    public Integer getDefaultBandwidth() {
        return defaultBandwidth;
    }

    public void setDefaultBandwidth(Integer defaultBandwidth) {
        this.defaultBandwidth = defaultBandwidth;
    }

    public Flavor withDefaultEipCount(Integer defaultEipCount) {
        this.defaultEipCount = defaultEipCount;
        return this;
    }

    /**
     * 默认eip数，标准版为20，专业版为50，按需专业版为1000
     * @return defaultEipCount
     */
    public Integer getDefaultEipCount() {
        return defaultEipCount;
    }

    public void setDefaultEipCount(Integer defaultEipCount) {
        this.defaultEipCount = defaultEipCount;
    }

    public Flavor withDefaultLogStorage(Integer defaultLogStorage) {
        this.defaultLogStorage = defaultLogStorage;
        return this;
    }

    /**
     * 默认日志存储，单位为byte，默认为0
     * @return defaultLogStorage
     */
    public Integer getDefaultLogStorage() {
        return defaultLogStorage;
    }

    public void setDefaultLogStorage(Integer defaultLogStorage) {
        this.defaultLogStorage = defaultLogStorage;
    }

    public Flavor withDefaultVpcCount(Integer defaultVpcCount) {
        this.defaultVpcCount = defaultVpcCount;
        return this;
    }

    /**
     * 默认vpc数，标准版为0，专业版为2，按需专业版为5
     * @return defaultVpcCount
     */
    public Integer getDefaultVpcCount() {
        return defaultVpcCount;
    }

    public void setDefaultVpcCount(Integer defaultVpcCount) {
        this.defaultVpcCount = defaultVpcCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Flavor that = (Flavor) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.eipCount, that.eipCount)
            && Objects.equals(this.vpcCount, that.vpcCount) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.logStorage, that.logStorage)
            && Objects.equals(this.defaultBandwidth, that.defaultBandwidth)
            && Objects.equals(this.defaultEipCount, that.defaultEipCount)
            && Objects.equals(this.defaultLogStorage, that.defaultLogStorage)
            && Objects.equals(this.defaultVpcCount, that.defaultVpcCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            eipCount,
            vpcCount,
            bandwidth,
            logStorage,
            defaultBandwidth,
            defaultEipCount,
            defaultLogStorage,
            defaultVpcCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    eipCount: ").append(toIndentedString(eipCount)).append("\n");
        sb.append("    vpcCount: ").append(toIndentedString(vpcCount)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    logStorage: ").append(toIndentedString(logStorage)).append("\n");
        sb.append("    defaultBandwidth: ").append(toIndentedString(defaultBandwidth)).append("\n");
        sb.append("    defaultEipCount: ").append(toIndentedString(defaultEipCount)).append("\n");
        sb.append("    defaultLogStorage: ").append(toIndentedString(defaultLogStorage)).append("\n");
        sb.append("    defaultVpcCount: ").append(toIndentedString(defaultVpcCount)).append("\n");
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
