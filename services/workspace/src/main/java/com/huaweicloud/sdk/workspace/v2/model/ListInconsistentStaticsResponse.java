package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListInconsistentStaticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private Integer productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private Integer imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_num")

    private Integer diskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_size")

    private Integer diskSize;

    public ListInconsistentStaticsResponse withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 统计productID与桌面池套餐ID不一致的桌面数量
     * minimum: 0
     * maximum: 20000
     * @return productId
     */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public ListInconsistentStaticsResponse withImageId(Integer imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 统计imageID与桌面池镜像ID不一致的桌面数量
     * minimum: 0
     * maximum: 20000
     * @return imageId
     */
    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public ListInconsistentStaticsResponse withDiskNum(Integer diskNum) {
        this.diskNum = diskNum;
        return this;
    }

    /**
     * 统计数据盘数量与桌面池配置不一致的桌面数量
     * minimum: 0
     * maximum: 20000
     * @return diskNum
     */
    public Integer getDiskNum() {
        return diskNum;
    }

    public void setDiskNum(Integer diskNum) {
        this.diskNum = diskNum;
    }

    public ListInconsistentStaticsResponse withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * 统计磁盘累加容量与桌面池配置不一致的桌面数量
     * minimum: 0
     * maximum: 20000
     * @return diskSize
     */
    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInconsistentStaticsResponse that = (ListInconsistentStaticsResponse) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.diskNum, that.diskNum) && Objects.equals(this.diskSize, that.diskSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, imageId, diskNum, diskSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInconsistentStaticsResponse {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    diskNum: ").append(toIndentedString(diskNum)).append("\n");
        sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
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
