package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行部署任务时传递的动态参数
 */
public class KeyValueDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private List<ParamTypeLimits> limits = null;

    public KeyValueDO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 执行部署任务时传递的参数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeyValueDO withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 执行部署任务时传递的参数值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public KeyValueDO withLimits(List<ParamTypeLimits> limits) {
        this.limits = limits;
        return this;
    }

    public KeyValueDO addLimitsItem(ParamTypeLimits limitsItem) {
        if (this.limits == null) {
            this.limits = new ArrayList<>();
        }
        this.limits.add(limitsItem);
        return this;
    }

    public KeyValueDO withLimits(Consumer<List<ParamTypeLimits>> limitsSetter) {
        if (this.limits == null) {
            this.limits = new ArrayList<>();
        }
        limitsSetter.accept(this.limits);
        return this;
    }

    /**
     * 参数值为枚举类型时，返回可选值列表
     * @return limits
     */
    public List<ParamTypeLimits> getLimits() {
        return limits;
    }

    public void setLimits(List<ParamTypeLimits> limits) {
        this.limits = limits;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyValueDO keyValueDO = (KeyValueDO) o;
        return Objects.equals(this.name, keyValueDO.name) && Objects.equals(this.value, keyValueDO.value)
            && Objects.equals(this.limits, keyValueDO.limits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, limits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyValueDO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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
