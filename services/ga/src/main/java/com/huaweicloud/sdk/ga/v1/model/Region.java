package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 区域。
 */
public class Region {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private String area;

    /**
     * 终端节点类型。
     */
    public static final class SupportedEndpointTypesEnum {

        /**
         * Enum EIP for value: "EIP"
         */
        public static final SupportedEndpointTypesEnum EIP = new SupportedEndpointTypesEnum("EIP");

        private static final Map<String, SupportedEndpointTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportedEndpointTypesEnum> createStaticFields() {
            Map<String, SupportedEndpointTypesEnum> map = new HashMap<>();
            map.put("EIP", EIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportedEndpointTypesEnum(String value) {
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
        public static SupportedEndpointTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new SupportedEndpointTypesEnum(value));
        }

        public static SupportedEndpointTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportedEndpointTypesEnum) {
                return this.value.equals(((SupportedEndpointTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_endpoint_types")

    private List<SupportedEndpointTypesEnum> supportedEndpointTypes = null;

    public Region withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Region withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * 区域所属地区，取值： - OUTOFCM： 中国大陆以外 - CM：中国大陆
     * @return area
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Region withSupportedEndpointTypes(List<SupportedEndpointTypesEnum> supportedEndpointTypes) {
        this.supportedEndpointTypes = supportedEndpointTypes;
        return this;
    }

    public Region addSupportedEndpointTypesItem(SupportedEndpointTypesEnum supportedEndpointTypesItem) {
        if (this.supportedEndpointTypes == null) {
            this.supportedEndpointTypes = new ArrayList<>();
        }
        this.supportedEndpointTypes.add(supportedEndpointTypesItem);
        return this;
    }

    public Region withSupportedEndpointTypes(Consumer<List<SupportedEndpointTypesEnum>> supportedEndpointTypesSetter) {
        if (this.supportedEndpointTypes == null) {
            this.supportedEndpointTypes = new ArrayList<>();
        }
        supportedEndpointTypesSetter.accept(this.supportedEndpointTypes);
        return this;
    }

    /**
     * 区域支持的终端节点类型。取值： EIP：弹性公网IP
     * @return supportedEndpointTypes
     */
    public List<SupportedEndpointTypesEnum> getSupportedEndpointTypes() {
        return supportedEndpointTypes;
    }

    public void setSupportedEndpointTypes(List<SupportedEndpointTypesEnum> supportedEndpointTypes) {
        this.supportedEndpointTypes = supportedEndpointTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Region that = (Region) obj;
        return Objects.equals(this.regionId, that.regionId) && Objects.equals(this.area, that.area)
            && Objects.equals(this.supportedEndpointTypes, that.supportedEndpointTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, area, supportedEndpointTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Region {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    supportedEndpointTypes: ").append(toIndentedString(supportedEndpointTypes)).append("\n");
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
