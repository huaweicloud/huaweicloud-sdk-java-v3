package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.VerifyCertificateDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CheckCertificateRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Sp-Auth-Token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String spAuthToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Stage-Auth-Token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String stageAuthToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate_id")
    
    private String certificateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_id")
    
    private String actionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private VerifyCertificateDTO body = null;

    public CheckCertificateRequest withSpAuthToken(String spAuthToken) {
        this.spAuthToken = spAuthToken;
        return this;
    }

    


    /**
     * Get spAuthToken
     * @return spAuthToken
     */
    public String getSpAuthToken() {
        return spAuthToken;
    }

    public void setSpAuthToken(String spAuthToken) {
        this.spAuthToken = spAuthToken;
    }

    public CheckCertificateRequest withStageAuthToken(String stageAuthToken) {
        this.stageAuthToken = stageAuthToken;
        return this;
    }

    


    /**
     * Get stageAuthToken
     * @return stageAuthToken
     */
    public String getStageAuthToken() {
        return stageAuthToken;
    }

    public void setStageAuthToken(String stageAuthToken) {
        this.stageAuthToken = stageAuthToken;
    }

    public CheckCertificateRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CheckCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    


    /**
     * Get certificateId
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public CheckCertificateRequest withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    


    /**
     * Get actionId
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public CheckCertificateRequest withBody(VerifyCertificateDTO body) {
        this.body = body;
        return this;
    }

    public CheckCertificateRequest withBody(Consumer<VerifyCertificateDTO> bodySetter) {
        if(this.body == null ){
            this.body = new VerifyCertificateDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public VerifyCertificateDTO getBody() {
        return body;
    }

    public void setBody(VerifyCertificateDTO body) {
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
        CheckCertificateRequest checkCertificateRequest = (CheckCertificateRequest) o;
        return Objects.equals(this.spAuthToken, checkCertificateRequest.spAuthToken) &&
            Objects.equals(this.stageAuthToken, checkCertificateRequest.stageAuthToken) &&
            Objects.equals(this.instanceId, checkCertificateRequest.instanceId) &&
            Objects.equals(this.certificateId, checkCertificateRequest.certificateId) &&
            Objects.equals(this.actionId, checkCertificateRequest.actionId) &&
            Objects.equals(this.body, checkCertificateRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(spAuthToken, stageAuthToken, instanceId, certificateId, actionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckCertificateRequest {\n");
        sb.append("    spAuthToken: ").append(toIndentedString("******")).append("\n");
        sb.append("    stageAuthToken: ").append(toIndentedString("******")).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
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

