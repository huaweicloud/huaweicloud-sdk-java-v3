package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class AgencyShowResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain_id")

    private String trustDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain_name")

    private String trustDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_urn")

    private String agencyUrn;

    public AgencyShowResult withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 委托创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public AgencyShowResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 委托描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AgencyShowResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 委托方账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AgencyShowResult withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 委托的期限。取值为\"FOREVER\"或“null”表示委托的期限为永久，取值为24表示委托的期限为一天，或为24小时。
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public AgencyShowResult withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 委托过期时间。“null”表示不过期。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public AgencyShowResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 委托ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AgencyShowResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 委托名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgencyShowResult withTrustDomainId(String trustDomainId) {
        this.trustDomainId = trustDomainId;
        return this;
    }

    /**
     * 被委托方账号ID。
     * @return trustDomainId
     */
    public String getTrustDomainId() {
        return trustDomainId;
    }

    public void setTrustDomainId(String trustDomainId) {
        this.trustDomainId = trustDomainId;
    }

    public AgencyShowResult withTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
        return this;
    }

    /**
     * 被委托方账号名。
     * @return trustDomainName
     */
    public String getTrustDomainName() {
        return trustDomainName;
    }

    public void setTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
    }

    public AgencyShowResult withAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
        return this;
    }

    /**
     * 委托URN。
     * @return agencyUrn
     */
    public String getAgencyUrn() {
        return agencyUrn;
    }

    public void setAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgencyShowResult that = (AgencyShowResult) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.trustDomainId, that.trustDomainId)
            && Objects.equals(this.trustDomainName, that.trustDomainName)
            && Objects.equals(this.agencyUrn, that.agencyUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            description,
            domainId,
            duration,
            expireTime,
            id,
            name,
            trustDomainId,
            trustDomainName,
            agencyUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyShowResult {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    trustDomainId: ").append(toIndentedString(trustDomainId)).append("\n");
        sb.append("    trustDomainName: ").append(toIndentedString(trustDomainName)).append("\n");
        sb.append("    agencyUrn: ").append(toIndentedString(agencyUrn)).append("\n");
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
