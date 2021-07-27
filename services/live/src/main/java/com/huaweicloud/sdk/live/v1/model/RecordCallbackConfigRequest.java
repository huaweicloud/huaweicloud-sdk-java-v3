package com.huaweicloud.sdk.live.v1.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RecordCallbackConfigRequest
 */
public class RecordCallbackConfigRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_domain")
    
    private String publishDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app")
    
    private String app;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notify_callback_url")
    
    private String notifyCallbackUrl;
    /**
     * Gets or Sets notifyEventSubscription
     */
    public static final class NotifyEventSubscriptionEnum {

        
        /**
         * Enum RECORD_NEW_FILE_START for value: "RECORD_NEW_FILE_START"
         */
        public static final NotifyEventSubscriptionEnum RECORD_NEW_FILE_START = new NotifyEventSubscriptionEnum("RECORD_NEW_FILE_START");
        
        /**
         * Enum RECORD_FILE_COMPLETE for value: "RECORD_FILE_COMPLETE"
         */
        public static final NotifyEventSubscriptionEnum RECORD_FILE_COMPLETE = new NotifyEventSubscriptionEnum("RECORD_FILE_COMPLETE");
        
        /**
         * Enum RECORD_OVER for value: "RECORD_OVER"
         */
        public static final NotifyEventSubscriptionEnum RECORD_OVER = new NotifyEventSubscriptionEnum("RECORD_OVER");
        
        /**
         * Enum RECORD_FAILED for value: "RECORD_FAILED"
         */
        public static final NotifyEventSubscriptionEnum RECORD_FAILED = new NotifyEventSubscriptionEnum("RECORD_FAILED");
        

        private static final Map<String, NotifyEventSubscriptionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotifyEventSubscriptionEnum> createStaticFields() {
            Map<String, NotifyEventSubscriptionEnum> map = new HashMap<>();
            map.put("RECORD_NEW_FILE_START", RECORD_NEW_FILE_START);
            map.put("RECORD_FILE_COMPLETE", RECORD_FILE_COMPLETE);
            map.put("RECORD_OVER", RECORD_OVER);
            map.put("RECORD_FAILED", RECORD_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotifyEventSubscriptionEnum(String value) {
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
        public static NotifyEventSubscriptionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NotifyEventSubscriptionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NotifyEventSubscriptionEnum(value);
            }
            return result;
        }

        public static NotifyEventSubscriptionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NotifyEventSubscriptionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotifyEventSubscriptionEnum) {
                return this.value.equals(((NotifyEventSubscriptionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notify_event_subscription")
    
    private List<NotifyEventSubscriptionEnum> notifyEventSubscription = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="on_demand_callback_url")
    
    private String onDemandCallbackUrl;
    /**
     * 加密类型
     */
    public static final class SignTypeEnum {

        
        /**
         * Enum MD5 for value: "MD5"
         */
        public static final SignTypeEnum MD5 = new SignTypeEnum("MD5");
        
        /**
         * Enum HMACSHA256 for value: "HMACSHA256"
         */
        public static final SignTypeEnum HMACSHA256 = new SignTypeEnum("HMACSHA256");
        

        private static final Map<String, SignTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SignTypeEnum> createStaticFields() {
            Map<String, SignTypeEnum> map = new HashMap<>();
            map.put("MD5", MD5);
            map.put("HMACSHA256", HMACSHA256);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SignTypeEnum(String value) {
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
        public static SignTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SignTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SignTypeEnum(value);
            }
            return result;
        }

        public static SignTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SignTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SignTypeEnum) {
                return this.value.equals(((SignTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_type")
    
    private SignTypeEnum signType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;

    public RecordCallbackConfigRequest withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    


    /**
     * 直播推流域名
     * @return publishDomain
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    

    public RecordCallbackConfigRequest withApp(String app) {
        this.app = app;
        return this;
    }

    


    /**
     * app名称。如果需要匹配任意应用则需填写*。录制规则匹配的时候，优先精确app匹配，如果匹配不到，则匹配*
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    

    public RecordCallbackConfigRequest withNotifyCallbackUrl(String notifyCallbackUrl) {
        this.notifyCallbackUrl = notifyCallbackUrl;
        return this;
    }

    


    /**
     * 录制回调通知url地址
     * @return notifyCallbackUrl
     */
    public String getNotifyCallbackUrl() {
        return notifyCallbackUrl;
    }

    public void setNotifyCallbackUrl(String notifyCallbackUrl) {
        this.notifyCallbackUrl = notifyCallbackUrl;
    }

    

    public RecordCallbackConfigRequest withNotifyEventSubscription(List<NotifyEventSubscriptionEnum> notifyEventSubscription) {
        this.notifyEventSubscription = notifyEventSubscription;
        return this;
    }

    
    public RecordCallbackConfigRequest addNotifyEventSubscriptionItem(NotifyEventSubscriptionEnum notifyEventSubscriptionItem) {
        if(this.notifyEventSubscription == null) {
            this.notifyEventSubscription = new ArrayList<>();
        }
        this.notifyEventSubscription.add(notifyEventSubscriptionItem);
        return this;
    }

    public RecordCallbackConfigRequest withNotifyEventSubscription(Consumer<List<NotifyEventSubscriptionEnum>> notifyEventSubscriptionSetter) {
        if(this.notifyEventSubscription == null) {
            this.notifyEventSubscription = new ArrayList<>();
        }
        notifyEventSubscriptionSetter.accept(this.notifyEventSubscription);
        return this;
    }

    /**
     * 订阅录制通知消息。消息类型。RECORD_NEW_FILE_START开始创建新的录制文件。RECORD_FILE_COMPLETE录制文件生成完成。RECORD_OVER录制结束。RECORD_FAILED表示录制失败。如果不填写,默认订阅RECORD_FILE_COMPLETE
     * @return notifyEventSubscription
     */
    public List<NotifyEventSubscriptionEnum> getNotifyEventSubscription() {
        return notifyEventSubscription;
    }

    public void setNotifyEventSubscription(List<NotifyEventSubscriptionEnum> notifyEventSubscription) {
        this.notifyEventSubscription = notifyEventSubscription;
    }

    

    public RecordCallbackConfigRequest withOnDemandCallbackUrl(String onDemandCallbackUrl) {
        this.onDemandCallbackUrl = onDemandCallbackUrl;
        return this;
    }

    


    /**
     * 按需录制回调url地址
     * @return onDemandCallbackUrl
     */
    public String getOnDemandCallbackUrl() {
        return onDemandCallbackUrl;
    }

    public void setOnDemandCallbackUrl(String onDemandCallbackUrl) {
        this.onDemandCallbackUrl = onDemandCallbackUrl;
    }

    

    public RecordCallbackConfigRequest withSignType(SignTypeEnum signType) {
        this.signType = signType;
        return this;
    }

    


    /**
     * 加密类型
     * @return signType
     */
    public SignTypeEnum getSignType() {
        return signType;
    }

    public void setSignType(SignTypeEnum signType) {
        this.signType = signType;
    }

    

    public RecordCallbackConfigRequest withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 回调秘钥，主要用于鉴权。为了保护用户数据信息安全，建议填写。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordCallbackConfigRequest recordCallbackConfigRequest = (RecordCallbackConfigRequest) o;
        return Objects.equals(this.publishDomain, recordCallbackConfigRequest.publishDomain) &&
            Objects.equals(this.app, recordCallbackConfigRequest.app) &&
            Objects.equals(this.notifyCallbackUrl, recordCallbackConfigRequest.notifyCallbackUrl) &&
            Objects.equals(this.notifyEventSubscription, recordCallbackConfigRequest.notifyEventSubscription) &&
            Objects.equals(this.onDemandCallbackUrl, recordCallbackConfigRequest.onDemandCallbackUrl) &&
            Objects.equals(this.signType, recordCallbackConfigRequest.signType) &&
            Objects.equals(this.key, recordCallbackConfigRequest.key);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publishDomain, app, notifyCallbackUrl, notifyEventSubscription, onDemandCallbackUrl, signType, key);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordCallbackConfigRequest {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    notifyCallbackUrl: ").append(toIndentedString(notifyCallbackUrl)).append("\n");
        sb.append("    notifyEventSubscription: ").append(toIndentedString(notifyEventSubscription)).append("\n");
        sb.append("    onDemandCallbackUrl: ").append(toIndentedString(onDemandCallbackUrl)).append("\n");
        sb.append("    signType: ").append(toIndentedString(signType)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

