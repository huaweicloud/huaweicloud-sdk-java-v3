package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class CreateAgencyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain_id")

    private String trustDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain_name")

    private String trustDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Object duration;

    public CreateAgencyOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 委托名，长度不大于64位。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAgencyOption withDomainId(String domainId) {
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

    public CreateAgencyOption withTrustDomainId(String trustDomainId) {
        this.trustDomainId = trustDomainId;
        return this;
    }

    /**
     * 被委托方账号ID。trust_domain_id和trust_domain_name至少填写一个，若都填写优先校验trust_domain_name。
     * @return trustDomainId
     */
    public String getTrustDomainId() {
        return trustDomainId;
    }

    public void setTrustDomainId(String trustDomainId) {
        this.trustDomainId = trustDomainId;
    }

    public CreateAgencyOption withTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
        return this;
    }

    /**
     * 被委托方账号名。trust_domain_id和trust_domain_name至少填写一个，若都填写优先校验trust_domain_name。
     * @return trustDomainName
     */
    public String getTrustDomainName() {
        return trustDomainName;
    }

    public void setTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
    }

    public CreateAgencyOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 委托描述信息，长度不大于255位。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAgencyOption withDuration(Object duration) {
        this.duration = duration;
        return this;
    }

    /**
     * description: 委托的期限，单位为“天”。默认为FOREVER。取值为“FOREVER\"表示委托的期限为永久，取值为\"ONEDAY\"表示委托的期限为一天,取值为自定义天数表示委托的期限为有限天数，如20。四个参数至少填写一个。
     * @return duration
     */
    public Object getDuration() {
        return duration;
    }

    public void setDuration(Object duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAgencyOption that = (CreateAgencyOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.trustDomainId, that.trustDomainId)
            && Objects.equals(this.trustDomainName, that.trustDomainName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, domainId, trustDomainId, trustDomainName, description, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgencyOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    trustDomainId: ").append(toIndentedString(trustDomainId)).append("\n");
        sb.append("    trustDomainName: ").append(toIndentedString(trustDomainName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
