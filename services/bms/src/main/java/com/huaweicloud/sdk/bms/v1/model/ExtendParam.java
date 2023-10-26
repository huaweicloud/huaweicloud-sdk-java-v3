package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建裸金属服务器的extendparam字段数据结构说明
 */
public class ExtendParam {

    /**
     * 计费模式。取值范围：prePaid：预付费，即包年包月; postPaid-后付费，即按需付费。默认值是prePaid。
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
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
    @JsonProperty(value = "chargingMode")

    private ChargingModeEnum chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionID")

    private String regionID;

    /**
     * 订购周期类型。取值范围：month：月year：年 说明：chargingMode为prePaid时生效，且为必选值。
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodTypeEnum(value));
        }

        public static PeriodTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodTypeEnum) {
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
    @JsonProperty(value = "periodType")

    private PeriodTypeEnum periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodNum")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRenew")

    private String isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    private String isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ExtendParam withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式。取值范围：prePaid：预付费，即包年包月; postPaid-后付费，即按需付费。默认值是prePaid。
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ExtendParam withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * 裸金属服务器所在区域ID。请参考地区和终端节点获取。
     * @return regionID
     */
    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public ExtendParam withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型。取值范围：month：月year：年 说明：chargingMode为prePaid时生效，且为必选值。
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public ExtendParam withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数。取值范围：periodType=month（周期类型为月）时，取值为[1-9]。periodType=year（周期类型为年）时，取值为1。 说明：chargingMode为prePaid时生效，且为必选值。
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public ExtendParam withIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订。true：自动续订false：不自动续订 说明：chargingMode为prePaid时生效，不指定该参数或者该参数值为空时默认为不自动续订。
     * @return isAutoRenew
     */
    public String getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public ExtendParam withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 下单订购后，是否自动从客户的帐户中支付，而不需要客户手动去支付。true：是（自动支付）false：否（需要客户手动支付） 说明：chargingMode为prePaid时生效，不指定该参数或者该参数值为空时默认为客户手动支付。
     * @return isAutoPay
     */
    public String getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public ExtendParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。该字段不传（或传为字符串“0”），则将资源绑定给默认企业项目。 说明：关于企业项目ID的获取及企业项目特性的详细信息，请参见《企业管理API参考》。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtendParam that = (ExtendParam) obj;
        return Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.regionID, that.regionID)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew) && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode, regionID, periodType, periodNum, isAutoRenew, isAutoPay, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendParam {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    regionID: ").append(toIndentedString(regionID)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
