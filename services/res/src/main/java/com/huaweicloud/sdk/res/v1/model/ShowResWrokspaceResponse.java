package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowResWrokspaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspaces")

    private List<Workspaces> workspaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public ShowResWrokspaceResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /** 是否成功。
     * 
     * @return isSuccess */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowResWrokspaceResponse withWorkspaces(List<Workspaces> workspaces) {
        this.workspaces = workspaces;
        return this;
    }

    public ShowResWrokspaceResponse addWorkspacesItem(Workspaces workspacesItem) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        this.workspaces.add(workspacesItem);
        return this;
    }

    public ShowResWrokspaceResponse withWorkspaces(Consumer<List<Workspaces>> workspacesSetter) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        workspacesSetter.accept(this.workspaces);
        return this;
    }

    /** 工作空间详情。
     * 
     * @return workspaces */
    public List<Workspaces> getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(List<Workspaces> workspaces) {
        this.workspaces = workspaces;
    }

    public ShowResWrokspaceResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /** 返回消息（请求成功时，不返回此字段）。
     * 
     * @return message */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowResWrokspaceResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** 错误码（请求成功时，不返回此字段）。
     * 
     * @return errorCode */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResWrokspaceResponse showResWrokspaceResponse = (ShowResWrokspaceResponse) o;
        return Objects.equals(this.isSuccess, showResWrokspaceResponse.isSuccess)
            && Objects.equals(this.workspaces, showResWrokspaceResponse.workspaces)
            && Objects.equals(this.message, showResWrokspaceResponse.message)
            && Objects.equals(this.errorCode, showResWrokspaceResponse.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, workspaces, message, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResWrokspaceResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
