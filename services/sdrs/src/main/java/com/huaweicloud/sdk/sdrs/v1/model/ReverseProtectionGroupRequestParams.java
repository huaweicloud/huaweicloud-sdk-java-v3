package com.huaweicloud.sdk.sdrs.v1.model;

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
 * 保护组切换请求参数数据结构
 */
public class ReverseProtectionGroupRequestParams {

    /**
     * 切换方向。target：表示从创建保护组时指定的生产站点切换到创建保护组时指定的容灾站点。source：表示从创建保护组时指定的容灾站点切换到创建保护组时指定的生产站点。
     */
    public static final class PriorityStationEnum {

        /**
         * Enum TARGET for value: "target"
         */
        public static final PriorityStationEnum TARGET = new PriorityStationEnum("target");

        /**
         * Enum SOURCE for value: "source"
         */
        public static final PriorityStationEnum SOURCE = new PriorityStationEnum("source");

        private static final Map<String, PriorityStationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PriorityStationEnum> createStaticFields() {
            Map<String, PriorityStationEnum> map = new HashMap<>();
            map.put("target", TARGET);
            map.put("source", SOURCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PriorityStationEnum(String value) {
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
        public static PriorityStationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PriorityStationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PriorityStationEnum(value);
            }
            return result;
        }

        public static PriorityStationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PriorityStationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PriorityStationEnum) {
                return this.value.equals(((PriorityStationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_station")

    @JacksonXmlProperty(localName = "priority_station")

    private PriorityStationEnum priorityStation;

    public ReverseProtectionGroupRequestParams withPriorityStation(PriorityStationEnum priorityStation) {
        this.priorityStation = priorityStation;
        return this;
    }

    /**
     * 切换方向。target：表示从创建保护组时指定的生产站点切换到创建保护组时指定的容灾站点。source：表示从创建保护组时指定的容灾站点切换到创建保护组时指定的生产站点。
     * @return priorityStation
     */
    public PriorityStationEnum getPriorityStation() {
        return priorityStation;
    }

    public void setPriorityStation(PriorityStationEnum priorityStation) {
        this.priorityStation = priorityStation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReverseProtectionGroupRequestParams reverseProtectionGroupRequestParams =
            (ReverseProtectionGroupRequestParams) o;
        return Objects.equals(this.priorityStation, reverseProtectionGroupRequestParams.priorityStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priorityStation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReverseProtectionGroupRequestParams {\n");
        sb.append("    priorityStation: ").append(toIndentedString(priorityStation)).append("\n");
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
