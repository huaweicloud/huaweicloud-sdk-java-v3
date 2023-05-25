package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentConfigCreate
 */
public class ComponentConfigCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private List<ComponentConfigEnvs> envs = null;

    public ComponentConfigCreate withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ComponentConfigCreate withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 来源版本号
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ComponentConfigCreate withEnvs(List<ComponentConfigEnvs> envs) {
        this.envs = envs;
        return this;
    }

    public ComponentConfigCreate addEnvsItem(ComponentConfigEnvs envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public ComponentConfigCreate withEnvs(Consumer<List<ComponentConfigEnvs>> envsSetter) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * application environment parameters
     * @return envs
     */
    public List<ComponentConfigEnvs> getEnvs() {
        return envs;
    }

    public void setEnvs(List<ComponentConfigEnvs> envs) {
        this.envs = envs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentConfigCreate componentConfigCreate = (ComponentConfigCreate) o;
        return Objects.equals(this.version, componentConfigCreate.version)
            && Objects.equals(this.source, componentConfigCreate.source)
            && Objects.equals(this.envs, componentConfigCreate.envs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, source, envs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentConfigCreate {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
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
