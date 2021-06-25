package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.Thumbnail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AssetProcessReq
 */
public class AssetProcessReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private String assetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_group_name")
    
    private String templateGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_encrypt")
    
    private Integer autoEncrypt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thumbnail")
    
    private Thumbnail thumbnail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subtitle_id")
    
    private List<Integer> subtitleId = null;
    
    public AssetProcessReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    


    /**
     * 媒体ID<br/> 
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    

    public AssetProcessReq withTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
        return this;
    }

    


    /**
     * 转码模板组名称<br/> 
     * @return templateGroupName
     */
    public String getTemplateGroupName() {
        return templateGroupName;
    }

    public void setTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
    }

    

    public AssetProcessReq withAutoEncrypt(Integer autoEncrypt) {
        this.autoEncrypt = autoEncrypt;
        return this;
    }

    


    /**
     * 是否自动加密，取值[0，1] 0表示不加密，1表示需要加密。默认值为0 加密时必须要转码，且转码的输出是HLS。 
     * @return autoEncrypt
     */
    public Integer getAutoEncrypt() {
        return autoEncrypt;
    }

    public void setAutoEncrypt(Integer autoEncrypt) {
        this.autoEncrypt = autoEncrypt;
    }

    

    public AssetProcessReq withThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public AssetProcessReq withThumbnail(Consumer<Thumbnail> thumbnailSetter) {
        if(this.thumbnail == null ){
            this.thumbnail = new Thumbnail();
            thumbnailSetter.accept(this.thumbnail);
        }
        
        return this;
    }


    /**
     * Get thumbnail
     * @return thumbnail
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    

    public AssetProcessReq withSubtitleId(List<Integer> subtitleId) {
        this.subtitleId = subtitleId;
        return this;
    }

    
    public AssetProcessReq addSubtitleIdItem(Integer subtitleIdItem) {
        if(this.subtitleId == null) {
            this.subtitleId = new ArrayList<>();
        }
        this.subtitleId.add(subtitleIdItem);
        return this;
    }

    public AssetProcessReq withSubtitleId(Consumer<List<Integer>> subtitleIdSetter) {
        if(this.subtitleId == null) {
            this.subtitleId = new ArrayList<>();
        }
        subtitleIdSetter.accept(this.subtitleId);
        return this;
    }

    /**
     * 字幕文件id<br/> 
     * @return subtitleId
     */
    public List<Integer> getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(List<Integer> subtitleId) {
        this.subtitleId = subtitleId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetProcessReq assetProcessReq = (AssetProcessReq) o;
        return Objects.equals(this.assetId, assetProcessReq.assetId) &&
            Objects.equals(this.templateGroupName, assetProcessReq.templateGroupName) &&
            Objects.equals(this.autoEncrypt, assetProcessReq.autoEncrypt) &&
            Objects.equals(this.thumbnail, assetProcessReq.thumbnail) &&
            Objects.equals(this.subtitleId, assetProcessReq.subtitleId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId, templateGroupName, autoEncrypt, thumbnail, subtitleId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetProcessReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    templateGroupName: ").append(toIndentedString(templateGroupName)).append("\n");
        sb.append("    autoEncrypt: ").append(toIndentedString(autoEncrypt)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    subtitleId: ").append(toIndentedString(subtitleId)).append("\n");
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

