package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 异常站点
 */
public class ErrorSite {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_sites")

    private List<String> errSites = null;

    public ErrorSite withErrSites(List<String> errSites) {
        this.errSites = errSites;
        return this;
    }

    public ErrorSite addErrSitesItem(String errSitesItem) {
        if (this.errSites == null) {
            this.errSites = new ArrayList<>();
        }
        this.errSites.add(errSitesItem);
        return this;
    }

    public ErrorSite withErrSites(Consumer<List<String>> errSitesSetter) {
        if (this.errSites == null) {
            this.errSites = new ArrayList<>();
        }
        errSitesSetter.accept(this.errSites);
        return this;
    }

    /**
     * 异常站点。
     * @return errSites
     */
    public List<String> getErrSites() {
        return errSites;
    }

    public void setErrSites(List<String> errSites) {
        this.errSites = errSites;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorSite errorSite = (ErrorSite) o;
        return Objects.equals(this.errSites, errorSite.errSites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errSites);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorSite {\n");
        sb.append("    errSites: ").append(toIndentedString(errSites)).append("\n");
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
