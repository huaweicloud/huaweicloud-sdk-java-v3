package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.Params;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库参数信息响应体
 */
public class QueryDbParamsResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="params")
    
    private List<Params> params = null;
    
    public QueryDbParamsResp withParams(List<Params> params) {
        this.params = params;
        return this;
    }

    
    public QueryDbParamsResp addParamsItem(Params paramsItem) {
        this.params.add(paramsItem);
        return this;
    }

    public QueryDbParamsResp withParams(Consumer<List<Params>> paramsSetter) {
        if(this.params == null ){
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * Get params
     * @return params
     */
    public List<Params> getParams() {
        return params;
    }

    public void setParams(List<Params> params) {
        this.params = params;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryDbParamsResp queryDbParamsResp = (QueryDbParamsResp) o;
        return Objects.equals(this.params, queryDbParamsResp.params);
    }
    @Override
    public int hashCode() {
        return Objects.hash(params);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDbParamsResp {\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

