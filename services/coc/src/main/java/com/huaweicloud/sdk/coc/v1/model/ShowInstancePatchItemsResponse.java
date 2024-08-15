package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstancePatchItemsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_items")

    private List<ComplianceItem> complianceItems = null;

    public ShowInstancePatchItemsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总条数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowInstancePatchItemsResponse withComplianceItems(List<ComplianceItem> complianceItems) {
        this.complianceItems = complianceItems;
        return this;
    }

    public ShowInstancePatchItemsResponse addComplianceItemsItem(ComplianceItem complianceItemsItem) {
        if (this.complianceItems == null) {
            this.complianceItems = new ArrayList<>();
        }
        this.complianceItems.add(complianceItemsItem);
        return this;
    }

    public ShowInstancePatchItemsResponse withComplianceItems(Consumer<List<ComplianceItem>> complianceItemsSetter) {
        if (this.complianceItems == null) {
            this.complianceItems = new ArrayList<>();
        }
        complianceItemsSetter.accept(this.complianceItems);
        return this;
    }

    /**
     * 补丁合规信息
     * @return complianceItems
     */
    public List<ComplianceItem> getComplianceItems() {
        return complianceItems;
    }

    public void setComplianceItems(List<ComplianceItem> complianceItems) {
        this.complianceItems = complianceItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstancePatchItemsResponse that = (ShowInstancePatchItemsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.complianceItems, that.complianceItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, complianceItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstancePatchItemsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    complianceItems: ").append(toIndentedString(complianceItems)).append("\n");
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
