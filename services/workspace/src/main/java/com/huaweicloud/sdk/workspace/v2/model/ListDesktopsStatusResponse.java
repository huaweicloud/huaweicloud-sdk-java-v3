package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListDesktopsStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoded_authorization_message")

    private String encodedAuthorizationMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statics")

    private List<InstanceStatusStatistics> statics = null;

    public ListDesktopsStatusResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ListDesktopsStatusResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ListDesktopsStatusResponse withEncodedAuthorizationMessage(String encodedAuthorizationMessage) {
        this.encodedAuthorizationMessage = encodedAuthorizationMessage;
        return this;
    }

    /**
     * 加密后的详细拒绝原因，用户可以自行调用STS服务的decode-authorization-message接口进行解密。
     * @return encodedAuthorizationMessage
     */
    public String getEncodedAuthorizationMessage() {
        return encodedAuthorizationMessage;
    }

    public void setEncodedAuthorizationMessage(String encodedAuthorizationMessage) {
        this.encodedAuthorizationMessage = encodedAuthorizationMessage;
    }

    public ListDesktopsStatusResponse withStatics(List<InstanceStatusStatistics> statics) {
        this.statics = statics;
        return this;
    }

    public ListDesktopsStatusResponse addStaticsItem(InstanceStatusStatistics staticsItem) {
        if (this.statics == null) {
            this.statics = new ArrayList<>();
        }
        this.statics.add(staticsItem);
        return this;
    }

    public ListDesktopsStatusResponse withStatics(Consumer<List<InstanceStatusStatistics>> staticsSetter) {
        if (this.statics == null) {
            this.statics = new ArrayList<>();
        }
        staticsSetter.accept(this.statics);
        return this;
    }

    /**
     * 统计信息。
     * @return statics
     */
    public List<InstanceStatusStatistics> getStatics() {
        return statics;
    }

    public void setStatics(List<InstanceStatusStatistics> statics) {
        this.statics = statics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopsStatusResponse that = (ListDesktopsStatusResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.encodedAuthorizationMessage, that.encodedAuthorizationMessage)
            && Objects.equals(this.statics, that.statics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, encodedAuthorizationMessage, statics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopsStatusResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    encodedAuthorizationMessage: ")
            .append(toIndentedString(encodedAuthorizationMessage))
            .append("\n");
        sb.append("    statics: ").append(toIndentedString(statics)).append("\n");
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
