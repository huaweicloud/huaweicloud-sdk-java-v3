package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自定义策略。
 */
public class PoliciesCustom {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_configuration1_enable")

    private Boolean customConfiguration1Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private PoliciesCustomOptions options;

    public PoliciesCustom withCustomConfiguration1Enable(Boolean customConfiguration1Enable) {
        this.customConfiguration1Enable = customConfiguration1Enable;
        return this;
    }

    /**
     * 自定义配置启用。
     * @return customConfiguration1Enable
     */
    public Boolean getCustomConfiguration1Enable() {
        return customConfiguration1Enable;
    }

    public void setCustomConfiguration1Enable(Boolean customConfiguration1Enable) {
        this.customConfiguration1Enable = customConfiguration1Enable;
    }

    public PoliciesCustom withOptions(PoliciesCustomOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesCustom withOptions(Consumer<PoliciesCustomOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new PoliciesCustomOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public PoliciesCustomOptions getOptions() {
        return options;
    }

    public void setOptions(PoliciesCustomOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesCustom that = (PoliciesCustom) obj;
        return Objects.equals(this.customConfiguration1Enable, that.customConfiguration1Enable)
            && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customConfiguration1Enable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesCustom {\n");
        sb.append("    customConfiguration1Enable: ").append(toIndentedString(customConfiguration1Enable)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
