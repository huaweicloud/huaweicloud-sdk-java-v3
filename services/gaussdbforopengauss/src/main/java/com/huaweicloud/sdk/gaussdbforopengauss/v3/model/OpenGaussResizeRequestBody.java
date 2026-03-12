package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 规格变更时必填。
 */
public class OpenGaussResizeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cn_concurrent_resize_num")

    private Integer cnConcurrentResizeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_concurrent_resize_num")

    private Integer dnConcurrentResizeNum;

    public OpenGaussResizeRequestBody withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * **参数解释**: 规格变更的新规格的资源规格编码。参考表1中的“规格编码”列内容获取。参考查询数据库规格 - QueryingInstanceSpecifications中“spec_code”字段获取。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public OpenGaussResizeRequestBody withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * **参数解释**: 包周期实例时可指定，表示是否自动从账户中支付，此字段不影响自动续订的支付方式。 **约束限制**: 不涉及。 **取值范围**: - true，表示自动从账户中支付。 - false，表示手动从账户中支付，默认为该方式。  **默认取值**: false
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public OpenGaussResizeRequestBody withCnConcurrentResizeNum(Integer cnConcurrentResizeNum) {
        this.cnConcurrentResizeNum = cnConcurrentResizeNum;
        return this;
    }

    /**
     * **参数解释**: 指定CN节点的规格变更并行数。 调整CN节点并行变更数可以加快规格变更的过程，建议使用系统默认配置的规格。如需调整，请根据当前系统负载评估剩余CN节点业务负载变化情况，确保业务稳定性和中断时长在可接受范围内。 **约束限制**: 仅对独立部署形态实例生效。 **取值范围**: [1, floor(总协调节点数/2)]，单批次最多变更20个协调节点。 **默认取值**: 1
     * @return cnConcurrentResizeNum
     */
    public Integer getCnConcurrentResizeNum() {
        return cnConcurrentResizeNum;
    }

    public void setCnConcurrentResizeNum(Integer cnConcurrentResizeNum) {
        this.cnConcurrentResizeNum = cnConcurrentResizeNum;
    }

    public OpenGaussResizeRequestBody withDnConcurrentResizeNum(Integer dnConcurrentResizeNum) {
        this.dnConcurrentResizeNum = dnConcurrentResizeNum;
        return this;
    }

    /**
     * **参数解释**: 指定DN节点的规格变更并行数。 调整DN节点并行变更数可以加快规格变更的过程，建议使用系统默认配置的规格。如需调整，建议根据当前系统负载评估短时间内倒换DN节点数量情况，确保业务稳定性和中断时长在可接受范围内。 **约束限制**: 不涉及。 **取值范围**: - 当总分片数<=5时，取值范围为[1, 总分片数]。 - 当总分片数＞5时，取值范围为[1, max(floor(分片数/2),5)]，单批次最多变更20个分片。  **默认取值**: 不指定分片并发数时，分为以下两种情况： - 当总分片数<=5时，默认一起变更。 - 当总分片数＞5时，默认每次变更5个，最后一批可不足5个。
     * @return dnConcurrentResizeNum
     */
    public Integer getDnConcurrentResizeNum() {
        return dnConcurrentResizeNum;
    }

    public void setDnConcurrentResizeNum(Integer dnConcurrentResizeNum) {
        this.dnConcurrentResizeNum = dnConcurrentResizeNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenGaussResizeRequestBody that = (OpenGaussResizeRequestBody) obj;
        return Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.cnConcurrentResizeNum, that.cnConcurrentResizeNum)
            && Objects.equals(this.dnConcurrentResizeNum, that.dnConcurrentResizeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, isAutoPay, cnConcurrentResizeNum, dnConcurrentResizeNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussResizeRequestBody {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    cnConcurrentResizeNum: ").append(toIndentedString(cnConcurrentResizeNum)).append("\n");
        sb.append("    dnConcurrentResizeNum: ").append(toIndentedString(dnConcurrentResizeNum)).append("\n");
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
