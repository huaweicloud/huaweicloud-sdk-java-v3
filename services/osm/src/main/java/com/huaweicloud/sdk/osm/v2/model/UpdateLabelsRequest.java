package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.UpdateLabelsReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateLabelsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label_id")
    
    private Integer labelId;


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
    
    private UpdateLabelsReq body;

    public UpdateLabelsRequest withLabelId(Integer labelId) {
        this.labelId = labelId;
        return this;
    }

    


    /**
     * Get labelId
     * minimum: 0
     * maximum: 65535
     * @return labelId
     */
    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    

    public UpdateLabelsRequest withXSite(Integer xSite) {
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

    

    public UpdateLabelsRequest withXLanguage(String xLanguage) {
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

    

    public UpdateLabelsRequest withXTimeZone(String xTimeZone) {
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

    

    public UpdateLabelsRequest withBody(UpdateLabelsReq body) {
        this.body = body;
        return this;
    }

    public UpdateLabelsRequest withBody(Consumer<UpdateLabelsReq> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateLabelsReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateLabelsReq getBody() {
        return body;
    }

    public void setBody(UpdateLabelsReq body) {
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
        UpdateLabelsRequest updateLabelsRequest = (UpdateLabelsRequest) o;
        return Objects.equals(this.labelId, updateLabelsRequest.labelId) &&
            Objects.equals(this.xSite, updateLabelsRequest.xSite) &&
            Objects.equals(this.xLanguage, updateLabelsRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, updateLabelsRequest.xTimeZone) &&
            Objects.equals(this.body, updateLabelsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(labelId, xSite, xLanguage, xTimeZone, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLabelsRequest {\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
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

