package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 加密数据信息
 */
public class EncryptDataIn {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private List<EncryptDataItem> config = null;

    public EncryptDataIn withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 加密数据名称，小写英文字母、数字、中划线，以小写字母或数字开头，最大长度为64个字符，不能为空
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EncryptDataIn withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 加密数据描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EncryptDataIn withConfig(List<EncryptDataItem> config) {
        this.config = config;
        return this;
    }

    public EncryptDataIn addConfigItem(EncryptDataItem configItem) {
        if (this.config == null) {
            this.config = new ArrayList<>();
        }
        this.config.add(configItem);
        return this;
    }

    public EncryptDataIn withConfig(Consumer<List<EncryptDataItem>> configSetter) {
        if (this.config == null) {
            this.config = new ArrayList<>();
        }
        configSetter.accept(this.config);
        return this;
    }

    /**
     * 加密数据项配置
     * @return config
     */
    public List<EncryptDataItem> getConfig() {
        return config;
    }

    public void setConfig(List<EncryptDataItem> config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EncryptDataIn encryptDataIn = (EncryptDataIn) o;
        return Objects.equals(this.name, encryptDataIn.name)
            && Objects.equals(this.description, encryptDataIn.description)
            && Objects.equals(this.config, encryptDataIn.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptDataIn {\n");
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
