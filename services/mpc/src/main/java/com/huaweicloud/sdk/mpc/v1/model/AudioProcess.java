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
 * AudioProcess
 */
public class AudioProcess  {

    /**
     * 音量调整方式： - auto：表示自动调整音量。 - dynamic：表示人为调整，需设定音量调整幅值。 
     */
    public static class VolumeEnum {

        
        /**
         * Enum AUTO for value: "auto"
         */
        public static final VolumeEnum AUTO = new VolumeEnum("auto");
        
        /**
         * Enum DYNAMIC for value: "dynamic"
         */
        public static final VolumeEnum DYNAMIC = new VolumeEnum("dynamic");
        

        public static final Map<String, VolumeEnum> staticFields = new HashMap<String, VolumeEnum>() {
            { 
                put("auto", AUTO);
                put("dynamic", DYNAMIC);
            }
        };

        private String value;

        VolumeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VolumeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            VolumeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new VolumeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static VolumeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VolumeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof VolumeEnum) {
                return this.value.equals(((VolumeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    
    private VolumeEnum volume;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_expr")
    
    private Integer volumeExpr;

    public AudioProcess withVolume(VolumeEnum volume) {
        this.volume = volume;
        return this;
    }

    


    /**
     * 音量调整方式： - auto：表示自动调整音量。 - dynamic：表示人为调整，需设定音量调整幅值。 
     * @return volume
     */
    public VolumeEnum getVolume() {
        return volume;
    }

    public void setVolume(VolumeEnum volume) {
        this.volume = volume;
    }

    public AudioProcess withVolumeExpr(Integer volumeExpr) {
        this.volumeExpr = volumeExpr;
        return this;
    }

    


    /**
     * 音量调整幅值，需指定volume为dynamic。  取值范围：[-15,15]  单位：dB 
     * minimum: -15
     * maximum: 15
     * @return volumeExpr
     */
    public Integer getVolumeExpr() {
        return volumeExpr;
    }

    public void setVolumeExpr(Integer volumeExpr) {
        this.volumeExpr = volumeExpr;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioProcess audioProcess = (AudioProcess) o;
        return Objects.equals(this.volume, audioProcess.volume) &&
            Objects.equals(this.volumeExpr, audioProcess.volumeExpr);
    }
    @Override
    public int hashCode() {
        return Objects.hash(volume, volumeExpr);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioProcess {\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    volumeExpr: ").append(toIndentedString(volumeExpr)).append("\n");
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

