package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FgacUpdateResult
 */
public class FgacUpdateResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public FgacUpdateResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据连接id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FgacUpdateResult withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 是否更新成功,true表示更新成功,false表示更新失败。
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public FgacUpdateResult withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 细粒度认证更新错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FgacUpdateResult that = (FgacUpdateResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FgacUpdateResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
