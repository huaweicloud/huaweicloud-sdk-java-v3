package com.huaweicloud.sdk.rc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowResourceRelationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_resource_id")

    private String relatedResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_resource_type")

    private String relatedResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ShowResourceRelationsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ShowResourceRelationsRequest withRelatedResourceId(String relatedResourceId) {
        this.relatedResourceId = relatedResourceId;
        return this;
    }

    /**
     * 资源ID
     * @return relatedResourceId
     */
    public String getRelatedResourceId() {
        return relatedResourceId;
    }

    public void setRelatedResourceId(String relatedResourceId) {
        this.relatedResourceId = relatedResourceId;
    }

    public ShowResourceRelationsRequest withRelatedResourceType(String relatedResourceType) {
        this.relatedResourceType = relatedResourceType;
        return this;
    }

    /**
     * 关联资源类型
     * @return relatedResourceType
     */
    public String getRelatedResourceType() {
        return relatedResourceType;
    }

    public void setRelatedResourceType(String relatedResourceType) {
        this.relatedResourceType = relatedResourceType;
    }

    public ShowResourceRelationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 最大的返回数量
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowResourceRelationsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页参数，通过上一个请求中返回的marker信息作为输入，获取当前页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceRelationsRequest that = (ShowResourceRelationsRequest) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.relatedResourceId, that.relatedResourceId)
            && Objects.equals(this.relatedResourceType, that.relatedResourceType)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, relatedResourceId, relatedResourceType, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceRelationsRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    relatedResourceId: ").append(toIndentedString(relatedResourceId)).append("\n");
        sb.append("    relatedResourceType: ").append(toIndentedString(relatedResourceType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
