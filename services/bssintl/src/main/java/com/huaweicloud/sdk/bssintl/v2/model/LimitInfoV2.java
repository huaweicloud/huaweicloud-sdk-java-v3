package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LimitInfoV2
 */
public class LimitInfoV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit_key")
    
    private String limitKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit_type")
    
    private String limitType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="promotion_plan_id")
    
    private String promotionPlanId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="use_limiti_info_id")
    
    private String useLimitiInfoId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value1")
    
    private String value1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value2")
    
    private String value2;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value_unit")
    
    private String valueUnit;

    public LimitInfoV2 withLimitKey(String limitKey) {
        this.limitKey = limitKey;
        return this;
    }

    


    /**
     * |参数名称：折扣限制，key的取值请参考表 ICouponUseLimitInfo的limit_key要求。| |参数约束及描述：折扣限制，key的取值请参考表 ICouponUseLimitInfo的limit_key要求。|
     * @return limitKey
     */
    public String getLimitKey() {
        return limitKey;
    }

    public void setLimitKey(String limitKey) {
        this.limitKey = limitKey;
    }

    public LimitInfoV2 withLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }

    


    /**
     * |参数名称：限制类型。| |参数约束及描述：限制类型。|
     * @return limitType
     */
    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public LimitInfoV2 withPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
        return this;
    }

    


    /**
     * |参数名称：促销计划ID。| |参数约束及描述：促销计划ID。|
     * @return promotionPlanId
     */
    public String getPromotionPlanId() {
        return promotionPlanId;
    }

    public void setPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
    }

    public LimitInfoV2 withUseLimitiInfoId(String useLimitiInfoId) {
        this.useLimitiInfoId = useLimitiInfoId;
        return this;
    }

    


    /**
     * |参数名称：使用限制ID，主键。| |参数约束及描述：使用限制ID，主键。|
     * @return useLimitiInfoId
     */
    public String getUseLimitiInfoId() {
        return useLimitiInfoId;
    }

    public void setUseLimitiInfoId(String useLimitiInfoId) {
        this.useLimitiInfoId = useLimitiInfoId;
    }

    public LimitInfoV2 withValue1(String value1) {
        this.value1 = value1;
        return this;
    }

    


    /**
     * |参数名称：value1。| |参数约束及描述：value1。|
     * @return value1
     */
    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public LimitInfoV2 withValue2(String value2) {
        this.value2 = value2;
        return this;
    }

    


    /**
     * |参数名称：value2。| |参数约束及描述：value2。|
     * @return value2
     */
    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public LimitInfoV2 withValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
        return this;
    }

    


    /**
     * |参数名称：value单位。| |参数约束及描述：value单位。|
     * @return valueUnit
     */
    public String getValueUnit() {
        return valueUnit;
    }

    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LimitInfoV2 limitInfoV2 = (LimitInfoV2) o;
        return Objects.equals(this.limitKey, limitInfoV2.limitKey) &&
            Objects.equals(this.limitType, limitInfoV2.limitType) &&
            Objects.equals(this.promotionPlanId, limitInfoV2.promotionPlanId) &&
            Objects.equals(this.useLimitiInfoId, limitInfoV2.useLimitiInfoId) &&
            Objects.equals(this.value1, limitInfoV2.value1) &&
            Objects.equals(this.value2, limitInfoV2.value2) &&
            Objects.equals(this.valueUnit, limitInfoV2.valueUnit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limitKey, limitType, promotionPlanId, useLimitiInfoId, value1, value2, valueUnit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LimitInfoV2 {\n");
        sb.append("    limitKey: ").append(toIndentedString(limitKey)).append("\n");
        sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
        sb.append("    promotionPlanId: ").append(toIndentedString(promotionPlanId)).append("\n");
        sb.append("    useLimitiInfoId: ").append(toIndentedString(useLimitiInfoId)).append("\n");
        sb.append("    value1: ").append(toIndentedString(value1)).append("\n");
        sb.append("    value2: ").append(toIndentedString(value2)).append("\n");
        sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
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

