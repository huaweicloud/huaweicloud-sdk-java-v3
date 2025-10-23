package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListVaultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vaults")

    private List<CbrVaultDetail> vaults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListVaultResponse withVaults(List<CbrVaultDetail> vaults) {
        this.vaults = vaults;
        return this;
    }

    public ListVaultResponse addVaultsItem(CbrVaultDetail vaultsItem) {
        if (this.vaults == null) {
            this.vaults = new ArrayList<>();
        }
        this.vaults.add(vaultsItem);
        return this;
    }

    public ListVaultResponse withVaults(Consumer<List<CbrVaultDetail>> vaultsSetter) {
        if (this.vaults == null) {
            this.vaults = new ArrayList<>();
        }
        vaultsSetter.accept(this.vaults);
        return this;
    }

    /**
     * 存储库实例列表
     * @return vaults
     */
    public List<CbrVaultDetail> getVaults() {
        return vaults;
    }

    public void setVaults(List<CbrVaultDetail> vaults) {
        this.vaults = vaults;
    }

    public ListVaultResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 存储库个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVaultResponse that = (ListVaultResponse) obj;
        return Objects.equals(this.vaults, that.vaults) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaults, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVaultResponse {\n");
        sb.append("    vaults: ").append(toIndentedString(vaults)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
