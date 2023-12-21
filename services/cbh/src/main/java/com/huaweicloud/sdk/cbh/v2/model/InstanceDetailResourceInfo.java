package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源信息。
 */
public class InstanceDetailResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_size")

    private BigDecimal dataDiskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_resource_id")

    private List<String> diskResourceId = null;

    public InstanceDetailResourceInfo withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 云堡垒机实例规格。
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public InstanceDetailResourceInfo withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单id。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public InstanceDetailResourceInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 云堡垒机实例的资源id，UUID格式显示。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public InstanceDetailResourceInfo withDataDiskSize(BigDecimal dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }

    /**
     * 云堡垒机实例数据盘大小，单位TB。
     * minimum: 0
     * maximum: 3E+2
     * @return dataDiskSize
     */
    public BigDecimal getDataDiskSize() {
        return dataDiskSize;
    }

    public void setDataDiskSize(BigDecimal dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
    }

    public InstanceDetailResourceInfo withDiskResourceId(List<String> diskResourceId) {
        this.diskResourceId = diskResourceId;
        return this;
    }

    public InstanceDetailResourceInfo addDiskResourceIdItem(String diskResourceIdItem) {
        if (this.diskResourceId == null) {
            this.diskResourceId = new ArrayList<>();
        }
        this.diskResourceId.add(diskResourceIdItem);
        return this;
    }

    public InstanceDetailResourceInfo withDiskResourceId(Consumer<List<String>> diskResourceIdSetter) {
        if (this.diskResourceId == null) {
            this.diskResourceId = new ArrayList<>();
        }
        diskResourceIdSetter.accept(this.diskResourceId);
        return this;
    }

    /**
     * 云堡垒机实例数据盘资源ID。
     * @return diskResourceId
     */
    public List<String> getDiskResourceId() {
        return diskResourceId;
    }

    public void setDiskResourceId(List<String> diskResourceId) {
        this.diskResourceId = diskResourceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDetailResourceInfo that = (InstanceDetailResourceInfo) obj;
        return Objects.equals(this.specification, that.specification) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.dataDiskSize, that.dataDiskSize)
            && Objects.equals(this.diskResourceId, that.diskResourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specification, orderId, resourceId, dataDiskSize, diskResourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDetailResourceInfo {\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    dataDiskSize: ").append(toIndentedString(dataDiskSize)).append("\n");
        sb.append("    diskResourceId: ").append(toIndentedString(diskResourceId)).append("\n");
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
