package com.huaweicloud.sdk.identitycenterscim.v1.model;

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
public class ServiceProviderConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<String> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "documentationUri")

    private String documentationUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authenticationSchemes")

    private List<AuthenticationSchemeItemDto> authenticationSchemes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch")

    private PatchDto patch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bulk")

    private BulkDto bulk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private FilterDto filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changePassword")

    private ChangePasswordDto changePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private SortDto sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "etag")

    private EtagDto etag;

    public ServiceProviderConfigResponse withSchemas(List<String> schemas) {
        this.schemas = schemas;
        return this;
    }

    public ServiceProviderConfigResponse addSchemasItem(String schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public ServiceProviderConfigResponse withSchemas(Consumer<List<String>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * 概要
     * @return schemas
     */
    public List<String> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    public ServiceProviderConfigResponse withDocumentationUri(String documentationUri) {
        this.documentationUri = documentationUri;
        return this;
    }

    /**
     * 帮助文档链接
     * @return documentationUri
     */
    public String getDocumentationUri() {
        return documentationUri;
    }

    public void setDocumentationUri(String documentationUri) {
        this.documentationUri = documentationUri;
    }

    public ServiceProviderConfigResponse withAuthenticationSchemes(
        List<AuthenticationSchemeItemDto> authenticationSchemes) {
        this.authenticationSchemes = authenticationSchemes;
        return this;
    }

    public ServiceProviderConfigResponse addAuthenticationSchemesItem(
        AuthenticationSchemeItemDto authenticationSchemesItem) {
        if (this.authenticationSchemes == null) {
            this.authenticationSchemes = new ArrayList<>();
        }
        this.authenticationSchemes.add(authenticationSchemesItem);
        return this;
    }

    public ServiceProviderConfigResponse withAuthenticationSchemes(
        Consumer<List<AuthenticationSchemeItemDto>> authenticationSchemesSetter) {
        if (this.authenticationSchemes == null) {
            this.authenticationSchemes = new ArrayList<>();
        }
        authenticationSchemesSetter.accept(this.authenticationSchemes);
        return this;
    }

    /**
     * 认证概要列表
     * @return authenticationSchemes
     */
    public List<AuthenticationSchemeItemDto> getAuthenticationSchemes() {
        return authenticationSchemes;
    }

    public void setAuthenticationSchemes(List<AuthenticationSchemeItemDto> authenticationSchemes) {
        this.authenticationSchemes = authenticationSchemes;
    }

    public ServiceProviderConfigResponse withPatch(PatchDto patch) {
        this.patch = patch;
        return this;
    }

    public ServiceProviderConfigResponse withPatch(Consumer<PatchDto> patchSetter) {
        if (this.patch == null) {
            this.patch = new PatchDto();
            patchSetter.accept(this.patch);
        }

        return this;
    }

    /**
     * Get patch
     * @return patch
     */
    public PatchDto getPatch() {
        return patch;
    }

    public void setPatch(PatchDto patch) {
        this.patch = patch;
    }

    public ServiceProviderConfigResponse withBulk(BulkDto bulk) {
        this.bulk = bulk;
        return this;
    }

    public ServiceProviderConfigResponse withBulk(Consumer<BulkDto> bulkSetter) {
        if (this.bulk == null) {
            this.bulk = new BulkDto();
            bulkSetter.accept(this.bulk);
        }

        return this;
    }

    /**
     * Get bulk
     * @return bulk
     */
    public BulkDto getBulk() {
        return bulk;
    }

    public void setBulk(BulkDto bulk) {
        this.bulk = bulk;
    }

    public ServiceProviderConfigResponse withFilter(FilterDto filter) {
        this.filter = filter;
        return this;
    }

    public ServiceProviderConfigResponse withFilter(Consumer<FilterDto> filterSetter) {
        if (this.filter == null) {
            this.filter = new FilterDto();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public FilterDto getFilter() {
        return filter;
    }

    public void setFilter(FilterDto filter) {
        this.filter = filter;
    }

    public ServiceProviderConfigResponse withChangePassword(ChangePasswordDto changePassword) {
        this.changePassword = changePassword;
        return this;
    }

    public ServiceProviderConfigResponse withChangePassword(Consumer<ChangePasswordDto> changePasswordSetter) {
        if (this.changePassword == null) {
            this.changePassword = new ChangePasswordDto();
            changePasswordSetter.accept(this.changePassword);
        }

        return this;
    }

    /**
     * Get changePassword
     * @return changePassword
     */
    public ChangePasswordDto getChangePassword() {
        return changePassword;
    }

    public void setChangePassword(ChangePasswordDto changePassword) {
        this.changePassword = changePassword;
    }

    public ServiceProviderConfigResponse withSort(SortDto sort) {
        this.sort = sort;
        return this;
    }

    public ServiceProviderConfigResponse withSort(Consumer<SortDto> sortSetter) {
        if (this.sort == null) {
            this.sort = new SortDto();
            sortSetter.accept(this.sort);
        }

        return this;
    }

    /**
     * Get sort
     * @return sort
     */
    public SortDto getSort() {
        return sort;
    }

    public void setSort(SortDto sort) {
        this.sort = sort;
    }

    public ServiceProviderConfigResponse withEtag(EtagDto etag) {
        this.etag = etag;
        return this;
    }

    public ServiceProviderConfigResponse withEtag(Consumer<EtagDto> etagSetter) {
        if (this.etag == null) {
            this.etag = new EtagDto();
            etagSetter.accept(this.etag);
        }

        return this;
    }

    /**
     * Get etag
     * @return etag
     */
    public EtagDto getEtag() {
        return etag;
    }

    public void setEtag(EtagDto etag) {
        this.etag = etag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceProviderConfigResponse that = (ServiceProviderConfigResponse) obj;
        return Objects.equals(this.schemas, that.schemas)
            && Objects.equals(this.documentationUri, that.documentationUri)
            && Objects.equals(this.authenticationSchemes, that.authenticationSchemes)
            && Objects.equals(this.patch, that.patch) && Objects.equals(this.bulk, that.bulk)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.changePassword, that.changePassword)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.etag, that.etag);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(schemas, documentationUri, authenticationSchemes, patch, bulk, filter, changePassword, sort, etag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceProviderConfigResponse {\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    documentationUri: ").append(toIndentedString(documentationUri)).append("\n");
        sb.append("    authenticationSchemes: ").append(toIndentedString(authenticationSchemes)).append("\n");
        sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
        sb.append("    bulk: ").append(toIndentedString(bulk)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    changePassword: ").append(toIndentedString(changePassword)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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
