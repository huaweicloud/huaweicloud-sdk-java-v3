package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 新增/更新节目素材信息请求
 */
public class ProgramItemRequestBase  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="materialId")
    
    private String materialId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="playTime")
    
    private Integer playTime;

    public ProgramItemRequestBase withMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }

    


    /**
     * 素材ID
     * @return materialId
     */
    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public ProgramItemRequestBase withPlayTime(Integer playTime) {
        this.playTime = playTime;
        return this;
    }

    


    /**
     * 播放时长
     * @return playTime
     */
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
        ProgramItemRequestBase programItemRequestBase = (ProgramItemRequestBase) o;
        return Objects.equals(this.materialId, programItemRequestBase.materialId) &&
            Objects.equals(this.playTime, programItemRequestBase.playTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(materialId, playTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProgramItemRequestBase {\n");
        sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
        sb.append("    playTime: ").append(toIndentedString(playTime)).append("\n");
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

