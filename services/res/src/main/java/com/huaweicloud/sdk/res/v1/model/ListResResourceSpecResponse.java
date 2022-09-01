package com.huaweicloud.sdk.res.v1.model;

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
public class ListResResourceSpecResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline_spec")

    @JacksonXmlProperty(localName = "offline_spec")

    private List<String> offlineSpec = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nearline_spec")

    @JacksonXmlProperty(localName = "nearline_spec")

    private List<String> nearlineSpec = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deep_learning_spec")

    @JacksonXmlProperty(localName = "deep_learning_spec")

    private List<String> deepLearningSpec = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    @JacksonXmlProperty(localName = "error_code")

    private String errorCode;

    public ListResResourceSpecResponse withOfflineSpec(List<String> offlineSpec) {
        this.offlineSpec = offlineSpec;
        return this;
    }

    public ListResResourceSpecResponse addOfflineSpecItem(String offlineSpecItem) {
        if (this.offlineSpec == null) {
            this.offlineSpec = new ArrayList<>();
        }
        this.offlineSpec.add(offlineSpecItem);
        return this;
    }

    public ListResResourceSpecResponse withOfflineSpec(Consumer<List<String>> offlineSpecSetter) {
        if (this.offlineSpec == null) {
            this.offlineSpec = new ArrayList<>();
        }
        offlineSpecSetter.accept(this.offlineSpec);
        return this;
    }

    /**
     * 离线计算规格。
     * @return offlineSpec
     */
    public List<String> getOfflineSpec() {
        return offlineSpec;
    }

    public void setOfflineSpec(List<String> offlineSpec) {
        this.offlineSpec = offlineSpec;
    }

    public ListResResourceSpecResponse withNearlineSpec(List<String> nearlineSpec) {
        this.nearlineSpec = nearlineSpec;
        return this;
    }

    public ListResResourceSpecResponse addNearlineSpecItem(String nearlineSpecItem) {
        if (this.nearlineSpec == null) {
            this.nearlineSpec = new ArrayList<>();
        }
        this.nearlineSpec.add(nearlineSpecItem);
        return this;
    }

    public ListResResourceSpecResponse withNearlineSpec(Consumer<List<String>> nearlineSpecSetter) {
        if (this.nearlineSpec == null) {
            this.nearlineSpec = new ArrayList<>();
        }
        nearlineSpecSetter.accept(this.nearlineSpec);
        return this;
    }

    /**
     * 实时计算规格。
     * @return nearlineSpec
     */
    public List<String> getNearlineSpec() {
        return nearlineSpec;
    }

    public void setNearlineSpec(List<String> nearlineSpec) {
        this.nearlineSpec = nearlineSpec;
    }

    public ListResResourceSpecResponse withDeepLearningSpec(List<String> deepLearningSpec) {
        this.deepLearningSpec = deepLearningSpec;
        return this;
    }

    public ListResResourceSpecResponse addDeepLearningSpecItem(String deepLearningSpecItem) {
        if (this.deepLearningSpec == null) {
            this.deepLearningSpec = new ArrayList<>();
        }
        this.deepLearningSpec.add(deepLearningSpecItem);
        return this;
    }

    public ListResResourceSpecResponse withDeepLearningSpec(Consumer<List<String>> deepLearningSpecSetter) {
        if (this.deepLearningSpec == null) {
            this.deepLearningSpec = new ArrayList<>();
        }
        deepLearningSpecSetter.accept(this.deepLearningSpec);
        return this;
    }

    /**
     * 排序模型计算规格。
     * @return deepLearningSpec
     */
    public List<String> getDeepLearningSpec() {
        return deepLearningSpec;
    }

    public void setDeepLearningSpec(List<String> deepLearningSpec) {
        this.deepLearningSpec = deepLearningSpec;
    }

    public ListResResourceSpecResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 请求是否成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListResResourceSpecResponse withMessage(String message) {
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

    public ListResResourceSpecResponse withErrorCode(String errorCode) {
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
        ListResResourceSpecResponse listResResourceSpecResponse = (ListResResourceSpecResponse) o;
        return Objects.equals(this.offlineSpec, listResResourceSpecResponse.offlineSpec)
            && Objects.equals(this.nearlineSpec, listResResourceSpecResponse.nearlineSpec)
            && Objects.equals(this.deepLearningSpec, listResResourceSpecResponse.deepLearningSpec)
            && Objects.equals(this.isSuccess, listResResourceSpecResponse.isSuccess)
            && Objects.equals(this.message, listResResourceSpecResponse.message)
            && Objects.equals(this.errorCode, listResResourceSpecResponse.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offlineSpec, nearlineSpec, deepLearningSpec, isSuccess, message, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResResourceSpecResponse {\n");
        sb.append("    offlineSpec: ").append(toIndentedString(offlineSpec)).append("\n");
        sb.append("    nearlineSpec: ").append(toIndentedString(nearlineSpec)).append("\n");
        sb.append("    deepLearningSpec: ").append(toIndentedString(deepLearningSpec)).append("\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
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
