package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ProductPostPaid
 */
public class ProductPostPaid {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    /**
     * 使用量单位标识，按需询价必填，例如按小时询价，使用量值为1，使用量单位为小时，枚举值如下： 4：小时 10：GB（带宽按流量询价使用） 11：MB（带宽按流量询价使用）
     */
    public static final class UsageMeasureIdEnum {

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final UsageMeasureIdEnum NUMBER_4 = new UsageMeasureIdEnum(4);

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final UsageMeasureIdEnum NUMBER_10 = new UsageMeasureIdEnum(10);

        /**
         * Enum NUMBER_11 for value: 11
         */
        public static final UsageMeasureIdEnum NUMBER_11 = new UsageMeasureIdEnum(11);

        private static final Map<Integer, UsageMeasureIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, UsageMeasureIdEnum> createStaticFields() {
            Map<Integer, UsageMeasureIdEnum> map = new HashMap<>();
            map.put(4, NUMBER_4);
            map.put(10, NUMBER_10);
            map.put(11, NUMBER_11);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        UsageMeasureIdEnum(Integer value) {
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
        public static UsageMeasureIdEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UsageMeasureIdEnum(value));
        }

        public static UsageMeasureIdEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UsageMeasureIdEnum) {
                return this.value.equals(((UsageMeasureIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_measure_id")

    private UsageMeasureIdEnum usageMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_value")

    private BigDecimal usageValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    private Integer resourceSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_factor")

    private String usageFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    public ProductPostPaid withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID标识，同一次询价中不能重复，用于标识返回询价结果和请求的映射关系
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductPostPaid withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品Id，通过向CBC询价获取该商品的标识
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductPostPaid withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型，固定值为hws.service.type.sa
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ProductPostPaid withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 用户购买云服务产品的资源类型，例如SecMaster中的典型场景配置，资源类型为hws.resource.type.secmaster.typical
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ProductPostPaid withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 用户购买云服务产品的资源规格，例如安全云脑中的基础版，资源规格为secmaster.basic
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ProductPostPaid withUsageMeasureId(UsageMeasureIdEnum usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
        return this;
    }

    /**
     * 使用量单位标识，按需询价必填，例如按小时询价，使用量值为1，使用量单位为小时，枚举值如下： 4：小时 10：GB（带宽按流量询价使用） 11：MB（带宽按流量询价使用）
     * minimum: 1
     * maximum: 20
     * @return usageMeasureId
     */
    public UsageMeasureIdEnum getUsageMeasureId() {
        return usageMeasureId;
    }

    public void setUsageMeasureId(UsageMeasureIdEnum usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
    }

    public ProductPostPaid withUsageValue(BigDecimal usageValue) {
        this.usageValue = usageValue;
        return this;
    }

    /**
     * 使用量值，按需询价必填，例如按小时询价，使用量值为1，使用量单位为小时
     * minimum: 1
     * maximum: 1
     * @return usageValue
     */
    public BigDecimal getUsageValue() {
        return usageValue;
    }

    public void setUsageValue(BigDecimal usageValue) {
        this.usageValue = usageValue;
    }

    public ProductPostPaid withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 配额个数
     * minimum: 1
     * maximum: 9999
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    public ProductPostPaid withUsageFactor(String usageFactor) {
        this.usageFactor = usageFactor;
        return this;
    }

    /**
     * 使用量因子，按需计费必填，取值和话单中的使用量因子一致，云服务和使用量因子对应关系如下： 典型场景配置：Duration 态势管理：duration 安全编排：count 智能分析：flow
     * @return usageFactor
     */
    public String getUsageFactor() {
        return usageFactor;
    }

    public void setUsageFactor(String usageFactor) {
        this.usageFactor = usageFactor;
    }

    public ProductPostPaid withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id，仅在增加配额的时候传入
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductPostPaid that = (ProductPostPaid) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.usageMeasureId, that.usageMeasureId)
            && Objects.equals(this.usageValue, that.usageValue) && Objects.equals(this.resourceSize, that.resourceSize)
            && Objects.equals(this.usageFactor, that.usageFactor) && Objects.equals(this.resourceId, that.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            productId,
            cloudServiceType,
            resourceType,
            resourceSpecCode,
            usageMeasureId,
            usageValue,
            resourceSize,
            usageFactor,
            resourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductPostPaid {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    usageMeasureId: ").append(toIndentedString(usageMeasureId)).append("\n");
        sb.append("    usageValue: ").append(toIndentedString(usageValue)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    usageFactor: ").append(toIndentedString(usageFactor)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
