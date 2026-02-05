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
public class CheckDataNodeConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_check_infos")

    private List<CheckRdsConnectionResqVO> rdsCheckInfos = null;

    public CheckDataNodeConnectionResponse withRdsCheckInfos(List<CheckRdsConnectionResqVO> rdsCheckInfos) {
        this.rdsCheckInfos = rdsCheckInfos;
        return this;
    }

    public CheckDataNodeConnectionResponse addRdsCheckInfosItem(CheckRdsConnectionResqVO rdsCheckInfosItem) {
        if (this.rdsCheckInfos == null) {
            this.rdsCheckInfos = new ArrayList<>();
        }
        this.rdsCheckInfos.add(rdsCheckInfosItem);
        return this;
    }

    public CheckDataNodeConnectionResponse withRdsCheckInfos(
        Consumer<List<CheckRdsConnectionResqVO>> rdsCheckInfosSetter) {
        if (this.rdsCheckInfos == null) {
            this.rdsCheckInfos = new ArrayList<>();
        }
        rdsCheckInfosSetter.accept(this.rdsCheckInfos);
        return this;
    }

    /**
     * **参数解释**：  rds测试连通性相关信息的集合。  **参数范围**：  不涉及。
     * @return rdsCheckInfos
     */
    public List<CheckRdsConnectionResqVO> getRdsCheckInfos() {
        return rdsCheckInfos;
    }

    public void setRdsCheckInfos(List<CheckRdsConnectionResqVO> rdsCheckInfos) {
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
        CheckDataNodeConnectionResponse that = (CheckDataNodeConnectionResponse) obj;
        return Objects.equals(this.rdsCheckInfos, that.rdsCheckInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rdsCheckInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckDataNodeConnectionResponse {\n");
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
