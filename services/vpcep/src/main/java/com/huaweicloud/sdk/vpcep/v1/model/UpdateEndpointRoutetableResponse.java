package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdateEndpointRoutetableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetables")

    private List<String> routetables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private RoutetableInfoError error;

    public UpdateEndpointRoutetableResponse withRoutetables(List<String> routetables) {
        this.routetables = routetables;
        return this;
    }

    public UpdateEndpointRoutetableResponse addRoutetablesItem(String routetablesItem) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        this.routetables.add(routetablesItem);
        return this;
    }

    public UpdateEndpointRoutetableResponse withRoutetables(Consumer<List<String>> routetablesSetter) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        routetablesSetter.accept(this.routetables);
        return this;
    }

    /** 路由表ID列表。节点的白名单。 此参数可以添加IPv4或CIDR： ● 当取值不为空时，表示将白 名单更新为取值所示内容。 ● 当取值为空时，表示删除所 有白名单。 默认为空列表。
     * 
     * @return routetables */
    public List<String> getRoutetables() {
        return routetables;
    }

    public void setRoutetables(List<String> routetables) {
        this.routetables = routetables;
    }

    public UpdateEndpointRoutetableResponse withError(RoutetableInfoError error) {
        this.error = error;
        return this;
    }

    public UpdateEndpointRoutetableResponse withError(Consumer<RoutetableInfoError> errorSetter) {
        if (this.error == null) {
            this.error = new RoutetableInfoError();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /** Get error
     * 
     * @return error */
    public RoutetableInfoError getError() {
        return error;
    }

    public void setError(RoutetableInfoError error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEndpointRoutetableResponse updateEndpointRoutetableResponse = (UpdateEndpointRoutetableResponse) o;
        return Objects.equals(this.routetables, updateEndpointRoutetableResponse.routetables)
            && Objects.equals(this.error, updateEndpointRoutetableResponse.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetables, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointRoutetableResponse {\n");
        sb.append("    routetables: ").append(toIndentedString(routetables)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
