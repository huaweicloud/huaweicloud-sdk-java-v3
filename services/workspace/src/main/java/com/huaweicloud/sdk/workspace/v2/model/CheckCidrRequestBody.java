package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 校验租户冲突网段请求体
 */
public class CheckCidrRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_cidrs")

    private List<String> tenantCidrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    public CheckCidrRequestBody withTenantCidrs(List<String> tenantCidrs) {
        this.tenantCidrs = tenantCidrs;
        return this;
    }

    public CheckCidrRequestBody addTenantCidrsItem(String tenantCidrsItem) {
        if (this.tenantCidrs == null) {
            this.tenantCidrs = new ArrayList<>();
        }
        this.tenantCidrs.add(tenantCidrsItem);
        return this;
    }

    public CheckCidrRequestBody withTenantCidrs(Consumer<List<String>> tenantCidrsSetter) {
        if (this.tenantCidrs == null) {
            this.tenantCidrs = new ArrayList<>();
        }
        tenantCidrsSetter.accept(this.tenantCidrs);
        return this;
    }

    /**
     * 租户网段
     * @return tenantCidrs
     */
    public List<String> getTenantCidrs() {
        return tenantCidrs;
    }

    public void setTenantCidrs(List<String> tenantCidrs) {
        this.tenantCidrs = tenantCidrs;
    }

    public CheckCidrRequestBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 开通服务资源使用的可用分区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckCidrRequestBody that = (CheckCidrRequestBody) obj;
        return Objects.equals(this.tenantCidrs, that.tenantCidrs)
            && Objects.equals(this.availabilityZone, that.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantCidrs, availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckCidrRequestBody {\n");
        sb.append("    tenantCidrs: ").append(toIndentedString(tenantCidrs)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
