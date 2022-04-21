package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateSecretVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_metadata")

    private VersionMetadata versionMetadata;

    public CreateSecretVersionResponse withVersionMetadata(VersionMetadata versionMetadata) {
        this.versionMetadata = versionMetadata;
        return this;
    }

    public CreateSecretVersionResponse withVersionMetadata(Consumer<VersionMetadata> versionMetadataSetter) {
        if (this.versionMetadata == null) {
            this.versionMetadata = new VersionMetadata();
            versionMetadataSetter.accept(this.versionMetadata);
        }

        return this;
    }

    /**
     * Get versionMetadata
     * @return versionMetadata
     */
    public VersionMetadata getVersionMetadata() {
        return versionMetadata;
    }

    public void setVersionMetadata(VersionMetadata versionMetadata) {
        this.versionMetadata = versionMetadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSecretVersionResponse createSecretVersionResponse = (CreateSecretVersionResponse) o;
        return Objects.equals(this.versionMetadata, createSecretVersionResponse.versionMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecretVersionResponse {\n");
        sb.append("    versionMetadata: ").append(toIndentedString(versionMetadata)).append("\n");
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
