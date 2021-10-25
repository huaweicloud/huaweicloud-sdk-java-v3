package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询结果元数据信息，包括分页信息等。
 */
public class Metadata2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    
    private Integer total;

    public Metadata2 withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 当前返回结果条数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public Metadata2 withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 下一个开始的标记，用于分页，null表示无更多数据。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public Metadata2 withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总条数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metadata2 metadata2 = (Metadata2) o;
        return Objects.equals(this.count, metadata2.count) &&
            Objects.equals(this.offset, metadata2.offset) &&
            Objects.equals(this.total, metadata2.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, offset, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata2 {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

