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
public class ListModelVendorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_vendors")

    private List<ModelVendor> modelVendors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListModelVendorsResponse withModelVendors(List<ModelVendor> modelVendors) {
        this.modelVendors = modelVendors;
        return this;
    }

    public ListModelVendorsResponse addModelVendorsItem(ModelVendor modelVendorsItem) {
        if (this.modelVendors == null) {
            this.modelVendors = new ArrayList<>();
        }
        this.modelVendors.add(modelVendorsItem);
        return this;
    }

    public ListModelVendorsResponse withModelVendors(Consumer<List<ModelVendor>> modelVendorsSetter) {
        if (this.modelVendors == null) {
            this.modelVendors = new ArrayList<>();
        }
        modelVendorsSetter.accept(this.modelVendors);
        return this;
    }

    /**
     * **参数解释**： 模型供应商列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return modelVendors
     */
    public List<ModelVendor> getModelVendors() {
        return modelVendors;
    }

    public void setModelVendors(List<ModelVendor> modelVendors) {
        this.modelVendors = modelVendors;
    }

    public ListModelVendorsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 模型供应商个数。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
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
        ListModelVendorsResponse that = (ListModelVendorsResponse) obj;
        return Objects.equals(this.modelVendors, that.modelVendors) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelVendors, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListModelVendorsResponse {\n");
        sb.append("    modelVendors: ").append(toIndentedString(modelVendors)).append("\n");
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
