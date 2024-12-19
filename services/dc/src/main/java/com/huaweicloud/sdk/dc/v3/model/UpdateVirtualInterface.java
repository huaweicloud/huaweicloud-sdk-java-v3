package com.huaweicloud.sdk.dc.v3.model;

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
 * 虚拟接口更新对象
 */
public class UpdateVirtualInterface {

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
    @JsonProperty(value = "remote_ep_group")

    private List<String> remoteEpGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_ep_group")

    private List<String> serviceEpGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_bfd")

    private Boolean enableBfd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_nqa")

    private Boolean enableNqa;

    /**
     * 对其他租户创建的虚拟接口进行确认,可以是ACCEPTED和REJECTED
     */
    public static final class StatusEnum {

        /**
         * Enum ACCEPTED for value: "ACCEPTED"
         */
        public static final StatusEnum ACCEPTED = new StatusEnum("ACCEPTED");

        /**
         * Enum REJECTED for value: "REJECTED"
         */
        public static final StatusEnum REJECTED = new StatusEnum("REJECTED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACCEPTED", ACCEPTED);
            map.put("REJECTED", REJECTED);
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

    public UpdateVirtualInterface withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 虚拟接口名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateVirtualInterface withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 虚拟接口描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateVirtualInterface withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 虚拟接口带宽配置
     * minimum: 2
     * maximum: 2147483647
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public UpdateVirtualInterface withRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
        return this;
    }

    public UpdateVirtualInterface addRemoteEpGroupItem(String remoteEpGroupItem) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        this.remoteEpGroup.add(remoteEpGroupItem);
        return this;
    }

    public UpdateVirtualInterface withRemoteEpGroup(Consumer<List<String>> remoteEpGroupSetter) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        remoteEpGroupSetter.accept(this.remoteEpGroup);
        return this;
    }

    /**
     * 远端子网列表，记录租户侧的cidrs
     * @return remoteEpGroup
     */
    public List<String> getRemoteEpGroup() {
        return remoteEpGroup;
    }

    public void setRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
    }

    public UpdateVirtualInterface withServiceEpGroup(List<String> serviceEpGroup) {
        this.serviceEpGroup = serviceEpGroup;
        return this;
    }

    public UpdateVirtualInterface addServiceEpGroupItem(String serviceEpGroupItem) {
        if (this.serviceEpGroup == null) {
            this.serviceEpGroup = new ArrayList<>();
        }
        this.serviceEpGroup.add(serviceEpGroupItem);
        return this;
    }

    public UpdateVirtualInterface withServiceEpGroup(Consumer<List<String>> serviceEpGroupSetter) {
        if (this.serviceEpGroup == null) {
            this.serviceEpGroup = new ArrayList<>();
        }
        serviceEpGroupSetter.accept(this.serviceEpGroup);
        return this;
    }

    /**
     * 用于公网专线,用户访问公网服务地址列表。[（预留字段，暂不支持）](tag:dt)
     * @return serviceEpGroup
     */
    public List<String> getServiceEpGroup() {
        return serviceEpGroup;
    }

    public void setServiceEpGroup(List<String> serviceEpGroup) {
        this.serviceEpGroup = serviceEpGroup;
    }

    public UpdateVirtualInterface withEnableBfd(Boolean enableBfd) {
        this.enableBfd = enableBfd;
        return this;
    }

    /**
     * 是否使能bfd功能：true或false。[（预留字段，暂不支持）](tag:dt)
     * @return enableBfd
     */
    public Boolean getEnableBfd() {
        return enableBfd;
    }

    public void setEnableBfd(Boolean enableBfd) {
        this.enableBfd = enableBfd;
    }

    public UpdateVirtualInterface withEnableNqa(Boolean enableNqa) {
        this.enableNqa = enableNqa;
        return this;
    }

    /**
     * 是否使能nqa功能：true或false。[（预留字段，暂不支持）](tag:dt)
     * @return enableNqa
     */
    public Boolean getEnableNqa() {
        return enableNqa;
    }

    public void setEnableNqa(Boolean enableNqa) {
        this.enableNqa = enableNqa;
    }

    public UpdateVirtualInterface withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 对其他租户创建的虚拟接口进行确认,可以是ACCEPTED和REJECTED
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVirtualInterface that = (UpdateVirtualInterface) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.bandwidth, that.bandwidth) && Objects.equals(this.remoteEpGroup, that.remoteEpGroup)
            && Objects.equals(this.serviceEpGroup, that.serviceEpGroup)
            && Objects.equals(this.enableBfd, that.enableBfd) && Objects.equals(this.enableNqa, that.enableNqa)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, bandwidth, remoteEpGroup, serviceEpGroup, enableBfd, enableNqa, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVirtualInterface {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    remoteEpGroup: ").append(toIndentedString(remoteEpGroup)).append("\n");
        sb.append("    serviceEpGroup: ").append(toIndentedString(serviceEpGroup)).append("\n");
        sb.append("    enableBfd: ").append(toIndentedString(enableBfd)).append("\n");
        sb.append("    enableNqa: ").append(toIndentedString(enableNqa)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
