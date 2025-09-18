package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PublisherVO
 */
public class PublisherVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_unique_id")

    private String publisherUniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_status")

    private String authStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete")

    private Integer isDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_user_name")

    private String lastUpdateUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_user_id")

    private String lastUpdateUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private String lastUpdateTime;

    public PublisherVO withPublisherUniqueId(String publisherUniqueId) {
        this.publisherUniqueId = publisherUniqueId;
        return this;
    }

    /**
     * **参数解释**： 发布商ID。可通过[查询发布商详情](ShowPublisher.xml)查询。 **取值范围**： 不涉及。 
     * @return publisherUniqueId
     */
    public String getPublisherUniqueId() {
        return publisherUniqueId;
    }

    public void setPublisherUniqueId(String publisherUniqueId) {
        this.publisherUniqueId = publisherUniqueId;
    }

    public PublisherVO withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**： 用户ID。 **取值范围**： 不涉及。 
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PublisherVO withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释**： 租户ID。 **取值范围**： 不涉及。 
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public PublisherVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 发布商描述。 **取值范围**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublisherVO withLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * **参数解释**： 发布商图标URL。 **取值范围**： 不涉及。 
     * @return logoUrl
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public PublisherVO withWebsite(String website) {
        this.website = website;
        return this;
    }

    /**
     * **参数解释**： 创建发布商时填入的网页地址。 **取值范围**： 不涉及。 
     * @return website
     */
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public PublisherVO withSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
        return this;
    }

    /**
     * **参数解释**： 创建发布商时填入的帮助地址。 **取值范围**： 不涉及。 
     * @return supportUrl
     */
    public String getSupportUrl() {
        return supportUrl;
    }

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    public PublisherVO withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * **参数解释**： 创建发布商时填入的源地址。 **取值范围**： 不涉及。 
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public PublisherVO withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * **参数解释**： 发布商英文名。 **取值范围**： 不涉及。 
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public PublisherVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 发布商中文名。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublisherVO withAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }

    /**
     * **参数解释**： 授权状态。 **取值范围**： 不涉及。 
     * @return authStatus
     */
    public String getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    public PublisherVO withIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    /**
     * **参数解释**： 是否删除。 **取值范围**： - 0：未删除。 - 1：已删除。 
     * @return isDelete
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public PublisherVO withLastUpdateUserName(String lastUpdateUserName) {
        this.lastUpdateUserName = lastUpdateUserName;
        return this;
    }

    /**
     * **参数解释**： 最后更新人名称。 **取值范围**： 不涉及。 
     * @return lastUpdateUserName
     */
    public String getLastUpdateUserName() {
        return lastUpdateUserName;
    }

    public void setLastUpdateUserName(String lastUpdateUserName) {
        this.lastUpdateUserName = lastUpdateUserName;
    }

    public PublisherVO withLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    /**
     * **参数解释**： 最后更新人用户ID。 **取值范围**： 不涉及。 
     * @return lastUpdateUserId
     */
    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public PublisherVO withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * **参数解释**： 最后更新时间。 **取值范围**： 不涉及。 
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublisherVO that = (PublisherVO) obj;
        return Objects.equals(this.publisherUniqueId, that.publisherUniqueId)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.logoUrl, that.logoUrl)
            && Objects.equals(this.website, that.website) && Objects.equals(this.supportUrl, that.supportUrl)
            && Objects.equals(this.sourceUrl, that.sourceUrl) && Objects.equals(this.enName, that.enName)
            && Objects.equals(this.name, that.name) && Objects.equals(this.authStatus, that.authStatus)
            && Objects.equals(this.isDelete, that.isDelete)
            && Objects.equals(this.lastUpdateUserName, that.lastUpdateUserName)
            && Objects.equals(this.lastUpdateUserId, that.lastUpdateUserId)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherUniqueId,
            userId,
            tenantId,
            description,
            logoUrl,
            website,
            supportUrl,
            sourceUrl,
            enName,
            name,
            authStatus,
            isDelete,
            lastUpdateUserName,
            lastUpdateUserId,
            lastUpdateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublisherVO {\n");
        sb.append("    publisherUniqueId: ").append(toIndentedString(publisherUniqueId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
        sb.append("    website: ").append(toIndentedString(website)).append("\n");
        sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
        sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
        sb.append("    lastUpdateUserName: ").append(toIndentedString(lastUpdateUserName)).append("\n");
        sb.append("    lastUpdateUserId: ").append(toIndentedString(lastUpdateUserId)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
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
