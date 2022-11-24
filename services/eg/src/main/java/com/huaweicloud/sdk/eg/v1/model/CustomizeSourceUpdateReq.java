package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomizeSourceUpdateReq
 */
public class CustomizeSourceUpdateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private Object detail;

    public CustomizeSourceUpdateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件源描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomizeSourceUpdateReq withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    /**
     * json格式封装消息实例更新信息：如RabbitMQ实例的虚拟主机vhost字段、队列queue字段、用户密码
     * @return detail
     */
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomizeSourceUpdateReq customizeSourceUpdateReq = (CustomizeSourceUpdateReq) o;
        return Objects.equals(this.description, customizeSourceUpdateReq.description)
            && Objects.equals(this.detail, customizeSourceUpdateReq.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizeSourceUpdateReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
