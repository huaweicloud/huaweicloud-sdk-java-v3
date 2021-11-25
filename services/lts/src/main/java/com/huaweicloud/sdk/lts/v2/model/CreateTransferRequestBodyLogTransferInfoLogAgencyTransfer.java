package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 委托转储信息。若配置委托转储，则需要输入该参数 */
public class CreateTransferRequestBodyLogTransferInfoLogAgencyTransfer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_domain_id")

    private String agencyDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_domain_name")

    private String agencyDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_project_id")

    private String agencyProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_agency_domain_id")

    private String beAgencyDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_agency_project_id")

    private String beAgencyProjectId;

    public CreateTransferRequestBodyLogTransferInfoLogAgencyTransfer withAgencyDomainId(String agencyDomainId) {
        this.agencyDomainId = agencyDomainId;
        return this;
    }

    /** 委托方账号ID
     * 
     * @return agencyDomainId */
    public String getAgencyDomainId() {
        return agencyDomainId;
    }

    public void setAgencyDomainId(String agencyDomainId) {
        this.agencyDomainId = agencyDomainId;
    }

    public CreateTransferRequestBodyLogTransferInfoLogAgencyTransfer withAgencyDomainName(String agencyDomainName) {
        this.agencyDomainName = agencyDomainName;
        return this;
    }

    /** 委托方账号名称
     * 
     * @return agencyDomainName */
    public String getAgencyDomainName() {
        return agencyDomainName;
    }

    public void setAgencyDomainName(String agencyDomainName) {
        this.agencyDomainName = agencyDomainName;
    }

    public CreateTransferRequestBodyLogTransferInfoLogAgencyTransfer withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /** 委托方配置的委托名称
     * 
     * @return agencyName */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public CreateTransferRequestBodyLogTransferInfoLogAgencyTransfer withAgencyProjectId(String agencyProjectId) {
        this.agencyProjectId = agencyProjectId;
        return this;
    }

    /** 委托方项目ID
     * 
     * @return agencyProjectId */
    public String getAgencyProjectId() {
        return agencyProjectId;
    }

    public void setAgencyProjectId(String agencyProjectId) {
        this.agencyProjectId = agencyProjectId;
    }

    public CreateTransferRequestBodyLogTransferInfoLogAgencyTransfer withBeAgencyDomainId(String beAgencyDomainId) {
        this.beAgencyDomainId = beAgencyDomainId;
        return this;
    }

    /** 被委托方账号ID，实际配置转储的账号ID
     * 
     * @return beAgencyDomainId */
    public String getBeAgencyDomainId() {
        return beAgencyDomainId;
    }

    public void setBeAgencyDomainId(String beAgencyDomainId) {
        this.beAgencyDomainId = beAgencyDomainId;
    }

    public CreateTransferRequestBodyLogTransferInfoLogAgencyTransfer withBeAgencyProjectId(String beAgencyProjectId) {
        this.beAgencyProjectId = beAgencyProjectId;
        return this;
    }

    /** 被委托方项目ID，实际配置转储的账号的项目ID
     * 
     * @return beAgencyProjectId */
    public String getBeAgencyProjectId() {
        return beAgencyProjectId;
    }

    public void setBeAgencyProjectId(String beAgencyProjectId) {
        this.beAgencyProjectId = beAgencyProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTransferRequestBodyLogTransferInfoLogAgencyTransfer createTransferRequestBodyLogTransferInfoLogAgencyTransfer =
            (CreateTransferRequestBodyLogTransferInfoLogAgencyTransfer) o;
        return Objects.equals(this.agencyDomainId,
            createTransferRequestBodyLogTransferInfoLogAgencyTransfer.agencyDomainId)
            && Objects.equals(this.agencyDomainName,
                createTransferRequestBodyLogTransferInfoLogAgencyTransfer.agencyDomainName)
            && Objects.equals(this.agencyName, createTransferRequestBodyLogTransferInfoLogAgencyTransfer.agencyName)
            && Objects.equals(this.agencyProjectId,
                createTransferRequestBodyLogTransferInfoLogAgencyTransfer.agencyProjectId)
            && Objects.equals(this.beAgencyDomainId,
                createTransferRequestBodyLogTransferInfoLogAgencyTransfer.beAgencyDomainId)
            && Objects.equals(this.beAgencyProjectId,
                createTransferRequestBodyLogTransferInfoLogAgencyTransfer.beAgencyProjectId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(agencyDomainId, agencyDomainName, agencyName, agencyProjectId, beAgencyDomainId, beAgencyProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTransferRequestBodyLogTransferInfoLogAgencyTransfer {\n");
        sb.append("    agencyDomainId: ").append(toIndentedString(agencyDomainId)).append("\n");
        sb.append("    agencyDomainName: ").append(toIndentedString(agencyDomainName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    agencyProjectId: ").append(toIndentedString(agencyProjectId)).append("\n");
        sb.append("    beAgencyDomainId: ").append(toIndentedString(beAgencyDomainId)).append("\n");
        sb.append("    beAgencyProjectId: ").append(toIndentedString(beAgencyProjectId)).append("\n");
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
