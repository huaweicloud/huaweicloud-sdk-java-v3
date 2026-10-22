package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteV2ResourceTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private TagResourceType resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private V2BatchDeleteTagsRequestBody body;

    public BatchDeleteV2ResourceTagsRequest withResourceType(TagResourceType resourceType) {
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

    public BatchDeleteV2ResourceTagsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释**：标签关联的资源ID。 **约束限制**：不能为空。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BatchDeleteV2ResourceTagsRequest withBody(V2BatchDeleteTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteV2ResourceTagsRequest withBody(Consumer<V2BatchDeleteTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new V2BatchDeleteTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public V2BatchDeleteTagsRequestBody getBody() {
        return body;
    }

    public void setBody(V2BatchDeleteTagsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteV2ResourceTagsRequest that = (BatchDeleteV2ResourceTagsRequest) obj;
        return Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteV2ResourceTagsRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
