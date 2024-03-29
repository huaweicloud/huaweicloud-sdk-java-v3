package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateDomainReq
 */
public class CreateDomainReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private ApiVersionObj apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private DomainKindObj kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private CreateMetaDomain metadata;

    public CreateDomainReq withApiVersion(ApiVersionObj apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get apiVersion
     * @return apiVersion
     */
    public ApiVersionObj getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(ApiVersionObj apiVersion) {
        this.apiVersion = apiVersion;
    }

    public CreateDomainReq withKind(DomainKindObj kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get kind
     * @return kind
     */
    public DomainKindObj getKind() {
        return kind;
    }

    public void setKind(DomainKindObj kind) {
        this.kind = kind;
    }

    public CreateDomainReq withMetadata(CreateMetaDomain metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateDomainReq withMetadata(Consumer<CreateMetaDomain> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new CreateMetaDomain();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public CreateMetaDomain getMetadata() {
        return metadata;
    }

    public void setMetadata(CreateMetaDomain metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDomainReq that = (CreateDomainReq) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDomainReq {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
