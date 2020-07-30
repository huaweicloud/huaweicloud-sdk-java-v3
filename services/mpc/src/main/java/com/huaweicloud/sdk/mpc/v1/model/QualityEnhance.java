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
 * QualityEnhance
 */
public class QualityEnhance  {

    /**
     * 针对一般质量、无明显问题的普通片源，通过增强、锐化等技术明显提升主观效果。单纯该处理操作前后，分辨率、帧率等参数不发生变化。 可和old_repair、super_resolution、super_framerate、SDRToHDR组合使用。 
     */
    public static class NormalEnhanceEnum {

        
        /**
         * Enum NORMAL for value: "normal"
         */
        public static final NormalEnhanceEnum NORMAL = new NormalEnhanceEnum("normal");
        

        public static final Map<String, NormalEnhanceEnum> staticFields = new HashMap<String, NormalEnhanceEnum>() {
            { 
                put("normal", NORMAL);
            }
        };

        private String value;

        NormalEnhanceEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NormalEnhanceEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NormalEnhanceEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new NormalEnhanceEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static NormalEnhanceEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NormalEnhanceEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof NormalEnhanceEnum) {
                return this.value.equals(((NormalEnhanceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="normal_enhance")
    
    private NormalEnhanceEnum normalEnhance;
    /**
     * 针对旧片、老片，画质主观质量比较低的片源，通过降噪、去压缩失真等视频增强技术，提升画质主观效果。 
     */
    public static class ReviveEnum {

        
        /**
         * Enum NORMAL for value: "normal"
         */
        public static final ReviveEnum NORMAL = new ReviveEnum("normal");
        

        public static final Map<String, ReviveEnum> staticFields = new HashMap<String, ReviveEnum>() {
            { 
                put("normal", NORMAL);
            }
        };

        private String value;

        ReviveEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReviveEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ReviveEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ReviveEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ReviveEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ReviveEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ReviveEnum) {
                return this.value.equals(((ReviveEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="revive")
    
    private ReviveEnum revive;
    /**
     * 超动态范围，提升视频动态范围，明显提升片源动态范围。单纯该处理操作前后，分辨率、帧率等参数不发生变化，动态范围、色域范围、码率发生变化。 可和normal_ enhance组合使用。SDRtoHDR10（默认）,SDRtoHLG（暂不支持） 
     */
    public static class SdrToHdrEnum {

        
        /**
         * Enum SDRTOHDR10 for value: "SDRtoHDR10"
         */
        public static final SdrToHdrEnum SDRTOHDR10 = new SdrToHdrEnum("SDRtoHDR10");
        

        public static final Map<String, SdrToHdrEnum> staticFields = new HashMap<String, SdrToHdrEnum>() {
            { 
                put("SDRtoHDR10", SDRTOHDR10);
            }
        };

        private String value;

        SdrToHdrEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SdrToHdrEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SdrToHdrEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new SdrToHdrEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static SdrToHdrEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SdrToHdrEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SdrToHdrEnum) {
                return this.value.equals(((SdrToHdrEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sdr_to_hdr")
    
    private SdrToHdrEnum sdrToHdr;

    public QualityEnhance withNormalEnhance(NormalEnhanceEnum normalEnhance) {
        this.normalEnhance = normalEnhance;
        return this;
    }

    


    /**
     * 针对一般质量、无明显问题的普通片源，通过增强、锐化等技术明显提升主观效果。单纯该处理操作前后，分辨率、帧率等参数不发生变化。 可和old_repair、super_resolution、super_framerate、SDRToHDR组合使用。 
     * @return normalEnhance
     */
    public NormalEnhanceEnum getNormalEnhance() {
        return normalEnhance;
    }

    public void setNormalEnhance(NormalEnhanceEnum normalEnhance) {
        this.normalEnhance = normalEnhance;
    }

    public QualityEnhance withRevive(ReviveEnum revive) {
        this.revive = revive;
        return this;
    }

    


    /**
     * 针对旧片、老片，画质主观质量比较低的片源，通过降噪、去压缩失真等视频增强技术，提升画质主观效果。 
     * @return revive
     */
    public ReviveEnum getRevive() {
        return revive;
    }

    public void setRevive(ReviveEnum revive) {
        this.revive = revive;
    }

    public QualityEnhance withSdrToHdr(SdrToHdrEnum sdrToHdr) {
        this.sdrToHdr = sdrToHdr;
        return this;
    }

    


    /**
     * 超动态范围，提升视频动态范围，明显提升片源动态范围。单纯该处理操作前后，分辨率、帧率等参数不发生变化，动态范围、色域范围、码率发生变化。 可和normal_ enhance组合使用。SDRtoHDR10（默认）,SDRtoHLG（暂不支持） 
     * @return sdrToHdr
     */
    public SdrToHdrEnum getSdrToHdr() {
        return sdrToHdr;
    }

    public void setSdrToHdr(SdrToHdrEnum sdrToHdr) {
        this.sdrToHdr = sdrToHdr;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualityEnhance qualityEnhance = (QualityEnhance) o;
        return Objects.equals(this.normalEnhance, qualityEnhance.normalEnhance) &&
            Objects.equals(this.revive, qualityEnhance.revive) &&
            Objects.equals(this.sdrToHdr, qualityEnhance.sdrToHdr);
    }
    @Override
    public int hashCode() {
        return Objects.hash(normalEnhance, revive, sdrToHdr);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityEnhance {\n");
        sb.append("    normalEnhance: ").append(toIndentedString(normalEnhance)).append("\n");
        sb.append("    revive: ").append(toIndentedString(revive)).append("\n");
        sb.append("    sdrToHdr: ").append(toIndentedString(sdrToHdr)).append("\n");
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

