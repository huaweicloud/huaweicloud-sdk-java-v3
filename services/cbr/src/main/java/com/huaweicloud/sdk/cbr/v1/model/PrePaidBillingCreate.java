package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建参数
 */
public class PrePaidBillingCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private String cloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistent_level")

    private String consistentLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private String protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    /**
     * 功能说明：订购周期单位。charging_mode参数为pre_paid时period_type参数会生效，并且period_type参数为必选。默认取值不涉及。 取值范围： - month：月 - year：年
     */
    public static final class PeriodTypeEnum {

        /**
         * Enum YEAR for value: "year"
         */
        public static final PeriodTypeEnum YEAR = new PeriodTypeEnum("year");

        /**
         * Enum MONTH for value: "month"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("month");

        private static final Map<String, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodTypeEnum> createStaticFields() {
            Map<String, PeriodTypeEnum> map = new HashMap<>();
            map.put("year", YEAR);
            map.put("month", MONTH);
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
    @JsonProperty(value = "is_auto_renew")

    private Boolean isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console_url")

    private String consoleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_az")

    private Boolean isMultiAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_double_az")

    private Boolean isDoubleAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "purchase_mode")

    private String purchaseMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    public PrePaidBillingCreate withCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * 云类型，默认为public，支持类型如下。 [public：公有云; hybrid: 混合云](tag:hws,hws_hk,ctc) [public：公有云](tag:dt,ocb,tlf,sbc,g42,tm,hk_g42)
     * @return cloudType
     */
    public String getCloudType() {
        return cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public PrePaidBillingCreate withConsistentLevel(String consistentLevel) {
        this.consistentLevel = consistentLevel;
        return this;
    }

    /**
     * [功能描述：存储库规格。取值范围：app_consistent: 应用一致性，crash_consistent: 崩溃一致性。默认取值不涉及。](tag:hws,hws_hk,fcs_vm,ctc,tm,g42,hk_g42) [功能描述：存储库规格。取值范围：crash_consistent: 崩溃一致性。默认取值不涉及。](tag:dt,ocb,tlf,sbc,hcso_dt)
     * @return consistentLevel
     */
    public String getConsistentLevel() {
        return consistentLevel;
    }

    public void setConsistentLevel(String consistentLevel) {
        this.consistentLevel = consistentLevel;
    }

    public PrePaidBillingCreate withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * [对象类型，支持\"server\", \"disk\", \"turbo\", \"workspace\", \"vmware\", \"rds\"和\"file\"共七种。server：云服务器，disk：云硬盘，turbo：文件系统，workspace：云桌面，vmware：VMware，rds：关系型数据库，file：文件。默认取值不涉及。](tag:hws,hws_hk) [对象类型，支持\"server\", \"disk\"和\"turbo\"共三种。server：云服务器，disk：云硬盘，turbo：文件系统。默认取值不涉及。](tag:ctc,fcs_vm,ocb,hk_g42,sbc,hws_ocb) [对象类型，支持\"server\"和\"disk\"共两种。server：云服务器，disk：云硬盘。默认取值不涉及。](tag:dt,tlf,tm,cmcc,hcso_dt) [对象类型，支持\"server\", \"disk\", \"turbo\"和\"workspace\"共四种。server：云服务器，disk：云硬盘，turbo：文件系统，workspace：云桌面。默认取值不涉及。](tag:g42)
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public PrePaidBillingCreate withProtectType(String protectType) {
        this.protectType = protectType;
        return this;
    }

    /**
     * 保护类型，默认取值不涉及。取值范围如下： [backup：备份，replication：复制](tag:hws,hws_hk,ocb,hws_ocb) [backup：备份](tag:tlf,tm,cmcc,fcs_vm,g42,dt,hk_g42,sbc,hcso_dt)
     * @return protectType
     */
    public String getProtectType() {
        return protectType;
    }

    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    public PrePaidBillingCreate withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 资源容量大小，单位GB，取值范围：10-10485760，默认取值不涉及。
     * minimum: 10
     * maximum: 10485760
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PrePaidBillingCreate withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式，仅支持填写pre_paid：代表包年/包月模式
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public PrePaidBillingCreate withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 功能说明：订购周期单位。charging_mode参数为pre_paid时period_type参数会生效，并且period_type参数为必选。默认取值不涉及。 取值范围： - month：月 - year：年
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public PrePaidBillingCreate withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 功能说明：订购周期数，charging_mode为pre_paid时period_num参数会生效，并且period_num参数为为必选。默认取值不涉及。 取值范围：[1-9]
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public PrePaidBillingCreate withIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 功能说明：到期后是否自动续期，默认为false 取值范围： - true：到期后自动续期 - false：到期后不自动续期
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public PrePaidBillingCreate withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 功能说明：是否自动付费，默认为false 取值范围： - true：下单后自动付费 - false：下单后不自动付费
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public PrePaidBillingCreate withConsoleUrl(String consoleUrl) {
        this.consoleUrl = consoleUrl;
        return this;
    }

    /**
     * 云服务console_url。 订购订单支付完成后，客户可以通过此URL跳转到云服务Console页面查看信息。（仅手动支付时涉及）。默认取值不涉及。
     * @return consoleUrl
     */
    public String getConsoleUrl() {
        return consoleUrl;
    }

    public void setConsoleUrl(String consoleUrl) {
        this.consoleUrl = consoleUrl;
    }

    public PrePaidBillingCreate withIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
        return this;
    }

    /**
     * 功能说明：存储库是否具有多AZ属性，即底层备份是否为多AZ备份，默认为false 取值范围： - true：存储库具有多AZ属性 - false：存储库不具有多AZ属性
     * @return isMultiAz
     */
    public Boolean getIsMultiAz() {
        return isMultiAz;
    }

    public void setIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
    }

    public PrePaidBillingCreate withIsDoubleAz(Boolean isDoubleAz) {
        this.isDoubleAz = isDoubleAz;
        return this;
    }

    /**
     * 功能说明：存储库是否具有融合桶属性，即底层备份是否为融合桶备份，默认为false 取值范围： - true：存储库具有融合桶属性 - false：存储库不具有融合桶属性
     * @return isDoubleAz
     */
    public Boolean getIsDoubleAz() {
        return isDoubleAz;
    }

    public void setIsDoubleAz(Boolean isDoubleAz) {
        this.isDoubleAz = isDoubleAz;
    }

    public PrePaidBillingCreate withPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    /**
     * 促销信息，包周期时可选参数，取值范围不涉及，默认取值不涉及。
     * @return promotionInfo
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public PrePaidBillingCreate withPurchaseMode(String purchaseMode) {
        this.purchaseMode = purchaseMode;
        return this;
    }

    /**
     * 购买模式，包周期时可选参数，取值范围不涉及，默认取值不涉及。
     * @return purchaseMode
     */
    public String getPurchaseMode() {
        return purchaseMode;
    }

    public void setPurchaseMode(String purchaseMode) {
        this.purchaseMode = purchaseMode;
    }

    public PrePaidBillingCreate withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单 ID，包周期时可选参数，取值范围不涉及，默认取值不涉及。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrePaidBillingCreate that = (PrePaidBillingCreate) obj;
        return Objects.equals(this.cloudType, that.cloudType)
            && Objects.equals(this.consistentLevel, that.consistentLevel)
            && Objects.equals(this.objectType, that.objectType) && Objects.equals(this.protectType, that.protectType)
            && Objects.equals(this.size, that.size) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew) && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.consoleUrl, that.consoleUrl) && Objects.equals(this.isMultiAz, that.isMultiAz)
            && Objects.equals(this.isDoubleAz, that.isDoubleAz)
            && Objects.equals(this.promotionInfo, that.promotionInfo)
            && Objects.equals(this.purchaseMode, that.purchaseMode) && Objects.equals(this.orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudType,
            consistentLevel,
            objectType,
            protectType,
            size,
            chargingMode,
            periodType,
            periodNum,
            isAutoRenew,
            isAutoPay,
            consoleUrl,
            isMultiAz,
            isDoubleAz,
            promotionInfo,
            purchaseMode,
            orderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidBillingCreate {\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    consistentLevel: ").append(toIndentedString(consistentLevel)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    consoleUrl: ").append(toIndentedString(consoleUrl)).append("\n");
        sb.append("    isMultiAz: ").append(toIndentedString(isMultiAz)).append("\n");
        sb.append("    isDoubleAz: ").append(toIndentedString(isDoubleAz)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
        sb.append("    purchaseMode: ").append(toIndentedString(purchaseMode)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
