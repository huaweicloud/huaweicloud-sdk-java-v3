package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListResScenesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "res_scenes")

    private List<ResScene> resScenes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public ListResScenesResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 是否成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListResScenesResponse withResScenes(List<ResScene> resScenes) {
        this.resScenes = resScenes;
        return this;
    }

    public ListResScenesResponse addResScenesItem(ResScene resScenesItem) {
        if (this.resScenes == null) {
            this.resScenes = new ArrayList<>();
        }
        this.resScenes.add(resScenesItem);
        return this;
    }

    public ListResScenesResponse withResScenes(Consumer<List<ResScene>> resScenesSetter) {
        if (this.resScenes == null) {
            this.resScenes = new ArrayList<>();
        }
        resScenesSetter.accept(this.resScenes);
        return this;
    }

    /**
     * 场景列表信息。
     * @return resScenes
     */
    public List<ResScene> getResScenes() {
        return resScenes;
    }

    public void setResScenes(List<ResScene> resScenes) {
        this.resScenes = resScenes;
    }

    public ListResScenesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 返回消息（请求成功时，不返回此字段）。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListResScenesResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码（请求成功时，不返回此字段）。
     * @return errorCode
     */
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
        ListResScenesResponse listResScenesResponse = (ListResScenesResponse) o;
        return Objects.equals(this.isSuccess, listResScenesResponse.isSuccess)
            && Objects.equals(this.resScenes, listResScenesResponse.resScenes)
            && Objects.equals(this.message, listResScenesResponse.message)
            && Objects.equals(this.errorCode, listResScenesResponse.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, resScenes, message, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResScenesResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    resScenes: ").append(toIndentedString(resScenes)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
