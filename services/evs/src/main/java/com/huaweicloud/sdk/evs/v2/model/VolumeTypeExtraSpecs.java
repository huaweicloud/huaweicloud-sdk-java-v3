package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 云硬盘类型的规格。
 */
public class VolumeTypeExtraSpecs  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="RESKEY:availability_zones")
    
    private String reSKEYAvailabilityZones;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability-zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-vendor-extended:sold_out_availability_zones")
    
    private String osVendorExtendedSoldOutAvailabilityZones;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_backend_name")
    
    private String volumeBackendName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="HW:availability_zone")
    
    private String hwAvailabilityZone;

    public VolumeTypeExtraSpecs withReSKEYAvailabilityZones(String reSKEYAvailabilityZones) {
        this.reSKEYAvailabilityZones = reSKEYAvailabilityZones;
        return this;
    }

    


    /**
     * 支持当前云硬盘类型的可用区列表。
     * @return reSKEYAvailabilityZones
     */
    public String getReSKEYAvailabilityZones() {
        return reSKEYAvailabilityZones;
    }

    public void setReSKEYAvailabilityZones(String reSKEYAvailabilityZones) {
        this.reSKEYAvailabilityZones = reSKEYAvailabilityZones;
    }

    public VolumeTypeExtraSpecs withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 预留属性。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public VolumeTypeExtraSpecs withOsVendorExtendedSoldOutAvailabilityZones(String osVendorExtendedSoldOutAvailabilityZones) {
        this.osVendorExtendedSoldOutAvailabilityZones = osVendorExtendedSoldOutAvailabilityZones;
        return this;
    }

    


    /**
     * 当前云硬盘类型已售罄的可用区列表。
     * @return osVendorExtendedSoldOutAvailabilityZones
     */
    public String getOsVendorExtendedSoldOutAvailabilityZones() {
        return osVendorExtendedSoldOutAvailabilityZones;
    }

    public void setOsVendorExtendedSoldOutAvailabilityZones(String osVendorExtendedSoldOutAvailabilityZones) {
        this.osVendorExtendedSoldOutAvailabilityZones = osVendorExtendedSoldOutAvailabilityZones;
    }

    public VolumeTypeExtraSpecs withVolumeBackendName(String volumeBackendName) {
        this.volumeBackendName = volumeBackendName;
        return this;
    }

    


    /**
     * 预留属性。
     * @return volumeBackendName
     */
    public String getVolumeBackendName() {
        return volumeBackendName;
    }

    public void setVolumeBackendName(String volumeBackendName) {
        this.volumeBackendName = volumeBackendName;
    }

    public VolumeTypeExtraSpecs withHwAvailabilityZone(String hwAvailabilityZone) {
        this.hwAvailabilityZone = hwAvailabilityZone;
        return this;
    }

    


    /**
     * 预留属性。
     * @return hwAvailabilityZone
     */
    public String getHwAvailabilityZone() {
        return hwAvailabilityZone;
    }

    public void setHwAvailabilityZone(String hwAvailabilityZone) {
        this.hwAvailabilityZone = hwAvailabilityZone;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VolumeTypeExtraSpecs volumeTypeExtraSpecs = (VolumeTypeExtraSpecs) o;
        return Objects.equals(this.reSKEYAvailabilityZones, volumeTypeExtraSpecs.reSKEYAvailabilityZones) &&
            Objects.equals(this.availabilityZone, volumeTypeExtraSpecs.availabilityZone) &&
            Objects.equals(this.osVendorExtendedSoldOutAvailabilityZones, volumeTypeExtraSpecs.osVendorExtendedSoldOutAvailabilityZones) &&
            Objects.equals(this.volumeBackendName, volumeTypeExtraSpecs.volumeBackendName) &&
            Objects.equals(this.hwAvailabilityZone, volumeTypeExtraSpecs.hwAvailabilityZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(reSKEYAvailabilityZones, availabilityZone, osVendorExtendedSoldOutAvailabilityZones, volumeBackendName, hwAvailabilityZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeTypeExtraSpecs {\n");
            sb.append("    reSKEYAvailabilityZones: ").append(toIndentedString(reSKEYAvailabilityZones)).append("\n");
            sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
            sb.append("    osVendorExtendedSoldOutAvailabilityZones: ").append(toIndentedString(osVendorExtendedSoldOutAvailabilityZones)).append("\n");
            sb.append("    volumeBackendName: ").append(toIndentedString(volumeBackendName)).append("\n");
            sb.append("    hwAvailabilityZone: ").append(toIndentedString(hwAvailabilityZone)).append("\n");
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

