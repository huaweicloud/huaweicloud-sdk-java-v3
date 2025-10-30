package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LocalImageBatchScanRequestBody
 */
public class LocalImageBatchScanRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_all")

    private Boolean operateAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_info_list")

    private List<LocalImageInfo> imageInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_image_type")

    private String localImageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private Long imageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_latest_update_time")

    private Long startLatestUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_latest_update_time")

    private Long endLatestUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_latest_scan_time")

    private Long startLatestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_latest_scan_time")

    private Long endLatestScanTime;

    public LocalImageBatchScanRequestBody withOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
        return this;
    }

    /**
     * 是否扫描全部本地镜像，true扫描所有，非true则不是
     * @return operateAll
     */
    public Boolean getOperateAll() {
        return operateAll;
    }

    public void setOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
    }

    public LocalImageBatchScanRequestBody withImageInfoList(List<LocalImageInfo> imageInfoList) {
        this.imageInfoList = imageInfoList;
        return this;
    }

    public LocalImageBatchScanRequestBody addImageInfoListItem(LocalImageInfo imageInfoListItem) {
        if (this.imageInfoList == null) {
            this.imageInfoList = new ArrayList<>();
        }
        this.imageInfoList.add(imageInfoListItem);
        return this;
    }

    public LocalImageBatchScanRequestBody withImageInfoList(Consumer<List<LocalImageInfo>> imageInfoListSetter) {
        if (this.imageInfoList == null) {
            this.imageInfoList = new ArrayList<>();
        }
        imageInfoListSetter.accept(this.imageInfoList);
        return this;
    }

    /**
     * 需要扫描的本地镜像列表
     * @return imageInfoList
     */
    public List<LocalImageInfo> getImageInfoList() {
        return imageInfoList;
    }

    public void setImageInfoList(List<LocalImageInfo> imageInfoList) {
        this.imageInfoList = imageInfoList;
    }

    public LocalImageBatchScanRequestBody withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public LocalImageBatchScanRequestBody withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * 镜像版本
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public LocalImageBatchScanRequestBody withLocalImageType(String localImageType) {
        this.localImageType = localImageType;
        return this;
    }

    /**
     * 镜像类型，包含如下:   - other_image : 其他镜像   - swr_image : swr镜像仓   
     * @return localImageType
     */
    public String getLocalImageType() {
        return localImageType;
    }

    public void setLocalImageType(String localImageType) {
        this.localImageType = localImageType;
    }

    public LocalImageBatchScanRequestBody withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 扫描状态，包含如下:   - unscan : 未扫描   - success : 扫描完成   - scanning : 扫描中   - failed : 扫描失败   - download_failed : 下载失败   - image_oversized : 镜像超大
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public LocalImageBatchScanRequestBody withImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * 镜像大小
     * minimum: 0
     * maximum: 2147483547
     * @return imageSize
     */
    public Long getImageSize() {
        return imageSize;
    }

    public void setImageSize(Long imageSize) {
        this.imageSize = imageSize;
    }

    public LocalImageBatchScanRequestBody withStartLatestUpdateTime(Long startLatestUpdateTime) {
        this.startLatestUpdateTime = startLatestUpdateTime;
        return this;
    }

    /**
     * 创建时间开始日期，时间单位：毫秒（ms）
     * minimum: 0
     * maximum: 2147483547
     * @return startLatestUpdateTime
     */
    public Long getStartLatestUpdateTime() {
        return startLatestUpdateTime;
    }

    public void setStartLatestUpdateTime(Long startLatestUpdateTime) {
        this.startLatestUpdateTime = startLatestUpdateTime;
    }

    public LocalImageBatchScanRequestBody withEndLatestUpdateTime(Long endLatestUpdateTime) {
        this.endLatestUpdateTime = endLatestUpdateTime;
        return this;
    }

    /**
     * 创建时间结束日期，时间单位：毫秒（ms）
     * minimum: 0
     * maximum: 2147483547
     * @return endLatestUpdateTime
     */
    public Long getEndLatestUpdateTime() {
        return endLatestUpdateTime;
    }

    public void setEndLatestUpdateTime(Long endLatestUpdateTime) {
        this.endLatestUpdateTime = endLatestUpdateTime;
    }

    public LocalImageBatchScanRequestBody withStartLatestScanTime(Long startLatestScanTime) {
        this.startLatestScanTime = startLatestScanTime;
        return this;
    }

    /**
     * 最近一次扫描完成时间开始日期，时间单位：毫秒（ms）
     * minimum: 0
     * maximum: 2147483547
     * @return startLatestScanTime
     */
    public Long getStartLatestScanTime() {
        return startLatestScanTime;
    }

    public void setStartLatestScanTime(Long startLatestScanTime) {
        this.startLatestScanTime = startLatestScanTime;
    }

    public LocalImageBatchScanRequestBody withEndLatestScanTime(Long endLatestScanTime) {
        this.endLatestScanTime = endLatestScanTime;
        return this;
    }

    /**
     * 最近一次扫描完成时间结束日期，时间单位：毫秒（ms）
     * minimum: 0
     * maximum: 2147483547
     * @return endLatestScanTime
     */
    public Long getEndLatestScanTime() {
        return endLatestScanTime;
    }

    public void setEndLatestScanTime(Long endLatestScanTime) {
        this.endLatestScanTime = endLatestScanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocalImageBatchScanRequestBody that = (LocalImageBatchScanRequestBody) obj;
        return Objects.equals(this.operateAll, that.operateAll)
            && Objects.equals(this.imageInfoList, that.imageInfoList) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.localImageType, that.localImageType)
            && Objects.equals(this.scanStatus, that.scanStatus) && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.startLatestUpdateTime, that.startLatestUpdateTime)
            && Objects.equals(this.endLatestUpdateTime, that.endLatestUpdateTime)
            && Objects.equals(this.startLatestScanTime, that.startLatestScanTime)
            && Objects.equals(this.endLatestScanTime, that.endLatestScanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateAll,
            imageInfoList,
            imageName,
            imageVersion,
            localImageType,
            scanStatus,
            imageSize,
            startLatestUpdateTime,
            endLatestUpdateTime,
            startLatestScanTime,
            endLatestScanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalImageBatchScanRequestBody {\n");
        sb.append("    operateAll: ").append(toIndentedString(operateAll)).append("\n");
        sb.append("    imageInfoList: ").append(toIndentedString(imageInfoList)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    localImageType: ").append(toIndentedString(localImageType)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    startLatestUpdateTime: ").append(toIndentedString(startLatestUpdateTime)).append("\n");
        sb.append("    endLatestUpdateTime: ").append(toIndentedString(endLatestUpdateTime)).append("\n");
        sb.append("    startLatestScanTime: ").append(toIndentedString(startLatestScanTime)).append("\n");
        sb.append("    endLatestScanTime: ").append(toIndentedString(endLatestScanTime)).append("\n");
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
