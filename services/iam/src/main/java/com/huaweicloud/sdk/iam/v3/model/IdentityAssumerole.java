package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AssumeroleSessionuser;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class IdentityAssumerole  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agency_name")
    
    private String agencyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration-seconds")
    
    private Integer durationSeconds = 900;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_user")
    
    private AssumeroleSessionuser sessionUser = null;

    public IdentityAssumerole withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    


    /**
     * 委托名。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public IdentityAssumerole withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 委托方的账号ID。“domain_id”与“domain_name”至少填写一个。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public IdentityAssumerole withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 委托方的账号名。“domain_id”与“domain_name”至少填写一个。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public IdentityAssumerole withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    


    /**
     * AK/SK和securitytoken的有效期，时间单位为秒。取值范围：15min ~ 24h ，默认为15min。
     * minimum: 900
     * maximum: 86400
     * @return durationSeconds
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public IdentityAssumerole withSessionUser(AssumeroleSessionuser sessionUser) {
        this.sessionUser = sessionUser;
        return this;
    }

    public IdentityAssumerole withSessionUser(Consumer<AssumeroleSessionuser> sessionUserSetter) {
        if(this.sessionUser == null ){
            this.sessionUser = new AssumeroleSessionuser();
        }
        sessionUserSetter.accept(this.sessionUser);
        return this;
    }


    /**
     * Get sessionUser
     * @return sessionUser
     */
    public AssumeroleSessionuser getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(AssumeroleSessionuser sessionUser) {
        this.sessionUser = sessionUser;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentityAssumerole identityAssumerole = (IdentityAssumerole) o;
        return Objects.equals(this.agencyName, identityAssumerole.agencyName) &&
            Objects.equals(this.domainId, identityAssumerole.domainId) &&
            Objects.equals(this.domainName, identityAssumerole.domainName) &&
            Objects.equals(this.durationSeconds, identityAssumerole.durationSeconds) &&
            Objects.equals(this.sessionUser, identityAssumerole.sessionUser);
    }
    @Override
    public int hashCode() {
        return Objects.hash(agencyName, domainId, domainName, durationSeconds, sessionUser);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityAssumerole {\n");
            sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
            sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
            sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
            sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
            sb.append("    sessionUser: ").append(toIndentedString(sessionUser)).append("\n");
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

