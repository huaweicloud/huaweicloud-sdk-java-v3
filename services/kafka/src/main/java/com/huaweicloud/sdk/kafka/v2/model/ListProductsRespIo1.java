package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListProductsRespIo1
 */
public class ListProductsRespIo1 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_type")

    private String ioType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_spec_code")

    private String storageSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable_zones")

    private List<String> unavailableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    public ListProductsRespIo1 withIoType(String ioType) {
        this.ioType = ioType;
        return this;
    }

    /**
     * **参数解释**： IO类型。 **取值范围**： 不涉及。
     * @return ioType
     */
    public String getIoType() {
        return ioType;
    }

    public void setIoType(String ioType) {
        this.ioType = ioType;
    }

    public ListProductsRespIo1 withStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
        return this;
    }

    /**
     * **参数解释**： IO规格。 **取值范围**： 不涉及。
     * @return storageSpecCode
     */
    public String getStorageSpecCode() {
        return storageSpecCode;
    }

    public void setStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
    }

    public ListProductsRespIo1 withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ListProductsRespIo1 addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ListProductsRespIo1 withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * **参数解释**： IO未售罄的可用区列表。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public ListProductsRespIo1 withUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
        return this;
    }

    public ListProductsRespIo1 addUnavailableZonesItem(String unavailableZonesItem) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        this.unavailableZones.add(unavailableZonesItem);
        return this;
    }

    public ListProductsRespIo1 withUnavailableZones(Consumer<List<String>> unavailableZonesSetter) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        unavailableZonesSetter.accept(this.unavailableZones);
        return this;
    }

    /**
     * **参数解释**： IO已售罄的不可用区列表。
     * @return unavailableZones
     */
    public List<String> getUnavailableZones() {
        return unavailableZones;
    }

    public void setUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
    }

    public ListProductsRespIo1 withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * **参数解释**： 磁盘类型。 **取值范围**： 不涉及。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProductsRespIo1 that = (ListProductsRespIo1) obj;
        return Objects.equals(this.ioType, that.ioType) && Objects.equals(this.storageSpecCode, that.storageSpecCode)
            && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.unavailableZones, that.unavailableZones)
            && Objects.equals(this.volumeType, that.volumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ioType, storageSpecCode, availableZones, unavailableZones, volumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsRespIo1 {\n");
        sb.append("    ioType: ").append(toIndentedString(ioType)).append("\n");
        sb.append("    storageSpecCode: ").append(toIndentedString(storageSpecCode)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    unavailableZones: ").append(toIndentedString(unavailableZones)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
