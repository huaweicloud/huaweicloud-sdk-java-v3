package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Node network parameters.
 */
public class HostNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    @JacksonXmlProperty(localName = "vpc")

    private String vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet")

    @JacksonXmlProperty(localName = "subnet")

    private String subnet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "SecurityGroup")

    @JacksonXmlProperty(localName = "SecurityGroup")

    private String securityGroup;

    public HostNetwork withVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * 用于创建控制节点的VPC的ID。 获取方法如下：  - 方法1：登录虚拟私有云服务的控制台界面，在虚拟私有云的详情页面查找VPC ID。 - 方法2：通过虚拟私有云服务的API接口查询。   [链接请参见[查询VPC列表](https://support.huaweicloud.com/api-vpc/vpc_api01_0003.html)](tag:hws)   [链接请参见[查询VPC列表](https://support.huaweicloud.com/intl/zh-cn/api-vpc/vpc_api01_0003.html)](tag:hws_hk)    > - 当前vpc-router容器网络模型不支持对接含拓展网段的VPC。 > - 若您的用户类型为企业用户，则需要保证vpc所属的企业项目ID和集群创建时选择的企业项目ID一致。集群所属的企业项目ID通过extendParam字段下的enterpriseProjectId体现，该值默认为\"0\"，表示默认的企业项目。
     * @return vpc
     */
    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public HostNetwork withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * 用于创建控制节点的subnet的网络ID。获取方法如下：  - 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找网络ID。 - 方法2：通过虚拟私有云服务的查询子网列表接口查询。   [链接请参见[查询子网列表](https://support.huaweicloud.com/api-vpc/vpc_subnet01_0003.html)](tag:hws)   [链接请参见[查询子网列表](https://support.huaweicloud.com/intl/zh-cn/api-vpc/vpc_subnet01_0003.html)](tag:hws_hk)  
     * @return subnet
     */
    public String getSubnet() {
        return subnet;
    }

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    public HostNetwork withSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    /**
     * 节点安全组ID，创建时指定无效 
     * @return securityGroup
     */
    public String getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostNetwork hostNetwork = (HostNetwork) o;
        return Objects.equals(this.vpc, hostNetwork.vpc) && Objects.equals(this.subnet, hostNetwork.subnet)
            && Objects.equals(this.securityGroup, hostNetwork.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpc, subnet, securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostNetwork {\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
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
