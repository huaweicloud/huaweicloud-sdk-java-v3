package com.huaweicloud.sdk.aom.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.SmnResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 发送结果
 */
public class Notifications  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_rule")
    
    
    private String actionRule;
    /**
     * 通知类型。SMN：消息通知服务
     */
    public static final class NotifierChannelEnum {

        
        /**
         * Enum SMN for value: "SMN"
         */
        public static final NotifierChannelEnum SMN = new NotifierChannelEnum("SMN");
        

        private static final Map<String, NotifierChannelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotifierChannelEnum> createStaticFields() {
            Map<String, NotifierChannelEnum> map = new HashMap<>();
            map.put("SMN", SMN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotifierChannelEnum(String value) {
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
        public static NotifierChannelEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NotifierChannelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NotifierChannelEnum(value);
            }
            return result;
        }

        public static NotifierChannelEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NotifierChannelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotifierChannelEnum) {
                return this.value.equals(((NotifierChannelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notifier_channel")
    
    
    private NotifierChannelEnum notifierChannel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_channel")
    
    
    private SmnResponse smnChannel;

    public Notifications withActionRule(String actionRule) {
        this.actionRule = actionRule;
        return this;
    }

    


    /**
     * 告警行动规则名称
     * @return actionRule
     */
    public String getActionRule() {
        return actionRule;
    }

    public void setActionRule(String actionRule) {
        this.actionRule = actionRule;
    }

    

    public Notifications withNotifierChannel(NotifierChannelEnum notifierChannel) {
        this.notifierChannel = notifierChannel;
        return this;
    }

    


    /**
     * 通知类型。SMN：消息通知服务
     * @return notifierChannel
     */
    public NotifierChannelEnum getNotifierChannel() {
        return notifierChannel;
    }

    public void setNotifierChannel(NotifierChannelEnum notifierChannel) {
        this.notifierChannel = notifierChannel;
    }

    

    public Notifications withSmnChannel(SmnResponse smnChannel) {
        this.smnChannel = smnChannel;
        return this;
    }

    public Notifications withSmnChannel(Consumer<SmnResponse> smnChannelSetter) {
        if(this.smnChannel == null ){
            this.smnChannel = new SmnResponse();
            smnChannelSetter.accept(this.smnChannel);
        }
        
        return this;
    }


    /**
     * Get smnChannel
     * @return smnChannel
     */
    public SmnResponse getSmnChannel() {
        return smnChannel;
    }

    public void setSmnChannel(SmnResponse smnChannel) {
        this.smnChannel = smnChannel;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Notifications notifications = (Notifications) o;
        return Objects.equals(this.actionRule, notifications.actionRule) &&
            Objects.equals(this.notifierChannel, notifications.notifierChannel) &&
            Objects.equals(this.smnChannel, notifications.smnChannel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(actionRule, notifierChannel, smnChannel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Notifications {\n");
        sb.append("    actionRule: ").append(toIndentedString(actionRule)).append("\n");
        sb.append("    notifierChannel: ").append(toIndentedString(notifierChannel)).append("\n");
        sb.append("    smnChannel: ").append(toIndentedString(smnChannel)).append("\n");
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

