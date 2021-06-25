package com.huaweicloud.sdk.lts.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogGroupParams;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateLogGroupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_group_id")
    
    private String logGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateLogGroupParams body;

    public UpdateLogGroupRequest withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    


    /**
     * 日志组ID，获取方式请参见：获取账号ID、项目ID、日志组ID、日志流ID（https://support.huaweicloud.com/api-lts/lts_api_0006.html）
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    

    public UpdateLogGroupRequest withBody(UpdateLogGroupParams body) {
        this.body = body;
        return this;
    }

    public UpdateLogGroupRequest withBody(Consumer<UpdateLogGroupParams> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateLogGroupParams();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateLogGroupParams getBody() {
        return body;
    }

    public void setBody(UpdateLogGroupParams body) {
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
        UpdateLogGroupRequest updateLogGroupRequest = (UpdateLogGroupRequest) o;
        return Objects.equals(this.logGroupId, updateLogGroupRequest.logGroupId) &&
            Objects.equals(this.body, updateLogGroupRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(logGroupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogGroupRequest {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
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

