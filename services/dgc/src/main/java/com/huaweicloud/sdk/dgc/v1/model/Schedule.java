package com.huaweicloud.sdk.dgc.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dgc.v1.model.Cron;
import com.huaweicloud.sdk.dgc.v1.model.Event;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Schedule
 */
public class Schedule  {

    /**
     * Gets or Sets scheType
     */
    public static final class ScheTypeEnum {

        
        /**
         * Enum EXECUTE_ONCE for value: "EXECUTE_ONCE"
         */
        public static final ScheTypeEnum EXECUTE_ONCE = new ScheTypeEnum("EXECUTE_ONCE");
        
        /**
         * Enum CRON for value: "CRON"
         */
        public static final ScheTypeEnum CRON = new ScheTypeEnum("CRON");
        
        /**
         * Enum EVENT for value: "EVENT"
         */
        public static final ScheTypeEnum EVENT = new ScheTypeEnum("EVENT");
        

        private static final Map<String, ScheTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScheTypeEnum> createStaticFields() {
            Map<String, ScheTypeEnum> map = new HashMap<>();
            map.put("EXECUTE_ONCE", EXECUTE_ONCE);
            map.put("CRON", CRON);
            map.put("EVENT", EVENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScheTypeEnum(String value) {
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
        public static ScheTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ScheTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScheTypeEnum(value);
            }
            return result;
        }

        public static ScheTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ScheTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ScheTypeEnum) {
                return this.value.equals(((ScheTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scheType")
    
    private ScheTypeEnum scheType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cron")
    
    private Cron cron;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event")
    
    private Event event;

    public Schedule withScheType(ScheTypeEnum scheType) {
        this.scheType = scheType;
        return this;
    }

    


    /**
     * Get scheType
     * @return scheType
     */
    public ScheTypeEnum getScheType() {
        return scheType;
    }

    public void setScheType(ScheTypeEnum scheType) {
        this.scheType = scheType;
    }

    

    public Schedule withCron(Cron cron) {
        this.cron = cron;
        return this;
    }

    public Schedule withCron(Consumer<Cron> cronSetter) {
        if(this.cron == null ){
            this.cron = new Cron();
            cronSetter.accept(this.cron);
        }
        
        return this;
    }


    /**
     * Get cron
     * @return cron
     */
    public Cron getCron() {
        return cron;
    }

    public void setCron(Cron cron) {
        this.cron = cron;
    }

    

    public Schedule withEvent(Event event) {
        this.event = event;
        return this;
    }

    public Schedule withEvent(Consumer<Event> eventSetter) {
        if(this.event == null ){
            this.event = new Event();
            eventSetter.accept(this.event);
        }
        
        return this;
    }


    /**
     * Get event
     * @return event
     */
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Schedule schedule = (Schedule) o;
        return Objects.equals(this.scheType, schedule.scheType) &&
            Objects.equals(this.cron, schedule.cron) &&
            Objects.equals(this.event, schedule.event);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scheType, cron, event);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Schedule {\n");
        sb.append("    scheType: ").append(toIndentedString(scheType)).append("\n");
        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

