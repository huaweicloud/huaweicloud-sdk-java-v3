package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ValidationResult
 */
public class ValidationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linkConfig")

    private List<ValidationLinkConfig> linkConfig = null;

    public ValidationResult withLinkConfig(List<ValidationLinkConfig> linkConfig) {
        this.linkConfig = linkConfig;
        return this;
    }

    public ValidationResult addLinkConfigItem(ValidationLinkConfig linkConfigItem) {
        if (this.linkConfig == null) {
            this.linkConfig = new ArrayList<>();
        }
        this.linkConfig.add(linkConfigItem);
        return this;
    }

    public ValidationResult withLinkConfig(Consumer<List<ValidationLinkConfig>> linkConfigSetter) {
        if (this.linkConfig == null) {
            this.linkConfig = new ArrayList<>();
        }
        linkConfigSetter.accept(this.linkConfig);
        return this;
    }

    /**
     * 创建或更新连接校验结果，请参见linkConfig参数说明
     * @return linkConfig
     */
    public List<ValidationLinkConfig> getLinkConfig() {
        return linkConfig;
    }

    public void setLinkConfig(List<ValidationLinkConfig> linkConfig) {
        this.linkConfig = linkConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidationResult that = (ValidationResult) obj;
        return Objects.equals(this.linkConfig, that.linkConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationResult {\n");
        sb.append("    linkConfig: ").append(toIndentedString(linkConfig)).append("\n");
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
