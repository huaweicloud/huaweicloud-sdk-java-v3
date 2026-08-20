package com.huaweicloud.sdk.projectman.v4.model;

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
public class ShowIpdFieldsV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<FieldVO> result = null;

    public ShowIpdFieldsV2Response withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 响应状态码。标识查询工作项实例字段列表请求的处理结果。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowIpdFieldsV2Response withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 响应消息。请求失败时包含详细错误信息，可用于问题排查。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowIpdFieldsV2Response withResult(List<FieldVO> result) {
        this.result = result;
        return this;
    }

    public ShowIpdFieldsV2Response addResultItem(FieldVO resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ShowIpdFieldsV2Response withResult(Consumer<List<FieldVO>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 字段列表结果。返回创建工作项实例时可选用的字段配置信息，包含字段ID、编码、名称、类型等属性，包含系统字段和项目自定义字段。
     * @return result
     */
    public List<FieldVO> getResult() {
        return result;
    }

    public void setResult(List<FieldVO> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIpdFieldsV2Response that = (ShowIpdFieldsV2Response) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpdFieldsV2Response {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
