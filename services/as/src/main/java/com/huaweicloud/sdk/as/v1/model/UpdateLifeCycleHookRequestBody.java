package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 修改生命周期挂钩
 */
public class UpdateLifeCycleHookRequestBody  {

    /**
     * 生命周期挂钩类型。INSTANCE_TERMINATING。INSTANCE_LAUNCHING。INSTANCE_TERMINATING 类型的挂钩负责在实例终止时将实例挂起，INSTANCE_LAUNCHING 类型的挂钩则是在实例启动时将实例挂起。
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
     * 生命周期挂钩默认回调操作。默认情况下，到达超时时间后执行的操作。ABANDON；CONTINUE；如果实例正在启动，则 CONTINUE 表示用户自定义操作已成功，可将实例投入使用。否则，ABANDON 表示用户自定义操作未成功，终止实例，伸缩活动置为失败，重新创建新实例。如果实例正在终止，则 ABANDON 和 CONTINUE 都允许终止实例。不过，ABANDON 将停止其他生命周期挂钩，而 CONTINUE 将允许完成其他生命周期挂钩。该字段缺省时默认为 ABANDON。
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
    @JsonProperty(value="notification_metadata")
    
    private String notificationMetadata;

    public UpdateLifeCycleHookRequestBody withLifecycleHookType(LifecycleHookTypeEnum lifecycleHookType) {
        this.lifecycleHookType = lifecycleHookType;
        return this;
    }

    


    /**
     * 生命周期挂钩类型。INSTANCE_TERMINATING。INSTANCE_LAUNCHING。INSTANCE_TERMINATING 类型的挂钩负责在实例终止时将实例挂起，INSTANCE_LAUNCHING 类型的挂钩则是在实例启动时将实例挂起。
     * @return lifecycleHookType
     */
    public LifecycleHookTypeEnum getLifecycleHookType() {
        return lifecycleHookType;
    }

    public void setLifecycleHookType(LifecycleHookTypeEnum lifecycleHookType) {
        this.lifecycleHookType = lifecycleHookType;
    }

    public UpdateLifeCycleHookRequestBody withDefaultResult(DefaultResultEnum defaultResult) {
        this.defaultResult = defaultResult;
        return this;
    }

    


    /**
     * 生命周期挂钩默认回调操作。默认情况下，到达超时时间后执行的操作。ABANDON；CONTINUE；如果实例正在启动，则 CONTINUE 表示用户自定义操作已成功，可将实例投入使用。否则，ABANDON 表示用户自定义操作未成功，终止实例，伸缩活动置为失败，重新创建新实例。如果实例正在终止，则 ABANDON 和 CONTINUE 都允许终止实例。不过，ABANDON 将停止其他生命周期挂钩，而 CONTINUE 将允许完成其他生命周期挂钩。该字段缺省时默认为 ABANDON。
     * @return defaultResult
     */
    public DefaultResultEnum getDefaultResult() {
        return defaultResult;
    }

    public void setDefaultResult(DefaultResultEnum defaultResult) {
        this.defaultResult = defaultResult;
    }

    public UpdateLifeCycleHookRequestBody withDefaultTimeout(Integer defaultTimeout) {
        this.defaultTimeout = defaultTimeout;
        return this;
    }

    


    /**
     * 生命周期挂钩超时时间，取值范围300-86400，默认为3600，单位是秒。默认情况下，实例保持等待状态的时间。您可以延长超时时间，也可以在超时时间结束前进行 CONTINUE 或 ABANDON 操作。
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

    public UpdateLifeCycleHookRequestBody withNotificationTopicUrn(String notificationTopicUrn) {
        this.notificationTopicUrn = notificationTopicUrn;
        return this;
    }

    


    /**
     * SMN 服务中 Topic 的唯一的资源标识。为生命周期挂钩定义一个通知目标，当实例被生命周期挂钩挂起时向该通知目标发送消息。该消息包含实例的基本信息、用户自定义通知消息，以及可用于控制生命周期操作的令牌信息。
     * @return notificationTopicUrn
     */
    public String getNotificationTopicUrn() {
        return notificationTopicUrn;
    }

    public void setNotificationTopicUrn(String notificationTopicUrn) {
        this.notificationTopicUrn = notificationTopicUrn;
    }

    public UpdateLifeCycleHookRequestBody withNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
        return this;
    }

    


    /**
     * 自定义通知消息，长度不超过256位，不能包含字符< > & ' ( )当配置了通知目标时，可向其发送用户自定义的通知内容。
     * @return notificationMetadata
     */
    public String getNotificationMetadata() {
        return notificationMetadata;
    }

    public void setNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLifeCycleHookRequestBody updateLifeCycleHookRequestBody = (UpdateLifeCycleHookRequestBody) o;
        return Objects.equals(this.lifecycleHookType, updateLifeCycleHookRequestBody.lifecycleHookType) &&
            Objects.equals(this.defaultResult, updateLifeCycleHookRequestBody.defaultResult) &&
            Objects.equals(this.defaultTimeout, updateLifeCycleHookRequestBody.defaultTimeout) &&
            Objects.equals(this.notificationTopicUrn, updateLifeCycleHookRequestBody.notificationTopicUrn) &&
            Objects.equals(this.notificationMetadata, updateLifeCycleHookRequestBody.notificationMetadata);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lifecycleHookType, defaultResult, defaultTimeout, notificationTopicUrn, notificationMetadata);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLifeCycleHookRequestBody {\n");
            sb.append("    lifecycleHookType: ").append(toIndentedString(lifecycleHookType)).append("\n");
            sb.append("    defaultResult: ").append(toIndentedString(defaultResult)).append("\n");
            sb.append("    defaultTimeout: ").append(toIndentedString(defaultTimeout)).append("\n");
            sb.append("    notificationTopicUrn: ").append(toIndentedString(notificationTopicUrn)).append("\n");
            sb.append("    notificationMetadata: ").append(toIndentedString(notificationMetadata)).append("\n");
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

