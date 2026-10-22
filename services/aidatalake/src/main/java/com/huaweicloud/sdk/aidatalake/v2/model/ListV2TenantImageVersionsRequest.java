package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListV2TenantImageVersionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architectures")

    private String architectures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenantId")

    private String tenantId;

    public ListV2TenantImageVersionsRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：镜像ID。可通过[查询自定义镜像列表]获取镜像ID(ListV2TenantImages.xml)。 **约束限制**：不涉及。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ListV2TenantImageVersionsRequest withLimit(Integer limit) {
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

    public ListV2TenantImageVersionsRequest withOffset(Integer offset) {
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

    public ListV2TenantImageVersionsRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**：镜像版本名称（TAG）。 **约束限制**：不涉及。 **取值范围**：长度为2~32的英文字符、数字、中划线、点和下划线的组合。 **默认取值**：不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListV2TenantImageVersionsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：镜像版本类型。 **约束限制**：不涉及。 **取值范围**：   - STABLE：稳定版本。   - RECOMMEND：推荐版本。   - BETA：测试版本。 **默认取值**：不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListV2TenantImageVersionsRequest withArchitectures(String architectures) {
        this.architectures = architectures;
        return this;
    }

    /**
     * **参数解释**：镜像架构，多个架构用逗号分隔。 **约束限制**：不涉及。 **取值范围**：   - x86_64：x86架构。   - aarch64：ARM架构。 **默认取值**：不涉及 
     * @return architectures
     */
    public String getArchitectures() {
        return architectures;
    }

    public void setArchitectures(String architectures) {
        this.architectures = architectures;
    }

    public ListV2TenantImageVersionsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID，用于查询过滤工作空间支持的镜像版本。可通过[获取工作空间ID](aidatalake_02_0044.xml)获取。 **约束限制**：不涉及。 **取值范围**：长度为1~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListV2TenantImageVersionsRequest withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**：端点ID，用于查询过滤端点支持的镜像版本。可通过[查询端点列表](ListV2Endpoints.xml)获取端点ID。 **约束限制**：不涉及。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public ListV2TenantImageVersionsRequest withSortBy(String sortBy) {
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

    public ListV2TenantImageVersionsRequest withOrderBy(String orderBy) {
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

    public ListV2TenantImageVersionsRequest withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释**：租户ID，用于标识租户。可通过IAM服务或控制台获取租户ID。获取方式请参见[获取账号、IAM用户、项目、用户组、委托的名称和ID](iam_01_0023.xml)。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2TenantImageVersionsRequest that = (ListV2TenantImageVersionsRequest) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.version, that.version)
            && Objects.equals(this.type, that.type) && Objects.equals(this.architectures, that.architectures)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.sortBy, that.sortBy) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.tenantId, that.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId,
            limit,
            offset,
            version,
            type,
            architectures,
            workspaceId,
            endpointId,
            sortBy,
            orderBy,
            tenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2TenantImageVersionsRequest {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    architectures: ").append(toIndentedString(architectures)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
