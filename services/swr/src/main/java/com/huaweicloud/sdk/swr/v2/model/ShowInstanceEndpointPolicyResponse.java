package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceEndpointPolicyResponse extends SdkResponse {

    /**
     * 公网访问状态，Enable、Enabling、EnableFailed、Disable、Disabling、DisableFailed
     */
    public static final class StatusEnum {

        /**
         * Enum ENABLING for value: "Enabling"
         */
        public static final StatusEnum ENABLING = new StatusEnum("Enabling");

        /**
         * Enum ENABLE for value: "Enable"
         */
        public static final StatusEnum ENABLE = new StatusEnum("Enable");

        /**
         * Enum ENABLEFAILED for value: "EnableFailed"
         */
        public static final StatusEnum ENABLEFAILED = new StatusEnum("EnableFailed");

        /**
         * Enum DISABLE for value: "Disable"
         */
        public static final StatusEnum DISABLE = new StatusEnum("Disable");

        /**
         * Enum DISABLING for value: "Disabling"
         */
        public static final StatusEnum DISABLING = new StatusEnum("Disabling");

        /**
         * Enum DISABLEFAILED for value: "DisableFailed"
         */
        public static final StatusEnum DISABLEFAILED = new StatusEnum("DisableFailed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Enabling", ENABLING);
            map.put("Enable", ENABLE);
            map.put("EnableFailed", ENABLEFAILED);
            map.put("Disable", DISABLE);
            map.put("Disabling", DISABLING);
            map.put("DisableFailed", DISABLEFAILED);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<IpInfo> ipList = null;

    public ShowInstanceEndpointPolicyResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 公网访问状态，Enable、Enabling、EnableFailed、Disable、Disabling、DisableFailed
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowInstanceEndpointPolicyResponse withIpList(List<IpInfo> ipList) {
        this.ipList = ipList;
        return this;
    }

    public ShowInstanceEndpointPolicyResponse addIpListItem(IpInfo ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public ShowInstanceEndpointPolicyResponse withIpList(Consumer<List<IpInfo>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * 白名单列表
     * @return ipList
     */
    public List<IpInfo> getIpList() {
        return ipList;
    }

    public void setIpList(List<IpInfo> ipList) {
        this.ipList = ipList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceEndpointPolicyResponse that = (ShowInstanceEndpointPolicyResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.ipList, that.ipList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, ipList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceEndpointPolicyResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
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
