package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListFlinkTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_list")

    private FlinkTemplateList templateList;

    public ListFlinkTemplatesResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 请求是否成功
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListFlinkTemplatesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息内容。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListFlinkTemplatesResponse withTemplateList(FlinkTemplateList templateList) {
        this.templateList = templateList;
        return this;
    }

    public ListFlinkTemplatesResponse withTemplateList(Consumer<FlinkTemplateList> templateListSetter) {
        if (this.templateList == null) {
            this.templateList = new FlinkTemplateList();
            templateListSetter.accept(this.templateList);
        }

        return this;
    }

    /**
     * Get templateList
     * @return templateList
     */
    public FlinkTemplateList getTemplateList() {
        return templateList;
    }

    public void setTemplateList(FlinkTemplateList templateList) {
        this.templateList = templateList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlinkTemplatesResponse listFlinkTemplatesResponse = (ListFlinkTemplatesResponse) o;
        return Objects.equals(this.isSuccess, listFlinkTemplatesResponse.isSuccess)
            && Objects.equals(this.message, listFlinkTemplatesResponse.message)
            && Objects.equals(this.templateList, listFlinkTemplatesResponse.templateList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, templateList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlinkTemplatesResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    templateList: ").append(toIndentedString(templateList)).append("\n");
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
