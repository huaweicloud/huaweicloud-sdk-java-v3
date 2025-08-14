package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 应用镜像策略设置项。
 */
public class RailTransparentConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_policy")

    private Integer selectPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transparent_list_custom")

    private String transparentListCustom;

    public RailTransparentConfig withSelectPolicy(Integer selectPolicy) {
        this.selectPolicy = selectPolicy;
        return this;
    }

    /**
     * 策略选值原则。
     * minimum: 0
     * maximum: 2
     * @return selectPolicy
     */
    public Integer getSelectPolicy() {
        return selectPolicy;
    }

    public void setSelectPolicy(Integer selectPolicy) {
        this.selectPolicy = selectPolicy;
    }

    public RailTransparentConfig withTransparentListCustom(String transparentListCustom) {
        this.transparentListCustom = transparentListCustom;
        return this;
    }

    /**
     * 配置项内容。
     * @return transparentListCustom
     */
    public String getTransparentListCustom() {
        return transparentListCustom;
    }

    public void setTransparentListCustom(String transparentListCustom) {
        this.transparentListCustom = transparentListCustom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RailTransparentConfig that = (RailTransparentConfig) obj;
        return Objects.equals(this.selectPolicy, that.selectPolicy)
            && Objects.equals(this.transparentListCustom, that.transparentListCustom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectPolicy, transparentListCustom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RailTransparentConfig {\n");
        sb.append("    selectPolicy: ").append(toIndentedString(selectPolicy)).append("\n");
        sb.append("    transparentListCustom: ").append(toIndentedString(transparentListCustom)).append("\n");
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
