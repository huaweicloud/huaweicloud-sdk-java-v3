package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListProductsRespIo
 */
public class ListProductsRespIo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="io_type")
    
    private String ioType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage_spec_code")
    
    private String storageSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available_zones")
    
    private List<String> availableZones = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unavailable_zones")
    
    private List<String> unavailableZones = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_type")
    
    private String volumeType;

    public ListProductsRespIo withIoType(String ioType) {
        this.ioType = ioType;
        return this;
    }

    


    /**
     * IO类型。
     * @return ioType
     */
    public String getIoType() {
        return ioType;
    }

    public void setIoType(String ioType) {
        this.ioType = ioType;
    }

    public ListProductsRespIo withStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
        return this;
    }

    


    /**
     * IO规格。
     * @return storageSpecCode
     */
    public String getStorageSpecCode() {
        return storageSpecCode;
    }

    public void setStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
    }

    public ListProductsRespIo withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    
    public ListProductsRespIo addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ListProductsRespIo withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if(this.availableZones == null ){
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * IO未售罄的可用区列表。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public ListProductsRespIo withUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
        return this;
    }

    
    public ListProductsRespIo addUnavailableZonesItem(String unavailableZonesItem) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        this.unavailableZones.add(unavailableZonesItem);
        return this;
    }

    public ListProductsRespIo withUnavailableZones(Consumer<List<String>> unavailableZonesSetter) {
        if(this.unavailableZones == null ){
            this.unavailableZones = new ArrayList<>();
        }
        unavailableZonesSetter.accept(this.unavailableZones);
        return this;
    }

    /**
     * IO已售罄的不可用区列表。
     * @return unavailableZones
     */
    public List<String> getUnavailableZones() {
        return unavailableZones;
    }

    public void setUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
    }

    public ListProductsRespIo withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    


    /**
     * 磁盘类型。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProductsRespIo listProductsRespIo = (ListProductsRespIo) o;
        return Objects.equals(this.ioType, listProductsRespIo.ioType) &&
            Objects.equals(this.storageSpecCode, listProductsRespIo.storageSpecCode) &&
            Objects.equals(this.availableZones, listProductsRespIo.availableZones) &&
            Objects.equals(this.unavailableZones, listProductsRespIo.unavailableZones) &&
            Objects.equals(this.volumeType, listProductsRespIo.volumeType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ioType, storageSpecCode, availableZones, unavailableZones, volumeType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsRespIo {\n");
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

