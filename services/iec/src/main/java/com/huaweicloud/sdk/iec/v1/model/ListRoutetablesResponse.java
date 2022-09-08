package com.huaweicloud.sdk.iec.v1.model;

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
public class ListRoutetablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetables")

    private List<ListRoutetableOption> routetables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListRoutetablesResponse withRoutetables(List<ListRoutetableOption> routetables) {
        this.routetables = routetables;
        return this;
    }

    public ListRoutetablesResponse addRoutetablesItem(ListRoutetableOption routetablesItem) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        this.routetables.add(routetablesItem);
        return this;
    }

    public ListRoutetablesResponse withRoutetables(Consumer<List<ListRoutetableOption>> routetablesSetter) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        routetablesSetter.accept(this.routetables);
        return this;
    }

    /**
     * 路由表
     * @return routetables
     */
    public List<ListRoutetableOption> getRoutetables() {
        return routetables;
    }

    public void setRoutetables(List<ListRoutetableOption> routetables) {
        this.routetables = routetables;
    }

    public ListRoutetablesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRoutetablesResponse listRoutetablesResponse = (ListRoutetablesResponse) o;
        return Objects.equals(this.routetables, listRoutetablesResponse.routetables)
            && Objects.equals(this.count, listRoutetablesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetables, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRoutetablesResponse {\n");
        sb.append("    routetables: ").append(toIndentedString(routetables)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
