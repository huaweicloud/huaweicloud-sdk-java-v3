package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowComponentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private List<ComponentList> components = null;

    public ShowComponentsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 组件数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowComponentsResponse withComponents(List<ComponentList> components) {
        this.components = components;
        return this;
    }

    public ShowComponentsResponse addComponentsItem(ComponentList componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public ShowComponentsResponse withComponents(Consumer<List<ComponentList>> componentsSetter) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        componentsSetter.accept(this.components);
        return this;
    }

    /**
     * Get components
     * @return components
     */
    public List<ComponentList> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentList> components) {
        this.components = components;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowComponentsResponse showComponentsResponse = (ShowComponentsResponse) o;
        return Objects.equals(this.count, showComponentsResponse.count)
            && Objects.equals(this.components, showComponentsResponse.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, components);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowComponentsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
