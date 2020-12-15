package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ENI网络配置，创建集群指定使用Yangtse网络模式时必填。
 */
public class ENINetwork  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eniSubnetCIDR")
    
    private String eniSubnetCIDR;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eniSubnetId")
    
    private String eniSubnetId;

    public ENINetwork withEniSubnetCIDR(String eniSubnetCIDR) {
        this.eniSubnetCIDR = eniSubnetCIDR;
        return this;
    }

    


    /**
     * ENI子网CIDR
     * @return eniSubnetCIDR
     */
    public String getEniSubnetCIDR() {
        return eniSubnetCIDR;
    }

    public void setEniSubnetCIDR(String eniSubnetCIDR) {
        this.eniSubnetCIDR = eniSubnetCIDR;
    }

    public ENINetwork withEniSubnetId(String eniSubnetId) {
        this.eniSubnetId = eniSubnetId;
        return this;
    }

    


    /**
     * eni子网ID
     * @return eniSubnetId
     */
    public String getEniSubnetId() {
        return eniSubnetId;
    }

    public void setEniSubnetId(String eniSubnetId) {
        this.eniSubnetId = eniSubnetId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ENINetwork enINetwork = (ENINetwork) o;
        return Objects.equals(this.eniSubnetCIDR, enINetwork.eniSubnetCIDR) &&
            Objects.equals(this.eniSubnetId, enINetwork.eniSubnetId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eniSubnetCIDR, eniSubnetId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ENINetwork {\n");
        sb.append("    eniSubnetCIDR: ").append(toIndentedString(eniSubnetCIDR)).append("\n");
        sb.append("    eniSubnetId: ").append(toIndentedString(eniSubnetId)).append("\n");
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

