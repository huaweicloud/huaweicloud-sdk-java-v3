package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.MetaData;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PlayInfo
 */
public class PlayInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="play_type")
    
    private String playType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encrypted")
    
    private Integer encrypted;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="meta_data")
    
    private MetaData metaData;

    public PlayInfo withPlayType(String playType) {
        this.playType = playType;
        return this;
    }

    


    /**
     * 播放协议类型。  取值如下： - hls - dash - mp4
     * @return playType
     */
    public String getPlayType() {
        return playType;
    }

    public void setPlayType(String playType) {
        this.playType = playType;
    }

    

    public PlayInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 播放URL。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public PlayInfo withEncrypted(Integer encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    


    /**
     * 标记流是否已被加密。  取值如下： - 0：表示未加密。 - 1：表示已被加密。  默认值：0。
     * @return encrypted
     */
    public Integer getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Integer encrypted) {
        this.encrypted = encrypted;
    }

    

    public PlayInfo withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public PlayInfo withMetaData(Consumer<MetaData> metaDataSetter) {
        if(this.metaData == null ){
            this.metaData = new MetaData();
            metaDataSetter.accept(this.metaData);
        }
        
        return this;
    }


    /**
     * Get metaData
     * @return metaData
     */
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlayInfo playInfo = (PlayInfo) o;
        return Objects.equals(this.playType, playInfo.playType) &&
            Objects.equals(this.url, playInfo.url) &&
            Objects.equals(this.encrypted, playInfo.encrypted) &&
            Objects.equals(this.metaData, playInfo.metaData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(playType, url, encrypted, metaData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlayInfo {\n");
        sb.append("    playType: ").append(toIndentedString(playType)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

