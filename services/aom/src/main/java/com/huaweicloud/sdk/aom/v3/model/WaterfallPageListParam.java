package com.huaweicloud.sdk.aom.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * WaterfallPageListParam
 */
public class WaterfallPageListParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maker")
    
    
    private String maker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private Integer limit;

    public WaterfallPageListParam withMaker(String maker) {
        this.maker = maker;
        return this;
    }

    


    /**
     * 页面的分页标志位
     * @return maker
     */
    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    

    public WaterfallPageListParam withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询返回记录的数量限制
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WaterfallPageListParam waterfallPageListParam = (WaterfallPageListParam) o;
        return Objects.equals(this.maker, waterfallPageListParam.maker) &&
            Objects.equals(this.limit, waterfallPageListParam.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(maker, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WaterfallPageListParam {\n");
        sb.append("    maker: ").append(toIndentedString(maker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

