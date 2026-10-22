package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListV2TenantImagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    public ListV2TenantImagesRequest withOffset(Integer offset) {
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

    public ListV2TenantImagesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：分页大小。 **约束限制**：不涉及。 **取值范围**：1~1000。 **默认取值**：100。 
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

    public ListV2TenantImagesRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * **参数解释**：指定排序字段。 **约束限制**：不涉及。 **取值范围**：   - CREATE_TIME：创建时间，使用UTC时间，ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSXXX，例如：2025-01-10T03:37:12.000+00:00。   - UPDATE_TIME：更新时间，使用UTC时间，ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSXXX，例如：2025-01-10T03:37:12.000+00:00。 **默认取值**：CREATE_TIME。
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public ListV2TenantImagesRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * **参数解释**：排序方式。 **约束限制**：不涉及。 **取值范围**：   - ASC：递增排序。   - DESC：递减排序。 **默认取值**：DESC。 
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListV2TenantImagesRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：镜像id检索。可通过[查询自定义镜像列表](ListV2TenantImages.xml)获取镜像ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListV2TenantImagesRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**：通过自定义镜像分类检索。 **约束限制**：不涉及。 **取值范围**：   - RAY_BASIC：基于Ray构建的自定义镜像。   - SPARK_JOB：基于SparkJob构建的自定义镜像。   - SPARK_SQL：基于SparkSql构建的自定义镜像。   - FLINK_JOB：基于FlinkJob构建的自定义镜像。   - AURA_JOB：基于AuraJobV2构建的自定义镜像。 **默认取值**：不涉及。 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ListV2TenantImagesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**：通过镜像组织搜索。 **约束限制**：不涉及。 **取值范围**：由英文字母、数字、中划线和下划线组成，长度为0~64个字符。 **默认取值**：不涉及。 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListV2TenantImagesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：通过镜像名搜索。 **约束限制**：不涉及。 **取值范围**：由中文字符、英文字母、数字、中划线和下划线组成，长度为0~128个字符。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListV2TenantImagesRequest withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释**：可见性检索的参数。 **约束限制**：不涉及。 **取值范围**：   - PRIVATE：私有，用户自己创建的。   - PUBLIC：公共，查询所有公共的，包括其他用户创建的。   - ALL：所有的。 **默认取值**：默认为空，不填表示不限制。当前用户下包括PRIVATE和PUBLIC的，不包括其他用户创建的。 
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2TenantImagesRequest that = (ListV2TenantImagesRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.sortBy, that.sortBy) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.id, that.id) && Objects.equals(this.category, that.category)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.name, that.name)
            && Objects.equals(this.visibility, that.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, sortBy, orderBy, id, category, namespace, name, visibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2TenantImagesRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
