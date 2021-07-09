package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VaultAssociate
 */
public class VaultAssociate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_vault_id")
    
    private String destinationVaultId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_id")
    
    private String policyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="add_policy_ids")
    
    private List<String> addPolicyIds = null;
    
    public VaultAssociate withDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
        return this;
    }

    


    /**
     * 目标vault ID , 只有设置复制策略时使用，而且必传
     * @return destinationVaultId
     */
    public String getDestinationVaultId() {
        return destinationVaultId;
    }

    public void setDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
    }

    

    public VaultAssociate withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    


    /**
     * 策略ID。policy_id字段与add_policy_ids字段在一次请求中有且只有一个。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    

    public VaultAssociate withAddPolicyIds(List<String> addPolicyIds) {
        this.addPolicyIds = addPolicyIds;
        return this;
    }

    
    public VaultAssociate addAddPolicyIdsItem(String addPolicyIdsItem) {
        if(this.addPolicyIds == null) {
            this.addPolicyIds = new ArrayList<>();
        }
        this.addPolicyIds.add(addPolicyIdsItem);
        return this;
    }

    public VaultAssociate withAddPolicyIds(Consumer<List<String>> addPolicyIdsSetter) {
        if(this.addPolicyIds == null) {
            this.addPolicyIds = new ArrayList<>();
        }
        addPolicyIdsSetter.accept(this.addPolicyIds);
        return this;
    }

    /**
     * 多策略场景下，绑定新策略的id列表。policy_id字段与add_policy_ids字段在一次请求中有且只有一个。
     * @return addPolicyIds
     */
    public List<String> getAddPolicyIds() {
        return addPolicyIds;
    }

    public void setAddPolicyIds(List<String> addPolicyIds) {
        this.addPolicyIds = addPolicyIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultAssociate vaultAssociate = (VaultAssociate) o;
        return Objects.equals(this.destinationVaultId, vaultAssociate.destinationVaultId) &&
            Objects.equals(this.policyId, vaultAssociate.policyId) &&
            Objects.equals(this.addPolicyIds, vaultAssociate.addPolicyIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(destinationVaultId, policyId, addPolicyIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultAssociate {\n");
        sb.append("    destinationVaultId: ").append(toIndentedString(destinationVaultId)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    addPolicyIds: ").append(toIndentedString(addPolicyIds)).append("\n");
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

