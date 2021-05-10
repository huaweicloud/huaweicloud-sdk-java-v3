package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.V3NodeBandwidth;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class V3NodeEIPSpec  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="iptype")
    
    private String iptype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private V3NodeBandwidth bandwidth;

    public V3NodeEIPSpec withIptype(String iptype) {
        this.iptype = iptype;
        return this;
    }

    


    /**
     * 弹性IP类型，取值请参见“[[创建云服务器](https://support.huaweicloud.com/api-ecs/zh-cn_topic_0167957246.html)](tag:hws)[[创建云服务器](https://support.huaweicloud.com/intl/zh-cn/api-ecs/zh-cn_topic_0167957246.html)](tag:hws_hk) > eip字段数据结构说明”表中“iptype”参数的描述。
     * @return iptype
     */
    public String getIptype() {
        return iptype;
    }

    public void setIptype(String iptype) {
        this.iptype = iptype;
    }

    

    public V3NodeEIPSpec withBandwidth(V3NodeBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public V3NodeEIPSpec withBandwidth(Consumer<V3NodeBandwidth> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new V3NodeBandwidth();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public V3NodeBandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(V3NodeBandwidth bandwidth) {
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
        V3NodeEIPSpec v3NodeEIPSpec = (V3NodeEIPSpec) o;
        return Objects.equals(this.iptype, v3NodeEIPSpec.iptype) &&
            Objects.equals(this.bandwidth, v3NodeEIPSpec.bandwidth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(iptype, bandwidth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V3NodeEIPSpec {\n");
        sb.append("    iptype: ").append(toIndentedString(iptype)).append("\n");
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

