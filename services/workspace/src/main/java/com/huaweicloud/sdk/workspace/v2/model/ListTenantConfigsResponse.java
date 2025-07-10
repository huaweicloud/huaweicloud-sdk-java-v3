package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListTenantConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_configs")

    private List<FunctionConfig> functionConfigs = null;

    public ListTenantConfigsResponse withFunctionConfigs(List<FunctionConfig> functionConfigs) {
        this.functionConfigs = functionConfigs;
        return this;
    }

    public ListTenantConfigsResponse addFunctionConfigsItem(FunctionConfig functionConfigsItem) {
        if (this.functionConfigs == null) {
            this.functionConfigs = new ArrayList<>();
        }
        this.functionConfigs.add(functionConfigsItem);
        return this;
    }

    public ListTenantConfigsResponse withFunctionConfigs(Consumer<List<FunctionConfig>> functionConfigsSetter) {
        if (this.functionConfigs == null) {
            this.functionConfigs = new ArrayList<>();
        }
        functionConfigsSetter.accept(this.functionConfigs);
        return this;
    }

    /**
     * 租户个性配置列表。
     * @return functionConfigs
     */
    public List<FunctionConfig> getFunctionConfigs() {
        return functionConfigs;
    }

    public void setFunctionConfigs(List<FunctionConfig> functionConfigs) {
        this.functionConfigs = functionConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTenantConfigsResponse that = (ListTenantConfigsResponse) obj;
        return Objects.equals(this.functionConfigs, that.functionConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantConfigsResponse {\n");
        sb.append("    functionConfigs: ").append(toIndentedString(functionConfigs)).append("\n");
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
