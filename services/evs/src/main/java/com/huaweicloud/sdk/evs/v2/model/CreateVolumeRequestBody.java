package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.BssParamForCreateVolume;
import com.huaweicloud.sdk.evs.v2.model.CreateVolumeOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class CreateVolumeRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bssParam")
    
    private BssParamForCreateVolume bssParam = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    
    private CreateVolumeOption volume = null;

    public CreateVolumeRequestBody withBssParam(BssParamForCreateVolume bssParam) {
        this.bssParam = bssParam;
        return this;
    }

    public CreateVolumeRequestBody withBssParam(Consumer<BssParamForCreateVolume> bssParamSetter) {
        if(this.bssParam == null ){
            this.bssParam = new BssParamForCreateVolume();
        }
        bssParamSetter.accept(this.bssParam);
        return this;
    }


    /**
     * Get bssParam
     * @return bssParam
     */
    public BssParamForCreateVolume getBssParam() {
        return bssParam;
    }

    public void setBssParam(BssParamForCreateVolume bssParam) {
        this.bssParam = bssParam;
    }

    public CreateVolumeRequestBody withVolume(CreateVolumeOption volume) {
        this.volume = volume;
        return this;
    }

    public CreateVolumeRequestBody withVolume(Consumer<CreateVolumeOption> volumeSetter) {
        if(this.volume == null ){
            this.volume = new CreateVolumeOption();
        }
        volumeSetter.accept(this.volume);
        return this;
    }


    /**
     * Get volume
     * @return volume
     */
    public CreateVolumeOption getVolume() {
        return volume;
    }

    public void setVolume(CreateVolumeOption volume) {
        this.volume = volume;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVolumeRequestBody createVolumeRequestBody = (CreateVolumeRequestBody) o;
        return Objects.equals(this.bssParam, createVolumeRequestBody.bssParam) &&
            Objects.equals(this.volume, createVolumeRequestBody.volume);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bssParam, volume);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVolumeRequestBody {\n");
            sb.append("    bssParam: ").append(toIndentedString(bssParam)).append("\n");
            sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

