package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateTenantConfigReq
 */
public class UpdateTenantConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_config")

    private FunctionConfig functionConfig;

    public UpdateTenantConfigReq withFunctionConfig(FunctionConfig functionConfig) {
        this.functionConfig = functionConfig;
        return this;
    }

    public UpdateTenantConfigReq withFunctionConfig(Consumer<FunctionConfig> functionConfigSetter) {
        if (this.functionConfig == null) {
            this.functionConfig = new FunctionConfig();
            functionConfigSetter.accept(this.functionConfig);
        }

        return this;
    }

    /**
     * Get functionConfig
     * @return functionConfig
     */
    public FunctionConfig getFunctionConfig() {
        return functionConfig;
    }

    public void setFunctionConfig(FunctionConfig functionConfig) {
        this.functionConfig = functionConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTenantConfigReq that = (UpdateTenantConfigReq) obj;
        return Objects.equals(this.functionConfig, that.functionConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTenantConfigReq {\n");
        sb.append("    functionConfig: ").append(toIndentedString(functionConfig)).append("\n");
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
