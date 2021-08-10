package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListPremiumHostRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private String page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagesize")

    private String pagesize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyname")

    private String policyname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private Integer protectStatus;

    public ListPremiumHostRequest withPage(String page) {
        this.page = page;
        return this;
    }

    /** 页码
     * 
     * @return page */
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public ListPremiumHostRequest withPagesize(String pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    /** 每页条数
     * 
     * @return pagesize */
    public String getPagesize() {
        return pagesize;
    }

    public void setPagesize(String pagesize) {
        this.pagesize = pagesize;
    }

    public ListPremiumHostRequest withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /** 域名
     * 
     * @return hostname */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public ListPremiumHostRequest withPolicyname(String policyname) {
        this.policyname = policyname;
        return this;
    }

    /** 策略名称
     * 
     * @return policyname */
    public String getPolicyname() {
        return policyname;
    }

    public void setPolicyname(String policyname) {
        this.policyname = policyname;
    }

    public ListPremiumHostRequest withProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /** 域名防护状态
     * 
     * @return protectStatus */
    public Integer getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPremiumHostRequest listPremiumHostRequest = (ListPremiumHostRequest) o;
        return Objects.equals(this.page, listPremiumHostRequest.page)
            && Objects.equals(this.pagesize, listPremiumHostRequest.pagesize)
            && Objects.equals(this.hostname, listPremiumHostRequest.hostname)
            && Objects.equals(this.policyname, listPremiumHostRequest.policyname)
            && Objects.equals(this.protectStatus, listPremiumHostRequest.protectStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, pagesize, hostname, policyname, protectStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPremiumHostRequest {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    policyname: ").append(toIndentedString(policyname)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
