package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AppFilterDto
 */
public class AppFilterDto {

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
    @JsonProperty(value = "app_node_labels")

    private List<String> appNodeLabels = null;

    public AppFilterDto withAppId(String appId) {
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

    public AppFilterDto withAppName(String appName) {
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

    public AppFilterDto withAppVersion(String appVersion) {
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

    public AppFilterDto withAppNodeLabels(List<String> appNodeLabels) {
        this.appNodeLabels = appNodeLabels;
        return this;
    }

    public AppFilterDto addAppNodeLabelsItem(String appNodeLabelsItem) {
        if (this.appNodeLabels == null) {
            this.appNodeLabels = new ArrayList<>();
        }
        this.appNodeLabels.add(appNodeLabelsItem);
        return this;
    }

    public AppFilterDto withAppNodeLabels(Consumer<List<String>> appNodeLabelsSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppFilterDto appFilterDto = (AppFilterDto) o;
        return Objects.equals(this.appId, appFilterDto.appId) && Objects.equals(this.appName, appFilterDto.appName)
            && Objects.equals(this.appVersion, appFilterDto.appVersion)
            && Objects.equals(this.appNodeLabels, appFilterDto.appNodeLabels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, appVersion, appNodeLabels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppFilterDto {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    appNodeLabels: ").append(toIndentedString(appNodeLabels)).append("\n");
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
