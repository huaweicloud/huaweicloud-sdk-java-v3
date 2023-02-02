package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 产品规格的详细信息。
 */
public class ListEngineProductsEntity {

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

    private List<ListEngineIosEntity> ios = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_features")

    private List<ListEngineSupportFeaturesEntity> supportFeatures = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private ListEnginePropertiesEntity properties;

    public ListEngineProductsEntity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 产品类型。当前产品类型有单机和集群。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListEngineProductsEntity withProductId(String productId) {
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

    public ListEngineProductsEntity withEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
        return this;
    }

    /**
     * 底层资源类型。
     * @return ecsFlavorId
     */
    public String getEcsFlavorId() {
        return ecsFlavorId;
    }

    public void setEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
    }

    public ListEngineProductsEntity withBillingCode(String billingCode) {
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

    public ListEngineProductsEntity withArchTypes(List<String> archTypes) {
        this.archTypes = archTypes;
        return this;
    }

    public ListEngineProductsEntity addArchTypesItem(String archTypesItem) {
        if (this.archTypes == null) {
            this.archTypes = new ArrayList<>();
        }
        this.archTypes.add(archTypesItem);
        return this;
    }

    public ListEngineProductsEntity withArchTypes(Consumer<List<String>> archTypesSetter) {
        if (this.archTypes == null) {
            this.archTypes = new ArrayList<>();
        }
        archTypesSetter.accept(this.archTypes);
        return this;
    }

    /**
     * CPU架构。
     * @return archTypes
     */
    public List<String> getArchTypes() {
        return archTypes;
    }

    public void setArchTypes(List<String> archTypes) {
        this.archTypes = archTypes;
    }

    public ListEngineProductsEntity withChargingMode(List<String> chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    public ListEngineProductsEntity addChargingModeItem(String chargingModeItem) {
        if (this.chargingMode == null) {
            this.chargingMode = new ArrayList<>();
        }
        this.chargingMode.add(chargingModeItem);
        return this;
    }

    public ListEngineProductsEntity withChargingMode(Consumer<List<String>> chargingModeSetter) {
        if (this.chargingMode == null) {
            this.chargingMode = new ArrayList<>();
        }
        chargingModeSetter.accept(this.chargingMode);
        return this;
    }

    /**
     * [计费模式。monthly：包年/包月类型。hourly：按需类型。](tag:hc,hk,hws,hws_hk,ctc,sbc,hk_sbc,cmcc,hws_eu)[暂未使用。](tag:hws_ocb,ocb)[计费模式。hourly：按需类型。](tag:otc,dt,g42,tm)
     * @return chargingMode
     */
    public List<String> getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(List<String> chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ListEngineProductsEntity withIos(List<ListEngineIosEntity> ios) {
        this.ios = ios;
        return this;
    }

    public ListEngineProductsEntity addIosItem(ListEngineIosEntity iosItem) {
        if (this.ios == null) {
            this.ios = new ArrayList<>();
        }
        this.ios.add(iosItem);
        return this;
    }

    public ListEngineProductsEntity withIos(Consumer<List<ListEngineIosEntity>> iosSetter) {
        if (this.ios == null) {
            this.ios = new ArrayList<>();
        }
        iosSetter.accept(this.ios);
        return this;
    }

    /**
     * 支持的磁盘IO类型列表。
     * @return ios
     */
    public List<ListEngineIosEntity> getIos() {
        return ios;
    }

    public void setIos(List<ListEngineIosEntity> ios) {
        this.ios = ios;
    }

    public ListEngineProductsEntity withSupportFeatures(List<ListEngineSupportFeaturesEntity> supportFeatures) {
        this.supportFeatures = supportFeatures;
        return this;
    }

    public ListEngineProductsEntity addSupportFeaturesItem(ListEngineSupportFeaturesEntity supportFeaturesItem) {
        if (this.supportFeatures == null) {
            this.supportFeatures = new ArrayList<>();
        }
        this.supportFeatures.add(supportFeaturesItem);
        return this;
    }

    public ListEngineProductsEntity withSupportFeatures(
        Consumer<List<ListEngineSupportFeaturesEntity>> supportFeaturesSetter) {
        if (this.supportFeatures == null) {
            this.supportFeatures = new ArrayList<>();
        }
        supportFeaturesSetter.accept(this.supportFeatures);
        return this;
    }

    /**
     * 当前规格实例支持的功能特性列表。
     * @return supportFeatures
     */
    public List<ListEngineSupportFeaturesEntity> getSupportFeatures() {
        return supportFeatures;
    }

    public void setSupportFeatures(List<ListEngineSupportFeaturesEntity> supportFeatures) {
        this.supportFeatures = supportFeatures;
    }

    public ListEngineProductsEntity withProperties(ListEnginePropertiesEntity properties) {
        this.properties = properties;
        return this;
    }

    public ListEngineProductsEntity withProperties(Consumer<ListEnginePropertiesEntity> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ListEnginePropertiesEntity();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public ListEnginePropertiesEntity getProperties() {
        return properties;
    }

    public void setProperties(ListEnginePropertiesEntity properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEngineProductsEntity listEngineProductsEntity = (ListEngineProductsEntity) o;
        return Objects.equals(this.type, listEngineProductsEntity.type)
            && Objects.equals(this.productId, listEngineProductsEntity.productId)
            && Objects.equals(this.ecsFlavorId, listEngineProductsEntity.ecsFlavorId)
            && Objects.equals(this.billingCode, listEngineProductsEntity.billingCode)
            && Objects.equals(this.archTypes, listEngineProductsEntity.archTypes)
            && Objects.equals(this.chargingMode, listEngineProductsEntity.chargingMode)
            && Objects.equals(this.ios, listEngineProductsEntity.ios)
            && Objects.equals(this.supportFeatures, listEngineProductsEntity.supportFeatures)
            && Objects.equals(this.properties, listEngineProductsEntity.properties);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(type, productId, ecsFlavorId, billingCode, archTypes, chargingMode, ios, supportFeatures, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEngineProductsEntity {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    ecsFlavorId: ").append(toIndentedString(ecsFlavorId)).append("\n");
        sb.append("    billingCode: ").append(toIndentedString(billingCode)).append("\n");
        sb.append("    archTypes: ").append(toIndentedString(archTypes)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    ios: ").append(toIndentedString(ios)).append("\n");
        sb.append("    supportFeatures: ").append(toIndentedString(supportFeatures)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
