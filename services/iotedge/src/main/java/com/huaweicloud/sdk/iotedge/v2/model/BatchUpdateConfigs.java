package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 根据产品名称和实例，批量修改子设备协议配置请求结构体。
 */
public class BatchUpdateConfigs  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_mapping")
    
    
    private Object protocolMapping;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;

    public BatchUpdateConfigs withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 设备关联的产品ID，用于唯一标识一个产品模型，在管理门户导入产品模型后由平台分配获得。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    

    public BatchUpdateConfigs withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * **参数说明**：资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定归属到哪个资源空间下，否则将会归属到[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public BatchUpdateConfigs withProtocolMapping(Object protocolMapping) {
        this.protocolMapping = protocolMapping;
        return this;
    }

    


    /**
     * 设备协议配置数据。
     * @return protocolMapping
     */
    public Object getProtocolMapping() {
        return protocolMapping;
    }

    public void setProtocolMapping(Object protocolMapping) {
        this.protocolMapping = protocolMapping;
    }

    

    public BatchUpdateConfigs withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * **参数说明**：实例ID。物理多租下各实例的唯一标识，一般华为云租户无需携带该参数，仅在物理多租场景下从管理面访问API时需要携带该参数。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchUpdateConfigs batchUpdateConfigs = (BatchUpdateConfigs) o;
        return Objects.equals(this.productId, batchUpdateConfigs.productId) &&
            Objects.equals(this.appId, batchUpdateConfigs.appId) &&
            Objects.equals(this.protocolMapping, batchUpdateConfigs.protocolMapping) &&
            Objects.equals(this.instanceId, batchUpdateConfigs.instanceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productId, appId, protocolMapping, instanceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateConfigs {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    protocolMapping: ").append(toIndentedString(protocolMapping)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

