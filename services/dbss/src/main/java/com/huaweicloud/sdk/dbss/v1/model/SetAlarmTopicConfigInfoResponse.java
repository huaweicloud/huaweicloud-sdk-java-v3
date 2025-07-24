package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SetAlarmTopicConfigInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_use_topic")

    private Boolean isUseTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public SetAlarmTopicConfigInfoResponse withIsUseTopic(Boolean isUseTopic) {
        this.isUseTopic = isUseTopic;
        return this;
    }

    /**
     * 主题使用状态  - true: 已被使用  - false: 未被使用
     * @return isUseTopic
     */
    public Boolean getIsUseTopic() {
        return isUseTopic;
    }

    public void setIsUseTopic(Boolean isUseTopic) {
        this.isUseTopic = isUseTopic;
    }

    public SetAlarmTopicConfigInfoResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态  - SUCCESS: 成功  - FAILED: 失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetAlarmTopicConfigInfoResponse that = (SetAlarmTopicConfigInfoResponse) obj;
        return Objects.equals(this.isUseTopic, that.isUseTopic) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isUseTopic, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAlarmTopicConfigInfoResponse {\n");
        sb.append("    isUseTopic: ").append(toIndentedString(isUseTopic)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
