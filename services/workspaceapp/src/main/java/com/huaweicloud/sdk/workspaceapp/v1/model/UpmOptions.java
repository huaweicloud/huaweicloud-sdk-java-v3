package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置文件漫游技术配置。
 */
public class UpmOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_profile_rule")

    private String userProfileRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redir_exclude_common_folders")

    private String redirExcludeCommonFolders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redir_exclude_copy0s")

    private String redirExcludeCopy0s;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redir_exclude_copy1s")

    private String redirExcludeCopy1s;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redir_exclude_copy2s")

    private String redirExcludeCopy2s;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redir_exclude_copy3s")

    private String redirExcludeCopy3s;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redir_exclude_includes")

    private String redirExcludeIncludes;

    public UpmOptions withUserProfileRule(String userProfileRule) {
        this.userProfileRule = userProfileRule;
        return this;
    }

    /**
     * 配置项内容。
     * @return userProfileRule
     */
    public String getUserProfileRule() {
        return userProfileRule;
    }

    public void setUserProfileRule(String userProfileRule) {
        this.userProfileRule = userProfileRule;
    }

    public UpmOptions withRedirExcludeCommonFolders(String redirExcludeCommonFolders) {
        this.redirExcludeCommonFolders = redirExcludeCommonFolders;
        return this;
    }

    /**
     * 排除常用文件夹。
     * @return redirExcludeCommonFolders
     */
    public String getRedirExcludeCommonFolders() {
        return redirExcludeCommonFolders;
    }

    public void setRedirExcludeCommonFolders(String redirExcludeCommonFolders) {
        this.redirExcludeCommonFolders = redirExcludeCommonFolders;
    }

    public UpmOptions withRedirExcludeCopy0s(String redirExcludeCopy0s) {
        this.redirExcludeCopy0s = redirExcludeCopy0s;
        return this;
    }

    /**
     * 禁止自定义文件夹/copy base = 0,copy back = 0。
     * @return redirExcludeCopy0s
     */
    public String getRedirExcludeCopy0s() {
        return redirExcludeCopy0s;
    }

    public void setRedirExcludeCopy0s(String redirExcludeCopy0s) {
        this.redirExcludeCopy0s = redirExcludeCopy0s;
    }

    public UpmOptions withRedirExcludeCopy1s(String redirExcludeCopy1s) {
        this.redirExcludeCopy1s = redirExcludeCopy1s;
        return this;
    }

    /**
     * 禁止自定义文件夹/copy base = 0,copy back = 1。
     * @return redirExcludeCopy1s
     */
    public String getRedirExcludeCopy1s() {
        return redirExcludeCopy1s;
    }

    public void setRedirExcludeCopy1s(String redirExcludeCopy1s) {
        this.redirExcludeCopy1s = redirExcludeCopy1s;
    }

    public UpmOptions withRedirExcludeCopy2s(String redirExcludeCopy2s) {
        this.redirExcludeCopy2s = redirExcludeCopy2s;
        return this;
    }

    /**
     * 禁止自定义文件夹/copy base = 1,copy back = 0。
     * @return redirExcludeCopy2s
     */
    public String getRedirExcludeCopy2s() {
        return redirExcludeCopy2s;
    }

    public void setRedirExcludeCopy2s(String redirExcludeCopy2s) {
        this.redirExcludeCopy2s = redirExcludeCopy2s;
    }

    public UpmOptions withRedirExcludeCopy3s(String redirExcludeCopy3s) {
        this.redirExcludeCopy3s = redirExcludeCopy3s;
        return this;
    }

    /**
     * 禁止自定义文件夹/copy base = 1,copy back = 1。
     * @return redirExcludeCopy3s
     */
    public String getRedirExcludeCopy3s() {
        return redirExcludeCopy3s;
    }

    public void setRedirExcludeCopy3s(String redirExcludeCopy3s) {
        this.redirExcludeCopy3s = redirExcludeCopy3s;
    }

    public UpmOptions withRedirExcludeIncludes(String redirExcludeIncludes) {
        this.redirExcludeIncludes = redirExcludeIncludes;
        return this;
    }

    /**
     * 允许自定义文件夹
     * @return redirExcludeIncludes
     */
    public String getRedirExcludeIncludes() {
        return redirExcludeIncludes;
    }

    public void setRedirExcludeIncludes(String redirExcludeIncludes) {
        this.redirExcludeIncludes = redirExcludeIncludes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpmOptions that = (UpmOptions) obj;
        return Objects.equals(this.userProfileRule, that.userProfileRule)
            && Objects.equals(this.redirExcludeCommonFolders, that.redirExcludeCommonFolders)
            && Objects.equals(this.redirExcludeCopy0s, that.redirExcludeCopy0s)
            && Objects.equals(this.redirExcludeCopy1s, that.redirExcludeCopy1s)
            && Objects.equals(this.redirExcludeCopy2s, that.redirExcludeCopy2s)
            && Objects.equals(this.redirExcludeCopy3s, that.redirExcludeCopy3s)
            && Objects.equals(this.redirExcludeIncludes, that.redirExcludeIncludes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileRule,
            redirExcludeCommonFolders,
            redirExcludeCopy0s,
            redirExcludeCopy1s,
            redirExcludeCopy2s,
            redirExcludeCopy3s,
            redirExcludeIncludes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpmOptions {\n");
        sb.append("    userProfileRule: ").append(toIndentedString(userProfileRule)).append("\n");
        sb.append("    redirExcludeCommonFolders: ").append(toIndentedString(redirExcludeCommonFolders)).append("\n");
        sb.append("    redirExcludeCopy0s: ").append(toIndentedString(redirExcludeCopy0s)).append("\n");
        sb.append("    redirExcludeCopy1s: ").append(toIndentedString(redirExcludeCopy1s)).append("\n");
        sb.append("    redirExcludeCopy2s: ").append(toIndentedString(redirExcludeCopy2s)).append("\n");
        sb.append("    redirExcludeCopy3s: ").append(toIndentedString(redirExcludeCopy3s)).append("\n");
        sb.append("    redirExcludeIncludes: ").append(toIndentedString(redirExcludeIncludes)).append("\n");
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
