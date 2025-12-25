package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 映射信息
 */
public class DpeMappingDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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
    @JsonProperty(value = "mapper_type_id")

    private String mapperTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dpe_info")

    private DpeInfo dpeInfo;

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
    @JsonProperty(value = "mapper_field_list")

    private List<DpeMappingFieldDetail> mapperFieldList = null;

    public DpeMappingDetail withId(String id) {
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

    public DpeMappingDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DpeMappingDetail withProjectId(String projectId) {
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

    public DpeMappingDetail withWorkspaceId(String workspaceId) {
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

    public DpeMappingDetail withDataclassId(String dataclassId) {
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

    public DpeMappingDetail withDataclassName(String dataclassName) {
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

    public DpeMappingDetail withMapperTypeId(String mapperTypeId) {
        this.mapperTypeId = mapperTypeId;
        return this;
    }

    /**
     * 映射id
     * @return mapperTypeId
     */
    public String getMapperTypeId() {
        return mapperTypeId;
    }

    public void setMapperTypeId(String mapperTypeId) {
        this.mapperTypeId = mapperTypeId;
    }

    public DpeMappingDetail withDpeInfo(DpeInfo dpeInfo) {
        this.dpeInfo = dpeInfo;
        return this;
    }

    public DpeMappingDetail withDpeInfo(Consumer<DpeInfo> dpeInfoSetter) {
        if (this.dpeInfo == null) {
            this.dpeInfo = new DpeInfo();
            dpeInfoSetter.accept(this.dpeInfo);
        }

        return this;
    }

    /**
     * Get dpeInfo
     * @return dpeInfo
     */
    public DpeInfo getDpeInfo() {
        return dpeInfo;
    }

    public void setDpeInfo(DpeInfo dpeInfo) {
        this.dpeInfo = dpeInfo;
    }

    public DpeMappingDetail withCreateTime(String createTime) {
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

    public DpeMappingDetail withCreatorId(String creatorId) {
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

    public DpeMappingDetail withCreatorName(String creatorName) {
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

    public DpeMappingDetail withUpdateTime(String updateTime) {
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

    public DpeMappingDetail withModifierId(String modifierId) {
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

    public DpeMappingDetail withModifierName(String modifierName) {
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

    public DpeMappingDetail withMapperFieldList(List<DpeMappingFieldDetail> mapperFieldList) {
        this.mapperFieldList = mapperFieldList;
        return this;
    }

    public DpeMappingDetail addMapperFieldListItem(DpeMappingFieldDetail mapperFieldListItem) {
        if (this.mapperFieldList == null) {
            this.mapperFieldList = new ArrayList<>();
        }
        this.mapperFieldList.add(mapperFieldListItem);
        return this;
    }

    public DpeMappingDetail withMapperFieldList(Consumer<List<DpeMappingFieldDetail>> mapperFieldListSetter) {
        if (this.mapperFieldList == null) {
            this.mapperFieldList = new ArrayList<>();
        }
        mapperFieldListSetter.accept(this.mapperFieldList);
        return this;
    }

    /**
     * 映射集合
     * @return mapperFieldList
     */
    public List<DpeMappingFieldDetail> getMapperFieldList() {
        return mapperFieldList;
    }

    public void setMapperFieldList(List<DpeMappingFieldDetail> mapperFieldList) {
        this.mapperFieldList = mapperFieldList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DpeMappingDetail that = (DpeMappingDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.dataclassId, that.dataclassId)
            && Objects.equals(this.dataclassName, that.dataclassName)
            && Objects.equals(this.mapperTypeId, that.mapperTypeId) && Objects.equals(this.dpeInfo, that.dpeInfo)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.modifierId, that.modifierId) && Objects.equals(this.modifierName, that.modifierName)
            && Objects.equals(this.mapperFieldList, that.mapperFieldList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            projectId,
            workspaceId,
            dataclassId,
            dataclassName,
            mapperTypeId,
            dpeInfo,
            createTime,
            creatorId,
            creatorName,
            updateTime,
            modifierId,
            modifierName,
            mapperFieldList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DpeMappingDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    dataclassName: ").append(toIndentedString(dataclassName)).append("\n");
        sb.append("    mapperTypeId: ").append(toIndentedString(mapperTypeId)).append("\n");
        sb.append("    dpeInfo: ").append(toIndentedString(dpeInfo)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    modifierName: ").append(toIndentedString(modifierName)).append("\n");
        sb.append("    mapperFieldList: ").append(toIndentedString(mapperFieldList)).append("\n");
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
