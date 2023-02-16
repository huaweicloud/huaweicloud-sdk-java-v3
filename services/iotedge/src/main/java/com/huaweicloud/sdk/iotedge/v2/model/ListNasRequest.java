package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListNasRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private Integer limit;

    public ListNasRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * NA名称搜索关键字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListNasRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 查询的起始位置，取值范围为非负整数，默认为0
     * minimum: 0
     * maximum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListNasRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页记录数，取值范围为非负整数，默认值为10
     * minimum: 10
     * maximum: 10
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
        ListNasRequest listNasRequest = (ListNasRequest) o;
        return Objects.equals(this.name, listNasRequest.name) &&
            Objects.equals(this.offset, listNasRequest.offset) &&
            Objects.equals(this.limit, listNasRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNasRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

