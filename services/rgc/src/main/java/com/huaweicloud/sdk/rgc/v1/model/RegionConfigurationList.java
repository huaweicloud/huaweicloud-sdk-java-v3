package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 区域纳管情况。
 */
public class RegionConfigurationList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    /**
     * 纳管账号类型LOGGING,SECURITY。
     */
    public static final class RegionConfigurationStatusEnum {

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final RegionConfigurationStatusEnum ENABLED = new RegionConfigurationStatusEnum("ENABLED");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final RegionConfigurationStatusEnum DISABLED = new RegionConfigurationStatusEnum("DISABLED");

        private static final Map<String, RegionConfigurationStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RegionConfigurationStatusEnum> createStaticFields() {
            Map<String, RegionConfigurationStatusEnum> map = new HashMap<>();
            map.put("ENABLED", ENABLED);
            map.put("DISABLED", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RegionConfigurationStatusEnum(String value) {
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
        public static RegionConfigurationStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new RegionConfigurationStatusEnum(value));
        }

        public static RegionConfigurationStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RegionConfigurationStatusEnum) {
                return this.value.equals(((RegionConfigurationStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_configuration_status")

    private RegionConfigurationStatusEnum regionConfigurationStatus;

    public RegionConfigurationList withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域名字。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public RegionConfigurationList withRegionConfigurationStatus(
        RegionConfigurationStatusEnum regionConfigurationStatus) {
        this.regionConfigurationStatus = regionConfigurationStatus;
        return this;
    }

    /**
     * 纳管账号类型LOGGING,SECURITY。
     * @return regionConfigurationStatus
     */
    public RegionConfigurationStatusEnum getRegionConfigurationStatus() {
        return regionConfigurationStatus;
    }

    public void setRegionConfigurationStatus(RegionConfigurationStatusEnum regionConfigurationStatus) {
        this.regionConfigurationStatus = regionConfigurationStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegionConfigurationList that = (RegionConfigurationList) obj;
        return Objects.equals(this.region, that.region)
            && Objects.equals(this.regionConfigurationStatus, that.regionConfigurationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, regionConfigurationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionConfigurationList {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    regionConfigurationStatus: ").append(toIndentedString(regionConfigurationStatus)).append("\n");
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
