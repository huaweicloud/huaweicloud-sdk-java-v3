package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Patch
 */
public class Patch  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="patch_id")
    
    private String patchId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="patch_name")
    
    private String patchName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="major_level")
    
    private String majorLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repair_cmd")
    
    private String repairCmd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repair_necessity")
    
    private String repairNecessity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="release_time")
    
    private OffsetDateTime releaseTime;

    public Patch withPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }

    


    /**
     * 补丁编号。
     * @return patchId
     */
    public String getPatchId() {
        return patchId;
    }

    public void setPatchId(String patchId) {
        this.patchId = patchId;
    }

    

    public Patch withPatchName(String patchName) {
        this.patchName = patchName;
        return this;
    }

    


    /**
     * 补丁名称。
     * @return patchName
     */
    public String getPatchName() {
        return patchName;
    }

    public void setPatchName(String patchName) {
        this.patchName = patchName;
    }

    

    public Patch withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 补丁类型（0：linux，1：windows，2：web-cms）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public Patch withMajorLevel(String majorLevel) {
        this.majorLevel = majorLevel;
        return this;
    }

    


    /**
     * 重要等级。
     * @return majorLevel
     */
    public String getMajorLevel() {
        return majorLevel;
    }

    public void setMajorLevel(String majorLevel) {
        this.majorLevel = majorLevel;
    }

    

    public Patch withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 补丁状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public Patch withRepairCmd(String repairCmd) {
        this.repairCmd = repairCmd;
        return this;
    }

    


    /**
     * 修复命令。
     * @return repairCmd
     */
    public String getRepairCmd() {
        return repairCmd;
    }

    public void setRepairCmd(String repairCmd) {
        this.repairCmd = repairCmd;
    }

    

    public Patch withRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
        return this;
    }

    


    /**
     * 修复必要程度（1：需立刻修复，2：可延后修复，3：暂可以不修复）。
     * @return repairNecessity
     */
    public String getRepairNecessity() {
        return repairNecessity;
    }

    public void setRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
    }

    

    public Patch withReleaseTime(OffsetDateTime releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }

    


    /**
     * 发布时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息       为事件发生时区，无法解析时区的时间，默认时区填东八区。
     * @return releaseTime
     */
    public OffsetDateTime getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(OffsetDateTime releaseTime) {
        this.releaseTime = releaseTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Patch patch = (Patch) o;
        return Objects.equals(this.patchId, patch.patchId) &&
            Objects.equals(this.patchName, patch.patchName) &&
            Objects.equals(this.type, patch.type) &&
            Objects.equals(this.majorLevel, patch.majorLevel) &&
            Objects.equals(this.status, patch.status) &&
            Objects.equals(this.repairCmd, patch.repairCmd) &&
            Objects.equals(this.repairNecessity, patch.repairNecessity) &&
            Objects.equals(this.releaseTime, patch.releaseTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(patchId, patchName, type, majorLevel, status, repairCmd, repairNecessity, releaseTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Patch {\n");
        sb.append("    patchId: ").append(toIndentedString(patchId)).append("\n");
        sb.append("    patchName: ").append(toIndentedString(patchName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    majorLevel: ").append(toIndentedString(majorLevel)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    repairCmd: ").append(toIndentedString(repairCmd)).append("\n");
        sb.append("    repairNecessity: ").append(toIndentedString(repairNecessity)).append("\n");
        sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
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

