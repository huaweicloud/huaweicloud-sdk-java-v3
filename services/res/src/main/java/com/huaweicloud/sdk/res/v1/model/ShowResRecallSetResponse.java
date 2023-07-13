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
public class ShowResRecallSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_set")

    private List<ResultSet> resultSet = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public ShowResRecallSetResponse withResultSet(List<ResultSet> resultSet) {
        this.resultSet = resultSet;
        return this;
    }

    public ShowResRecallSetResponse addResultSetItem(ResultSet resultSetItem) {
        if (this.resultSet == null) {
            this.resultSet = new ArrayList<>();
        }
        this.resultSet.add(resultSetItem);
        return this;
    }

    public ShowResRecallSetResponse withResultSet(Consumer<List<ResultSet>> resultSetSetter) {
        if (this.resultSet == null) {
            this.resultSet = new ArrayList<>();
        }
        resultSetSetter.accept(this.resultSet);
        return this;
    }

    /**
     * 候选集列表
     * @return resultSet
     */
    public List<ResultSet> getResultSet() {
        return resultSet;
    }

    public void setResultSet(List<ResultSet> resultSet) {
        this.resultSet = resultSet;
    }

    public ShowResRecallSetResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 是否成功
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowResRecallSetResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 返回消息（请求成功时，不返回此字段）
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowResRecallSetResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码（请求成功时，不返回此字段）
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResRecallSetResponse that = (ShowResRecallSetResponse) obj;
        return Objects.equals(this.resultSet, that.resultSet) && Objects.equals(this.isSuccess, that.isSuccess)
            && Objects.equals(this.message, that.message) && Objects.equals(this.errorCode, that.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultSet, isSuccess, message, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResRecallSetResponse {\n");
        sb.append("    resultSet: ").append(toIndentedString(resultSet)).append("\n");
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
