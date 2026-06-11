package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 精调训练环境变量信息
 */
public class TaskEnv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private List<EnvVar> envs = null;

    public TaskEnv withEnvs(List<EnvVar> envs) {
        this.envs = envs;
        return this;
    }

    public TaskEnv addEnvsItem(EnvVar envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public TaskEnv withEnvs(Consumer<List<EnvVar>> envsSetter) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * 精调训练环境变量信息
     * @return envs
     */
    public List<EnvVar> getEnvs() {
        return envs;
    }

    public void setEnvs(List<EnvVar> envs) {
        this.envs = envs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskEnv that = (TaskEnv) obj;
        return Objects.equals(this.envs, that.envs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskEnv {\n");
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
