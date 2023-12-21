package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建云堡垒机实例变更任务请求体。  &gt; 说明： new_resource_spec_code和attach_disk_size字段只能选择使用，不能同时使用。 
 */
public class ChangeInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private Object serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_resource_spec_code")

    private String newResourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_disk_size")

    private Integer attachDiskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Integer isAutoPay;

    public ChangeInstanceRequestBody withServerId(Object serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * Get serverId
     * @return serverId
     */
    public Object getServerId() {
        return serverId;
    }

    public void setServerId(Object serverId) {
        this.serverId = serverId;
    }

    public ChangeInstanceRequestBody withNewResourceSpecCode(String newResourceSpecCode) {
        this.newResourceSpecCode = newResourceSpecCode;
        return this;
    }

    /**
     * 待变更云堡垒机规格ID，例如： - cbh.basic.50 - cbh.enhance.50  已上线的规格请参见《云堡垒机产品介绍》的[服务版本差异](https://support.huaweicloud.com/productdesc-cbh/cbh_01_0010.html)章节。
     * @return newResourceSpecCode
     */
    public String getNewResourceSpecCode() {
        return newResourceSpecCode;
    }

    public void setNewResourceSpecCode(String newResourceSpecCode) {
        this.newResourceSpecCode = newResourceSpecCode;
    }

    public ChangeInstanceRequestBody withAttachDiskSize(Integer attachDiskSize) {
        this.attachDiskSize = attachDiskSize;
        return this;
    }

    /**
     * 附加磁盘大小。单位TB  > 说明： 附加磁盘和规格自带磁盘大小不能超过300TB。
     * minimum: 0
     * maximum: 300
     * @return attachDiskSize
     */
    public Integer getAttachDiskSize() {
        return attachDiskSize;
    }

    public void setAttachDiskSize(Integer attachDiskSize) {
        this.attachDiskSize = attachDiskSize;
    }

    public ChangeInstanceRequestBody withIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动支付，下单订购后，是否自动从客户的华为云账户中支付，而不需要客户手动去进行支付。 - 1：是（会自动选择折扣和优惠券进行优惠，然后自动从客户华为云账户中支付），自动支付失败后会生成订单成功(该订单应付金额是优惠后金额)、但订单状态为“待支付”，等待客户手动支付(手动支付时，客户还可以修改系统自动选择的折扣和优惠券) - 0：否（需要客户手动去支付，客户可以选择折扣和优惠券。）  默认值为“0”
     * minimum: 0
     * maximum: 2
     * @return isAutoPay
     */
    public Integer getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeInstanceRequestBody that = (ChangeInstanceRequestBody) obj;
        return Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.newResourceSpecCode, that.newResourceSpecCode)
            && Objects.equals(this.attachDiskSize, that.attachDiskSize)
            && Objects.equals(this.isAutoPay, that.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, newResourceSpecCode, attachDiskSize, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeInstanceRequestBody {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    newResourceSpecCode: ").append(toIndentedString(newResourceSpecCode)).append("\n");
        sb.append("    attachDiskSize: ").append(toIndentedString(attachDiskSize)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
