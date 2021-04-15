package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCaseLabelsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="case_id")
    
    private String caseId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label_ids")
    
    private List<Integer> labelIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    
    private Integer xSite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    
    private String xTimeZone;

    public DeleteCaseLabelsRequest withCaseId(String caseId) {
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

    

    public DeleteCaseLabelsRequest withLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
        return this;
    }

    
    public DeleteCaseLabelsRequest addLabelIdsItem(Integer labelIdsItem) {
        if(this.labelIds == null) {
            this.labelIds = new ArrayList<>();
        }
        this.labelIds.add(labelIdsItem);
        return this;
    }

    public DeleteCaseLabelsRequest withLabelIds(Consumer<List<Integer>> labelIdsSetter) {
        if(this.labelIds == null) {
            this.labelIds = new ArrayList<>();
        }
        labelIdsSetter.accept(this.labelIds);
        return this;
    }

    /**
     * Get labelIds
     * @return labelIds
     */
    public List<Integer> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
    }

    

    public DeleteCaseLabelsRequest withXSite(Integer xSite) {
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

    

    public DeleteCaseLabelsRequest withXLanguage(String xLanguage) {
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

    

    public DeleteCaseLabelsRequest withXTimeZone(String xTimeZone) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteCaseLabelsRequest deleteCaseLabelsRequest = (DeleteCaseLabelsRequest) o;
        return Objects.equals(this.caseId, deleteCaseLabelsRequest.caseId) &&
            Objects.equals(this.labelIds, deleteCaseLabelsRequest.labelIds) &&
            Objects.equals(this.xSite, deleteCaseLabelsRequest.xSite) &&
            Objects.equals(this.xLanguage, deleteCaseLabelsRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, deleteCaseLabelsRequest.xTimeZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(caseId, labelIds, xSite, xLanguage, xTimeZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCaseLabelsRequest {\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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

