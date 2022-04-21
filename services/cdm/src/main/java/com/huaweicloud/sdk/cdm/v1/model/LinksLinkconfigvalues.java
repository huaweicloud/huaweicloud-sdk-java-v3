package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 连接参数配置，请参见link-config-values参数说明
 */
public class LinksLinkconfigvalues {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private List<Configs> configs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extended-configs")

    private LinksLinkconfigvaluesExtendedconfigs extendedConfigs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validators")

    private List<String> validators = null;

    public LinksLinkconfigvalues withConfigs(List<Configs> configs) {
        this.configs = configs;
        return this;
    }

    public LinksLinkconfigvalues addConfigsItem(Configs configsItem) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        this.configs.add(configsItem);
        return this;
    }

    public LinksLinkconfigvalues withConfigs(Consumer<List<Configs>> configsSetter) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        configsSetter.accept(this.configs);
        return this;
    }

    /**
     * 连接配置参数数据结构，请参见configs参数说明。
     * @return configs
     */
    public List<Configs> getConfigs() {
        return configs;
    }

    public void setConfigs(List<Configs> configs) {
        this.configs = configs;
    }

    public LinksLinkconfigvalues withExtendedConfigs(LinksLinkconfigvaluesExtendedconfigs extendedConfigs) {
        this.extendedConfigs = extendedConfigs;
        return this;
    }

    public LinksLinkconfigvalues withExtendedConfigs(
        Consumer<LinksLinkconfigvaluesExtendedconfigs> extendedConfigsSetter) {
        if (this.extendedConfigs == null) {
            this.extendedConfigs = new LinksLinkconfigvaluesExtendedconfigs();
            extendedConfigsSetter.accept(this.extendedConfigs);
        }

        return this;
    }

    /**
     * Get extendedConfigs
     * @return extendedConfigs
     */
    public LinksLinkconfigvaluesExtendedconfigs getExtendedConfigs() {
        return extendedConfigs;
    }

    public void setExtendedConfigs(LinksLinkconfigvaluesExtendedconfigs extendedConfigs) {
        this.extendedConfigs = extendedConfigs;
    }

    public LinksLinkconfigvalues withValidators(List<String> validators) {
        this.validators = validators;
        return this;
    }

    public LinksLinkconfigvalues addValidatorsItem(String validatorsItem) {
        if (this.validators == null) {
            this.validators = new ArrayList<>();
        }
        this.validators.add(validatorsItem);
        return this;
    }

    public LinksLinkconfigvalues withValidators(Consumer<List<String>> validatorsSetter) {
        if (this.validators == null) {
            this.validators = new ArrayList<>();
        }
        validatorsSetter.accept(this.validators);
        return this;
    }

    /**
     * 校验器
     * @return validators
     */
    public List<String> getValidators() {
        return validators;
    }

    public void setValidators(List<String> validators) {
        this.validators = validators;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinksLinkconfigvalues linksLinkconfigvalues = (LinksLinkconfigvalues) o;
        return Objects.equals(this.configs, linksLinkconfigvalues.configs)
            && Objects.equals(this.extendedConfigs, linksLinkconfigvalues.extendedConfigs)
            && Objects.equals(this.validators, linksLinkconfigvalues.validators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs, extendedConfigs, validators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinksLinkconfigvalues {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    extendedConfigs: ").append(toIndentedString(extendedConfigs)).append("\n");
        sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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
