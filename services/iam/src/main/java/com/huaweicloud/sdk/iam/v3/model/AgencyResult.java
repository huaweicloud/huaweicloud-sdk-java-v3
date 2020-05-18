package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class AgencyResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private String duration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trust_domain_id")
    
    private String trustDomainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trust_domain_name")
    
    private String trustDomainName;

    public AgencyResult withCreateTime(String createTime) {
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

    public AgencyResult withDescription(String description) {
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

    public AgencyResult withDomainId(String domainId) {
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

    public AgencyResult withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 委托的期限。取值为\"FOREVER\"或“null”表示委托的期限为永久，取值为\"ONEDAY\"表示委托的期限为一天。
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public AgencyResult withExpireTime(String expireTime) {
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

    public AgencyResult withId(String id) {
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

    public AgencyResult withName(String name) {
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

    public AgencyResult withTrustDomainId(String trustDomainId) {
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

    public AgencyResult withTrustDomainName(String trustDomainName) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyResult agencyResult = (AgencyResult) o;
        return Objects.equals(this.createTime, agencyResult.createTime) &&
            Objects.equals(this.description, agencyResult.description) &&
            Objects.equals(this.domainId, agencyResult.domainId) &&
            Objects.equals(this.duration, agencyResult.duration) &&
            Objects.equals(this.expireTime, agencyResult.expireTime) &&
            Objects.equals(this.id, agencyResult.id) &&
            Objects.equals(this.name, agencyResult.name) &&
            Objects.equals(this.trustDomainId, agencyResult.trustDomainId) &&
            Objects.equals(this.trustDomainName, agencyResult.trustDomainName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(createTime, description, domainId, duration, expireTime, id, name, trustDomainId, trustDomainName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyResult {\n");
            sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
            sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
            sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    trustDomainId: ").append(toIndentedString(trustDomainId)).append("\n");
            sb.append("    trustDomainName: ").append(toIndentedString(trustDomainName)).append("\n");
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

