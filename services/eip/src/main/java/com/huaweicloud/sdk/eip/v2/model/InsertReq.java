package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.InsertBandwidthDict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 将弹性公网IP插入共享带宽的请求体
 */
public class InsertReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private InsertBandwidthDict bandwidth = null;

    public InsertReq withBandwidth(InsertBandwidthDict bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public InsertReq withBandwidth(Consumer<InsertBandwidthDict> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new InsertBandwidthDict();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public InsertBandwidthDict getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(InsertBandwidthDict bandwidth) {
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
        InsertReq insertReq = (InsertReq) o;
        return Objects.equals(this.bandwidth, insertReq.bandwidth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsertReq {\n");
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

