package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 物理专线更新参数
 */
public class UpdateDirectConnect {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_location")

    private String peerLocation;

    /**
     * 更新资源状态，合法值是：PENDING_PAY
     */
    public static final class StatusEnum {

        /**
         * Enum PENDING_PAY for value: "PENDING_PAY"
         */
        public static final StatusEnum PENDING_PAY = new StatusEnum("PENDING_PAY");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("PENDING_PAY", PENDING_PAY);
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

    /**
     * 更新运营商状态，合法值是：ACTIVE,DOWN
     */
    public static final class ProviderStatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final ProviderStatusEnum ACTIVE = new ProviderStatusEnum("ACTIVE");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final ProviderStatusEnum DOWN = new ProviderStatusEnum("DOWN");

        private static final Map<String, ProviderStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderStatusEnum> createStaticFields() {
            Map<String, ProviderStatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("DOWN", DOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderStatusEnum(String value) {
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
        public static ProviderStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProviderStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProviderStatusEnum(value);
            }
            return result;
        }

        public static ProviderStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProviderStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderStatusEnum) {
                return this.value.equals(((ProviderStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_status")

    private ProviderStatusEnum providerStatus;

    public UpdateDirectConnect withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 物理专线的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateDirectConnect withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 物理专线的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateDirectConnect withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 指定托管专线接入带宽,单位Mbps
     * minimum: 2
     * maximum: 100000
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public UpdateDirectConnect withPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }

    /**
     * 物理专线对端所在的物理位置，省/市/街道或IDC名字
     * @return peerLocation
     */
    public String getPeerLocation() {
        return peerLocation;
    }

    public void setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
    }

    public UpdateDirectConnect withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 更新资源状态，合法值是：PENDING_PAY
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateDirectConnect withProviderStatus(ProviderStatusEnum providerStatus) {
        this.providerStatus = providerStatus;
        return this;
    }

    /**
     * 更新运营商状态，合法值是：ACTIVE,DOWN
     * @return providerStatus
     */
    public ProviderStatusEnum getProviderStatus() {
        return providerStatus;
    }

    public void setProviderStatus(ProviderStatusEnum providerStatus) {
        this.providerStatus = providerStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDirectConnect updateDirectConnect = (UpdateDirectConnect) o;
        return Objects.equals(this.name, updateDirectConnect.name)
            && Objects.equals(this.description, updateDirectConnect.description)
            && Objects.equals(this.bandwidth, updateDirectConnect.bandwidth)
            && Objects.equals(this.peerLocation, updateDirectConnect.peerLocation)
            && Objects.equals(this.status, updateDirectConnect.status)
            && Objects.equals(this.providerStatus, updateDirectConnect.providerStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, bandwidth, peerLocation, status, providerStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDirectConnect {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    peerLocation: ").append(toIndentedString(peerLocation)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    providerStatus: ").append(toIndentedString(providerStatus)).append("\n");
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
