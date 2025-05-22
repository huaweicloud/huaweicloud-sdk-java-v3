package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 包周期选项，pay_type&#x3D;prepaid或charge_mode为prepaid时填写。
 */
public class PrepaidChangeChargeModeOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_publicip")

    private Boolean includePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_ids")

    private List<String> publicipIds = null;

    /**
     * 订购周期类型，当前支持包月和包年： month：月（默认）； year：年；
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
    @JsonProperty(value = "period_type")

    private PeriodTypeEnum periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_renew")

    private Boolean autoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_pay")

    private Boolean autoPay;

    public PrepaidChangeChargeModeOption withIncludePublicip(Boolean includePublicip) {
        this.includePublicip = includePublicip;
        return this;
    }

    /**
     * 是否连同独享按带宽计费的弹性公网IP一起转包周期。 1. 弹性公网IP转包周期之后可以单独解绑，绑定到其他实例，删除 2. 只有独享且按带宽计费的弹性公网IP才被允许转包周期 默认值：false
     * @return includePublicip
     */
    public Boolean getIncludePublicip() {
        return includePublicip;
    }

    public void setIncludePublicip(Boolean includePublicip) {
        this.includePublicip = includePublicip;
    }

    public PrepaidChangeChargeModeOption withPublicipIds(List<String> publicipIds) {
        this.publicipIds = publicipIds;
        return this;
    }

    public PrepaidChangeChargeModeOption addPublicipIdsItem(String publicipIdsItem) {
        if (this.publicipIds == null) {
            this.publicipIds = new ArrayList<>();
        }
        this.publicipIds.add(publicipIdsItem);
        return this;
    }

    public PrepaidChangeChargeModeOption withPublicipIds(Consumer<List<String>> publicipIdsSetter) {
        if (this.publicipIds == null) {
            this.publicipIds = new ArrayList<>();
        }
        publicipIdsSetter.accept(this.publicipIds);
        return this;
    }

    /**
     * 需要一起按需转包的弹性公网IP的ID。 若include_publicip为false，不能指定该字段。 若include_publicip为true，该字段为未指定时，表示所有绑定的v4 eip都需要一起转包周期。 若include_publicip为true，该字段列表非空，表示只将指定的v4 eip转包。 若include_publicip为true，该字段列表为空，表示不指定任一eip转包，与include_publicip为false等效。
     * @return publicipIds
     */
    public List<String> getPublicipIds() {
        return publicipIds;
    }

    public void setPublicipIds(List<String> publicipIds) {
        this.publicipIds = publicipIds;
    }

    public PrepaidChangeChargeModeOption withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型，当前支持包月和包年： month：月（默认）； year：年；
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public PrepaidChangeChargeModeOption withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数（默认1），取值会随运营策略变化。 period_type为month时，为[1,9]， period_type为year时，为[1,3]
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

    public PrepaidChangeChargeModeOption withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * 是否自动续订； true：自动续订 false：不自动续订（默认）
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    public PrepaidChangeChargeModeOption withAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }

    /**
     * 下单订购后，是否自动从客户的账户中支付； true：自动支付； false：不自动支付（默认）。 自动支付时，只能使用账户的现金支付；如果要使用代金券，请选择不自动支付，然后在用户费用中心，选择代金券支付。
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return autoPay;
    }

    public void setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrepaidChangeChargeModeOption that = (PrepaidChangeChargeModeOption) obj;
        return Objects.equals(this.includePublicip, that.includePublicip)
            && Objects.equals(this.publicipIds, that.publicipIds) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.autoRenew, that.autoRenew)
            && Objects.equals(this.autoPay, that.autoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includePublicip, publicipIds, periodType, periodNum, autoRenew, autoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrepaidChangeChargeModeOption {\n");
        sb.append("    includePublicip: ").append(toIndentedString(includePublicip)).append("\n");
        sb.append("    publicipIds: ").append(toIndentedString(publicipIds)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
        sb.append("    autoPay: ").append(toIndentedString(autoPay)).append("\n");
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
