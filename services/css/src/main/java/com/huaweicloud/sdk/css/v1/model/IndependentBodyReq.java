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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    private Integer volumeSize;

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

    public IndependentBodyReq withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * **参数解释**： 节点存储大小。 **约束限制**： - flavor_ref参数是本地盘规格时，不能设置此参数。 - 必须为大于0且为4和10的公倍数，单位：GB。 **取值范围**： 磁盘规格大小可以通过过[获取实例规格列表](ListFlavors.xml)中diskrange属性获得。 **默认取值**： flavor_ref参数不是本地盘规格时： - 新增独立冷数据节点：默认100G与节点规格支持的最小磁盘容量取较大者。 - 新增独立master或client节点：默认大小为40G，且不可更改。  >新增独立冷数据节点，推荐大于100G。
     * @return volumeSize
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndependentBodyReq that = (IndependentBodyReq) obj;
        return Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.nodeSize, that.nodeSize)
            && Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.volumeSize, that.volumeSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, nodeSize, volumeType, volumeSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndependentBodyReq {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    nodeSize: ").append(toIndentedString(nodeSize)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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
