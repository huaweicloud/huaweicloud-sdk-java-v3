package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowApiVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    @JacksonXmlProperty(localName = "version")

    private ApiVersion version;

    public ShowApiVersionResponse withVersion(ApiVersion version) {
        this.version = version;
        return this;
    }

    public ShowApiVersionResponse withVersion(Consumer<ApiVersion> versionSetter) {
        if (this.version == null) {
            this.version = new ApiVersion();
            versionSetter.accept(this.version);
        }

        return this;
    }

    /**
     * Get version
     * @return version
     */
    public ApiVersion getVersion() {
        return version;
    }

    public void setVersion(ApiVersion version) {
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
        ShowApiVersionResponse showApiVersionResponse = (ShowApiVersionResponse) o;
        return Objects.equals(this.version, showApiVersionResponse.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApiVersionResponse {\n");
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
