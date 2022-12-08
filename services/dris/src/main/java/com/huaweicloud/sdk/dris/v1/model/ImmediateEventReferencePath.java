package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImmediateEventReferencePath
 */
public class ImmediateEventReferencePath {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_path")

    private List<ImmediateEventPosition3D> activePath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_radius")

    private Integer pathRadius;

    public ImmediateEventReferencePath withActivePath(List<ImmediateEventPosition3D> activePath) {
        this.activePath = activePath;
        return this;
    }

    public ImmediateEventReferencePath addActivePathItem(ImmediateEventPosition3D activePathItem) {
        if (this.activePath == null) {
            this.activePath = new ArrayList<>();
        }
        this.activePath.add(activePathItem);
        return this;
    }

    public ImmediateEventReferencePath withActivePath(Consumer<List<ImmediateEventPosition3D>> activePathSetter) {
        if (this.activePath == null) {
            this.activePath = new ArrayList<>();
        }
        activePathSetter.accept(this.activePath);
        return this;
    }

    /**
     * **参数说明**：通过点集合定义一个有向的作用范围。
     * @return activePath
     */
    public List<ImmediateEventPosition3D> getActivePath() {
        return activePath;
    }

    public void setActivePath(List<ImmediateEventPosition3D> activePath) {
        this.activePath = activePath;
    }

    public ImmediateEventReferencePath withPathRadius(Integer pathRadius) {
        this.pathRadius = pathRadius;
        return this;
    }

    /**
     * **参数说明**：事件的影响区域半径，可选，单位为分米。用半径表示影响区域边界离中心线的垂直距离，反映该区域的宽度以覆盖实际路段。
     * minimum: 0
     * maximum: 65535
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
        ImmediateEventReferencePath immediateEventReferencePath = (ImmediateEventReferencePath) o;
        return Objects.equals(this.activePath, immediateEventReferencePath.activePath)
            && Objects.equals(this.pathRadius, immediateEventReferencePath.pathRadius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activePath, pathRadius);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImmediateEventReferencePath {\n");
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
