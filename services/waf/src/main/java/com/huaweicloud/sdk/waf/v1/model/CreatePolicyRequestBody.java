package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreatePolicyRequestBody
 */
public class CreatePolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_action_replaced")

    private Boolean logActionReplaced;

    public CreatePolicyRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称（策略名称只能由数字、字母和下划线组成，长度不能超过64位字符）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePolicyRequestBody withLogActionReplaced(Boolean logActionReplaced) {
        this.logActionReplaced = logActionReplaced;
        return this;
    }

    /**
     * cc规则和精准防护规则“防护动作”选择“仅记录”时，Web基础防护是否命中策略规则并阻断，默认为true
     * @return logActionReplaced
     */
    public Boolean getLogActionReplaced() {
        return logActionReplaced;
    }

    public void setLogActionReplaced(Boolean logActionReplaced) {
        this.logActionReplaced = logActionReplaced;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePolicyRequestBody that = (CreatePolicyRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.logActionReplaced, that.logActionReplaced);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, logActionReplaced);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePolicyRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    logActionReplaced: ").append(toIndentedString(logActionReplaced)).append("\n");
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
