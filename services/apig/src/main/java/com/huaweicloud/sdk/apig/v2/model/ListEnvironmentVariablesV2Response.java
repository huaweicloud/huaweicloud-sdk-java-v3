package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.EnvVariableResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListEnvironmentVariablesV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="variables")
    
    private List<EnvVariableResp> variables = null;
    
    public ListEnvironmentVariablesV2Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 满足条件的环境变量总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListEnvironmentVariablesV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListEnvironmentVariablesV2Response withVariables(List<EnvVariableResp> variables) {
        this.variables = variables;
        return this;
    }

    
    public ListEnvironmentVariablesV2Response addVariablesItem(EnvVariableResp variablesItem) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    public ListEnvironmentVariablesV2Response withVariables(Consumer<List<EnvVariableResp>> variablesSetter) {
        if(this.variables == null ){
            this.variables = new ArrayList<>();
        }
        variablesSetter.accept(this.variables);
        return this;
    }

    /**
     * 本次返回的环境变量列表
     * @return variables
     */
    public List<EnvVariableResp> getVariables() {
        return variables;
    }

    public void setVariables(List<EnvVariableResp> variables) {
        this.variables = variables;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnvironmentVariablesV2Response listEnvironmentVariablesV2Response = (ListEnvironmentVariablesV2Response) o;
        return Objects.equals(this.total, listEnvironmentVariablesV2Response.total) &&
            Objects.equals(this.size, listEnvironmentVariablesV2Response.size) &&
            Objects.equals(this.variables, listEnvironmentVariablesV2Response.variables);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, size, variables);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnvironmentVariablesV2Response {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

