package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 虚拟私有云的请求数据对象。
 */
public class CreateVpcOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public CreateVpcOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 虚拟私有云名称  取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）  约束：同一个帐号下的名称不能重复
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVpcOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 虚拟私有云下可用子网的范围。  约束： SYSTEM模式，cidr取值范围：10.0.0.0/8~10.255.0.0/16或者172.16.0.0/12 ~ 172.31.0.0/16或者192.168.0.0/16 。 [CUSTOMER模式，cidr的取值范围：10.0.0.0/8~10.255.255.0/24或者172.16.0.0/12 ~ 172.32.255.0/24或者192.168.0.0/16~192.168.255.0/24。](tag:internal)
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public CreateVpcOption withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 虚拟私有云的模式，支持的取值范围如下：  SYSTEM：该类型网络，系统会自动按照实际需要创建足够的子网。 CUSTOMER：该类型网络，用户需要完全按照自己站点的需要，去申请足够的子网。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVpcOption that = (CreateVpcOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.cidr, that.cidr)
            && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cidr, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
