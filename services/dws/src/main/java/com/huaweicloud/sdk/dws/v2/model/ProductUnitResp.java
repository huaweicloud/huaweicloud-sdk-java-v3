package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 快照规格信息单个详情。 **取值范围**： 不涉及。
 */
public class ProductUnitResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_capacity")

    private String defaultCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classify")

    private String classify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario")

    private String scenario;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute")

    private List<ProductExtendResp> attribute = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duplicate")

    private Integer duplicate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_node")

    private Integer defaultNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_node")

    private Integer minNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_node")

    private Integer maxNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_version_list")

    private List<ProductVersionResp> productVersionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_code")

    private String flavorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_num")

    private Integer volumeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_used")

    private ProductVolumeUsedResp volumeUsed;

    public ProductUnitResp withId(String id) {
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

    public ProductUnitResp withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 规格编码。 **取值范围**： 不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProductUnitResp withDefaultCapacity(String defaultCapacity) {
        this.defaultCapacity = defaultCapacity;
        return this;
    }

    /**
     * **参数解释**： 规格默认容量。 **取值范围**： 不涉及。
     * @return defaultCapacity
     */
    public String getDefaultCapacity() {
        return defaultCapacity;
    }

    public void setDefaultCapacity(String defaultCapacity) {
        this.defaultCapacity = defaultCapacity;
    }

    public ProductUnitResp withClassify(String classify) {
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

    public ProductUnitResp withScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }

    /**
     * **参数解释**： 规格适用场景。 **取值范围**： 不涉及。
     * @return scenario
     */
    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public ProductUnitResp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 规格版本信息。 **取值范围**： v1.0：一代规格。 v2.0：二代规格。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ProductUnitResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 规格状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductUnitResp withAttribute(List<ProductExtendResp> attribute) {
        this.attribute = attribute;
        return this;
    }

    public ProductUnitResp addAttributeItem(ProductExtendResp attributeItem) {
        if (this.attribute == null) {
            this.attribute = new ArrayList<>();
        }
        this.attribute.add(attributeItem);
        return this;
    }

    public ProductUnitResp withAttribute(Consumer<List<ProductExtendResp>> attributeSetter) {
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
    public List<ProductExtendResp> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<ProductExtendResp> attribute) {
        this.attribute = attribute;
    }

    public ProductUnitResp withDuplicate(Integer duplicate) {
        this.duplicate = duplicate;
        return this;
    }

    /**
     * **参数解释**： 规格使用副本数量。 **取值范围**： 不涉及。
     * @return duplicate
     */
    public Integer getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(Integer duplicate) {
        this.duplicate = duplicate;
    }

    public ProductUnitResp withDefaultNode(Integer defaultNode) {
        this.defaultNode = defaultNode;
        return this;
    }

    /**
     * **参数解释**： 默认节点数量。 **取值范围**： 不涉及。
     * @return defaultNode
     */
    public Integer getDefaultNode() {
        return defaultNode;
    }

    public void setDefaultNode(Integer defaultNode) {
        this.defaultNode = defaultNode;
    }

    public ProductUnitResp withMinNode(Integer minNode) {
        this.minNode = minNode;
        return this;
    }

    /**
     * **参数解释**： 最小节点数。 **取值范围**： 不涉及。
     * @return minNode
     */
    public Integer getMinNode() {
        return minNode;
    }

    public void setMinNode(Integer minNode) {
        this.minNode = minNode;
    }

    public ProductUnitResp withMaxNode(Integer maxNode) {
        this.maxNode = maxNode;
        return this;
    }

    /**
     * **参数解释**： 最大节点数。 **取值范围**： 不涉及。
     * @return maxNode
     */
    public Integer getMaxNode() {
        return maxNode;
    }

    public void setMaxNode(Integer maxNode) {
        this.maxNode = maxNode;
    }

    public ProductUnitResp withProductVersionList(List<ProductVersionResp> productVersionList) {
        this.productVersionList = productVersionList;
        return this;
    }

    public ProductUnitResp addProductVersionListItem(ProductVersionResp productVersionListItem) {
        if (this.productVersionList == null) {
            this.productVersionList = new ArrayList<>();
        }
        this.productVersionList.add(productVersionListItem);
        return this;
    }

    public ProductUnitResp withProductVersionList(Consumer<List<ProductVersionResp>> productVersionListSetter) {
        if (this.productVersionList == null) {
            this.productVersionList = new ArrayList<>();
        }
        productVersionListSetter.accept(this.productVersionList);
        return this;
    }

    /**
     * **参数解释**： 版本信息。 **取值范围**： 不涉及。
     * @return productVersionList
     */
    public List<ProductVersionResp> getProductVersionList() {
        return productVersionList;
    }

    public void setProductVersionList(List<ProductVersionResp> productVersionList) {
        this.productVersionList = productVersionList;
    }

    public ProductUnitResp withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * **参数解释**： 底层规格ID。有别于id字段，一般不会用到。 **取值范围**： 不涉及。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public ProductUnitResp withFlavorCode(String flavorCode) {
        this.flavorCode = flavorCode;
        return this;
    }

    /**
     * **参数解释**： 规格的底层规格编码。 **取值范围**： 不涉及。
     * @return flavorCode
     */
    public String getFlavorCode() {
        return flavorCode;
    }

    public void setFlavorCode(String flavorCode) {
        this.flavorCode = flavorCode;
    }

    public ProductUnitResp withVolumeNum(Integer volumeNum) {
        this.volumeNum = volumeNum;
        return this;
    }

    /**
     * **参数解释**： 规格的磁盘数。 **取值范围**： 不涉及。
     * @return volumeNum
     */
    public Integer getVolumeNum() {
        return volumeNum;
    }

    public void setVolumeNum(Integer volumeNum) {
        this.volumeNum = volumeNum;
    }

    public ProductUnitResp withVolumeUsed(ProductVolumeUsedResp volumeUsed) {
        this.volumeUsed = volumeUsed;
        return this;
    }

    public ProductUnitResp withVolumeUsed(Consumer<ProductVolumeUsedResp> volumeUsedSetter) {
        if (this.volumeUsed == null) {
            this.volumeUsed = new ProductVolumeUsedResp();
            volumeUsedSetter.accept(this.volumeUsed);
        }

        return this;
    }

    /**
     * Get volumeUsed
     * @return volumeUsed
     */
    public ProductVolumeUsedResp getVolumeUsed() {
        return volumeUsed;
    }

    public void setVolumeUsed(ProductVolumeUsedResp volumeUsed) {
        this.volumeUsed = volumeUsed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductUnitResp that = (ProductUnitResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.code, that.code)
            && Objects.equals(this.defaultCapacity, that.defaultCapacity)
            && Objects.equals(this.classify, that.classify) && Objects.equals(this.scenario, that.scenario)
            && Objects.equals(this.version, that.version) && Objects.equals(this.status, that.status)
            && Objects.equals(this.attribute, that.attribute) && Objects.equals(this.duplicate, that.duplicate)
            && Objects.equals(this.defaultNode, that.defaultNode) && Objects.equals(this.minNode, that.minNode)
            && Objects.equals(this.maxNode, that.maxNode)
            && Objects.equals(this.productVersionList, that.productVersionList)
            && Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.flavorCode, that.flavorCode)
            && Objects.equals(this.volumeNum, that.volumeNum) && Objects.equals(this.volumeUsed, that.volumeUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            code,
            defaultCapacity,
            classify,
            scenario,
            version,
            status,
            attribute,
            duplicate,
            defaultNode,
            minNode,
            maxNode,
            productVersionList,
            flavorId,
            flavorCode,
            volumeNum,
            volumeUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductUnitResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    defaultCapacity: ").append(toIndentedString(defaultCapacity)).append("\n");
        sb.append("    classify: ").append(toIndentedString(classify)).append("\n");
        sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
        sb.append("    duplicate: ").append(toIndentedString(duplicate)).append("\n");
        sb.append("    defaultNode: ").append(toIndentedString(defaultNode)).append("\n");
        sb.append("    minNode: ").append(toIndentedString(minNode)).append("\n");
        sb.append("    maxNode: ").append(toIndentedString(maxNode)).append("\n");
        sb.append("    productVersionList: ").append(toIndentedString(productVersionList)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    flavorCode: ").append(toIndentedString(flavorCode)).append("\n");
        sb.append("    volumeNum: ").append(toIndentedString(volumeNum)).append("\n");
        sb.append("    volumeUsed: ").append(toIndentedString(volumeUsed)).append("\n");
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
