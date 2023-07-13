package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 变量参数值，模板部署时模版参数信息
 */
public class InstanceDeploymentVariables {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private Object environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private Object components;

    public InstanceDeploymentVariables withEnvironment(Object environment) {
        this.environment = environment;
        return this;
    }

    /**
     * 环境变量
     * @return environment
     */
    public Object getEnvironment() {
        return environment;
    }

    public void setEnvironment(Object environment) {
        this.environment = environment;
    }

    public InstanceDeploymentVariables withComponents(Object components) {
        this.components = components;
        return this;
    }

    /**
     * 组件变量
     * @return components
     */
    public Object getComponents() {
        return components;
    }

    public void setComponents(Object components) {
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
        InstanceDeploymentVariables that = (InstanceDeploymentVariables) obj;
        return Objects.equals(this.environment, that.environment) && Objects.equals(this.components, that.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment, components);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDeploymentVariables {\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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
