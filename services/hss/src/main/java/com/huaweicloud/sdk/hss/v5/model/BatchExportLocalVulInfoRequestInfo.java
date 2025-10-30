package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作的事件
 */
public class BatchExportLocalVulInfoRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id_list")

    private List<String> imageIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_all")

    private Boolean operateAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_type")

    private String vulType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_container")

    private Boolean hasContainer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id_list")

    private List<String> vulIdList = null;

    public BatchExportLocalVulInfoRequestInfo withImageIdList(List<String> imageIdList) {
        this.imageIdList = imageIdList;
        return this;
    }

    public BatchExportLocalVulInfoRequestInfo addImageIdListItem(String imageIdListItem) {
        if (this.imageIdList == null) {
            this.imageIdList = new ArrayList<>();
        }
        this.imageIdList.add(imageIdListItem);
        return this;
    }

    public BatchExportLocalVulInfoRequestInfo withImageIdList(Consumer<List<String>> imageIdListSetter) {
        if (this.imageIdList == null) {
            this.imageIdList = new ArrayList<>();
        }
        imageIdListSetter.accept(this.imageIdList);
        return this;
    }

    /**
     * 要导出的镜像信息列表，operate_all参数为false时需要填写批量查询条件,image_id 镜像id，唯一镜像标识（注：对私有镜像和共享镜像来说是镜像列表返回的id）
     * @return imageIdList
     */
    public List<String> getImageIdList() {
        return imageIdList;
    }

    public void setImageIdList(List<String> imageIdList) {
        this.imageIdList = imageIdList;
    }

    public BatchExportLocalVulInfoRequestInfo withOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
        return this;
    }

    /**
     * 若为true全量查询，可筛选条件全部查询
     * @return operateAll
     */
    public Boolean getOperateAll() {
        return operateAll;
    }

    public void setOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
    }

    public BatchExportLocalVulInfoRequestInfo withVulType(String vulType) {
        this.vulType = vulType;
        return this;
    }

    /**
     * 漏洞类型，包含如下：   -linux_vul : linux漏洞   -app_vul : 应用漏洞
     * @return vulType
     */
    public String getVulType() {
        return vulType;
    }

    public void setVulType(String vulType) {
        this.vulType = vulType;
    }

    public BatchExportLocalVulInfoRequestInfo withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * 漏洞处置状态，包含如下:   - unhandled ：未处理   - handled : 已处理
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public BatchExportLocalVulInfoRequestInfo withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * **参数解释**: 扫描状态 **约束限制**: 不涉及 **取值范围**:   - unscan : 未扫描。   - success : 扫描完成。   - scanning : 扫描中。   - failed : 扫描失败。   - download_failed : 下载失败。   - image_oversized : 镜像超大。   - waiting_for_scan : 等待扫描。   - image_scan_stop : 扫描终止。 **默认取值**: 不涉及 
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public BatchExportLocalVulInfoRequestInfo withImageName(String imageName) {
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

    public BatchExportLocalVulInfoRequestInfo withImageVersion(String imageVersion) {
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

    public BatchExportLocalVulInfoRequestInfo withImageSize(Long imageSize) {
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

    public BatchExportLocalVulInfoRequestInfo withStartLatestUpdateTime(Long startLatestUpdateTime) {
        this.startLatestUpdateTime = startLatestUpdateTime;
        return this;
    }

    /**
     * 创建时间开始日期，时间单位 毫秒（ms）
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

    public BatchExportLocalVulInfoRequestInfo withEndLatestUpdateTime(Long endLatestUpdateTime) {
        this.endLatestUpdateTime = endLatestUpdateTime;
        return this;
    }

    /**
     * 创建时间结束日期，时间单位 毫秒（ms）
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

    public BatchExportLocalVulInfoRequestInfo withStartLatestScanTime(Long startLatestScanTime) {
        this.startLatestScanTime = startLatestScanTime;
        return this;
    }

    /**
     * 最近一次扫描完成时间开始日期，时间单位 毫秒（ms）
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

    public BatchExportLocalVulInfoRequestInfo withEndLatestScanTime(Long endLatestScanTime) {
        this.endLatestScanTime = endLatestScanTime;
        return this;
    }

    /**
     * 最近一次扫描完成时间结束日期，时间单位 毫秒（ms）
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

    public BatchExportLocalVulInfoRequestInfo withHasContainer(Boolean hasContainer) {
        this.hasContainer = hasContainer;
        return this;
    }

    /**
     * **参数解释**: 是否存在容器 **约束限制**: 不涉及 **取值范围**: - true：是。 - false：否。  **默认取值**: 不涉及 
     * @return hasContainer
     */
    public Boolean getHasContainer() {
        return hasContainer;
    }

    public void setHasContainer(Boolean hasContainer) {
        this.hasContainer = hasContainer;
    }

    public BatchExportLocalVulInfoRequestInfo withVulIdList(List<String> vulIdList) {
        this.vulIdList = vulIdList;
        return this;
    }

    public BatchExportLocalVulInfoRequestInfo addVulIdListItem(String vulIdListItem) {
        if (this.vulIdList == null) {
            this.vulIdList = new ArrayList<>();
        }
        this.vulIdList.add(vulIdListItem);
        return this;
    }

    public BatchExportLocalVulInfoRequestInfo withVulIdList(Consumer<List<String>> vulIdListSetter) {
        if (this.vulIdList == null) {
            this.vulIdList = new ArrayList<>();
        }
        vulIdListSetter.accept(this.vulIdList);
        return this;
    }

    /**
     * 导出镜像漏洞时的漏洞id列表
     * @return vulIdList
     */
    public List<String> getVulIdList() {
        return vulIdList;
    }

    public void setVulIdList(List<String> vulIdList) {
        this.vulIdList = vulIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchExportLocalVulInfoRequestInfo that = (BatchExportLocalVulInfoRequestInfo) obj;
        return Objects.equals(this.imageIdList, that.imageIdList) && Objects.equals(this.operateAll, that.operateAll)
            && Objects.equals(this.vulType, that.vulType) && Objects.equals(this.handleStatus, that.handleStatus)
            && Objects.equals(this.scanStatus, that.scanStatus) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.startLatestUpdateTime, that.startLatestUpdateTime)
            && Objects.equals(this.endLatestUpdateTime, that.endLatestUpdateTime)
            && Objects.equals(this.startLatestScanTime, that.startLatestScanTime)
            && Objects.equals(this.endLatestScanTime, that.endLatestScanTime)
            && Objects.equals(this.hasContainer, that.hasContainer) && Objects.equals(this.vulIdList, that.vulIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageIdList,
            operateAll,
            vulType,
            handleStatus,
            scanStatus,
            imageName,
            imageVersion,
            imageSize,
            startLatestUpdateTime,
            endLatestUpdateTime,
            startLatestScanTime,
            endLatestScanTime,
            hasContainer,
            vulIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchExportLocalVulInfoRequestInfo {\n");
        sb.append("    imageIdList: ").append(toIndentedString(imageIdList)).append("\n");
        sb.append("    operateAll: ").append(toIndentedString(operateAll)).append("\n");
        sb.append("    vulType: ").append(toIndentedString(vulType)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    startLatestUpdateTime: ").append(toIndentedString(startLatestUpdateTime)).append("\n");
        sb.append("    endLatestUpdateTime: ").append(toIndentedString(endLatestUpdateTime)).append("\n");
        sb.append("    startLatestScanTime: ").append(toIndentedString(startLatestScanTime)).append("\n");
        sb.append("    endLatestScanTime: ").append(toIndentedString(endLatestScanTime)).append("\n");
        sb.append("    hasContainer: ").append(toIndentedString(hasContainer)).append("\n");
        sb.append("    vulIdList: ").append(toIndentedString(vulIdList)).append("\n");
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
