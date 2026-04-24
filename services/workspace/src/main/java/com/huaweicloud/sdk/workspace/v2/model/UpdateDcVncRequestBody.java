package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新专项自主维护请求体
 */
public class UpdateDcVncRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_vnc_ip")

    private String dcVncIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "center_subnet_id")

    private String centerSubnetId;

    public UpdateDcVncRequestBody withDcVncIp(String dcVncIp) {
        this.dcVncIp = dcVncIp;
        return this;
    }

    /**
     * - default: 自动开启 - close: 关闭
     * @return dcVncIp
     */
    public String getDcVncIp() {
        return dcVncIp;
    }

    public void setDcVncIp(String dcVncIp) {
        this.dcVncIp = dcVncIp;
    }

    public UpdateDcVncRequestBody withCenterSubnetId(String centerSubnetId) {
        this.centerSubnetId = centerSubnetId;
        return this;
    }

    /**
     * 中心可用区的子网id，当dc_vnc_ip为default，且站点属于边缘小站时必传
     * @return centerSubnetId
     */
    public String getCenterSubnetId() {
        return centerSubnetId;
    }

    public void setCenterSubnetId(String centerSubnetId) {
        this.centerSubnetId = centerSubnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDcVncRequestBody that = (UpdateDcVncRequestBody) obj;
        return Objects.equals(this.dcVncIp, that.dcVncIp) && Objects.equals(this.centerSubnetId, that.centerSubnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dcVncIp, centerSubnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDcVncRequestBody {\n");
        sb.append("    dcVncIp: ").append(toIndentedString(dcVncIp)).append("\n");
        sb.append("    centerSubnetId: ").append(toIndentedString(centerSubnetId)).append("\n");
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
