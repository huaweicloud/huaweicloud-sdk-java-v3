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
public class ListVaultTopsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vaults")

    private List<ListVaultTopsResponseBodyVaults> vaults = null;

    public ListVaultTopsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 存储库总数
     * minimum: 0
     * maximum: 65535
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListVaultTopsResponse withVaults(List<ListVaultTopsResponseBodyVaults> vaults) {
        this.vaults = vaults;
        return this;
    }

    public ListVaultTopsResponse addVaultsItem(ListVaultTopsResponseBodyVaults vaultsItem) {
        if (this.vaults == null) {
            this.vaults = new ArrayList<>();
        }
        this.vaults.add(vaultsItem);
        return this;
    }

    public ListVaultTopsResponse withVaults(Consumer<List<ListVaultTopsResponseBodyVaults>> vaultsSetter) {
        if (this.vaults == null) {
            this.vaults = new ArrayList<>();
        }
        vaultsSetter.accept(this.vaults);
        return this;
    }

    /**
     * 存储库统计信息
     * @return vaults
     */
    public List<ListVaultTopsResponseBodyVaults> getVaults() {
        return vaults;
    }

    public void setVaults(List<ListVaultTopsResponseBodyVaults> vaults) {
        this.vaults = vaults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVaultTopsResponse that = (ListVaultTopsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.vaults, that.vaults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, vaults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVaultTopsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    vaults: ").append(toIndentedString(vaults)).append("\n");
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
