package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMultiTenantResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_tenant_switch")

    private Boolean multiTenantSwitch;

    public ShowMultiTenantResponse withMultiTenantSwitch(Boolean multiTenantSwitch) {
        this.multiTenantSwitch = multiTenantSwitch;
        return this;
    }

    /**
     * 实例多租特性开关。 - true:开启 - false:关闭。
     * @return multiTenantSwitch
     */
    public Boolean getMultiTenantSwitch() {
        return multiTenantSwitch;
    }

    public void setMultiTenantSwitch(Boolean multiTenantSwitch) {
        this.multiTenantSwitch = multiTenantSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMultiTenantResponse that = (ShowMultiTenantResponse) obj;
        return Objects.equals(this.multiTenantSwitch, that.multiTenantSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multiTenantSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMultiTenantResponse {\n");
        sb.append("    multiTenantSwitch: ").append(toIndentedString(multiTenantSwitch)).append("\n");
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
