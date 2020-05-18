package com.huaweicloud.sdk.ecs.v2.model;

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
 * 
 */
public class PostPaidServerEipExtendParam  {

    /**
     * 公网IP的计费模式。  取值范围：  - prePaid-预付费，即包年包月； - postPaid-后付费，即按需付费；  > 说明： >  > 如果bandwidth对象中share_type是WHOLE且id有值，弹性IP只能创建为按需付费的，故该参数传参“prePaid”无效。
     */
    public static class ChargingModeEnum {

        
        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargingModeEnum PREPAID = new ChargingModeEnum("prePaid");

        
        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargingModeEnum POSTPAID = new ChargingModeEnum("postPaid");

        

        public static Map<String, ChargingModeEnum> staticFields =
                new HashMap<String, ChargingModeEnum>() {
                    { 
                        put("prePaid", PREPAID);
                        put("postPaid", POSTPAID);
                    }
                };

        private String value;

        ChargingModeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargingModeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ChargingModeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ChargingModeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ChargingModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChargingModeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chargingMode")
    
    private ChargingModeEnum chargingMode;

    public PostPaidServerEipExtendParam withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 公网IP的计费模式。  取值范围：  - prePaid-预付费，即包年包月； - postPaid-后付费，即按需付费；  > 说明： >  > 如果bandwidth对象中share_type是WHOLE且id有值，弹性IP只能创建为按需付费的，故该参数传参“prePaid”无效。
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPaidServerEipExtendParam postPaidServerEipExtendParam = (PostPaidServerEipExtendParam) o;
        return Objects.equals(this.chargingMode, postPaidServerEipExtendParam.chargingMode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chargingMode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerEipExtendParam {\n");
            sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
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

