package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.SeriesAPIQueryItemParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSeriesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private SeriesAPIQueryItemParam body;

    public ListSeriesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 用于限制本次返回的结果数据条数。 取值范围(0,1000]，默认值为1000。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    public ListSeriesRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 分页查询起始位置，为非负整数1234。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    

    public ListSeriesRequest withBody(SeriesAPIQueryItemParam body) {
        this.body = body;
        return this;
    }

    public ListSeriesRequest withBody(Consumer<SeriesAPIQueryItemParam> bodySetter) {
        if(this.body == null ){
            this.body = new SeriesAPIQueryItemParam();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public SeriesAPIQueryItemParam getBody() {
        return body;
    }

    public void setBody(SeriesAPIQueryItemParam body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSeriesRequest listSeriesRequest = (ListSeriesRequest) o;
        return Objects.equals(this.limit, listSeriesRequest.limit) &&
            Objects.equals(this.offset, listSeriesRequest.offset) &&
            Objects.equals(this.body, listSeriesRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSeriesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

