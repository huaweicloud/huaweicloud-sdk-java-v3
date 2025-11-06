package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApproverParamDto
 */
public class ApproverParamDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_id")

    private Integer approverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_owner")

    private Boolean codeOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accept")

    private Boolean accept;

    public ApproverParamDto withApproverId(Integer approverId) {
        this.approverId = approverId;
        return this;
    }

    /**
     * 审核人id
     * @return approverId
     */
    public Integer getApproverId() {
        return approverId;
    }

    public void setApproverId(Integer approverId) {
        this.approverId = approverId;
    }

    public ApproverParamDto withCodeOwner(Boolean codeOwner) {
        this.codeOwner = codeOwner;
        return this;
    }

    /**
     * 代码所有者
     * @return codeOwner
     */
    public Boolean getCodeOwner() {
        return codeOwner;
    }

    public void setCodeOwner(Boolean codeOwner) {
        this.codeOwner = codeOwner;
    }

    public ApproverParamDto withAccept(Boolean accept) {
        this.accept = accept;
        return this;
    }

    /**
     * 是否接纳
     * @return accept
     */
    public Boolean getAccept() {
        return accept;
    }

    public void setAccept(Boolean accept) {
        this.accept = accept;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApproverParamDto that = (ApproverParamDto) obj;
        return Objects.equals(this.approverId, that.approverId) && Objects.equals(this.codeOwner, that.codeOwner)
            && Objects.equals(this.accept, that.accept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approverId, codeOwner, accept);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApproverParamDto {\n");
        sb.append("    approverId: ").append(toIndentedString(approverId)).append("\n");
        sb.append("    codeOwner: ").append(toIndentedString(codeOwner)).append("\n");
        sb.append("    accept: ").append(toIndentedString(accept)).append("\n");
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
