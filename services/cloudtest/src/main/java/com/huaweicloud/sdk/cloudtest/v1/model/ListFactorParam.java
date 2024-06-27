package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListFactorParam
 */
public class ListFactorParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_node_ids")

    private List<String> parentNodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_num")

    private String creatorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mindmap_id")

    private String mindmapId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testpoint_id")

    private String testpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mindmap_node_id")

    private String mindmapNodeId;

    public ListFactorParam withOffset(Integer offset) {
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

    public ListFactorParam withLimit(Integer limit) {
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

    public ListFactorParam withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListFactorParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListFactorParam withParentNodeIds(List<String> parentNodeIds) {
        this.parentNodeIds = parentNodeIds;
        return this;
    }

    public ListFactorParam addParentNodeIdsItem(String parentNodeIdsItem) {
        if (this.parentNodeIds == null) {
            this.parentNodeIds = new ArrayList<>();
        }
        this.parentNodeIds.add(parentNodeIdsItem);
        return this;
    }

    public ListFactorParam withParentNodeIds(Consumer<List<String>> parentNodeIdsSetter) {
        if (this.parentNodeIds == null) {
            this.parentNodeIds = new ArrayList<>();
        }
        parentNodeIdsSetter.accept(this.parentNodeIds);
        return this;
    }

    /**
     * Get parentNodeIds
     * @return parentNodeIds
     */
    public List<String> getParentNodeIds() {
        return parentNodeIds;
    }

    public void setParentNodeIds(List<String> parentNodeIds) {
        this.parentNodeIds = parentNodeIds;
    }

    public ListFactorParam withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * Get assetId
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ListFactorParam withCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
        return this;
    }

    /**
     * Get creatorNum
     * @return creatorNum
     */
    public String getCreatorNum() {
        return creatorNum;
    }

    public void setCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
    }

    public ListFactorParam withMindmapId(String mindmapId) {
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

    public ListFactorParam withTestpointId(String testpointId) {
        this.testpointId = testpointId;
        return this;
    }

    /**
     * Get testpointId
     * @return testpointId
     */
    public String getTestpointId() {
        return testpointId;
    }

    public void setTestpointId(String testpointId) {
        this.testpointId = testpointId;
    }

    public ListFactorParam withMindmapNodeId(String mindmapNodeId) {
        this.mindmapNodeId = mindmapNodeId;
        return this;
    }

    /**
     * Get mindmapNodeId
     * @return mindmapNodeId
     */
    public String getMindmapNodeId() {
        return mindmapNodeId;
    }

    public void setMindmapNodeId(String mindmapNodeId) {
        this.mindmapNodeId = mindmapNodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactorParam that = (ListFactorParam) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name)
            && Objects.equals(this.parentNodeIds, that.parentNodeIds) && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.creatorNum, that.creatorNum) && Objects.equals(this.mindmapId, that.mindmapId)
            && Objects.equals(this.testpointId, that.testpointId)
            && Objects.equals(this.mindmapNodeId, that.mindmapNodeId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(offset, limit, type, name, parentNodeIds, assetId, creatorNum, mindmapId, testpointId, mindmapNodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactorParam {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentNodeIds: ").append(toIndentedString(parentNodeIds)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    creatorNum: ").append(toIndentedString(creatorNum)).append("\n");
        sb.append("    mindmapId: ").append(toIndentedString(mindmapId)).append("\n");
        sb.append("    testpointId: ").append(toIndentedString(testpointId)).append("\n");
        sb.append("    mindmapNodeId: ").append(toIndentedString(mindmapNodeId)).append("\n");
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
