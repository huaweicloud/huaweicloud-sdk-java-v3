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
public class ApplicationConfigModifyConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env")

    private List<DnsConfigOptions> env = null;

    public ApplicationConfigModifyConfiguration withEnv(List<DnsConfigOptions> env) {
        this.env = env;
        return this;
    }

    public ApplicationConfigModifyConfiguration addEnvItem(DnsConfigOptions envItem) {
        if (this.env == null) {
            this.env = new ArrayList<>();
        }
        this.env.add(envItem);
        return this;
    }

    public ApplicationConfigModifyConfiguration withEnv(Consumer<List<DnsConfigOptions>> envSetter) {
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
    public List<DnsConfigOptions> getEnv() {
        return env;
    }

    public void setEnv(List<DnsConfigOptions> env) {
        this.env = env;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplicationConfigModifyConfiguration that = (ApplicationConfigModifyConfiguration) obj;
        return Objects.equals(this.env, that.env);
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
