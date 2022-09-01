package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 挂钩实例信息
 */
public class InstanceHangingInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycle_hook_name")

    @JacksonXmlProperty(localName = "lifecycle_hook_name")

    private String lifecycleHookName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycle_action_key")

    @JacksonXmlProperty(localName = "lifecycle_action_key")

    private String lifecycleActionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_group_id")

    @JacksonXmlProperty(localName = "scaling_group_id")

    private String scalingGroupId;

    /**
     * 伸缩实例挂钩的挂起状态。HANGING：挂起。CONTINUE：继续。ABANDON：终止。
     */
    public static final class LifecycleHookStatusEnum {

        /**
         * Enum HANGING for value: "HANGING"
         */
        public static final LifecycleHookStatusEnum HANGING = new LifecycleHookStatusEnum("HANGING");

        /**
         * Enum CONTINUE for value: "CONTINUE"
         */
        public static final LifecycleHookStatusEnum CONTINUE = new LifecycleHookStatusEnum("CONTINUE");

        /**
         * Enum ABANDON for value: "ABANDON"
         */
        public static final LifecycleHookStatusEnum ABANDON = new LifecycleHookStatusEnum("ABANDON");

        private static final Map<String, LifecycleHookStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LifecycleHookStatusEnum> createStaticFields() {
            Map<String, LifecycleHookStatusEnum> map = new HashMap<>();
            map.put("HANGING", HANGING);
            map.put("CONTINUE", CONTINUE);
            map.put("ABANDON", ABANDON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LifecycleHookStatusEnum(String value) {
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
        public static LifecycleHookStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LifecycleHookStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LifecycleHookStatusEnum(value);
            }
            return result;
        }

        public static LifecycleHookStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LifecycleHookStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LifecycleHookStatusEnum) {
                return this.value.equals(((LifecycleHookStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycle_hook_status")

    @JacksonXmlProperty(localName = "lifecycle_hook_status")

    private LifecycleHookStatusEnum lifecycleHookStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    @JacksonXmlProperty(localName = "timeout")

    private String timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_result")

    @JacksonXmlProperty(localName = "default_result")

    private String defaultResult;

    public InstanceHangingInfos withLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    /**
     * 生命周期挂钩名称。
     * @return lifecycleHookName
     */
    public String getLifecycleHookName() {
        return lifecycleHookName;
    }

    public void setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }

    public InstanceHangingInfos withLifecycleActionKey(String lifecycleActionKey) {
        this.lifecycleActionKey = lifecycleActionKey;
        return this;
    }

    /**
     * 生命周期操作令牌，用于指定生命周期回调对象。
     * @return lifecycleActionKey
     */
    public String getLifecycleActionKey() {
        return lifecycleActionKey;
    }

    public void setLifecycleActionKey(String lifecycleActionKey) {
        this.lifecycleActionKey = lifecycleActionKey;
    }

    public InstanceHangingInfos withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 伸缩实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceHangingInfos withScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }

    /**
     * 伸缩组ID。
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public InstanceHangingInfos withLifecycleHookStatus(LifecycleHookStatusEnum lifecycleHookStatus) {
        this.lifecycleHookStatus = lifecycleHookStatus;
        return this;
    }

    /**
     * 伸缩实例挂钩的挂起状态。HANGING：挂起。CONTINUE：继续。ABANDON：终止。
     * @return lifecycleHookStatus
     */
    public LifecycleHookStatusEnum getLifecycleHookStatus() {
        return lifecycleHookStatus;
    }

    public void setLifecycleHookStatus(LifecycleHookStatusEnum lifecycleHookStatus) {
        this.lifecycleHookStatus = lifecycleHookStatus;
    }

    public InstanceHangingInfos withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 超时时间，遵循UTC时间，格式为：YYYY-MM-DDThh:mm:ssZZ。
     * @return timeout
     */
    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public InstanceHangingInfos withDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
        return this;
    }

    /**
     * 生命周期挂钩默认回调操作。
     * @return defaultResult
     */
    public String getDefaultResult() {
        return defaultResult;
    }

    public void setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceHangingInfos instanceHangingInfos = (InstanceHangingInfos) o;
        return Objects.equals(this.lifecycleHookName, instanceHangingInfos.lifecycleHookName)
            && Objects.equals(this.lifecycleActionKey, instanceHangingInfos.lifecycleActionKey)
            && Objects.equals(this.instanceId, instanceHangingInfos.instanceId)
            && Objects.equals(this.scalingGroupId, instanceHangingInfos.scalingGroupId)
            && Objects.equals(this.lifecycleHookStatus, instanceHangingInfos.lifecycleHookStatus)
            && Objects.equals(this.timeout, instanceHangingInfos.timeout)
            && Objects.equals(this.defaultResult, instanceHangingInfos.defaultResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lifecycleHookName,
            lifecycleActionKey,
            instanceId,
            scalingGroupId,
            lifecycleHookStatus,
            timeout,
            defaultResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceHangingInfos {\n");
        sb.append("    lifecycleHookName: ").append(toIndentedString(lifecycleHookName)).append("\n");
        sb.append("    lifecycleActionKey: ").append(toIndentedString(lifecycleActionKey)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
        sb.append("    lifecycleHookStatus: ").append(toIndentedString(lifecycleHookStatus)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    defaultResult: ").append(toIndentedString(defaultResult)).append("\n");
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
