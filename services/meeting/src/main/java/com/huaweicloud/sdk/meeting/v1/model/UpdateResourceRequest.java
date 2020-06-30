package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.ModResourceDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateResourceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
    
    private String xRequestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Accept-Language")
    
    private String acceptLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="corp_id")
    
    private String corpId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="forceEditFlag")
    
    private Boolean forceEditFlag = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private List<ModResourceDTO> body = null;
    
    public UpdateResourceRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public UpdateResourceRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    


    /**
     * Get acceptLanguage
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public UpdateResourceRequest withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    


    /**
     * Get corpId
     * @return corpId
     */
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public UpdateResourceRequest withForceEditFlag(Boolean forceEditFlag) {
        this.forceEditFlag = forceEditFlag;
        return this;
    }

    


    /**
     * Get forceEditFlag
     * @return forceEditFlag
     */
    public Boolean getForceEditFlag() {
        return forceEditFlag;
    }

    public void setForceEditFlag(Boolean forceEditFlag) {
        this.forceEditFlag = forceEditFlag;
    }

    public UpdateResourceRequest withBody(List<ModResourceDTO> body) {
        this.body = body;
        return this;
    }

    
    public UpdateResourceRequest addBodyItem(ModResourceDTO bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public UpdateResourceRequest withBody(Consumer<List<ModResourceDTO>> bodySetter) {
        if(this.body == null ){
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * 待修改的资源列表，最多支持批量处理100个
     * @return body
     */
    public List<ModResourceDTO> getBody() {
        return body;
    }

    public void setBody(List<ModResourceDTO> body) {
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
        UpdateResourceRequest updateResourceRequest = (UpdateResourceRequest) o;
        return Objects.equals(this.xRequestId, updateResourceRequest.xRequestId) &&
            Objects.equals(this.acceptLanguage, updateResourceRequest.acceptLanguage) &&
            Objects.equals(this.corpId, updateResourceRequest.corpId) &&
            Objects.equals(this.forceEditFlag, updateResourceRequest.forceEditFlag) &&
            Objects.equals(this.body, updateResourceRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRequestId, acceptLanguage, corpId, forceEditFlag, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResourceRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    forceEditFlag: ").append(toIndentedString(forceEditFlag)).append("\n");
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

