package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “AppData(Roaming)”文件夹重定向配置
 */
public class AppDataRoamingConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_data_roaming_status")

    private Integer appDataRoamingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_data_roaming_redirection_type")

    private Integer appDataRoamingRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_data_roaming_storage_path")

    private String appDataRoamingStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_data_roaming_relative_path")

    private String appDataRoamingRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_data_roaming_exclusive_rights")

    private Integer appDataRoamingExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_data_roaming_move_contents")

    private Integer appDataRoamingMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_data_roaming_move_content_on_policy_removal")

    private Integer appDataRoamingMoveContentOnPolicyRemoval;

    public AppDataRoamingConfigurations withAppDataRoamingStatus(Integer appDataRoamingStatus) {
        this.appDataRoamingStatus = appDataRoamingStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return appDataRoamingStatus
     */
    public Integer getAppDataRoamingStatus() {
        return appDataRoamingStatus;
    }

    public void setAppDataRoamingStatus(Integer appDataRoamingStatus) {
        this.appDataRoamingStatus = appDataRoamingStatus;
    }

    public AppDataRoamingConfigurations withAppDataRoamingRedirectionType(Integer appDataRoamingRedirectionType) {
        this.appDataRoamingRedirectionType = appDataRoamingRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return appDataRoamingRedirectionType
     */
    public Integer getAppDataRoamingRedirectionType() {
        return appDataRoamingRedirectionType;
    }

    public void setAppDataRoamingRedirectionType(Integer appDataRoamingRedirectionType) {
        this.appDataRoamingRedirectionType = appDataRoamingRedirectionType;
    }

    public AppDataRoamingConfigurations withAppDataRoamingStoragePath(String appDataRoamingStoragePath) {
        this.appDataRoamingStoragePath = appDataRoamingStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return appDataRoamingStoragePath
     */
    public String getAppDataRoamingStoragePath() {
        return appDataRoamingStoragePath;
    }

    public void setAppDataRoamingStoragePath(String appDataRoamingStoragePath) {
        this.appDataRoamingStoragePath = appDataRoamingStoragePath;
    }

    public AppDataRoamingConfigurations withAppDataRoamingRelativePath(String appDataRoamingRelativePath) {
        this.appDataRoamingRelativePath = appDataRoamingRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return appDataRoamingRelativePath
     */
    public String getAppDataRoamingRelativePath() {
        return appDataRoamingRelativePath;
    }

    public void setAppDataRoamingRelativePath(String appDataRoamingRelativePath) {
        this.appDataRoamingRelativePath = appDataRoamingRelativePath;
    }

    public AppDataRoamingConfigurations withAppDataRoamingExclusiveRights(Integer appDataRoamingExclusiveRights) {
        this.appDataRoamingExclusiveRights = appDataRoamingExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return appDataRoamingExclusiveRights
     */
    public Integer getAppDataRoamingExclusiveRights() {
        return appDataRoamingExclusiveRights;
    }

    public void setAppDataRoamingExclusiveRights(Integer appDataRoamingExclusiveRights) {
        this.appDataRoamingExclusiveRights = appDataRoamingExclusiveRights;
    }

    public AppDataRoamingConfigurations withAppDataRoamingMoveContents(Integer appDataRoamingMoveContents) {
        this.appDataRoamingMoveContents = appDataRoamingMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return appDataRoamingMoveContents
     */
    public Integer getAppDataRoamingMoveContents() {
        return appDataRoamingMoveContents;
    }

    public void setAppDataRoamingMoveContents(Integer appDataRoamingMoveContents) {
        this.appDataRoamingMoveContents = appDataRoamingMoveContents;
    }

    public AppDataRoamingConfigurations withAppDataRoamingMoveContentOnPolicyRemoval(
        Integer appDataRoamingMoveContentOnPolicyRemoval) {
        this.appDataRoamingMoveContentOnPolicyRemoval = appDataRoamingMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return appDataRoamingMoveContentOnPolicyRemoval
     */
    public Integer getAppDataRoamingMoveContentOnPolicyRemoval() {
        return appDataRoamingMoveContentOnPolicyRemoval;
    }

    public void setAppDataRoamingMoveContentOnPolicyRemoval(Integer appDataRoamingMoveContentOnPolicyRemoval) {
        this.appDataRoamingMoveContentOnPolicyRemoval = appDataRoamingMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppDataRoamingConfigurations that = (AppDataRoamingConfigurations) obj;
        return Objects.equals(this.appDataRoamingStatus, that.appDataRoamingStatus)
            && Objects.equals(this.appDataRoamingRedirectionType, that.appDataRoamingRedirectionType)
            && Objects.equals(this.appDataRoamingStoragePath, that.appDataRoamingStoragePath)
            && Objects.equals(this.appDataRoamingRelativePath, that.appDataRoamingRelativePath)
            && Objects.equals(this.appDataRoamingExclusiveRights, that.appDataRoamingExclusiveRights)
            && Objects.equals(this.appDataRoamingMoveContents, that.appDataRoamingMoveContents) && Objects
                .equals(this.appDataRoamingMoveContentOnPolicyRemoval, that.appDataRoamingMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appDataRoamingStatus,
            appDataRoamingRedirectionType,
            appDataRoamingStoragePath,
            appDataRoamingRelativePath,
            appDataRoamingExclusiveRights,
            appDataRoamingMoveContents,
            appDataRoamingMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppDataRoamingConfigurations {\n");
        sb.append("    appDataRoamingStatus: ").append(toIndentedString(appDataRoamingStatus)).append("\n");
        sb.append("    appDataRoamingRedirectionType: ")
            .append(toIndentedString(appDataRoamingRedirectionType))
            .append("\n");
        sb.append("    appDataRoamingStoragePath: ").append(toIndentedString(appDataRoamingStoragePath)).append("\n");
        sb.append("    appDataRoamingRelativePath: ").append(toIndentedString(appDataRoamingRelativePath)).append("\n");
        sb.append("    appDataRoamingExclusiveRights: ")
            .append(toIndentedString(appDataRoamingExclusiveRights))
            .append("\n");
        sb.append("    appDataRoamingMoveContents: ").append(toIndentedString(appDataRoamingMoveContents)).append("\n");
        sb.append("    appDataRoamingMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(appDataRoamingMoveContentOnPolicyRemoval))
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
