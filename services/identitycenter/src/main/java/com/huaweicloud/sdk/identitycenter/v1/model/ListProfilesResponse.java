package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class ListProfilesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationProfiles")

    private List<ApplicationProfileDto> applicationProfiles = null;

    public ListProfilesResponse withApplicationProfiles(List<ApplicationProfileDto> applicationProfiles) {
        this.applicationProfiles = applicationProfiles;
        return this;
    }

    public ListProfilesResponse addApplicationProfilesItem(ApplicationProfileDto applicationProfilesItem) {
        if (this.applicationProfiles == null) {
            this.applicationProfiles = new ArrayList<>();
        }
        this.applicationProfiles.add(applicationProfilesItem);
        return this;
    }

    public ListProfilesResponse withApplicationProfiles(
        Consumer<List<ApplicationProfileDto>> applicationProfilesSetter) {
        if (this.applicationProfiles == null) {
            this.applicationProfiles = new ArrayList<>();
        }
        applicationProfilesSetter.accept(this.applicationProfiles);
        return this;
    }

    /**
     * 应用程序Profile
     * @return applicationProfiles
     */
    public List<ApplicationProfileDto> getApplicationProfiles() {
        return applicationProfiles;
    }

    public void setApplicationProfiles(List<ApplicationProfileDto> applicationProfiles) {
        this.applicationProfiles = applicationProfiles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProfilesResponse that = (ListProfilesResponse) obj;
        return Objects.equals(this.applicationProfiles, that.applicationProfiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationProfiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProfilesResponse {\n");
        sb.append("    applicationProfiles: ").append(toIndentedString(applicationProfiles)).append("\n");
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
