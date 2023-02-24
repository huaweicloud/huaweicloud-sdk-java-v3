package com.huaweicloud.sdk.aom.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.MetricAPIQueryItemParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListMetricItemsRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start")
    

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private MetricAPIQueryItemParam body;

    public ListMetricItemsRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 指标查询方式。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListMetricItemsRequest withLimit(String limit) {
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

    

    public ListMetricItemsRequest withStart(String start) {
        this.start = start;
        return this;
    }

    


    /**
     * 分页查询起始位置，为非负整数。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    

    public ListMetricItemsRequest withBody(MetricAPIQueryItemParam body) {
        this.body = body;
        return this;
    }

    public ListMetricItemsRequest withBody(Consumer<MetricAPIQueryItemParam> bodySetter) {
        if(this.body == null ){
            this.body = new MetricAPIQueryItemParam();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public MetricAPIQueryItemParam getBody() {
        return body;
    }

    public void setBody(MetricAPIQueryItemParam body) {
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
        ListMetricItemsRequest listMetricItemsRequest = (ListMetricItemsRequest) o;
        return Objects.equals(this.type, listMetricItemsRequest.type) &&
            Objects.equals(this.limit, listMetricItemsRequest.limit) &&
            Objects.equals(this.start, listMetricItemsRequest.start) &&
            Objects.equals(this.body, listMetricItemsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, limit, start, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricItemsRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

