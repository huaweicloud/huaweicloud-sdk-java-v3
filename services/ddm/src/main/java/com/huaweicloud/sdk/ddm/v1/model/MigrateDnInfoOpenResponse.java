package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MigrateDnInfoOpenResponse
 */
public class MigrateDnInfoOpenResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_instance_id")

    private String dnInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_instance_name")

    private String dnInstanceName;

    public MigrateDnInfoOpenResponse withDnInstanceId(String dnInstanceId) {
        this.dnInstanceId = dnInstanceId;
        return this;
    }

    /**
     * rds实例id。
     * @return dnInstanceId
     */
    public String getDnInstanceId() {
        return dnInstanceId;
    }

    public void setDnInstanceId(String dnInstanceId) {
        this.dnInstanceId = dnInstanceId;
    }

    public MigrateDnInfoOpenResponse withDnInstanceName(String dnInstanceName) {
        this.dnInstanceName = dnInstanceName;
        return this;
    }

    /**
     * rds实例名称。
     * @return dnInstanceName
     */
    public String getDnInstanceName() {
        return dnInstanceName;
    }

    public void setDnInstanceName(String dnInstanceName) {
        this.dnInstanceName = dnInstanceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrateDnInfoOpenResponse that = (MigrateDnInfoOpenResponse) obj;
        return Objects.equals(this.dnInstanceId, that.dnInstanceId)
            && Objects.equals(this.dnInstanceName, that.dnInstanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnInstanceId, dnInstanceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateDnInfoOpenResponse {\n");
        sb.append("    dnInstanceId: ").append(toIndentedString(dnInstanceId)).append("\n");
        sb.append("    dnInstanceName: ").append(toIndentedString(dnInstanceName)).append("\n");
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
