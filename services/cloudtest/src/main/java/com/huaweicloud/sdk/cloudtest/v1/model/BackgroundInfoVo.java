package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BackgroundInfoVo
 */
public class BackgroundInfoVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_file_name")

    private String coverFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_file_name")

    private String backgroundFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_file_name")

    private String logoFileName;

    public BackgroundInfoVo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public BackgroundInfoVo withCoverFileName(String coverFileName) {
        this.coverFileName = coverFileName;
        return this;
    }

    /**
     * cover文件名称
     * @return coverFileName
     */
    public String getCoverFileName() {
        return coverFileName;
    }

    public void setCoverFileName(String coverFileName) {
        this.coverFileName = coverFileName;
    }

    public BackgroundInfoVo withBackgroundFileName(String backgroundFileName) {
        this.backgroundFileName = backgroundFileName;
        return this;
    }

    /**
     * 背景文件名称
     * @return backgroundFileName
     */
    public String getBackgroundFileName() {
        return backgroundFileName;
    }

    public void setBackgroundFileName(String backgroundFileName) {
        this.backgroundFileName = backgroundFileName;
    }

    public BackgroundInfoVo withLogoFileName(String logoFileName) {
        this.logoFileName = logoFileName;
        return this;
    }

    /**
     * logo文件名称
     * @return logoFileName
     */
    public String getLogoFileName() {
        return logoFileName;
    }

    public void setLogoFileName(String logoFileName) {
        this.logoFileName = logoFileName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackgroundInfoVo that = (BackgroundInfoVo) obj;
        return Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.coverFileName, that.coverFileName)
            && Objects.equals(this.backgroundFileName, that.backgroundFileName)
            && Objects.equals(this.logoFileName, that.logoFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUuid, coverFileName, backgroundFileName, logoFileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackgroundInfoVo {\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    coverFileName: ").append(toIndentedString(coverFileName)).append("\n");
        sb.append("    backgroundFileName: ").append(toIndentedString(backgroundFileName)).append("\n");
        sb.append("    logoFileName: ").append(toIndentedString(logoFileName)).append("\n");
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
