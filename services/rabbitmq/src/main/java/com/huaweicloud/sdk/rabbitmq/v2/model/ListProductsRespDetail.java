package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListProductsRespDetail
 */
public class ListProductsRespDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private String storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io")

    private List<ListProductsRespIo> io = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable_zones")

    private List<String> unavailableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_flavor_id")

    private String ecsFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch_type")

    private String archType;

    public ListProductsRespDetail withStorage(String storage) {
        this.storage = storage;
        return this;
    }

    /**
     * **参数解释**： 消息存储空间。 **取值范围**： 不涉及。
     * @return storage
     */
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public ListProductsRespDetail withProductId(String productId) {
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

    public ListProductsRespDetail withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释**： 规格ID。 **取值范围**： 不涉及。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ListProductsRespDetail withIo(List<ListProductsRespIo> io) {
        this.io = io;
        return this;
    }

    public ListProductsRespDetail addIoItem(ListProductsRespIo ioItem) {
        if (this.io == null) {
            this.io = new ArrayList<>();
        }
        this.io.add(ioItem);
        return this;
    }

    public ListProductsRespDetail withIo(Consumer<List<ListProductsRespIo>> ioSetter) {
        if (this.io == null) {
            this.io = new ArrayList<>();
        }
        ioSetter.accept(this.io);
        return this;
    }

    /**
     * **参数解释**： IO信息。
     * @return io
     */
    public List<ListProductsRespIo> getIo() {
        return io;
    }

    public void setIo(List<ListProductsRespIo> io) {
        this.io = io;
    }

    public ListProductsRespDetail withUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
        return this;
    }

    public ListProductsRespDetail addUnavailableZonesItem(String unavailableZonesItem) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        this.unavailableZones.add(unavailableZonesItem);
        return this;
    }

    public ListProductsRespDetail withUnavailableZones(Consumer<List<String>> unavailableZonesSetter) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        unavailableZonesSetter.accept(this.unavailableZones);
        return this;
    }

    /**
     * **参数解释**： 资源售罄的可用区列表。 **取值范围**： 不涉及。
     * @return unavailableZones
     */
    public List<String> getUnavailableZones() {
        return unavailableZones;
    }

    public void setUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
    }

    public ListProductsRespDetail withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ListProductsRespDetail addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ListProductsRespDetail withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * **参数解释**： 有可用资源的可用区列表。 **取值范围**： 不涉及。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public ListProductsRespDetail withEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
        return this;
    }

    /**
     * **参数解释**： 该产品规格对应的虚拟机规格。 **取值范围**： 不涉及。
     * @return ecsFlavorId
     */
    public String getEcsFlavorId() {
        return ecsFlavorId;
    }

    public void setEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
    }

    public ListProductsRespDetail withArchType(String archType) {
        this.archType = archType;
        return this;
    }

    /**
     * **参数解释**： 实例规格架构类型。当前仅支持X86。 **取值范围**： 不涉及。
     * @return archType
     */
    public String getArchType() {
        return archType;
    }

    public void setArchType(String archType) {
        this.archType = archType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProductsRespDetail that = (ListProductsRespDetail) obj;
        return Objects.equals(this.storage, that.storage) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.specCode, that.specCode) && Objects.equals(this.io, that.io)
            && Objects.equals(this.unavailableZones, that.unavailableZones)
            && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.ecsFlavorId, that.ecsFlavorId) && Objects.equals(this.archType, that.archType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storage, productId, specCode, io, unavailableZones, availableZones, ecsFlavorId, archType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsRespDetail {\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    io: ").append(toIndentedString(io)).append("\n");
        sb.append("    unavailableZones: ").append(toIndentedString(unavailableZones)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    ecsFlavorId: ").append(toIndentedString(ecsFlavorId)).append("\n");
        sb.append("    archType: ").append(toIndentedString(archType)).append("\n");
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
