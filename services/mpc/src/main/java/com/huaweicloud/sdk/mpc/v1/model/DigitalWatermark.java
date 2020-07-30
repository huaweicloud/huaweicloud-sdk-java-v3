package com.huaweicloud.sdk.mpc.v1.model;




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
    public static class ProfileEnum {

        
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
        

        public static final Map<String, ProfileEnum> staticFields = new HashMap<String, ProfileEnum>() {
            { 
                put("ROBUST", ROBUST);
                put("MEDIUM", MEDIUM);
                put("QUALITY", QUALITY);
                put("MEZZ", MEZZ);
                put("CAMCORDING", CAMCORDING);
            }
        };

        private String value;

        ProfileEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProfileEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProfileEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ProfileEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ProfileEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProfileEnum result = staticFields.get(value);
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
    
    private ProfileEnum profile = ProfileEnum.MEDIUM;

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

