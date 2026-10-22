package com.huaweicloud.sdk.evs.v2.model;

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
public class ListSnapshotChainsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_chains")

    private List<ListSnapshotChainsResponseBodySnapshotChains> snapshotChains = null;

    public ListSnapshotChainsResponse withSnapshotChains(
        List<ListSnapshotChainsResponseBodySnapshotChains> snapshotChains) {
        this.snapshotChains = snapshotChains;
        return this;
    }

    public ListSnapshotChainsResponse addSnapshotChainsItem(
        ListSnapshotChainsResponseBodySnapshotChains snapshotChainsItem) {
        if (this.snapshotChains == null) {
            this.snapshotChains = new ArrayList<>();
        }
        this.snapshotChains.add(snapshotChainsItem);
        return this;
    }

    public ListSnapshotChainsResponse withSnapshotChains(
        Consumer<List<ListSnapshotChainsResponseBodySnapshotChains>> snapshotChainsSetter) {
        if (this.snapshotChains == null) {
            this.snapshotChains = new ArrayList<>();
        }
        snapshotChainsSetter.accept(this.snapshotChains);
        return this;
    }

    /**
     * **参数解释** 快照链列表。 **取值范围** 不涉及
     * @return snapshotChains
     */
    public List<ListSnapshotChainsResponseBodySnapshotChains> getSnapshotChains() {
        return snapshotChains;
    }

    public void setSnapshotChains(List<ListSnapshotChainsResponseBodySnapshotChains> snapshotChains) {
        this.snapshotChains = snapshotChains;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSnapshotChainsResponse that = (ListSnapshotChainsResponse) obj;
        return Objects.equals(this.snapshotChains, that.snapshotChains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotChains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotChainsResponse {\n");
        sb.append("    snapshotChains: ").append(toIndentedString(snapshotChains)).append("\n");
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
