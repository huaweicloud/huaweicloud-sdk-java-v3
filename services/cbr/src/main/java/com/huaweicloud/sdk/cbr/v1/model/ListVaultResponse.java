package com.huaweicloud.sdk.cbr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.Vault;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListVaultResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vaults")
    
    private List<Vault> vaults = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;

    public ListVaultResponse withVaults(List<Vault> vaults) {
        this.vaults = vaults;
        return this;
    }

    
    public ListVaultResponse addVaultsItem(Vault vaultsItem) {
        if(this.vaults == null) {
            this.vaults = new ArrayList<>();
        }
        this.vaults.add(vaultsItem);
        return this;
    }

    public ListVaultResponse withVaults(Consumer<List<Vault>> vaultsSetter) {
        if(this.vaults == null) {
            this.vaults = new ArrayList<>();
        }
        vaultsSetter.accept(this.vaults);
        return this;
    }

    /**
     * 存储库实例列表
     * @return vaults
     */
    public List<Vault> getVaults() {
        return vaults;
    }

    public void setVaults(List<Vault> vaults) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVaultResponse listVaultResponse = (ListVaultResponse) o;
        return Objects.equals(this.vaults, listVaultResponse.vaults) &&
            Objects.equals(this.count, listVaultResponse.count);
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

