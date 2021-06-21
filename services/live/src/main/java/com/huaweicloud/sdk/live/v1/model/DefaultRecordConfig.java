package com.huaweicloud.sdk.live.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v1.model.FLVRecordConfig;
import com.huaweicloud.sdk.live.v1.model.HLSRecordConfig;
import com.huaweicloud.sdk.live.v1.model.MP4RecordConfig;
import com.huaweicloud.sdk.live.v1.model.RecordObsFileAddr;
import com.huaweicloud.sdk.live.v1.model.VideoFormatVar;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DefaultRecordConfig
 */
public class DefaultRecordConfig  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_format")
    
    private List<VideoFormatVar> recordFormat = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs_addr")
    
    private RecordObsFileAddr obsAddr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hls_config")
    
    private HLSRecordConfig hlsConfig;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flv_config")
    
    private FLVRecordConfig flvConfig;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mp4_config")
    
    private MP4RecordConfig mp4Config;

    public DefaultRecordConfig withRecordFormat(List<VideoFormatVar> recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }

    
    public DefaultRecordConfig addRecordFormatItem(VideoFormatVar recordFormatItem) {
        if(this.recordFormat == null) {
            this.recordFormat = new ArrayList<>();
        }
        this.recordFormat.add(recordFormatItem);
        return this;
    }

    public DefaultRecordConfig withRecordFormat(Consumer<List<VideoFormatVar>> recordFormatSetter) {
        if(this.recordFormat == null) {
            this.recordFormat = new ArrayList<>();
        }
        recordFormatSetter.accept(this.recordFormat);
        return this;
    }

    /**
     * 录制格式flv，hls，mp4
     * @return recordFormat
     */
    public List<VideoFormatVar> getRecordFormat() {
        return recordFormat;
    }

    public void setRecordFormat(List<VideoFormatVar> recordFormat) {
        this.recordFormat = recordFormat;
    }

    

    public DefaultRecordConfig withObsAddr(RecordObsFileAddr obsAddr) {
        this.obsAddr = obsAddr;
        return this;
    }

    public DefaultRecordConfig withObsAddr(Consumer<RecordObsFileAddr> obsAddrSetter) {
        if(this.obsAddr == null ){
            this.obsAddr = new RecordObsFileAddr();
            obsAddrSetter.accept(this.obsAddr);
        }
        
        return this;
    }


    /**
     * Get obsAddr
     * @return obsAddr
     */
    public RecordObsFileAddr getObsAddr() {
        return obsAddr;
    }

    public void setObsAddr(RecordObsFileAddr obsAddr) {
        this.obsAddr = obsAddr;
    }

    

    public DefaultRecordConfig withHlsConfig(HLSRecordConfig hlsConfig) {
        this.hlsConfig = hlsConfig;
        return this;
    }

    public DefaultRecordConfig withHlsConfig(Consumer<HLSRecordConfig> hlsConfigSetter) {
        if(this.hlsConfig == null ){
            this.hlsConfig = new HLSRecordConfig();
            hlsConfigSetter.accept(this.hlsConfig);
        }
        
        return this;
    }


    /**
     * Get hlsConfig
     * @return hlsConfig
     */
    public HLSRecordConfig getHlsConfig() {
        return hlsConfig;
    }

    public void setHlsConfig(HLSRecordConfig hlsConfig) {
        this.hlsConfig = hlsConfig;
    }

    

    public DefaultRecordConfig withFlvConfig(FLVRecordConfig flvConfig) {
        this.flvConfig = flvConfig;
        return this;
    }

    public DefaultRecordConfig withFlvConfig(Consumer<FLVRecordConfig> flvConfigSetter) {
        if(this.flvConfig == null ){
            this.flvConfig = new FLVRecordConfig();
            flvConfigSetter.accept(this.flvConfig);
        }
        
        return this;
    }


    /**
     * Get flvConfig
     * @return flvConfig
     */
    public FLVRecordConfig getFlvConfig() {
        return flvConfig;
    }

    public void setFlvConfig(FLVRecordConfig flvConfig) {
        this.flvConfig = flvConfig;
    }

    

    public DefaultRecordConfig withMp4Config(MP4RecordConfig mp4Config) {
        this.mp4Config = mp4Config;
        return this;
    }

    public DefaultRecordConfig withMp4Config(Consumer<MP4RecordConfig> mp4ConfigSetter) {
        if(this.mp4Config == null ){
            this.mp4Config = new MP4RecordConfig();
            mp4ConfigSetter.accept(this.mp4Config);
        }
        
        return this;
    }


    /**
     * Get mp4Config
     * @return mp4Config
     */
    public MP4RecordConfig getMp4Config() {
        return mp4Config;
    }

    public void setMp4Config(MP4RecordConfig mp4Config) {
        this.mp4Config = mp4Config;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DefaultRecordConfig defaultRecordConfig = (DefaultRecordConfig) o;
        return Objects.equals(this.recordFormat, defaultRecordConfig.recordFormat) &&
            Objects.equals(this.obsAddr, defaultRecordConfig.obsAddr) &&
            Objects.equals(this.hlsConfig, defaultRecordConfig.hlsConfig) &&
            Objects.equals(this.flvConfig, defaultRecordConfig.flvConfig) &&
            Objects.equals(this.mp4Config, defaultRecordConfig.mp4Config);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recordFormat, obsAddr, hlsConfig, flvConfig, mp4Config);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefaultRecordConfig {\n");
        sb.append("    recordFormat: ").append(toIndentedString(recordFormat)).append("\n");
        sb.append("    obsAddr: ").append(toIndentedString(obsAddr)).append("\n");
        sb.append("    hlsConfig: ").append(toIndentedString(hlsConfig)).append("\n");
        sb.append("    flvConfig: ").append(toIndentedString(flvConfig)).append("\n");
        sb.append("    mp4Config: ").append(toIndentedString(mp4Config)).append("\n");
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

