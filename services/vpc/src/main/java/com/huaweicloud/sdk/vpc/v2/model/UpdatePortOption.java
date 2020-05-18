package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.AllowedAddressPair;
import com.huaweicloud.sdk.vpc.v2.model.ExtraDhcpOpt;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class UpdatePortOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<String> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="allowed_address_pairs")
    
    private List<AllowedAddressPair> allowedAddressPairs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra_dhcp_opts")
    
    private List<ExtraDhcpOpt> extraDhcpOpts = null;
    
    public UpdatePortOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 功能说明：端口名称 取值范围：0~255个字符，支持中文、英文、字母、_(下划线)、-（中划线）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdatePortOption withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public UpdatePortOption addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public UpdatePortOption withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组的ID列表
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public UpdatePortOption withAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
        return this;
    }

    
    public UpdatePortOption addAllowedAddressPairsItem(AllowedAddressPair allowedAddressPairsItem) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        this.allowedAddressPairs.add(allowedAddressPairsItem);
        return this;
    }

    public UpdatePortOption withAllowedAddressPairs(Consumer<List<AllowedAddressPair>> allowedAddressPairsSetter) {
        if(this.allowedAddressPairs == null ){
            this.allowedAddressPairs = new ArrayList<>();
        }
        allowedAddressPairsSetter.accept(this.allowedAddressPairs);
        return this;
    }

    /**
     * 功能说明：IP/Mac对列表 约束： - IP地址不允许为 “0.0.0.0”。 - 如果配置地址池较大（CIDR掩码小于24位），建议为该port配置一个单独的安全组。 - 为虚拟IP配置后端ECS场景，allowed_address_pairs中配置的IP地址，必须为ECS网卡已有的IP地址，否则可能会导致虚拟IP通信异常。
     * @return allowedAddressPairs
     */
    public List<AllowedAddressPair> getAllowedAddressPairs() {
        return allowedAddressPairs;
    }

    public void setAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
    }

    public UpdatePortOption withExtraDhcpOpts(List<ExtraDhcpOpt> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
        return this;
    }

    
    public UpdatePortOption addExtraDhcpOptsItem(ExtraDhcpOpt extraDhcpOptsItem) {
        if (this.extraDhcpOpts == null) {
            this.extraDhcpOpts = new ArrayList<>();
        }
        this.extraDhcpOpts.add(extraDhcpOptsItem);
        return this;
    }

    public UpdatePortOption withExtraDhcpOpts(Consumer<List<ExtraDhcpOpt>> extraDhcpOptsSetter) {
        if(this.extraDhcpOpts == null ){
            this.extraDhcpOpts = new ArrayList<>();
        }
        extraDhcpOptsSetter.accept(this.extraDhcpOpts);
        return this;
    }

    /**
     * 功能说明：DHCP的扩展Option(扩展属性)
     * @return extraDhcpOpts
     */
    public List<ExtraDhcpOpt> getExtraDhcpOpts() {
        return extraDhcpOpts;
    }

    public void setExtraDhcpOpts(List<ExtraDhcpOpt> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePortOption updatePortOption = (UpdatePortOption) o;
        return Objects.equals(this.name, updatePortOption.name) &&
            Objects.equals(this.securityGroups, updatePortOption.securityGroups) &&
            Objects.equals(this.allowedAddressPairs, updatePortOption.allowedAddressPairs) &&
            Objects.equals(this.extraDhcpOpts, updatePortOption.extraDhcpOpts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, securityGroups, allowedAddressPairs, extraDhcpOpts);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePortOption {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
            sb.append("    allowedAddressPairs: ").append(toIndentedString(allowedAddressPairs)).append("\n");
            sb.append("    extraDhcpOpts: ").append(toIndentedString(extraDhcpOpts)).append("\n");
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

