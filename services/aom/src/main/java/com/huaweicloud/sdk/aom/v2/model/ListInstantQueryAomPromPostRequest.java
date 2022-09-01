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
public class ListInstantQueryAomPromPostRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="query")
    
    @JacksonXmlProperty(localName = "query")
    
    private String query;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    @JacksonXmlProperty(localName = "time")
    
    private String time;

    public ListInstantQueryAomPromPostRequest withQuery(String query) {
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

    

    public ListInstantQueryAomPromPostRequest withTime(String time) {
        this.time = time;
        return this;
    }

    


    /**
     * 指定用于计算 PromQL 的时间戳，(Unix时间戳格式，单位：秒）。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstantQueryAomPromPostRequest listInstantQueryAomPromPostRequest = (ListInstantQueryAomPromPostRequest) o;
        return Objects.equals(this.query, listInstantQueryAomPromPostRequest.query) &&
            Objects.equals(this.time, listInstantQueryAomPromPostRequest.time);
    }
    @Override
    public int hashCode() {
        return Objects.hash(query, time);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstantQueryAomPromPostRequest {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

