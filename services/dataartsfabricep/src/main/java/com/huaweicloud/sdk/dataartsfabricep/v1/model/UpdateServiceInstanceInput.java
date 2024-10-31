package com.huaweicloud.sdk.dataartsfabricep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新Service的请求体
 */
public class UpdateServiceInstanceInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SourceRef source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private UpdateServiceInstanceConfig config;

    public UpdateServiceInstanceInput withSource(SourceRef source) {
        this.source = source;
        return this;
    }

    public UpdateServiceInstanceInput withSource(Consumer<SourceRef> sourceSetter) {
        if (this.source == null) {
            this.source = new SourceRef();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public SourceRef getSource() {
        return source;
    }

    public void setSource(SourceRef source) {
        this.source = source;
    }

    public UpdateServiceInstanceInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 一个Service Instance的名称，只能包含中文、字母、数字、下划线、中划线、点、空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateServiceInstanceInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateServiceInstanceInput withConfig(UpdateServiceInstanceConfig config) {
        this.config = config;
        return this;
    }

    public UpdateServiceInstanceInput withConfig(Consumer<UpdateServiceInstanceConfig> configSetter) {
        if (this.config == null) {
            this.config = new UpdateServiceInstanceConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public UpdateServiceInstanceConfig getConfig() {
        return config;
    }

    public void setConfig(UpdateServiceInstanceConfig config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateServiceInstanceInput that = (UpdateServiceInstanceInput) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, name, description, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServiceInstanceInput {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
