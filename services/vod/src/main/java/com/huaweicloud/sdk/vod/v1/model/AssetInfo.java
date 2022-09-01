package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AssetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    @JacksonXmlProperty(localName = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    @JacksonXmlProperty(localName = "base_info")

    private BaseInfo baseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_info_array")

    @JacksonXmlProperty(localName = "play_info_array")

    private List<PlayInfo> playInfoArray = null;

    public AssetInfo withAssetId(String assetId) {
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

    public AssetInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 媒资状态。  取值如下： - UNCREATED：未创建（媒资ID不存在 ） - DELETED：已删除 - CANCELLED：上传取消 - SERVER_ERROR：上传失败（点播服务端故障） - UPLOAD_FAILED：上传失败（向OBS上传失败） - CREATING：创建中 - PUBLISHED：已发布 - WAITING_TRANSCODE：待发布（转码排队中） - TRANSCODING：待发布（转码中） - TRANSCODE_FAILED：待发布（转码失败） - TRANSCODE_SUCCEED：待发布（转码成功） - CREATED：待发布（未转码） - NO_ASSET：该媒资不存在 - DELETING：正在删除 - DELETE_FAILED：删除失败 - OBS_CREATING：OBS转存方式创建中 - OBS_CREATE_FAILED： OBS转存失败 - OBS_CREATE_SUCCESS： OBS转存成功
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AssetInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 媒资子状态或描述信息。 - 对于媒资异常场景，描述具体的异常原因。 - 对于正常场景，描述媒资的处理信息。
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
        if (this.baseInfo == null) {
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
        if (this.playInfoArray == null) {
            this.playInfoArray = new ArrayList<>();
        }
        this.playInfoArray.add(playInfoArrayItem);
        return this;
    }

    public AssetInfo withPlayInfoArray(Consumer<List<PlayInfo>> playInfoArraySetter) {
        if (this.playInfoArray == null) {
            this.playInfoArray = new ArrayList<>();
        }
        playInfoArraySetter.accept(this.playInfoArray);
        return this;
    }

    /**
     * 转码文件的播放信息。 - HLS或DASH：此数组的成员个数为n+1，n为转码输出路数。 - MP4：此数组的成员个数为n，n为转码输出路数。
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
        return Objects.equals(this.assetId, assetInfo.assetId) && Objects.equals(this.status, assetInfo.status)
            && Objects.equals(this.description, assetInfo.description)
            && Objects.equals(this.baseInfo, assetInfo.baseInfo)
            && Objects.equals(this.playInfoArray, assetInfo.playInfoArray);
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
