package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 条件中设备消息类型的信息，自定义结构。
 */
public class DeviceMessageCondition  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;

    public DeviceMessageCondition withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * **参数说明**：设备关联的产品ID，用于唯一标识一个产品模型，在管理门户导入产品模型后由平台分配获得。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    

    public DeviceMessageCondition withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    


    /**
     * **参数说明**：产品关联的topic信息，用于过滤消息中指定topic消息。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceMessageCondition deviceMessageCondition = (DeviceMessageCondition) o;
        return Objects.equals(this.productId, deviceMessageCondition.productId) &&
            Objects.equals(this.topic, deviceMessageCondition.topic);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productId, topic);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceMessageCondition {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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

