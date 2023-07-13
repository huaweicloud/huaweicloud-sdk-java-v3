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
public class AgentRemovePathReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_path")

    private List<String> removePath = null;

    public AgentRemovePathReq withRemovePath(List<String> removePath) {
        this.removePath = removePath;
        return this;
    }

    public AgentRemovePathReq addRemovePathItem(String removePathItem) {
        if (this.removePath == null) {
            this.removePath = new ArrayList<>();
        }
        this.removePath.add(removePathItem);
        return this;
    }

    public AgentRemovePathReq withRemovePath(Consumer<List<String>> removePathSetter) {
        if (this.removePath == null) {
            this.removePath = new ArrayList<>();
        }
        removePathSetter.accept(this.removePath);
        return this;
    }

    /**
     * 移除备份路径详情 
     * @return removePath
     */
    public List<String> getRemovePath() {
        return removePath;
    }

    public void setRemovePath(List<String> removePath) {
        this.removePath = removePath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentRemovePathReq that = (AgentRemovePathReq) obj;
        return Objects.equals(this.removePath, that.removePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(removePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentRemovePathReq {\n");
        sb.append("    removePath: ").append(toIndentedString(removePath)).append("\n");
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
