package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** InterfaceAttachableQuantity */
public class InterfaceAttachableQuantity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_nic")

    private Integer freeNic;

    public InterfaceAttachableQuantity withFreeNic(Integer freeNic) {
        this.freeNic = freeNic;
        return this;
    }

    /** 云服务器剩余可挂载网卡数量
     * 
     * @return freeNic */
    public Integer getFreeNic() {
        return freeNic;
    }

    public void setFreeNic(Integer freeNic) {
        this.freeNic = freeNic;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InterfaceAttachableQuantity interfaceAttachableQuantity = (InterfaceAttachableQuantity) o;
        return Objects.equals(this.freeNic, interfaceAttachableQuantity.freeNic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeNic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterfaceAttachableQuantity {\n");
        sb.append("    freeNic: ").append(toIndentedString(freeNic)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
