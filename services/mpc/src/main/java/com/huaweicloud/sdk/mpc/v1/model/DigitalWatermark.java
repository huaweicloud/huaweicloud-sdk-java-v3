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
 * DigitalWatermark
 */
public class DigitalWatermark  {

    /**
     * 数字水印属性。 - ROBUST：水印鲁棒性最高 - MEDIUM：水印鲁棒性和视频质量折中(默认，暂时只支持该选项) - QUALITY：视频质量最好 - MEZZ：具有最高感官质量的水印 - CAMCORDING：最强大的水印配置文件，支持摄录攻击 
     */
    public static final class ProfileEnum {

        
        /**
         * Enum ROBUST for value: "ROBUST"
         */
        public static final ProfileEnum ROBUST = new ProfileEnum("ROBUST");
        
        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final ProfileEnum MEDIUM = new ProfileEnum("MEDIUM");
        
        /**
         * Enum QUALITY for value: "QUALITY"
         */
        public static final ProfileEnum QUALITY = new ProfileEnum("QUALITY");
        
        /**
         * Enum MEZZ for value: "MEZZ"
         */
        public static final ProfileEnum MEZZ = new ProfileEnum("MEZZ");
        
        /**
         * Enum CAMCORDING for value: "CAMCORDING"
         */
        public static final ProfileEnum CAMCORDING = new ProfileEnum("CAMCORDING");
        

        private static final Map<String, ProfileEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProfileEnum> createStaticFields() {
            Map<String, ProfileEnum> map = new HashMap<>();
            map.put("ROBUST", ROBUST);
            map.put("MEDIUM", MEDIUM);
            map.put("QUALITY", QUALITY);
            map.put("MEZZ", MEZZ);
            map.put("CAMCORDING", CAMCORDING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProfileEnum(String value) {
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
        public static ProfileEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProfileEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProfileEnum(value);
            }
            return result;
        }

        public static ProfileEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProfileEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProfileEnum) {
                return this.value.equals(((ProfileEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="profile")
    
    private ProfileEnum profile;

    public DigitalWatermark withProfile(ProfileEnum profile) {
        this.profile = profile;
        return this;
    }

    


    /**
     * 数字水印属性。 - ROBUST：水印鲁棒性最高 - MEDIUM：水印鲁棒性和视频质量折中(默认，暂时只支持该选项) - QUALITY：视频质量最好 - MEZZ：具有最高感官质量的水印 - CAMCORDING：最强大的水印配置文件，支持摄录攻击 
     * @return profile
     */
    public ProfileEnum getProfile() {
        return profile;
    }

    public void setProfile(ProfileEnum profile) {
        this.profile = profile;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DigitalWatermark digitalWatermark = (DigitalWatermark) o;
        return Objects.equals(this.profile, digitalWatermark.profile);
    }
    @Override
    public int hashCode() {
        return Objects.hash(profile);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DigitalWatermark {\n");
        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

