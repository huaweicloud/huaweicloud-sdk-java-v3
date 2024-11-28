package com.huaweicloud.sdk.codeartsinspector.v2.model;

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
 * CreateCbcOrderRequestBody
 */
public class CreateCbcOrderRequestBody {

    /**
     * 计费模式： 0：一次性计费（默认值，对应包年包月） 10：RI
     */
    public static final class ChargingModeEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ChargingModeEnum NUMBER_1 = new ChargingModeEnum(1);

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final ChargingModeEnum NUMBER_10 = new ChargingModeEnum(10);

        private static final Map<Integer, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ChargingModeEnum> createStaticFields() {
            Map<Integer, ChargingModeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(10, NUMBER_10);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ChargingModeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargingModeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(Integer value) {
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
    @JsonProperty(value = "charging_mode")

    private ChargingModeEnum chargingMode;

    /**
     * 0：不自动续订 1：自动续订
     */
    public static final class IsAutoRenewEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final IsAutoRenewEnum NUMBER_0 = new IsAutoRenewEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IsAutoRenewEnum NUMBER_1 = new IsAutoRenewEnum(1);

        private static final Map<Integer, IsAutoRenewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IsAutoRenewEnum> createStaticFields() {
            Map<Integer, IsAutoRenewEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IsAutoRenewEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoRenewEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsAutoRenewEnum(value));
        }

        public static IsAutoRenewEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsAutoRenewEnum) {
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
    @JsonProperty(value = "is_auto_renew")

    private IsAutoRenewEnum isAutoRenew;

    /**
     * 该请求参数为预留参数，当前不支持自动支付，使用接口时该参数请使用0 0：不自动支付 1：自动支付
     */
    public static final class IsAutoPayEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final IsAutoPayEnum NUMBER_0 = new IsAutoPayEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IsAutoPayEnum NUMBER_1 = new IsAutoPayEnum(1);

        private static final Map<Integer, IsAutoPayEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IsAutoPayEnum> createStaticFields() {
            Map<Integer, IsAutoPayEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IsAutoPayEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoPayEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsAutoPayEnum(value));
        }

        public static IsAutoPayEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_infos")

    private List<ProductInfo> productInfos = null;

    public CreateCbcOrderRequestBody withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式： 0：一次性计费（默认值，对应包年包月） 10：RI
     * minimum: 0
     * maximum: 10
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public CreateCbcOrderRequestBody withIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 0：不自动续订 1：自动续订
     * minimum: 0
     * maximum: 1
     * @return isAutoRenew
     */
    public IsAutoRenewEnum getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public CreateCbcOrderRequestBody withIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 该请求参数为预留参数，当前不支持自动支付，使用接口时该参数请使用0 0：不自动支付 1：自动支付
     * minimum: 0
     * maximum: 1
     * @return isAutoPay
     */
    public IsAutoPayEnum getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public CreateCbcOrderRequestBody withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * period_num
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public CreateCbcOrderRequestBody withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型： 2：月； 3：年； 4：包小时（仅限带宽加油包购买场景使用） 5：绝对时间；（追加附属资源场景使用，比如主机上追加云硬盘） 6：一次性（chargingMode=1 一次性计费场景使用）
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public CreateCbcOrderRequestBody withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 用户购买的云服务的主云服务类型
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public CreateCbcOrderRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * project_id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateCbcOrderRequestBody withPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    /**
     * promotion_info
     * @return promotionInfo
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public CreateCbcOrderRequestBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Region标识，填region编码如\"cn-north-1\"，对于global服务，此处固定填写虚拟的Global regionCode(global-cbc-1)
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreateCbcOrderRequestBody withProductInfos(List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
        return this;
    }

    public CreateCbcOrderRequestBody addProductInfosItem(ProductInfo productInfosItem) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        this.productInfos.add(productInfosItem);
        return this;
    }

    public CreateCbcOrderRequestBody withProductInfos(Consumer<List<ProductInfo>> productInfosSetter) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        productInfosSetter.accept(this.productInfos);
        return this;
    }

    /**
     * product_infos
     * @return productInfos
     */
    public List<ProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCbcOrderRequestBody that = (CreateCbcOrderRequestBody) obj;
        return Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew) && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.promotionInfo, that.promotionInfo)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.productInfos, that.productInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode,
            isAutoRenew,
            isAutoPay,
            periodNum,
            periodType,
            cloudServiceType,
            projectId,
            promotionInfo,
            regionId,
            productInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCbcOrderRequestBody {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    productInfos: ").append(toIndentedString(productInfos)).append("\n");
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
