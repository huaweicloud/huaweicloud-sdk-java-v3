package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDomainDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cname")

    private String cname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_status")

    private String domainStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pp_enable")

    private Integer ppEnable;

    public ShowDomainDetailResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowDomainDetailResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowDomainDetailResponse withCname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * cname
     * @return cname
     */
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public ShowDomainDetailResponse withDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    /**
     * 域名状态 0-正常，1-冻结
     * @return domainStatus
     */
    public String getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    public ShowDomainDetailResponse withPpEnable(Integer ppEnable) {
        this.ppEnable = ppEnable;
        return this;
    }

    /**
     * 是否开启pp 0-关闭，1-开启
     * minimum: 0
     * maximum: 2000
     * @return ppEnable
     */
    public Integer getPpEnable() {
        return ppEnable;
    }

    public void setPpEnable(Integer ppEnable) {
        this.ppEnable = ppEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainDetailResponse that = (ShowDomainDetailResponse) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.cname, that.cname) && Objects.equals(this.domainStatus, that.domainStatus)
            && Objects.equals(this.ppEnable, that.ppEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, domainName, cname, domainStatus, ppEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainDetailResponse {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    domainStatus: ").append(toIndentedString(domainStatus)).append("\n");
        sb.append("    ppEnable: ").append(toIndentedString(ppEnable)).append("\n");
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
