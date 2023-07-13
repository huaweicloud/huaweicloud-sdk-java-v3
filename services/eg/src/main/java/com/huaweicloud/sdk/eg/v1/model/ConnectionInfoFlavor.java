package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 规格
 */
public class ConnectionInfoFlavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 并发规格类型
     */
    public static final class ConcurrencyTypeEnum {

        /**
         * Enum SHARED for value: "shared"
         */
        public static final ConcurrencyTypeEnum SHARED = new ConcurrencyTypeEnum("shared");

        /**
         * Enum EXCLUSIVE for value: "exclusive"
         */
        public static final ConcurrencyTypeEnum EXCLUSIVE = new ConcurrencyTypeEnum("exclusive");

        private static final Map<String, ConcurrencyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConcurrencyTypeEnum> createStaticFields() {
            Map<String, ConcurrencyTypeEnum> map = new HashMap<>();
            map.put("shared", SHARED);
            map.put("exclusive", EXCLUSIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConcurrencyTypeEnum(String value) {
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
        public static ConcurrencyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConcurrencyTypeEnum(value));
        }

        public static ConcurrencyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConcurrencyTypeEnum) {
                return this.value.equals(((ConcurrencyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrency_type")

    private ConcurrencyTypeEnum concurrencyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrency")

    private Integer concurrency;

    /**
     * 带宽类型
     */
    public static final class BandwidthTypeEnum {

        /**
         * Enum SHARED for value: "shared"
         */
        public static final BandwidthTypeEnum SHARED = new BandwidthTypeEnum("shared");

        /**
         * Enum EXCLUSIVE for value: "exclusive"
         */
        public static final BandwidthTypeEnum EXCLUSIVE = new BandwidthTypeEnum("exclusive");

        private static final Map<String, BandwidthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BandwidthTypeEnum> createStaticFields() {
            Map<String, BandwidthTypeEnum> map = new HashMap<>();
            map.put("shared", SHARED);
            map.put("exclusive", EXCLUSIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BandwidthTypeEnum(String value) {
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
        public static BandwidthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BandwidthTypeEnum(value));
        }

        public static BandwidthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BandwidthTypeEnum) {
                return this.value.equals(((BandwidthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private BandwidthTypeEnum bandwidthType;

    public ConnectionInfoFlavor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规格名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConnectionInfoFlavor withConcurrencyType(ConcurrencyTypeEnum concurrencyType) {
        this.concurrencyType = concurrencyType;
        return this;
    }

    /**
     * 并发规格类型
     * @return concurrencyType
     */
    public ConcurrencyTypeEnum getConcurrencyType() {
        return concurrencyType;
    }

    public void setConcurrencyType(ConcurrencyTypeEnum concurrencyType) {
        this.concurrencyType = concurrencyType;
    }

    public ConnectionInfoFlavor withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    /**
     * 并发数
     * @return concurrency
     */
    public Integer getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public ConnectionInfoFlavor withBandwidthType(BandwidthTypeEnum bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    /**
     * 带宽类型
     * @return bandwidthType
     */
    public BandwidthTypeEnum getBandwidthType() {
        return bandwidthType;
    }

    public void setBandwidthType(BandwidthTypeEnum bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectionInfoFlavor that = (ConnectionInfoFlavor) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.concurrencyType, that.concurrencyType)
            && Objects.equals(this.concurrency, that.concurrency)
            && Objects.equals(this.bandwidthType, that.bandwidthType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, concurrencyType, concurrency, bandwidthType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionInfoFlavor {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    concurrencyType: ").append(toIndentedString(concurrencyType)).append("\n");
        sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
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
