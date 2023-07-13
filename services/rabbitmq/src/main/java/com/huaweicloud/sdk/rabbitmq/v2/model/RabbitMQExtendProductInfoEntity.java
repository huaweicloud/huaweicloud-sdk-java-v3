package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RabbitMQExtendProductInfoEntity
 */
public class RabbitMQExtendProductInfoEntity {

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
    @JsonProperty(value = "arch_types")

    private List<String> archTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private List<String> chargingMode = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ios")

    private List<RabbitMQExtendProductIosEntity> ios = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private RabbitMQExtendProductPropertiesEntity properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable_zones")

    private List<String> unavailableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_features")

    private List<RabbitMQProductSupportFeaturesEntity> supportFeatures = null;

    public RabbitMQExtendProductInfoEntity withType(String type) {
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

    public RabbitMQExtendProductInfoEntity withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public RabbitMQExtendProductInfoEntity withEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
        return this;
    }

    /**
     * 该产品使用的ECS规格。
     * @return ecsFlavorId
     */
    public String getEcsFlavorId() {
        return ecsFlavorId;
    }

    public void setEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
    }

    public RabbitMQExtendProductInfoEntity withArchTypes(List<String> archTypes) {
        this.archTypes = archTypes;
        return this;
    }

    public RabbitMQExtendProductInfoEntity addArchTypesItem(String archTypesItem) {
        if (this.archTypes == null) {
            this.archTypes = new ArrayList<>();
        }
        this.archTypes.add(archTypesItem);
        return this;
    }

    public RabbitMQExtendProductInfoEntity withArchTypes(Consumer<List<String>> archTypesSetter) {
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

    public RabbitMQExtendProductInfoEntity withChargingMode(List<String> chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    public RabbitMQExtendProductInfoEntity addChargingModeItem(String chargingModeItem) {
        if (this.chargingMode == null) {
            this.chargingMode = new ArrayList<>();
        }
        this.chargingMode.add(chargingModeItem);
        return this;
    }

    public RabbitMQExtendProductInfoEntity withChargingMode(Consumer<List<String>> chargingModeSetter) {
        if (this.chargingMode == null) {
            this.chargingMode = new ArrayList<>();
        }
        chargingModeSetter.accept(this.chargingMode);
        return this;
    }

    /**
     * 支持的计费模式类型。
     * @return chargingMode
     */
    public List<String> getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(List<String> chargingMode) {
        this.chargingMode = chargingMode;
    }

    public RabbitMQExtendProductInfoEntity withIos(List<RabbitMQExtendProductIosEntity> ios) {
        this.ios = ios;
        return this;
    }

    public RabbitMQExtendProductInfoEntity addIosItem(RabbitMQExtendProductIosEntity iosItem) {
        if (this.ios == null) {
            this.ios = new ArrayList<>();
        }
        this.ios.add(iosItem);
        return this;
    }

    public RabbitMQExtendProductInfoEntity withIos(Consumer<List<RabbitMQExtendProductIosEntity>> iosSetter) {
        if (this.ios == null) {
            this.ios = new ArrayList<>();
        }
        iosSetter.accept(this.ios);
        return this;
    }

    /**
     * 磁盘IO信息。
     * @return ios
     */
    public List<RabbitMQExtendProductIosEntity> getIos() {
        return ios;
    }

    public void setIos(List<RabbitMQExtendProductIosEntity> ios) {
        this.ios = ios;
    }

    public RabbitMQExtendProductInfoEntity withProperties(RabbitMQExtendProductPropertiesEntity properties) {
        this.properties = properties;
        return this;
    }

    public RabbitMQExtendProductInfoEntity withProperties(
        Consumer<RabbitMQExtendProductPropertiesEntity> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new RabbitMQExtendProductPropertiesEntity();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public RabbitMQExtendProductPropertiesEntity getProperties() {
        return properties;
    }

    public void setProperties(RabbitMQExtendProductPropertiesEntity properties) {
        this.properties = properties;
    }

    public RabbitMQExtendProductInfoEntity withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public RabbitMQExtendProductInfoEntity addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public RabbitMQExtendProductInfoEntity withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 有可用资源的可用区列表。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public RabbitMQExtendProductInfoEntity withUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
        return this;
    }

    public RabbitMQExtendProductInfoEntity addUnavailableZonesItem(String unavailableZonesItem) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        this.unavailableZones.add(unavailableZonesItem);
        return this;
    }

    public RabbitMQExtendProductInfoEntity withUnavailableZones(Consumer<List<String>> unavailableZonesSetter) {
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

    public RabbitMQExtendProductInfoEntity withSupportFeatures(
        List<RabbitMQProductSupportFeaturesEntity> supportFeatures) {
        this.supportFeatures = supportFeatures;
        return this;
    }

    public RabbitMQExtendProductInfoEntity addSupportFeaturesItem(
        RabbitMQProductSupportFeaturesEntity supportFeaturesItem) {
        if (this.supportFeatures == null) {
            this.supportFeatures = new ArrayList<>();
        }
        this.supportFeatures.add(supportFeaturesItem);
        return this;
    }

    public RabbitMQExtendProductInfoEntity withSupportFeatures(
        Consumer<List<RabbitMQProductSupportFeaturesEntity>> supportFeaturesSetter) {
        if (this.supportFeatures == null) {
            this.supportFeatures = new ArrayList<>();
        }
        supportFeaturesSetter.accept(this.supportFeatures);
        return this;
    }

    /**
     * 支持的特性功能。
     * @return supportFeatures
     */
    public List<RabbitMQProductSupportFeaturesEntity> getSupportFeatures() {
        return supportFeatures;
    }

    public void setSupportFeatures(List<RabbitMQProductSupportFeaturesEntity> supportFeatures) {
        this.supportFeatures = supportFeatures;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RabbitMQExtendProductInfoEntity that = (RabbitMQExtendProductInfoEntity) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.ecsFlavorId, that.ecsFlavorId) && Objects.equals(this.archTypes, that.archTypes)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.ios, that.ios)
            && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.unavailableZones, that.unavailableZones)
            && Objects.equals(this.supportFeatures, that.supportFeatures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            productId,
            ecsFlavorId,
            archTypes,
            chargingMode,
            ios,
            properties,
            availableZones,
            unavailableZones,
            supportFeatures);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RabbitMQExtendProductInfoEntity {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    ecsFlavorId: ").append(toIndentedString(ecsFlavorId)).append("\n");
        sb.append("    archTypes: ").append(toIndentedString(archTypes)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    ios: ").append(toIndentedString(ios)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    unavailableZones: ").append(toIndentedString(unavailableZones)).append("\n");
        sb.append("    supportFeatures: ").append(toIndentedString(supportFeatures)).append("\n");
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
