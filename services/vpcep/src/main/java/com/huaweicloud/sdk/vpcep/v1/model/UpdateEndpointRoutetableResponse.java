package com.huaweicloud.sdk.vpcep.v1.model;

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
public class UpdateEndpointRoutetableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetables")

    private List<String> routetables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private List<RoutetableInfoError> error = null;

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

    /**
     * 路由表ID列表。 若未指定，返回默认VPC下路由表ID。 更新Gateway类型终端节点服务的终端节点时，显示此参数。
     * @return routetables
     */
    public List<String> getRoutetables() {
        return routetables;
    }

    public void setRoutetables(List<String> routetables) {
        this.routetables = routetables;
    }

    public UpdateEndpointRoutetableResponse withError(List<RoutetableInfoError> error) {
        this.error = error;
        return this;
    }

    public UpdateEndpointRoutetableResponse addErrorItem(RoutetableInfoError errorItem) {
        if (this.error == null) {
            this.error = new ArrayList<>();
        }
        this.error.add(errorItem);
        return this;
    }

    public UpdateEndpointRoutetableResponse withError(Consumer<List<RoutetableInfoError>> errorSetter) {
        if (this.error == null) {
            this.error = new ArrayList<>();
        }
        errorSetter.accept(this.error);
        return this;
    }

    /**
     * 当修改终端节点子网路由表失败时，返回错误提示信息
     * @return error
     */
    public List<RoutetableInfoError> getError() {
        return error;
    }

    public void setError(List<RoutetableInfoError> error) {
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
