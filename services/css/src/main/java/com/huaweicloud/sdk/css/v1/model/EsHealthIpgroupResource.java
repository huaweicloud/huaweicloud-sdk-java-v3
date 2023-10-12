package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EsHealthIpgroupResource
 */
public class EsHealthIpgroupResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup_id")

    private String ipgroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ipgroup")

    private Boolean enableIpgroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public EsHealthIpgroupResource withIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
        return this;
    }

    /**
     * 监听器关联的访问控制组的id。
     * @return ipgroupId
     */
    public String getIpgroupId() {
        return ipgroupId;
    }

    public void setIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
    }

    public EsHealthIpgroupResource withEnableIpgroup(Boolean enableIpgroup) {
        this.enableIpgroup = enableIpgroup;
        return this;
    }

    /**
     * 访问控制组的状态。
     * @return enableIpgroup
     */
    public Boolean getEnableIpgroup() {
        return enableIpgroup;
    }

    public void setEnableIpgroup(Boolean enableIpgroup) {
        this.enableIpgroup = enableIpgroup;
    }

    public EsHealthIpgroupResource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 访问控制组的类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EsHealthIpgroupResource that = (EsHealthIpgroupResource) obj;
        return Objects.equals(this.ipgroupId, that.ipgroupId) && Objects.equals(this.enableIpgroup, that.enableIpgroup)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroupId, enableIpgroup, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsHealthIpgroupResource {\n");
        sb.append("    ipgroupId: ").append(toIndentedString(ipgroupId)).append("\n");
        sb.append("    enableIpgroup: ").append(toIndentedString(enableIpgroup)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
