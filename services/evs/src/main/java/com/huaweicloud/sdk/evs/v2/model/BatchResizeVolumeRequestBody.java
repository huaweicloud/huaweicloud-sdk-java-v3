package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class BatchResizeVolumeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<VolumesForBatchResizeVolume> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bss_param")

    private PrepaidParamForBatchResizeVolume bssParam;

    public BatchResizeVolumeRequestBody withVolumes(List<VolumesForBatchResizeVolume> volumes) {
        this.volumes = volumes;
        return this;
    }

    public BatchResizeVolumeRequestBody addVolumesItem(VolumesForBatchResizeVolume volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public BatchResizeVolumeRequestBody withVolumes(Consumer<List<VolumesForBatchResizeVolume>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * The list of disks to be expanded.
     * @return volumes
     */
    public List<VolumesForBatchResizeVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<VolumesForBatchResizeVolume> volumes) {
        this.volumes = volumes;
    }

    public BatchResizeVolumeRequestBody withBssParam(PrepaidParamForBatchResizeVolume bssParam) {
        this.bssParam = bssParam;
        return this;
    }

    public BatchResizeVolumeRequestBody withBssParam(Consumer<PrepaidParamForBatchResizeVolume> bssParamSetter) {
        if (this.bssParam == null) {
            this.bssParam = new PrepaidParamForBatchResizeVolume();
            bssParamSetter.accept(this.bssParam);
        }

        return this;
    }

    /**
     * Get bssParam
     * @return bssParam
     */
    public PrepaidParamForBatchResizeVolume getBssParam() {
        return bssParam;
    }

    public void setBssParam(PrepaidParamForBatchResizeVolume bssParam) {
        this.bssParam = bssParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchResizeVolumeRequestBody that = (BatchResizeVolumeRequestBody) obj;
        return Objects.equals(this.volumes, that.volumes) && Objects.equals(this.bssParam, that.bssParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumes, bssParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchResizeVolumeRequestBody {\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    bssParam: ").append(toIndentedString(bssParam)).append("\n");
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
