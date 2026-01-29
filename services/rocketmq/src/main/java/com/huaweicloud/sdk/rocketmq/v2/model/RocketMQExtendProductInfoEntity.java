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
     * **参数解释**： 实例类型。 **约束限制**： 不涉及。 **取值范围**： [- single：4.8.0单机。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- cluster：4.8.0集群。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- single.basic：5.x单机基础版。](tag:hws,hws_eu,hws_hk,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) [- cluster.basic：5.x集群基础版。](tag:hws,hws_eu,hws_hk,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) [- cluster.professional：5.x集群专业版。](tag:hws,hws_eu,hws_hk,ctc,srg) **默认取值**： 不涉及。
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
     * **参数解释**： RocketMQ实例规格。 [x86环境后缀为.x86，arm环境为.arm。single表示单机，cluster表示集群。](tag:hcs,fcs,hcs_oemout)  **约束限制**： 不涉及。  **取值范围**： [当“type”为“single.basic”选择单机规格；当“type”为“cluster.basic”选择集群规格。](tag:dt) [- c6.2u8g.cluster.x86或c6.2u8g.cluster.arm：单个代理最大分区数50，单个代理最大消费组数100](tag:fcs) [- c6.4u8g.cluster.small：单个代理最大Topic数2000，单个代理最大消费组数2000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- c6.4u8g.cluster：单个代理最大Topic数4000，单个代理最大消费组数4000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- c6.4u16g.cluster.x86或c6.4u16g.cluster.arm：单个代理最大分区数100，单个代理最大消费组数200](tag:hcs,hcs_oemout) [- c6.8u16g.cluster：单个代理最大Topic数8000，单个代理最大消费组数8000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- c6.8u32g.cluster.x86或c6.8u32g.cluster.arm：单个代理最大Topic数200，单个代理最大消费组数400](tag:hcs,fcs,hcs_oemout) [- c6.12u24g.cluster：单个代理最大Topic数12000，单个代理最大消费组数12000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- c6.16u64g.cluster.x86或c6.16u64g.cluster.arm：单个代理最大Topic数300，单个代理最大消费组数600](tag:hcs,fcs,hcs_oemout) [- c6.16u32g.cluster：单个代理最大Topic数16000，单个代理最大消费组数16000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- c6.32u128g.cluster.x86或c6.32u128g.cluster.arm：单个代理最大Topic数400，单个代理最大消费组数800](tag:hcs,fcs,hcs_oemout) [- rocketmq.b1.large.1：RocketMQ 5.x 基础版单机规格，实例TPS 500](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) [- rocketmq.b2.large.4：RocketMQ 5.x 基础版集群规格，实例TPS 2000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) [- rocketmq.b2.large.8：RocketMQ 5.x 基础版集群规格，实例TPS 4000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) [- rocketmq.b2.large.12：RocketMQ 5.x 基础版集群规格，实例TPS 6000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) [- rocketmq.p1.large.1：RocketMQ 5.x 专业版单机规格，实例TPS 500](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.8：RocketMQ 5.x 专业版集群规格，实例TPS 4000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.12：RocketMQ 5.x 专业版集群规格，实例TPS 6000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.20：RocketMQ 5.x 专业版集群规格，实例TPS 10000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.40：RocketMQ 5.x 专业版集群规格，实例TPS 20000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.100：RocketMQ 5.x 专业版集群规格，实例TPS 50000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.150：RocketMQ 5.x 专业版集群规格，实例TPS 75000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.200：RocketMQ 5.x 专业版集群规格，实例TPS 100000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.300：RocketMQ 5.x 专业版集群规格，实例TPS 150000](tag:hws,hws_eu,hws_hk,ctc,srg)  **默认取值**： 不涉及。
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
     * **参数解释**： ECS的Flavor ID。[可参考ECS服务实例规格中的规格清单，DMS服务可适配，取通用计算增强型C6系列及上，RocketMQ 5.x CPU/内存配比为1:4。](tag:hws,hws_eu,hws_hk,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 账单计费类型。 **约束限制**： 不涉及。 **取值范围**： [- dms.platinum.c6：华为云账单计费类型。](tag:hws,hws_hk)[账单计费类型。](tag:ctc,hws_eu,ocb,g42,hk_g42,tm,sbc,hk_sbc,cmcc,hk_tm,hcs,fcs,hcs_oemout,ax,srg) [- dms.rocketmq.basic.single.tps：RocketMQ 5.x基础版单机计费类型。](tag:ctc,hws_eu,ocb,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,hcs,fcs,dt,hcs_oemout,srg) [- dms.rocketmq.basic.cluster.tps：RocketMQ 5.x基础版集群计费类型。](tag:ctc,hws_eu,ocb,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,hcs,fcs,dt,hcs_oemout,srg) [- dms.rocketmq.pro.single.tps：RocketMQ 5.x专业版单机计费类型。](tag:hws,hws_eu,hws_hk,ctc,srg) [- dms.rocketmq.pro.cluster.tps：RocketMQ 5.x专业版集群计费类型。](tag:hws,hws_eu,hws_hk,ctc,srg) [- dms.platinum.c6.dec：专属云账单计费类型。](tag:hws,hws_hk) **默认取值**： 不涉及。
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
     * **参数解释**： 支持的CPU架构类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 支持的计费模式类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 磁盘IO对象信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 可用分区列表。[RocketMQ 5.X基础版部署架构为单机时，请选择1个可用区，为集群时可选择1个或2个可用区。](tag:ctc,hws_eu,ocb,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,hcs,fcs,dt,hcs_oemout,srg) **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 不可用区列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 支持的特性功能列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 是否为擎天实例。 **约束限制**： 不涉及。 **取值范围**： - true：是擎天实例。 - false：不是擎天实例。 **默认取值**： 不涉及。
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
