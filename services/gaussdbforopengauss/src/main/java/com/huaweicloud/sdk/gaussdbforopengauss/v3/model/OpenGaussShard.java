package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DN分片扩容时必填
 */
public class OpenGaussShard  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    

    private Integer count;

    public OpenGaussShard withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 新增的DN分片扩容数大小
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenGaussShard openGaussShard = (OpenGaussShard) o;
        return Objects.equals(this.count, openGaussShard.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussShard {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

