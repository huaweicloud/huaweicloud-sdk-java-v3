package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TestCasePageParam
 */
public class TestCasePageParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private String deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_collection")

    private List<String> idCollection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mindmap_id")

    private String mindmapId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id_collection")

    private List<String> nodeIdCollection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_archive")

    private Boolean isArchive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_name")

    private String caseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_sub_mindmap")

    private Boolean hasSubMindmap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_mindmap_id")

    private List<String> subMindmapId = null;

    public TestCasePageParam withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public TestCasePageParam withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public TestCasePageParam withDeleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get deleted
     * @return deleted
     */
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public TestCasePageParam withIdCollection(List<String> idCollection) {
        this.idCollection = idCollection;
        return this;
    }

    public TestCasePageParam addIdCollectionItem(String idCollectionItem) {
        if (this.idCollection == null) {
            this.idCollection = new ArrayList<>();
        }
        this.idCollection.add(idCollectionItem);
        return this;
    }

    public TestCasePageParam withIdCollection(Consumer<List<String>> idCollectionSetter) {
        if (this.idCollection == null) {
            this.idCollection = new ArrayList<>();
        }
        idCollectionSetter.accept(this.idCollection);
        return this;
    }

    /**
     * Get idCollection
     * @return idCollection
     */
    public List<String> getIdCollection() {
        return idCollection;
    }

    public void setIdCollection(List<String> idCollection) {
        this.idCollection = idCollection;
    }

    public TestCasePageParam withMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
        return this;
    }

    /**
     * Get mindmapId
     * @return mindmapId
     */
    public String getMindmapId() {
        return mindmapId;
    }

    public void setMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
    }

    public TestCasePageParam withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TestCasePageParam withNodeIdCollection(List<String> nodeIdCollection) {
        this.nodeIdCollection = nodeIdCollection;
        return this;
    }

    public TestCasePageParam addNodeIdCollectionItem(String nodeIdCollectionItem) {
        if (this.nodeIdCollection == null) {
            this.nodeIdCollection = new ArrayList<>();
        }
        this.nodeIdCollection.add(nodeIdCollectionItem);
        return this;
    }

    public TestCasePageParam withNodeIdCollection(Consumer<List<String>> nodeIdCollectionSetter) {
        if (this.nodeIdCollection == null) {
            this.nodeIdCollection = new ArrayList<>();
        }
        nodeIdCollectionSetter.accept(this.nodeIdCollection);
        return this;
    }

    /**
     * Get nodeIdCollection
     * @return nodeIdCollection
     */
    public List<String> getNodeIdCollection() {
        return nodeIdCollection;
    }

    public void setNodeIdCollection(List<String> nodeIdCollection) {
        this.nodeIdCollection = nodeIdCollection;
    }

    public TestCasePageParam withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get projectId
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TestCasePageParam withIsArchive(Boolean isArchive) {
        this.isArchive = isArchive;
        return this;
    }

    /**
     * Get isArchive
     * @return isArchive
     */
    public Boolean getIsArchive() {
        return isArchive;
    }

    public void setIsArchive(Boolean isArchive) {
        this.isArchive = isArchive;
    }

    public TestCasePageParam withCaseName(String caseName) {
        this.caseName = caseName;
        return this;
    }

    /**
     * Get caseName
     * @return caseName
     */
    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public TestCasePageParam withHasSubMindmap(Boolean hasSubMindmap) {
        this.hasSubMindmap = hasSubMindmap;
        return this;
    }

    /**
     * Get hasSubMindmap
     * @return hasSubMindmap
     */
    public Boolean getHasSubMindmap() {
        return hasSubMindmap;
    }

    public void setHasSubMindmap(Boolean hasSubMindmap) {
        this.hasSubMindmap = hasSubMindmap;
    }

    public TestCasePageParam withSubMindmapId(List<String> subMindmapId) {
        this.subMindmapId = subMindmapId;
        return this;
    }

    public TestCasePageParam addSubMindmapIdItem(String subMindmapIdItem) {
        if (this.subMindmapId == null) {
            this.subMindmapId = new ArrayList<>();
        }
        this.subMindmapId.add(subMindmapIdItem);
        return this;
    }

    public TestCasePageParam withSubMindmapId(Consumer<List<String>> subMindmapIdSetter) {
        if (this.subMindmapId == null) {
            this.subMindmapId = new ArrayList<>();
        }
        subMindmapIdSetter.accept(this.subMindmapId);
        return this;
    }

    /**
     * Get subMindmapId
     * @return subMindmapId
     */
    public List<String> getSubMindmapId() {
        return subMindmapId;
    }

    public void setSubMindmapId(List<String> subMindmapId) {
        this.subMindmapId = subMindmapId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCasePageParam that = (TestCasePageParam) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.deleted, that.deleted) && Objects.equals(this.idCollection, that.idCollection)
            && Objects.equals(this.mindmapId, that.mindmapId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeIdCollection, that.nodeIdCollection)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.isArchive, that.isArchive)
            && Objects.equals(this.caseName, that.caseName) && Objects.equals(this.hasSubMindmap, that.hasSubMindmap)
            && Objects.equals(this.subMindmapId, that.subMindmapId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            deleted,
            idCollection,
            mindmapId,
            nodeId,
            nodeIdCollection,
            projectId,
            isArchive,
            caseName,
            hasSubMindmap,
            subMindmapId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCasePageParam {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    idCollection: ").append(toIndentedString(idCollection)).append("\n");
        sb.append("    mindmapId: ").append(toIndentedString(mindmapId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeIdCollection: ").append(toIndentedString(nodeIdCollection)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isArchive: ").append(toIndentedString(isArchive)).append("\n");
        sb.append("    caseName: ").append(toIndentedString(caseName)).append("\n");
        sb.append("    hasSubMindmap: ").append(toIndentedString(hasSubMindmap)).append("\n");
        sb.append("    subMindmapId: ").append(toIndentedString(subMindmapId)).append("\n");
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
