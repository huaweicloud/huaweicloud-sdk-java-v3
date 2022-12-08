package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReferencePath
 */
public class ReferencePath {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_path")

    private List<Position3D> activePath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_radius")

    private Integer pathRadius;

    public ReferencePath withActivePath(List<Position3D> activePath) {
        this.activePath = activePath;
        return this;
    }

    public ReferencePath addActivePathItem(Position3D activePathItem) {
        if (this.activePath == null) {
            this.activePath = new ArrayList<>();
        }
        this.activePath.add(activePathItem);
        return this;
    }

    public ReferencePath withActivePath(Consumer<List<Position3D>> activePathSetter) {
        if (this.activePath == null) {
            this.activePath = new ArrayList<>();
        }
        activePathSetter.accept(this.activePath);
        return this;
    }

    /**
     * **参数说明**：事件的有效路径
     * @return activePath
     */
    public List<Position3D> getActivePath() {
        return activePath;
    }

    public void setActivePath(List<Position3D> activePath) {
        this.activePath = activePath;
    }

    public ReferencePath withPathRadius(Integer pathRadius) {
        this.pathRadius = pathRadius;
        return this;
    }

    /**
     * **参数说明**：事件的影响区域半径，可选，单位为分米。用半径表示影响区域边界离中心线的垂直距离，反映该区域的宽度以覆盖实际路段。
     * minimum: 0
     * maximum: 100000
     * @return pathRadius
     */
    public Integer getPathRadius() {
        return pathRadius;
    }

    public void setPathRadius(Integer pathRadius) {
        this.pathRadius = pathRadius;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReferencePath referencePath = (ReferencePath) o;
        return Objects.equals(this.activePath, referencePath.activePath)
            && Objects.equals(this.pathRadius, referencePath.pathRadius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activePath, pathRadius);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReferencePath {\n");
        sb.append("    activePath: ").append(toIndentedString(activePath)).append("\n");
        sb.append("    pathRadius: ").append(toIndentedString(pathRadius)).append("\n");
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
