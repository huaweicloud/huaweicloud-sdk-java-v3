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
public class ListV2EndpointsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_types")

    private List<EngineType> engineTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_id")

    private String computeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_id")

    private String storageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public ListV2EndpointsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：**参数解释**：工作空间ID，可通过[获取工作空间ID](aidatalake_02_0044.xml)获取。 **约束限制**：不涉及。  **取值范围**：长度为32-36个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListV2EndpointsRequest withEngineTypes(List<EngineType> engineTypes) {
        this.engineTypes = engineTypes;
        return this;
    }

    public ListV2EndpointsRequest addEngineTypesItem(EngineType engineTypesItem) {
        if (this.engineTypes == null) {
            this.engineTypes = new ArrayList<>();
        }
        this.engineTypes.add(engineTypesItem);
        return this;
    }

    public ListV2EndpointsRequest withEngineTypes(Consumer<List<EngineType>> engineTypesSetter) {
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

    public ListV2EndpointsRequest withComputeId(String computeId) {
        this.computeId = computeId;
        return this;
    }

    /**
     * **参数解释**：计算资源ID。可通过[查询计算资源列表]获取计算资源ID(ListV2Computes.xml)。 **约束限制**：不涉及。 **取值范围**：长度为1~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return computeId
     */
    public String getComputeId() {
        return computeId;
    }

    public void setComputeId(String computeId) {
        this.computeId = computeId;
    }

    public ListV2EndpointsRequest withOffset(Integer offset) {
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

    public ListV2EndpointsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：指定每一页返回的最大条目数。 **约束限制**：不涉及。 **取值范围**：1~100。 **默认取值**：10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListV2EndpointsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：端点名称，精确查询。 **约束限制**：不涉及。 **取值范围**：长度为1~63个字符，遵循RFC 1035规范，支持小写字母、数字、中划线，必须字母开头、字母或数字结尾。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListV2EndpointsRequest withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * **参数解释**：存储资源ID，可通过[查询存储资源列表](ListV2Storages.xml)获取存储资源ID。 **约束限制**：不涉及。 **取值范围**：长度为1~64的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return storageId
     */
    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public ListV2EndpointsRequest withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ListV2EndpointsRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListV2EndpointsRequest withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：标签过滤条件，支持多个标签。格式为 key#value1,value2，用英文逗号分隔多个值。 **约束限制**：最多10个标签。 
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2EndpointsRequest that = (ListV2EndpointsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.engineTypes, that.engineTypes)
            && Objects.equals(this.computeId, that.computeId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.name, that.name)
            && Objects.equals(this.storageId, that.storageId) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, engineTypes, computeId, offset, limit, name, storageId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2EndpointsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    engineTypes: ").append(toIndentedString(engineTypes)).append("\n");
        sb.append("    computeId: ").append(toIndentedString(computeId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    storageId: ").append(toIndentedString(storageId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
