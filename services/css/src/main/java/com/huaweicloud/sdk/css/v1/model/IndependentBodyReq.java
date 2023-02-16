package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IndependentBodyReq
 */
public class IndependentBodyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_size")

    private Integer nodeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    public IndependentBodyReq withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 规格id，该参数通过[获取实例规格列表](ListFlavors.xml)接口获取，根据集群版本选择所需要的规格id
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public IndependentBodyReq withNodeSize(Integer nodeSize) {
        this.nodeSize = nodeSize;
        return this;
    }

    /**
     * 要独立节点个数。 - 如果路径参数type取值为“ess-master”即新增独立master节点，节点个数必须为大于等于三且小于等于10的奇数。 - 如果路径参数type取值为“ess-client”即新增独立client节点，节点个数要求大于等于1小于等于32。
     * @return nodeSize
     */
    public Integer getNodeSize() {
        return nodeSize;
    }

    public void setNodeSize(Integer nodeSize) {
        this.nodeSize = nodeSize;
    }

    public IndependentBodyReq withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 节点存储类型：取值为ULTRAHIGH，COMMON，HIGH。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndependentBodyReq independentBodyReq = (IndependentBodyReq) o;
        return Objects.equals(this.flavorRef, independentBodyReq.flavorRef)
            && Objects.equals(this.nodeSize, independentBodyReq.nodeSize)
            && Objects.equals(this.volumeType, independentBodyReq.volumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, nodeSize, volumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndependentBodyReq {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    nodeSize: ").append(toIndentedString(nodeSize)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
