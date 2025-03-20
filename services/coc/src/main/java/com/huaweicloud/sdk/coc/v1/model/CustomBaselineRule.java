package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自定义基线规则
 */
public class CustomBaselineRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product")

    private String product;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_level")

    private String complianceLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_items")

    private List<CustomBaselineRulePatchItem> patchItems = null;

    public CustomBaselineRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CustomBaselineRule withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public CustomBaselineRule withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * 产品
     * @return product
     */
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public CustomBaselineRule withComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
        return this;
    }

    /**
     * 合规性报告等级
     * @return complianceLevel
     */
    public String getComplianceLevel() {
        return complianceLevel;
    }

    public void setComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
    }

    public CustomBaselineRule withPatchItems(List<CustomBaselineRulePatchItem> patchItems) {
        this.patchItems = patchItems;
        return this;
    }

    public CustomBaselineRule addPatchItemsItem(CustomBaselineRulePatchItem patchItemsItem) {
        if (this.patchItems == null) {
            this.patchItems = new ArrayList<>();
        }
        this.patchItems.add(patchItemsItem);
        return this;
    }

    public CustomBaselineRule withPatchItems(Consumer<List<CustomBaselineRulePatchItem>> patchItemsSetter) {
        if (this.patchItems == null) {
            this.patchItems = new ArrayList<>();
        }
        patchItemsSetter.accept(this.patchItems);
        return this;
    }

    /**
     * 基线补丁信息
     * @return patchItems
     */
    public List<CustomBaselineRulePatchItem> getPatchItems() {
        return patchItems;
    }

    public void setPatchItems(List<CustomBaselineRulePatchItem> patchItems) {
        this.patchItems = patchItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomBaselineRule that = (CustomBaselineRule) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.product, that.product) && Objects.equals(this.complianceLevel, that.complianceLevel)
            && Objects.equals(this.patchItems, that.patchItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ruleName, product, complianceLevel, patchItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomBaselineRule {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    complianceLevel: ").append(toIndentedString(complianceLevel)).append("\n");
        sb.append("    patchItems: ").append(toIndentedString(patchItems)).append("\n");
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
