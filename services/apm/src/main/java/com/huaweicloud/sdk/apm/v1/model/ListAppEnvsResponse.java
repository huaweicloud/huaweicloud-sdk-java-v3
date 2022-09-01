package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAppEnvsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    @JacksonXmlProperty(localName = "envs")

    private List<EnvNodeModel> envs = null;

    public ListAppEnvsResponse withEnvs(List<EnvNodeModel> envs) {
        this.envs = envs;
        return this;
    }

    public ListAppEnvsResponse addEnvsItem(EnvNodeModel envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public ListAppEnvsResponse withEnvs(Consumer<List<EnvNodeModel>> envsSetter) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * 环境信息列表
     * @return envs
     */
    public List<EnvNodeModel> getEnvs() {
        return envs;
    }

    public void setEnvs(List<EnvNodeModel> envs) {
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
        ListAppEnvsResponse listAppEnvsResponse = (ListAppEnvsResponse) o;
        return Objects.equals(this.envs, listAppEnvsResponse.envs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppEnvsResponse {\n");
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
