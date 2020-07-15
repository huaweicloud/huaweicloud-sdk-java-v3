package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.UpdateBandwidthDict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新带宽对象的请求体(name,size必须有一个参数)
 */
public class UpdateBandwidthReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private UpdateBandwidthDict bandwidth = null;

    public UpdateBandwidthReq withBandwidth(UpdateBandwidthDict bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public UpdateBandwidthReq withBandwidth(Consumer<UpdateBandwidthDict> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new UpdateBandwidthDict();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public UpdateBandwidthDict getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(UpdateBandwidthDict bandwidth) {
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
        UpdateBandwidthReq updateBandwidthReq = (UpdateBandwidthReq) o;
        return Objects.equals(this.bandwidth, updateBandwidthReq.bandwidth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBandwidthReq {\n");
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

