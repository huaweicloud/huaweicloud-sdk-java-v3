package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobAlgorithmResponsePoliciesAutoSearchRewardAttrs
 */
public class JobAlgorithmResponsePoliciesAutoSearchRewardAttrs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex")

    private String regex;

    public JobAlgorithmResponsePoliciesAutoSearchRewardAttrs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指标名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobAlgorithmResponsePoliciesAutoSearchRewardAttrs withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 搜索方向。 - max指定时表示指标值越大越好； - min指定时表示指标值越小越好。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public JobAlgorithmResponsePoliciesAutoSearchRewardAttrs withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
     * 指标正则表达式。
     * @return regex
     */
    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobAlgorithmResponsePoliciesAutoSearchRewardAttrs that =
            (JobAlgorithmResponsePoliciesAutoSearchRewardAttrs) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.regex, that.regex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mode, regex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobAlgorithmResponsePoliciesAutoSearchRewardAttrs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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
