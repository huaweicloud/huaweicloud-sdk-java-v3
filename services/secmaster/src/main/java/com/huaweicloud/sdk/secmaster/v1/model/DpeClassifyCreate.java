package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分类创建信息
 */
public class DpeClassifyCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_name")

    private String dataclassName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping_id")

    private String mappingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_classifier")

    private Object directClassifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_classifier_type_id")

    private String directClassifierTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_id")

    private String modifierId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_name")

    private String modifierName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping_info")

    private DpeInfo mappingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classifier_item_list")

    private List<DpeClassifyItemDetail> classifierItemList = null;

    public DpeClassifyCreate withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 映射id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DpeClassifyCreate withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 映射id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DpeClassifyCreate withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 映射id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public DpeClassifyCreate withDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
        return this;
    }

    /**
     * 映射id
     * @return dataclassId
     */
    public String getDataclassId() {
        return dataclassId;
    }

    public void setDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
    }

    public DpeClassifyCreate withDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
        return this;
    }

    /**
     * 数据类名称
     * @return dataclassName
     */
    public String getDataclassName() {
        return dataclassName;
    }

    public void setDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
    }

    public DpeClassifyCreate withMappingId(String mappingId) {
        this.mappingId = mappingId;
        return this;
    }

    /**
     * 映射id
     * @return mappingId
     */
    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    public DpeClassifyCreate withDirectClassifier(Object directClassifier) {
        this.directClassifier = directClassifier;
        return this;
    }

    /**
     * 分类方式
     * @return directClassifier
     */
    public Object getDirectClassifier() {
        return directClassifier;
    }

    public void setDirectClassifier(Object directClassifier) {
        this.directClassifier = directClassifier;
    }

    public DpeClassifyCreate withDirectClassifierTypeId(String directClassifierTypeId) {
        this.directClassifierTypeId = directClassifierTypeId;
        return this;
    }

    /**
     * 映射id
     * @return directClassifierTypeId
     */
    public String getDirectClassifierTypeId() {
        return directClassifierTypeId;
    }

    public void setDirectClassifierTypeId(String directClassifierTypeId) {
        this.directClassifierTypeId = directClassifierTypeId;
    }

    public DpeClassifyCreate withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DpeClassifyCreate withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建者id
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public DpeClassifyCreate withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建者名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public DpeClassifyCreate withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public DpeClassifyCreate withModifierId(String modifierId) {
        this.modifierId = modifierId;
        return this;
    }

    /**
     * 修改者id
     * @return modifierId
     */
    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public DpeClassifyCreate withModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }

    /**
     * 修改者名称
     * @return modifierName
     */
    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public DpeClassifyCreate withMappingInfo(DpeInfo mappingInfo) {
        this.mappingInfo = mappingInfo;
        return this;
    }

    public DpeClassifyCreate withMappingInfo(Consumer<DpeInfo> mappingInfoSetter) {
        if (this.mappingInfo == null) {
            this.mappingInfo = new DpeInfo();
            mappingInfoSetter.accept(this.mappingInfo);
        }

        return this;
    }

    /**
     * Get mappingInfo
     * @return mappingInfo
     */
    public DpeInfo getMappingInfo() {
        return mappingInfo;
    }

    public void setMappingInfo(DpeInfo mappingInfo) {
        this.mappingInfo = mappingInfo;
    }

    public DpeClassifyCreate withClassifierItemList(List<DpeClassifyItemDetail> classifierItemList) {
        this.classifierItemList = classifierItemList;
        return this;
    }

    public DpeClassifyCreate addClassifierItemListItem(DpeClassifyItemDetail classifierItemListItem) {
        if (this.classifierItemList == null) {
            this.classifierItemList = new ArrayList<>();
        }
        this.classifierItemList.add(classifierItemListItem);
        return this;
    }

    public DpeClassifyCreate withClassifierItemList(Consumer<List<DpeClassifyItemDetail>> classifierItemListSetter) {
        if (this.classifierItemList == null) {
            this.classifierItemList = new ArrayList<>();
        }
        classifierItemListSetter.accept(this.classifierItemList);
        return this;
    }

    /**
     * 分类集合元素
     * @return classifierItemList
     */
    public List<DpeClassifyItemDetail> getClassifierItemList() {
        return classifierItemList;
    }

    public void setClassifierItemList(List<DpeClassifyItemDetail> classifierItemList) {
        this.classifierItemList = classifierItemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DpeClassifyCreate that = (DpeClassifyCreate) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.dataclassId, that.dataclassId)
            && Objects.equals(this.dataclassName, that.dataclassName) && Objects.equals(this.mappingId, that.mappingId)
            && Objects.equals(this.directClassifier, that.directClassifier)
            && Objects.equals(this.directClassifierTypeId, that.directClassifierTypeId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.modifierId, that.modifierId) && Objects.equals(this.modifierName, that.modifierName)
            && Objects.equals(this.mappingInfo, that.mappingInfo)
            && Objects.equals(this.classifierItemList, that.classifierItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            workspaceId,
            dataclassId,
            dataclassName,
            mappingId,
            directClassifier,
            directClassifierTypeId,
            createTime,
            creatorId,
            creatorName,
            updateTime,
            modifierId,
            modifierName,
            mappingInfo,
            classifierItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DpeClassifyCreate {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    dataclassName: ").append(toIndentedString(dataclassName)).append("\n");
        sb.append("    mappingId: ").append(toIndentedString(mappingId)).append("\n");
        sb.append("    directClassifier: ").append(toIndentedString(directClassifier)).append("\n");
        sb.append("    directClassifierTypeId: ").append(toIndentedString(directClassifierTypeId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    modifierName: ").append(toIndentedString(modifierName)).append("\n");
        sb.append("    mappingInfo: ").append(toIndentedString(mappingInfo)).append("\n");
        sb.append("    classifierItemList: ").append(toIndentedString(classifierItemList)).append("\n");
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
