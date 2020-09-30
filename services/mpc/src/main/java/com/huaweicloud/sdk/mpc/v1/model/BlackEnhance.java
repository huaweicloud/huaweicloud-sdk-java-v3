package com.huaweicloud.sdk.mpc.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BlackEnhance
 */
public class BlackEnhance  {

    /**
     * 提前反馈“疑似黑边”开关，取值为on或off。 
     */
    public static final class EarlyReportEnum {

        
        /**
         * Enum ON for value: "on"
         */
        public static final EarlyReportEnum ON = new EarlyReportEnum("on");
        
        /**
         * Enum OFF for value: "off"
         */
        public static final EarlyReportEnum OFF = new EarlyReportEnum("off");
        

        private static final Map<String, EarlyReportEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EarlyReportEnum> createStaticFields() {
            Map<String, EarlyReportEnum> map = new HashMap<>();
            map.put("on", ON);
            map.put("off", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EarlyReportEnum(String value) {
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
        public static EarlyReportEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            EarlyReportEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EarlyReportEnum(value);
            }
            return result;
        }

        public static EarlyReportEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EarlyReportEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EarlyReportEnum) {
                return this.value.equals(((EarlyReportEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="early_report")
    
    private EarlyReportEnum earlyReport;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="position")
    
    private String position;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;

    public BlackEnhance withEarlyReport(EarlyReportEnum earlyReport) {
        this.earlyReport = earlyReport;
        return this;
    }

    


    /**
     * 提前反馈“疑似黑边”开关，取值为on或off。 
     * @return earlyReport
     */
    public EarlyReportEnum getEarlyReport() {
        return earlyReport;
    }

    public void setEarlyReport(EarlyReportEnum earlyReport) {
        this.earlyReport = earlyReport;
    }

    public BlackEnhance withPosition(String position) {
        this.position = position;
        return this;
    }

    


    /**
     * 参数格式：top:bottom:left:right 
     * @return position
     */
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BlackEnhance withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 黑边剪裁检测起始时间 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlackEnhance blackEnhance = (BlackEnhance) o;
        return Objects.equals(this.earlyReport, blackEnhance.earlyReport) &&
            Objects.equals(this.position, blackEnhance.position) &&
            Objects.equals(this.startTime, blackEnhance.startTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(earlyReport, position, startTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlackEnhance {\n");
        sb.append("    earlyReport: ").append(toIndentedString(earlyReport)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

