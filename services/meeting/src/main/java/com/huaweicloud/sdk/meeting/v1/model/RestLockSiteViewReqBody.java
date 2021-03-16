package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 锁定会场视频源请求体
 */
public class RestLockSiteViewReqBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="participantID")
    
    private String participantID;

    public RestLockSiteViewReqBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * - 0: 取消锁定。 - 1: 锁定。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public RestLockSiteViewReqBody withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    


    /**
     * 被锁定视频源的与会者标识。
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestLockSiteViewReqBody restLockSiteViewReqBody = (RestLockSiteViewReqBody) o;
        return Objects.equals(this.status, restLockSiteViewReqBody.status) &&
            Objects.equals(this.participantID, restLockSiteViewReqBody.participantID);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, participantID);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestLockSiteViewReqBody {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
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

