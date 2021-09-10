package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ExecuteTbSessionReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reply")
    
    
    private String reply;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private Integer type;

    public ExecuteTbSessionReq withReply(String reply) {
        this.reply = reply;
        return this;
    }

    


    /**
     * 客户回复。
     * @return reply
     */
    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    

    public ExecuteTbSessionReq withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 客户回复属性，0表示通用回复，1表示客户打断， 2表示客户长时未回复。
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteTbSessionReq executeTbSessionReq = (ExecuteTbSessionReq) o;
        return Objects.equals(this.reply, executeTbSessionReq.reply) &&
            Objects.equals(this.type, executeTbSessionReq.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(reply, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteTbSessionReq {\n");
        sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

