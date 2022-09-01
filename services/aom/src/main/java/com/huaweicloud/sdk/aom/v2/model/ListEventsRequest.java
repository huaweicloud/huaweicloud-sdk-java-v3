package com.huaweicloud.sdk.aom.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.EventQueryParam2;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEventsRequest  {

    /**
     * 查询类型。type=active_alert代表查询活动告警，type=history_alert代表查询历史告警。不传或者传其他值则返回指定查询条件的所有信息。
     */
    public static final class TypeEnum {

        
        /**
         * Enum HISTORY_ALERT for value: "history_alert"
         */
        public static final TypeEnum HISTORY_ALERT = new TypeEnum("history_alert");
        
        /**
         * Enum ACTIVE_ALERT for value: "active_alert"
         */
        public static final TypeEnum ACTIVE_ALERT = new TypeEnum("active_alert");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("history_alert", HISTORY_ALERT);
            map.put("active_alert", ACTIVE_ALERT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    @JacksonXmlProperty(localName = "body")
    
    private EventQueryParam2 body;

    public ListEventsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 查询类型。type=active_alert代表查询活动告警，type=history_alert代表查询历史告警。不传或者传其他值则返回指定查询条件的所有信息。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public ListEventsRequest withBody(EventQueryParam2 body) {
        this.body = body;
        return this;
    }

    public ListEventsRequest withBody(Consumer<EventQueryParam2> bodySetter) {
        if(this.body == null ){
            this.body = new EventQueryParam2();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public EventQueryParam2 getBody() {
        return body;
    }

    public void setBody(EventQueryParam2 body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventsRequest listEventsRequest = (ListEventsRequest) o;
        return Objects.equals(this.type, listEventsRequest.type) &&
            Objects.equals(this.body, listEventsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventsRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

