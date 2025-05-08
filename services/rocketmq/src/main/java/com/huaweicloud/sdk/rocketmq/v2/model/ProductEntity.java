package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProductEntity
 */
public class ProductEntity {

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

    private Object chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ios")

    private Object ios;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_features")

    private Object supportFeatures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Object properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable_zones")

    private List<String> unavailableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qingtian_incompatible")

    private Boolean qingtianIncompatible;

    public ProductEntity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 产品类型。 **取值范围**： - single：单机。 - cluster：集群。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProductEntity withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释**： 产品ID。 **取值范围**： 不涉及。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductEntity withEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
        return this;
    }

    /**
     * **参数解释**： ECS的Flavor ID。 **取值范围**： 不涉及。
     * @return ecsFlavorId
     */
    public String getEcsFlavorId() {
        return ecsFlavorId;
    }

    public void setEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
    }

    public ProductEntity withBillingCode(String billingCode) {
        this.billingCode = billingCode;
        return this;
    }

    /**
     * **参数解释**： CBC的规格码。 **取值范围**： 不涉及。
     * @return billingCode
     */
    public String getBillingCode() {
        return billingCode;
    }

    public void setBillingCode(String billingCode) {
        this.billingCode = billingCode;
    }

    public ProductEntity withArchTypes(List<String> archTypes) {
        this.archTypes = archTypes;
        return this;
    }

    public ProductEntity addArchTypesItem(String archTypesItem) {
        if (this.archTypes == null) {
            this.archTypes = new ArrayList<>();
        }
        this.archTypes.add(archTypesItem);
        return this;
    }

    public ProductEntity withArchTypes(Consumer<List<String>> archTypesSetter) {
        if (this.archTypes == null) {
            this.archTypes = new ArrayList<>();
        }
        archTypesSetter.accept(this.archTypes);
        return this;
    }

    /**
     * **参数解释**： 架构类型。
     * @return archTypes
     */
    public List<String> getArchTypes() {
        return archTypes;
    }

    public void setArchTypes(List<String> archTypes) {
        this.archTypes = archTypes;
    }

    public ProductEntity withChargingMode(Object chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**： 计费模式。 **取值范围**： 不涉及。
     * @return chargingMode
     */
    public Object getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Object chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ProductEntity withIos(Object ios) {
        this.ios = ios;
        return this;
    }

    /**
     * **参数解释**： 支持的io类型。 **取值范围**： 不涉及。
     * @return ios
     */
    public Object getIos() {
        return ios;
    }

    public void setIos(Object ios) {
        this.ios = ios;
    }

    public ProductEntity withSupportFeatures(Object supportFeatures) {
        this.supportFeatures = supportFeatures;
        return this;
    }

    /**
     * **参数解释**： 支持的特性。 **取值范围**： 不涉及。
     * @return supportFeatures
     */
    public Object getSupportFeatures() {
        return supportFeatures;
    }

    public void setSupportFeatures(Object supportFeatures) {
        this.supportFeatures = supportFeatures;
    }

    public ProductEntity withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * **参数解释**： 产品特性。 **取值范围**： 不涉及。
     * @return properties
     */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public ProductEntity withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ProductEntity addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ProductEntity withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * **参数解释**： 可用分区。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public ProductEntity withUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
        return this;
    }

    public ProductEntity addUnavailableZonesItem(String unavailableZonesItem) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        this.unavailableZones.add(unavailableZonesItem);
        return this;
    }

    public ProductEntity withUnavailableZones(Consumer<List<String>> unavailableZonesSetter) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        unavailableZonesSetter.accept(this.unavailableZones);
        return this;
    }

    /**
     * **参数解释**： 不可用分区。
     * @return unavailableZones
     */
    public List<String> getUnavailableZones() {
        return unavailableZones;
    }

    public void setUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
    }

    public ProductEntity withQingtianIncompatible(Boolean qingtianIncompatible) {
        this.qingtianIncompatible = qingtianIncompatible;
        return this;
    }

    /**
     * **参数解释**： 是否为擎天实例。 **取值范围**： - true：是 - false：否
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
        ProductEntity that = (ProductEntity) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.ecsFlavorId, that.ecsFlavorId) && Objects.equals(this.billingCode, that.billingCode)
            && Objects.equals(this.archTypes, that.archTypes) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.ios, that.ios) && Objects.equals(this.supportFeatures, that.supportFeatures)
            && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.unavailableZones, that.unavailableZones)
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
            supportFeatures,
            properties,
            availableZones,
            unavailableZones,
            qingtianIncompatible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductEntity {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    ecsFlavorId: ").append(toIndentedString(ecsFlavorId)).append("\n");
        sb.append("    billingCode: ").append(toIndentedString(billingCode)).append("\n");
        sb.append("    archTypes: ").append(toIndentedString(archTypes)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    ios: ").append(toIndentedString(ios)).append("\n");
        sb.append("    supportFeatures: ").append(toIndentedString(supportFeatures)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    unavailableZones: ").append(toIndentedString(unavailableZones)).append("\n");
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
