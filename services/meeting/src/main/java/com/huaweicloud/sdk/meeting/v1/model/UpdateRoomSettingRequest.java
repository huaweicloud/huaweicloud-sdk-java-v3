package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.OpenRoomSettingReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateRoomSettingRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
    
    private String xRequestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Accept-Language")
    
    private String acceptLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conference_id")
    
    private String conferenceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private OpenRoomSettingReq body;

    public UpdateRoomSettingRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * 请求requestId，用来标识一路请求，用于问题跟踪定位，建议使用uuId，若不携带，则后台自动生成
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    

    public UpdateRoomSettingRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    


    /**
     * 语言参数，默认为中文zh_CN, 英文为en_US
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    

    public UpdateRoomSettingRequest withConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    


    /**
     * 会议ID
     * @return conferenceId
     */
    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    

    public UpdateRoomSettingRequest withBody(OpenRoomSettingReq body) {
        this.body = body;
        return this;
    }

    public UpdateRoomSettingRequest withBody(Consumer<OpenRoomSettingReq> bodySetter) {
        if(this.body == null ){
            this.body = new OpenRoomSettingReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public OpenRoomSettingReq getBody() {
        return body;
    }

    public void setBody(OpenRoomSettingReq body) {
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
        UpdateRoomSettingRequest updateRoomSettingRequest = (UpdateRoomSettingRequest) o;
        return Objects.equals(this.xRequestId, updateRoomSettingRequest.xRequestId) &&
            Objects.equals(this.acceptLanguage, updateRoomSettingRequest.acceptLanguage) &&
            Objects.equals(this.conferenceId, updateRoomSettingRequest.conferenceId) &&
            Objects.equals(this.body, updateRoomSettingRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRequestId, acceptLanguage, conferenceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoomSettingRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
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

