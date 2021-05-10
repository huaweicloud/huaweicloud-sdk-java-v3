package com.huaweicloud.sdk.iec.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新Vpc参数
 */
public class UpdateVpcOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr")
    
    private String cidr;

    public UpdateVpcOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 虚拟私有云名称  取值范围：0-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）  约束：同一个帐号下的VPC不允许重名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateVpcOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    


    /**
     * 虚拟私有云下可用子网的范围。  约束条件：  SYSTEM模式，cidr取值范围：10.0.0.0/8~10.255.0.0/16或者172.16.0.0/12 ~ 172.31.0.0/16或者192.168.0.0/16 。 [CUSTOMER模式，cidr的取值范围：10.0.0.0/8~10.255.255.0/24或者172.16.0.0/12 ~ 172.32.255.0/24或者192.168.0.0/16~192.168.255.0/24。](tag:internal)
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVpcOption updateVpcOption = (UpdateVpcOption) o;
        return Objects.equals(this.name, updateVpcOption.name) &&
            Objects.equals(this.cidr, updateVpcOption.cidr);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, cidr);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
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

