package com.huaweicloud.sdk.cbr.v1.model;

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
public class BatchUpdateVaultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_vaults_id")

    private List<String> updatedVaultsId = null;

    public BatchUpdateVaultResponse withUpdatedVaultsId(List<String> updatedVaultsId) {
        this.updatedVaultsId = updatedVaultsId;
        return this;
    }

    public BatchUpdateVaultResponse addUpdatedVaultsIdItem(String updatedVaultsIdItem) {
        if (this.updatedVaultsId == null) {
            this.updatedVaultsId = new ArrayList<>();
        }
        this.updatedVaultsId.add(updatedVaultsIdItem);
        return this;
    }

    public BatchUpdateVaultResponse withUpdatedVaultsId(Consumer<List<String>> updatedVaultsIdSetter) {
        if (this.updatedVaultsId == null) {
            this.updatedVaultsId = new ArrayList<>();
        }
        updatedVaultsIdSetter.accept(this.updatedVaultsId);
        return this;
    }

    /**
     * 已批量修改id列表
     * @return updatedVaultsId
     */
    public List<String> getUpdatedVaultsId() {
        return updatedVaultsId;
    }

    public void setUpdatedVaultsId(List<String> updatedVaultsId) {
        this.updatedVaultsId = updatedVaultsId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateVaultResponse that = (BatchUpdateVaultResponse) obj;
        return Objects.equals(this.updatedVaultsId, that.updatedVaultsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updatedVaultsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateVaultResponse {\n");
        sb.append("    updatedVaultsId: ").append(toIndentedString(updatedVaultsId)).append("\n");
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
