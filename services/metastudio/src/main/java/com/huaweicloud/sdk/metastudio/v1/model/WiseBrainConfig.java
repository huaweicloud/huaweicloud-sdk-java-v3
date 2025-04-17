package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 交互助手应用配置
 */
public class WiseBrainConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sis_region")

    private Integer sisRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sis_project_id")

    private String sisProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_hot_words")

    private Boolean enableHotWords;

    public WiseBrainConfig withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 角色ID。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public WiseBrainConfig withSisRegion(Integer sisRegion) {
        this.sisRegion = sisRegion;
        return this;
    }

    /**
     * SIS所在区域
     * minimum: 0
     * maximum: 32
     * @return sisRegion
     */
    public Integer getSisRegion() {
        return sisRegion;
    }

    public void setSisRegion(Integer sisRegion) {
        this.sisRegion = sisRegion;
    }

    public WiseBrainConfig withSisProjectId(String sisProjectId) {
        this.sisProjectId = sisProjectId;
        return this;
    }

    /**
     * SIS所在区域的projectId
     * @return sisProjectId
     */
    public String getSisProjectId() {
        return sisProjectId;
    }

    public void setSisProjectId(String sisProjectId) {
        this.sisProjectId = sisProjectId;
    }

    public WiseBrainConfig withEnableHotWords(Boolean enableHotWords) {
        this.enableHotWords = enableHotWords;
        return this;
    }

    /**
     * 是否开启热词
     * @return enableHotWords
     */
    public Boolean getEnableHotWords() {
        return enableHotWords;
    }

    public void setEnableHotWords(Boolean enableHotWords) {
        this.enableHotWords = enableHotWords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WiseBrainConfig that = (WiseBrainConfig) obj;
        return Objects.equals(this.roleId, that.roleId) && Objects.equals(this.sisRegion, that.sisRegion)
            && Objects.equals(this.sisProjectId, that.sisProjectId)
            && Objects.equals(this.enableHotWords, that.enableHotWords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, sisRegion, sisProjectId, enableHotWords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WiseBrainConfig {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    sisRegion: ").append(toIndentedString(sisRegion)).append("\n");
        sb.append("    sisProjectId: ").append(toIndentedString(sisProjectId)).append("\n");
        sb.append("    enableHotWords: ").append(toIndentedString(enableHotWords)).append("\n");
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
