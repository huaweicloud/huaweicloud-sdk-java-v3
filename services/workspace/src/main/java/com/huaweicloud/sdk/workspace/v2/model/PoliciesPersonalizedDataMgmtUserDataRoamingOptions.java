package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户数据漫游选项。
 */
public class PoliciesPersonalizedDataMgmtUserDataRoamingOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile_streaming_enable")

    private Boolean profileStreamingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roamed_files_local_path")

    private String roamedFilesLocalPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_folders_path")

    private String excludeFoldersPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roaming_registry_method")

    private String roamingRegistryMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roaming_registry_path")

    private String roamingRegistryPath;

    public PoliciesPersonalizedDataMgmtUserDataRoamingOptions withProfileStreamingEnable(
        Boolean profileStreamingEnable) {
        this.profileStreamingEnable = profileStreamingEnable;
        return this;
    }

    /**
     * 配置文件流式处理启用
     * @return profileStreamingEnable
     */
    public Boolean getProfileStreamingEnable() {
        return profileStreamingEnable;
    }

    public void setProfileStreamingEnable(Boolean profileStreamingEnable) {
        this.profileStreamingEnable = profileStreamingEnable;
    }

    public PoliciesPersonalizedDataMgmtUserDataRoamingOptions withRoamedFilesLocalPath(String roamedFilesLocalPath) {
        this.roamedFilesLocalPath = roamedFilesLocalPath;
        return this;
    }

    /**
     * 漫游文件本地路径。
     * @return roamedFilesLocalPath
     */
    public String getRoamedFilesLocalPath() {
        return roamedFilesLocalPath;
    }

    public void setRoamedFilesLocalPath(String roamedFilesLocalPath) {
        this.roamedFilesLocalPath = roamedFilesLocalPath;
    }

    public PoliciesPersonalizedDataMgmtUserDataRoamingOptions withExcludeFoldersPath(String excludeFoldersPath) {
        this.excludeFoldersPath = excludeFoldersPath;
        return this;
    }

    /**
     * 排除文件夹路径
     * @return excludeFoldersPath
     */
    public String getExcludeFoldersPath() {
        return excludeFoldersPath;
    }

    public void setExcludeFoldersPath(String excludeFoldersPath) {
        this.excludeFoldersPath = excludeFoldersPath;
    }

    public PoliciesPersonalizedDataMgmtUserDataRoamingOptions withRoamingRegistryMethod(String roamingRegistryMethod) {
        this.roamingRegistryMethod = roamingRegistryMethod;
        return this;
    }

    /**
     * 排除文件夹路径
     * @return roamingRegistryMethod
     */
    public String getRoamingRegistryMethod() {
        return roamingRegistryMethod;
    }

    public void setRoamingRegistryMethod(String roamingRegistryMethod) {
        this.roamingRegistryMethod = roamingRegistryMethod;
    }

    public PoliciesPersonalizedDataMgmtUserDataRoamingOptions withRoamingRegistryPath(String roamingRegistryPath) {
        this.roamingRegistryPath = roamingRegistryPath;
        return this;
    }

    /**
     * 漫游注册路径
     * @return roamingRegistryPath
     */
    public String getRoamingRegistryPath() {
        return roamingRegistryPath;
    }

    public void setRoamingRegistryPath(String roamingRegistryPath) {
        this.roamingRegistryPath = roamingRegistryPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPersonalizedDataMgmtUserDataRoamingOptions that =
            (PoliciesPersonalizedDataMgmtUserDataRoamingOptions) obj;
        return Objects.equals(this.profileStreamingEnable, that.profileStreamingEnable)
            && Objects.equals(this.roamedFilesLocalPath, that.roamedFilesLocalPath)
            && Objects.equals(this.excludeFoldersPath, that.excludeFoldersPath)
            && Objects.equals(this.roamingRegistryMethod, that.roamingRegistryMethod)
            && Objects.equals(this.roamingRegistryPath, that.roamingRegistryPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileStreamingEnable,
            roamedFilesLocalPath,
            excludeFoldersPath,
            roamingRegistryMethod,
            roamingRegistryPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPersonalizedDataMgmtUserDataRoamingOptions {\n");
        sb.append("    profileStreamingEnable: ").append(toIndentedString(profileStreamingEnable)).append("\n");
        sb.append("    roamedFilesLocalPath: ").append(toIndentedString(roamedFilesLocalPath)).append("\n");
        sb.append("    excludeFoldersPath: ").append(toIndentedString(excludeFoldersPath)).append("\n");
        sb.append("    roamingRegistryMethod: ").append(toIndentedString(roamingRegistryMethod)).append("\n");
        sb.append("    roamingRegistryPath: ").append(toIndentedString(roamingRegistryPath)).append("\n");
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
