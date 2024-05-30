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
public class UpgradeProxyVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_result")

    private List<ProxyUpgradeVersionDetail> updateResult = null;

    public UpgradeProxyVersionResponse withUpdateResult(List<ProxyUpgradeVersionDetail> updateResult) {
        this.updateResult = updateResult;
        return this;
    }

    public UpgradeProxyVersionResponse addUpdateResultItem(ProxyUpgradeVersionDetail updateResultItem) {
        if (this.updateResult == null) {
            this.updateResult = new ArrayList<>();
        }
        this.updateResult.add(updateResultItem);
        return this;
    }

    public UpgradeProxyVersionResponse withUpdateResult(Consumer<List<ProxyUpgradeVersionDetail>> updateResultSetter) {
        if (this.updateResult == null) {
            this.updateResult = new ArrayList<>();
        }
        updateResultSetter.accept(this.updateResult);
        return this;
    }

    /**
     * 数据库代理升级信息列表。
     * @return updateResult
     */
    public List<ProxyUpgradeVersionDetail> getUpdateResult() {
        return updateResult;
    }

    public void setUpdateResult(List<ProxyUpgradeVersionDetail> updateResult) {
        this.updateResult = updateResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeProxyVersionResponse that = (UpgradeProxyVersionResponse) obj;
        return Objects.equals(this.updateResult, that.updateResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeProxyVersionResponse {\n");
        sb.append("    updateResult: ").append(toIndentedString(updateResult)).append("\n");
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
