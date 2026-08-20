package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改工作项下外部链接的响应结果。
 */
public class UpdateThirdPartyAssociateResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    private List<String> fail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<List<String>> success = null;

    public UpdateThirdPartyAssociateResponseResult withFail(List<String> fail) {
        this.fail = fail;
        return this;
    }

    public UpdateThirdPartyAssociateResponseResult addFailItem(String failItem) {
        if (this.fail == null) {
            this.fail = new ArrayList<>();
        }
        this.fail.add(failItem);
        return this;
    }

    public UpdateThirdPartyAssociateResponseResult withFail(Consumer<List<String>> failSetter) {
        if (this.fail == null) {
            this.fail = new ArrayList<>();
        }
        failSetter.accept(this.fail);
        return this;
    }

    /**
     * 修改失败的字段列表。
     * @return fail
     */
    public List<String> getFail() {
        return fail;
    }

    public void setFail(List<String> fail) {
        this.fail = fail;
    }

    public UpdateThirdPartyAssociateResponseResult withSuccess(List<List<String>> success) {
        this.success = success;
        return this;
    }

    public UpdateThirdPartyAssociateResponseResult addSuccessItem(List<String> successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public UpdateThirdPartyAssociateResponseResult withSuccess(Consumer<List<List<String>>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 成功修改的字段集合，每个元素为一个工作项对应的字段名数组。
     * @return success
     */
    public List<List<String>> getSuccess() {
        return success;
    }

    public void setSuccess(List<List<String>> success) {
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
        UpdateThirdPartyAssociateResponseResult that = (UpdateThirdPartyAssociateResponseResult) obj;
        return Objects.equals(this.fail, that.fail) && Objects.equals(this.success, that.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fail, success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateThirdPartyAssociateResponseResult {\n");
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
