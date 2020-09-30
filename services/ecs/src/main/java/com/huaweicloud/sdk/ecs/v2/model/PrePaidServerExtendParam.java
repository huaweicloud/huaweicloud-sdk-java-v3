package com.huaweicloud.sdk.ecs.v2.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class PrePaidServerExtendParam  {

    /**
     * 计费模式。  功能说明：付费方式  取值范围：  - prePaid-预付费，即包年包月； - postPaid-后付费，即按需付费； - 默认值是postPaid  > 说明： >  > 当chargingMode为prePaid（即创建包年包月付费的云服务器），且使用SSH秘钥方式登录云服务器时，metadata 中的 op_svc_userid 字段为必选字段。
     */
    public static final class ChargingModeEnum {

        
        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargingModeEnum PREPAID = new ChargingModeEnum("prePaid");
        
        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargingModeEnum POSTPAID = new ChargingModeEnum("postPaid");
        

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("prePaid", PREPAID);
            map.put("postPaid", POSTPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargingModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargingModeEnum(value);
            }
            return result;
        }

        public static ChargingModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChargingModeEnum result = STATIC_FIELDS.get(value);
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regionID")
    
    private String regionID;
    /**
     * 订购周期类型。  取值范围：  - month-月 - year-年  > 说明： >  > chargingMode为prePaid时生效且为必选值。
     */
    public static final class PeriodTypeEnum {

        
        /**
         * Enum MONTH for value: "month"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("month");
        
        /**
         * Enum YEAR for value: "year"
         */
        public static final PeriodTypeEnum YEAR = new PeriodTypeEnum("year");
        

        private static final Map<String, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodTypeEnum> createStaticFields() {
            Map<String, PeriodTypeEnum> map = new HashMap<>();
            map.put("month", MONTH);
            map.put("year", YEAR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeriodTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PeriodTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PeriodTypeEnum(value);
            }
            return result;
        }

        public static PeriodTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PeriodTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PeriodTypeEnum) {
                return this.value.equals(((PeriodTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="periodType")
    
    private PeriodTypeEnum periodType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="periodNum")
    
    private Integer periodNum;
    /**
     * 是否自动续订。  - “true”：自动续订 - “false”：不自动续订  > 说明： >  > chargingMode为prePaid时生效，不传该字段时默认为不自动续订。
     */
    public static final class IsAutoRenewEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final IsAutoRenewEnum TRUE = new IsAutoRenewEnum("true");
        
        /**
         * Enum FALSE for value: "false"
         */
        public static final IsAutoRenewEnum FALSE = new IsAutoRenewEnum("false");
        

        private static final Map<String, IsAutoRenewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsAutoRenewEnum> createStaticFields() {
            Map<String, IsAutoRenewEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsAutoRenewEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoRenewEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            IsAutoRenewEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsAutoRenewEnum(value);
            }
            return result;
        }

        public static IsAutoRenewEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IsAutoRenewEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IsAutoRenewEnum) {
                return this.value.equals(((IsAutoRenewEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isAutoRenew")
    
    private IsAutoRenewEnum isAutoRenew;
    /**
     * 下单订购后，是否自动从客户的账户中支付，而不需要客户手动去进行支付。  - “true”：是（自动支付） - “false”：否（需要客户手动支付）  > 说明： >  > chargingMode为prePaid时生效，不传该字段时默认为客户手动支付。
     */
    public static final class IsAutoPayEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final IsAutoPayEnum TRUE = new IsAutoPayEnum("true");
        
        /**
         * Enum FALSE for value: "false"
         */
        public static final IsAutoPayEnum FALSE = new IsAutoPayEnum("false");
        

        private static final Map<String, IsAutoPayEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsAutoPayEnum> createStaticFields() {
            Map<String, IsAutoPayEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsAutoPayEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoPayEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            IsAutoPayEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsAutoPayEnum(value);
            }
            return result;
        }

        public static IsAutoPayEnum valueOf(String value) {
            if( value == null ){
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
    
    private IsAutoPayEnum isAutoPay;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId = "0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="support_auto_recovery")
    
    private Boolean supportAutoRecovery = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marketType")
    
    private String marketType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spotPrice")
    
    private String spotPrice;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="diskPrior")
    
    private String diskPrior;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spot_duration_hours")
    
    private Integer spotDurationHours;
    /**
     * 竞价实例中断策略，当前支持immediate。  - 当interruption_policy=immediate时表示释放策略为立即释放。 
     */
    public static final class InterruptionPolicyEnum {

        
        /**
         * Enum IMMEDIATE for value: "immediate"
         */
        public static final InterruptionPolicyEnum IMMEDIATE = new InterruptionPolicyEnum("immediate");
        

        private static final Map<String, InterruptionPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InterruptionPolicyEnum> createStaticFields() {
            Map<String, InterruptionPolicyEnum> map = new HashMap<>();
            map.put("immediate", IMMEDIATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InterruptionPolicyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static InterruptionPolicyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            InterruptionPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InterruptionPolicyEnum(value);
            }
            return result;
        }

        public static InterruptionPolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            InterruptionPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof InterruptionPolicyEnum) {
                return this.value.equals(((InterruptionPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interruption_policy")
    
    private InterruptionPolicyEnum interruptionPolicy = InterruptionPolicyEnum.IMMEDIATE;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spot_duration_count")
    
    private Integer spotDurationCount;

    public PrePaidServerExtendParam withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 计费模式。  功能说明：付费方式  取值范围：  - prePaid-预付费，即包年包月； - postPaid-后付费，即按需付费； - 默认值是postPaid  > 说明： >  > 当chargingMode为prePaid（即创建包年包月付费的云服务器），且使用SSH秘钥方式登录云服务器时，metadata 中的 op_svc_userid 字段为必选字段。
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public PrePaidServerExtendParam withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    


    /**
     * 云服务器所在区域ID。  请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)获取。
     * @return regionID
     */
    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public PrePaidServerExtendParam withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * 订购周期类型。  取值范围：  - month-月 - year-年  > 说明： >  > chargingMode为prePaid时生效且为必选值。
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public PrePaidServerExtendParam withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    


    /**
     * 订购周期数。  取值范围：  - periodType=month（周期类型为月）时，取值为[1，9]； - periodType=year（周期类型为年）时，取值为[1，3]；  > 说明： >  > chargingMode为prePaid时生效且为必选值。 >  > periodNum为正整数。
     * minimum: 1
     * maximum: 9
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public PrePaidServerExtendParam withIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    


    /**
     * 是否自动续订。  - “true”：自动续订 - “false”：不自动续订  > 说明： >  > chargingMode为prePaid时生效，不传该字段时默认为不自动续订。
     * @return isAutoRenew
     */
    public IsAutoRenewEnum getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public PrePaidServerExtendParam withIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * 下单订购后，是否自动从客户的账户中支付，而不需要客户手动去进行支付。  - “true”：是（自动支付） - “false”：否（需要客户手动支付）  > 说明： >  > chargingMode为prePaid时生效，不传该字段时默认为客户手动支付。
     * @return isAutoPay
     */
    public IsAutoPayEnum getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public PrePaidServerExtendParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。  > 说明： >  > 关于企业项目ID的获取及企业项目特性的详细信息，请参见《[企业管理服务用户指南](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0126101490.html)》。 >  > 该字段不传（或传为字符串“0”），则将资源绑定给默认企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PrePaidServerExtendParam withSupportAutoRecovery(Boolean supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
        return this;
    }

    


    /**
     * 是否配置弹性云服务器自动恢复的功能。  - “true”：配置该功能 - “false”：不配置该功能  > 说明： >  > 此参数为boolean类型，若传入非boolean类型字符，程序将按照【“false”：不配置该功能】方式处理。 >  > 当marketType为spot时，不支持该功能。
     * @return supportAutoRecovery
     */
    public Boolean getSupportAutoRecovery() {
        return supportAutoRecovery;
    }

    public void setSupportAutoRecovery(Boolean supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
    }

    public PrePaidServerExtendParam withMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }

    


    /**
     * 创建竞价实例时，需指定该参数的值为“spot”。  > 说明： >  > 当chargingMode=postPaid且marketType=spot时，此参数生效。
     * @return marketType
     */
    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public PrePaidServerExtendParam withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    


    /**
     * 用户愿意为竞价实例每小时支付的最高价格。  > 说明： >  > 仅chargingMode=postPaid且marketType=spot时，该参数设置后生效。 >  > 当chargingMode=postPaid且marketType=spot时，如果不传递spotPrice或者传递一个空字符串，默认使用按需购买的价格作为竞价。
     * @return spotPrice
     */
    public String getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    public PrePaidServerExtendParam withDiskPrior(String diskPrior) {
        this.diskPrior = diskPrior;
        return this;
    }

    


    /**
     * 是否支持先创建卷，再创建虚拟机。  “true”：配置该功能 “false”：不配置该功能
     * @return diskPrior
     */
    public String getDiskPrior() {
        return diskPrior;
    }

    public void setDiskPrior(String diskPrior) {
        this.diskPrior = diskPrior;
    }

    public PrePaidServerExtendParam withSpotDurationHours(Integer spotDurationHours) {
        this.spotDurationHours = spotDurationHours;
        return this;
    }

    


    /**
     * 购买的竞价实例时长。  - 仅interruption_policy=immediate 时该字段有效 。 - spot_duration_hours大于0。最大值由预测系统给出可以从flavor的extra_specs的cond:spot_block:operation:longest_duration_hours字段中查询。
     * @return spotDurationHours
     */
    public Integer getSpotDurationHours() {
        return spotDurationHours;
    }

    public void setSpotDurationHours(Integer spotDurationHours) {
        this.spotDurationHours = spotDurationHours;
    }

    public PrePaidServerExtendParam withInterruptionPolicy(InterruptionPolicyEnum interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
        return this;
    }

    


    /**
     * 竞价实例中断策略，当前支持immediate。  - 当interruption_policy=immediate时表示释放策略为立即释放。 
     * @return interruptionPolicy
     */
    public InterruptionPolicyEnum getInterruptionPolicy() {
        return interruptionPolicy;
    }

    public void setInterruptionPolicy(InterruptionPolicyEnum interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
    }

    public PrePaidServerExtendParam withSpotDurationCount(Integer spotDurationCount) {
        this.spotDurationCount = spotDurationCount;
        return this;
    }

    


    /**
     * 表示购买的“竞价实例时长”的个数。  - 仅spot_duration_hours>0 时该字段有效。 - spot_duration_hours小于6时，spot_duration_count值必须为1。 - spot_duration_hours等于6时，spot_duration_count大于等于1。  spot_duration_count的最大值由预测系统给出可以从flavor的extra_specs的cond:spot_block:operation:longest_duration_count字段中查询。  
     * @return spotDurationCount
     */
    public Integer getSpotDurationCount() {
        return spotDurationCount;
    }

    public void setSpotDurationCount(Integer spotDurationCount) {
        this.spotDurationCount = spotDurationCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrePaidServerExtendParam prePaidServerExtendParam = (PrePaidServerExtendParam) o;
        return Objects.equals(this.chargingMode, prePaidServerExtendParam.chargingMode) &&
            Objects.equals(this.regionID, prePaidServerExtendParam.regionID) &&
            Objects.equals(this.periodType, prePaidServerExtendParam.periodType) &&
            Objects.equals(this.periodNum, prePaidServerExtendParam.periodNum) &&
            Objects.equals(this.isAutoRenew, prePaidServerExtendParam.isAutoRenew) &&
            Objects.equals(this.isAutoPay, prePaidServerExtendParam.isAutoPay) &&
            Objects.equals(this.enterpriseProjectId, prePaidServerExtendParam.enterpriseProjectId) &&
            Objects.equals(this.supportAutoRecovery, prePaidServerExtendParam.supportAutoRecovery) &&
            Objects.equals(this.marketType, prePaidServerExtendParam.marketType) &&
            Objects.equals(this.spotPrice, prePaidServerExtendParam.spotPrice) &&
            Objects.equals(this.diskPrior, prePaidServerExtendParam.diskPrior) &&
            Objects.equals(this.spotDurationHours, prePaidServerExtendParam.spotDurationHours) &&
            Objects.equals(this.interruptionPolicy, prePaidServerExtendParam.interruptionPolicy) &&
            Objects.equals(this.spotDurationCount, prePaidServerExtendParam.spotDurationCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chargingMode, regionID, periodType, periodNum, isAutoRenew, isAutoPay, enterpriseProjectId, supportAutoRecovery, marketType, spotPrice, diskPrior, spotDurationHours, interruptionPolicy, spotDurationCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidServerExtendParam {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    regionID: ").append(toIndentedString(regionID)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    supportAutoRecovery: ").append(toIndentedString(supportAutoRecovery)).append("\n");
        sb.append("    marketType: ").append(toIndentedString(marketType)).append("\n");
        sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
        sb.append("    diskPrior: ").append(toIndentedString(diskPrior)).append("\n");
        sb.append("    spotDurationHours: ").append(toIndentedString(spotDurationHours)).append("\n");
        sb.append("    interruptionPolicy: ").append(toIndentedString(interruptionPolicy)).append("\n");
        sb.append("    spotDurationCount: ").append(toIndentedString(spotDurationCount)).append("\n");
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

