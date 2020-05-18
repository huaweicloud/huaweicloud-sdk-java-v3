package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 包周期扩容计费策略参数。
 */
public class BssParamForResizeVolume  {

    /**
     * 功能说明：是否立即支付。该参数只有在云硬盘为包周期的情况下有意义。默认值为false 取值范围： * true：立即支付，从帐户余额中自动扣费 * false：不立即支付，创建订单暂不支付 
     */
    public static class IsAutoPayEnum {

        
        /**
         * Enum FALSE for value: "false"
         */
        public static final IsAutoPayEnum FALSE = new IsAutoPayEnum("false");

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final IsAutoPayEnum TRUE = new IsAutoPayEnum("true");

        

        public static Map<String, IsAutoPayEnum> staticFields =
                new HashMap<String, IsAutoPayEnum>() {
                    { 
                        put("false", FALSE);
                        put("true", TRUE);
                    }
                };

        private String value;

        IsAutoPayEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoPayEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            IsAutoPayEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new IsAutoPayEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static IsAutoPayEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IsAutoPayEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IsAutoPayEnum) {
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
    @JsonProperty(value="isAutoPay")
    
    private IsAutoPayEnum isAutoPay = IsAutoPayEnum.FALSE;

    public BssParamForResizeVolume withIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * 功能说明：是否立即支付。该参数只有在云硬盘为包周期的情况下有意义。默认值为false 取值范围： * true：立即支付，从帐户余额中自动扣费 * false：不立即支付，创建订单暂不支付 
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
        BssParamForResizeVolume bssParamForResizeVolume = (BssParamForResizeVolume) o;
        return Objects.equals(this.isAutoPay, bssParamForResizeVolume.isAutoPay);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isAutoPay);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BssParamForResizeVolume {\n");
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

