package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskOutPut
 */
public class TaskOutPut {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_info")

    private ObsInfo obsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private ObjectMetaData metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_url")

    private String fileUrl;

    public TaskOutPut withObsInfo(ObsInfo obsInfo) {
        this.obsInfo = obsInfo;
        return this;
    }

    public TaskOutPut withObsInfo(Consumer<ObsInfo> obsInfoSetter) {
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

    public TaskOutPut withMetaData(ObjectMetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public TaskOutPut withMetaData(Consumer<ObjectMetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new ObjectMetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public ObjectMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(ObjectMetaData metaData) {
        this.metaData = metaData;
    }

    public TaskOutPut withFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    /**
     * 输出文件播放地址
     * @return fileUrl
     */
    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskOutPut that = (TaskOutPut) obj;
        return Objects.equals(this.obsInfo, that.obsInfo) && Objects.equals(this.metaData, that.metaData)
            && Objects.equals(this.fileUrl, that.fileUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsInfo, metaData, fileUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskOutPut {\n");
        sb.append("    obsInfo: ").append(toIndentedString(obsInfo)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
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
