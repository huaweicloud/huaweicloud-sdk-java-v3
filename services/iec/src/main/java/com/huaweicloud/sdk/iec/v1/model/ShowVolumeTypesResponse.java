package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVolumeTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_types")

    private List<VolumeType> volumeTypes = null;

    public ShowVolumeTypesResponse withVolumeTypes(List<VolumeType> volumeTypes) {
        this.volumeTypes = volumeTypes;
        return this;
    }

    public ShowVolumeTypesResponse addVolumeTypesItem(VolumeType volumeTypesItem) {
        if (this.volumeTypes == null) {
            this.volumeTypes = new ArrayList<>();
        }
        this.volumeTypes.add(volumeTypesItem);
        return this;
    }

    public ShowVolumeTypesResponse withVolumeTypes(Consumer<List<VolumeType>> volumeTypesSetter) {
        if (this.volumeTypes == null) {
            this.volumeTypes = new ArrayList<>();
        }
        volumeTypesSetter.accept(this.volumeTypes);
        return this;
    }

    /**
     * 硬盘类型列表。
     * @return volumeTypes
     */
    public List<VolumeType> getVolumeTypes() {
        return volumeTypes;
    }

    public void setVolumeTypes(List<VolumeType> volumeTypes) {
        this.volumeTypes = volumeTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowVolumeTypesResponse showVolumeTypesResponse = (ShowVolumeTypesResponse) o;
        return Objects.equals(this.volumeTypes, showVolumeTypesResponse.volumeTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVolumeTypesResponse {\n");
        sb.append("    volumeTypes: ").append(toIndentedString(volumeTypes)).append("\n");
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
