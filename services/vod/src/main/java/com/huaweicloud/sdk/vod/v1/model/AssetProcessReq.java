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
     * 媒资ID。
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
     * 转码模板组名称。   若不为空，则使用指定的转码模板对上传的音视频进行转码，您可以在视频点播控制台配置转码模板，具体请参见[转码设置](https://support.huaweicloud.com/usermanual-vod/vod_01_0072.html)。
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
     * 是否自动加密。  取值如下： - 0：表示不加密。 - 1：表示需要加密。  默认值：0。  加密与转码必须要一起进行，当需要加密时，转码参数不能为空，且转码输出必须要为HLS。
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
     * 字幕文件ID。  > 仅在[创建媒资](https://support.huaweicloud.com/api-vod/vod_04_0196.html)时，请求参数设置了“**subtitles**”时，该参数设置才生效。
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

