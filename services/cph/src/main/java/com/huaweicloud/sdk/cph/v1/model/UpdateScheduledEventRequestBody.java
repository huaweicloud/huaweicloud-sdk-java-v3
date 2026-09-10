package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改计划事件预约时间请求体。
 */
public class UpdateScheduledEventRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before")

    private String notBefore;

    public UpdateScheduledEventRequestBody withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * 计划执行开始时间，预约的时间需要比当前时间多5分钟以上，传空字符串表示立即执行。
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateScheduledEventRequestBody that = (UpdateScheduledEventRequestBody) obj;
        return Objects.equals(this.notBefore, that.notBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notBefore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScheduledEventRequestBody {\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
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
