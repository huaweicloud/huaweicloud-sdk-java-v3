package com.huaweicloud.sdk.cloudrtc.v2.model;

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
 * 回调配置
 */
public class AppCallbackUrl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_key")

    private String authKey;

    /**
     * Gets or Sets notifyEventSubscription
     */
    public static final class NotifyEventSubscriptionEnum {

        /**
         * Enum RECORD_NEW_FILE_START for value: "RECORD_NEW_FILE_START"
         */
        public static final NotifyEventSubscriptionEnum RECORD_NEW_FILE_START =
            new NotifyEventSubscriptionEnum("RECORD_NEW_FILE_START");

        /**
         * Enum RECORD_FILE_COMPLETE for value: "RECORD_FILE_COMPLETE"
         */
        public static final NotifyEventSubscriptionEnum RECORD_FILE_COMPLETE =
            new NotifyEventSubscriptionEnum("RECORD_FILE_COMPLETE");

        private static final Map<String, NotifyEventSubscriptionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotifyEventSubscriptionEnum> createStaticFields() {
            Map<String, NotifyEventSubscriptionEnum> map = new HashMap<>();
            map.put("RECORD_NEW_FILE_START", RECORD_NEW_FILE_START);
            map.put("RECORD_FILE_COMPLETE", RECORD_FILE_COMPLETE);
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
            if (value == null) {
                return null;
            }
            NotifyEventSubscriptionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NotifyEventSubscriptionEnum(value);
            }
            return result;
        }

        public static NotifyEventSubscriptionEnum valueOf(String value) {
            if (value == null) {
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
    @JsonProperty(value = "notify_event_subscription")

    private List<NotifyEventSubscriptionEnum> notifyEventSubscription = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public AppCallbackUrl withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 回调通知url地址，url必须以http://或https://开头，需要支持POST调用。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AppCallbackUrl withAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }

    /**
     * 回调秘钥，主要用于鉴权。如果不设置或者为空，则回调不会增加鉴权头域字段。 
     * @return authKey
     */
    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public AppCallbackUrl withNotifyEventSubscription(List<NotifyEventSubscriptionEnum> notifyEventSubscription) {
        this.notifyEventSubscription = notifyEventSubscription;
        return this;
    }

    public AppCallbackUrl addNotifyEventSubscriptionItem(NotifyEventSubscriptionEnum notifyEventSubscriptionItem) {
        if (this.notifyEventSubscription == null) {
            this.notifyEventSubscription = new ArrayList<>();
        }
        this.notifyEventSubscription.add(notifyEventSubscriptionItem);
        return this;
    }

    public AppCallbackUrl withNotifyEventSubscription(
        Consumer<List<NotifyEventSubscriptionEnum>> notifyEventSubscriptionSetter) {
        if (this.notifyEventSubscription == null) {
            this.notifyEventSubscription = new ArrayList<>();
        }
        notifyEventSubscriptionSetter.accept(this.notifyEventSubscription);
        return this;
    }

    /**
     * 订阅云端录制通知消息。  取值如下：  - RECORD_NEW_FILE_START：录制模块开始创建新的录制文件。  - RECORD_FILE_COMPLETE：录制模块已经生成录制文件。 
     * @return notifyEventSubscription
     */
    public List<NotifyEventSubscriptionEnum> getNotifyEventSubscription() {
        return notifyEventSubscription;
    }

    public void setNotifyEventSubscription(List<NotifyEventSubscriptionEnum> notifyEventSubscription) {
        this.notifyEventSubscription = notifyEventSubscription;
    }

    public AppCallbackUrl withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC。 
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
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
        AppCallbackUrl appCallbackUrl = (AppCallbackUrl) o;
        return Objects.equals(this.url, appCallbackUrl.url) && Objects.equals(this.authKey, appCallbackUrl.authKey)
            && Objects.equals(this.notifyEventSubscription, appCallbackUrl.notifyEventSubscription)
            && Objects.equals(this.updateTime, appCallbackUrl.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, authKey, notifyEventSubscription, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppCallbackUrl {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
        sb.append("    notifyEventSubscription: ").append(toIndentedString(notifyEventSubscription)).append("\n");
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
