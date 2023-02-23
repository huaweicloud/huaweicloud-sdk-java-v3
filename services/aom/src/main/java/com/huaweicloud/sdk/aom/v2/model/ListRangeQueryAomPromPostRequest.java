package com.huaweicloud.sdk.aom.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "ListRangeQueryAomPromPostRequest")
public class ListRangeQueryAomPromPostRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="query")
    
    @JacksonXmlProperty(localName = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start")
    
    @JacksonXmlProperty(localName = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end")
    
    @JacksonXmlProperty(localName = "end")

    private String end;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="step")
    
    @JacksonXmlProperty(localName = "step")

    private String step;

    public ListRangeQueryAomPromPostRequest withQuery(String query) {
        this.query = query;
        return this;
    }

    


    /**
     * PromQL表达式(参考https://prometheus.io/docs/prometheus/latest/querying/basics/)。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    

    public ListRangeQueryAomPromPostRequest withStart(String start) {
        this.start = start;
        return this;
    }

    


    /**
     * 起始时间戳(Unix时间戳格式，单位：秒）。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    

    public ListRangeQueryAomPromPostRequest withEnd(String end) {
        this.end = end;
        return this;
    }

    


    /**
     * 结束时间戳(Unix时间戳格式，单位：秒）。
     * @return end
     */
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    

    public ListRangeQueryAomPromPostRequest withStep(String step) {
        this.step = step;
        return this;
    }

    


    /**
     * 查询时间步长，时间区内每step秒执行一次。
     * @return step
     */
    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRangeQueryAomPromPostRequest listRangeQueryAomPromPostRequest = (ListRangeQueryAomPromPostRequest) o;
        return Objects.equals(this.query, listRangeQueryAomPromPostRequest.query) &&
            Objects.equals(this.start, listRangeQueryAomPromPostRequest.start) &&
            Objects.equals(this.end, listRangeQueryAomPromPostRequest.end) &&
            Objects.equals(this.step, listRangeQueryAomPromPostRequest.step);
    }
    @Override
    public int hashCode() {
        return Objects.hash(query, start, end, step);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRangeQueryAomPromPostRequest {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
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

