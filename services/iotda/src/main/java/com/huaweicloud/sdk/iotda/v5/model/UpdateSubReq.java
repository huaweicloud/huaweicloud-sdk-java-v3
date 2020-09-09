package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改订阅主题请求结构体
 */
public class UpdateSubReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="callbackurl")
    
    private String callbackurl;

    public UpdateSubReq withCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
        return this;
    }

    


    /**
     * 订阅的回调地址，用于接收对应资源事件的通知消息，例如：https://10.10.10.10:443/callbackurltest。
     * @return callbackurl
     */
    public String getCallbackurl() {
        return callbackurl;
    }

    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSubReq updateSubReq = (UpdateSubReq) o;
        return Objects.equals(this.callbackurl, updateSubReq.callbackurl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(callbackurl);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubReq {\n");
        sb.append("    callbackurl: ").append(toIndentedString(callbackurl)).append("\n");
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

