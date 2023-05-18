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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgentAddPathReq agentAddPathReq = (AgentAddPathReq) o;
        return Objects.equals(this.addPath, agentAddPathReq.addPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentAddPathReq {\n");
        sb.append("    addPath: ").append(toIndentedString(addPath)).append("\n");
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
