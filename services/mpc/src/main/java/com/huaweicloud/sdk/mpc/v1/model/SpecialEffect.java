package com.huaweicloud.sdk.mpc.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.EffectInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SpecialEffect
 */
public class SpecialEffect  {

    /**
     * 特效处理类型。取值： Blur（水印模糊化） Mosaic（水印打马赛克，暂不支持） Replace（替换，暂不支持） 
     */
    public static final class TypeEnum {

        
        /**
         * Enum BLUR for value: "Blur"
         */
        public static final TypeEnum BLUR = new TypeEnum("Blur");
        
        /**
         * Enum MOSAIC for value: "Mosaic"
         */
        public static final TypeEnum MOSAIC = new TypeEnum("Mosaic");
        
        /**
         * Enum REPLACE for value: "Replace"
         */
        public static final TypeEnum REPLACE = new TypeEnum("Replace");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("Blur", BLUR);
            map.put("Mosaic", MOSAIC);
            map.put("Replace", REPLACE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
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
            if (obj != null && obj instanceof TypeEnum) {
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
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_detect")
    
    private String autoDetect;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effect_infos")
    
    private List<EffectInfo> effectInfos = null;
    
    public SpecialEffect withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 特效处理类型。取值： Blur（水印模糊化） Mosaic（水印打马赛克，暂不支持） Replace（替换，暂不支持） 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SpecialEffect withAutoDetect(String autoDetect) {
        this.autoDetect = autoDetect;
        return this;
    }

    


    /**
     * On：表示自动检测特效处理的参数信息，如水印的时间、位置信息等，无需输入参数信息effectinfos OFF：表示需输入特效处理的相关参数信息effectinfos 
     * @return autoDetect
     */
    public String getAutoDetect() {
        return autoDetect;
    }

    public void setAutoDetect(String autoDetect) {
        this.autoDetect = autoDetect;
    }

    public SpecialEffect withEffectInfos(List<EffectInfo> effectInfos) {
        this.effectInfos = effectInfos;
        return this;
    }

    
    public SpecialEffect addEffectInfosItem(EffectInfo effectInfosItem) {
        if (this.effectInfos == null) {
            this.effectInfos = new ArrayList<>();
        }
        this.effectInfos.add(effectInfosItem);
        return this;
    }

    public SpecialEffect withEffectInfos(Consumer<List<EffectInfo>> effectInfosSetter) {
        if(this.effectInfos == null ){
            this.effectInfos = new ArrayList<>();
        }
        effectInfosSetter.accept(this.effectInfos);
        return this;
    }

    /**
     * 特效处理相关参数，数组 约束：1）每帧视频最多处理2个指定区域；2）每个视频最多处理20个指定区域。 
     * @return effectInfos
     */
    public List<EffectInfo> getEffectInfos() {
        return effectInfos;
    }

    public void setEffectInfos(List<EffectInfo> effectInfos) {
        this.effectInfos = effectInfos;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpecialEffect specialEffect = (SpecialEffect) o;
        return Objects.equals(this.type, specialEffect.type) &&
            Objects.equals(this.autoDetect, specialEffect.autoDetect) &&
            Objects.equals(this.effectInfos, specialEffect.effectInfos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, autoDetect, effectInfos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecialEffect {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    autoDetect: ").append(toIndentedString(autoDetect)).append("\n");
        sb.append("    effectInfos: ").append(toIndentedString(effectInfos)).append("\n");
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

