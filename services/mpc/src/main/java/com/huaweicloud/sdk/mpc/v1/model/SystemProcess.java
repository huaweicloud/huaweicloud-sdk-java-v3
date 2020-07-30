package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SystemProcess
 */
public class SystemProcess  {

    /**
     * 追加转码类型。  取值如下： - SUBTITLE：追加字幕 - AUDIO：追加音频 - VIDEO：追加视频（原有追加新分辨率视频） 
     */
    public static class AppendTypeEnum {

        
        /**
         * Enum SUBTITLE for value: "SUBTITLE"
         */
        public static final AppendTypeEnum SUBTITLE = new AppendTypeEnum("SUBTITLE");
        
        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final AppendTypeEnum AUDIO = new AppendTypeEnum("AUDIO");
        
        /**
         * Enum VIDEO for value: "VIDEO"
         */
        public static final AppendTypeEnum VIDEO = new AppendTypeEnum("VIDEO");
        

        public static final Map<String, AppendTypeEnum> staticFields = new HashMap<String, AppendTypeEnum>() {
            { 
                put("SUBTITLE", SUBTITLE);
                put("AUDIO", AUDIO);
                put("VIDEO", VIDEO);
            }
        };

        private String value;

        AppendTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AppendTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AppendTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new AppendTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static AppendTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AppendTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AppendTypeEnum) {
                return this.value.equals(((AppendTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="append_type")
    
    private AppendTypeEnum appendType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hls_index")
    
    private ObsObjInfo hlsIndex = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dash_index")
    
    private ObsObjInfo dashIndex = null;

    public SystemProcess withAppendType(AppendTypeEnum appendType) {
        this.appendType = appendType;
        return this;
    }

    


    /**
     * 追加转码类型。  取值如下： - SUBTITLE：追加字幕 - AUDIO：追加音频 - VIDEO：追加视频（原有追加新分辨率视频） 
     * @return appendType
     */
    public AppendTypeEnum getAppendType() {
        return appendType;
    }

    public void setAppendType(AppendTypeEnum appendType) {
        this.appendType = appendType;
    }

    public SystemProcess withHlsIndex(ObsObjInfo hlsIndex) {
        this.hlsIndex = hlsIndex;
        return this;
    }

    public SystemProcess withHlsIndex(Consumer<ObsObjInfo> hlsIndexSetter) {
        if(this.hlsIndex == null ){
            this.hlsIndex = new ObsObjInfo();
            hlsIndexSetter.accept(this.hlsIndex);
        }
        
        return this;
    }


    /**
     * Get hlsIndex
     * @return hlsIndex
     */
    public ObsObjInfo getHlsIndex() {
        return hlsIndex;
    }

    public void setHlsIndex(ObsObjInfo hlsIndex) {
        this.hlsIndex = hlsIndex;
    }

    public SystemProcess withDashIndex(ObsObjInfo dashIndex) {
        this.dashIndex = dashIndex;
        return this;
    }

    public SystemProcess withDashIndex(Consumer<ObsObjInfo> dashIndexSetter) {
        if(this.dashIndex == null ){
            this.dashIndex = new ObsObjInfo();
            dashIndexSetter.accept(this.dashIndex);
        }
        
        return this;
    }


    /**
     * Get dashIndex
     * @return dashIndex
     */
    public ObsObjInfo getDashIndex() {
        return dashIndex;
    }

    public void setDashIndex(ObsObjInfo dashIndex) {
        this.dashIndex = dashIndex;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemProcess systemProcess = (SystemProcess) o;
        return Objects.equals(this.appendType, systemProcess.appendType) &&
            Objects.equals(this.hlsIndex, systemProcess.hlsIndex) &&
            Objects.equals(this.dashIndex, systemProcess.dashIndex);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appendType, hlsIndex, dashIndex);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemProcess {\n");
        sb.append("    appendType: ").append(toIndentedString(appendType)).append("\n");
        sb.append("    hlsIndex: ").append(toIndentedString(hlsIndex)).append("\n");
        sb.append("    dashIndex: ").append(toIndentedString(dashIndex)).append("\n");
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

