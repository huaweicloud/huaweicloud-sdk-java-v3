package com.huaweicloud.sdk.aom.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.QueryBodyParam;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "ListLogItemsRequest")
public class ListLogItemsRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    @JacksonXmlProperty(localName = "body")

    private QueryBodyParam body;

    public ListLogItemsRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 日志接口调用方式,当值为\"querylogs\"时接口功能为查询日志内容。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListLogItemsRequest withBody(QueryBodyParam body) {
        this.body = body;
        return this;
    }

    public ListLogItemsRequest withBody(Consumer<QueryBodyParam> bodySetter) {
        if(this.body == null ){
            this.body = new QueryBodyParam();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public QueryBodyParam getBody() {
        return body;
    }

    public void setBody(QueryBodyParam body) {
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
        ListLogItemsRequest listLogItemsRequest = (ListLogItemsRequest) o;
        return Objects.equals(this.type, listLogItemsRequest.type) &&
            Objects.equals(this.body, listLogItemsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogItemsRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

