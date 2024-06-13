package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MindmapPageParamV3
 */
public class MindmapPageParamV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_id_collection")

    private List<String> folderIdCollection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_num_collection")

    private List<String> creatorNumCollection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updater_num_collection")

    private List<String> updaterNumCollection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_root_id")

    private String folderRootId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_collection")

    private List<String> idCollection = null;

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
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_uri")

    private String branchUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_master")

    private Integer isMaster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_uri")

    private String iteratorUri;

    public MindmapPageParamV3 withFolderIdCollection(List<String> folderIdCollection) {
        this.folderIdCollection = folderIdCollection;
        return this;
    }

    public MindmapPageParamV3 addFolderIdCollectionItem(String folderIdCollectionItem) {
        if (this.folderIdCollection == null) {
            this.folderIdCollection = new ArrayList<>();
        }
        this.folderIdCollection.add(folderIdCollectionItem);
        return this;
    }

    public MindmapPageParamV3 withFolderIdCollection(Consumer<List<String>> folderIdCollectionSetter) {
        if (this.folderIdCollection == null) {
            this.folderIdCollection = new ArrayList<>();
        }
        folderIdCollectionSetter.accept(this.folderIdCollection);
        return this;
    }

    /**
     * 目录ID集合
     * @return folderIdCollection
     */
    public List<String> getFolderIdCollection() {
        return folderIdCollection;
    }

    public void setFolderIdCollection(List<String> folderIdCollection) {
        this.folderIdCollection = folderIdCollection;
    }

    public MindmapPageParamV3 withCreatorNumCollection(List<String> creatorNumCollection) {
        this.creatorNumCollection = creatorNumCollection;
        return this;
    }

    public MindmapPageParamV3 addCreatorNumCollectionItem(String creatorNumCollectionItem) {
        if (this.creatorNumCollection == null) {
            this.creatorNumCollection = new ArrayList<>();
        }
        this.creatorNumCollection.add(creatorNumCollectionItem);
        return this;
    }

    public MindmapPageParamV3 withCreatorNumCollection(Consumer<List<String>> creatorNumCollectionSetter) {
        if (this.creatorNumCollection == null) {
            this.creatorNumCollection = new ArrayList<>();
        }
        creatorNumCollectionSetter.accept(this.creatorNumCollection);
        return this;
    }

    /**
     * 创建者ID集合
     * @return creatorNumCollection
     */
    public List<String> getCreatorNumCollection() {
        return creatorNumCollection;
    }

    public void setCreatorNumCollection(List<String> creatorNumCollection) {
        this.creatorNumCollection = creatorNumCollection;
    }

    public MindmapPageParamV3 withUpdaterNumCollection(List<String> updaterNumCollection) {
        this.updaterNumCollection = updaterNumCollection;
        return this;
    }

    public MindmapPageParamV3 addUpdaterNumCollectionItem(String updaterNumCollectionItem) {
        if (this.updaterNumCollection == null) {
            this.updaterNumCollection = new ArrayList<>();
        }
        this.updaterNumCollection.add(updaterNumCollectionItem);
        return this;
    }

    public MindmapPageParamV3 withUpdaterNumCollection(Consumer<List<String>> updaterNumCollectionSetter) {
        if (this.updaterNumCollection == null) {
            this.updaterNumCollection = new ArrayList<>();
        }
        updaterNumCollectionSetter.accept(this.updaterNumCollection);
        return this;
    }

    /**
     * 更新人ID集合
     * @return updaterNumCollection
     */
    public List<String> getUpdaterNumCollection() {
        return updaterNumCollection;
    }

    public void setUpdaterNumCollection(List<String> updaterNumCollection) {
        this.updaterNumCollection = updaterNumCollection;
    }

    public MindmapPageParamV3 withFolderRootId(String folderRootId) {
        this.folderRootId = folderRootId;
        return this;
    }

    /**
     * 根目录ID
     * @return folderRootId
     */
    public String getFolderRootId() {
        return folderRootId;
    }

    public void setFolderRootId(String folderRootId) {
        this.folderRootId = folderRootId;
    }

    public MindmapPageParamV3 withIdCollection(List<String> idCollection) {
        this.idCollection = idCollection;
        return this;
    }

    public MindmapPageParamV3 addIdCollectionItem(String idCollectionItem) {
        if (this.idCollection == null) {
            this.idCollection = new ArrayList<>();
        }
        this.idCollection.add(idCollectionItem);
        return this;
    }

    public MindmapPageParamV3 withIdCollection(Consumer<List<String>> idCollectionSetter) {
        if (this.idCollection == null) {
            this.idCollection = new ArrayList<>();
        }
        idCollectionSetter.accept(this.idCollection);
        return this;
    }

    /**
     * 主键ID集合
     * @return idCollection
     */
    public List<String> getIdCollection() {
        return idCollection;
    }

    public void setIdCollection(List<String> idCollection) {
        this.idCollection = idCollection;
    }

    public MindmapPageParamV3 withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 起始偏移量，表示从此偏移量开始查询，offset大于等于0，小于等于100000
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public MindmapPageParamV3 withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，最大支持200条
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

    public MindmapPageParamV3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 脑图名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MindmapPageParamV3 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public MindmapPageParamV3 withBranchUri(String branchUri) {
        this.branchUri = branchUri;
        return this;
    }

    /**
     * 分支uri
     * @return branchUri
     */
    public String getBranchUri() {
        return branchUri;
    }

    public void setBranchUri(String branchUri) {
        this.branchUri = branchUri;
    }

    public MindmapPageParamV3 withIsMaster(Integer isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * 是否基线
     * @return isMaster
     */
    public Integer getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(Integer isMaster) {
        this.isMaster = isMaster;
    }

    public MindmapPageParamV3 withIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
        return this;
    }

    /**
     * 计划uri
     * @return iteratorUri
     */
    public String getIteratorUri() {
        return iteratorUri;
    }

    public void setIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MindmapPageParamV3 that = (MindmapPageParamV3) obj;
        return Objects.equals(this.folderIdCollection, that.folderIdCollection)
            && Objects.equals(this.creatorNumCollection, that.creatorNumCollection)
            && Objects.equals(this.updaterNumCollection, that.updaterNumCollection)
            && Objects.equals(this.folderRootId, that.folderRootId)
            && Objects.equals(this.idCollection, that.idCollection) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.branchUri, that.branchUri)
            && Objects.equals(this.isMaster, that.isMaster) && Objects.equals(this.iteratorUri, that.iteratorUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderIdCollection,
            creatorNumCollection,
            updaterNumCollection,
            folderRootId,
            idCollection,
            offset,
            limit,
            name,
            projectId,
            branchUri,
            isMaster,
            iteratorUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MindmapPageParamV3 {\n");
        sb.append("    folderIdCollection: ").append(toIndentedString(folderIdCollection)).append("\n");
        sb.append("    creatorNumCollection: ").append(toIndentedString(creatorNumCollection)).append("\n");
        sb.append("    updaterNumCollection: ").append(toIndentedString(updaterNumCollection)).append("\n");
        sb.append("    folderRootId: ").append(toIndentedString(folderRootId)).append("\n");
        sb.append("    idCollection: ").append(toIndentedString(idCollection)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    branchUri: ").append(toIndentedString(branchUri)).append("\n");
        sb.append("    isMaster: ").append(toIndentedString(isMaster)).append("\n");
        sb.append("    iteratorUri: ").append(toIndentedString(iteratorUri)).append("\n");
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
