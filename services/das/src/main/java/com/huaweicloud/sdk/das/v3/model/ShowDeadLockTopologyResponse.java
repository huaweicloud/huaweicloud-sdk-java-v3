package com.huaweicloud.sdk.das.v3.model;

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
public class ShowDeadLockTopologyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta")

    private ShowDeadLockTopologyGraphRespMeta meta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactions")

    private List<ShowDeadLockTopologyGraphRespTransactions> transactions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locks")

    private List<ShowDeadLockTopologyGraphRespLocks> locks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edges")

    private List<ShowDeadLockTopologyGraphRespEdges> edges = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conflict_groups")

    private List<ShowDeadLockTopologyGraphRespConflictGroups> conflictGroups = null;

    public ShowDeadLockTopologyResponse withMeta(ShowDeadLockTopologyGraphRespMeta meta) {
        this.meta = meta;
        return this;
    }

    public ShowDeadLockTopologyResponse withMeta(Consumer<ShowDeadLockTopologyGraphRespMeta> metaSetter) {
        if (this.meta == null) {
            this.meta = new ShowDeadLockTopologyGraphRespMeta();
            metaSetter.accept(this.meta);
        }

        return this;
    }

    /**
     * Get meta
     * @return meta
     */
    public ShowDeadLockTopologyGraphRespMeta getMeta() {
        return meta;
    }

    public void setMeta(ShowDeadLockTopologyGraphRespMeta meta) {
        this.meta = meta;
    }

    public ShowDeadLockTopologyResponse withTransactions(List<ShowDeadLockTopologyGraphRespTransactions> transactions) {
        this.transactions = transactions;
        return this;
    }

    public ShowDeadLockTopologyResponse addTransactionsItem(
        ShowDeadLockTopologyGraphRespTransactions transactionsItem) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<>();
        }
        this.transactions.add(transactionsItem);
        return this;
    }

    public ShowDeadLockTopologyResponse withTransactions(
        Consumer<List<ShowDeadLockTopologyGraphRespTransactions>> transactionsSetter) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<>();
        }
        transactionsSetter.accept(this.transactions);
        return this;
    }

    /**
     * 事务节点
     * @return transactions
     */
    public List<ShowDeadLockTopologyGraphRespTransactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<ShowDeadLockTopologyGraphRespTransactions> transactions) {
        this.transactions = transactions;
    }

    public ShowDeadLockTopologyResponse withLocks(List<ShowDeadLockTopologyGraphRespLocks> locks) {
        this.locks = locks;
        return this;
    }

    public ShowDeadLockTopologyResponse addLocksItem(ShowDeadLockTopologyGraphRespLocks locksItem) {
        if (this.locks == null) {
            this.locks = new ArrayList<>();
        }
        this.locks.add(locksItem);
        return this;
    }

    public ShowDeadLockTopologyResponse withLocks(Consumer<List<ShowDeadLockTopologyGraphRespLocks>> locksSetter) {
        if (this.locks == null) {
            this.locks = new ArrayList<>();
        }
        locksSetter.accept(this.locks);
        return this;
    }

    /**
     * 锁节点
     * @return locks
     */
    public List<ShowDeadLockTopologyGraphRespLocks> getLocks() {
        return locks;
    }

    public void setLocks(List<ShowDeadLockTopologyGraphRespLocks> locks) {
        this.locks = locks;
    }

    public ShowDeadLockTopologyResponse withEdges(List<ShowDeadLockTopologyGraphRespEdges> edges) {
        this.edges = edges;
        return this;
    }

    public ShowDeadLockTopologyResponse addEdgesItem(ShowDeadLockTopologyGraphRespEdges edgesItem) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        this.edges.add(edgesItem);
        return this;
    }

    public ShowDeadLockTopologyResponse withEdges(Consumer<List<ShowDeadLockTopologyGraphRespEdges>> edgesSetter) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        edgesSetter.accept(this.edges);
        return this;
    }

    /**
     * 边，连接节点表达关系
     * @return edges
     */
    public List<ShowDeadLockTopologyGraphRespEdges> getEdges() {
        return edges;
    }

    public void setEdges(List<ShowDeadLockTopologyGraphRespEdges> edges) {
        this.edges = edges;
    }

    public ShowDeadLockTopologyResponse withConflictGroups(
        List<ShowDeadLockTopologyGraphRespConflictGroups> conflictGroups) {
        this.conflictGroups = conflictGroups;
        return this;
    }

    public ShowDeadLockTopologyResponse addConflictGroupsItem(
        ShowDeadLockTopologyGraphRespConflictGroups conflictGroupsItem) {
        if (this.conflictGroups == null) {
            this.conflictGroups = new ArrayList<>();
        }
        this.conflictGroups.add(conflictGroupsItem);
        return this;
    }

    public ShowDeadLockTopologyResponse withConflictGroups(
        Consumer<List<ShowDeadLockTopologyGraphRespConflictGroups>> conflictGroupsSetter) {
        if (this.conflictGroups == null) {
            this.conflictGroups = new ArrayList<>();
        }
        conflictGroupsSetter.accept(this.conflictGroups);
        return this;
    }

    /**
     * 冲突组，每条 conflicts_with 边对应一个
     * @return conflictGroups
     */
    public List<ShowDeadLockTopologyGraphRespConflictGroups> getConflictGroups() {
        return conflictGroups;
    }

    public void setConflictGroups(List<ShowDeadLockTopologyGraphRespConflictGroups> conflictGroups) {
        this.conflictGroups = conflictGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockTopologyResponse that = (ShowDeadLockTopologyResponse) obj;
        return Objects.equals(this.meta, that.meta) && Objects.equals(this.transactions, that.transactions)
            && Objects.equals(this.locks, that.locks) && Objects.equals(this.edges, that.edges)
            && Objects.equals(this.conflictGroups, that.conflictGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meta, transactions, locks, edges, conflictGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockTopologyResponse {\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
        sb.append("    locks: ").append(toIndentedString(locks)).append("\n");
        sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
        sb.append("    conflictGroups: ").append(toIndentedString(conflictGroups)).append("\n");
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
