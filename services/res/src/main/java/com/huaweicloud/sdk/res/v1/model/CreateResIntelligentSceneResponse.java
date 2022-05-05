package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateResIntelligentSceneResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private Scene scene;

    public CreateResIntelligentSceneResponse withIsSuccess(Boolean isSuccess) {
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

    public CreateResIntelligentSceneResponse withMessage(String message) {
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

    public CreateResIntelligentSceneResponse withErrorCode(String errorCode) {
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

    public CreateResIntelligentSceneResponse withScene(Scene scene) {
        this.scene = scene;
        return this;
    }

    public CreateResIntelligentSceneResponse withScene(Consumer<Scene> sceneSetter) {
        if (this.scene == null) {
            this.scene = new Scene();
            sceneSetter.accept(this.scene);
        }

        return this;
    }

    /**
     * Get scene
     * @return scene
     */
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResIntelligentSceneResponse createResIntelligentSceneResponse = (CreateResIntelligentSceneResponse) o;
        return Objects.equals(this.isSuccess, createResIntelligentSceneResponse.isSuccess)
            && Objects.equals(this.message, createResIntelligentSceneResponse.message)
            && Objects.equals(this.errorCode, createResIntelligentSceneResponse.errorCode)
            && Objects.equals(this.scene, createResIntelligentSceneResponse.scene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, errorCode, scene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResIntelligentSceneResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
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
