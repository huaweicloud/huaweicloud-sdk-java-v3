package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EdgeSecProductResource
 */
public class EdgeSecProductResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    private Integer resourceSize;

    /**
     * 计费方式（0:不按照流量计费， 1:带宽峰值， 2:流量）
     */
    public static final class BillTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final BillTypeEnum NUMBER_0 = new BillTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final BillTypeEnum NUMBER_1 = new BillTypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final BillTypeEnum NUMBER_2 = new BillTypeEnum(2);

        private static final Map<Integer, BillTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, BillTypeEnum> createStaticFields() {
            Map<Integer, BillTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        BillTypeEnum(Integer value) {
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
        public static BillTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BillTypeEnum(value));
        }

        public static BillTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BillTypeEnum) {
                return this.value.equals(((BillTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_type")

    private BillTypeEnum billType;

    /**
     * 收费模式（1:一次性、包周期（包年包月）， 2:按需计费）
     */
    public static final class ChargingModeEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final ChargingModeEnum _1 = new ChargingModeEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final ChargingModeEnum _2 = new ChargingModeEnum("2");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("2", _2);
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

    public EdgeSecProductResource withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 购买该资源的订单ID
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public EdgeSecProductResource withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型，边缘安全为hws.service.type.edgesec
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public EdgeSecProductResource withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public EdgeSecProductResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public EdgeSecProductResource withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public EdgeSecProductResource withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public EdgeSecProductResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public EdgeSecProductResource withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格编码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public EdgeSecProductResource withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 扩展包资源数量
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    public EdgeSecProductResource withBillType(BillTypeEnum billType) {
        this.billType = billType;
        return this;
    }

    /**
     * 计费方式（0:不按照流量计费， 1:带宽峰值， 2:流量）
     * @return billType
     */
    public BillTypeEnum getBillType() {
        return billType;
    }

    public void setBillType(BillTypeEnum billType) {
        this.billType = billType;
    }

    public EdgeSecProductResource withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 收费模式（1:一次性、包周期（包年包月）， 2:按需计费）
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EdgeSecProductResource that = (EdgeSecProductResource) obj;
        return Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.resourceSize, that.resourceSize) && Objects.equals(this.billType, that.billType)
            && Objects.equals(this.chargingMode, that.chargingMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId,
            cloudServiceType,
            productId,
            resourceId,
            enterpriseProjectId,
            regionId,
            resourceType,
            resourceSpecCode,
            resourceSize,
            billType,
            chargingMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeSecProductResource {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
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
