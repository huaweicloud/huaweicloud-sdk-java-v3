package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.UpdateUnreadNewInstantMsgV2Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateNewInstantMessagesReadRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="case_id")
    
    private String caseId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    
    private Integer xSite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    
    private String xTimeZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateUnreadNewInstantMsgV2Req body = null;

    public UpdateNewInstantMessagesReadRequest withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    


    /**
     * Get caseId
     * @return caseId
     */
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public UpdateNewInstantMessagesReadRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    


    /**
     * Get xSite
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    public UpdateNewInstantMessagesReadRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public UpdateNewInstantMessagesReadRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    


    /**
     * Get xTimeZone
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }

    public UpdateNewInstantMessagesReadRequest withBody(UpdateUnreadNewInstantMsgV2Req body) {
        this.body = body;
        return this;
    }

    public UpdateNewInstantMessagesReadRequest withBody(Consumer<UpdateUnreadNewInstantMsgV2Req> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateUnreadNewInstantMsgV2Req();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateUnreadNewInstantMsgV2Req getBody() {
        return body;
    }

    public void setBody(UpdateUnreadNewInstantMsgV2Req body) {
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
        UpdateNewInstantMessagesReadRequest updateNewInstantMessagesReadRequest = (UpdateNewInstantMessagesReadRequest) o;
        return Objects.equals(this.caseId, updateNewInstantMessagesReadRequest.caseId) &&
            Objects.equals(this.xSite, updateNewInstantMessagesReadRequest.xSite) &&
            Objects.equals(this.xLanguage, updateNewInstantMessagesReadRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, updateNewInstantMessagesReadRequest.xTimeZone) &&
            Objects.equals(this.body, updateNewInstantMessagesReadRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(caseId, xSite, xLanguage, xTimeZone, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNewInstantMessagesReadRequest {\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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

