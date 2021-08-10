package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 应用配置信息。 */
public class ApplicationConfigModifyConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env")

    private List<ApplicationConfigModifyConfigurationEnv> env = null;

    public ApplicationConfigModifyConfiguration withEnv(List<ApplicationConfigModifyConfigurationEnv> env) {
        this.env = env;
        return this;
    }

    public ApplicationConfigModifyConfiguration addEnvItem(ApplicationConfigModifyConfigurationEnv envItem) {
        if (this.env == null) {
            this.env = new ArrayList<>();
        }
        this.env.add(envItem);
        return this;
    }

    public ApplicationConfigModifyConfiguration withEnv(
        Consumer<List<ApplicationConfigModifyConfigurationEnv>> envSetter) {
        if (this.env == null) {
            this.env = new ArrayList<>();
        }
        envSetter.accept(this.env);
        return this;
    }

    /** 应用环境变量。
     * 
     * @return env */
    public List<ApplicationConfigModifyConfigurationEnv> getEnv() {
        return env;
    }

    public void setEnv(List<ApplicationConfigModifyConfigurationEnv> env) {
        this.env = env;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationConfigModifyConfiguration applicationConfigModifyConfiguration =
            (ApplicationConfigModifyConfiguration) o;
        return Objects.equals(this.env, applicationConfigModifyConfiguration.env);
    }

    @Override
    public int hashCode() {
        return Objects.hash(env);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationConfigModifyConfiguration {\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
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
