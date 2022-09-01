package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 公网IP绑定的带宽信息
 */
public class BandwidthInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_name")

    @JacksonXmlProperty(localName = "bandwidth_name")

    private String bandwidthName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_number")

    @JacksonXmlProperty(localName = "bandwidth_number")

    private Integer bandwidthNumber;

    /**
     * 带宽类型
     */
    public static final class BandwidthTypeEnum {

        /**
         * Enum PER for value: "PER"
         */
        public static final BandwidthTypeEnum PER = new BandwidthTypeEnum("PER");

        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final BandwidthTypeEnum WHOLE = new BandwidthTypeEnum("WHOLE");

        private static final Map<String, BandwidthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BandwidthTypeEnum> createStaticFields() {
            Map<String, BandwidthTypeEnum> map = new HashMap<>();
            map.put("PER", PER);
            map.put("WHOLE", WHOLE);
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
            BandwidthTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BandwidthTypeEnum(value);
            }
            return result;
        }

        public static BandwidthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BandwidthTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "bandwidth_type")

    private BandwidthTypeEnum bandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_id")

    @JacksonXmlProperty(localName = "bandwidth_id")

    private String bandwidthId;

    public BandwidthInfoResp withBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
        return this;
    }

    /**
     * 带宽名称
     * @return bandwidthName
     */
    public String getBandwidthName() {
        return bandwidthName;
    }

    public void setBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
    }

    public BandwidthInfoResp withBandwidthNumber(Integer bandwidthNumber) {
        this.bandwidthNumber = bandwidthNumber;
        return this;
    }

    /**
     * 带宽大小
     * minimum: 0
     * maximum: 99999
     * @return bandwidthNumber
     */
    public Integer getBandwidthNumber() {
        return bandwidthNumber;
    }

    public void setBandwidthNumber(Integer bandwidthNumber) {
        this.bandwidthNumber = bandwidthNumber;
    }

    public BandwidthInfoResp withBandwidthType(BandwidthTypeEnum bandwidthType) {
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

    public BandwidthInfoResp withBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
        return this;
    }

    /**
     * 带宽id
     * @return bandwidthId
     */
    public String getBandwidthId() {
        return bandwidthId;
    }

    public void setBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BandwidthInfoResp bandwidthInfoResp = (BandwidthInfoResp) o;
        return Objects.equals(this.bandwidthName, bandwidthInfoResp.bandwidthName)
            && Objects.equals(this.bandwidthNumber, bandwidthInfoResp.bandwidthNumber)
            && Objects.equals(this.bandwidthType, bandwidthInfoResp.bandwidthType)
            && Objects.equals(this.bandwidthId, bandwidthInfoResp.bandwidthId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthName, bandwidthNumber, bandwidthType, bandwidthId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthInfoResp {\n");
        sb.append("    bandwidthName: ").append(toIndentedString(bandwidthName)).append("\n");
        sb.append("    bandwidthNumber: ").append(toIndentedString(bandwidthNumber)).append("\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    bandwidthId: ").append(toIndentedString(bandwidthId)).append("\n");
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
