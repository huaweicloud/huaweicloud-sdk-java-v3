package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowProgramResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdatedBy")

    private String lastUpdatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTime")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "programName")

    private String programName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "materialSizeStr")

    private String materialSizeStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playTime")

    private Integer playTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "programItemList")

    private List<ProgramItemResponseBase> programItemList = null;

    public ShowProgramResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 节目ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowProgramResponse withLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    /** 更新者
     * 
     * @return lastUpdatedBy */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public ShowProgramResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 更新时间
     * 
     * @return updateTime */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowProgramResponse withProgramName(String programName) {
        this.programName = programName;
        return this;
    }

    /** 节目名称
     * 
     * @return programName */
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public ShowProgramResponse withMaterialSizeStr(String materialSizeStr) {
        this.materialSizeStr = materialSizeStr;
        return this;
    }

    /** 节目的总素材大小（含单位）
     * 
     * @return materialSizeStr */
    public String getMaterialSizeStr() {
        return materialSizeStr;
    }

    public void setMaterialSizeStr(String materialSizeStr) {
        this.materialSizeStr = materialSizeStr;
    }

    public ShowProgramResponse withPlayTime(Integer playTime) {
        this.playTime = playTime;
        return this;
    }

    /** 节目的总播放时长，单位秒
     * 
     * @return playTime */
    public Integer getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    public ShowProgramResponse withProgramItemList(List<ProgramItemResponseBase> programItemList) {
        this.programItemList = programItemList;
        return this;
    }

    public ShowProgramResponse addProgramItemListItem(ProgramItemResponseBase programItemListItem) {
        if (this.programItemList == null) {
            this.programItemList = new ArrayList<>();
        }
        this.programItemList.add(programItemListItem);
        return this;
    }

    public ShowProgramResponse withProgramItemList(Consumer<List<ProgramItemResponseBase>> programItemListSetter) {
        if (this.programItemList == null) {
            this.programItemList = new ArrayList<>();
        }
        programItemListSetter.accept(this.programItemList);
        return this;
    }

    /** 节目素材列表
     * 
     * @return programItemList */
    public List<ProgramItemResponseBase> getProgramItemList() {
        return programItemList;
    }

    public void setProgramItemList(List<ProgramItemResponseBase> programItemList) {
        this.programItemList = programItemList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProgramResponse showProgramResponse = (ShowProgramResponse) o;
        return Objects.equals(this.id, showProgramResponse.id)
            && Objects.equals(this.lastUpdatedBy, showProgramResponse.lastUpdatedBy)
            && Objects.equals(this.updateTime, showProgramResponse.updateTime)
            && Objects.equals(this.programName, showProgramResponse.programName)
            && Objects.equals(this.materialSizeStr, showProgramResponse.materialSizeStr)
            && Objects.equals(this.playTime, showProgramResponse.playTime)
            && Objects.equals(this.programItemList, showProgramResponse.programItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastUpdatedBy, updateTime, programName, materialSizeStr, playTime, programItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProgramResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
        sb.append("    materialSizeStr: ").append(toIndentedString(materialSizeStr)).append("\n");
        sb.append("    playTime: ").append(toIndentedString(playTime)).append("\n");
        sb.append("    programItemList: ").append(toIndentedString(programItemList)).append("\n");
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
