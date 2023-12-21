package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FuncInfo
 */
public class FuncInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func")

    private String func;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "funcBy")

    private String funcBy;

    public FuncInfo withFunc(String func) {
        this.func = func;
        return this;
    }

    /**
     * 指定简单函数名称。 - AVG：求平均值。 - COUNT：求总数。 - MAX：求最大值。 - MIX：求最小值。
     * @return func
     */
    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public FuncInfo withFuncBy(String funcBy) {
        this.funcBy = funcBy;
        return this;
    }

    /**
     * 指定简单函数以哪个属性为维度操作。
     * @return funcBy
     */
    public String getFuncBy() {
        return funcBy;
    }

    public void setFuncBy(String funcBy) {
        this.funcBy = funcBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FuncInfo that = (FuncInfo) obj;
        return Objects.equals(this.func, that.func) && Objects.equals(this.funcBy, that.funcBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(func, funcBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuncInfo {\n");
        sb.append("    func: ").append(toIndentedString(func)).append("\n");
        sb.append("    funcBy: ").append(toIndentedString(funcBy)).append("\n");
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
