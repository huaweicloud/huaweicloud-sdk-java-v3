package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowDomainFullConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private ConfigsGetBody configs;

    public ShowDomainFullConfigResponse withConfigs(ConfigsGetBody configs) {
        this.configs = configs;
        return this;
    }

    public ShowDomainFullConfigResponse withConfigs(Consumer<ConfigsGetBody> configsSetter) {
        if (this.configs == null) {
            this.configs = new ConfigsGetBody();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /** Get configs
     * 
     * @return configs */
    public ConfigsGetBody getConfigs() {
        return configs;
    }

    public void setConfigs(ConfigsGetBody configs) {
        this.configs = configs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainFullConfigResponse showDomainFullConfigResponse = (ShowDomainFullConfigResponse) o;
        return Objects.equals(this.configs, showDomainFullConfigResponse.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainFullConfigResponse {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
