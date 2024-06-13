package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class ResourcePoolVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected")

    private String selected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_state")

    private String activeState;

    public ResourcePoolVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源池ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResourcePoolVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源池名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourcePoolVo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源池类型（VM/DOCKER）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourcePoolVo withSelected(String selected) {
        this.selected = selected;
        return this;
    }

    /**
     * 是否选中
     * @return selected
     */
    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public ResourcePoolVo withActiveState(String activeState) {
        this.activeState = activeState;
        return this;
    }

    /**
     * 资源池状态
     * @return activeState
     */
    public String getActiveState() {
        return activeState;
    }

    public void setActiveState(String activeState) {
        this.activeState = activeState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcePoolVo that = (ResourcePoolVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.selected, that.selected)
            && Objects.equals(this.activeState, that.activeState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, selected, activeState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcePoolVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
        sb.append("    activeState: ").append(toIndentedString(activeState)).append("\n");
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
