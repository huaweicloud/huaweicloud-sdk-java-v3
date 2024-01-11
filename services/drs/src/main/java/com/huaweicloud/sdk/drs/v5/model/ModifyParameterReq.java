package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新任务参数请求体。
 */
public class ModifyParameterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<ParameterInfo> values = null;

    public ModifyParameterReq withValues(List<ParameterInfo> values) {
        this.values = values;
        return this;
    }

    public ModifyParameterReq addValuesItem(ParameterInfo valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ModifyParameterReq withValues(Consumer<List<ParameterInfo>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 参数值对象，基于默认参数模板初始化的参数值。  key：参数名称，如“applier_thread_num”，“read_task_num”。为空时不修改参数值。 value：参数值，如“6”，“20”。key不为空时value也不可为空。
     * @return values
     */
    public List<ParameterInfo> getValues() {
        return values;
    }

    public void setValues(List<ParameterInfo> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyParameterReq that = (ModifyParameterReq) obj;
        return Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyParameterReq {\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
