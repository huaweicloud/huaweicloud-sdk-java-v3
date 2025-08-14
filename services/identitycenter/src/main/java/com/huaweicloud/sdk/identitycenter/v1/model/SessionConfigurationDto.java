package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * the struct of SessionConfiguration
 */
public class SessionConfigurationDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_authentication_age")

    private String maxAuthenticationAge;

    public SessionConfigurationDto withMaxAuthenticationAge(String maxAuthenticationAge) {
        this.maxAuthenticationAge = maxAuthenticationAge;
        return this;
    }

    /**
     * 会话生效时间
     * @return maxAuthenticationAge
     */
    public String getMaxAuthenticationAge() {
        return maxAuthenticationAge;
    }

    public void setMaxAuthenticationAge(String maxAuthenticationAge) {
        this.maxAuthenticationAge = maxAuthenticationAge;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionConfigurationDto that = (SessionConfigurationDto) obj;
        return Objects.equals(this.maxAuthenticationAge, that.maxAuthenticationAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxAuthenticationAge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionConfigurationDto {\n");
        sb.append("    maxAuthenticationAge: ").append(toIndentedString(maxAuthenticationAge)).append("\n");
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
