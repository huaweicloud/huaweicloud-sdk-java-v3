package com.huaweicloud.sdk.rds.v3.model;

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
public class ListInstanceBackupSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infos")

    private List<InstanceBackupSummary> infos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListInstanceBackupSummaryResponse withInfos(List<InstanceBackupSummary> infos) {
        this.infos = infos;
        return this;
    }

    public ListInstanceBackupSummaryResponse addInfosItem(InstanceBackupSummary infosItem) {
        if (this.infos == null) {
            this.infos = new ArrayList<>();
        }
        this.infos.add(infosItem);
        return this;
    }

    public ListInstanceBackupSummaryResponse withInfos(Consumer<List<InstanceBackupSummary>> infosSetter) {
        if (this.infos == null) {
            this.infos = new ArrayList<>();
        }
        infosSetter.accept(this.infos);
        return this;
    }

    /**
     * **参数解释**：  实例备份概览列表  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return infos
     */
    public List<InstanceBackupSummary> getInfos() {
        return infos;
    }

    public void setInfos(List<InstanceBackupSummary> infos) {
        this.infos = infos;
    }

    public ListInstanceBackupSummaryResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：  总记录数。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceBackupSummaryResponse that = (ListInstanceBackupSummaryResponse) obj;
        return Objects.equals(this.infos, that.infos) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infos, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceBackupSummaryResponse {\n");
        sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
