package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.CreateMessageDoV2;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateMessageV2Req
 */
public class CreateMessageV2Req  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private CreateMessageDoV2 message = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;

    public CreateMessageV2Req withMessage(CreateMessageDoV2 message) {
        this.message = message;
        return this;
    }

    public CreateMessageV2Req withMessage(Consumer<CreateMessageDoV2> messageSetter) {
        if(this.message == null ){
            this.message = new CreateMessageDoV2();
            messageSetter.accept(this.message);
        }
        
        return this;
    }


    /**
     * Get message
     * @return message
     */
    public CreateMessageDoV2 getMessage() {
        return message;
    }

    public void setMessage(CreateMessageDoV2 message) {
        this.message = message;
    }

    public CreateMessageV2Req withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 类型，可以删除
     * minimum: 0
     * maximum: 1
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CreateMessageV2Req withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMessageV2Req createMessageV2Req = (CreateMessageV2Req) o;
        return Objects.equals(this.message, createMessageV2Req.message) &&
            Objects.equals(this.type, createMessageV2Req.type) &&
            Objects.equals(this.groupId, createMessageV2Req.groupId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(message, type, groupId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageV2Req {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

