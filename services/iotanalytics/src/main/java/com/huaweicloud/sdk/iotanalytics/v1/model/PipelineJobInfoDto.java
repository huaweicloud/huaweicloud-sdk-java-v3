package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 管道作业基础信息，包括：管道ID、管道名称、管道类型等。 */
public class PipelineJobInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_name")

    private String pipelineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_id")

    private String dataSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_list")

    private List<DataStoreDto> dataStoreList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_description")

    private String pipelineDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_list")

    private List<TagInfoDto> tagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_state")

    private String pipelineState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtu")

    private Integer rtu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_savepoint")

    private Boolean hasSavepoint;

    public PipelineJobInfoDto withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /** 管道ID
     * 
     * @return pipelineId */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public PipelineJobInfoDto withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    /** 管道名称
     * 
     * @return pipelineName */
    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public PipelineJobInfoDto withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /** 数据源ID
     * 
     * @return dataSourceId */
    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public PipelineJobInfoDto withDataStoreList(List<DataStoreDto> dataStoreList) {
        this.dataStoreList = dataStoreList;
        return this;
    }

    public PipelineJobInfoDto addDataStoreListItem(DataStoreDto dataStoreListItem) {
        if (this.dataStoreList == null) {
            this.dataStoreList = new ArrayList<>();
        }
        this.dataStoreList.add(dataStoreListItem);
        return this;
    }

    public PipelineJobInfoDto withDataStoreList(Consumer<List<DataStoreDto>> dataStoreListSetter) {
        if (this.dataStoreList == null) {
            this.dataStoreList = new ArrayList<>();
        }
        dataStoreListSetter.accept(this.dataStoreList);
        return this;
    }

    /** 存储列表
     * 
     * @return dataStoreList */
    public List<DataStoreDto> getDataStoreList() {
        return dataStoreList;
    }

    public void setDataStoreList(List<DataStoreDto> dataStoreList) {
        this.dataStoreList = dataStoreList;
    }

    public PipelineJobInfoDto withPipelineDescription(String pipelineDescription) {
        this.pipelineDescription = pipelineDescription;
        return this;
    }

    /** 管道描述
     * 
     * @return pipelineDescription */
    public String getPipelineDescription() {
        return pipelineDescription;
    }

    public void setPipelineDescription(String pipelineDescription) {
        this.pipelineDescription = pipelineDescription;
    }

    public PipelineJobInfoDto withTagList(List<TagInfoDto> tagList) {
        this.tagList = tagList;
        return this;
    }

    public PipelineJobInfoDto addTagListItem(TagInfoDto tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public PipelineJobInfoDto withTagList(Consumer<List<TagInfoDto>> tagListSetter) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        tagListSetter.accept(this.tagList);
        return this;
    }

    /** 存储列表
     * 
     * @return tagList */
    public List<TagInfoDto> getTagList() {
        return tagList;
    }

    public void setTagList(List<TagInfoDto> tagList) {
        this.tagList = tagList;
    }

    public PipelineJobInfoDto withPipelineState(String pipelineState) {
        this.pipelineState = pipelineState;
        return this;
    }

    /** 管道状态
     * 
     * @return pipelineState */
    public String getPipelineState() {
        return pipelineState;
    }

    public void setPipelineState(String pipelineState) {
        this.pipelineState = pipelineState;
    }

    public PipelineJobInfoDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 操作状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PipelineJobInfoDto withRtu(Integer rtu) {
        this.rtu = rtu;
        return this;
    }

    /** 运行管道的RTU个数 minimum: 0 maximum: 1000
     * 
     * @return rtu */
    public Integer getRtu() {
        return rtu;
    }

    public void setRtu(Integer rtu) {
        this.rtu = rtu;
    }

    public PipelineJobInfoDto withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /** 创建时间
     * 
     * @return createdTime */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public PipelineJobInfoDto withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /** 修改时间
     * 
     * @return modifiedTime */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public PipelineJobInfoDto withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /** 用户ID
     * 
     * @return userId */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PipelineJobInfoDto withHasSavepoint(Boolean hasSavepoint) {
        this.hasSavepoint = hasSavepoint;
        return this;
    }

    /** 已停止的管道作业是否有历史缓存数据
     * 
     * @return hasSavepoint */
    public Boolean getHasSavepoint() {
        return hasSavepoint;
    }

    public void setHasSavepoint(Boolean hasSavepoint) {
        this.hasSavepoint = hasSavepoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineJobInfoDto pipelineJobInfoDto = (PipelineJobInfoDto) o;
        return Objects.equals(this.pipelineId, pipelineJobInfoDto.pipelineId)
            && Objects.equals(this.pipelineName, pipelineJobInfoDto.pipelineName)
            && Objects.equals(this.dataSourceId, pipelineJobInfoDto.dataSourceId)
            && Objects.equals(this.dataStoreList, pipelineJobInfoDto.dataStoreList)
            && Objects.equals(this.pipelineDescription, pipelineJobInfoDto.pipelineDescription)
            && Objects.equals(this.tagList, pipelineJobInfoDto.tagList)
            && Objects.equals(this.pipelineState, pipelineJobInfoDto.pipelineState)
            && Objects.equals(this.status, pipelineJobInfoDto.status)
            && Objects.equals(this.rtu, pipelineJobInfoDto.rtu)
            && Objects.equals(this.createdTime, pipelineJobInfoDto.createdTime)
            && Objects.equals(this.modifiedTime, pipelineJobInfoDto.modifiedTime)
            && Objects.equals(this.userId, pipelineJobInfoDto.userId)
            && Objects.equals(this.hasSavepoint, pipelineJobInfoDto.hasSavepoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId,
            pipelineName,
            dataSourceId,
            dataStoreList,
            pipelineDescription,
            tagList,
            pipelineState,
            status,
            rtu,
            createdTime,
            modifiedTime,
            userId,
            hasSavepoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineJobInfoDto {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
        sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
        sb.append("    dataStoreList: ").append(toIndentedString(dataStoreList)).append("\n");
        sb.append("    pipelineDescription: ").append(toIndentedString(pipelineDescription)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
        sb.append("    pipelineState: ").append(toIndentedString(pipelineState)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    rtu: ").append(toIndentedString(rtu)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    hasSavepoint: ").append(toIndentedString(hasSavepoint)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
