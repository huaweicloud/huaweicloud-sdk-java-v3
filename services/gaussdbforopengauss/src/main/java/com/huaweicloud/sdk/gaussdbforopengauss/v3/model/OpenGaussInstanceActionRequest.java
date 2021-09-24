package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussEnlargeVolume;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussExpandCluster;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class OpenGaussInstanceActionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expand_cluster")
    
    
    private OpenGaussExpandCluster expandCluster;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enlarge_volume")
    
    
    private OpenGaussEnlargeVolume enlargeVolume;

    public OpenGaussInstanceActionRequest withExpandCluster(OpenGaussExpandCluster expandCluster) {
        this.expandCluster = expandCluster;
        return this;
    }

    public OpenGaussInstanceActionRequest withExpandCluster(Consumer<OpenGaussExpandCluster> expandClusterSetter) {
        if(this.expandCluster == null ){
            this.expandCluster = new OpenGaussExpandCluster();
            expandClusterSetter.accept(this.expandCluster);
        }
        
        return this;
    }


    /**
     * Get expandCluster
     * @return expandCluster
     */
    public OpenGaussExpandCluster getExpandCluster() {
        return expandCluster;
    }

    public void setExpandCluster(OpenGaussExpandCluster expandCluster) {
        this.expandCluster = expandCluster;
    }

    

    public OpenGaussInstanceActionRequest withEnlargeVolume(OpenGaussEnlargeVolume enlargeVolume) {
        this.enlargeVolume = enlargeVolume;
        return this;
    }

    public OpenGaussInstanceActionRequest withEnlargeVolume(Consumer<OpenGaussEnlargeVolume> enlargeVolumeSetter) {
        if(this.enlargeVolume == null ){
            this.enlargeVolume = new OpenGaussEnlargeVolume();
            enlargeVolumeSetter.accept(this.enlargeVolume);
        }
        
        return this;
    }


    /**
     * Get enlargeVolume
     * @return enlargeVolume
     */
    public OpenGaussEnlargeVolume getEnlargeVolume() {
        return enlargeVolume;
    }

    public void setEnlargeVolume(OpenGaussEnlargeVolume enlargeVolume) {
        this.enlargeVolume = enlargeVolume;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenGaussInstanceActionRequest openGaussInstanceActionRequest = (OpenGaussInstanceActionRequest) o;
        return Objects.equals(this.expandCluster, openGaussInstanceActionRequest.expandCluster) &&
            Objects.equals(this.enlargeVolume, openGaussInstanceActionRequest.enlargeVolume);
    }
    @Override
    public int hashCode() {
        return Objects.hash(expandCluster, enlargeVolume);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussInstanceActionRequest {\n");
        sb.append("    expandCluster: ").append(toIndentedString(expandCluster)).append("\n");
        sb.append("    enlargeVolume: ").append(toIndentedString(enlargeVolume)).append("\n");
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

