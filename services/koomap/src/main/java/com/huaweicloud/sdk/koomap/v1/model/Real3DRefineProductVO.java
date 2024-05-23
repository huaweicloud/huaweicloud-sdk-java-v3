package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实景三维精修后处理成果数据对象。
 */
public class Real3DRefineProductVO {

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
    @JsonProperty(value = "subtask_info")

    private Real3DRefineProductRelateSubTaskVO subtaskInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_info")

    private Real3DRefineProductRelateTaskVO taskInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_details")

    private List<Real3DRefineProductDetailVO> productDetails = null;

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

    public Real3DRefineProductVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 精修后处理成果数据ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Real3DRefineProductVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 精修后处理成果数据名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Real3DRefineProductVO withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 精修后处理成果数据状态。  - preparing：准备中。处于该状态表示成果数据正在准备，需要在该状态后才能下载、删除。 - available: 可用。处于该状态时成果数据可以下载、删除。 - deleting：删除中。成果数据正在删除。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Real3DRefineProductVO withSubtaskInfo(Real3DRefineProductRelateSubTaskVO subtaskInfo) {
        this.subtaskInfo = subtaskInfo;
        return this;
    }

    public Real3DRefineProductVO withSubtaskInfo(Consumer<Real3DRefineProductRelateSubTaskVO> subtaskInfoSetter) {
        if (this.subtaskInfo == null) {
            this.subtaskInfo = new Real3DRefineProductRelateSubTaskVO();
            subtaskInfoSetter.accept(this.subtaskInfo);
        }

        return this;
    }

    /**
     * Get subtaskInfo
     * @return subtaskInfo
     */
    public Real3DRefineProductRelateSubTaskVO getSubtaskInfo() {
        return subtaskInfo;
    }

    public void setSubtaskInfo(Real3DRefineProductRelateSubTaskVO subtaskInfo) {
        this.subtaskInfo = subtaskInfo;
    }

    public Real3DRefineProductVO withTaskInfo(Real3DRefineProductRelateTaskVO taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }

    public Real3DRefineProductVO withTaskInfo(Consumer<Real3DRefineProductRelateTaskVO> taskInfoSetter) {
        if (this.taskInfo == null) {
            this.taskInfo = new Real3DRefineProductRelateTaskVO();
            taskInfoSetter.accept(this.taskInfo);
        }

        return this;
    }

    /**
     * Get taskInfo
     * @return taskInfo
     */
    public Real3DRefineProductRelateTaskVO getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(Real3DRefineProductRelateTaskVO taskInfo) {
        this.taskInfo = taskInfo;
    }

    public Real3DRefineProductVO withProductDetails(List<Real3DRefineProductDetailVO> productDetails) {
        this.productDetails = productDetails;
        return this;
    }

    public Real3DRefineProductVO addProductDetailsItem(Real3DRefineProductDetailVO productDetailsItem) {
        if (this.productDetails == null) {
            this.productDetails = new ArrayList<>();
        }
        this.productDetails.add(productDetailsItem);
        return this;
    }

    public Real3DRefineProductVO withProductDetails(Consumer<List<Real3DRefineProductDetailVO>> productDetailsSetter) {
        if (this.productDetails == null) {
            this.productDetails = new ArrayList<>();
        }
        productDetailsSetter.accept(this.productDetails);
        return this;
    }

    /**
     * 精修后处理成果数据详情。
     * @return productDetails
     */
    public List<Real3DRefineProductDetailVO> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(List<Real3DRefineProductDetailVO> productDetails) {
        this.productDetails = productDetails;
    }

    public Real3DRefineProductVO withStorageSizeByte(Double storageSizeByte) {
        this.storageSizeByte = storageSizeByte;
        return this;
    }

    /**
     * 精修后处理成果数据占用存储空间大小（字节）。
     * @return storageSizeByte
     */
    public Double getStorageSizeByte() {
        return storageSizeByte;
    }

    public void setStorageSizeByte(Double storageSizeByte) {
        this.storageSizeByte = storageSizeByte;
    }

    public Real3DRefineProductVO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 精修后处理成果数据的创建时间。格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Real3DRefineProductVO withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 精修后处理成果数据的更新时间。格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Real3DRefineProductVO withTenantDomainId(String tenantDomainId) {
        this.tenantDomainId = tenantDomainId;
        return this;
    }

    /**
     * 华为云IAM租户账号ID。
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
        Real3DRefineProductVO that = (Real3DRefineProductVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.subtaskInfo, that.subtaskInfo)
            && Objects.equals(this.taskInfo, that.taskInfo) && Objects.equals(this.productDetails, that.productDetails)
            && Objects.equals(this.storageSizeByte, that.storageSizeByte)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.tenantDomainId, that.tenantDomainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            subtaskInfo,
            taskInfo,
            productDetails,
            storageSizeByte,
            createTime,
            updateTime,
            tenantDomainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Real3DRefineProductVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subtaskInfo: ").append(toIndentedString(subtaskInfo)).append("\n");
        sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
        sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
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
