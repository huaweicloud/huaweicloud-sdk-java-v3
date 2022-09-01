package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.PostSuggestionsReq;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSuggestionsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qabot_id")
    
    @JacksonXmlProperty(localName = "qabot_id")
    
    private String qabotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    @JacksonXmlProperty(localName = "body")
    
    private PostSuggestionsReq body;

    public ListSuggestionsRequest withQabotId(String qabotId) {
        this.qabotId = qabotId;
        return this;
    }

    


    /**
     * qabot编号，UUID格式。
     * @return qabotId
     */
    public String getQabotId() {
        return qabotId;
    }

    public void setQabotId(String qabotId) {
        this.qabotId = qabotId;
    }

    

    public ListSuggestionsRequest withBody(PostSuggestionsReq body) {
        this.body = body;
        return this;
    }

    public ListSuggestionsRequest withBody(Consumer<PostSuggestionsReq> bodySetter) {
        if(this.body == null ){
            this.body = new PostSuggestionsReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public PostSuggestionsReq getBody() {
        return body;
    }

    public void setBody(PostSuggestionsReq body) {
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
        ListSuggestionsRequest listSuggestionsRequest = (ListSuggestionsRequest) o;
        return Objects.equals(this.qabotId, listSuggestionsRequest.qabotId) &&
            Objects.equals(this.body, listSuggestionsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(qabotId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSuggestionsRequest {\n");
        sb.append("    qabotId: ").append(toIndentedString(qabotId)).append("\n");
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

