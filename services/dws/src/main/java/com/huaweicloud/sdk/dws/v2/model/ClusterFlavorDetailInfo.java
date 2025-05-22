package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 集群规格详情。 **取值范围**： 不涉及。
 */
public class ClusterFlavorDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_name")

    private String specName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_node")

    private Integer currentNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_node")

    private Integer minNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_node")

    private Integer maxNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classify")

    private String classify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute")

    private List<FlavorAttributeInfo> attribute = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_node")

    private FlavorVolumeNodeInfo volumeNode;

    public ClusterFlavorDetailInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 规格ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterFlavorDetailInfo withSpecName(String specName) {
        this.specName = specName;
        return this;
    }

    /**
     * **参数解释**： 规格编码。 **取值范围**： 不涉及。
     * @return specName
     */
    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public ClusterFlavorDetailInfo withCurrentNode(Integer currentNode) {
        this.currentNode = currentNode;
        return this;
    }

    /**
     * **参数解释**： 当前节点数量。 **取值范围**： 不涉及。
     * @return currentNode
     */
    public Integer getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Integer currentNode) {
        this.currentNode = currentNode;
    }

    public ClusterFlavorDetailInfo withMinNode(Integer minNode) {
        this.minNode = minNode;
        return this;
    }

    /**
     * **参数解释**： 最小节点阈值。 **取值范围**： 不涉及。
     * @return minNode
     */
    public Integer getMinNode() {
        return minNode;
    }

    public void setMinNode(Integer minNode) {
        this.minNode = minNode;
    }

    public ClusterFlavorDetailInfo withMaxNode(Integer maxNode) {
        this.maxNode = maxNode;
        return this;
    }

    /**
     * **参数解释**： 最大节点阈值。 **取值范围**： 不涉及。
     * @return maxNode
     */
    public Integer getMaxNode() {
        return maxNode;
    }

    public void setMaxNode(Integer maxNode) {
        this.maxNode = maxNode;
    }

    public ClusterFlavorDetailInfo withClassify(String classify) {
        this.classify = classify;
        return this;
    }

    /**
     * **参数解释**： 规格类型。 **取值范围**： 不涉及。
     * @return classify
     */
    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public ClusterFlavorDetailInfo withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    /**
     * **参数解释**： 数据仓库版本。 **取值范围**： 不涉及。
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    public ClusterFlavorDetailInfo withAttribute(List<FlavorAttributeInfo> attribute) {
        this.attribute = attribute;
        return this;
    }

    public ClusterFlavorDetailInfo addAttributeItem(FlavorAttributeInfo attributeItem) {
        if (this.attribute == null) {
            this.attribute = new ArrayList<>();
        }
        this.attribute.add(attributeItem);
        return this;
    }

    public ClusterFlavorDetailInfo withAttribute(Consumer<List<FlavorAttributeInfo>> attributeSetter) {
        if (this.attribute == null) {
            this.attribute = new ArrayList<>();
        }
        attributeSetter.accept(this.attribute);
        return this;
    }

    /**
     * **参数解释**： 扩展信息。 **取值范围**： 不涉及。
     * @return attribute
     */
    public List<FlavorAttributeInfo> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<FlavorAttributeInfo> attribute) {
        this.attribute = attribute;
    }

    public ClusterFlavorDetailInfo withVolumeNode(FlavorVolumeNodeInfo volumeNode) {
        this.volumeNode = volumeNode;
        return this;
    }

    public ClusterFlavorDetailInfo withVolumeNode(Consumer<FlavorVolumeNodeInfo> volumeNodeSetter) {
        if (this.volumeNode == null) {
            this.volumeNode = new FlavorVolumeNodeInfo();
            volumeNodeSetter.accept(this.volumeNode);
        }

        return this;
    }

    /**
     * Get volumeNode
     * @return volumeNode
     */
    public FlavorVolumeNodeInfo getVolumeNode() {
        return volumeNode;
    }

    public void setVolumeNode(FlavorVolumeNodeInfo volumeNode) {
        this.volumeNode = volumeNode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterFlavorDetailInfo that = (ClusterFlavorDetailInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.specName, that.specName)
            && Objects.equals(this.currentNode, that.currentNode) && Objects.equals(this.minNode, that.minNode)
            && Objects.equals(this.maxNode, that.maxNode) && Objects.equals(this.classify, that.classify)
            && Objects.equals(this.datastoreVersion, that.datastoreVersion)
            && Objects.equals(this.attribute, that.attribute) && Objects.equals(this.volumeNode, that.volumeNode);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, specName, currentNode, minNode, maxNode, classify, datastoreVersion, attribute, volumeNode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterFlavorDetailInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    specName: ").append(toIndentedString(specName)).append("\n");
        sb.append("    currentNode: ").append(toIndentedString(currentNode)).append("\n");
        sb.append("    minNode: ").append(toIndentedString(minNode)).append("\n");
        sb.append("    maxNode: ").append(toIndentedString(maxNode)).append("\n");
        sb.append("    classify: ").append(toIndentedString(classify)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
        sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
        sb.append("    volumeNode: ").append(toIndentedString(volumeNode)).append("\n");
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
