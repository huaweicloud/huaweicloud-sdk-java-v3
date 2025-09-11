package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourcesInListResp
 */
public class ResourcesInListResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_group_id")

    private String resourceGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_group_name")

    private String resourceGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<MetricDimensionResp> dimensions = null;

    public ResourcesInListResp withResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    /**
     * **参数解释**： 资源分组ID，监控范围为资源分组时存在该值。 **取值范围**： 以rg开头，后跟22个字母或数字。 
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public ResourcesInListResp withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * **参数解释**： 资源分组名称，监控范围为资源分组时存在该值。 **取值范围**： 长度为[1,128]个字符。 
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    public ResourcesInListResp withDimensions(List<MetricDimensionResp> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public ResourcesInListResp addDimensionsItem(MetricDimensionResp dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public ResourcesInListResp withDimensions(Consumer<List<MetricDimensionResp>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * **参数解释**： 维度信息。 
     * @return dimensions
     */
    public List<MetricDimensionResp> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<MetricDimensionResp> dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcesInListResp that = (ResourcesInListResp) obj;
        return Objects.equals(this.resourceGroupId, that.resourceGroupId)
            && Objects.equals(this.resourceGroupName, that.resourceGroupName)
            && Objects.equals(this.dimensions, that.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceGroupId, resourceGroupName, dimensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcesInListResp {\n");
        sb.append("    resourceGroupId: ").append(toIndentedString(resourceGroupId)).append("\n");
        sb.append("    resourceGroupName: ").append(toIndentedString(resourceGroupName)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
