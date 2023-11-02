package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实景三维成果模型对象。
 */
public class Real3DProductVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_code")

    private String folderCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_info")

    private Real3DProductRelateTaskVO taskInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_detail")

    private List<Real3DProductDetailVO> productDetail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_size_byte")

    private Double storageSizeByte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_domain_id")

    private String tenantDomainId;

    public Real3DProductVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 成果影像ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Real3DProductVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 成果影像名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Real3DProductVO withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 成果影像状态。  - preparing：准备中。处于该状态表示成果模型数据正在准备，需要在该状态后才能下载、删除。 - available：可用。处于该状态时成果模型可以下载、删除。 - deleting：删除中。成果模型正在删除。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Real3DProductVO withFolderCode(String folderCode) {
        this.folderCode = folderCode;
        return this;
    }

    /**
     * 倾斜影像编码。
     * @return folderCode
     */
    public String getFolderCode() {
        return folderCode;
    }

    public void setFolderCode(String folderCode) {
        this.folderCode = folderCode;
    }

    public Real3DProductVO withTaskInfo(Real3DProductRelateTaskVO taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }

    public Real3DProductVO withTaskInfo(Consumer<Real3DProductRelateTaskVO> taskInfoSetter) {
        if (this.taskInfo == null) {
            this.taskInfo = new Real3DProductRelateTaskVO();
            taskInfoSetter.accept(this.taskInfo);
        }

        return this;
    }

    /**
     * Get taskInfo
     * @return taskInfo
     */
    public Real3DProductRelateTaskVO getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(Real3DProductRelateTaskVO taskInfo) {
        this.taskInfo = taskInfo;
    }

    public Real3DProductVO withProductDetail(List<Real3DProductDetailVO> productDetail) {
        this.productDetail = productDetail;
        return this;
    }

    public Real3DProductVO addProductDetailItem(Real3DProductDetailVO productDetailItem) {
        if (this.productDetail == null) {
            this.productDetail = new ArrayList<>();
        }
        this.productDetail.add(productDetailItem);
        return this;
    }

    public Real3DProductVO withProductDetail(Consumer<List<Real3DProductDetailVO>> productDetailSetter) {
        if (this.productDetail == null) {
            this.productDetail = new ArrayList<>();
        }
        productDetailSetter.accept(this.productDetail);
        return this;
    }

    /**
     * 成果影像详情。
     * @return productDetail
     */
    public List<Real3DProductDetailVO> getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(List<Real3DProductDetailVO> productDetail) {
        this.productDetail = productDetail;
    }

    public Real3DProductVO withStorageSizeByte(Double storageSizeByte) {
        this.storageSizeByte = storageSizeByte;
        return this;
    }

    /**
     * 成果影像占用存储空间大小（字节）。
     * @return storageSizeByte
     */
    public Double getStorageSizeByte() {
        return storageSizeByte;
    }

    public void setStorageSizeByte(Double storageSizeByte) {
        this.storageSizeByte = storageSizeByte;
    }

    public Real3DProductVO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。返回UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Real3DProductVO withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。返回UTC时间格式字符串，格式为yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Real3DProductVO withTenantDomainId(String tenantDomainId) {
        this.tenantDomainId = tenantDomainId;
        return this;
    }

    /**
     * 华为云IAM租户帐号ID。
     * @return tenantDomainId
     */
    public String getTenantDomainId() {
        return tenantDomainId;
    }

    public void setTenantDomainId(String tenantDomainId) {
        this.tenantDomainId = tenantDomainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Real3DProductVO that = (Real3DProductVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.folderCode, that.folderCode)
            && Objects.equals(this.taskInfo, that.taskInfo) && Objects.equals(this.productDetail, that.productDetail)
            && Objects.equals(this.storageSizeByte, that.storageSizeByte)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.tenantDomainId, that.tenantDomainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            folderCode,
            taskInfo,
            productDetail,
            storageSizeByte,
            createTime,
            updateTime,
            tenantDomainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Real3DProductVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    folderCode: ").append(toIndentedString(folderCode)).append("\n");
        sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
        sb.append("    productDetail: ").append(toIndentedString(productDetail)).append("\n");
        sb.append("    storageSizeByte: ").append(toIndentedString(storageSizeByte)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    tenantDomainId: ").append(toIndentedString(tenantDomainId)).append("\n");
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
