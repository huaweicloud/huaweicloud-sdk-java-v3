package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 给工作项关联外部链接的响应结果。
 */
public class IssuesAssociationRespResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    private List<CreateThirdPartyAssociateDTO> fail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<CreateThirdPartyAssociateDTO> success = null;

    public IssuesAssociationRespResult withFail(List<CreateThirdPartyAssociateDTO> fail) {
        this.fail = fail;
        return this;
    }

    public IssuesAssociationRespResult addFailItem(CreateThirdPartyAssociateDTO failItem) {
        if (this.fail == null) {
            this.fail = new ArrayList<>();
        }
        this.fail.add(failItem);
        return this;
    }

    public IssuesAssociationRespResult withFail(Consumer<List<CreateThirdPartyAssociateDTO>> failSetter) {
        if (this.fail == null) {
            this.fail = new ArrayList<>();
        }
        failSetter.accept(this.fail);
        return this;
    }

    /**
     * 关联失败的工作项列表。
     * @return fail
     */
    public List<CreateThirdPartyAssociateDTO> getFail() {
        return fail;
    }

    public void setFail(List<CreateThirdPartyAssociateDTO> fail) {
        this.fail = fail;
    }

    public IssuesAssociationRespResult withSuccess(List<CreateThirdPartyAssociateDTO> success) {
        this.success = success;
        return this;
    }

    public IssuesAssociationRespResult addSuccessItem(CreateThirdPartyAssociateDTO successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public IssuesAssociationRespResult withSuccess(Consumer<List<CreateThirdPartyAssociateDTO>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 关联成功的工作项列表。
     * @return success
     */
    public List<CreateThirdPartyAssociateDTO> getSuccess() {
        return success;
    }

    public void setSuccess(List<CreateThirdPartyAssociateDTO> success) {
        this.success = success;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssuesAssociationRespResult that = (IssuesAssociationRespResult) obj;
        return Objects.equals(this.fail, that.fail) && Objects.equals(this.success, that.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fail, success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesAssociationRespResult {\n");
        sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
