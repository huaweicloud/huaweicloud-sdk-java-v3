package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceFlavor
 */
public class InstanceFlavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_modes")

    private List<String> chargeModes = null;

    public InstanceFlavor withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * **参数说明**：创建的实例类型。实例类型说明参见[[产品规格说明](https://support.huaweicloud.com/productdesc-iothub/iot_04_0014.html)](tag:hws)[[产品规格说明](https://support.huaweicloud.com/intl/zh-cn/productdesc-iothub/iot_04_0014.html)](tag:hws_hk)。 **取值范围**： - standard：标准版实例 - enterprise：企业版实例 
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public InstanceFlavor withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数说明**：设备接入实例的规格名称。详情请参见[[产品规格说明](https://support.huaweicloud.com/productdesc-iothub/iot_04_0014.html)](tag:hws)[[产品规格说明](https://support.huaweicloud.com/intl/zh-cn/productdesc-iothub/iot_04_0014.html)](tag:hws_hk)中的规格编码。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InstanceFlavor withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：实例规格的在售状态。 **取值范围**： - normal：在售 - sellout：已售罄 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceFlavor withChargeModes(List<String> chargeModes) {
        this.chargeModes = chargeModes;
        return this;
    }

    public InstanceFlavor addChargeModesItem(String chargeModesItem) {
        if (this.chargeModes == null) {
            this.chargeModes = new ArrayList<>();
        }
        this.chargeModes.add(chargeModesItem);
        return this;
    }

    public InstanceFlavor withChargeModes(Consumer<List<String>> chargeModesSetter) {
        if (this.chargeModes == null) {
            this.chargeModes = new ArrayList<>();
        }
        chargeModesSetter.accept(this.chargeModes);
        return this;
    }

    /**
     * **参数说明**：实例规格支持的付费方式列表。 **取值范围**： - prePaid：包年/包月 - postPaid：按需计费
     * @return chargeModes
     */
    public List<String> getChargeModes() {
        return chargeModes;
    }

    public void setChargeModes(List<String> chargeModes) {
        this.chargeModes = chargeModes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceFlavor that = (InstanceFlavor) obj;
        return Objects.equals(this.instanceType, that.instanceType) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.chargeModes, that.chargeModes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceType, type, status, chargeModes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceFlavor {\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    chargeModes: ").append(toIndentedString(chargeModes)).append("\n");
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
