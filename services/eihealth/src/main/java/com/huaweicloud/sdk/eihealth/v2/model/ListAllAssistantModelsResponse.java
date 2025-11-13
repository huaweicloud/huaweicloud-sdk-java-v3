package com.huaweicloud.sdk.eihealth.v2.model;

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
public class ListAllAssistantModelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendors")

    private List<AssistantModelVendorInfo> vendors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAllAssistantModelsResponse withVendors(List<AssistantModelVendorInfo> vendors) {
        this.vendors = vendors;
        return this;
    }

    public ListAllAssistantModelsResponse addVendorsItem(AssistantModelVendorInfo vendorsItem) {
        if (this.vendors == null) {
            this.vendors = new ArrayList<>();
        }
        this.vendors.add(vendorsItem);
        return this;
    }

    public ListAllAssistantModelsResponse withVendors(Consumer<List<AssistantModelVendorInfo>> vendorsSetter) {
        if (this.vendors == null) {
            this.vendors = new ArrayList<>();
        }
        vendorsSetter.accept(this.vendors);
        return this;
    }

    /**
     * **参数解释**： 供应商列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return vendors
     */
    public List<AssistantModelVendorInfo> getVendors() {
        return vendors;
    }

    public void setVendors(List<AssistantModelVendorInfo> vendors) {
        this.vendors = vendors;
    }

    public ListAllAssistantModelsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 供应商个数。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllAssistantModelsResponse that = (ListAllAssistantModelsResponse) obj;
        return Objects.equals(this.vendors, that.vendors) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendors, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllAssistantModelsResponse {\n");
        sb.append("    vendors: ").append(toIndentedString(vendors)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
