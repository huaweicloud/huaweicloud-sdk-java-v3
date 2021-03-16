package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * V3NodeBandwidth
 */
public class V3NodeBandwidth  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chargemode")
    
    private String chargemode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sharetype")
    
    private String sharetype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private String size;

    public V3NodeBandwidth withChargemode(String chargemode) {
        this.chargemode = chargemode;
        return this;
    }

    


    /**
     *   带宽的计费类型：  - 未传该字段，表示按带宽计费。 - 字段值为空，表示按带宽计费。 - 字段值为“traffic”，表示按流量计费。 - 字段为其它值，会导致创建云服务器失败。  > -  按带宽计费：按公网传输速率（单位为Mbps）计费。当您的带宽利用率高于10%时，建议优先选择按带宽计费。 > -  按流量计费：按公网传输的数据总量（单位为GB）计费。当您的带宽利用率低于10%时，建议优先选择按流量计费。
     * @return chargemode
     */
    public String getChargemode() {
        return chargemode;
    }

    public void setChargemode(String chargemode) {
        this.chargemode = chargemode;
    }

    

    public V3NodeBandwidth withSharetype(String sharetype) {
        this.sharetype = sharetype;
        return this;
    }

    


    /**
     * 带宽的共享类型，取值请参见“[创建云服务器](https://support.huaweicloud.com/api-ecs/zh-cn_topic_0167957246.html) > bandwidth字段数据结构说明”表中“sharetype”参数的描述。
     * @return sharetype
     */
    public String getSharetype() {
        return sharetype;
    }

    public void setSharetype(String sharetype) {
        this.sharetype = sharetype;
    }

    

    public V3NodeBandwidth withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 带宽大小，取值请参见“[创建云服务器](https://support.huaweicloud.com/api-ecs/zh-cn_topic_0167957246.html) > bandwidth字段数据结构说明”表中“size”参数的描述。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V3NodeBandwidth v3NodeBandwidth = (V3NodeBandwidth) o;
        return Objects.equals(this.chargemode, v3NodeBandwidth.chargemode) &&
            Objects.equals(this.sharetype, v3NodeBandwidth.sharetype) &&
            Objects.equals(this.size, v3NodeBandwidth.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chargemode, sharetype, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V3NodeBandwidth {\n");
        sb.append("    chargemode: ").append(toIndentedString(chargemode)).append("\n");
        sb.append("    sharetype: ").append(toIndentedString(sharetype)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

