package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源历史
 */
public class HistoryItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capture_time")

    private String captureTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relations")

    private List<ResourceRelation> relations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private BaseResourceEntity resource;

    public HistoryItem withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 用户id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public HistoryItem withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public HistoryItem withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public HistoryItem withCaptureTime(String captureTime) {
        this.captureTime = captureTime;
        return this;
    }

    /**
     * 该资源在Config系统捕获时间
     * @return captureTime
     */
    public String getCaptureTime() {
        return captureTime;
    }

    public void setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
    }

    public HistoryItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HistoryItem withRelations(List<ResourceRelation> relations) {
        this.relations = relations;
        return this;
    }

    public HistoryItem addRelationsItem(ResourceRelation relationsItem) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        this.relations.add(relationsItem);
        return this;
    }

    public HistoryItem withRelations(Consumer<List<ResourceRelation>> relationsSetter) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        relationsSetter.accept(this.relations);
        return this;
    }

    /**
     * 资源关系列表
     * @return relations
     */
    public List<ResourceRelation> getRelations() {
        return relations;
    }

    public void setRelations(List<ResourceRelation> relations) {
        this.relations = relations;
    }

    public HistoryItem withResource(BaseResourceEntity resource) {
        this.resource = resource;
        return this;
    }

    public HistoryItem withResource(Consumer<BaseResourceEntity> resourceSetter) {
        if (this.resource == null) {
            this.resource = new BaseResourceEntity();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public BaseResourceEntity getResource() {
        return resource;
    }

    public void setResource(BaseResourceEntity resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HistoryItem that = (HistoryItem) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.captureTime, that.captureTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.relations, that.relations) && Objects.equals(this.resource, that.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, resourceId, resourceType, captureTime, status, relations, resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryItem {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    captureTime: ").append(toIndentedString(captureTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
