package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SwaggerInfoResp
 */
public class SwaggerInfoResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private String result;

    public SwaggerInfoResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * swagger文档编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public SwaggerInfoResp withResult(String result) {
        this.result = result;
        return this;
    }

    


    /**
     * 导入结果说明
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SwaggerInfoResp swaggerInfoResp = (SwaggerInfoResp) o;
        return Objects.equals(this.id, swaggerInfoResp.id) &&
            Objects.equals(this.result, swaggerInfoResp.result);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, result);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwaggerInfoResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

