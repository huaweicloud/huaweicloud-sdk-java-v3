package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 更新弹性公网IP参数 */
public class UpdatePublicIpOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    public UpdatePublicIpOption withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /** vip对应的port的ID可为空。当为空的时候，代表解绑原有eip的关系。不为空时，代表绑定eip和vip。
     * 
     * @return portId */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePublicIpOption updatePublicIpOption = (UpdatePublicIpOption) o;
        return Objects.equals(this.portId, updatePublicIpOption.portId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicIpOption {\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
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
