package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AppInfoDto
 */
public class AppInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_src_project_name")

    private String appSrcProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_labels")

    private List<String> appLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_summary")

    private String appSummary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_description")

    private String appDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_image")

    private String appImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_commands")

    private List<String> appCommands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_input_parameters")

    private List<AppInputParameterDto> appInputParameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_output_parameters")

    private List<AppOutputParameterDto> appOutputParameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_node_labels")

    private List<String> appNodeLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_icon")

    private String appIcon;

    public AppInfoDto withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public AppInfoDto withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AppInfoDto withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * 应用版本
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public AppInfoDto withAppSrcProjectName(String appSrcProjectName) {
        this.appSrcProjectName = appSrcProjectName;
        return this;
    }

    /**
     * 应用来源项目名称
     * @return appSrcProjectName
     */
    public String getAppSrcProjectName() {
        return appSrcProjectName;
    }

    public void setAppSrcProjectName(String appSrcProjectName) {
        this.appSrcProjectName = appSrcProjectName;
    }

    public AppInfoDto withAppLabels(List<String> appLabels) {
        this.appLabels = appLabels;
        return this;
    }

    public AppInfoDto addAppLabelsItem(String appLabelsItem) {
        if (this.appLabels == null) {
            this.appLabels = new ArrayList<>();
        }
        this.appLabels.add(appLabelsItem);
        return this;
    }

    public AppInfoDto withAppLabels(Consumer<List<String>> appLabelsSetter) {
        if (this.appLabels == null) {
            this.appLabels = new ArrayList<>();
        }
        appLabelsSetter.accept(this.appLabels);
        return this;
    }

    /**
     * 应用标签
     * @return appLabels
     */
    public List<String> getAppLabels() {
        return appLabels;
    }

    public void setAppLabels(List<String> appLabels) {
        this.appLabels = appLabels;
    }

    public AppInfoDto withAppSummary(String appSummary) {
        this.appSummary = appSummary;
        return this;
    }

    /**
     * 应用简述
     * @return appSummary
     */
    public String getAppSummary() {
        return appSummary;
    }

    public void setAppSummary(String appSummary) {
        this.appSummary = appSummary;
    }

    public AppInfoDto withAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }

    /**
     * 应用描述
     * @return appDescription
     */
    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public AppInfoDto withAppImage(String appImage) {
        this.appImage = appImage;
        return this;
    }

    /**
     * 应用镜像
     * @return appImage
     */
    public String getAppImage() {
        return appImage;
    }

    public void setAppImage(String appImage) {
        this.appImage = appImage;
    }

    public AppInfoDto withAppCommands(List<String> appCommands) {
        this.appCommands = appCommands;
        return this;
    }

    public AppInfoDto addAppCommandsItem(String appCommandsItem) {
        if (this.appCommands == null) {
            this.appCommands = new ArrayList<>();
        }
        this.appCommands.add(appCommandsItem);
        return this;
    }

    public AppInfoDto withAppCommands(Consumer<List<String>> appCommandsSetter) {
        if (this.appCommands == null) {
            this.appCommands = new ArrayList<>();
        }
        appCommandsSetter.accept(this.appCommands);
        return this;
    }

    /**
     * 任务使用到的应用自带的命令信息
     * @return appCommands
     */
    public List<String> getAppCommands() {
        return appCommands;
    }

    public void setAppCommands(List<String> appCommands) {
        this.appCommands = appCommands;
    }

    public AppInfoDto withAppInputParameters(List<AppInputParameterDto> appInputParameters) {
        this.appInputParameters = appInputParameters;
        return this;
    }

    public AppInfoDto addAppInputParametersItem(AppInputParameterDto appInputParametersItem) {
        if (this.appInputParameters == null) {
            this.appInputParameters = new ArrayList<>();
        }
        this.appInputParameters.add(appInputParametersItem);
        return this;
    }

    public AppInfoDto withAppInputParameters(Consumer<List<AppInputParameterDto>> appInputParametersSetter) {
        if (this.appInputParameters == null) {
            this.appInputParameters = new ArrayList<>();
        }
        appInputParametersSetter.accept(this.appInputParameters);
        return this;
    }

    /**
     * 任务使用到的应用自带的输入参数信息
     * @return appInputParameters
     */
    public List<AppInputParameterDto> getAppInputParameters() {
        return appInputParameters;
    }

    public void setAppInputParameters(List<AppInputParameterDto> appInputParameters) {
        this.appInputParameters = appInputParameters;
    }

    public AppInfoDto withAppOutputParameters(List<AppOutputParameterDto> appOutputParameters) {
        this.appOutputParameters = appOutputParameters;
        return this;
    }

    public AppInfoDto addAppOutputParametersItem(AppOutputParameterDto appOutputParametersItem) {
        if (this.appOutputParameters == null) {
            this.appOutputParameters = new ArrayList<>();
        }
        this.appOutputParameters.add(appOutputParametersItem);
        return this;
    }

    public AppInfoDto withAppOutputParameters(Consumer<List<AppOutputParameterDto>> appOutputParametersSetter) {
        if (this.appOutputParameters == null) {
            this.appOutputParameters = new ArrayList<>();
        }
        appOutputParametersSetter.accept(this.appOutputParameters);
        return this;
    }

    /**
     * 任务使用到的应用自带的输出参数信息
     * @return appOutputParameters
     */
    public List<AppOutputParameterDto> getAppOutputParameters() {
        return appOutputParameters;
    }

    public void setAppOutputParameters(List<AppOutputParameterDto> appOutputParameters) {
        this.appOutputParameters = appOutputParameters;
    }

    public AppInfoDto withAppNodeLabels(List<String> appNodeLabels) {
        this.appNodeLabels = appNodeLabels;
        return this;
    }

    public AppInfoDto addAppNodeLabelsItem(String appNodeLabelsItem) {
        if (this.appNodeLabels == null) {
            this.appNodeLabels = new ArrayList<>();
        }
        this.appNodeLabels.add(appNodeLabelsItem);
        return this;
    }

    public AppInfoDto withAppNodeLabels(Consumer<List<String>> appNodeLabelsSetter) {
        if (this.appNodeLabels == null) {
            this.appNodeLabels = new ArrayList<>();
        }
        appNodeLabelsSetter.accept(this.appNodeLabels);
        return this;
    }

    /**
     * 计算节点标签
     * @return appNodeLabels
     */
    public List<String> getAppNodeLabels() {
        return appNodeLabels;
    }

    public void setAppNodeLabels(List<String> appNodeLabels) {
        this.appNodeLabels = appNodeLabels;
    }

    public AppInfoDto withAppIcon(String appIcon) {
        this.appIcon = appIcon;
        return this;
    }

    /**
     * 图标base64编码
     * @return appIcon
     */
    public String getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppInfoDto that = (AppInfoDto) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.appVersion, that.appVersion)
            && Objects.equals(this.appSrcProjectName, that.appSrcProjectName)
            && Objects.equals(this.appLabels, that.appLabels) && Objects.equals(this.appSummary, that.appSummary)
            && Objects.equals(this.appDescription, that.appDescription) && Objects.equals(this.appImage, that.appImage)
            && Objects.equals(this.appCommands, that.appCommands)
            && Objects.equals(this.appInputParameters, that.appInputParameters)
            && Objects.equals(this.appOutputParameters, that.appOutputParameters)
            && Objects.equals(this.appNodeLabels, that.appNodeLabels) && Objects.equals(this.appIcon, that.appIcon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId,
            appName,
            appVersion,
            appSrcProjectName,
            appLabels,
            appSummary,
            appDescription,
            appImage,
            appCommands,
            appInputParameters,
            appOutputParameters,
            appNodeLabels,
            appIcon);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppInfoDto {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    appSrcProjectName: ").append(toIndentedString(appSrcProjectName)).append("\n");
        sb.append("    appLabels: ").append(toIndentedString(appLabels)).append("\n");
        sb.append("    appSummary: ").append(toIndentedString(appSummary)).append("\n");
        sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
        sb.append("    appImage: ").append(toIndentedString(appImage)).append("\n");
        sb.append("    appCommands: ").append(toIndentedString(appCommands)).append("\n");
        sb.append("    appInputParameters: ").append(toIndentedString(appInputParameters)).append("\n");
        sb.append("    appOutputParameters: ").append(toIndentedString(appOutputParameters)).append("\n");
        sb.append("    appNodeLabels: ").append(toIndentedString(appNodeLabels)).append("\n");
        sb.append("    appIcon: ").append(toIndentedString(appIcon)).append("\n");
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
