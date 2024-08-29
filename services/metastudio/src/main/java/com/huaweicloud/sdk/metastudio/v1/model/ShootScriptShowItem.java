package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 剧本参数配置。
 */
public class ShootScriptShowItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_no")

    private Integer sequenceNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shoot_script")

    private ShootScriptDetail shootScript;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitle_file_info")

    private SubtitleFileInfo subtitleFileInfo;

    public ShootScriptShowItem withSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
        return this;
    }

    /**
     * 剧本序号。
     * minimum: 0
     * maximum: 2147483647
     * @return sequenceNo
     */
    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public ShootScriptShowItem withShootScript(ShootScriptDetail shootScript) {
        this.shootScript = shootScript;
        return this;
    }

    public ShootScriptShowItem withShootScript(Consumer<ShootScriptDetail> shootScriptSetter) {
        if (this.shootScript == null) {
            this.shootScript = new ShootScriptDetail();
            shootScriptSetter.accept(this.shootScript);
        }

        return this;
    }

    /**
     * Get shootScript
     * @return shootScript
     */
    public ShootScriptDetail getShootScript() {
        return shootScript;
    }

    public void setShootScript(ShootScriptDetail shootScript) {
        this.shootScript = shootScript;
    }

    public ShootScriptShowItem withSubtitleFileInfo(SubtitleFileInfo subtitleFileInfo) {
        this.subtitleFileInfo = subtitleFileInfo;
        return this;
    }

    public ShootScriptShowItem withSubtitleFileInfo(Consumer<SubtitleFileInfo> subtitleFileInfoSetter) {
        if (this.subtitleFileInfo == null) {
            this.subtitleFileInfo = new SubtitleFileInfo();
            subtitleFileInfoSetter.accept(this.subtitleFileInfo);
        }

        return this;
    }

    /**
     * Get subtitleFileInfo
     * @return subtitleFileInfo
     */
    public SubtitleFileInfo getSubtitleFileInfo() {
        return subtitleFileInfo;
    }

    public void setSubtitleFileInfo(SubtitleFileInfo subtitleFileInfo) {
        this.subtitleFileInfo = subtitleFileInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShootScriptShowItem that = (ShootScriptShowItem) obj;
        return Objects.equals(this.sequenceNo, that.sequenceNo) && Objects.equals(this.shootScript, that.shootScript)
            && Objects.equals(this.subtitleFileInfo, that.subtitleFileInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequenceNo, shootScript, subtitleFileInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShootScriptShowItem {\n");
        sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
        sb.append("    shootScript: ").append(toIndentedString(shootScript)).append("\n");
        sb.append("    subtitleFileInfo: ").append(toIndentedString(subtitleFileInfo)).append("\n");
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
