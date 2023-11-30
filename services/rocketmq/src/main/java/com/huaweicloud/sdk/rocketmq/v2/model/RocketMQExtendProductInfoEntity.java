package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RocketMQExtendProductInfoEntity
 */
public class RocketMQExtendProductInfoEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_flavor_id")

    private String ecsFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_code")

    private String billingCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch_types")

    private List<String> archTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private List<String> chargingMode = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ios")

    private List<RocketMQExtendProductIosEntity> ios = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private RocketMQExtendProductPropertiesEntity properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable_zones")

    private List<String> unavailableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_features")

    private List<RocketMQProductSupportFeaturesEntity> supportFeatures = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qingtian_incompatible")

    private Boolean qingtianIncompatible;

    public RocketMQExtendProductInfoEntity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RocketMQExtendProductInfoEntity withProductId(String productId) {
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

    public RocketMQExtendProductInfoEntity withEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
        return this;
    }

    /**
     * 该产品使用的ECS规格
     * @return ecsFlavorId
     */
    public String getEcsFlavorId() {
        return ecsFlavorId;
    }

    public void setEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
    }

    public RocketMQExtendProductInfoEntity withBillingCode(String billingCode) {
        this.billingCode = billingCode;
        return this;
    }

    /**
     * 账单计费类型。
     * @return billingCode
     */
    public String getBillingCode() {
        return billingCode;
    }

    public void setBillingCode(String billingCode) {
        this.billingCode = billingCode;
    }

    public RocketMQExtendProductInfoEntity withArchTypes(List<String> archTypes) {
        this.archTypes = archTypes;
        return this;
    }

    public RocketMQExtendProductInfoEntity addArchTypesItem(String archTypesItem) {
        if (this.archTypes == null) {
            this.archTypes = new ArrayList<>();
        }
        this.archTypes.add(archTypesItem);
        return this;
    }

    public RocketMQExtendProductInfoEntity withArchTypes(Consumer<List<String>> archTypesSetter) {
        if (this.archTypes == null) {
            this.archTypes = new ArrayList<>();
        }
        archTypesSetter.accept(this.archTypes);
        return this;
    }

    /**
     * 支持的CPU架构类型
     * @return archTypes
     */
    public List<String> getArchTypes() {
        return archTypes;
    }

    public void setArchTypes(List<String> archTypes) {
        this.archTypes = archTypes;
    }

    public RocketMQExtendProductInfoEntity withChargingMode(List<String> chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    public RocketMQExtendProductInfoEntity addChargingModeItem(String chargingModeItem) {
        if (this.chargingMode == null) {
            this.chargingMode = new ArrayList<>();
        }
        this.chargingMode.add(chargingModeItem);
        return this;
    }

    public RocketMQExtendProductInfoEntity withChargingMode(Consumer<List<String>> chargingModeSetter) {
        if (this.chargingMode == null) {
            this.chargingMode = new ArrayList<>();
        }
        chargingModeSetter.accept(this.chargingMode);
        return this;
    }

    /**
     * 支持的计费模式类型
     * @return chargingMode
     */
    public List<String> getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(List<String> chargingMode) {
        this.chargingMode = chargingMode;
    }

    public RocketMQExtendProductInfoEntity withIos(List<RocketMQExtendProductIosEntity> ios) {
        this.ios = ios;
        return this;
    }

    public RocketMQExtendProductInfoEntity addIosItem(RocketMQExtendProductIosEntity iosItem) {
        if (this.ios == null) {
            this.ios = new ArrayList<>();
        }
        this.ios.add(iosItem);
        return this;
    }

    public RocketMQExtendProductInfoEntity withIos(Consumer<List<RocketMQExtendProductIosEntity>> iosSetter) {
        if (this.ios == null) {
            this.ios = new ArrayList<>();
        }
        iosSetter.accept(this.ios);
        return this;
    }

    /**
     * 磁盘IO信息
     * @return ios
     */
    public List<RocketMQExtendProductIosEntity> getIos() {
        return ios;
    }

    public void setIos(List<RocketMQExtendProductIosEntity> ios) {
        this.ios = ios;
    }

    public RocketMQExtendProductInfoEntity withProperties(RocketMQExtendProductPropertiesEntity properties) {
        this.properties = properties;
        return this;
    }

    public RocketMQExtendProductInfoEntity withProperties(
        Consumer<RocketMQExtendProductPropertiesEntity> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new RocketMQExtendProductPropertiesEntity();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public RocketMQExtendProductPropertiesEntity getProperties() {
        return properties;
    }

    public void setProperties(RocketMQExtendProductPropertiesEntity properties) {
        this.properties = properties;
    }

    public RocketMQExtendProductInfoEntity withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public RocketMQExtendProductInfoEntity addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public RocketMQExtendProductInfoEntity withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 有可用资源的可用区列表
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public RocketMQExtendProductInfoEntity withUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
        return this;
    }

    public RocketMQExtendProductInfoEntity addUnavailableZonesItem(String unavailableZonesItem) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        this.unavailableZones.add(unavailableZonesItem);
        return this;
    }

    public RocketMQExtendProductInfoEntity withUnavailableZones(Consumer<List<String>> unavailableZonesSetter) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        unavailableZonesSetter.accept(this.unavailableZones);
        return this;
    }

    /**
     * 资源售罄的可用区列表
     * @return unavailableZones
     */
    public List<String> getUnavailableZones() {
        return unavailableZones;
    }

    public void setUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
    }

    public RocketMQExtendProductInfoEntity withSupportFeatures(
        List<RocketMQProductSupportFeaturesEntity> supportFeatures) {
        this.supportFeatures = supportFeatures;
        return this;
    }

    public RocketMQExtendProductInfoEntity addSupportFeaturesItem(
        RocketMQProductSupportFeaturesEntity supportFeaturesItem) {
        if (this.supportFeatures == null) {
            this.supportFeatures = new ArrayList<>();
        }
        this.supportFeatures.add(supportFeaturesItem);
        return this;
    }

    public RocketMQExtendProductInfoEntity withSupportFeatures(
        Consumer<List<RocketMQProductSupportFeaturesEntity>> supportFeaturesSetter) {
        if (this.supportFeatures == null) {
            this.supportFeatures = new ArrayList<>();
        }
        supportFeaturesSetter.accept(this.supportFeatures);
        return this;
    }

    /**
     * 支持的特性功能
     * @return supportFeatures
     */
    public List<RocketMQProductSupportFeaturesEntity> getSupportFeatures() {
        return supportFeatures;
    }

    public void setSupportFeatures(List<RocketMQProductSupportFeaturesEntity> supportFeatures) {
        this.supportFeatures = supportFeatures;
    }

    public RocketMQExtendProductInfoEntity withQingtianIncompatible(Boolean qingtianIncompatible) {
        this.qingtianIncompatible = qingtianIncompatible;
        return this;
    }

    /**
     * 是否为擎天实例。
     * @return qingtianIncompatible
     */
    public Boolean getQingtianIncompatible() {
        return qingtianIncompatible;
    }

    public void setQingtianIncompatible(Boolean qingtianIncompatible) {
        this.qingtianIncompatible = qingtianIncompatible;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RocketMQExtendProductInfoEntity that = (RocketMQExtendProductInfoEntity) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.ecsFlavorId, that.ecsFlavorId) && Objects.equals(this.billingCode, that.billingCode)
            && Objects.equals(this.archTypes, that.archTypes) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.ios, that.ios) && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.unavailableZones, that.unavailableZones)
            && Objects.equals(this.supportFeatures, that.supportFeatures)
            && Objects.equals(this.qingtianIncompatible, that.qingtianIncompatible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            productId,
            ecsFlavorId,
            billingCode,
            archTypes,
            chargingMode,
            ios,
            properties,
            availableZones,
            unavailableZones,
            supportFeatures,
            qingtianIncompatible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RocketMQExtendProductInfoEntity {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    ecsFlavorId: ").append(toIndentedString(ecsFlavorId)).append("\n");
        sb.append("    billingCode: ").append(toIndentedString(billingCode)).append("\n");
        sb.append("    archTypes: ").append(toIndentedString(archTypes)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    ios: ").append(toIndentedString(ios)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    unavailableZones: ").append(toIndentedString(unavailableZones)).append("\n");
        sb.append("    supportFeatures: ").append(toIndentedString(supportFeatures)).append("\n");
        sb.append("    qingtianIncompatible: ").append(toIndentedString(qingtianIncompatible)).append("\n");
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
