package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.VolumeType;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class CinderListVolumeTypesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_types")
    
    private List<VolumeType> volumeTypes = null;
    
    public CinderListVolumeTypesResponse withVolumeTypes(List<VolumeType> volumeTypes) {
        this.volumeTypes = volumeTypes;
        return this;
    }

    
    public CinderListVolumeTypesResponse addVolumeTypesItem(VolumeType volumeTypesItem) {
        if (this.volumeTypes == null) {
            this.volumeTypes = new ArrayList<>();
        }
        this.volumeTypes.add(volumeTypesItem);
        return this;
    }

    public CinderListVolumeTypesResponse withVolumeTypes(Consumer<List<VolumeType>> volumeTypesSetter) {
        if(this.volumeTypes == null ){
            this.volumeTypes = new ArrayList<>();
        }
        volumeTypesSetter.accept(this.volumeTypes);
        return this;
    }

    /**
     * 云硬盘类型列表信息。
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
        CinderListVolumeTypesResponse cinderListVolumeTypesResponse = (CinderListVolumeTypesResponse) o;
        return Objects.equals(this.volumeTypes, cinderListVolumeTypesResponse.volumeTypes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(volumeTypes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderListVolumeTypesResponse {\n");
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

