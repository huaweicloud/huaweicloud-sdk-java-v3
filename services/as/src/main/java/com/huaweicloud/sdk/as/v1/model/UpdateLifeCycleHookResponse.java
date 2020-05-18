package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class UpdateLifeCycleHookResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lifecycle_hook_name")
    
    private String lifecycleHookName;
    /**
     * 生命周期挂钩类型。INSTANCE_TERMINATING;INSTANCE_LAUNCHING
     */
    public static class LifecycleHookTypeEnum {

        
        /**
         * Enum INSTANCE_TERMINATING for value: "INSTANCE_TERMINATING"
         */
        public static final LifecycleHookTypeEnum INSTANCE_TERMINATING = new LifecycleHookTypeEnum("INSTANCE_TERMINATING");

        
        /**
         * Enum INSTANCE_LAUNCHING for value: "INSTANCE_LAUNCHING"
         */
        public static final LifecycleHookTypeEnum INSTANCE_LAUNCHING = new LifecycleHookTypeEnum("INSTANCE_LAUNCHING");

        

        public static Map<String, LifecycleHookTypeEnum> staticFields =
                new HashMap<String, LifecycleHookTypeEnum>() {
                    { 
                        put("INSTANCE_TERMINATING", INSTANCE_TERMINATING);
                        put("INSTANCE_LAUNCHING", INSTANCE_LAUNCHING);
                    }
                };

        private String value;

        LifecycleHookTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LifecycleHookTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            LifecycleHookTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new LifecycleHookTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static LifecycleHookTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LifecycleHookTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof LifecycleHookTypeEnum) {
                return this.value.equals(((LifecycleHookTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lifecycle_hook_type")
    
    private LifecycleHookTypeEnum lifecycleHookType;
    /**
     * 生命周期挂钩默认回调操作。ABANDON;CONTINUE
     */
    public static class DefaultResultEnum {

        
        /**
         * Enum ABANDON for value: "ABANDON"
         */
        public static final DefaultResultEnum ABANDON = new DefaultResultEnum("ABANDON");

        
        /**
         * Enum CONTINUE for value: "CONTINUE"
         */
        public static final DefaultResultEnum CONTINUE = new DefaultResultEnum("CONTINUE");

        

        public static Map<String, DefaultResultEnum> staticFields =
                new HashMap<String, DefaultResultEnum>() {
                    { 
                        put("ABANDON", ABANDON);
                        put("CONTINUE", CONTINUE);
                    }
                };

        private String value;

        DefaultResultEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DefaultResultEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            DefaultResultEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DefaultResultEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DefaultResultEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DefaultResultEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DefaultResultEnum) {
                return this.value.equals(((DefaultResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_result")
    
    private DefaultResultEnum defaultResult;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_timeout")
    
    private Integer defaultTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notification_topic_urn")
    
    private String notificationTopicUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notification_topic_name")
    
    private String notificationTopicName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notification_metadata")
    
    private String notificationMetadata;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime = null;

    public UpdateLifeCycleHookResponse withLifecycleHookName(String lifecycleHookName) {
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

    public UpdateLifeCycleHookResponse withLifecycleHookType(LifecycleHookTypeEnum lifecycleHookType) {
        this.lifecycleHookType = lifecycleHookType;
        return this;
    }

    


    /**
     * 生命周期挂钩类型。INSTANCE_TERMINATING;INSTANCE_LAUNCHING
     * @return lifecycleHookType
     */
    public LifecycleHookTypeEnum getLifecycleHookType() {
        return lifecycleHookType;
    }

    public void setLifecycleHookType(LifecycleHookTypeEnum lifecycleHookType) {
        this.lifecycleHookType = lifecycleHookType;
    }

    public UpdateLifeCycleHookResponse withDefaultResult(DefaultResultEnum defaultResult) {
        this.defaultResult = defaultResult;
        return this;
    }

    


    /**
     * 生命周期挂钩默认回调操作。ABANDON;CONTINUE
     * @return defaultResult
     */
    public DefaultResultEnum getDefaultResult() {
        return defaultResult;
    }

    public void setDefaultResult(DefaultResultEnum defaultResult) {
        this.defaultResult = defaultResult;
    }

    public UpdateLifeCycleHookResponse withDefaultTimeout(Integer defaultTimeout) {
        this.defaultTimeout = defaultTimeout;
        return this;
    }

    


    /**
     * 生命周期挂钩超时时间，单位秒。
     * minimum: 300
     * maximum: 86400
     * @return defaultTimeout
     */
    public Integer getDefaultTimeout() {
        return defaultTimeout;
    }

    public void setDefaultTimeout(Integer defaultTimeout) {
        this.defaultTimeout = defaultTimeout;
    }

    public UpdateLifeCycleHookResponse withNotificationTopicUrn(String notificationTopicUrn) {
        this.notificationTopicUrn = notificationTopicUrn;
        return this;
    }

    


    /**
     * SMN服务中Topic的唯一的资源标识。
     * @return notificationTopicUrn
     */
    public String getNotificationTopicUrn() {
        return notificationTopicUrn;
    }

    public void setNotificationTopicUrn(String notificationTopicUrn) {
        this.notificationTopicUrn = notificationTopicUrn;
    }

    public UpdateLifeCycleHookResponse withNotificationTopicName(String notificationTopicName) {
        this.notificationTopicName = notificationTopicName;
        return this;
    }

    


    /**
     * SMN服务中Topic的资源名称。
     * @return notificationTopicName
     */
    public String getNotificationTopicName() {
        return notificationTopicName;
    }

    public void setNotificationTopicName(String notificationTopicName) {
        this.notificationTopicName = notificationTopicName;
    }

    public UpdateLifeCycleHookResponse withNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
        return this;
    }

    


    /**
     * 自定义通知消息。
     * @return notificationMetadata
     */
    public String getNotificationMetadata() {
        return notificationMetadata;
    }

    public void setNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }

    public UpdateLifeCycleHookResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 生命周期挂钩创建时间，遵循UTC时间。
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
        UpdateLifeCycleHookResponse updateLifeCycleHookResponse = (UpdateLifeCycleHookResponse) o;
        return Objects.equals(this.lifecycleHookName, updateLifeCycleHookResponse.lifecycleHookName) &&
            Objects.equals(this.lifecycleHookType, updateLifeCycleHookResponse.lifecycleHookType) &&
            Objects.equals(this.defaultResult, updateLifeCycleHookResponse.defaultResult) &&
            Objects.equals(this.defaultTimeout, updateLifeCycleHookResponse.defaultTimeout) &&
            Objects.equals(this.notificationTopicUrn, updateLifeCycleHookResponse.notificationTopicUrn) &&
            Objects.equals(this.notificationTopicName, updateLifeCycleHookResponse.notificationTopicName) &&
            Objects.equals(this.notificationMetadata, updateLifeCycleHookResponse.notificationMetadata) &&
            Objects.equals(this.createTime, updateLifeCycleHookResponse.createTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lifecycleHookName, lifecycleHookType, defaultResult, defaultTimeout, notificationTopicUrn, notificationTopicName, notificationMetadata, createTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLifeCycleHookResponse {\n");
            sb.append("    lifecycleHookName: ").append(toIndentedString(lifecycleHookName)).append("\n");
            sb.append("    lifecycleHookType: ").append(toIndentedString(lifecycleHookType)).append("\n");
            sb.append("    defaultResult: ").append(toIndentedString(defaultResult)).append("\n");
            sb.append("    defaultTimeout: ").append(toIndentedString(defaultTimeout)).append("\n");
            sb.append("    notificationTopicUrn: ").append(toIndentedString(notificationTopicUrn)).append("\n");
            sb.append("    notificationTopicName: ").append(toIndentedString(notificationTopicName)).append("\n");
            sb.append("    notificationMetadata: ").append(toIndentedString(notificationMetadata)).append("\n");
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

