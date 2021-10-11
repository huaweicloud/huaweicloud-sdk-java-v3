package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** CheckBackendConnectivityReq */
public class CheckBackendConnectivityReq {

    /** 后端服务配置方式 backend_address - 配置后端服务地址（不使用负载通道） vpc_channel - 使用负载通道 */
    public static final class BackendTypeEnum {

        /** Enum BACKEND_ADDRESS for value: "backend_address" */
        public static final BackendTypeEnum BACKEND_ADDRESS = new BackendTypeEnum("backend_address");

        /** Enum VPC_CHANNEL for value: "vpc_channel" */
        public static final BackendTypeEnum VPC_CHANNEL = new BackendTypeEnum("vpc_channel");

        private static final Map<String, BackendTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackendTypeEnum> createStaticFields() {
            Map<String, BackendTypeEnum> map = new HashMap<>();
            map.put("backend_address", BACKEND_ADDRESS);
            map.put("vpc_channel", VPC_CHANNEL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackendTypeEnum(String value) {
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
        public static BackendTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BackendTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BackendTypeEnum(value);
            }
            return result;
        }

        public static BackendTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BackendTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackendTypeEnum) {
                return this.value.equals(((BackendTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_type")

    private BackendTypeEnum backendType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_address")

    private String backendAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_id")

    private String vpcChannelId;

    public CheckBackendConnectivityReq withBackendType(BackendTypeEnum backendType) {
        this.backendType = backendType;
        return this;
    }

    /** 后端服务配置方式 backend_address - 配置后端服务地址（不使用负载通道） vpc_channel - 使用负载通道
     * 
     * @return backendType */
    public BackendTypeEnum getBackendType() {
        return backendType;
    }

    public void setBackendType(BackendTypeEnum backendType) {
        this.backendType = backendType;
    }

    public CheckBackendConnectivityReq withBackendAddress(String backendAddress) {
        this.backendAddress = backendAddress;
        return this;
    }

    /** 后端服务地址，当type为backend_address时必填
     * 
     * @return backendAddress */
    public String getBackendAddress() {
        return backendAddress;
    }

    public void setBackendAddress(String backendAddress) {
        this.backendAddress = backendAddress;
    }

    public CheckBackendConnectivityReq withVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
        return this;
    }

    /** 负载通道编号，当type为vpc_channel时必填
     * 
     * @return vpcChannelId */
    public String getVpcChannelId() {
        return vpcChannelId;
    }

    public void setVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckBackendConnectivityReq checkBackendConnectivityReq = (CheckBackendConnectivityReq) o;
        return Objects.equals(this.backendType, checkBackendConnectivityReq.backendType)
            && Objects.equals(this.backendAddress, checkBackendConnectivityReq.backendAddress)
            && Objects.equals(this.vpcChannelId, checkBackendConnectivityReq.vpcChannelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backendType, backendAddress, vpcChannelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckBackendConnectivityReq {\n");
        sb.append("    backendType: ").append(toIndentedString(backendType)).append("\n");
        sb.append("    backendAddress: ").append(toIndentedString(backendAddress)).append("\n");
        sb.append("    vpcChannelId: ").append(toIndentedString(vpcChannelId)).append("\n");
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
