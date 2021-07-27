package com.huaweicloud.sdk.live.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RecordCallbackConfig
 */
public class RecordCallbackConfig  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private LocalDate createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private LocalDate updateTime;

    public RecordCallbackConfig withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 配置id，由服务端返回。创建或修改的时候不携带
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public RecordCallbackConfig withPublishDomain(String publishDomain) {
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

    

    public RecordCallbackConfig withApp(String app) {
        this.app = app;
        return this;
    }

    


    /**
     * app名称。如果匹配任意需填写为*。录制规则匹配的时候，优先精确app匹配，如果匹配不到，则匹配*
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    

    public RecordCallbackConfig withNotifyCallbackUrl(String notifyCallbackUrl) {
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

    

    public RecordCallbackConfig withNotifyEventSubscription(List<NotifyEventSubscriptionEnum> notifyEventSubscription) {
        this.notifyEventSubscription = notifyEventSubscription;
        return this;
    }

    
    public RecordCallbackConfig addNotifyEventSubscriptionItem(NotifyEventSubscriptionEnum notifyEventSubscriptionItem) {
        if(this.notifyEventSubscription == null) {
            this.notifyEventSubscription = new ArrayList<>();
        }
        this.notifyEventSubscription.add(notifyEventSubscriptionItem);
        return this;
    }

    public RecordCallbackConfig withNotifyEventSubscription(Consumer<List<NotifyEventSubscriptionEnum>> notifyEventSubscriptionSetter) {
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

    

    public RecordCallbackConfig withOnDemandCallbackUrl(String onDemandCallbackUrl) {
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

    

    public RecordCallbackConfig withCreateTime(LocalDate createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间，格式：yyyy-mm-ddThh:mm:ssZ，UTC时间。 在查询的时候返回
     * @return createTime
     */
    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    

    public RecordCallbackConfig withUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 修改时间，格式：yyyy-mm-ddThh:mm:ssZ，UTC时间。 在查询的时候返回
     * @return updateTime
     */
    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordCallbackConfig recordCallbackConfig = (RecordCallbackConfig) o;
        return Objects.equals(this.id, recordCallbackConfig.id) &&
            Objects.equals(this.publishDomain, recordCallbackConfig.publishDomain) &&
            Objects.equals(this.app, recordCallbackConfig.app) &&
            Objects.equals(this.notifyCallbackUrl, recordCallbackConfig.notifyCallbackUrl) &&
            Objects.equals(this.notifyEventSubscription, recordCallbackConfig.notifyEventSubscription) &&
            Objects.equals(this.onDemandCallbackUrl, recordCallbackConfig.onDemandCallbackUrl) &&
            Objects.equals(this.createTime, recordCallbackConfig.createTime) &&
            Objects.equals(this.updateTime, recordCallbackConfig.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, publishDomain, app, notifyCallbackUrl, notifyEventSubscription, onDemandCallbackUrl, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordCallbackConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    notifyCallbackUrl: ").append(toIndentedString(notifyCallbackUrl)).append("\n");
        sb.append("    notifyEventSubscription: ").append(toIndentedString(notifyEventSubscription)).append("\n");
        sb.append("    onDemandCallbackUrl: ").append(toIndentedString(onDemandCallbackUrl)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

