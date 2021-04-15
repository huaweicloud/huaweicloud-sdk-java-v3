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
 * VideoExtendSettings
 */
public class VideoExtendSettings  {

    /**
     * 扩展编码质量等级，用于覆盖模板中的同名参数。取值如下： - SPEED - HIGHQUALITY 
     */
    public static final class PresetEnum {

        
        /**
         * Enum SPEED for value: "SPEED"
         */
        public static final PresetEnum SPEED = new PresetEnum("SPEED");
        
        /**
         * Enum HIGHQUALITY for value: "HIGHQUALITY"
         */
        public static final PresetEnum HIGHQUALITY = new PresetEnum("HIGHQUALITY");
        

        private static final Map<String, PresetEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PresetEnum> createStaticFields() {
            Map<String, PresetEnum> map = new HashMap<>();
            map.put("SPEED", SPEED);
            map.put("HIGHQUALITY", HIGHQUALITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PresetEnum(String value) {
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
        public static PresetEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PresetEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PresetEnum(value);
            }
            return result;
        }

        public static PresetEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PresetEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PresetEnum) {
                return this.value.equals(((PresetEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preset")
    
    private PresetEnum preset;

    public VideoExtendSettings withPreset(PresetEnum preset) {
        this.preset = preset;
        return this;
    }

    


    /**
     * 扩展编码质量等级，用于覆盖模板中的同名参数。取值如下： - SPEED - HIGHQUALITY 
     * @return preset
     */
    public PresetEnum getPreset() {
        return preset;
    }

    public void setPreset(PresetEnum preset) {
        this.preset = preset;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoExtendSettings videoExtendSettings = (VideoExtendSettings) o;
        return Objects.equals(this.preset, videoExtendSettings.preset);
    }
    @Override
    public int hashCode() {
        return Objects.hash(preset);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoExtendSettings {\n");
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
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

