package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class TagSatisfactionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_time")
    
    
    private String updatedTime;

    public TagSatisfactionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 调用成功时的返回请求ID。  调用失败时无此字段。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    

    public TagSatisfactionResponse withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    


    /**
     * 反馈满意度的时间。格式为“yyyy-MM-dd THH:mm:ssZ”。其中，T指某个时间的开始；Z指UTC时间。  调用失败时无此字段。
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagSatisfactionResponse tagSatisfactionResponse = (TagSatisfactionResponse) o;
        return Objects.equals(this.requestId, tagSatisfactionResponse.requestId) &&
            Objects.equals(this.updatedTime, tagSatisfactionResponse.updatedTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, updatedTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagSatisfactionResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

