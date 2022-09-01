package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ListServiceDescribeDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    @JacksonXmlProperty(localName = "service_name")

    private String serviceName;

    /**
     * 终端节点服务类型。仅支持将用户私有服务创 建为interface类型的终端节点服务。 ● gataway：由运维人员配置。用户无需创 建，可直接使用。 ● interface：包括运维人员配置的云服务和 用户自己创建的私有服务。其中，运维人 员配置的云服务无需创建，用户可直接使 用。 您可以通过创建终端节点创建访问Gateway和 Interface类型终端节点服务的终端节点。
     */
    public static final class ServiceTypeEnum {

        /**
         * Enum INTERFACE for value: "interface"
         */
        public static final ServiceTypeEnum INTERFACE = new ServiceTypeEnum("interface");

        private static final Map<String, ServiceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceTypeEnum> createStaticFields() {
            Map<String, ServiceTypeEnum> map = new HashMap<>();
            map.put("interface", INTERFACE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServiceTypeEnum(String value) {
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
        public static ServiceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ServiceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ServiceTypeEnum(value);
            }
            return result;
        }

        public static ServiceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ServiceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServiceTypeEnum) {
                return this.value.equals(((ServiceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    @JacksonXmlProperty(localName = "service_type")

    private ServiceTypeEnum serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_charge")

    @JacksonXmlProperty(localName = "is_charge")

    private Boolean isCharge;

    public ListServiceDescribeDetailsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 终端节点服务的ID，唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListServiceDescribeDetailsResponse withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 终端节点服务的名称。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ListServiceDescribeDetailsResponse withServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 终端节点服务类型。仅支持将用户私有服务创 建为interface类型的终端节点服务。 ● gataway：由运维人员配置。用户无需创 建，可直接使用。 ● interface：包括运维人员配置的云服务和 用户自己创建的私有服务。其中，运维人 员配置的云服务无需创建，用户可直接使 用。 您可以通过创建终端节点创建访问Gateway和 Interface类型终端节点服务的终端节点。
     * @return serviceType
     */
    public ServiceTypeEnum getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
    }

    public ListServiceDescribeDetailsResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 终端节点服务的创建时间。 采用UTC时间格式，格式为：YYYY-MMDDTHH: MM:SSZ
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListServiceDescribeDetailsResponse withIsCharge(Boolean isCharge) {
        this.isCharge = isCharge;
        return this;
    }

    /**
     * 连接该终端节点服务的终端节点是否计费。 ● true：计费 ● false：不计费
     * @return isCharge
     */
    public Boolean getIsCharge() {
        return isCharge;
    }

    public void setIsCharge(Boolean isCharge) {
        this.isCharge = isCharge;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServiceDescribeDetailsResponse listServiceDescribeDetailsResponse = (ListServiceDescribeDetailsResponse) o;
        return Objects.equals(this.id, listServiceDescribeDetailsResponse.id)
            && Objects.equals(this.serviceName, listServiceDescribeDetailsResponse.serviceName)
            && Objects.equals(this.serviceType, listServiceDescribeDetailsResponse.serviceType)
            && Objects.equals(this.createdAt, listServiceDescribeDetailsResponse.createdAt)
            && Objects.equals(this.isCharge, listServiceDescribeDetailsResponse.isCharge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceName, serviceType, createdAt, isCharge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceDescribeDetailsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    isCharge: ").append(toIndentedString(isCharge)).append("\n");
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
