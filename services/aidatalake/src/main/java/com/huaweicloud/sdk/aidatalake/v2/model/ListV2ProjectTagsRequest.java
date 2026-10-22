package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListV2ProjectTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private TagResourceType resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_predefine_tags")

    private Boolean usePredefineTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_types")

    private List<EngineType> engineTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListV2ProjectTagsRequest withResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * **参数解释**：端点引擎类型列表。 **约束限制**：不能为空。 **取值范围**：   - aidatalake-workspace：工作空间。   - aidatalake-endpoint-ray：Ray引擎端点。   - aidatalake-endpoint-aura：Aura引擎端点。   - aidatalake-endpoint-spark：Spark引擎端点。   - aidatalake-endpoint-flink：Flink引擎端点。   - aidatalake-compute：计算资源。 **默认取值**：不涉及。 
     * @return resourceType
     */
    public TagResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public ListV2ProjectTagsRequest withUsePredefineTags(Boolean usePredefineTags) {
        this.usePredefineTags = usePredefineTags;
        return this;
    }

    /**
     * **参数解释**：使用预定义标签。 **约束限制**：不涉及。 **取值范围**：   - true：使用。   - false：不使用。 **默认取值**：false。 
     * @return usePredefineTags
     */
    public Boolean getUsePredefineTags() {
        return usePredefineTags;
    }

    public void setUsePredefineTags(Boolean usePredefineTags) {
        this.usePredefineTags = usePredefineTags;
    }

    public ListV2ProjectTagsRequest withEngineTypes(List<EngineType> engineTypes) {
        this.engineTypes = engineTypes;
        return this;
    }

    public ListV2ProjectTagsRequest addEngineTypesItem(EngineType engineTypesItem) {
        if (this.engineTypes == null) {
            this.engineTypes = new ArrayList<>();
        }
        this.engineTypes.add(engineTypesItem);
        return this;
    }

    public ListV2ProjectTagsRequest withEngineTypes(Consumer<List<EngineType>> engineTypesSetter) {
        if (this.engineTypes == null) {
            this.engineTypes = new ArrayList<>();
        }
        engineTypesSetter.accept(this.engineTypes);
        return this;
    }

    /**
     * **参数解释**：端点引擎类型列表。取值包括：   - AuraJob：AuraJob引擎。   - SparkSql：SparkSql引擎。   - SparkJob：SparkJob引擎。   - FlinkJob：FlinkJob引擎。   - AuraJobV2：AuraJobV2引擎。   - RayCluster：RayCluster引擎。   - RayJob：RayJob引擎。   - RayService：RayService引擎。 **约束限制**：不涉及。 
     * @return engineTypes
     */
    public List<EngineType> getEngineTypes() {
        return engineTypes;
    }

    public void setEngineTypes(List<EngineType> engineTypes) {
        this.engineTypes = engineTypes;
    }

    public ListV2ProjectTagsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：偏移量，表示从此偏移量开始查询。 **约束限制**：不涉及。 **取值范围**：0~1000000000。 **默认取值**：0。
     * minimum: 0
     * maximum: 1000000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListV2ProjectTagsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：查询记录数。 **约束限制**：不涉及。 **取值范围**：1~1000。 **默认取值**：1000。 
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2ProjectTagsRequest that = (ListV2ProjectTagsRequest) obj;
        return Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.usePredefineTags, that.usePredefineTags)
            && Objects.equals(this.engineTypes, that.engineTypes) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, usePredefineTags, engineTypes, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2ProjectTagsRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    usePredefineTags: ").append(toIndentedString(usePredefineTags)).append("\n");
        sb.append("    engineTypes: ").append(toIndentedString(engineTypes)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
