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
public class ListNewInstantMessagesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="case_ids")
    
    private List<String> caseIds = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_message_time_id")
    
    private String lastMessageTimeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    
    private Integer xSite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    
    private String xTimeZone;

    public ListNewInstantMessagesRequest withCaseIds(List<String> caseIds) {
        this.caseIds = caseIds;
        return this;
    }

    
    public ListNewInstantMessagesRequest addCaseIdsItem(String caseIdsItem) {
        this.caseIds.add(caseIdsItem);
        return this;
    }

    public ListNewInstantMessagesRequest withCaseIds(Consumer<List<String>> caseIdsSetter) {
        if(this.caseIds == null ){
            this.caseIds = new ArrayList<>();
        }
        caseIdsSetter.accept(this.caseIds);
        return this;
    }

    /**
     * Get caseIds
     * @return caseIds
     */
    public List<String> getCaseIds() {
        return caseIds;
    }

    public void setCaseIds(List<String> caseIds) {
        this.caseIds = caseIds;
    }

    public ListNewInstantMessagesRequest withLastMessageTimeId(String lastMessageTimeId) {
        this.lastMessageTimeId = lastMessageTimeId;
        return this;
    }

    


    /**
     * Get lastMessageTimeId
     * @return lastMessageTimeId
     */
    public String getLastMessageTimeId() {
        return lastMessageTimeId;
    }

    public void setLastMessageTimeId(String lastMessageTimeId) {
        this.lastMessageTimeId = lastMessageTimeId;
    }

    public ListNewInstantMessagesRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * Get groupId
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListNewInstantMessagesRequest withXSite(Integer xSite) {
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

    public ListNewInstantMessagesRequest withXLanguage(String xLanguage) {
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

    public ListNewInstantMessagesRequest withXTimeZone(String xTimeZone) {
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
        ListNewInstantMessagesRequest listNewInstantMessagesRequest = (ListNewInstantMessagesRequest) o;
        return Objects.equals(this.caseIds, listNewInstantMessagesRequest.caseIds) &&
            Objects.equals(this.lastMessageTimeId, listNewInstantMessagesRequest.lastMessageTimeId) &&
            Objects.equals(this.groupId, listNewInstantMessagesRequest.groupId) &&
            Objects.equals(this.xSite, listNewInstantMessagesRequest.xSite) &&
            Objects.equals(this.xLanguage, listNewInstantMessagesRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, listNewInstantMessagesRequest.xTimeZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(caseIds, lastMessageTimeId, groupId, xSite, xLanguage, xTimeZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNewInstantMessagesRequest {\n");
        sb.append("    caseIds: ").append(toIndentedString(caseIds)).append("\n");
        sb.append("    lastMessageTimeId: ").append(toIndentedString(lastMessageTimeId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

