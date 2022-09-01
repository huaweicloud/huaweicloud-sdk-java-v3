package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EngineReference
 */
public class EngineReference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    @JacksonXmlProperty(localName = "vpc")

    private String vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_list")

    @JacksonXmlProperty(localName = "az_list")

    private List<String> azList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_id")

    @JacksonXmlProperty(localName = "network_id")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr")

    @JacksonXmlProperty(localName = "subnet_cidr")

    private String subnetCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr_v6")

    @JacksonXmlProperty(localName = "subnet_cidr_v6")

    private String subnetCidrV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_gateway")

    @JacksonXmlProperty(localName = "subnet_gateway")

    private String subnetGateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_id")

    @JacksonXmlProperty(localName = "public_ip_id")

    private String publicIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_limit")

    @JacksonXmlProperty(localName = "service_limit")

    private Integer serviceLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_limit")

    @JacksonXmlProperty(localName = "instance_limit")

    private Integer instanceLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    @JacksonXmlProperty(localName = "inputs")

    private Map<String, String> inputs = null;

    public EngineReference withVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * vpc名称
     * @return vpc
     */
    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public EngineReference withAzList(List<String> azList) {
        this.azList = azList;
        return this;
    }

    public EngineReference addAzListItem(String azListItem) {
        if (this.azList == null) {
            this.azList = new ArrayList<>();
        }
        this.azList.add(azListItem);
        return this;
    }

    public EngineReference withAzList(Consumer<List<String>> azListSetter) {
        if (this.azList == null) {
            this.azList = new ArrayList<>();
        }
        azListSetter.accept(this.azList);
        return this;
    }

    /**
     * 微服务引擎专享版部署的可用区列表
     * @return azList
     */
    public List<String> getAzList() {
        return azList;
    }

    public void setAzList(List<String> azList) {
        this.azList = azList;
    }

    public EngineReference withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * 微服务引擎专享版子网网络ID
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public EngineReference withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * 微服务引擎专享版ipv4子网划分
     * @return subnetCidr
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
    }

    public EngineReference withSubnetCidrV6(String subnetCidrV6) {
        this.subnetCidrV6 = subnetCidrV6;
        return this;
    }

    /**
     * 微服务引擎专享版ipv6子网划分
     * @return subnetCidrV6
     */
    public String getSubnetCidrV6() {
        return subnetCidrV6;
    }

    public void setSubnetCidrV6(String subnetCidrV6) {
        this.subnetCidrV6 = subnetCidrV6;
    }

    public EngineReference withSubnetGateway(String subnetGateway) {
        this.subnetGateway = subnetGateway;
        return this;
    }

    /**
     * 微服务引擎专享版子网网关
     * @return subnetGateway
     */
    public String getSubnetGateway() {
        return subnetGateway;
    }

    public void setSubnetGateway(String subnetGateway) {
        this.subnetGateway = subnetGateway;
    }

    public EngineReference withPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * 微服务引擎专享版公网地址ID
     * @return publicIpId
     */
    public String getPublicIpId() {
        return publicIpId;
    }

    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    public EngineReference withServiceLimit(Integer serviceLimit) {
        this.serviceLimit = serviceLimit;
        return this;
    }

    /**
     * 微服务引擎专享版可支持的微服务总数
     * @return serviceLimit
     */
    public Integer getServiceLimit() {
        return serviceLimit;
    }

    public void setServiceLimit(Integer serviceLimit) {
        this.serviceLimit = serviceLimit;
    }

    public EngineReference withInstanceLimit(Integer instanceLimit) {
        this.instanceLimit = instanceLimit;
        return this;
    }

    /**
     * 微服务引擎专享版可支持的实例总数
     * @return instanceLimit
     */
    public Integer getInstanceLimit() {
        return instanceLimit;
    }

    public void setInstanceLimit(Integer instanceLimit) {
        this.instanceLimit = instanceLimit;
    }

    public EngineReference withInputs(Map<String, String> inputs) {
        this.inputs = inputs;
        return this;
    }

    public EngineReference putInputsItem(String key, String inputsItem) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        this.inputs.put(key, inputsItem);
        return this;
    }

    public EngineReference withInputs(Consumer<Map<String, String>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 微服务引擎专享版附加参数
     * @return inputs
     */
    public Map<String, String> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, String> inputs) {
        this.inputs = inputs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EngineReference engineReference = (EngineReference) o;
        return Objects.equals(this.vpc, engineReference.vpc) && Objects.equals(this.azList, engineReference.azList)
            && Objects.equals(this.networkId, engineReference.networkId)
            && Objects.equals(this.subnetCidr, engineReference.subnetCidr)
            && Objects.equals(this.subnetCidrV6, engineReference.subnetCidrV6)
            && Objects.equals(this.subnetGateway, engineReference.subnetGateway)
            && Objects.equals(this.publicIpId, engineReference.publicIpId)
            && Objects.equals(this.serviceLimit, engineReference.serviceLimit)
            && Objects.equals(this.instanceLimit, engineReference.instanceLimit)
            && Objects.equals(this.inputs, engineReference.inputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpc,
            azList,
            networkId,
            subnetCidr,
            subnetCidrV6,
            subnetGateway,
            publicIpId,
            serviceLimit,
            instanceLimit,
            inputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineReference {\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    azList: ").append(toIndentedString(azList)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
        sb.append("    subnetCidrV6: ").append(toIndentedString(subnetCidrV6)).append("\n");
        sb.append("    subnetGateway: ").append(toIndentedString(subnetGateway)).append("\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
        sb.append("    serviceLimit: ").append(toIndentedString(serviceLimit)).append("\n");
        sb.append("    instanceLimit: ").append(toIndentedString(instanceLimit)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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
