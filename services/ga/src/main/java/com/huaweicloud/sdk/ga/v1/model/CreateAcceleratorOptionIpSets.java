package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateAcceleratorOptionIpSets
 */
public class CreateAcceleratorOptionIpSets {

    /**
     * IP地址类型，取值：IPV4
     */
    public static final class IpTypeEnum {

        /**
         * Enum IPV4 for value: "IPV4"
         */
        public static final IpTypeEnum IPV4 = new IpTypeEnum("IPV4");

        private static final Map<String, IpTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpTypeEnum> createStaticFields() {
            Map<String, IpTypeEnum> map = new HashMap<>();
            map.put("IPV4", IPV4);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpTypeEnum(String value) {
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
        public static IpTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpTypeEnum(value));
        }

        public static IpTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpTypeEnum) {
                return this.value.equals(((IpTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private IpTypeEnum ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private Area area;

    public CreateAcceleratorOptionIpSets withIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * IP地址类型，取值：IPV4
     * @return ipType
     */
    public IpTypeEnum getIpType() {
        return ipType;
    }

    public void setIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
    }

    public CreateAcceleratorOptionIpSets withArea(Area area) {
        this.area = area;
        return this;
    }

    /**
     * Get area
     * @return area
     */
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAcceleratorOptionIpSets that = (CreateAcceleratorOptionIpSets) obj;
        return Objects.equals(this.ipType, that.ipType) && Objects.equals(this.area, that.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipType, area);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAcceleratorOptionIpSets {\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
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
