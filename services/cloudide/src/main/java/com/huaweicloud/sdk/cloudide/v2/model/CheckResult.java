package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckResult
 */
public class CheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errors")

    private List<CheckResultError> errors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_version_compare")

    private String extensionVersionCompare;

    public CheckResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 解析状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CheckResult withErrors(List<CheckResultError> errors) {
        this.errors = errors;
        return this;
    }

    public CheckResult addErrorsItem(CheckResultError errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public CheckResult withErrors(Consumer<List<CheckResultError>> errorsSetter) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        errorsSetter.accept(this.errors);
        return this;
    }

    /**
     * 检查插件错误结果集
     * @return errors
     */
    public List<CheckResultError> getErrors() {
        return errors;
    }

    public void setErrors(List<CheckResultError> errors) {
        this.errors = errors;
    }

    public CheckResult withExtensionVersionCompare(String extensionVersionCompare) {
        this.extensionVersionCompare = extensionVersionCompare;
        return this;
    }

    /**
     * 插件版本信息
     * @return extensionVersionCompare
     */
    public String getExtensionVersionCompare() {
        return extensionVersionCompare;
    }

    public void setExtensionVersionCompare(String extensionVersionCompare) {
        this.extensionVersionCompare = extensionVersionCompare;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckResult checkResult = (CheckResult) o;
        return Objects.equals(this.status, checkResult.status) && Objects.equals(this.errors, checkResult.errors)
            && Objects.equals(this.extensionVersionCompare, checkResult.extensionVersionCompare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, errors, extensionVersionCompare);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckResult {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    extensionVersionCompare: ").append(toIndentedString(extensionVersionCompare)).append("\n");
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
