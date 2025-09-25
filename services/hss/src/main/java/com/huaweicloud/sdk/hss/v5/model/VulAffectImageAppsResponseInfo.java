package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 受漏洞影响镜像的软件信息
 */
public class VulAffectImageAppsResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paths")

    private List<VulAffectImageAppPathResponseInfo> paths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private String rule;

    public VulAffectImageAppsResponseInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 软件名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public VulAffectImageAppsResponseInfo withPaths(List<VulAffectImageAppPathResponseInfo> paths) {
        this.paths = paths;
        return this;
    }

    public VulAffectImageAppsResponseInfo addPathsItem(VulAffectImageAppPathResponseInfo pathsItem) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        this.paths.add(pathsItem);
        return this;
    }

    public VulAffectImageAppsResponseInfo withPaths(Consumer<List<VulAffectImageAppPathResponseInfo>> pathsSetter) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        pathsSetter.accept(this.paths);
        return this;
    }

    /**
     * 列表
     * @return paths
     */
    public List<VulAffectImageAppPathResponseInfo> getPaths() {
        return paths;
    }

    public void setPaths(List<VulAffectImageAppPathResponseInfo> paths) {
        this.paths = paths;
    }

    public VulAffectImageAppsResponseInfo withRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * 规则
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
        VulAffectImageAppsResponseInfo that = (VulAffectImageAppsResponseInfo) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.paths, that.paths)
            && Objects.equals(this.rule, that.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName, paths, rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulAffectImageAppsResponseInfo {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
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
