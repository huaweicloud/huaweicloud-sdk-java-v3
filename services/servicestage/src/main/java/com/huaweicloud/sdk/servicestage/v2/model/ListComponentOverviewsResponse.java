package com.huaweicloud.sdk.servicestage.v2.model;

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
public class ListComponentOverviewsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private List<ComponentOverview> components = null;

    public ListComponentOverviewsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 组件个数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListComponentOverviewsResponse withComponents(List<ComponentOverview> components) {
        this.components = components;
        return this;
    }

    public ListComponentOverviewsResponse addComponentsItem(ComponentOverview componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public ListComponentOverviewsResponse withComponents(Consumer<List<ComponentOverview>> componentsSetter) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        componentsSetter.accept(this.components);
        return this;
    }

    /**
     * 组件部署信息列表。
     * @return components
     */
    public List<ComponentOverview> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentOverview> components) {
        this.components = components;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListComponentOverviewsResponse that = (ListComponentOverviewsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.components, that.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, components);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListComponentOverviewsResponse {\n");
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
