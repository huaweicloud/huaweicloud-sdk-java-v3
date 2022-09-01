package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新终端节点路由表请求结构体
 */
public class UpdateEndpointRoutetableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetables")

    @JacksonXmlProperty(localName = "routetables")

    private List<String> routetables = null;

    public UpdateEndpointRoutetableRequestBody withRoutetables(List<String> routetables) {
        this.routetables = routetables;
        return this;
    }

    public UpdateEndpointRoutetableRequestBody addRoutetablesItem(String routetablesItem) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        this.routetables.add(routetablesItem);
        return this;
    }

    public UpdateEndpointRoutetableRequestBody withRoutetables(Consumer<List<String>> routetablesSetter) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        routetablesSetter.accept(this.routetables);
        return this;
    }

    /**
     * 路由表ID列表。
     * @return routetables
     */
    public List<String> getRoutetables() {
        return routetables;
    }

    public void setRoutetables(List<String> routetables) {
        this.routetables = routetables;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEndpointRoutetableRequestBody updateEndpointRoutetableRequestBody =
            (UpdateEndpointRoutetableRequestBody) o;
        return Objects.equals(this.routetables, updateEndpointRoutetableRequestBody.routetables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointRoutetableRequestBody {\n");
        sb.append("    routetables: ").append(toIndentedString(routetables)).append("\n");
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
