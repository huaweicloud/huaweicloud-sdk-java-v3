package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** DevicesInGroup */
public class DevicesInGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private Integer deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private Integer productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    /** 设备状态 0-启用 1-禁用 */
    public static final class StatusEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
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

    /** 是否在线 0-未连接 1-在线 2-离线 */
    public static final class OnlineStatusEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final OnlineStatusEnum NUMBER_0 = new OnlineStatusEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final OnlineStatusEnum NUMBER_1 = new OnlineStatusEnum(1);

        /** Enum NUMBER_2 for value: 2 */
        public static final OnlineStatusEnum NUMBER_2 = new OnlineStatusEnum(2);

        private static final Map<Integer, OnlineStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, OnlineStatusEnum> createStaticFields() {
            Map<Integer, OnlineStatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        OnlineStatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OnlineStatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            OnlineStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OnlineStatusEnum(value);
            }
            return result;
        }

        public static OnlineStatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            OnlineStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OnlineStatusEnum) {
                return this.value.equals(((OnlineStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_status")

    private OnlineStatusEnum onlineStatus;

    public DevicesInGroup withDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /** 设备ID minimum: 1 maximum: -8446744073709551617
     * 
     * @return deviceId */
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public DevicesInGroup withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /** 设备名称
     * 
     * @return deviceName */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public DevicesInGroup withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /** 产品ID minimum: 1 maximum: -8446744073709551617
     * 
     * @return productId */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public DevicesInGroup withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /** 产品名称
     * 
     * @return productName */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public DevicesInGroup withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 设备状态 0-启用 1-禁用 minimum: 0 maximum: 10
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public DevicesInGroup withOnlineStatus(OnlineStatusEnum onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }

    /** 是否在线 0-未连接 1-在线 2-离线 minimum: 0 maximum: 10
     * 
     * @return onlineStatus */
    public OnlineStatusEnum getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(OnlineStatusEnum onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DevicesInGroup devicesInGroup = (DevicesInGroup) o;
        return Objects.equals(this.deviceId, devicesInGroup.deviceId)
            && Objects.equals(this.deviceName, devicesInGroup.deviceName)
            && Objects.equals(this.productId, devicesInGroup.productId)
            && Objects.equals(this.productName, devicesInGroup.productName)
            && Objects.equals(this.status, devicesInGroup.status)
            && Objects.equals(this.onlineStatus, devicesInGroup.onlineStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, deviceName, productId, productName, status, onlineStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevicesInGroup {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
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
