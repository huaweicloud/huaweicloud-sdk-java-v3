package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 日志接入详细信息
 */
public class AccessConfigDeatil {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paths")

    @JacksonXmlProperty(localName = "paths")

    private List<String> paths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "black_paths")

    @JacksonXmlProperty(localName = "black_paths")

    private List<String> blackPaths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    @JacksonXmlProperty(localName = "format")

    private AccessConfigFormat format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "windows_log_info")

    @JacksonXmlProperty(localName = "windows_log_info")

    private AccessConfigWindowsLogInfo windowsLogInfo;

    public AccessConfigDeatil withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    public AccessConfigDeatil addPathsItem(String pathsItem) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        this.paths.add(pathsItem);
        return this;
    }

    public AccessConfigDeatil withPaths(Consumer<List<String>> pathsSetter) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        pathsSetter.accept(this.paths);
        return this;
    }

    /**
     * 采集路径。 1. 路径必须以/或者字母:\\\\开头 2. 不能包含特殊字符<> ' | \" 且不能只输入/ 3. 第一级目录不支持通配符*：不能以/_**   /_*开头 4.**只能出现一次
     * @return paths
     */
    public List<String> getPaths() {
        return paths;
    }

    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    public AccessConfigDeatil withBlackPaths(List<String> blackPaths) {
        this.blackPaths = blackPaths;
        return this;
    }

    public AccessConfigDeatil addBlackPathsItem(String blackPathsItem) {
        if (this.blackPaths == null) {
            this.blackPaths = new ArrayList<>();
        }
        this.blackPaths.add(blackPathsItem);
        return this;
    }

    public AccessConfigDeatil withBlackPaths(Consumer<List<String>> blackPathsSetter) {
        if (this.blackPaths == null) {
            this.blackPaths = new ArrayList<>();
        }
        blackPathsSetter.accept(this.blackPaths);
        return this;
    }

    /**
     * 采集路径黑名单。 1. 路径必须以/或者字母:\\\\开头 2. 不能包含特殊字符<> ' | \" 且不能只输入/ 3. 第一级目录不支持通配符*：不能以/_**   /_*开头 4.**只能出现一次
     * @return blackPaths
     */
    public List<String> getBlackPaths() {
        return blackPaths;
    }

    public void setBlackPaths(List<String> blackPaths) {
        this.blackPaths = blackPaths;
    }

    public AccessConfigDeatil withFormat(AccessConfigFormat format) {
        this.format = format;
        return this;
    }

    public AccessConfigDeatil withFormat(Consumer<AccessConfigFormat> formatSetter) {
        if (this.format == null) {
            this.format = new AccessConfigFormat();
            formatSetter.accept(this.format);
        }

        return this;
    }

    /**
     * Get format
     * @return format
     */
    public AccessConfigFormat getFormat() {
        return format;
    }

    public void setFormat(AccessConfigFormat format) {
        this.format = format;
    }

    public AccessConfigDeatil withWindowsLogInfo(AccessConfigWindowsLogInfo windowsLogInfo) {
        this.windowsLogInfo = windowsLogInfo;
        return this;
    }

    public AccessConfigDeatil withWindowsLogInfo(Consumer<AccessConfigWindowsLogInfo> windowsLogInfoSetter) {
        if (this.windowsLogInfo == null) {
            this.windowsLogInfo = new AccessConfigWindowsLogInfo();
            windowsLogInfoSetter.accept(this.windowsLogInfo);
        }

        return this;
    }

    /**
     * Get windowsLogInfo
     * @return windowsLogInfo
     */
    public AccessConfigWindowsLogInfo getWindowsLogInfo() {
        return windowsLogInfo;
    }

    public void setWindowsLogInfo(AccessConfigWindowsLogInfo windowsLogInfo) {
        this.windowsLogInfo = windowsLogInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessConfigDeatil accessConfigDeatil = (AccessConfigDeatil) o;
        return Objects.equals(this.paths, accessConfigDeatil.paths)
            && Objects.equals(this.blackPaths, accessConfigDeatil.blackPaths)
            && Objects.equals(this.format, accessConfigDeatil.format)
            && Objects.equals(this.windowsLogInfo, accessConfigDeatil.windowsLogInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paths, blackPaths, format, windowsLogInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigDeatil {\n");
        sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
        sb.append("    blackPaths: ").append(toIndentedString(blackPaths)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    windowsLogInfo: ").append(toIndentedString(windowsLogInfo)).append("\n");
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
