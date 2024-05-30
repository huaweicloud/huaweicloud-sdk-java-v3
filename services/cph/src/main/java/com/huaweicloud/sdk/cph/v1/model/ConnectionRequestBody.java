package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取云手机连接信息请求体
 */
public class ConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_ids")

    private List<String> phoneIds = null;

    /**
     * 申请接入的客户端类型 - ANDROID: 安卓平台SDK - WINDOWS: Windows平台SDK - H5_MOBILE: H5移动端SDK - H5_PC: H5 PC端SDK - IOS: iOS平台SDK
     */
    public static final class ClientTypeEnum {

        /**
         * Enum ANDROID for value: "ANDROID"
         */
        public static final ClientTypeEnum ANDROID = new ClientTypeEnum("ANDROID");

        /**
         * Enum WINDOWS for value: "WINDOWS"
         */
        public static final ClientTypeEnum WINDOWS = new ClientTypeEnum("WINDOWS");

        /**
         * Enum H5_MOBILE for value: "H5_MOBILE"
         */
        public static final ClientTypeEnum H5_MOBILE = new ClientTypeEnum("H5_MOBILE");

        /**
         * Enum H5_PC for value: "H5_PC"
         */
        public static final ClientTypeEnum H5_PC = new ClientTypeEnum("H5_PC");

        /**
         * Enum IOS for value: "IOS"
         */
        public static final ClientTypeEnum IOS = new ClientTypeEnum("IOS");

        private static final Map<String, ClientTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClientTypeEnum> createStaticFields() {
            Map<String, ClientTypeEnum> map = new HashMap<>();
            map.put("ANDROID", ANDROID);
            map.put("WINDOWS", WINDOWS);
            map.put("H5_MOBILE", H5_MOBILE);
            map.put("H5_PC", H5_PC);
            map.put("IOS", IOS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClientTypeEnum(String value) {
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
        public static ClientTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClientTypeEnum(value));
        }

        public static ClientTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClientTypeEnum) {
                return this.value.equals(((ClientTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_type")

    private ClientTypeEnum clientType;

    public ConnectionRequestBody withPhoneIds(List<String> phoneIds) {
        this.phoneIds = phoneIds;
        return this;
    }

    public ConnectionRequestBody addPhoneIdsItem(String phoneIdsItem) {
        if (this.phoneIds == null) {
            this.phoneIds = new ArrayList<>();
        }
        this.phoneIds.add(phoneIdsItem);
        return this;
    }

    public ConnectionRequestBody withPhoneIds(Consumer<List<String>> phoneIdsSetter) {
        if (this.phoneIds == null) {
            this.phoneIds = new ArrayList<>();
        }
        phoneIdsSetter.accept(this.phoneIds);
        return this;
    }

    /**
     * phone_id数组，单次请求最大限制10
     * @return phoneIds
     */
    public List<String> getPhoneIds() {
        return phoneIds;
    }

    public void setPhoneIds(List<String> phoneIds) {
        this.phoneIds = phoneIds;
    }

    public ConnectionRequestBody withClientType(ClientTypeEnum clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * 申请接入的客户端类型 - ANDROID: 安卓平台SDK - WINDOWS: Windows平台SDK - H5_MOBILE: H5移动端SDK - H5_PC: H5 PC端SDK - IOS: iOS平台SDK
     * @return clientType
     */
    public ClientTypeEnum getClientType() {
        return clientType;
    }

    public void setClientType(ClientTypeEnum clientType) {
        this.clientType = clientType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectionRequestBody that = (ConnectionRequestBody) obj;
        return Objects.equals(this.phoneIds, that.phoneIds) && Objects.equals(this.clientType, that.clientType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneIds, clientType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionRequestBody {\n");
        sb.append("    phoneIds: ").append(toIndentedString(phoneIds)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
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
