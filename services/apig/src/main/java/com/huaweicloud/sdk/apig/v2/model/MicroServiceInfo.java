package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 微服务的响应对象
 */
public class MicroServiceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 微服务类型： - CSE：CSE微服务注册中心 - CCE：CCE云容器引擎
     */
    public static final class ServiceTypeEnum {

        /**
         * Enum CSE for value: "CSE"
         */
        public static final ServiceTypeEnum CSE = new ServiceTypeEnum("CSE");

        /**
         * Enum CCE for value: "CCE"
         */
        public static final ServiceTypeEnum CCE = new ServiceTypeEnum("CCE");

        private static final Map<String, ServiceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceTypeEnum> createStaticFields() {
            Map<String, ServiceTypeEnum> map = new HashMap<>();
            map.put("CSE", CSE);
            map.put("CCE", CCE);
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

    private ServiceTypeEnum serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cse_info")

    private MicroServiceInfoCSE cseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_info")

    private MicroServiceInfoCCE cceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    public MicroServiceInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 微服务编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MicroServiceInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例编号
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public MicroServiceInfo withServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 微服务类型： - CSE：CSE微服务注册中心 - CCE：CCE云容器引擎
     * @return serviceType
     */
    public ServiceTypeEnum getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
    }

    public MicroServiceInfo withCseInfo(MicroServiceInfoCSE cseInfo) {
        this.cseInfo = cseInfo;
        return this;
    }

    public MicroServiceInfo withCseInfo(Consumer<MicroServiceInfoCSE> cseInfoSetter) {
        if (this.cseInfo == null) {
            this.cseInfo = new MicroServiceInfoCSE();
            cseInfoSetter.accept(this.cseInfo);
        }

        return this;
    }

    /**
     * Get cseInfo
     * @return cseInfo
     */
    public MicroServiceInfoCSE getCseInfo() {
        return cseInfo;
    }

    public void setCseInfo(MicroServiceInfoCSE cseInfo) {
        this.cseInfo = cseInfo;
    }

    public MicroServiceInfo withCceInfo(MicroServiceInfoCCE cceInfo) {
        this.cceInfo = cceInfo;
        return this;
    }

    public MicroServiceInfo withCceInfo(Consumer<MicroServiceInfoCCE> cceInfoSetter) {
        if (this.cceInfo == null) {
            this.cceInfo = new MicroServiceInfoCCE();
            cceInfoSetter.accept(this.cceInfo);
        }

        return this;
    }

    /**
     * Get cceInfo
     * @return cceInfo
     */
    public MicroServiceInfoCCE getCceInfo() {
        return cceInfo;
    }

    public void setCceInfo(MicroServiceInfoCCE cceInfo) {
        this.cceInfo = cceInfo;
    }

    public MicroServiceInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 微服务更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public MicroServiceInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 微服务创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MicroServiceInfo microServiceInfo = (MicroServiceInfo) o;
        return Objects.equals(this.id, microServiceInfo.id)
            && Objects.equals(this.instanceId, microServiceInfo.instanceId)
            && Objects.equals(this.serviceType, microServiceInfo.serviceType)
            && Objects.equals(this.cseInfo, microServiceInfo.cseInfo)
            && Objects.equals(this.cceInfo, microServiceInfo.cceInfo)
            && Objects.equals(this.updateTime, microServiceInfo.updateTime)
            && Objects.equals(this.createTime, microServiceInfo.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instanceId, serviceType, cseInfo, cceInfo, updateTime, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroServiceInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    cseInfo: ").append(toIndentedString(cseInfo)).append("\n");
        sb.append("    cceInfo: ").append(toIndentedString(cceInfo)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
