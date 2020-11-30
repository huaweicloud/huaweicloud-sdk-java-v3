package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.AddressInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * addresses数据结构说明
 */
public class AddressesInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private List<AddressInfo> vpcId = null;
    
    public AddressesInfo withVpcId(List<AddressInfo> vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    
    public AddressesInfo addVpcIdItem(AddressInfo vpcIdItem) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        this.vpcId.add(vpcIdItem);
        return this;
    }

    public AddressesInfo withVpcId(Consumer<List<AddressInfo>> vpcIdSetter) {
        if(this.vpcId == null ){
            this.vpcId = new ArrayList<>();
        }
        vpcIdSetter.accept(this.vpcId);
        return this;
    }

    /**
     * 裸金属服务器所属网络信息。key：表示裸金属服务器使用的虚拟私有云的ID。value：网络详细信息，具体请参见表4 address数据结构说明。
     * @return vpcId
     */
    public List<AddressInfo> getVpcId() {
        return vpcId;
    }

    public void setVpcId(List<AddressInfo> vpcId) {
        this.vpcId = vpcId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddressesInfo addressesInfo = (AddressesInfo) o;
        return Objects.equals(this.vpcId, addressesInfo.vpcId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vpcId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressesInfo {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

