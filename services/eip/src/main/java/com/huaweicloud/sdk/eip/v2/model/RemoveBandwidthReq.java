package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.RemoveBandwidthDict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 共享带宽移除弹性公网IP的请求体
 */
public class RemoveBandwidthReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private RemoveBandwidthDict bandwidth = null;

    public RemoveBandwidthReq withBandwidth(RemoveBandwidthDict bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public RemoveBandwidthReq withBandwidth(Consumer<RemoveBandwidthDict> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new RemoveBandwidthDict();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public RemoveBandwidthDict getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(RemoveBandwidthDict bandwidth) {
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
        RemoveBandwidthReq removeBandwidthReq = (RemoveBandwidthReq) o;
        return Objects.equals(this.bandwidth, removeBandwidthReq.bandwidth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveBandwidthReq {\n");
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

