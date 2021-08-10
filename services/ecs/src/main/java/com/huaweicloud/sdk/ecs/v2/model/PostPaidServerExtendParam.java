package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 
 */
public class PostPaidServerExtendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargingMode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionID")

    private String regionID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_auto_recovery")

    private Boolean supportAutoRecovery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marketType")

    private String marketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spotPrice")

    private String spotPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskPrior")

    private String diskPrior;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spot_duration_hours")

    private Integer spotDurationHours;

    /** 竞价实例中断策略，当前支持immediate。 - 当interruption_policy=immediate时表示释放策略为立即释放。 */
    public static final class InterruptionPolicyEnum {

        /** Enum IMMEDIATE for value: "immediate" */
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static InterruptionPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InterruptionPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InterruptionPolicyEnum(value);
            }
            return result;
        }

        public static InterruptionPolicyEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof InterruptionPolicyEnum) {
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
    @JsonProperty(value = "interruption_policy")

    private InterruptionPolicyEnum interruptionPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spot_duration_count")

    private Integer spotDurationCount;

    public PostPaidServerExtendParam withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /** 计费模式： - 0：按需计费。 minimum: 0 maximum: 0
     * 
     * @return chargingMode */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public PostPaidServerExtendParam withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /** 云服务器所在区域ID。 请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)获取。
     * 
     * @return regionID */
    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public PostPaidServerExtendParam withSupportAutoRecovery(Boolean supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
        return this;
    }

    /** 是否配置弹性云服务器自动恢复的功能。 - “true”：配置该功能 - “false”：不配置该功能 > 说明： > >
     * 此参数为boolean类型，若传入非boolean类型字符，程序将按照【“false”：不配置该功能】方式处理。 > > 当marketType为spot时，不支持该功能。
     * 
     * @return supportAutoRecovery */
    public Boolean getSupportAutoRecovery() {
        return supportAutoRecovery;
    }

    public void setSupportAutoRecovery(Boolean supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
    }

    public PostPaidServerExtendParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID。 > 说明： > >
     * 关于企业项目ID的获取及企业项目特性的详细信息，请参见《[企业管理服务用户指南](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0126101490.html)》。
     * > > 该字段不传（或传为字符串“0”），则将资源绑定给默认企业项目。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PostPaidServerExtendParam withMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }

    /** 创建竞价实例时，需指定该参数的值为“spot”。 > 说明： > > 当chargingMode=0时且marketType=spot时此参数生效。
     * 
     * @return marketType */
    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public PostPaidServerExtendParam withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /** 用户愿意为竞价实例每小时支付的最高价格。 > 说明： > > 仅chargingMode=0且marketType=spot时，该参数设置后生效。 > >
     * 当chargingMode=0且marketType=spot时，如果不传递spotPrice，默认使用按需购买的价格作为竞价。
     * 
     * @return spotPrice */
    public String getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    public PostPaidServerExtendParam withDiskPrior(String diskPrior) {
        this.diskPrior = diskPrior;
        return this;
    }

    /** 是否支持先创建卷，再创建虚拟机。 “true”：配置该功能 “false”：不配置该功能
     * 
     * @return diskPrior */
    public String getDiskPrior() {
        return diskPrior;
    }

    public void setDiskPrior(String diskPrior) {
        this.diskPrior = diskPrior;
    }

    public PostPaidServerExtendParam withSpotDurationHours(Integer spotDurationHours) {
        this.spotDurationHours = spotDurationHours;
        return this;
    }

    /** 购买的竞价实例时长。 - 仅interruption_policy=immediate 时该字段有效 。 -
     * pot_duration_hours大于0。最大值由预测系统给出可以从flavor的extra_specs的cond:spot_block:operation:longest_duration_hours字段中查询。
     * 
     * @return spotDurationHours */
    public Integer getSpotDurationHours() {
        return spotDurationHours;
    }

    public void setSpotDurationHours(Integer spotDurationHours) {
        this.spotDurationHours = spotDurationHours;
    }

    public PostPaidServerExtendParam withInterruptionPolicy(InterruptionPolicyEnum interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
        return this;
    }

    /** 竞价实例中断策略，当前支持immediate。 - 当interruption_policy=immediate时表示释放策略为立即释放。
     * 
     * @return interruptionPolicy */
    public InterruptionPolicyEnum getInterruptionPolicy() {
        return interruptionPolicy;
    }

    public void setInterruptionPolicy(InterruptionPolicyEnum interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
    }

    public PostPaidServerExtendParam withSpotDurationCount(Integer spotDurationCount) {
        this.spotDurationCount = spotDurationCount;
        return this;
    }

    /** 表示购买的“竞价实例时长”的个数。 - 仅spot_duration_hours>0 时该字段有效。 - spot_duration_hours小于6时，spot_duration_count值必须为1。 -
     * spot_duration_hours等于6时，spot_duration_count大于等于1。
     * spot_duration_count的最大值由预测系统给出可以从flavor的extra_specs的cond:spot_block:operation:longest_duration_count字段中查询。
     * 
     * @return spotDurationCount */
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
        PostPaidServerExtendParam postPaidServerExtendParam = (PostPaidServerExtendParam) o;
        return Objects.equals(this.chargingMode, postPaidServerExtendParam.chargingMode)
            && Objects.equals(this.regionID, postPaidServerExtendParam.regionID)
            && Objects.equals(this.supportAutoRecovery, postPaidServerExtendParam.supportAutoRecovery)
            && Objects.equals(this.enterpriseProjectId, postPaidServerExtendParam.enterpriseProjectId)
            && Objects.equals(this.marketType, postPaidServerExtendParam.marketType)
            && Objects.equals(this.spotPrice, postPaidServerExtendParam.spotPrice)
            && Objects.equals(this.diskPrior, postPaidServerExtendParam.diskPrior)
            && Objects.equals(this.spotDurationHours, postPaidServerExtendParam.spotDurationHours)
            && Objects.equals(this.interruptionPolicy, postPaidServerExtendParam.interruptionPolicy)
            && Objects.equals(this.spotDurationCount, postPaidServerExtendParam.spotDurationCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode,
            regionID,
            supportAutoRecovery,
            enterpriseProjectId,
            marketType,
            spotPrice,
            diskPrior,
            spotDurationHours,
            interruptionPolicy,
            spotDurationCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerExtendParam {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    regionID: ").append(toIndentedString(regionID)).append("\n");
        sb.append("    supportAutoRecovery: ").append(toIndentedString(supportAutoRecovery)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    marketType: ").append(toIndentedString(marketType)).append("\n");
        sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
        sb.append("    diskPrior: ").append(toIndentedString(diskPrior)).append("\n");
        sb.append("    spotDurationHours: ").append(toIndentedString(spotDurationHours)).append("\n");
        sb.append("    interruptionPolicy: ").append(toIndentedString(interruptionPolicy)).append("\n");
        sb.append("    spotDurationCount: ").append(toIndentedString(spotDurationCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
