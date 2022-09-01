package com.huaweicloud.sdk.dli.v1.model;

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
public class ShowDliAgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    @JacksonXmlProperty(localName = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_roles")

    @JacksonXmlProperty(localName = "current_roles")

    private List<String> currentRoles = null;

    public ShowDliAgencyResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowDliAgencyResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowDliAgencyResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowDliAgencyResponse withCurrentRoles(List<String> currentRoles) {
        this.currentRoles = currentRoles;
        return this;
    }

    public ShowDliAgencyResponse addCurrentRolesItem(String currentRolesItem) {
        if (this.currentRoles == null) {
            this.currentRoles = new ArrayList<>();
        }
        this.currentRoles.add(currentRolesItem);
        return this;
    }

    public ShowDliAgencyResponse withCurrentRoles(Consumer<List<String>> currentRolesSetter) {
        if (this.currentRoles == null) {
            this.currentRoles = new ArrayList<>();
        }
        currentRolesSetter.accept(this.currentRoles);
        return this;
    }

    /**
     * 当前已有委托
     * @return currentRoles
     */
    public List<String> getCurrentRoles() {
        return currentRoles;
    }

    public void setCurrentRoles(List<String> currentRoles) {
        this.currentRoles = currentRoles;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDliAgencyResponse showDliAgencyResponse = (ShowDliAgencyResponse) o;
        return Objects.equals(this.isSuccess, showDliAgencyResponse.isSuccess)
            && Objects.equals(this.message, showDliAgencyResponse.message)
            && Objects.equals(this.version, showDliAgencyResponse.version)
            && Objects.equals(this.currentRoles, showDliAgencyResponse.currentRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, version, currentRoles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDliAgencyResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    currentRoles: ").append(toIndentedString(currentRoles)).append("\n");
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
