package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 带宽信息 */
public class CreateLoadBalancerBandwidthOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /** 计费模式。 [取值范围：bandwidth表示按带宽计费，traffic表示按流量计费。](tag:hc,hws,hk,ocb,tlf,ctc,hcso,sbc,g42,tm,cmcc,hk-g42)
     * [当前仅支持traffic按流量计费](tag:otc,otc_test,dt,dt_test) 使用说明： - 当id字段为null时，charge_mode是必须的。 */
    public static final class ChargeModeEnum {

        /** Enum BANDWIDTH for value: "bandwidth" */
        public static final ChargeModeEnum BANDWIDTH = new ChargeModeEnum("bandwidth");

        /** Enum TRAFFIC for value: "traffic" */
        public static final ChargeModeEnum TRAFFIC = new ChargeModeEnum("traffic");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("bandwidth", BANDWIDTH);
            map.put("traffic", TRAFFIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModeEnum(String value) {
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
        public static ChargeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargeModeEnum(value);
            }
            return result;
        }

        public static ChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChargeModeEnum chargeMode;

    /** 带宽类型。 取值： - PER：独享带宽。 - WHOLE：共享带宽。 使用说明： - 当id字段为null时，share_type是必须的。当id不为null时，该字段被忽略。 - 该字段为WHOLE时,必须指定带宽ID。
     * - IPv6的EIP不支持WHOLE类型带宽。 */
    public static final class ShareTypeEnum {

        /** Enum PER for value: "PER" */
        public static final ShareTypeEnum PER = new ShareTypeEnum("PER");

        /** Enum WHOLE for value: "WHOLE" */
        public static final ShareTypeEnum WHOLE = new ShareTypeEnum("WHOLE");

        private static final Map<String, ShareTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ShareTypeEnum> createStaticFields() {
            Map<String, ShareTypeEnum> map = new HashMap<>();
            map.put("PER", PER);
            map.put("WHOLE", WHOLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ShareTypeEnum(String value) {
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
        public static ShareTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ShareTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ShareTypeEnum(value);
            }
            return result;
        }

        public static ShareTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ShareTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ShareTypeEnum) {
                return this.value.equals(((ShareTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_type")

    private ShareTypeEnum shareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public CreateLoadBalancerBandwidthOption withName(String name) {
        this.name = name;
        return this;
    }

    /** 带宽名称。取值：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点） 使用说明： - 如果share_type是PER，该字段是必选。 - 如果bandwidth对象的id有值，该字段被忽略。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateLoadBalancerBandwidthOption withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 带宽大小 取值范围:默认1Mbit/s~2000Mbit/s(具体范围以各区域配置为准,请参见控制台对应页面显示)。 注意：调整带宽时的最小单位会根据带宽范围不同存在差异。
     * 小于等于300Mbit/s:默认最小单位为1Mbit/s。 300Mbit/s~1000Mbit/s:默认最小单位为50Mbit/s。 大于1000Mbit/s:默认最小单位为500Mbit/s。 使用说明： -
     * 当id字段为null时，size是必须的。 minimum: 0 maximum: 99999
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public CreateLoadBalancerBandwidthOption withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /** 计费模式。 [取值范围：bandwidth表示按带宽计费，traffic表示按流量计费。](tag:hc,hws,hk,ocb,tlf,ctc,hcso,sbc,g42,tm,cmcc,hk-g42)
     * [当前仅支持traffic按流量计费](tag:otc,otc_test,dt,dt_test) 使用说明： - 当id字段为null时，charge_mode是必须的。
     * 
     * @return chargeMode */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public CreateLoadBalancerBandwidthOption withShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
        return this;
    }

    /** 带宽类型。 取值： - PER：独享带宽。 - WHOLE：共享带宽。 使用说明： - 当id字段为null时，share_type是必须的。当id不为null时，该字段被忽略。 - 该字段为WHOLE时,必须指定带宽ID。
     * - IPv6的EIP不支持WHOLE类型带宽。
     * 
     * @return shareType */
    public ShareTypeEnum getShareType() {
        return shareType;
    }

    public void setShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
    }

    public CreateLoadBalancerBandwidthOption withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /** 预留资源账单信息，默认为空表示按需计费， 非空为包周期。admin权限才能更新此字段
     * 
     * @return billingInfo */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public CreateLoadBalancerBandwidthOption withId(String id) {
        this.id = id;
        return this;
    }

    /** 功能说明：使用已有的共享带宽创建IP 取值范围：共享带宽ID 使用说明： - WHOLE类型的带宽ID； - 在预付费的情况下，不填该值。该字段取空字符串时，会被忽略。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLoadBalancerBandwidthOption createLoadBalancerBandwidthOption = (CreateLoadBalancerBandwidthOption) o;
        return Objects.equals(this.name, createLoadBalancerBandwidthOption.name)
            && Objects.equals(this.size, createLoadBalancerBandwidthOption.size)
            && Objects.equals(this.chargeMode, createLoadBalancerBandwidthOption.chargeMode)
            && Objects.equals(this.shareType, createLoadBalancerBandwidthOption.shareType)
            && Objects.equals(this.billingInfo, createLoadBalancerBandwidthOption.billingInfo)
            && Objects.equals(this.id, createLoadBalancerBandwidthOption.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, chargeMode, shareType, billingInfo, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoadBalancerBandwidthOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
