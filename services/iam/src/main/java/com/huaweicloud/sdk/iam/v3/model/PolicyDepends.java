package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class PolicyDepends {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog")

    @JacksonXmlProperty(localName = "catalog")

    private String catalog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    @JacksonXmlProperty(localName = "display_name")

    private String displayName;

    public PolicyDepends withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * 权限所在目录。
     * @return catalog
     */
    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public PolicyDepends withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 权限展示名。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyDepends policyDepends = (PolicyDepends) o;
        return Objects.equals(this.catalog, policyDepends.catalog)
            && Objects.equals(this.displayName, policyDepends.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalog, displayName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyDepends {\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
