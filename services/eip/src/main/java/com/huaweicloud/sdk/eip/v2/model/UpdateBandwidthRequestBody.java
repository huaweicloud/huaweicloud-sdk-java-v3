package com.huaweicloud.sdk.eip.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.UpdateBandwidthOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新带宽对象的请求体(name,size必须有一个参数)
 */
public class UpdateBandwidthRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private UpdateBandwidthOption bandwidth;

    public UpdateBandwidthRequestBody withBandwidth(UpdateBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public UpdateBandwidthRequestBody withBandwidth(Consumer<UpdateBandwidthOption> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new UpdateBandwidthOption();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public UpdateBandwidthOption getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(UpdateBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateBandwidthRequestBody updateBandwidthRequestBody = (UpdateBandwidthRequestBody) o;
        return Objects.equals(this.bandwidth, updateBandwidthRequestBody.bandwidth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBandwidthRequestBody {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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

