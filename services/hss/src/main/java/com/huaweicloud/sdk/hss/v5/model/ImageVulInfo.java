package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageVulInfo
 */
public class ImageVulInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_necessity")

    private String repairNecessity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private String position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_path")

    private String appPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution")

    private String solution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public ImageVulInfo withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * 漏洞id
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public ImageVulInfo withRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
        return this;
    }

    /**
     * 修复紧急度，包含如下3种。   - immediate_repair ：高危。   - delay_repair ：中危。   - not_needed_repair ：低危。
     * @return repairNecessity
     */
    public String getRepairNecessity() {
        return repairNecessity;
    }

    public void setRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
    }

    public ImageVulInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 漏洞描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageVulInfo withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * 漏洞所在镜像层
     * @return position
     */
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ImageVulInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 漏洞的软件名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ImageVulInfo withAppPath(String appPath) {
        this.appPath = appPath;
        return this;
    }

    /**
     * 应用软件的路径（只有应用漏洞有该字段）
     * @return appPath
     */
    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public ImageVulInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 软件版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ImageVulInfo withSolution(String solution) {
        this.solution = solution;
        return this;
    }

    /**
     * 解决方案
     * @return solution
     */
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public ImageVulInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 补丁地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageVulInfo that = (ImageVulInfo) obj;
        return Objects.equals(this.vulId, that.vulId) && Objects.equals(this.repairNecessity, that.repairNecessity)
            && Objects.equals(this.description, that.description) && Objects.equals(this.position, that.position)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.appPath, that.appPath)
            && Objects.equals(this.version, that.version) && Objects.equals(this.solution, that.solution)
            && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulId, repairNecessity, description, position, appName, appPath, version, solution, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageVulInfo {\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    repairNecessity: ").append(toIndentedString(repairNecessity)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appPath: ").append(toIndentedString(appPath)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
