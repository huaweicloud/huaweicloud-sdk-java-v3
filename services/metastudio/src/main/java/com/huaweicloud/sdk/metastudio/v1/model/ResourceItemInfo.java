package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源使用信息
 */
public class ResourceItemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bound_asset")

    private BoundAssetInfo boundAsset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_expire_time")

    private String resourceExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    /**
     * 业务类型。 * VOICE_CLONE：声音制作 * SYNTHETICS_SOUND：声音合成 * ASSET_MANAGER：资产管理 * MODELING_2D：形象制作 * LIVE_2D：分身数字人视频直播 * VIDEO_2D：分身数字人视频制作 * CHAT_2D：分身数字人智能交互 * BUSINESS_CARD_2D：分身数字人名片 * PICTURE_2D：照片数字人视频 * MODELING_3D：3D照片建模 * VDS_3D：3D视觉驱动 * TTSA_3D：3D语音驱动 * FLEXUS_2D：flexus版本资源
     */
    public static final class BusinessTypeEnum {

        /**
         * Enum VOICE_CLONE for value: "VOICE_CLONE"
         */
        public static final BusinessTypeEnum VOICE_CLONE = new BusinessTypeEnum("VOICE_CLONE");

        /**
         * Enum SYNTHETICS_SOUND for value: "SYNTHETICS_SOUND"
         */
        public static final BusinessTypeEnum SYNTHETICS_SOUND = new BusinessTypeEnum("SYNTHETICS_SOUND");

        /**
         * Enum ASSET_MANAGER for value: "ASSET_MANAGER"
         */
        public static final BusinessTypeEnum ASSET_MANAGER = new BusinessTypeEnum("ASSET_MANAGER");

        /**
         * Enum MODELING_2D for value: "MODELING_2D"
         */
        public static final BusinessTypeEnum MODELING_2D = new BusinessTypeEnum("MODELING_2D");

        /**
         * Enum LIVE_2D for value: "LIVE_2D"
         */
        public static final BusinessTypeEnum LIVE_2D = new BusinessTypeEnum("LIVE_2D");

        /**
         * Enum VIDEO_2D for value: "VIDEO_2D"
         */
        public static final BusinessTypeEnum VIDEO_2D = new BusinessTypeEnum("VIDEO_2D");

        /**
         * Enum CHAT_2D for value: "CHAT_2D"
         */
        public static final BusinessTypeEnum CHAT_2D = new BusinessTypeEnum("CHAT_2D");

        /**
         * Enum BUSINESS_CARD_2D for value: "BUSINESS_CARD_2D"
         */
        public static final BusinessTypeEnum BUSINESS_CARD_2D = new BusinessTypeEnum("BUSINESS_CARD_2D");

        /**
         * Enum PICTURE_2D for value: "PICTURE_2D"
         */
        public static final BusinessTypeEnum PICTURE_2D = new BusinessTypeEnum("PICTURE_2D");

        /**
         * Enum MODELING_3D for value: "MODELING_3D"
         */
        public static final BusinessTypeEnum MODELING_3D = new BusinessTypeEnum("MODELING_3D");

        /**
         * Enum VDS_3D for value: "VDS_3D"
         */
        public static final BusinessTypeEnum VDS_3D = new BusinessTypeEnum("VDS_3D");

        /**
         * Enum TTSA_3D for value: "TTSA_3D"
         */
        public static final BusinessTypeEnum TTSA_3D = new BusinessTypeEnum("TTSA_3D");

        /**
         * Enum FLEXUS_2D for value: "FLEXUS_2D"
         */
        public static final BusinessTypeEnum FLEXUS_2D = new BusinessTypeEnum("FLEXUS_2D");

        private static final Map<String, BusinessTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BusinessTypeEnum> createStaticFields() {
            Map<String, BusinessTypeEnum> map = new HashMap<>();
            map.put("VOICE_CLONE", VOICE_CLONE);
            map.put("SYNTHETICS_SOUND", SYNTHETICS_SOUND);
            map.put("ASSET_MANAGER", ASSET_MANAGER);
            map.put("MODELING_2D", MODELING_2D);
            map.put("LIVE_2D", LIVE_2D);
            map.put("VIDEO_2D", VIDEO_2D);
            map.put("CHAT_2D", CHAT_2D);
            map.put("BUSINESS_CARD_2D", BUSINESS_CARD_2D);
            map.put("PICTURE_2D", PICTURE_2D);
            map.put("MODELING_3D", MODELING_3D);
            map.put("VDS_3D", VDS_3D);
            map.put("TTSA_3D", TTSA_3D);
            map.put("FLEXUS_2D", FLEXUS_2D);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BusinessTypeEnum(String value) {
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
        public static BusinessTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BusinessTypeEnum(value));
        }

        public static BusinessTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BusinessTypeEnum) {
                return this.value.equals(((BusinessTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private BusinessTypeEnum businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_resource_type")

    private String subResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sub_resource")

    private Boolean isSubResource;

    /**
     * 计费类型。 * PERIODIC: 包周期 * ONE_TIME：一次性 * ON_DEMAND：按需
     */
    public static final class ChargingModeEnum {

        /**
         * Enum PERIODIC for value: "PERIODIC"
         */
        public static final ChargingModeEnum PERIODIC = new ChargingModeEnum("PERIODIC");

        /**
         * Enum ONE_TIME for value: "ONE_TIME"
         */
        public static final ChargingModeEnum ONE_TIME = new ChargingModeEnum("ONE_TIME");

        /**
         * Enum ON_DEMAND for value: "ON_DEMAND"
         */
        public static final ChargingModeEnum ON_DEMAND = new ChargingModeEnum("ON_DEMAND");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("PERIODIC", PERIODIC);
            map.put("ONE_TIME", ONE_TIME);
            map.put("ON_DEMAND", ON_DEMAND);
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
    @JsonProperty(value = "charging_mode")

    private ChargingModeEnum chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_source")

    private String resourceSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Float amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private Float usage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    /**
     * 单位。 * NUM：个数(形象/声音) * MIN：分钟（视频制作） * HOUR：小时 （直播） * CHANNEL：路（直播/交互） * GB：GB(资产管理) * MILLION_WORDS：百万字 * TEN_THOUSAND_WORDS：万字 * TIME：次
     */
    public static final class UnitEnum {

        /**
         * Enum NUM for value: "NUM"
         */
        public static final UnitEnum NUM = new UnitEnum("NUM");

        /**
         * Enum MIN for value: "MIN"
         */
        public static final UnitEnum MIN = new UnitEnum("MIN");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final UnitEnum HOUR = new UnitEnum("HOUR");

        /**
         * Enum CHANNEL for value: "CHANNEL"
         */
        public static final UnitEnum CHANNEL = new UnitEnum("CHANNEL");

        /**
         * Enum GB for value: "GB"
         */
        public static final UnitEnum GB = new UnitEnum("GB");

        /**
         * Enum MILLION_WORDS for value: "MILLION_WORDS"
         */
        public static final UnitEnum MILLION_WORDS = new UnitEnum("MILLION_WORDS");

        /**
         * Enum TEN_THOUSAND_WORDS for value: "TEN_THOUSAND_WORDS"
         */
        public static final UnitEnum TEN_THOUSAND_WORDS = new UnitEnum("TEN_THOUSAND_WORDS");

        /**
         * Enum TIME for value: "TIME"
         */
        public static final UnitEnum TIME = new UnitEnum("TIME");

        private static final Map<String, UnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UnitEnum> createStaticFields() {
            Map<String, UnitEnum> map = new HashMap<>();
            map.put("NUM", NUM);
            map.put("MIN", MIN);
            map.put("HOUR", HOUR);
            map.put("CHANNEL", CHANNEL);
            map.put("GB", GB);
            map.put("MILLION_WORDS", MILLION_WORDS);
            map.put("TEN_THOUSAND_WORDS", TEN_THOUSAND_WORDS);
            map.put("TIME", TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UnitEnum(String value) {
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
        public static UnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UnitEnum(value));
        }

        public static UnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UnitEnum) {
                return this.value.equals(((UnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private UnitEnum unit;

    public ResourceItemInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourceItemInfo withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * cloudServiceId的订单id。 云服务购买清单等场景必填（purchaseMode取值为3、4），每个CloudService生成一个订单；此场景如果为空，则报错。 其他场景，为空。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ResourceItemInfo withBoundAsset(BoundAssetInfo boundAsset) {
        this.boundAsset = boundAsset;
        return this;
    }

    public ResourceItemInfo withBoundAsset(Consumer<BoundAssetInfo> boundAssetSetter) {
        if (this.boundAsset == null) {
            this.boundAsset = new BoundAssetInfo();
            boundAssetSetter.accept(this.boundAsset);
        }

        return this;
    }

    /**
     * Get boundAsset
     * @return boundAsset
     */
    public BoundAssetInfo getBoundAsset() {
        return boundAsset;
    }

    public void setBoundAsset(BoundAssetInfo boundAsset) {
        this.boundAsset = boundAsset;
    }

    public ResourceItemInfo withResourceExpireTime(String resourceExpireTime) {
        this.resourceExpireTime = resourceExpireTime;
        return this;
    }

    /**
     * 资源截止时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"
     * @return resourceExpireTime
     */
    public String getResourceExpireTime() {
        return resourceExpireTime;
    }

    public void setResourceExpireTime(String resourceExpireTime) {
        this.resourceExpireTime = resourceExpireTime;
    }

    public ResourceItemInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。详见[资源类型](metastudio_02_0042.xml)。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ResourceItemInfo withBusinessType(BusinessTypeEnum businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * 业务类型。 * VOICE_CLONE：声音制作 * SYNTHETICS_SOUND：声音合成 * ASSET_MANAGER：资产管理 * MODELING_2D：形象制作 * LIVE_2D：分身数字人视频直播 * VIDEO_2D：分身数字人视频制作 * CHAT_2D：分身数字人智能交互 * BUSINESS_CARD_2D：分身数字人名片 * PICTURE_2D：照片数字人视频 * MODELING_3D：3D照片建模 * VDS_3D：3D视觉驱动 * TTSA_3D：3D语音驱动 * FLEXUS_2D：flexus版本资源
     * @return businessType
     */
    public BusinessTypeEnum getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessTypeEnum businessType) {
        this.businessType = businessType;
    }

    public ResourceItemInfo withSubResourceType(String subResourceType) {
        this.subResourceType = subResourceType;
        return this;
    }

    /**
     * 子资源类型。当前只有flexus套餐包存在该字段 * voice_clone_flexus: 语音克隆Flexus版 * modeling_count_2d_model_flexus: 分身数字人形象制作Flexus版 * video_time_flexus_2d_model: 分身数字人Flexus版本视频制作
     * @return subResourceType
     */
    public String getSubResourceType() {
        return subResourceType;
    }

    public void setSubResourceType(String subResourceType) {
        this.subResourceType = subResourceType;
    }

    public ResourceItemInfo withIsSubResource(Boolean isSubResource) {
        this.isSubResource = isSubResource;
        return this;
    }

    /**
     * 是否子资源。子资源描述的是子资源的数量和单位
     * @return isSubResource
     */
    public Boolean getIsSubResource() {
        return isSubResource;
    }

    public void setIsSubResource(Boolean isSubResource) {
        this.isSubResource = isSubResource;
    }

    public ResourceItemInfo withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费类型。 * PERIODIC: 包周期 * ONE_TIME：一次性 * ON_DEMAND：按需
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ResourceItemInfo withResourceSource(String resourceSource) {
        this.resourceSource = resourceSource;
        return this;
    }

    /**
     * 资源来源。 * PURCHASED: 购买 * SP_ALLOCATED：SP分配 * ADMIN_ALLOCATED：系统管理员分配
     * @return resourceSource
     */
    public String getResourceSource() {
        return resourceSource;
    }

    public void setResourceSource(String resourceSource) {
        this.resourceSource = resourceSource;
    }

    public ResourceItemInfo withAmount(Float amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 总量
     * minimum: 0
     * maximum: 1E+6
     * @return amount
     */
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public ResourceItemInfo withUsage(Float usage) {
        this.usage = usage;
        return this;
    }

    /**
     * 使用量
     * minimum: 0
     * maximum: 1E+6
     * @return usage
     */
    public Float getUsage() {
        return usage;
    }

    public void setUsage(Float usage) {
        this.usage = usage;
    }

    public ResourceItemInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态 0:正常 1:冻结
     * minimum: 0
     * maximum: 1
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ResourceItemInfo withUnit(UnitEnum unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位。 * NUM：个数(形象/声音) * MIN：分钟（视频制作） * HOUR：小时 （直播） * CHANNEL：路（直播/交互） * GB：GB(资产管理) * MILLION_WORDS：百万字 * TEN_THOUSAND_WORDS：万字 * TIME：次
     * @return unit
     */
    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceItemInfo that = (ResourceItemInfo) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.boundAsset, that.boundAsset)
            && Objects.equals(this.resourceExpireTime, that.resourceExpireTime)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.subResourceType, that.subResourceType)
            && Objects.equals(this.isSubResource, that.isSubResource)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.resourceSource, that.resourceSource) && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.usage, that.usage) && Objects.equals(this.status, that.status)
            && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            orderId,
            boundAsset,
            resourceExpireTime,
            resourceType,
            businessType,
            subResourceType,
            isSubResource,
            chargingMode,
            resourceSource,
            amount,
            usage,
            status,
            unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceItemInfo {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    boundAsset: ").append(toIndentedString(boundAsset)).append("\n");
        sb.append("    resourceExpireTime: ").append(toIndentedString(resourceExpireTime)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    subResourceType: ").append(toIndentedString(subResourceType)).append("\n");
        sb.append("    isSubResource: ").append(toIndentedString(isSubResource)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceSource: ").append(toIndentedString(resourceSource)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
