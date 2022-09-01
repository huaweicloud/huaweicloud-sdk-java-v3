package com.huaweicloud.sdk.css.v1.model;

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
public class ListFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    @JacksonXmlProperty(localName = "versions")

    private List<EsflavorsVersionsResp> versions = null;

    public ListFlavorsResponse withVersions(List<EsflavorsVersionsResp> versions) {
        this.versions = versions;
        return this;
    }

    public ListFlavorsResponse addVersionsItem(EsflavorsVersionsResp versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ListFlavorsResponse withVersions(Consumer<List<EsflavorsVersionsResp>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 引擎版本列表。
     * @return versions
     */
    public List<EsflavorsVersionsResp> getVersions() {
        return versions;
    }

    public void setVersions(List<EsflavorsVersionsResp> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlavorsResponse listFlavorsResponse = (ListFlavorsResponse) o;
        return Objects.equals(this.versions, listFlavorsResponse.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsResponse {\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
