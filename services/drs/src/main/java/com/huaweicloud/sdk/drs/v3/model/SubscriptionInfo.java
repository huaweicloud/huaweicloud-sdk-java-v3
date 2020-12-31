package com.huaweicloud.sdk.drs.v3.model;




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
 * 收件方式与信息体
 */
public class SubscriptionInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoints")
    
    private List<String> endpoints = new ArrayList<>();
        /**
     * 收件方式
     */
    public static final class ProtocolEnum {

        
        /**
         * Enum SMS_ for value: "sms：短信"
         */
        public static final ProtocolEnum SMS_ = new ProtocolEnum("sms：短信");
        
        /**
         * Enum EMAIL_ for value: "email：邮件"
         */
        public static final ProtocolEnum EMAIL_ = new ProtocolEnum("email：邮件");
        

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("sms：短信", SMS_);
            map.put("email：邮件", EMAIL_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtocolEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private ProtocolEnum protocol;

    public SubscriptionInfo withEndpoints(List<String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    
    public SubscriptionInfo addEndpointsItem(String endpointsItem) {
        this.endpoints.add(endpointsItem);
        return this;
    }

    public SubscriptionInfo withEndpoints(Consumer<List<String>> endpointsSetter) {
        if(this.endpoints == null ){
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * 短信或者邮件列表
     * @return endpoints
     */
    public List<String> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<String> endpoints) {
        this.endpoints = endpoints;
    }

    public SubscriptionInfo withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 收件方式
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionInfo subscriptionInfo = (SubscriptionInfo) o;
        return Objects.equals(this.endpoints, subscriptionInfo.endpoints) &&
            Objects.equals(this.protocol, subscriptionInfo.protocol);
    }
    @Override
    public int hashCode() {
        return Objects.hash(endpoints, protocol);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionInfo {\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

