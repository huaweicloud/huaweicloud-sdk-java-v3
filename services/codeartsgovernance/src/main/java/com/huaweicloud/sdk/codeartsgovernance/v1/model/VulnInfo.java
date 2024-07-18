package com.huaweicloud.sdk.codeartsgovernance.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VulnInfo
 */
public class VulnInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principle")

    private String principle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution")

    private String solution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_items")

    private List<VulnItem> vulnItems = null;

    public VulnInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 漏洞类型
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public VulnInfo withPrinciple(String principle) {
        this.principle = principle;
        return this;
    }

    /**
     * 漏洞原理
     * @return principle
     */
    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public VulnInfo withSolution(String solution) {
        this.solution = solution;
        return this;
    }

    /**
     * 解决方案
     * @return solution
     */
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public VulnInfo withVulnItems(List<VulnItem> vulnItems) {
        this.vulnItems = vulnItems;
        return this;
    }

    public VulnInfo addVulnItemsItem(VulnItem vulnItemsItem) {
        if (this.vulnItems == null) {
            this.vulnItems = new ArrayList<>();
        }
        this.vulnItems.add(vulnItemsItem);
        return this;
    }

    public VulnInfo withVulnItems(Consumer<List<VulnItem>> vulnItemsSetter) {
        if (this.vulnItems == null) {
            this.vulnItems = new ArrayList<>();
        }
        vulnItemsSetter.accept(this.vulnItems);
        return this;
    }

    /**
     * 漏洞项列表
     * @return vulnItems
     */
    public List<VulnItem> getVulnItems() {
        return vulnItems;
    }

    public void setVulnItems(List<VulnItem> vulnItems) {
        this.vulnItems = vulnItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulnInfo that = (VulnInfo) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.principle, that.principle)
            && Objects.equals(this.solution, that.solution) && Objects.equals(this.vulnItems, that.vulnItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, principle, solution, vulnItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulnInfo {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    principle: ").append(toIndentedString(principle)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    vulnItems: ").append(toIndentedString(vulnItems)).append("\n");
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
