package com.huaweicloud.sdk.rds.v3.model;

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
public class ListReplicationProfilesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profiles")

    private List<ListReplicationProfilesResult> profiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListReplicationProfilesResponse withProfiles(List<ListReplicationProfilesResult> profiles) {
        this.profiles = profiles;
        return this;
    }

    public ListReplicationProfilesResponse addProfilesItem(ListReplicationProfilesResult profilesItem) {
        if (this.profiles == null) {
            this.profiles = new ArrayList<>();
        }
        this.profiles.add(profilesItem);
        return this;
    }

    public ListReplicationProfilesResponse withProfiles(Consumer<List<ListReplicationProfilesResult>> profilesSetter) {
        if (this.profiles == null) {
            this.profiles = new ArrayList<>();
        }
        profilesSetter.accept(this.profiles);
        return this;
    }

    /**
     * 配置文件列表。
     * @return profiles
     */
    public List<ListReplicationProfilesResult> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<ListReplicationProfilesResult> profiles) {
        this.profiles = profiles;
    }

    public ListReplicationProfilesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 配置文件总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReplicationProfilesResponse that = (ListReplicationProfilesResponse) obj;
        return Objects.equals(this.profiles, that.profiles) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReplicationProfilesResponse {\n");
        sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
