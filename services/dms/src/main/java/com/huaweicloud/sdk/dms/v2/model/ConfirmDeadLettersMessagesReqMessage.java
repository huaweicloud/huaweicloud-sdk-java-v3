package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** ConfirmDeadLettersMessagesReqMessage */
public class ConfirmDeadLettersMessagesReqMessage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handler")

    private String handler;

    /** 客户端处理数据的状态。 取值为“success”或者“fail”。 */
    public static final class StatusEnum {

        /** Enum SUCCESS for value: "success" */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /** Enum FAIL for value: "fail" */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    public ConfirmDeadLettersMessagesReqMessage withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /** 消费时返回的ID。
     * 
     * @return handler */
    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public ConfirmDeadLettersMessagesReqMessage withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 客户端处理数据的状态。 取值为“success”或者“fail”。
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfirmDeadLettersMessagesReqMessage confirmDeadLettersMessagesReqMessage =
            (ConfirmDeadLettersMessagesReqMessage) o;
        return Objects.equals(this.handler, confirmDeadLettersMessagesReqMessage.handler)
            && Objects.equals(this.status, confirmDeadLettersMessagesReqMessage.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(handler, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmDeadLettersMessagesReqMessage {\n");
        sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
