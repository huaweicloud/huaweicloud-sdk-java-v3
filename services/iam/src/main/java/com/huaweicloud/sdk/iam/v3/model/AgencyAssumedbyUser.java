package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AgencyAssumedbyUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    @JacksonXmlProperty(localName = "domain")

    private AgencyAssumedbyUserDomain domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_expires_at")

    @JacksonXmlProperty(localName = "password_expires_at")

    private String passwordExpiresAt;

    public AgencyAssumedbyUser withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 被委托方B中IAM用户的用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgencyAssumedbyUser withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 被委托方B中IAM用户的用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AgencyAssumedbyUser withDomain(AgencyAssumedbyUserDomain domain) {
        this.domain = domain;
        return this;
    }

    public AgencyAssumedbyUser withDomain(Consumer<AgencyAssumedbyUserDomain> domainSetter) {
        if (this.domain == null) {
            this.domain = new AgencyAssumedbyUserDomain();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public AgencyAssumedbyUserDomain getDomain() {
        return domain;
    }

    public void setDomain(AgencyAssumedbyUserDomain domain) {
        this.domain = domain;
    }

    public AgencyAssumedbyUser withPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
        return this;
    }

    /**
     * 被委托方B中IAM用户的密码过期时间（UTC时间），“”表示密码不过期。
     * @return passwordExpiresAt
     */
    public String getPasswordExpiresAt() {
        return passwordExpiresAt;
    }

    public void setPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyAssumedbyUser agencyAssumedbyUser = (AgencyAssumedbyUser) o;
        return Objects.equals(this.name, agencyAssumedbyUser.name) && Objects.equals(this.id, agencyAssumedbyUser.id)
            && Objects.equals(this.domain, agencyAssumedbyUser.domain)
            && Objects.equals(this.passwordExpiresAt, agencyAssumedbyUser.passwordExpiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, domain, passwordExpiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyAssumedbyUser {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    passwordExpiresAt: ").append(toIndentedString(passwordExpiresAt)).append("\n");
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
