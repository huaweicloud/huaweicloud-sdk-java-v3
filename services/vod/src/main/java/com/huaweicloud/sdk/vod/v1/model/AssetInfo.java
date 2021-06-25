package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.BaseInfo;
import com.huaweicloud.sdk.vod.v1.model.PlayInfo;
import com.huaweicloud.sdk.vod.v1.model.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AssetInfo
 */
public class AssetInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private String assetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Status status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="base_info")
    
    private BaseInfo baseInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="play_info_array")
    
    private List<PlayInfo> playInfoArray = null;
    
    public AssetInfo withAssetId(String assetId) {
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

    

    public AssetInfo withStatus(Status status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    

    public AssetInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 媒资描述信息<br/> 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public AssetInfo withBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public AssetInfo withBaseInfo(Consumer<BaseInfo> baseInfoSetter) {
        if(this.baseInfo == null ){
            this.baseInfo = new BaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }
        
        return this;
    }


    /**
     * Get baseInfo
     * @return baseInfo
     */
    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    

    public AssetInfo withPlayInfoArray(List<PlayInfo> playInfoArray) {
        this.playInfoArray = playInfoArray;
        return this;
    }

    
    public AssetInfo addPlayInfoArrayItem(PlayInfo playInfoArrayItem) {
        if(this.playInfoArray == null) {
            this.playInfoArray = new ArrayList<>();
        }
        this.playInfoArray.add(playInfoArrayItem);
        return this;
    }

    public AssetInfo withPlayInfoArray(Consumer<List<PlayInfo>> playInfoArraySetter) {
        if(this.playInfoArray == null) {
            this.playInfoArray = new ArrayList<>();
        }
        playInfoArraySetter.accept(this.playInfoArray);
        return this;
    }

    /**
     * 播放信息数组<br/> 
     * @return playInfoArray
     */
    public List<PlayInfo> getPlayInfoArray() {
        return playInfoArray;
    }

    public void setPlayInfoArray(List<PlayInfo> playInfoArray) {
        this.playInfoArray = playInfoArray;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetInfo assetInfo = (AssetInfo) o;
        return Objects.equals(this.assetId, assetInfo.assetId) &&
            Objects.equals(this.status, assetInfo.status) &&
            Objects.equals(this.description, assetInfo.description) &&
            Objects.equals(this.baseInfo, assetInfo.baseInfo) &&
            Objects.equals(this.playInfoArray, assetInfo.playInfoArray);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId, status, description, baseInfo, playInfoArray);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetInfo {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    playInfoArray: ").append(toIndentedString(playInfoArray)).append("\n");
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

