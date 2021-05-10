package com.huaweicloud.sdk.iec.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.Volume;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowVolumeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    
    private Volume volume;

    public ShowVolumeResponse withVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public ShowVolumeResponse withVolume(Consumer<Volume> volumeSetter) {
        if(this.volume == null ){
            this.volume = new Volume();
            volumeSetter.accept(this.volume);
        }
        
        return this;
    }


    /**
     * Get volume
     * @return volume
     */
    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
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
        ShowVolumeResponse showVolumeResponse = (ShowVolumeResponse) o;
        return Objects.equals(this.volume, showVolumeResponse.volume);
    }
    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVolumeResponse {\n");
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

