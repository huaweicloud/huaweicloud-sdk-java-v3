package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListRetainedBackupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_backup_infos")

    private List<RetainedBackupInfo> recycleBackupInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private RetainedBackupPolicy policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListRetainedBackupsResponse withRecycleBackupInfos(List<RetainedBackupInfo> recycleBackupInfos) {
        this.recycleBackupInfos = recycleBackupInfos;
        return this;
    }

    public ListRetainedBackupsResponse addRecycleBackupInfosItem(RetainedBackupInfo recycleBackupInfosItem) {
        if (this.recycleBackupInfos == null) {
            this.recycleBackupInfos = new ArrayList<>();
        }
        this.recycleBackupInfos.add(recycleBackupInfosItem);
        return this;
    }

    public ListRetainedBackupsResponse withRecycleBackupInfos(
        Consumer<List<RetainedBackupInfo>> recycleBackupInfosSetter) {
        if (this.recycleBackupInfos == null) {
            this.recycleBackupInfos = new ArrayList<>();
        }
        recycleBackupInfosSetter.accept(this.recycleBackupInfos);
        return this;
    }

    /**
     * **参数解释**：  保留备份信息列表。
     * @return recycleBackupInfos
     */
    public List<RetainedBackupInfo> getRecycleBackupInfos() {
        return recycleBackupInfos;
    }

    public void setRecycleBackupInfos(List<RetainedBackupInfo> recycleBackupInfos) {
        this.recycleBackupInfos = recycleBackupInfos;
    }

    public ListRetainedBackupsResponse withPolicy(RetainedBackupPolicy policy) {
        this.policy = policy;
        return this;
    }

    public ListRetainedBackupsResponse withPolicy(Consumer<RetainedBackupPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new RetainedBackupPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public RetainedBackupPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(RetainedBackupPolicy policy) {
        this.policy = policy;
    }

    public ListRetainedBackupsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：  保留备份总数。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRetainedBackupsResponse that = (ListRetainedBackupsResponse) obj;
        return Objects.equals(this.recycleBackupInfos, that.recycleBackupInfos)
            && Objects.equals(this.policy, that.policy) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recycleBackupInfos, policy, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRetainedBackupsResponse {\n");
        sb.append("    recycleBackupInfos: ").append(toIndentedString(recycleBackupInfos)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
