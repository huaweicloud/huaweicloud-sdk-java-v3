package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 解析路由结果返回结构体
 */
public class RouterDetailRespDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="route_id")
    
    
    private String routeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input_module_id")
    
    
    private String inputModuleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_module_id")
    
    
    private String outputModuleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    
    private String input;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    
    private String output;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sql")
    
    
    private String sql;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available")
    
    
    private Boolean available;

    public RouterDetailRespDTO withRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    


    /**
     * 路由ID，节点下唯一
     * @return routeId
     */
    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    

    public RouterDetailRespDTO withInputModuleId(String inputModuleId) {
        this.inputModuleId = inputModuleId;
        return this;
    }

    


    /**
     * 输入点所在模块的模块ID
     * @return inputModuleId
     */
    public String getInputModuleId() {
        return inputModuleId;
    }

    public void setInputModuleId(String inputModuleId) {
        this.inputModuleId = inputModuleId;
    }

    

    public RouterDetailRespDTO withOutputModuleId(String outputModuleId) {
        this.outputModuleId = outputModuleId;
        return this;
    }

    


    /**
     * 输出点所在模块的模块ID
     * @return outputModuleId
     */
    public String getOutputModuleId() {
        return outputModuleId;
    }

    public void setOutputModuleId(String outputModuleId) {
        this.outputModuleId = outputModuleId;
    }

    

    public RouterDetailRespDTO withInput(String input) {
        this.input = input;
        return this;
    }

    


    /**
     * 输入点名称
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    

    public RouterDetailRespDTO withOutput(String output) {
        this.output = output;
        return this;
    }

    


    /**
     * 输出点名称
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    

    public RouterDetailRespDTO withSql(String sql) {
        this.sql = sql;
        return this;
    }

    


    /**
     * sql參數
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    

    public RouterDetailRespDTO withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    


    /**
     * 是否可用
     * @return available
     */
    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RouterDetailRespDTO routerDetailRespDTO = (RouterDetailRespDTO) o;
        return Objects.equals(this.routeId, routerDetailRespDTO.routeId) &&
            Objects.equals(this.inputModuleId, routerDetailRespDTO.inputModuleId) &&
            Objects.equals(this.outputModuleId, routerDetailRespDTO.outputModuleId) &&
            Objects.equals(this.input, routerDetailRespDTO.input) &&
            Objects.equals(this.output, routerDetailRespDTO.output) &&
            Objects.equals(this.sql, routerDetailRespDTO.sql) &&
            Objects.equals(this.available, routerDetailRespDTO.available);
    }
    @Override
    public int hashCode() {
        return Objects.hash(routeId, inputModuleId, outputModuleId, input, output, sql, available);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouterDetailRespDTO {\n");
        sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
        sb.append("    inputModuleId: ").append(toIndentedString(inputModuleId)).append("\n");
        sb.append("    outputModuleId: ").append(toIndentedString(outputModuleId)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

