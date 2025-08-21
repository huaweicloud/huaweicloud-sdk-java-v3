package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    private String vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azList")

    private List<String> azList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkId")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetCidr")

    private String subnetCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetCidrV6")

    private String subnetCidrV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetGateway")

    private String subnetGateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicIpId")

    private String publicIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceLimit")

    private String serviceLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceLimit")

    private String instanceLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

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
     * 微服务引擎部署的可用区列表
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
     * 微服务引擎子网网络ID
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
     * 微服务引擎ipv4子网划分
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
     * 微服务引擎ipv6子网划分
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
     * 微服务引擎子网网关
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
     * 微服务引擎公网地址ID
     * @return publicIpId
     */
    public String getPublicIpId() {
        return publicIpId;
    }

    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    public EngineReference withServiceLimit(String serviceLimit) {
        this.serviceLimit = serviceLimit;
        return this;
    }

    /**
     * 微服务引擎可支持的微服务总数
     * @return serviceLimit
     */
    public String getServiceLimit() {
        return serviceLimit;
    }

    public void setServiceLimit(String serviceLimit) {
        this.serviceLimit = serviceLimit;
    }

    public EngineReference withInstanceLimit(String instanceLimit) {
        this.instanceLimit = instanceLimit;
        return this;
    }

    /**
     * 微服务引擎可支持的实例总数
     * @return instanceLimit
     */
    public String getInstanceLimit() {
        return instanceLimit;
    }

    public void setInstanceLimit(String instanceLimit) {
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
     * 微服务引擎附加参数
     * @return inputs
     */
    public Map<String, String> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, String> inputs) {
        this.inputs = inputs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineReference that = (EngineReference) obj;
        return Objects.equals(this.vpc, that.vpc) && Objects.equals(this.azList, that.azList)
            && Objects.equals(this.networkId, that.networkId) && Objects.equals(this.subnetCidr, that.subnetCidr)
            && Objects.equals(this.subnetCidrV6, that.subnetCidrV6)
            && Objects.equals(this.subnetGateway, that.subnetGateway)
            && Objects.equals(this.publicIpId, that.publicIpId) && Objects.equals(this.serviceLimit, that.serviceLimit)
            && Objects.equals(this.instanceLimit, that.instanceLimit) && Objects.equals(this.inputs, that.inputs);
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
