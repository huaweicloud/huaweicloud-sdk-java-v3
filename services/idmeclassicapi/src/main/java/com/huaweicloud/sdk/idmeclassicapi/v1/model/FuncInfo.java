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
     * **参数解释：**  指定聚合函数名称，用于定义对数据执行的统计计算方式。  **约束限制：**  不涉及。  **取值范围：**  - AVG：求平均值。 - COUNT：求总数。 - MAX：求最大值。 - MIN：求最小值。  **默认取值：**  不涉及。 
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
     * **参数解释：**  指定聚合函数的操作维度属性名称，即对哪个数据属性进行聚合计算。 例如func为AVG且funcBy为“currentTemperature”时，表示计算平均运行温度。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
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
