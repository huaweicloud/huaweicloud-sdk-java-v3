package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 节目素材信息响应 */
public class ProgramItemResponseBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "materialId")

    private String materialId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "materialName")

    private String materialName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filePath")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playTime")

    private Integer playTime;

    public ProgramItemResponseBase withMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }

    /** 素材ID
     * 
     * @return materialId */
    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public ProgramItemResponseBase withMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }

    /** 素材名称
     * 
     * @return materialName */
    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public ProgramItemResponseBase withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /** 素材云盘文件下载路径
     * 
     * @return filePath */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ProgramItemResponseBase withPlayTime(Integer playTime) {
        this.playTime = playTime;
        return this;
    }

    /** 播放时长
     * 
     * @return playTime */
    public Integer getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProgramItemResponseBase programItemResponseBase = (ProgramItemResponseBase) o;
        return Objects.equals(this.materialId, programItemResponseBase.materialId)
            && Objects.equals(this.materialName, programItemResponseBase.materialName)
            && Objects.equals(this.filePath, programItemResponseBase.filePath)
            && Objects.equals(this.playTime, programItemResponseBase.playTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materialId, materialName, filePath, playTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProgramItemResponseBase {\n");
        sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
        sb.append("    materialName: ").append(toIndentedString(materialName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    playTime: ").append(toIndentedString(playTime)).append("\n");
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
