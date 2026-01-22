package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowKafkaProductCoresRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_num")

    private String brokerNum;

    public ShowKafkaProductCoresRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。获取方法如下：调用“查询所有实例列表”接口，从响应体中获取实例ID。实例ID非必填项，只有填写实例ID响应体才会返回total_extend_storage_space。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowKafkaProductCoresRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释**： 产品ID。 **约束限制**： 不涉及。 **取值范围**： - s6.2u4g.single.small：规格kafka.2u4g.single.small的产品ID。 - c6.2u4g.single：规格kafka.2u4g.single的产品ID。 [- s6.2u4g.cluster.small：规格kafka.2u4g.cluster.small的产品ID。](tag:hws,hws_hk,hws_eu,dt,ax) - c6.2u4g.cluster：规格kafka.2u4g.cluster的产品ID。 - c6.4u8g.cluster：规格kafka.4u8g.cluster的产品ID。 - c6.8u16g.cluster：规格kafka.8u16g.cluster的产品ID。 - c6.12u24g.cluster：规格kafka.12u24g.cluster的产品ID。 - c6.16u32g.cluster：规格kafka.16u32g.cluster的产品ID。  **默认取值**： 不涉及。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ShowKafkaProductCoresRequest withBrokerNum(String brokerNum) {
        this.brokerNum = brokerNum;
        return this;
    }

    /**
     * **参数解释**： broker数量。 **约束限制**： 不涉及。 **取值范围**： - Kafka实例规格为kafka.2u4g.single.small时，代理数建议取值范围1。 - Kafka实例规格为kafka.2u4g.single时，代理数建议取值范围1。 [- Kafka实例规格为kafka.2u4g.cluster.small时，代理数取值范围3-30。](tag:hws,hws_hk,hws_eu,dt,ax) - Kafka实例规格为kafka.2u4g.cluster时，代理数取值范围3-30。 - Kafka实例规格为kafka.4u8g.cluster时，代理数取值范围3-30。 - Kafka实例规格为kafka.8u16g.cluster时，代理数取值范围3-50。 - Kafka实例规格为kafka.12u24g.cluster时，代理数取值范围3-50。 - Kafka实例规格为kafka.16u32g.cluster时，代理数取值范围3-50。 **默认取值**： 不涉及。
     * @return brokerNum
     */
    public String getBrokerNum() {
        return brokerNum;
    }

    public void setBrokerNum(String brokerNum) {
        this.brokerNum = brokerNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKafkaProductCoresRequest that = (ShowKafkaProductCoresRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.brokerNum, that.brokerNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, productId, brokerNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKafkaProductCoresRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    brokerNum: ").append(toIndentedString(brokerNum)).append("\n");
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
