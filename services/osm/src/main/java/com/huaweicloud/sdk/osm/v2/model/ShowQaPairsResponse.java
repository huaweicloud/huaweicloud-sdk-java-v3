package com.huaweicloud.sdk.osm.v2.model;

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
public class ShowQaPairsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qa_pairs")

    private List<SimpleQaPair> qaPairs = null;

    public ShowQaPairsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowQaPairsResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ShowQaPairsResponse withQaPairs(List<SimpleQaPair> qaPairs) {
        this.qaPairs = qaPairs;
        return this;
    }

    public ShowQaPairsResponse addQaPairsItem(SimpleQaPair qaPairsItem) {
        if (this.qaPairs == null) {
            this.qaPairs = new ArrayList<>();
        }
        this.qaPairs.add(qaPairsItem);
        return this;
    }

    public ShowQaPairsResponse withQaPairs(Consumer<List<SimpleQaPair>> qaPairsSetter) {
        if (this.qaPairs == null) {
            this.qaPairs = new ArrayList<>();
        }
        qaPairsSetter.accept(this.qaPairs);
        return this;
    }

    /**
     * 语料列表
     * @return qaPairs
     */
    public List<SimpleQaPair> getQaPairs() {
        return qaPairs;
    }

    public void setQaPairs(List<SimpleQaPair> qaPairs) {
        this.qaPairs = qaPairs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQaPairsResponse that = (ShowQaPairsResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.qaPairs, that.qaPairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, qaPairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQaPairsResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    qaPairs: ").append(toIndentedString(qaPairs)).append("\n");
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
