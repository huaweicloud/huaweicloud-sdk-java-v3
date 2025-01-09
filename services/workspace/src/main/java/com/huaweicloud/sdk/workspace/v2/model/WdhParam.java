package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * wdh参数
 */
public class WdhParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenancy")

    private String tenancy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private String dedicatedHostId;

    public WdhParam withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * 在指定的桌面专属主机上创建桌面。  - dedicated：桌面专属主机。
     * @return tenancy
     */
    public String getTenancy() {
        return tenancy;
    }

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    public WdhParam withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    /**
     * 桌面专属主机的ID。 指定桌面专属主机的ID则将桌面放置到此桌面专属主机。 未指定桌面专属主机的ID则使用自动放置功能放置到可用的桌面专属主机。 注意： - 仅在tenancy指定为dedicated时此字段生效。 - 若要使用自动放置功能来创建桌面，您需要先开启桌面专属主机的自动放置功能。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WdhParam that = (WdhParam) obj;
        return Objects.equals(this.tenancy, that.tenancy) && Objects.equals(this.dedicatedHostId, that.dedicatedHostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenancy, dedicatedHostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WdhParam {\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
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
