package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class IdentityToken {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_seconds")

    private Integer durationSeconds;

    public IdentityToken withId(String id) {
        this.id = id;
        return this;
    }

    /** token的ID。与请求头中的X-Auth-Token含义相同，待废弃。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IdentityToken withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /** AK/SK和securitytoken的有效期，时间单位为秒。取值范围：15min ~ 24h ，默认为15min。 minimum: 900 maximum: 86400
     * 
     * @return durationSeconds */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentityToken identityToken = (IdentityToken) o;
        return Objects.equals(this.id, identityToken.id)
            && Objects.equals(this.durationSeconds, identityToken.durationSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, durationSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityToken {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
