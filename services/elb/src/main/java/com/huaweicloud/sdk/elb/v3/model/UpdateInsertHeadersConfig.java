package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 参数解释：要添加的请求头参数列表。
 */
public class UpdateInsertHeadersConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private List<UpdateInsertHeaderConfig> configs = null;

    public UpdateInsertHeadersConfig withConfigs(List<UpdateInsertHeaderConfig> configs) {
        this.configs = configs;
        return this;
    }

    public UpdateInsertHeadersConfig addConfigsItem(UpdateInsertHeaderConfig configsItem) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        this.configs.add(configsItem);
        return this;
    }

    public UpdateInsertHeadersConfig withConfigs(Consumer<List<UpdateInsertHeaderConfig>> configsSetter) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        configsSetter.accept(this.configs);
        return this;
    }

    /**
     * 参数解释：要添加请求头参数列表。
     * @return configs
     */
    public List<UpdateInsertHeaderConfig> getConfigs() {
        return configs;
    }

    public void setConfigs(List<UpdateInsertHeaderConfig> configs) {
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
        UpdateInsertHeadersConfig that = (UpdateInsertHeadersConfig) obj;
        return Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInsertHeadersConfig {\n");
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
