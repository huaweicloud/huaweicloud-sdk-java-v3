package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EventReferencePath
 */
public class EventReferencePath {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_path")

    private List<EventLocation> activePath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_radius")

    private Integer pathRadius;

    public EventReferencePath withActivePath(List<EventLocation> activePath) {
        this.activePath = activePath;
        return this;
    }

    public EventReferencePath addActivePathItem(EventLocation activePathItem) {
        if (this.activePath == null) {
            this.activePath = new ArrayList<>();
        }
        this.activePath.add(activePathItem);
        return this;
    }

    public EventReferencePath withActivePath(Consumer<List<EventLocation>> activePathSetter) {
        if (this.activePath == null) {
            this.activePath = new ArrayList<>();
        }
        activePathSetter.accept(this.activePath);
        return this;
    }

    /**
     * **参数说明**：激活路径。
     * @return activePath
     */
    public List<EventLocation> getActivePath() {
        return activePath;
    }

    public void setActivePath(List<EventLocation> activePath) {
        this.activePath = activePath;
    }

    public EventReferencePath withPathRadius(Integer pathRadius) {
        this.pathRadius = pathRadius;
        return this;
    }

    /**
     * **参数说明**：事件的影响区域半径，可选，单位为分米。用半径表示影响区域边界离中心线的垂直距离，反映该区域的宽度以覆盖实际路段。
     * minimum: 0
     * maximum: 2147483647
     * @return pathRadius
     */
    public Integer getPathRadius() {
        return pathRadius;
    }

    public void setPathRadius(Integer pathRadius) {
        this.pathRadius = pathRadius;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventReferencePath that = (EventReferencePath) obj;
        return Objects.equals(this.activePath, that.activePath) && Objects.equals(this.pathRadius, that.pathRadius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activePath, pathRadius);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventReferencePath {\n");
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
