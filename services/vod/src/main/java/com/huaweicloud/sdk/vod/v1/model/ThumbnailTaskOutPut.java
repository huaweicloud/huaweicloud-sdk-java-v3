package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ThumbnailTaskOutPut
 */
public class ThumbnailTaskOutPut {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_info")

    private ObsInfo obsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pic_info_list")

    private List<PicInfo> picInfoList = null;

    public ThumbnailTaskOutPut withObsInfo(ObsInfo obsInfo) {
        this.obsInfo = obsInfo;
        return this;
    }

    public ThumbnailTaskOutPut withObsInfo(Consumer<ObsInfo> obsInfoSetter) {
        if (this.obsInfo == null) {
            this.obsInfo = new ObsInfo();
            obsInfoSetter.accept(this.obsInfo);
        }

        return this;
    }

    /**
     * Get obsInfo
     * @return obsInfo
     */
    public ObsInfo getObsInfo() {
        return obsInfo;
    }

    public void setObsInfo(ObsInfo obsInfo) {
        this.obsInfo = obsInfo;
    }

    public ThumbnailTaskOutPut withPicInfoList(List<PicInfo> picInfoList) {
        this.picInfoList = picInfoList;
        return this;
    }

    public ThumbnailTaskOutPut addPicInfoListItem(PicInfo picInfoListItem) {
        if (this.picInfoList == null) {
            this.picInfoList = new ArrayList<>();
        }
        this.picInfoList.add(picInfoListItem);
        return this;
    }

    public ThumbnailTaskOutPut withPicInfoList(Consumer<List<PicInfo>> picInfoListSetter) {
        if (this.picInfoList == null) {
            this.picInfoList = new ArrayList<>();
        }
        picInfoListSetter.accept(this.picInfoList);
        return this;
    }

    /**
     * 截图信息列表
     * @return picInfoList
     */
    public List<PicInfo> getPicInfoList() {
        return picInfoList;
    }

    public void setPicInfoList(List<PicInfo> picInfoList) {
        this.picInfoList = picInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThumbnailTaskOutPut that = (ThumbnailTaskOutPut) obj;
        return Objects.equals(this.obsInfo, that.obsInfo) && Objects.equals(this.picInfoList, that.picInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsInfo, picInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThumbnailTaskOutPut {\n");
        sb.append("    obsInfo: ").append(toIndentedString(obsInfo)).append("\n");
        sb.append("    picInfoList: ").append(toIndentedString(picInfoList)).append("\n");
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
