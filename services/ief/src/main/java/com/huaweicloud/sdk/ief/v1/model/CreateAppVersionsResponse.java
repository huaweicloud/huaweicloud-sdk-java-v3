package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAppVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    @JacksonXmlProperty(localName = "version")

    private AppVersionDetail version;

    public CreateAppVersionsResponse withVersion(AppVersionDetail version) {
        this.version = version;
        return this;
    }

    public CreateAppVersionsResponse withVersion(Consumer<AppVersionDetail> versionSetter) {
        if (this.version == null) {
            this.version = new AppVersionDetail();
            versionSetter.accept(this.version);
        }

        return this;
    }

    /**
     * Get version
     * @return version
     */
    public AppVersionDetail getVersion() {
        return version;
    }

    public void setVersion(AppVersionDetail version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAppVersionsResponse createAppVersionsResponse = (CreateAppVersionsResponse) o;
        return Objects.equals(this.version, createAppVersionsResponse.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppVersionsResponse {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
