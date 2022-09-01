package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAppVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    @JacksonXmlProperty(localName = "versions")

    private List<AppVersionDetail> versions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    public ListAppVersionsResponse withVersions(List<AppVersionDetail> versions) {
        this.versions = versions;
        return this;
    }

    public ListAppVersionsResponse addVersionsItem(AppVersionDetail versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ListAppVersionsResponse withVersions(Consumer<List<AppVersionDetail>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * app详情
     * @return versions
     */
    public List<AppVersionDetail> getVersions() {
        return versions;
    }

    public void setVersions(List<AppVersionDetail> versions) {
        this.versions = versions;
    }

    public ListAppVersionsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 满足条件的应用版本个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppVersionsResponse listAppVersionsResponse = (ListAppVersionsResponse) o;
        return Objects.equals(this.versions, listAppVersionsResponse.versions)
            && Objects.equals(this.count, listAppVersionsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versions, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppVersionsResponse {\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
