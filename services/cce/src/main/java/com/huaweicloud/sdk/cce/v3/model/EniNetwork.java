package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ENI网络配置，创建集群指定使用云原生网络2.0网络模式时必填。
 */
public class EniNetwork  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eniSubnetId")
    
    private String eniSubnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eniSubnetCIDR")
    
    private String eniSubnetCIDR;

    public EniNetwork withEniSubnetId(String eniSubnetId) {
        this.eniSubnetId = eniSubnetId;
        return this;
    }

    


    /**
     * 用于创建控制节点的subnet的IPv4网络ID(暂不支持IPv6)。获取方法如下：- 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找IPv4网络ID。- 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[[查询子网列表](https://support.huaweicloud.com/api-vpc/vpc_subnet01_0003.html)](tag:hws)[[查询子网列表](https://support.huaweicloud.com/intl/zh-cn/api-vpc/vpc_subnet01_0003.html)](tag:hws_hk)
     * @return eniSubnetId
     */
    public String getEniSubnetId() {
        return eniSubnetId;
    }

    public void setEniSubnetId(String eniSubnetId) {
        this.eniSubnetId = eniSubnetId;
    }

    

    public EniNetwork withEniSubnetCIDR(String eniSubnetCIDR) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EniNetwork eniNetwork = (EniNetwork) o;
        return Objects.equals(this.eniSubnetId, eniNetwork.eniSubnetId) &&
            Objects.equals(this.eniSubnetCIDR, eniNetwork.eniSubnetCIDR);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eniSubnetId, eniSubnetCIDR);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EniNetwork {\n");
        sb.append("    eniSubnetId: ").append(toIndentedString(eniSubnetId)).append("\n");
        sb.append("    eniSubnetCIDR: ").append(toIndentedString(eniSubnetCIDR)).append("\n");
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

