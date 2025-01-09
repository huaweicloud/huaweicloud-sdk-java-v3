package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 个性化数据管理。
 */
public class PoliciesPersonalizedDataMgmt {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "personalized_data_mgmt_path")

    private String personalizedDataMgmtPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data_roaming_enable")

    private Boolean userDataRoamingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data_roaming_options")

    private PoliciesPersonalizedDataMgmtUserDataRoamingOptions userDataRoamingOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_folder_redirection_enable")

    private Boolean userFolderRedirectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_folder_redirection_options")

    private PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions userFolderRedirectionOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logoff_delete_user_configuration")

    private Boolean logoffDeleteUserConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_drive_mapping_enable")

    private Boolean networkDriveMappingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_drive_mapping_options")

    private PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions networkDriveMappingOptions;

    public PoliciesPersonalizedDataMgmt withPersonalizedDataMgmtPath(String personalizedDataMgmtPath) {
        this.personalizedDataMgmtPath = personalizedDataMgmtPath;
        return this;
    }

    /**
     * 个性化数据管理路径。
     * @return personalizedDataMgmtPath
     */
    public String getPersonalizedDataMgmtPath() {
        return personalizedDataMgmtPath;
    }

    public void setPersonalizedDataMgmtPath(String personalizedDataMgmtPath) {
        this.personalizedDataMgmtPath = personalizedDataMgmtPath;
    }

    public PoliciesPersonalizedDataMgmt withUserDataRoamingEnable(Boolean userDataRoamingEnable) {
        this.userDataRoamingEnable = userDataRoamingEnable;
        return this;
    }

    /**
     * 用户数据漫游
     * @return userDataRoamingEnable
     */
    public Boolean getUserDataRoamingEnable() {
        return userDataRoamingEnable;
    }

    public void setUserDataRoamingEnable(Boolean userDataRoamingEnable) {
        this.userDataRoamingEnable = userDataRoamingEnable;
    }

    public PoliciesPersonalizedDataMgmt withUserDataRoamingOptions(
        PoliciesPersonalizedDataMgmtUserDataRoamingOptions userDataRoamingOptions) {
        this.userDataRoamingOptions = userDataRoamingOptions;
        return this;
    }

    public PoliciesPersonalizedDataMgmt withUserDataRoamingOptions(
        Consumer<PoliciesPersonalizedDataMgmtUserDataRoamingOptions> userDataRoamingOptionsSetter) {
        if (this.userDataRoamingOptions == null) {
            this.userDataRoamingOptions = new PoliciesPersonalizedDataMgmtUserDataRoamingOptions();
            userDataRoamingOptionsSetter.accept(this.userDataRoamingOptions);
        }

        return this;
    }

    /**
     * Get userDataRoamingOptions
     * @return userDataRoamingOptions
     */
    public PoliciesPersonalizedDataMgmtUserDataRoamingOptions getUserDataRoamingOptions() {
        return userDataRoamingOptions;
    }

    public void setUserDataRoamingOptions(PoliciesPersonalizedDataMgmtUserDataRoamingOptions userDataRoamingOptions) {
        this.userDataRoamingOptions = userDataRoamingOptions;
    }

    public PoliciesPersonalizedDataMgmt withUserFolderRedirectionEnable(Boolean userFolderRedirectionEnable) {
        this.userFolderRedirectionEnable = userFolderRedirectionEnable;
        return this;
    }

    /**
     * 启用用户文件夹重定向
     * @return userFolderRedirectionEnable
     */
    public Boolean getUserFolderRedirectionEnable() {
        return userFolderRedirectionEnable;
    }

    public void setUserFolderRedirectionEnable(Boolean userFolderRedirectionEnable) {
        this.userFolderRedirectionEnable = userFolderRedirectionEnable;
    }

    public PoliciesPersonalizedDataMgmt withUserFolderRedirectionOptions(
        PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions userFolderRedirectionOptions) {
        this.userFolderRedirectionOptions = userFolderRedirectionOptions;
        return this;
    }

    public PoliciesPersonalizedDataMgmt withUserFolderRedirectionOptions(
        Consumer<PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions> userFolderRedirectionOptionsSetter) {
        if (this.userFolderRedirectionOptions == null) {
            this.userFolderRedirectionOptions = new PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions();
            userFolderRedirectionOptionsSetter.accept(this.userFolderRedirectionOptions);
        }

        return this;
    }

    /**
     * Get userFolderRedirectionOptions
     * @return userFolderRedirectionOptions
     */
    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions getUserFolderRedirectionOptions() {
        return userFolderRedirectionOptions;
    }

    public void setUserFolderRedirectionOptions(
        PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions userFolderRedirectionOptions) {
        this.userFolderRedirectionOptions = userFolderRedirectionOptions;
    }

    public PoliciesPersonalizedDataMgmt withLogoffDeleteUserConfiguration(Boolean logoffDeleteUserConfiguration) {
        this.logoffDeleteUserConfiguration = logoffDeleteUserConfiguration;
        return this;
    }

    /**
     * 启用用户文件夹重定向
     * @return logoffDeleteUserConfiguration
     */
    public Boolean getLogoffDeleteUserConfiguration() {
        return logoffDeleteUserConfiguration;
    }

    public void setLogoffDeleteUserConfiguration(Boolean logoffDeleteUserConfiguration) {
        this.logoffDeleteUserConfiguration = logoffDeleteUserConfiguration;
    }

    public PoliciesPersonalizedDataMgmt withNetworkDriveMappingEnable(Boolean networkDriveMappingEnable) {
        this.networkDriveMappingEnable = networkDriveMappingEnable;
        return this;
    }

    /**
     * 启用用户文件夹重定向
     * @return networkDriveMappingEnable
     */
    public Boolean getNetworkDriveMappingEnable() {
        return networkDriveMappingEnable;
    }

    public void setNetworkDriveMappingEnable(Boolean networkDriveMappingEnable) {
        this.networkDriveMappingEnable = networkDriveMappingEnable;
    }

    public PoliciesPersonalizedDataMgmt withNetworkDriveMappingOptions(
        PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions networkDriveMappingOptions) {
        this.networkDriveMappingOptions = networkDriveMappingOptions;
        return this;
    }

    public PoliciesPersonalizedDataMgmt withNetworkDriveMappingOptions(
        Consumer<PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions> networkDriveMappingOptionsSetter) {
        if (this.networkDriveMappingOptions == null) {
            this.networkDriveMappingOptions = new PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions();
            networkDriveMappingOptionsSetter.accept(this.networkDriveMappingOptions);
        }

        return this;
    }

    /**
     * Get networkDriveMappingOptions
     * @return networkDriveMappingOptions
     */
    public PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions getNetworkDriveMappingOptions() {
        return networkDriveMappingOptions;
    }

    public void setNetworkDriveMappingOptions(
        PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions networkDriveMappingOptions) {
        this.networkDriveMappingOptions = networkDriveMappingOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPersonalizedDataMgmt that = (PoliciesPersonalizedDataMgmt) obj;
        return Objects.equals(this.personalizedDataMgmtPath, that.personalizedDataMgmtPath)
            && Objects.equals(this.userDataRoamingEnable, that.userDataRoamingEnable)
            && Objects.equals(this.userDataRoamingOptions, that.userDataRoamingOptions)
            && Objects.equals(this.userFolderRedirectionEnable, that.userFolderRedirectionEnable)
            && Objects.equals(this.userFolderRedirectionOptions, that.userFolderRedirectionOptions)
            && Objects.equals(this.logoffDeleteUserConfiguration, that.logoffDeleteUserConfiguration)
            && Objects.equals(this.networkDriveMappingEnable, that.networkDriveMappingEnable)
            && Objects.equals(this.networkDriveMappingOptions, that.networkDriveMappingOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalizedDataMgmtPath,
            userDataRoamingEnable,
            userDataRoamingOptions,
            userFolderRedirectionEnable,
            userFolderRedirectionOptions,
            logoffDeleteUserConfiguration,
            networkDriveMappingEnable,
            networkDriveMappingOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPersonalizedDataMgmt {\n");
        sb.append("    personalizedDataMgmtPath: ").append(toIndentedString(personalizedDataMgmtPath)).append("\n");
        sb.append("    userDataRoamingEnable: ").append(toIndentedString(userDataRoamingEnable)).append("\n");
        sb.append("    userDataRoamingOptions: ").append(toIndentedString(userDataRoamingOptions)).append("\n");
        sb.append("    userFolderRedirectionEnable: ")
            .append(toIndentedString(userFolderRedirectionEnable))
            .append("\n");
        sb.append("    userFolderRedirectionOptions: ")
            .append(toIndentedString(userFolderRedirectionOptions))
            .append("\n");
        sb.append("    logoffDeleteUserConfiguration: ")
            .append(toIndentedString(logoffDeleteUserConfiguration))
            .append("\n");
        sb.append("    networkDriveMappingEnable: ").append(toIndentedString(networkDriveMappingEnable)).append("\n");
        sb.append("    networkDriveMappingOptions: ").append(toIndentedString(networkDriveMappingOptions)).append("\n");
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
