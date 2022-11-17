package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowInstanceExtendProductInfoRespDetail
 */
public class ShowInstanceExtendProductInfoRespDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps")

    private String tps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private String storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_num")

    private String partitionNum;

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
    @JsonProperty(value = "bandwidth")

    private String bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommend_max_consGroups")

    private String recommendMaxConsGroups;

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

    public ShowInstanceExtendProductInfoRespDetail withTps(String tps) {
        this.tps = tps;
        return this;
    }

    /**
     * 单位时间内的消息量最大值。
     * @return tps
     */
    public String getTps() {
        return tps;
    }

    public void setTps(String tps) {
        this.tps = tps;
    }

    public ShowInstanceExtendProductInfoRespDetail withStorage(String storage) {
        this.storage = storage;
        return this;
    }

    /**
     * 消息存储空间。
     * @return storage
     */
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public ShowInstanceExtendProductInfoRespDetail withPartitionNum(String partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }

    /**
     * Kafka实例的分区数量。
     * @return partitionNum
     */
    public String getPartitionNum() {
        return partitionNum;
    }

    public void setPartitionNum(String partitionNum) {
        this.partitionNum = partitionNum;
    }

    public ShowInstanceExtendProductInfoRespDetail withProductId(String productId) {
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

    public ShowInstanceExtendProductInfoRespDetail withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格ID。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ShowInstanceExtendProductInfoRespDetail withIo(List<ListProductsRespIo> io) {
        this.io = io;
        return this;
    }

    public ShowInstanceExtendProductInfoRespDetail addIoItem(ListProductsRespIo ioItem) {
        if (this.io == null) {
            this.io = new ArrayList<>();
        }
        this.io.add(ioItem);
        return this;
    }

    public ShowInstanceExtendProductInfoRespDetail withIo(Consumer<List<ListProductsRespIo>> ioSetter) {
        if (this.io == null) {
            this.io = new ArrayList<>();
        }
        ioSetter.accept(this.io);
        return this;
    }

    /**
     * IO信息。
     * @return io
     */
    public List<ListProductsRespIo> getIo() {
        return io;
    }

    public void setIo(List<ListProductsRespIo> io) {
        this.io = io;
    }

    public ShowInstanceExtendProductInfoRespDetail withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * Kafka实例的基准带宽。
     * @return bandwidth
     */
    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public ShowInstanceExtendProductInfoRespDetail withRecommendMaxConsGroups(String recommendMaxConsGroups) {
        this.recommendMaxConsGroups = recommendMaxConsGroups;
        return this;
    }

    /**
     * Kafka实例最大消费组数参考值。
     * @return recommendMaxConsGroups
     */
    public String getRecommendMaxConsGroups() {
        return recommendMaxConsGroups;
    }

    public void setRecommendMaxConsGroups(String recommendMaxConsGroups) {
        this.recommendMaxConsGroups = recommendMaxConsGroups;
    }

    public ShowInstanceExtendProductInfoRespDetail withUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
        return this;
    }

    public ShowInstanceExtendProductInfoRespDetail addUnavailableZonesItem(String unavailableZonesItem) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        this.unavailableZones.add(unavailableZonesItem);
        return this;
    }

    public ShowInstanceExtendProductInfoRespDetail withUnavailableZones(Consumer<List<String>> unavailableZonesSetter) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        unavailableZonesSetter.accept(this.unavailableZones);
        return this;
    }

    /**
     * 资源售罄的可用区列表。
     * @return unavailableZones
     */
    public List<String> getUnavailableZones() {
        return unavailableZones;
    }

    public void setUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
    }

    public ShowInstanceExtendProductInfoRespDetail withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ShowInstanceExtendProductInfoRespDetail addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ShowInstanceExtendProductInfoRespDetail withAvailableZones(Consumer<List<String>> availableZonesSetter) {
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

    public ShowInstanceExtendProductInfoRespDetail withEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
        return this;
    }

    /**
     * 该产品规格对应的虚拟机规格。
     * @return ecsFlavorId
     */
    public String getEcsFlavorId() {
        return ecsFlavorId;
    }

    public void setEcsFlavorId(String ecsFlavorId) {
        this.ecsFlavorId = ecsFlavorId;
    }

    public ShowInstanceExtendProductInfoRespDetail withArchType(String archType) {
        this.archType = archType;
        return this;
    }

    /**
     * 实例规格架构类型。当前仅支持X86。
     * @return archType
     */
    public String getArchType() {
        return archType;
    }

    public void setArchType(String archType) {
        this.archType = archType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceExtendProductInfoRespDetail showInstanceExtendProductInfoRespDetail =
            (ShowInstanceExtendProductInfoRespDetail) o;
        return Objects.equals(this.tps, showInstanceExtendProductInfoRespDetail.tps)
            && Objects.equals(this.storage, showInstanceExtendProductInfoRespDetail.storage)
            && Objects.equals(this.partitionNum, showInstanceExtendProductInfoRespDetail.partitionNum)
            && Objects.equals(this.productId, showInstanceExtendProductInfoRespDetail.productId)
            && Objects.equals(this.specCode, showInstanceExtendProductInfoRespDetail.specCode)
            && Objects.equals(this.io, showInstanceExtendProductInfoRespDetail.io)
            && Objects.equals(this.bandwidth, showInstanceExtendProductInfoRespDetail.bandwidth)
            && Objects.equals(this.recommendMaxConsGroups,
                showInstanceExtendProductInfoRespDetail.recommendMaxConsGroups)
            && Objects.equals(this.unavailableZones, showInstanceExtendProductInfoRespDetail.unavailableZones)
            && Objects.equals(this.availableZones, showInstanceExtendProductInfoRespDetail.availableZones)
            && Objects.equals(this.ecsFlavorId, showInstanceExtendProductInfoRespDetail.ecsFlavorId)
            && Objects.equals(this.archType, showInstanceExtendProductInfoRespDetail.archType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tps,
            storage,
            partitionNum,
            productId,
            specCode,
            io,
            bandwidth,
            recommendMaxConsGroups,
            unavailableZones,
            availableZones,
            ecsFlavorId,
            archType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceExtendProductInfoRespDetail {\n");
        sb.append("    tps: ").append(toIndentedString(tps)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    partitionNum: ").append(toIndentedString(partitionNum)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    io: ").append(toIndentedString(io)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    recommendMaxConsGroups: ").append(toIndentedString(recommendMaxConsGroups)).append("\n");
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
