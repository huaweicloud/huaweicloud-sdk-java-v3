package com.huaweicloud.sdk.cbs.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.PostRequestsReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ExecuteQaChatRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qabot_id")
    
    
    private String qabotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private PostRequestsReq body;

    public ExecuteQaChatRequest withQabotId(String qabotId) {
        this.qabotId = qabotId;
        return this;
    }

    


    /**
     * 机器人标识符，qabot编号，UUID格式。
     * @return qabotId
     */
    public String getQabotId() {
        return qabotId;
    }

    public void setQabotId(String qabotId) {
        this.qabotId = qabotId;
    }

    

    public ExecuteQaChatRequest withBody(PostRequestsReq body) {
        this.body = body;
        return this;
    }

    public ExecuteQaChatRequest withBody(Consumer<PostRequestsReq> bodySetter) {
        if(this.body == null ){
            this.body = new PostRequestsReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public PostRequestsReq getBody() {
        return body;
    }

    public void setBody(PostRequestsReq body) {
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
        ExecuteQaChatRequest executeQaChatRequest = (ExecuteQaChatRequest) o;
        return Objects.equals(this.qabotId, executeQaChatRequest.qabotId) &&
            Objects.equals(this.body, executeQaChatRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(qabotId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteQaChatRequest {\n");
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

