package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceDetail
 */
public class ResourceDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detailId")
    
    private String detailId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic_urn")
    
    private String topicUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    private String displayName;

    public ResourceDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ResourceDetail withDetailId(String detailId) {
        this.detailId = detailId;
        return this;
    }

    


    /**
     * 详情ID
     * @return detailId
     */
    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    

    public ResourceDetail withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    


    /**
     * topic唯一标识
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    

    public ResourceDetail withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * 显示名
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceDetail resourceDetail = (ResourceDetail) o;
        return Objects.equals(this.enterpriseProjectId, resourceDetail.enterpriseProjectId) &&
            Objects.equals(this.detailId, resourceDetail.detailId) &&
            Objects.equals(this.topicUrn, resourceDetail.topicUrn) &&
            Objects.equals(this.displayName, resourceDetail.displayName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, detailId, topicUrn, displayName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceDetail {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    detailId: ").append(toIndentedString(detailId)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

