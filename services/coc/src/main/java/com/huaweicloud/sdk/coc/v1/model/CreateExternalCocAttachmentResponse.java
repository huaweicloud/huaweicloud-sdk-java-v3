package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateExternalCocAttachmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_code")

    private String providerCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private ExternalAttachment data;

    public CreateExternalCocAttachmentResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 业务code，0 代表业务成功，其他数值代表有错误，详情请见错误码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CreateExternalCocAttachmentResponse withProviderCode(String providerCode) {
        this.providerCode = providerCode;
        return this;
    }

    /**
     * 服务编码。
     * @return providerCode
     */
    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public CreateExternalCocAttachmentResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 错误信息，code为0，此值为空；code不为0，此处为具体的错误描述。
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CreateExternalCocAttachmentResponse withData(ExternalAttachment data) {
        this.data = data;
        return this;
    }

    public CreateExternalCocAttachmentResponse withData(Consumer<ExternalAttachment> dataSetter) {
        if (this.data == null) {
            this.data = new ExternalAttachment();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ExternalAttachment getData() {
        return data;
    }

    public void setData(ExternalAttachment data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateExternalCocAttachmentResponse that = (CreateExternalCocAttachmentResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.providerCode, that.providerCode)
            && Objects.equals(this.msg, that.msg) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, providerCode, msg, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExternalCocAttachmentResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    providerCode: ").append(toIndentedString(providerCode)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
