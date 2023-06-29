package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfirmIaConfigsRequestBody
 */
public class ConfirmIaConfigsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private List<ConfirmIaConfigRequestBody> configs = null;

    public ConfirmIaConfigsRequestBody withConfigs(List<ConfirmIaConfigRequestBody> configs) {
        this.configs = configs;
        return this;
    }

    public ConfirmIaConfigsRequestBody addConfigsItem(ConfirmIaConfigRequestBody configsItem) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        this.configs.add(configsItem);
        return this;
    }

    public ConfirmIaConfigsRequestBody withConfigs(Consumer<List<ConfirmIaConfigRequestBody>> configsSetter) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        configsSetter.accept(this.configs);
        return this;
    }

    /**
     * 确认配置项列表
     * @return configs
     */
    public List<ConfirmIaConfigRequestBody> getConfigs() {
        return configs;
    }

    public void setConfigs(List<ConfirmIaConfigRequestBody> configs) {
        this.configs = configs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfirmIaConfigsRequestBody that = (ConfirmIaConfigsRequestBody) obj;
        return Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmIaConfigsRequestBody {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
