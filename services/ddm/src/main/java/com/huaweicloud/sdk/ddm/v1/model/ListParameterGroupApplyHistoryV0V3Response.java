package com.huaweicloud.sdk.ddm.v1.model;

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
public class ListParameterGroupApplyHistoryV0V3Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_check_infos")

    private List<ApplyHistory> rdsCheckInfos = null;

    public ListParameterGroupApplyHistoryV0V3Response withRdsCheckInfos(List<ApplyHistory> rdsCheckInfos) {
        this.rdsCheckInfos = rdsCheckInfos;
        return this;
    }

    public ListParameterGroupApplyHistoryV0V3Response addRdsCheckInfosItem(ApplyHistory rdsCheckInfosItem) {
        if (this.rdsCheckInfos == null) {
            this.rdsCheckInfos = new ArrayList<>();
        }
        this.rdsCheckInfos.add(rdsCheckInfosItem);
        return this;
    }

    public ListParameterGroupApplyHistoryV0V3Response withRdsCheckInfos(
        Consumer<List<ApplyHistory>> rdsCheckInfosSetter) {
        if (this.rdsCheckInfos == null) {
            this.rdsCheckInfos = new ArrayList<>();
        }
        rdsCheckInfosSetter.accept(this.rdsCheckInfos);
        return this;
    }

    /**
     * **参数解释**：  参数组应用记录相关信息的集合。  **参数范围**：  不涉及。
     * @return rdsCheckInfos
     */
    public List<ApplyHistory> getRdsCheckInfos() {
        return rdsCheckInfos;
    }

    public void setRdsCheckInfos(List<ApplyHistory> rdsCheckInfos) {
        this.rdsCheckInfos = rdsCheckInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListParameterGroupApplyHistoryV0V3Response that = (ListParameterGroupApplyHistoryV0V3Response) obj;
        return Objects.equals(this.rdsCheckInfos, that.rdsCheckInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rdsCheckInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListParameterGroupApplyHistoryV0V3Response {\n");
        sb.append("    rdsCheckInfos: ").append(toIndentedString(rdsCheckInfos)).append("\n");
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
