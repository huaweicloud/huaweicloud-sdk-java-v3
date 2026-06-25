package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点期望信息。
 */
public class NodeSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private Os os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostNetwork")

    private NodeNetwork hostNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rootVolume")

    private VolumeVO rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataVolumes")

    private List<VolumeVO> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParams")

    private ResourceExtendParams extendParams;

    public NodeSpec withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：节点资源规格ID。 **取值范围**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public NodeSpec withOs(Os os) {
        this.os = os;
        return this;
    }

    public NodeSpec withOs(Consumer<Os> osSetter) {
        if (this.os == null) {
            this.os = new Os();
            osSetter.accept(this.os);
        }

        return this;
    }

    /**
     * Get os
     * @return os
     */
    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public NodeSpec withHostNetwork(NodeNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    public NodeSpec withHostNetwork(Consumer<NodeNetwork> hostNetworkSetter) {
        if (this.hostNetwork == null) {
            this.hostNetwork = new NodeNetwork();
            hostNetworkSetter.accept(this.hostNetwork);
        }

        return this;
    }

    /**
     * Get hostNetwork
     * @return hostNetwork
     */
    public NodeNetwork getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(NodeNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public NodeSpec withRootVolume(VolumeVO rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public NodeSpec withRootVolume(Consumer<VolumeVO> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new VolumeVO();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public VolumeVO getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(VolumeVO rootVolume) {
        this.rootVolume = rootVolume;
    }

    public NodeSpec withDataVolumes(List<VolumeVO> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public NodeSpec addDataVolumesItem(VolumeVO dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public NodeSpec withDataVolumes(Consumer<List<VolumeVO>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * **参数解释**：数据盘信息。
     * @return dataVolumes
     */
    public List<VolumeVO> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<VolumeVO> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public NodeSpec withExtendParams(ResourceExtendParams extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    public NodeSpec withExtendParams(Consumer<ResourceExtendParams> extendParamsSetter) {
        if (this.extendParams == null) {
            this.extendParams = new ResourceExtendParams();
            extendParamsSetter.accept(this.extendParams);
        }

        return this;
    }

    /**
     * Get extendParams
     * @return extendParams
     */
    public ResourceExtendParams getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(ResourceExtendParams extendParams) {
        this.extendParams = extendParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeSpec that = (NodeSpec) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.os, that.os)
            && Objects.equals(this.hostNetwork, that.hostNetwork) && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.extendParams, that.extendParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, os, hostNetwork, rootVolume, dataVolumes, extendParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSpec {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
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
