package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class UpdateVolumeRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    
    private UpdateVolumeOption volume = null;

    public UpdateVolumeRequestBody withVolume(UpdateVolumeOption volume) {
        this.volume = volume;
        return this;
    }

    public UpdateVolumeRequestBody withVolume(Consumer<UpdateVolumeOption> volumeSetter) {
        if(this.volume == null ){
            this.volume = new UpdateVolumeOption();
        }
        volumeSetter.accept(this.volume);
        return this;
    }


    /**
     * Get volume
     * @return volume
     */
    public UpdateVolumeOption getVolume() {
        return volume;
    }

    public void setVolume(UpdateVolumeOption volume) {
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
        UpdateVolumeRequestBody updateVolumeRequestBody = (UpdateVolumeRequestBody) o;
        return Objects.equals(this.volume, updateVolumeRequestBody.volume);
    }
    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVolumeRequestBody {\n");
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

