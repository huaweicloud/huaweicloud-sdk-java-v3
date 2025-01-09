package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 通用音视频设置项。
 */
public class PoliciesCustomOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_configuration1_rule")

    private String customConfiguration1Rule;

    public PoliciesCustomOptions withCustomConfiguration1Rule(String customConfiguration1Rule) {
        this.customConfiguration1Rule = customConfiguration1Rule;
        return this;
    }

    /**
     * 自定义配置规则。
     * @return customConfiguration1Rule
     */
    public String getCustomConfiguration1Rule() {
        return customConfiguration1Rule;
    }

    public void setCustomConfiguration1Rule(String customConfiguration1Rule) {
        this.customConfiguration1Rule = customConfiguration1Rule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesCustomOptions that = (PoliciesCustomOptions) obj;
        return Objects.equals(this.customConfiguration1Rule, that.customConfiguration1Rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customConfiguration1Rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesCustomOptions {\n");
        sb.append("    customConfiguration1Rule: ").append(toIndentedString(customConfiguration1Rule)).append("\n");
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
