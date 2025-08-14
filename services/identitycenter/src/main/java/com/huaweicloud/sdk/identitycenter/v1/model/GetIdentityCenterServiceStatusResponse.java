package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class GetIdentityCenterServiceStatusResponse extends SdkResponse {

    /**
     * IAM身份中心服务实例状态
     */
    public static final class ServiceStatusEnum {

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final ServiceStatusEnum ENABLED = new ServiceStatusEnum("ENABLED");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final ServiceStatusEnum DISABLED = new ServiceStatusEnum("DISABLED");

        private static final Map<String, ServiceStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceStatusEnum> createStaticFields() {
            Map<String, ServiceStatusEnum> map = new HashMap<>();
            map.put("ENABLED", ENABLED);
            map.put("DISABLED", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServiceStatusEnum(String value) {
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
        public static ServiceStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServiceStatusEnum(value));
        }

        public static ServiceStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServiceStatusEnum) {
                return this.value.equals(((ServiceStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceStatus")

    private ServiceStatusEnum serviceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceStatusReasons")

    private List<String> serviceStatusReasons = null;

    public GetIdentityCenterServiceStatusResponse withServiceStatus(ServiceStatusEnum serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }

    /**
     * IAM身份中心服务实例状态
     * @return serviceStatus
     */
    public ServiceStatusEnum getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(ServiceStatusEnum serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public GetIdentityCenterServiceStatusResponse withServiceStatusReasons(List<String> serviceStatusReasons) {
        this.serviceStatusReasons = serviceStatusReasons;
        return this;
    }

    public GetIdentityCenterServiceStatusResponse addServiceStatusReasonsItem(String serviceStatusReasonsItem) {
        if (this.serviceStatusReasons == null) {
            this.serviceStatusReasons = new ArrayList<>();
        }
        this.serviceStatusReasons.add(serviceStatusReasonsItem);
        return this;
    }

    public GetIdentityCenterServiceStatusResponse withServiceStatusReasons(
        Consumer<List<String>> serviceStatusReasonsSetter) {
        if (this.serviceStatusReasons == null) {
            this.serviceStatusReasons = new ArrayList<>();
        }
        serviceStatusReasonsSetter.accept(this.serviceStatusReasons);
        return this;
    }

    /**
     * IAM身份中心服务实例状态呈现原因
     * @return serviceStatusReasons
     */
    public List<String> getServiceStatusReasons() {
        return serviceStatusReasons;
    }

    public void setServiceStatusReasons(List<String> serviceStatusReasons) {
        this.serviceStatusReasons = serviceStatusReasons;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetIdentityCenterServiceStatusResponse that = (GetIdentityCenterServiceStatusResponse) obj;
        return Objects.equals(this.serviceStatus, that.serviceStatus)
            && Objects.equals(this.serviceStatusReasons, that.serviceStatusReasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceStatus, serviceStatusReasons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetIdentityCenterServiceStatusResponse {\n");
        sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
        sb.append("    serviceStatusReasons: ").append(toIndentedString(serviceStatusReasons)).append("\n");
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
