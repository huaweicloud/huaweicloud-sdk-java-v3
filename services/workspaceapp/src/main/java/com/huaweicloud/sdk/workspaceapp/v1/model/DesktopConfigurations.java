package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “桌面”文件夹重定向配置
 */
public class DesktopConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_status")

    private Integer desktopStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_redirection_type")

    private Integer desktopRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_storage_path")

    private String desktopStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_relative_path")

    private String desktopRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_exclusive_rights")

    private Integer desktopExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_move_contents")

    private Integer desktopMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_move_content_on_policy_removal")

    private Integer desktopMoveContentOnPolicyRemoval;

    public DesktopConfigurations withDesktopStatus(Integer desktopStatus) {
        this.desktopStatus = desktopStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return desktopStatus
     */
    public Integer getDesktopStatus() {
        return desktopStatus;
    }

    public void setDesktopStatus(Integer desktopStatus) {
        this.desktopStatus = desktopStatus;
    }

    public DesktopConfigurations withDesktopRedirectionType(Integer desktopRedirectionType) {
        this.desktopRedirectionType = desktopRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return desktopRedirectionType
     */
    public Integer getDesktopRedirectionType() {
        return desktopRedirectionType;
    }

    public void setDesktopRedirectionType(Integer desktopRedirectionType) {
        this.desktopRedirectionType = desktopRedirectionType;
    }

    public DesktopConfigurations withDesktopStoragePath(String desktopStoragePath) {
        this.desktopStoragePath = desktopStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return desktopStoragePath
     */
    public String getDesktopStoragePath() {
        return desktopStoragePath;
    }

    public void setDesktopStoragePath(String desktopStoragePath) {
        this.desktopStoragePath = desktopStoragePath;
    }

    public DesktopConfigurations withDesktopRelativePath(String desktopRelativePath) {
        this.desktopRelativePath = desktopRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return desktopRelativePath
     */
    public String getDesktopRelativePath() {
        return desktopRelativePath;
    }

    public void setDesktopRelativePath(String desktopRelativePath) {
        this.desktopRelativePath = desktopRelativePath;
    }

    public DesktopConfigurations withDesktopExclusiveRights(Integer desktopExclusiveRights) {
        this.desktopExclusiveRights = desktopExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return desktopExclusiveRights
     */
    public Integer getDesktopExclusiveRights() {
        return desktopExclusiveRights;
    }

    public void setDesktopExclusiveRights(Integer desktopExclusiveRights) {
        this.desktopExclusiveRights = desktopExclusiveRights;
    }

    public DesktopConfigurations withDesktopMoveContents(Integer desktopMoveContents) {
        this.desktopMoveContents = desktopMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return desktopMoveContents
     */
    public Integer getDesktopMoveContents() {
        return desktopMoveContents;
    }

    public void setDesktopMoveContents(Integer desktopMoveContents) {
        this.desktopMoveContents = desktopMoveContents;
    }

    public DesktopConfigurations withDesktopMoveContentOnPolicyRemoval(Integer desktopMoveContentOnPolicyRemoval) {
        this.desktopMoveContentOnPolicyRemoval = desktopMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return desktopMoveContentOnPolicyRemoval
     */
    public Integer getDesktopMoveContentOnPolicyRemoval() {
        return desktopMoveContentOnPolicyRemoval;
    }

    public void setDesktopMoveContentOnPolicyRemoval(Integer desktopMoveContentOnPolicyRemoval) {
        this.desktopMoveContentOnPolicyRemoval = desktopMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopConfigurations that = (DesktopConfigurations) obj;
        return Objects.equals(this.desktopStatus, that.desktopStatus)
            && Objects.equals(this.desktopRedirectionType, that.desktopRedirectionType)
            && Objects.equals(this.desktopStoragePath, that.desktopStoragePath)
            && Objects.equals(this.desktopRelativePath, that.desktopRelativePath)
            && Objects.equals(this.desktopExclusiveRights, that.desktopExclusiveRights)
            && Objects.equals(this.desktopMoveContents, that.desktopMoveContents)
            && Objects.equals(this.desktopMoveContentOnPolicyRemoval, that.desktopMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopStatus,
            desktopRedirectionType,
            desktopStoragePath,
            desktopRelativePath,
            desktopExclusiveRights,
            desktopMoveContents,
            desktopMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopConfigurations {\n");
        sb.append("    desktopStatus: ").append(toIndentedString(desktopStatus)).append("\n");
        sb.append("    desktopRedirectionType: ").append(toIndentedString(desktopRedirectionType)).append("\n");
        sb.append("    desktopStoragePath: ").append(toIndentedString(desktopStoragePath)).append("\n");
        sb.append("    desktopRelativePath: ").append(toIndentedString(desktopRelativePath)).append("\n");
        sb.append("    desktopExclusiveRights: ").append(toIndentedString(desktopExclusiveRights)).append("\n");
        sb.append("    desktopMoveContents: ").append(toIndentedString(desktopMoveContents)).append("\n");
        sb.append("    desktopMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(desktopMoveContentOnPolicyRemoval))
            .append("\n");
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
