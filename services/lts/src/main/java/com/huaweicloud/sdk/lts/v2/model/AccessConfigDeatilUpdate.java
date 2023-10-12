package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AccessConfigDeatilUpdate
 */
public class AccessConfigDeatilUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paths")

    private List<String> paths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "black_paths")

    private List<String> blackPaths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private AccessConfigFormatUpdate format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "windows_log_info")

    private AccessConfigWindowsLogInfoUpdate windowsLogInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stdout")

    private Boolean stdout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stderr")

    private Boolean stderr;

    /**
     * CCE接入类型，仅CCE接入类型时使用
     */
    public static final class PathTypeEnum {

        /**
         * Enum HOST_FILE for value: "HOST_FILE"
         */
        public static final PathTypeEnum HOST_FILE = new PathTypeEnum("HOST_FILE");

        /**
         * Enum CONTAINER_STDOUT for value: "CONTAINER_STDOUT"
         */
        public static final PathTypeEnum CONTAINER_STDOUT = new PathTypeEnum("CONTAINER_STDOUT");

        /**
         * Enum CONTAINER_FILE for value: "CONTAINER_FILE"
         */
        public static final PathTypeEnum CONTAINER_FILE = new PathTypeEnum("CONTAINER_FILE");

        private static final Map<String, PathTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PathTypeEnum> createStaticFields() {
            Map<String, PathTypeEnum> map = new HashMap<>();
            map.put("HOST_FILE", HOST_FILE);
            map.put("CONTAINER_STDOUT", CONTAINER_STDOUT);
            map.put("CONTAINER_FILE", CONTAINER_FILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PathTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PathTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PathTypeEnum(value));
        }

        public static PathTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PathTypeEnum) {
                return this.value.equals(((PathTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pathType")

    private PathTypeEnum pathType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaceRegex")

    private String namespaceRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "podNameRegex")

    private String podNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containerNameRegex")

    private String containerNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includeLabels")

    private Map<String, String> includeLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excludeLabels")

    private Map<String, String> excludeLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includeEnvs")

    private Map<String, String> includeEnvs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excludeEnvs")

    private Map<String, String> excludeEnvs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logLabels")

    private Map<String, String> logLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logEnvs")

    private Map<String, String> logEnvs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includeK8sLabels")

    private Map<String, String> includeK8sLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excludeK8sLabels")

    private Map<String, String> excludeK8sLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logK8s")

    private Map<String, String> logK8s = null;

    public AccessConfigDeatilUpdate withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    public AccessConfigDeatilUpdate addPathsItem(String pathsItem) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        this.paths.add(pathsItem);
        return this;
    }

    public AccessConfigDeatilUpdate withPaths(Consumer<List<String>> pathsSetter) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        pathsSetter.accept(this.paths);
        return this;
    }

    /**
     * 1.路径必须以/或者字母:\\开头 2.不能包含特殊字符<> ' | \" 且不能只输入/ 3.第一级目录不支持通配符*：不能以/_**   /_*开头 4.**只能出现一次 5.最大数量为10
     * @return paths
     */
    public List<String> getPaths() {
        return paths;
    }

    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    public AccessConfigDeatilUpdate withBlackPaths(List<String> blackPaths) {
        this.blackPaths = blackPaths;
        return this;
    }

    public AccessConfigDeatilUpdate addBlackPathsItem(String blackPathsItem) {
        if (this.blackPaths == null) {
            this.blackPaths = new ArrayList<>();
        }
        this.blackPaths.add(blackPathsItem);
        return this;
    }

    public AccessConfigDeatilUpdate withBlackPaths(Consumer<List<String>> blackPathsSetter) {
        if (this.blackPaths == null) {
            this.blackPaths = new ArrayList<>();
        }
        blackPathsSetter.accept(this.blackPaths);
        return this;
    }

    /**
     * 1.路径必须以/或者字母:\\开头 2.不能包含特殊字符<> ' | \" 且不能只输入/ 3.第一级目录不支持通配符*：不能以/_**   /_*开头 4.**只能出现一次 5.最大数量为10
     * @return blackPaths
     */
    public List<String> getBlackPaths() {
        return blackPaths;
    }

    public void setBlackPaths(List<String> blackPaths) {
        this.blackPaths = blackPaths;
    }

    public AccessConfigDeatilUpdate withFormat(AccessConfigFormatUpdate format) {
        this.format = format;
        return this;
    }

    public AccessConfigDeatilUpdate withFormat(Consumer<AccessConfigFormatUpdate> formatSetter) {
        if (this.format == null) {
            this.format = new AccessConfigFormatUpdate();
            formatSetter.accept(this.format);
        }

        return this;
    }

    /**
     * Get format
     * @return format
     */
    public AccessConfigFormatUpdate getFormat() {
        return format;
    }

    public void setFormat(AccessConfigFormatUpdate format) {
        this.format = format;
    }

    public AccessConfigDeatilUpdate withWindowsLogInfo(AccessConfigWindowsLogInfoUpdate windowsLogInfo) {
        this.windowsLogInfo = windowsLogInfo;
        return this;
    }

    public AccessConfigDeatilUpdate withWindowsLogInfo(
        Consumer<AccessConfigWindowsLogInfoUpdate> windowsLogInfoSetter) {
        if (this.windowsLogInfo == null) {
            this.windowsLogInfo = new AccessConfigWindowsLogInfoUpdate();
            windowsLogInfoSetter.accept(this.windowsLogInfo);
        }

        return this;
    }

    /**
     * Get windowsLogInfo
     * @return windowsLogInfo
     */
    public AccessConfigWindowsLogInfoUpdate getWindowsLogInfo() {
        return windowsLogInfo;
    }

    public void setWindowsLogInfo(AccessConfigWindowsLogInfoUpdate windowsLogInfo) {
        this.windowsLogInfo = windowsLogInfo;
    }

    public AccessConfigDeatilUpdate withStdout(Boolean stdout) {
        this.stdout = stdout;
        return this;
    }

    /**
     * 标准输出开关，仅CCE接入类型时使用
     * @return stdout
     */
    public Boolean getStdout() {
        return stdout;
    }

    public void setStdout(Boolean stdout) {
        this.stdout = stdout;
    }

    public AccessConfigDeatilUpdate withStderr(Boolean stderr) {
        this.stderr = stderr;
        return this;
    }

    /**
     * 标准输出开关标准错误开关，仅CCE接入类型时使用
     * @return stderr
     */
    public Boolean getStderr() {
        return stderr;
    }

    public void setStderr(Boolean stderr) {
        this.stderr = stderr;
    }

    public AccessConfigDeatilUpdate withPathType(PathTypeEnum pathType) {
        this.pathType = pathType;
        return this;
    }

    /**
     * CCE接入类型，仅CCE接入类型时使用
     * @return pathType
     */
    public PathTypeEnum getPathType() {
        return pathType;
    }

    public void setPathType(PathTypeEnum pathType) {
        this.pathType = pathType;
    }

    public AccessConfigDeatilUpdate withNamespaceRegex(String namespaceRegex) {
        this.namespaceRegex = namespaceRegex;
        return this;
    }

    /**
     * K8s Namespace正则匹配，仅CCE接入类型时使用
     * @return namespaceRegex
     */
    public String getNamespaceRegex() {
        return namespaceRegex;
    }

    public void setNamespaceRegex(String namespaceRegex) {
        this.namespaceRegex = namespaceRegex;
    }

    public AccessConfigDeatilUpdate withPodNameRegex(String podNameRegex) {
        this.podNameRegex = podNameRegex;
        return this;
    }

    /**
     * K8s Pod正则匹配，仅CCE接入类型时使用
     * @return podNameRegex
     */
    public String getPodNameRegex() {
        return podNameRegex;
    }

    public void setPodNameRegex(String podNameRegex) {
        this.podNameRegex = podNameRegex;
    }

    public AccessConfigDeatilUpdate withContainerNameRegex(String containerNameRegex) {
        this.containerNameRegex = containerNameRegex;
        return this;
    }

    /**
     * K8s 容器名称正则匹配，仅CCE接入类型时使用
     * @return containerNameRegex
     */
    public String getContainerNameRegex() {
        return containerNameRegex;
    }

    public void setContainerNameRegex(String containerNameRegex) {
        this.containerNameRegex = containerNameRegex;
    }

    public AccessConfigDeatilUpdate withIncludeLabels(Map<String, String> includeLabels) {
        this.includeLabels = includeLabels;
        return this;
    }

    public AccessConfigDeatilUpdate putIncludeLabelsItem(String key, String includeLabelsItem) {
        if (this.includeLabels == null) {
            this.includeLabels = new HashMap<>();
        }
        this.includeLabels.put(key, includeLabelsItem);
        return this;
    }

    public AccessConfigDeatilUpdate withIncludeLabels(Consumer<Map<String, String>> includeLabelsSetter) {
        if (this.includeLabels == null) {
            this.includeLabels = new HashMap<>();
        }
        includeLabelsSetter.accept(this.includeLabels);
        return this;
    }

    /**
     * 容器 Label白名单，最多支持创建30个，keyname不支持重名，仅CCE接入类型时使用
     * @return includeLabels
     */
    public Map<String, String> getIncludeLabels() {
        return includeLabels;
    }

    public void setIncludeLabels(Map<String, String> includeLabels) {
        this.includeLabels = includeLabels;
    }

    public AccessConfigDeatilUpdate withExcludeLabels(Map<String, String> excludeLabels) {
        this.excludeLabels = excludeLabels;
        return this;
    }

    public AccessConfigDeatilUpdate putExcludeLabelsItem(String key, String excludeLabelsItem) {
        if (this.excludeLabels == null) {
            this.excludeLabels = new HashMap<>();
        }
        this.excludeLabels.put(key, excludeLabelsItem);
        return this;
    }

    public AccessConfigDeatilUpdate withExcludeLabels(Consumer<Map<String, String>> excludeLabelsSetter) {
        if (this.excludeLabels == null) {
            this.excludeLabels = new HashMap<>();
        }
        excludeLabelsSetter.accept(this.excludeLabels);
        return this;
    }

    /**
     * 容器 Label黑名单，最多支持创建30个，keyname不支持重名，仅CCE接入类型时使用
     * @return excludeLabels
     */
    public Map<String, String> getExcludeLabels() {
        return excludeLabels;
    }

    public void setExcludeLabels(Map<String, String> excludeLabels) {
        this.excludeLabels = excludeLabels;
    }

    public AccessConfigDeatilUpdate withIncludeEnvs(Map<String, String> includeEnvs) {
        this.includeEnvs = includeEnvs;
        return this;
    }

    public AccessConfigDeatilUpdate putIncludeEnvsItem(String key, String includeEnvsItem) {
        if (this.includeEnvs == null) {
            this.includeEnvs = new HashMap<>();
        }
        this.includeEnvs.put(key, includeEnvsItem);
        return this;
    }

    public AccessConfigDeatilUpdate withIncludeEnvs(Consumer<Map<String, String>> includeEnvsSetter) {
        if (this.includeEnvs == null) {
            this.includeEnvs = new HashMap<>();
        }
        includeEnvsSetter.accept(this.includeEnvs);
        return this;
    }

    /**
     * 环境变量白名单，最多支持创建30个，keyname不支持重名，仅CCE接入类型时使用
     * @return includeEnvs
     */
    public Map<String, String> getIncludeEnvs() {
        return includeEnvs;
    }

    public void setIncludeEnvs(Map<String, String> includeEnvs) {
        this.includeEnvs = includeEnvs;
    }

    public AccessConfigDeatilUpdate withExcludeEnvs(Map<String, String> excludeEnvs) {
        this.excludeEnvs = excludeEnvs;
        return this;
    }

    public AccessConfigDeatilUpdate putExcludeEnvsItem(String key, String excludeEnvsItem) {
        if (this.excludeEnvs == null) {
            this.excludeEnvs = new HashMap<>();
        }
        this.excludeEnvs.put(key, excludeEnvsItem);
        return this;
    }

    public AccessConfigDeatilUpdate withExcludeEnvs(Consumer<Map<String, String>> excludeEnvsSetter) {
        if (this.excludeEnvs == null) {
            this.excludeEnvs = new HashMap<>();
        }
        excludeEnvsSetter.accept(this.excludeEnvs);
        return this;
    }

    /**
     * 环境变量黑名单，最多支持创建30个，keyname不支持重名，仅CCE接入类型时使用
     * @return excludeEnvs
     */
    public Map<String, String> getExcludeEnvs() {
        return excludeEnvs;
    }

    public void setExcludeEnvs(Map<String, String> excludeEnvs) {
        this.excludeEnvs = excludeEnvs;
    }

    public AccessConfigDeatilUpdate withLogLabels(Map<String, String> logLabels) {
        this.logLabels = logLabels;
        return this;
    }

    public AccessConfigDeatilUpdate putLogLabelsItem(String key, String logLabelsItem) {
        if (this.logLabels == null) {
            this.logLabels = new HashMap<>();
        }
        this.logLabels.put(key, logLabelsItem);
        return this;
    }

    public AccessConfigDeatilUpdate withLogLabels(Consumer<Map<String, String>> logLabelsSetter) {
        if (this.logLabels == null) {
            this.logLabels = new HashMap<>();
        }
        logLabelsSetter.accept(this.logLabels);
        return this;
    }

    /**
     * 容器 Label日志标签，最多支持创建30个，keyname不支持重名，仅CCE接入类型时使用
     * @return logLabels
     */
    public Map<String, String> getLogLabels() {
        return logLabels;
    }

    public void setLogLabels(Map<String, String> logLabels) {
        this.logLabels = logLabels;
    }

    public AccessConfigDeatilUpdate withLogEnvs(Map<String, String> logEnvs) {
        this.logEnvs = logEnvs;
        return this;
    }

    public AccessConfigDeatilUpdate putLogEnvsItem(String key, String logEnvsItem) {
        if (this.logEnvs == null) {
            this.logEnvs = new HashMap<>();
        }
        this.logEnvs.put(key, logEnvsItem);
        return this;
    }

    public AccessConfigDeatilUpdate withLogEnvs(Consumer<Map<String, String>> logEnvsSetter) {
        if (this.logEnvs == null) {
            this.logEnvs = new HashMap<>();
        }
        logEnvsSetter.accept(this.logEnvs);
        return this;
    }

    /**
     * 环境变量日志标签，最多支持创建30个，keyname不支持重名，仅CCE接入类型时使用
     * @return logEnvs
     */
    public Map<String, String> getLogEnvs() {
        return logEnvs;
    }

    public void setLogEnvs(Map<String, String> logEnvs) {
        this.logEnvs = logEnvs;
    }

    public AccessConfigDeatilUpdate withIncludeK8sLabels(Map<String, String> includeK8sLabels) {
        this.includeK8sLabels = includeK8sLabels;
        return this;
    }

    public AccessConfigDeatilUpdate putIncludeK8sLabelsItem(String key, String includeK8sLabelsItem) {
        if (this.includeK8sLabels == null) {
            this.includeK8sLabels = new HashMap<>();
        }
        this.includeK8sLabels.put(key, includeK8sLabelsItem);
        return this;
    }

    public AccessConfigDeatilUpdate withIncludeK8sLabels(Consumer<Map<String, String>> includeK8sLabelsSetter) {
        if (this.includeK8sLabels == null) {
            this.includeK8sLabels = new HashMap<>();
        }
        includeK8sLabelsSetter.accept(this.includeK8sLabels);
        return this;
    }

    /**
     * K8s Label白名单，最多支持创建30个，keyname不支持重名，仅CCE接入类型时使用
     * @return includeK8sLabels
     */
    public Map<String, String> getIncludeK8sLabels() {
        return includeK8sLabels;
    }

    public void setIncludeK8sLabels(Map<String, String> includeK8sLabels) {
        this.includeK8sLabels = includeK8sLabels;
    }

    public AccessConfigDeatilUpdate withExcludeK8sLabels(Map<String, String> excludeK8sLabels) {
        this.excludeK8sLabels = excludeK8sLabels;
        return this;
    }

    public AccessConfigDeatilUpdate putExcludeK8sLabelsItem(String key, String excludeK8sLabelsItem) {
        if (this.excludeK8sLabels == null) {
            this.excludeK8sLabels = new HashMap<>();
        }
        this.excludeK8sLabels.put(key, excludeK8sLabelsItem);
        return this;
    }

    public AccessConfigDeatilUpdate withExcludeK8sLabels(Consumer<Map<String, String>> excludeK8sLabelsSetter) {
        if (this.excludeK8sLabels == null) {
            this.excludeK8sLabels = new HashMap<>();
        }
        excludeK8sLabelsSetter.accept(this.excludeK8sLabels);
        return this;
    }

    /**
     * K8s Label黑名单，最多支持创建30个，keyname不支持重名，仅CCE接入类型时使用
     * @return excludeK8sLabels
     */
    public Map<String, String> getExcludeK8sLabels() {
        return excludeK8sLabels;
    }

    public void setExcludeK8sLabels(Map<String, String> excludeK8sLabels) {
        this.excludeK8sLabels = excludeK8sLabels;
    }

    public AccessConfigDeatilUpdate withLogK8s(Map<String, String> logK8s) {
        this.logK8s = logK8s;
        return this;
    }

    public AccessConfigDeatilUpdate putLogK8sItem(String key, String logK8sItem) {
        if (this.logK8s == null) {
            this.logK8s = new HashMap<>();
        }
        this.logK8s.put(key, logK8sItem);
        return this;
    }

    public AccessConfigDeatilUpdate withLogK8s(Consumer<Map<String, String>> logK8sSetter) {
        if (this.logK8s == null) {
            this.logK8s = new HashMap<>();
        }
        logK8sSetter.accept(this.logK8s);
        return this;
    }

    /**
     * K8s Label日志标签，最多支持创建30个，keyname不支持重名，仅CCE接入类型时使用
     * @return logK8s
     */
    public Map<String, String> getLogK8s() {
        return logK8s;
    }

    public void setLogK8s(Map<String, String> logK8s) {
        this.logK8s = logK8s;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessConfigDeatilUpdate that = (AccessConfigDeatilUpdate) obj;
        return Objects.equals(this.paths, that.paths) && Objects.equals(this.blackPaths, that.blackPaths)
            && Objects.equals(this.format, that.format) && Objects.equals(this.windowsLogInfo, that.windowsLogInfo)
            && Objects.equals(this.stdout, that.stdout) && Objects.equals(this.stderr, that.stderr)
            && Objects.equals(this.pathType, that.pathType) && Objects.equals(this.namespaceRegex, that.namespaceRegex)
            && Objects.equals(this.podNameRegex, that.podNameRegex)
            && Objects.equals(this.containerNameRegex, that.containerNameRegex)
            && Objects.equals(this.includeLabels, that.includeLabels)
            && Objects.equals(this.excludeLabels, that.excludeLabels)
            && Objects.equals(this.includeEnvs, that.includeEnvs) && Objects.equals(this.excludeEnvs, that.excludeEnvs)
            && Objects.equals(this.logLabels, that.logLabels) && Objects.equals(this.logEnvs, that.logEnvs)
            && Objects.equals(this.includeK8sLabels, that.includeK8sLabels)
            && Objects.equals(this.excludeK8sLabels, that.excludeK8sLabels) && Objects.equals(this.logK8s, that.logK8s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paths,
            blackPaths,
            format,
            windowsLogInfo,
            stdout,
            stderr,
            pathType,
            namespaceRegex,
            podNameRegex,
            containerNameRegex,
            includeLabels,
            excludeLabels,
            includeEnvs,
            excludeEnvs,
            logLabels,
            logEnvs,
            includeK8sLabels,
            excludeK8sLabels,
            logK8s);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigDeatilUpdate {\n");
        sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
        sb.append("    blackPaths: ").append(toIndentedString(blackPaths)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    windowsLogInfo: ").append(toIndentedString(windowsLogInfo)).append("\n");
        sb.append("    stdout: ").append(toIndentedString(stdout)).append("\n");
        sb.append("    stderr: ").append(toIndentedString(stderr)).append("\n");
        sb.append("    pathType: ").append(toIndentedString(pathType)).append("\n");
        sb.append("    namespaceRegex: ").append(toIndentedString(namespaceRegex)).append("\n");
        sb.append("    podNameRegex: ").append(toIndentedString(podNameRegex)).append("\n");
        sb.append("    containerNameRegex: ").append(toIndentedString(containerNameRegex)).append("\n");
        sb.append("    includeLabels: ").append(toIndentedString(includeLabels)).append("\n");
        sb.append("    excludeLabels: ").append(toIndentedString(excludeLabels)).append("\n");
        sb.append("    includeEnvs: ").append(toIndentedString(includeEnvs)).append("\n");
        sb.append("    excludeEnvs: ").append(toIndentedString(excludeEnvs)).append("\n");
        sb.append("    logLabels: ").append(toIndentedString(logLabels)).append("\n");
        sb.append("    logEnvs: ").append(toIndentedString(logEnvs)).append("\n");
        sb.append("    includeK8sLabels: ").append(toIndentedString(includeK8sLabels)).append("\n");
        sb.append("    excludeK8sLabels: ").append(toIndentedString(excludeK8sLabels)).append("\n");
        sb.append("    logK8s: ").append(toIndentedString(logK8s)).append("\n");
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
