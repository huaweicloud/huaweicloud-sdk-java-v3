package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListSecurityProfilesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_profiles")

    private List<SecurityProfileDTO> securityProfiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListSecurityProfilesResponse withSecurityProfiles(List<SecurityProfileDTO> securityProfiles) {
        this.securityProfiles = securityProfiles;
        return this;
    }

    public ListSecurityProfilesResponse addSecurityProfilesItem(SecurityProfileDTO securityProfilesItem) {
        if (this.securityProfiles == null) {
            this.securityProfiles = new ArrayList<>();
        }
        this.securityProfiles.add(securityProfilesItem);
        return this;
    }

    public ListSecurityProfilesResponse withSecurityProfiles(
        Consumer<List<SecurityProfileDTO>> securityProfilesSetter) {
        if (this.securityProfiles == null) {
            this.securityProfiles = new ArrayList<>();
        }
        securityProfilesSetter.accept(this.securityProfiles);
        return this;
    }

    /**
     * 安全态势感知配置信息列表。
     * @return securityProfiles
     */
    public List<SecurityProfileDTO> getSecurityProfiles() {
        return securityProfiles;
    }

    public void setSecurityProfiles(List<SecurityProfileDTO> securityProfiles) {
        this.securityProfiles = securityProfiles;
    }

    public ListSecurityProfilesResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListSecurityProfilesResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityProfilesResponse that = (ListSecurityProfilesResponse) obj;
        return Objects.equals(this.securityProfiles, that.securityProfiles) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityProfiles, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityProfilesResponse {\n");
        sb.append("    securityProfiles: ").append(toIndentedString(securityProfiles)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
