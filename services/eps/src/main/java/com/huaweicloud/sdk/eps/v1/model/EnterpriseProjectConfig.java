package com.huaweicloud.sdk.eps.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EnterpriseProjectConfig
 */
public class EnterpriseProjectConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_ep_support")

    private String deleteEpSupport;

    public EnterpriseProjectConfig withDeleteEpSupport(String deleteEpSupport) {
        this.deleteEpSupport = deleteEpSupport;
        return this;
    }

    /**
     * 是否支持企业项目删除
     * @return deleteEpSupport
     */
    public String getDeleteEpSupport() {
        return deleteEpSupport;
    }

    public void setDeleteEpSupport(String deleteEpSupport) {
        this.deleteEpSupport = deleteEpSupport;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnterpriseProjectConfig that = (EnterpriseProjectConfig) obj;
        return Objects.equals(this.deleteEpSupport, that.deleteEpSupport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteEpSupport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseProjectConfig {\n");
        sb.append("    deleteEpSupport: ").append(toIndentedString(deleteEpSupport)).append("\n");
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
