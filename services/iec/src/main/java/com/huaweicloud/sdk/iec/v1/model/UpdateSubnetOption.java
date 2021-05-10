package com.huaweicloud.sdk.iec.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新子网的结构体。
 */
public class UpdateSubnetOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dhcp_enable")
    
    private Boolean dhcpEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="primary_dns")
    
    private String primaryDns;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secondary_dns")
    
    private String secondaryDns;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dnsList")
    
    private List<String> dnsList = null;
    
    public UpdateSubnetOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 子网名称  取值范围：0-64，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateSubnetOption withDhcpEnable(Boolean dhcpEnable) {
        this.dhcpEnable = dhcpEnable;
        return this;
    }

    


    /**
     * 子网是否开启dhcp功能  取值范围：true（开启），false（关闭）  约束：不填时默认为true。当设置为false时，会导致新创建的ECS无法获取IP地址，cloudinit无法注入帐号密码，请谨慎操作。
     * @return dhcpEnable
     */
    public Boolean getDhcpEnable() {
        return dhcpEnable;
    }

    public void setDhcpEnable(Boolean dhcpEnable) {
        this.dhcpEnable = dhcpEnable;
    }

    

    public UpdateSubnetOption withPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
        return this;
    }

    


    /**
     * 子网dns服务器地址1  约束：ip格式
     * @return primaryDns
     */
    public String getPrimaryDns() {
        return primaryDns;
    }

    public void setPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
    }

    

    public UpdateSubnetOption withSecondaryDns(String secondaryDns) {
        this.secondaryDns = secondaryDns;
        return this;
    }

    


    /**
     * 子网dns服务器地址2  约束：ip格式
     * @return secondaryDns
     */
    public String getSecondaryDns() {
        return secondaryDns;
    }

    public void setSecondaryDns(String secondaryDns) {
        this.secondaryDns = secondaryDns;
    }

    

    public UpdateSubnetOption withDnsList(List<String> dnsList) {
        this.dnsList = dnsList;
        return this;
    }

    
    public UpdateSubnetOption addDnsListItem(String dnsListItem) {
        if(this.dnsList == null) {
            this.dnsList = new ArrayList<>();
        }
        this.dnsList.add(dnsListItem);
        return this;
    }

    public UpdateSubnetOption withDnsList(Consumer<List<String>> dnsListSetter) {
        if(this.dnsList == null) {
            this.dnsList = new ArrayList<>();
        }
        dnsListSetter.accept(this.dnsList);
        return this;
    }

    /**
     * 子网dns服务器地址的集合；如果想使用两个以上dns服务器，请使用该字段。  约束：是子网dns服务器地址1跟子网dns服务器地址2的合集的父集
     * @return dnsList
     */
    public List<String> getDnsList() {
        return dnsList;
    }

    public void setDnsList(List<String> dnsList) {
        this.dnsList = dnsList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSubnetOption updateSubnetOption = (UpdateSubnetOption) o;
        return Objects.equals(this.name, updateSubnetOption.name) &&
            Objects.equals(this.dhcpEnable, updateSubnetOption.dhcpEnable) &&
            Objects.equals(this.primaryDns, updateSubnetOption.primaryDns) &&
            Objects.equals(this.secondaryDns, updateSubnetOption.secondaryDns) &&
            Objects.equals(this.dnsList, updateSubnetOption.dnsList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, dhcpEnable, primaryDns, secondaryDns, dnsList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubnetOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dhcpEnable: ").append(toIndentedString(dhcpEnable)).append("\n");
        sb.append("    primaryDns: ").append(toIndentedString(primaryDns)).append("\n");
        sb.append("    secondaryDns: ").append(toIndentedString(secondaryDns)).append("\n");
        sb.append("    dnsList: ").append(toIndentedString(dnsList)).append("\n");
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

