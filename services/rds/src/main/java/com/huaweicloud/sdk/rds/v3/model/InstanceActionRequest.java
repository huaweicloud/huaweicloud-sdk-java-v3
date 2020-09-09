package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.EnlargeVolume;
import com.huaweicloud.sdk.rds.v3.model.InstanceActionRequestRestart;
import com.huaweicloud.sdk.rds.v3.model.ResizeFlavorRequest;
import com.huaweicloud.sdk.rds.v3.model.Single2Ha;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * InstanceActionRequest
 */
public class InstanceActionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resize_flavor")
    
    private ResizeFlavorRequest resizeFlavor = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enlarge_volume")
    
    private EnlargeVolume enlargeVolume = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restart")
    
    private InstanceActionRequestRestart restart = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="single_to_ha")
    
    private Single2Ha singleToHa = null;

    public InstanceActionRequest withResizeFlavor(ResizeFlavorRequest resizeFlavor) {
        this.resizeFlavor = resizeFlavor;
        return this;
    }

    public InstanceActionRequest withResizeFlavor(Consumer<ResizeFlavorRequest> resizeFlavorSetter) {
        if(this.resizeFlavor == null ){
            this.resizeFlavor = new ResizeFlavorRequest();
            resizeFlavorSetter.accept(this.resizeFlavor);
        }
        
        return this;
    }


    /**
     * Get resizeFlavor
     * @return resizeFlavor
     */
    public ResizeFlavorRequest getResizeFlavor() {
        return resizeFlavor;
    }

    public void setResizeFlavor(ResizeFlavorRequest resizeFlavor) {
        this.resizeFlavor = resizeFlavor;
    }

    public InstanceActionRequest withEnlargeVolume(EnlargeVolume enlargeVolume) {
        this.enlargeVolume = enlargeVolume;
        return this;
    }

    public InstanceActionRequest withEnlargeVolume(Consumer<EnlargeVolume> enlargeVolumeSetter) {
        if(this.enlargeVolume == null ){
            this.enlargeVolume = new EnlargeVolume();
            enlargeVolumeSetter.accept(this.enlargeVolume);
        }
        
        return this;
    }


    /**
     * Get enlargeVolume
     * @return enlargeVolume
     */
    public EnlargeVolume getEnlargeVolume() {
        return enlargeVolume;
    }

    public void setEnlargeVolume(EnlargeVolume enlargeVolume) {
        this.enlargeVolume = enlargeVolume;
    }

    public InstanceActionRequest withRestart(InstanceActionRequestRestart restart) {
        this.restart = restart;
        return this;
    }

    public InstanceActionRequest withRestart(Consumer<InstanceActionRequestRestart> restartSetter) {
        if(this.restart == null ){
            this.restart = new InstanceActionRequestRestart();
            restartSetter.accept(this.restart);
        }
        
        return this;
    }


    /**
     * Get restart
     * @return restart
     */
    public InstanceActionRequestRestart getRestart() {
        return restart;
    }

    public void setRestart(InstanceActionRequestRestart restart) {
        this.restart = restart;
    }

    public InstanceActionRequest withSingleToHa(Single2Ha singleToHa) {
        this.singleToHa = singleToHa;
        return this;
    }

    public InstanceActionRequest withSingleToHa(Consumer<Single2Ha> singleToHaSetter) {
        if(this.singleToHa == null ){
            this.singleToHa = new Single2Ha();
            singleToHaSetter.accept(this.singleToHa);
        }
        
        return this;
    }


    /**
     * Get singleToHa
     * @return singleToHa
     */
    public Single2Ha getSingleToHa() {
        return singleToHa;
    }

    public void setSingleToHa(Single2Ha singleToHa) {
        this.singleToHa = singleToHa;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceActionRequest instanceActionRequest = (InstanceActionRequest) o;
        return Objects.equals(this.resizeFlavor, instanceActionRequest.resizeFlavor) &&
            Objects.equals(this.enlargeVolume, instanceActionRequest.enlargeVolume) &&
            Objects.equals(this.restart, instanceActionRequest.restart) &&
            Objects.equals(this.singleToHa, instanceActionRequest.singleToHa);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resizeFlavor, enlargeVolume, restart, singleToHa);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceActionRequest {\n");
        sb.append("    resizeFlavor: ").append(toIndentedString(resizeFlavor)).append("\n");
        sb.append("    enlargeVolume: ").append(toIndentedString(enlargeVolume)).append("\n");
        sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
        sb.append("    singleToHa: ").append(toIndentedString(singleToHa)).append("\n");
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

