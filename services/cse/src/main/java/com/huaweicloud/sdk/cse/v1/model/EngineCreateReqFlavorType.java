package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网关规格类型
 */
public class EngineCreateReqFlavorType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeFlavor")

    private List<String> nodeFlavor = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availablePrefix")

    private String availablePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availableCpuMemory")

    private String availableCpuMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specType")

    private String specType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linear")

    private Boolean linear;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "licenseAmount")

    private Integer licenseAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeLimit")

    private String nodeLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "microGatewayFlavor")

    private String microGatewayFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private Boolean disable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private String spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudServiceType")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentflavor")

    private String currentflavor;

    public EngineCreateReqFlavorType withNodeFlavor(List<String> nodeFlavor) {
        this.nodeFlavor = nodeFlavor;
        return this;
    }

    public EngineCreateReqFlavorType addNodeFlavorItem(String nodeFlavorItem) {
        if (this.nodeFlavor == null) {
            this.nodeFlavor = new ArrayList<>();
        }
        this.nodeFlavor.add(nodeFlavorItem);
        return this;
    }

    public EngineCreateReqFlavorType withNodeFlavor(Consumer<List<String>> nodeFlavorSetter) {
        if (this.nodeFlavor == null) {
            this.nodeFlavor = new ArrayList<>();
        }
        nodeFlavorSetter.accept(this.nodeFlavor);
        return this;
    }

    /**
     * 网关节点规格
     * @return nodeFlavor
     */
    public List<String> getNodeFlavor() {
        return nodeFlavor;
    }

    public void setNodeFlavor(List<String> nodeFlavor) {
        this.nodeFlavor = nodeFlavor;
    }

    public EngineCreateReqFlavorType withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 网关规格
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public EngineCreateReqFlavorType withAvailablePrefix(String availablePrefix) {
        this.availablePrefix = availablePrefix;
        return this;
    }

    /**
     * 可用区前缀
     * @return availablePrefix
     */
    public String getAvailablePrefix() {
        return availablePrefix;
    }

    public void setAvailablePrefix(String availablePrefix) {
        this.availablePrefix = availablePrefix;
    }

    public EngineCreateReqFlavorType withAvailableCpuMemory(String availableCpuMemory) {
        this.availableCpuMemory = availableCpuMemory;
        return this;
    }

    /**
     * 可用区CPU内存
     * @return availableCpuMemory
     */
    public String getAvailableCpuMemory() {
        return availableCpuMemory;
    }

    public void setAvailableCpuMemory(String availableCpuMemory) {
        this.availableCpuMemory = availableCpuMemory;
    }

    public EngineCreateReqFlavorType withSpecType(String specType) {
        this.specType = specType;
        return this;
    }

    /**
     * 引擎类型
     * @return specType
     */
    public String getSpecType() {
        return specType;
    }

    public void setSpecType(String specType) {
        this.specType = specType;
    }

    public EngineCreateReqFlavorType withLinear(Boolean linear) {
        this.linear = linear;
        return this;
    }

    /**
     * 是否为线性
     * @return linear
     */
    public Boolean getLinear() {
        return linear;
    }

    public void setLinear(Boolean linear) {
        this.linear = linear;
    }

    public EngineCreateReqFlavorType withLicenseAmount(Integer licenseAmount) {
        this.licenseAmount = licenseAmount;
        return this;
    }

    /**
     * 网关证书规模
     * @return licenseAmount
     */
    public Integer getLicenseAmount() {
        return licenseAmount;
    }

    public void setLicenseAmount(Integer licenseAmount) {
        this.licenseAmount = licenseAmount;
    }

    public EngineCreateReqFlavorType withNodeLimit(String nodeLimit) {
        this.nodeLimit = nodeLimit;
        return this;
    }

    /**
     * 网关节点数限制
     * @return nodeLimit
     */
    public String getNodeLimit() {
        return nodeLimit;
    }

    public void setNodeLimit(String nodeLimit) {
        this.nodeLimit = nodeLimit;
    }

    public EngineCreateReqFlavorType withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 网关规格id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EngineCreateReqFlavorType withMicroGatewayFlavor(String microGatewayFlavor) {
        this.microGatewayFlavor = microGatewayFlavor;
        return this;
    }

    /**
     * 网关规格
     * @return microGatewayFlavor
     */
    public String getMicroGatewayFlavor() {
        return microGatewayFlavor;
    }

    public void setMicroGatewayFlavor(String microGatewayFlavor) {
        this.microGatewayFlavor = microGatewayFlavor;
    }

    public EngineCreateReqFlavorType withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    /**
     * 网关是否禁用
     * @return disable
     */
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public EngineCreateReqFlavorType withSpec(String spec) {
        this.spec = spec;
        return this;
    }

    /**
     * 网关节点类型
     * @return spec
     */
    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public EngineCreateReqFlavorType withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public EngineCreateReqFlavorType withCurrentflavor(String currentflavor) {
        this.currentflavor = currentflavor;
        return this;
    }

    /**
     * 当前规格
     * @return currentflavor
     */
    public String getCurrentflavor() {
        return currentflavor;
    }

    public void setCurrentflavor(String currentflavor) {
        this.currentflavor = currentflavor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineCreateReqFlavorType that = (EngineCreateReqFlavorType) obj;
        return Objects.equals(this.nodeFlavor, that.nodeFlavor) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.availablePrefix, that.availablePrefix)
            && Objects.equals(this.availableCpuMemory, that.availableCpuMemory)
            && Objects.equals(this.specType, that.specType) && Objects.equals(this.linear, that.linear)
            && Objects.equals(this.licenseAmount, that.licenseAmount) && Objects.equals(this.nodeLimit, that.nodeLimit)
            && Objects.equals(this.id, that.id) && Objects.equals(this.microGatewayFlavor, that.microGatewayFlavor)
            && Objects.equals(this.disable, that.disable) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.currentflavor, that.currentflavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeFlavor,
            flavor,
            availablePrefix,
            availableCpuMemory,
            specType,
            linear,
            licenseAmount,
            nodeLimit,
            id,
            microGatewayFlavor,
            disable,
            spec,
            cloudServiceType,
            currentflavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineCreateReqFlavorType {\n");
        sb.append("    nodeFlavor: ").append(toIndentedString(nodeFlavor)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    availablePrefix: ").append(toIndentedString(availablePrefix)).append("\n");
        sb.append("    availableCpuMemory: ").append(toIndentedString(availableCpuMemory)).append("\n");
        sb.append("    specType: ").append(toIndentedString(specType)).append("\n");
        sb.append("    linear: ").append(toIndentedString(linear)).append("\n");
        sb.append("    licenseAmount: ").append(toIndentedString(licenseAmount)).append("\n");
        sb.append("    nodeLimit: ").append(toIndentedString(nodeLimit)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    microGatewayFlavor: ").append(toIndentedString(microGatewayFlavor)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    currentflavor: ").append(toIndentedString(currentflavor)).append("\n");
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
