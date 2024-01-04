package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生命周期管理组件配置停止前处理。  type为\&quot;lifecycle\&quot;时，返回此参数。 
 */
public class ConfigurationResponseDataSpecPreStop {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec")

    private LifeCycleConfigurationExec exec;

    public ConfigurationResponseDataSpecPreStop withExec(LifeCycleConfigurationExec exec) {
        this.exec = exec;
        return this;
    }

    public ConfigurationResponseDataSpecPreStop withExec(Consumer<LifeCycleConfigurationExec> execSetter) {
        if (this.exec == null) {
            this.exec = new LifeCycleConfigurationExec();
            execSetter.accept(this.exec);
        }

        return this;
    }

    /**
     * Get exec
     * @return exec
     */
    public LifeCycleConfigurationExec getExec() {
        return exec;
    }

    public void setExec(LifeCycleConfigurationExec exec) {
        this.exec = exec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationResponseDataSpecPreStop that = (ConfigurationResponseDataSpecPreStop) obj;
        return Objects.equals(this.exec, that.exec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationResponseDataSpecPreStop {\n");
        sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
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
