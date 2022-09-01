package com.huaweicloud.sdk.bms.v1.model;

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
 * 创建弹性公网IP的extendparam字段数据结构说明
 */
public class ExtendParamEip {

    /**
     * 弹性公网IP的计费模式。若带宽计费类型为bandwidth，则支持prePaid和postPaid；若带宽计费类型为traffic，仅支持postPaid。取值范围：prePaid：预付费，即包年包月postPaid：后付费，即按需付费 说明：如果bandwidth对象中sharetype是WHOLE且id有值，弹性公网IP只能创建为按需付费的，故该参数传参“prePaid”无效。
     */
    public static final class ChargingmodeEnum {

        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargingmodeEnum PREPAID = new ChargingmodeEnum("prePaid");

        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargingmodeEnum POSTPAID = new ChargingmodeEnum("postPaid");

        private static final Map<String, ChargingmodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingmodeEnum> createStaticFields() {
            Map<String, ChargingmodeEnum> map = new HashMap<>();
            map.put("prePaid", PREPAID);
            map.put("postPaid", POSTPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingmodeEnum(String value) {
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
        public static ChargingmodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ChargingmodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargingmodeEnum(value);
            }
            return result;
        }

        public static ChargingmodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChargingmodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingmodeEnum) {
                return this.value.equals(((ChargingmodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargingmode")

    @JacksonXmlProperty(localName = "chargingmode")

    private ChargingmodeEnum chargingmode;

    public ExtendParamEip withChargingmode(ChargingmodeEnum chargingmode) {
        this.chargingmode = chargingmode;
        return this;
    }

    /**
     * 弹性公网IP的计费模式。若带宽计费类型为bandwidth，则支持prePaid和postPaid；若带宽计费类型为traffic，仅支持postPaid。取值范围：prePaid：预付费，即包年包月postPaid：后付费，即按需付费 说明：如果bandwidth对象中sharetype是WHOLE且id有值，弹性公网IP只能创建为按需付费的，故该参数传参“prePaid”无效。
     * @return chargingmode
     */
    public ChargingmodeEnum getChargingmode() {
        return chargingmode;
    }

    public void setChargingmode(ChargingmodeEnum chargingmode) {
        this.chargingmode = chargingmode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendParamEip extendParamEip = (ExtendParamEip) o;
        return Objects.equals(this.chargingmode, extendParamEip.chargingmode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingmode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendParamEip {\n");
        sb.append("    chargingmode: ").append(toIndentedString(chargingmode)).append("\n");
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
