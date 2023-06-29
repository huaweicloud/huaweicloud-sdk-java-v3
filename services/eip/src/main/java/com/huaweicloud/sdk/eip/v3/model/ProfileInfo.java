package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 公网IP元数据, EIP服务内部使用，不对外开放
 */
public class ProfileInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_network_port")

    private String localNetworkPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standalone")

    private Boolean standalone;

    /**
     * 云服务标识公网IP创建进度, EIP服务内部使用。
     */
    public static final class NotifyStatusEnum {

        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final NotifyStatusEnum PENDING_CREATE = new NotifyStatusEnum("PENDING_CREATE");

        /**
         * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
         */
        public static final NotifyStatusEnum PENDING_UPDATE = new NotifyStatusEnum("PENDING_UPDATE");

        /**
         * Enum NOTIFYING for value: "NOTIFYING"
         */
        public static final NotifyStatusEnum NOTIFYING = new NotifyStatusEnum("NOTIFYING");

        /**
         * Enum NOTIFYED for value: "NOTIFYED"
         */
        public static final NotifyStatusEnum NOTIFYED = new NotifyStatusEnum("NOTIFYED");

        /**
         * Enum NOTIFY_DELETE for value: "NOTIFY_DELETE"
         */
        public static final NotifyStatusEnum NOTIFY_DELETE = new NotifyStatusEnum("NOTIFY_DELETE");

        private static final Map<String, NotifyStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotifyStatusEnum> createStaticFields() {
            Map<String, NotifyStatusEnum> map = new HashMap<>();
            map.put("PENDING_CREATE", PENDING_CREATE);
            map.put("PENDING_UPDATE", PENDING_UPDATE);
            map.put("NOTIFYING", NOTIFYING);
            map.put("NOTIFYED", NOTIFYED);
            map.put("NOTIFY_DELETE", NOTIFY_DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotifyStatusEnum(String value) {
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
        public static NotifyStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotifyStatusEnum(value));
        }

        public static NotifyStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotifyStatusEnum) {
                return this.value.equals(((NotifyStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_status")

    private NotifyStatusEnum notifyStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fake_network_type")

    private Boolean fakeNetworkType;

    /**
     * 标识IP是和哪类资源一起购买的
     */
    public static final class CreateSourceEnum {

        /**
         * Enum ECS for value: "ecs"
         */
        public static final CreateSourceEnum ECS = new CreateSourceEnum("ecs");

        private static final Map<String, CreateSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CreateSourceEnum> createStaticFields() {
            Map<String, CreateSourceEnum> map = new HashMap<>();
            map.put("ecs", ECS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CreateSourceEnum(String value) {
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
        public static CreateSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CreateSourceEnum(value));
        }

        public static CreateSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CreateSourceEnum) {
                return this.value.equals(((CreateSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_source")

    private CreateSourceEnum createSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_id")

    private String ecsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    private String lockStatus;

    /**
     * 公网IP冻结状态。
     */
    public static final class FreezedStatusEnum {

        /**
         * Enum FREEZED for value: "FREEZED"
         */
        public static final FreezedStatusEnum FREEZED = new FreezedStatusEnum("FREEZED");

        /**
         * Enum UNFREEZED for value: "UNFREEZED"
         */
        public static final FreezedStatusEnum UNFREEZED = new FreezedStatusEnum("UNFREEZED");

        private static final Map<String, FreezedStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FreezedStatusEnum> createStaticFields() {
            Map<String, FreezedStatusEnum> map = new HashMap<>();
            map.put("FREEZED", FREEZED);
            map.put("UNFREEZED", UNFREEZED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FreezedStatusEnum(String value) {
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
        public static FreezedStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FreezedStatusEnum(value));
        }

        public static FreezedStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FreezedStatusEnum) {
                return this.value.equals(((FreezedStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freezed_status")

    private FreezedStatusEnum freezedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwith_info")

    private BandwidthInfoResp bandwithInfo;

    public ProfileInfo withLocalNetworkPort(String localNetworkPort) {
        this.localNetworkPort = localNetworkPort;
        return this;
    }

    /**
     * 公网IP附属的5_xxx网络（如5_bgp）中的port_id
     * @return localNetworkPort
     */
    public String getLocalNetworkPort() {
        return localNetworkPort;
    }

    public void setLocalNetworkPort(String localNetworkPort) {
        this.localNetworkPort = localNetworkPort;
    }

    public ProfileInfo withStandalone(Boolean standalone) {
        this.standalone = standalone;
        return this;
    }

    /**
     * 标识公网IP是否是和虚机一起创建的。true-独立创建；false-和虚机一起创建
     * @return standalone
     */
    public Boolean getStandalone() {
        return standalone;
    }

    public void setStandalone(Boolean standalone) {
        this.standalone = standalone;
    }

    public ProfileInfo withNotifyStatus(NotifyStatusEnum notifyStatus) {
        this.notifyStatus = notifyStatus;
        return this;
    }

    /**
     * 云服务标识公网IP创建进度, EIP服务内部使用。
     * @return notifyStatus
     */
    public NotifyStatusEnum getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(NotifyStatusEnum notifyStatus) {
        this.notifyStatus = notifyStatus;
    }

    public ProfileInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 公网IP创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ProfileInfo withFakeNetworkType(Boolean fakeNetworkType) {
        this.fakeNetworkType = fakeNetworkType;
        return this;
    }

    /**
     * 该字段仅仅用于表示eip的bgp类型是否是真实的静态sbgp * 1. 如果为true，则该eip可以切换bgp类型 * 2. 如果为false，则该eip不可以切换bgp类型
     * @return fakeNetworkType
     */
    public Boolean getFakeNetworkType() {
        return fakeNetworkType;
    }

    public void setFakeNetworkType(Boolean fakeNetworkType) {
        this.fakeNetworkType = fakeNetworkType;
    }

    public ProfileInfo withCreateSource(CreateSourceEnum createSource) {
        this.createSource = createSource;
        return this;
    }

    /**
     * 标识IP是和哪类资源一起购买的
     * @return createSource
     */
    public CreateSourceEnum getCreateSource() {
        return createSource;
    }

    public void setCreateSource(CreateSourceEnum createSource) {
        this.createSource = createSource;
    }

    public ProfileInfo withEcsId(String ecsId) {
        this.ecsId = ecsId;
        return this;
    }

    /**
     * 标识和公网IP一起购买的ecs的id
     * @return ecsId
     */
    public String getEcsId() {
        return ecsId;
    }

    public void setEcsId(String ecsId) {
        this.ecsId = ecsId;
    }

    public ProfileInfo withLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    /**
     * 公网IP加锁状态, eg:\"POLICE,LOCKED\"。POLICE-公安冻结；LOCKED-普通冻结；普通冻结细分状态：ARREAR-欠费；DELABLE-可删除；
     * @return lockStatus
     */
    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public ProfileInfo withFreezedStatus(FreezedStatusEnum freezedStatus) {
        this.freezedStatus = freezedStatus;
        return this;
    }

    /**
     * 公网IP冻结状态。
     * @return freezedStatus
     */
    public FreezedStatusEnum getFreezedStatus() {
        return freezedStatus;
    }

    public void setFreezedStatus(FreezedStatusEnum freezedStatus) {
        this.freezedStatus = freezedStatus;
    }

    public ProfileInfo withBandwithInfo(BandwidthInfoResp bandwithInfo) {
        this.bandwithInfo = bandwithInfo;
        return this;
    }

    public ProfileInfo withBandwithInfo(Consumer<BandwidthInfoResp> bandwithInfoSetter) {
        if (this.bandwithInfo == null) {
            this.bandwithInfo = new BandwidthInfoResp();
            bandwithInfoSetter.accept(this.bandwithInfo);
        }

        return this;
    }

    /**
     * Get bandwithInfo
     * @return bandwithInfo
     */
    public BandwidthInfoResp getBandwithInfo() {
        return bandwithInfo;
    }

    public void setBandwithInfo(BandwidthInfoResp bandwithInfo) {
        this.bandwithInfo = bandwithInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProfileInfo that = (ProfileInfo) obj;
        return Objects.equals(this.localNetworkPort, that.localNetworkPort)
            && Objects.equals(this.standalone, that.standalone) && Objects.equals(this.notifyStatus, that.notifyStatus)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.fakeNetworkType, that.fakeNetworkType)
            && Objects.equals(this.createSource, that.createSource) && Objects.equals(this.ecsId, that.ecsId)
            && Objects.equals(this.lockStatus, that.lockStatus)
            && Objects.equals(this.freezedStatus, that.freezedStatus)
            && Objects.equals(this.bandwithInfo, that.bandwithInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localNetworkPort,
            standalone,
            notifyStatus,
            createTime,
            fakeNetworkType,
            createSource,
            ecsId,
            lockStatus,
            freezedStatus,
            bandwithInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfileInfo {\n");
        sb.append("    localNetworkPort: ").append(toIndentedString(localNetworkPort)).append("\n");
        sb.append("    standalone: ").append(toIndentedString(standalone)).append("\n");
        sb.append("    notifyStatus: ").append(toIndentedString(notifyStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    fakeNetworkType: ").append(toIndentedString(fakeNetworkType)).append("\n");
        sb.append("    createSource: ").append(toIndentedString(createSource)).append("\n");
        sb.append("    ecsId: ").append(toIndentedString(ecsId)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    freezedStatus: ").append(toIndentedString(freezedStatus)).append("\n");
        sb.append("    bandwithInfo: ").append(toIndentedString(bandwithInfo)).append("\n");
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
