package com.huaweicloud.sdk.iam.v3.model;

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
public class KeystoneShowCatalogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog")

    @JacksonXmlProperty(localName = "catalog")

    private List<Catalog> catalog = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    @JacksonXmlProperty(localName = "links")

    private LinksSelf links;

    public KeystoneShowCatalogResponse withCatalog(List<Catalog> catalog) {
        this.catalog = catalog;
        return this;
    }

    public KeystoneShowCatalogResponse addCatalogItem(Catalog catalogItem) {
        if (this.catalog == null) {
            this.catalog = new ArrayList<>();
        }
        this.catalog.add(catalogItem);
        return this;
    }

    public KeystoneShowCatalogResponse withCatalog(Consumer<List<Catalog>> catalogSetter) {
        if (this.catalog == null) {
            this.catalog = new ArrayList<>();
        }
        catalogSetter.accept(this.catalog);
        return this;
    }

    /**
     * 服务目录信息列表。
     * @return catalog
     */
    public List<Catalog> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Catalog> catalog) {
        this.catalog = catalog;
    }

    public KeystoneShowCatalogResponse withLinks(LinksSelf links) {
        this.links = links;
        return this;
    }

    public KeystoneShowCatalogResponse withLinks(Consumer<LinksSelf> linksSetter) {
        if (this.links == null) {
            this.links = new LinksSelf();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public LinksSelf getLinks() {
        return links;
    }

    public void setLinks(LinksSelf links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowCatalogResponse keystoneShowCatalogResponse = (KeystoneShowCatalogResponse) o;
        return Objects.equals(this.catalog, keystoneShowCatalogResponse.catalog)
            && Objects.equals(this.links, keystoneShowCatalogResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalog, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowCatalogResponse {\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
