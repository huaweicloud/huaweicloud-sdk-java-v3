package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 软件信息 **取值范围**: 不涉及 
 */
public class VulHostAppsResponseInfoDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paths")

    private List<VulHostAppsResponseInfoPaths> paths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private String rule;

    public VulHostAppsResponseInfoDataList withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释**: app名称 **取值范围**: 字符长度1-128位 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public VulHostAppsResponseInfoDataList withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**: 存在漏洞的软件路径，仅应用漏洞、应急漏洞等存在软件路径的漏洞类型查询时存在该字段（注：该字段即将弃用，请使用paths字段获取软件路径相关信息） **取值范围**: 字符长度1-512位 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public VulHostAppsResponseInfoDataList withPaths(List<VulHostAppsResponseInfoPaths> paths) {
        this.paths = paths;
        return this;
    }

    public VulHostAppsResponseInfoDataList addPathsItem(VulHostAppsResponseInfoPaths pathsItem) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        this.paths.add(pathsItem);
        return this;
    }

    public VulHostAppsResponseInfoDataList withPaths(Consumer<List<VulHostAppsResponseInfoPaths>> pathsSetter) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        pathsSetter.accept(this.paths);
        return this;
    }

    /**
     * **参数解释**: 存在漏洞的软件路径列表，仅应用漏洞、应急漏洞等存在软件路径的漏洞类型查询时存在该字段 **取值范围**: 不涉及 
     * @return paths
     */
    public List<VulHostAppsResponseInfoPaths> getPaths() {
        return paths;
    }

    public void setPaths(List<VulHostAppsResponseInfoPaths> paths) {
        this.paths = paths;
    }

    public VulHostAppsResponseInfoDataList withRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * **参数解释**: 软件命中的漏洞匹配规则 **取值范围**: 字符长度1-512位 
     * @return rule
     */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulHostAppsResponseInfoDataList that = (VulHostAppsResponseInfoDataList) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.path, that.path)
            && Objects.equals(this.paths, that.paths) && Objects.equals(this.rule, that.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName, path, paths, rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulHostAppsResponseInfoDataList {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
