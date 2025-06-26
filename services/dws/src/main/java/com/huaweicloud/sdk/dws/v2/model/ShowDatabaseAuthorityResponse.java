package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDatabaseAuthorityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorities")

    private List<ObjectAuthority> authorities = null;

    public ShowDatabaseAuthorityResponse withAuthorities(List<ObjectAuthority> authorities) {
        this.authorities = authorities;
        return this;
    }

    public ShowDatabaseAuthorityResponse addAuthoritiesItem(ObjectAuthority authoritiesItem) {
        if (this.authorities == null) {
            this.authorities = new ArrayList<>();
        }
        this.authorities.add(authoritiesItem);
        return this;
    }

    public ShowDatabaseAuthorityResponse withAuthorities(Consumer<List<ObjectAuthority>> authoritiesSetter) {
        if (this.authorities == null) {
            this.authorities = new ArrayList<>();
        }
        authoritiesSetter.accept(this.authorities);
        return this;
    }

    /**
     * **参数解释**： 对象权限集合。 **取值范围**： 不涉及。
     * @return authorities
     */
    public List<ObjectAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<ObjectAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDatabaseAuthorityResponse that = (ShowDatabaseAuthorityResponse) obj;
        return Objects.equals(this.authorities, that.authorities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatabaseAuthorityResponse {\n");
        sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
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
