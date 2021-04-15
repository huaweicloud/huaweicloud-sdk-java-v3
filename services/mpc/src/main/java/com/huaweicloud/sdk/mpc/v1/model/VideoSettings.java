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
 * VideoSettings
 */
public class VideoSettings  {

    /**
     * 帧率转换开关。取值范围： - ENABLED - DISABLED 
     */
    public static final class FrcEnum {

        
        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final FrcEnum ENABLED = new FrcEnum("ENABLED");
        
        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final FrcEnum DISABLED = new FrcEnum("DISABLED");
        

        private static final Map<String, FrcEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FrcEnum> createStaticFields() {
            Map<String, FrcEnum> map = new HashMap<>();
            map.put("ENABLED", ENABLED);
            map.put("DISABLED", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FrcEnum(String value) {
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
        public static FrcEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FrcEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FrcEnum(value);
            }
            return result;
        }

        public static FrcEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            FrcEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof FrcEnum) {
                return this.value.equals(((FrcEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="frc")
    
    private FrcEnum frc;

    public VideoSettings withFrc(FrcEnum frc) {
        this.frc = frc;
        return this;
    }

    


    /**
     * 帧率转换开关。取值范围： - ENABLED - DISABLED 
     * @return frc
     */
    public FrcEnum getFrc() {
        return frc;
    }

    public void setFrc(FrcEnum frc) {
        this.frc = frc;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSettings videoSettings = (VideoSettings) o;
        return Objects.equals(this.frc, videoSettings.frc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(frc);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSettings {\n");
        sb.append("    frc: ").append(toIndentedString(frc)).append("\n");
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

