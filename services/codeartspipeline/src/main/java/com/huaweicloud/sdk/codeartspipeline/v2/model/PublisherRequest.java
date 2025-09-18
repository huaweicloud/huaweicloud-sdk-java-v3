package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PublisherRequest
 */
public class PublisherRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_url")

    private String logoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "website")

    private String website;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_url")

    private String supportUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_url")

    private String sourceUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_name")

    private String enName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_unique_id")

    private String publisherUniqueId;

    public PublisherRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 发布商名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublisherRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**： 用户ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PublisherRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 发布商描述。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublisherRequest withLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * **参数解释**： 发布商图标URL。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return logoUrl
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public PublisherRequest withWebsite(String website) {
        this.website = website;
        return this;
    }

    /**
     * **参数解释**： 发布商网页地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return website
     */
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public PublisherRequest withSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
        return this;
    }

    /**
     * **参数解释**： 发布商帮助地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return supportUrl
     */
    public String getSupportUrl() {
        return supportUrl;
    }

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    public PublisherRequest withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * **参数解释**： 发布商源码地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public PublisherRequest withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * **参数解释**： 发布商英文名。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public PublisherRequest withPublisherUniqueId(String publisherUniqueId) {
        this.publisherUniqueId = publisherUniqueId;
        return this;
    }

    /**
     * **参数解释**： 发布商ID。可通过[查询发布商详情](ShowPublisher.xml)查询。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return publisherUniqueId
     */
    public String getPublisherUniqueId() {
        return publisherUniqueId;
    }

    public void setPublisherUniqueId(String publisherUniqueId) {
        this.publisherUniqueId = publisherUniqueId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublisherRequest that = (PublisherRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.logoUrl, that.logoUrl)
            && Objects.equals(this.website, that.website) && Objects.equals(this.supportUrl, that.supportUrl)
            && Objects.equals(this.sourceUrl, that.sourceUrl) && Objects.equals(this.enName, that.enName)
            && Objects.equals(this.publisherUniqueId, that.publisherUniqueId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, userId, description, logoUrl, website, supportUrl, sourceUrl, enName, publisherUniqueId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublisherRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
        sb.append("    website: ").append(toIndentedString(website)).append("\n");
        sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
        sb.append("    publisherUniqueId: ").append(toIndentedString(publisherUniqueId)).append("\n");
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
