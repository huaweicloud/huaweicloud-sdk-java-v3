package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 扩容计费参数详情
 */
public class BssInfoExtend {

    /**
     * 是否自动付款
     */
    public static final class IsAutoPayEnum {

        /**
         * Enum NUMBER_0 for value: 0l
         */
        public static final IsAutoPayEnum NUMBER_0 = new IsAutoPayEnum(0l);

        /**
         * Enum NUMBER_1 for value: 1l
         */
        public static final IsAutoPayEnum NUMBER_1 = new IsAutoPayEnum(1l);

        private static final Map<Long, IsAutoPayEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Long, IsAutoPayEnum> createStaticFields() {
            Map<Long, IsAutoPayEnum> map = new HashMap<>();
            map.put(0l, NUMBER_0);
            map.put(1l, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Long value;

        IsAutoPayEnum(Long value) {
            this.value = value;
        }

        @JsonValue
        public Long getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoPayEnum fromValue(Long value) {
            if (value == null) {
                return null;
            }
            IsAutoPayEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsAutoPayEnum(value);
            }
            return result;
        }

        public static IsAutoPayEnum valueOf(Long value) {
            if (value == null) {
                return null;
            }
            IsAutoPayEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsAutoPayEnum) {
                return this.value.equals(((IsAutoPayEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private IsAutoPayEnum isAutoPay;

    public BssInfoExtend withIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动付款
     * @return isAutoPay
     */
    public IsAutoPayEnum getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BssInfoExtend bssInfoExtend = (BssInfoExtend) o;
        return Objects.equals(this.isAutoPay, bssInfoExtend.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BssInfoExtend {\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
