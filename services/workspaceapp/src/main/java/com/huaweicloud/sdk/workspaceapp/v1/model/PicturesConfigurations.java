package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “图片”文件夹重定向配置
 */
public class PicturesConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pictures_status")

    private Integer picturesStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pictures_redirection_type")

    private Integer picturesRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pictures_storage_path")

    private String picturesStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pictures_relative_path")

    private String picturesRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pictures_exclusive_rights")

    private Integer picturesExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pictures_move_contents")

    private Integer picturesMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pictures_move_content_on_policy_removal")

    private Integer picturesMoveContentOnPolicyRemoval;

    public PicturesConfigurations withPicturesStatus(Integer picturesStatus) {
        this.picturesStatus = picturesStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return picturesStatus
     */
    public Integer getPicturesStatus() {
        return picturesStatus;
    }

    public void setPicturesStatus(Integer picturesStatus) {
        this.picturesStatus = picturesStatus;
    }

    public PicturesConfigurations withPicturesRedirectionType(Integer picturesRedirectionType) {
        this.picturesRedirectionType = picturesRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return picturesRedirectionType
     */
    public Integer getPicturesRedirectionType() {
        return picturesRedirectionType;
    }

    public void setPicturesRedirectionType(Integer picturesRedirectionType) {
        this.picturesRedirectionType = picturesRedirectionType;
    }

    public PicturesConfigurations withPicturesStoragePath(String picturesStoragePath) {
        this.picturesStoragePath = picturesStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return picturesStoragePath
     */
    public String getPicturesStoragePath() {
        return picturesStoragePath;
    }

    public void setPicturesStoragePath(String picturesStoragePath) {
        this.picturesStoragePath = picturesStoragePath;
    }

    public PicturesConfigurations withPicturesRelativePath(String picturesRelativePath) {
        this.picturesRelativePath = picturesRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return picturesRelativePath
     */
    public String getPicturesRelativePath() {
        return picturesRelativePath;
    }

    public void setPicturesRelativePath(String picturesRelativePath) {
        this.picturesRelativePath = picturesRelativePath;
    }

    public PicturesConfigurations withPicturesExclusiveRights(Integer picturesExclusiveRights) {
        this.picturesExclusiveRights = picturesExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return picturesExclusiveRights
     */
    public Integer getPicturesExclusiveRights() {
        return picturesExclusiveRights;
    }

    public void setPicturesExclusiveRights(Integer picturesExclusiveRights) {
        this.picturesExclusiveRights = picturesExclusiveRights;
    }

    public PicturesConfigurations withPicturesMoveContents(Integer picturesMoveContents) {
        this.picturesMoveContents = picturesMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return picturesMoveContents
     */
    public Integer getPicturesMoveContents() {
        return picturesMoveContents;
    }

    public void setPicturesMoveContents(Integer picturesMoveContents) {
        this.picturesMoveContents = picturesMoveContents;
    }

    public PicturesConfigurations withPicturesMoveContentOnPolicyRemoval(Integer picturesMoveContentOnPolicyRemoval) {
        this.picturesMoveContentOnPolicyRemoval = picturesMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return picturesMoveContentOnPolicyRemoval
     */
    public Integer getPicturesMoveContentOnPolicyRemoval() {
        return picturesMoveContentOnPolicyRemoval;
    }

    public void setPicturesMoveContentOnPolicyRemoval(Integer picturesMoveContentOnPolicyRemoval) {
        this.picturesMoveContentOnPolicyRemoval = picturesMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PicturesConfigurations that = (PicturesConfigurations) obj;
        return Objects.equals(this.picturesStatus, that.picturesStatus)
            && Objects.equals(this.picturesRedirectionType, that.picturesRedirectionType)
            && Objects.equals(this.picturesStoragePath, that.picturesStoragePath)
            && Objects.equals(this.picturesRelativePath, that.picturesRelativePath)
            && Objects.equals(this.picturesExclusiveRights, that.picturesExclusiveRights)
            && Objects.equals(this.picturesMoveContents, that.picturesMoveContents)
            && Objects.equals(this.picturesMoveContentOnPolicyRemoval, that.picturesMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(picturesStatus,
            picturesRedirectionType,
            picturesStoragePath,
            picturesRelativePath,
            picturesExclusiveRights,
            picturesMoveContents,
            picturesMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PicturesConfigurations {\n");
        sb.append("    picturesStatus: ").append(toIndentedString(picturesStatus)).append("\n");
        sb.append("    picturesRedirectionType: ").append(toIndentedString(picturesRedirectionType)).append("\n");
        sb.append("    picturesStoragePath: ").append(toIndentedString(picturesStoragePath)).append("\n");
        sb.append("    picturesRelativePath: ").append(toIndentedString(picturesRelativePath)).append("\n");
        sb.append("    picturesExclusiveRights: ").append(toIndentedString(picturesExclusiveRights)).append("\n");
        sb.append("    picturesMoveContents: ").append(toIndentedString(picturesMoveContents)).append("\n");
        sb.append("    picturesMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(picturesMoveContentOnPolicyRemoval))
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
