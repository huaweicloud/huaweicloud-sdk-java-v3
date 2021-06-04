package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 函数工作流转发配置信息
 */
public class FunctionGraphForwarding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="func_urn")
    
    private String funcUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="func_name")
    
    private String funcName;

    public FunctionGraphForwarding withFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
        return this;
    }

    


    /**
     * **参数说明**：函数的URN（Uniform Resource Name），唯一标识函数。
     * @return funcUrn
     */
    public String getFuncUrn() {
        return funcUrn;
    }

    public void setFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
    }

    

    public FunctionGraphForwarding withFuncName(String funcName) {
        this.funcName = funcName;
        return this;
    }

    


    /**
     * **参数说明**：函数名称。
     * @return funcName
     */
    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FunctionGraphForwarding functionGraphForwarding = (FunctionGraphForwarding) o;
        return Objects.equals(this.funcUrn, functionGraphForwarding.funcUrn) &&
            Objects.equals(this.funcName, functionGraphForwarding.funcName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(funcUrn, funcName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionGraphForwarding {\n");
        sb.append("    funcUrn: ").append(toIndentedString(funcUrn)).append("\n");
        sb.append("    funcName: ").append(toIndentedString(funcName)).append("\n");
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

