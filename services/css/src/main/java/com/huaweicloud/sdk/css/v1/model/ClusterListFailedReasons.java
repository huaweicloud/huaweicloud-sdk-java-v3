package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 失败原因。如果集群处于正常状态，则不返回该参数。 */
public class ClusterListFailedReasons {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ClusterListFailedReasons withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** 错误码。 - CSS.6000：表示集群创建失败。 - CSS.6001：表示集群扩容失败。 - CSS.6002：表示集群重启失败。 - CSS.6004：表示集群节点创建失败。 - CSS.6005：表示服务初始化失败。
     * 
     * @return errorCode */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ClusterListFailedReasons withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /** 详细错误信息。
     * 
     * @return errorMsg */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterListFailedReasons clusterListFailedReasons = (ClusterListFailedReasons) o;
        return Objects.equals(this.errorCode, clusterListFailedReasons.errorCode)
            && Objects.equals(this.errorMsg, clusterListFailedReasons.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterListFailedReasons {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
