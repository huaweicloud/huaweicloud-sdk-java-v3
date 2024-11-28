package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AgentAddPathReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_path")

    private List<String> addPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_path")

    private List<ExcludePath> excludePath = null;

    public AgentAddPathReq withAddPath(List<String> addPath) {
        this.addPath = addPath;
        return this;
    }

    public AgentAddPathReq addAddPathItem(String addPathItem) {
        if (this.addPath == null) {
            this.addPath = new ArrayList<>();
        }
        this.addPath.add(addPathItem);
        return this;
    }

    public AgentAddPathReq withAddPath(Consumer<List<String>> addPathSetter) {
        if (this.addPath == null) {
            this.addPath = new ArrayList<>();
        }
        addPathSetter.accept(this.addPath);
        return this;
    }

    /**
     * 增加备份路径详情
     * @return addPath
     */
    public List<String> getAddPath() {
        return addPath;
    }

    public void setAddPath(List<String> addPath) {
        this.addPath = addPath;
    }

    public AgentAddPathReq withExcludePath(List<ExcludePath> excludePath) {
        this.excludePath = excludePath;
        return this;
    }

    public AgentAddPathReq addExcludePathItem(ExcludePath excludePathItem) {
        if (this.excludePath == null) {
            this.excludePath = new ArrayList<>();
        }
        this.excludePath.add(excludePathItem);
        return this;
    }

    public AgentAddPathReq withExcludePath(Consumer<List<ExcludePath>> excludePathSetter) {
        if (this.excludePath == null) {
            this.excludePath = new ArrayList<>();
        }
        excludePathSetter.accept(this.excludePath);
        return this;
    }

    /**
     * 增加排除目录 > 该特性目前处于公测阶段，部分region可能无法使用。
     * @return excludePath
     */
    public List<ExcludePath> getExcludePath() {
        return excludePath;
    }

    public void setExcludePath(List<ExcludePath> excludePath) {
        this.excludePath = excludePath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentAddPathReq that = (AgentAddPathReq) obj;
        return Objects.equals(this.addPath, that.addPath) && Objects.equals(this.excludePath, that.excludePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addPath, excludePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentAddPathReq {\n");
        sb.append("    addPath: ").append(toIndentedString(addPath)).append("\n");
        sb.append("    excludePath: ").append(toIndentedString(excludePath)).append("\n");
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
