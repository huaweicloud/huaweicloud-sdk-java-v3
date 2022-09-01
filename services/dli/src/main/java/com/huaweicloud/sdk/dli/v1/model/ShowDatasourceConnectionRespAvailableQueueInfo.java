package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ShowDatasourceConnectionRespAvailableQueueInfo
 */
public class ShowDatasourceConnectionRespAvailableQueueInfo {

    /**
     * 连接状态，状态码请参考表连接状态：  - CREATING： 跨源连接正在创建中  - ACTIVE： 跨源连接创建成功，与目的地址连接正常  - FAILED： 跨源连接创建失败  - DELETED： 跨源连接已被删除 
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("ACTIVE", ACTIVE);
            map.put("FAILED", FAILED);
            map.put("DELETED", DELETED);
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

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_msg")

    @JacksonXmlProperty(localName = "err_msg")

    private String errMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    @JacksonXmlProperty(localName = "uuid")

    private String uuid;

    public ShowDatasourceConnectionRespAvailableQueueInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 连接状态，状态码请参考表连接状态：  - CREATING： 跨源连接正在创建中  - ACTIVE： 跨源连接创建成功，与目的地址连接正常  - FAILED： 跨源连接创建失败  - DELETED： 跨源连接已被删除 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowDatasourceConnectionRespAvailableQueueInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 队列名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDatasourceConnectionRespAvailableQueueInfo withErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    /**
     * 状态为失败时的详细报错信息。
     * @return errMsg
     */
    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public ShowDatasourceConnectionRespAvailableQueueInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowDatasourceConnectionRespAvailableQueueInfo withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 跨源连接ID。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDatasourceConnectionRespAvailableQueueInfo showDatasourceConnectionRespAvailableQueueInfo =
            (ShowDatasourceConnectionRespAvailableQueueInfo) o;
        return Objects.equals(this.status, showDatasourceConnectionRespAvailableQueueInfo.status)
            && Objects.equals(this.name, showDatasourceConnectionRespAvailableQueueInfo.name)
            && Objects.equals(this.errMsg, showDatasourceConnectionRespAvailableQueueInfo.errMsg)
            && Objects.equals(this.updateTime, showDatasourceConnectionRespAvailableQueueInfo.updateTime)
            && Objects.equals(this.uuid, showDatasourceConnectionRespAvailableQueueInfo.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, name, errMsg, updateTime, uuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatasourceConnectionRespAvailableQueueInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    errMsg: ").append(toIndentedString(errMsg)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
