package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * application common configuration
 */
public class ApplicationConfigConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env")

    private List<ApplicationConfigConfigurationEnv> env = null;

    public ApplicationConfigConfiguration withEnv(List<ApplicationConfigConfigurationEnv> env) {
        this.env = env;
        return this;
    }

    public ApplicationConfigConfiguration addEnvItem(ApplicationConfigConfigurationEnv envItem) {
        if (this.env == null) {
            this.env = new ArrayList<>();
        }
        this.env.add(envItem);
        return this;
    }

    public ApplicationConfigConfiguration withEnv(Consumer<List<ApplicationConfigConfigurationEnv>> envSetter) {
        if (this.env == null) {
            this.env = new ArrayList<>();
        }
        envSetter.accept(this.env);
        return this;
    }

    /**
     * application environment parameters
     * @return env
     */
    public List<ApplicationConfigConfigurationEnv> getEnv() {
        return env;
    }

    public void setEnv(List<ApplicationConfigConfigurationEnv> env) {
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
        ApplicationConfigConfiguration applicationConfigConfiguration = (ApplicationConfigConfiguration) o;
        return Objects.equals(this.env, applicationConfigConfiguration.env);
    }

    @Override
    public int hashCode() {
        return Objects.hash(env);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationConfigConfiguration {\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
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
