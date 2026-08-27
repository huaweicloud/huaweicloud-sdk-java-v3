package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  实例升级预检查的请求体。  **约束限制**：  不涉及。
 */
public class UpgradePrecheckRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases_instance_infos")

    private List<PreCheckForUpgradeDatabasesSingleInstance> databasesInstanceInfos = null;

    public UpgradePrecheckRequest withDatabasesInstanceInfos(
        List<PreCheckForUpgradeDatabasesSingleInstance> databasesInstanceInfos) {
        this.databasesInstanceInfos = databasesInstanceInfos;
        return this;
    }

    public UpgradePrecheckRequest addDatabasesInstanceInfosItem(
        PreCheckForUpgradeDatabasesSingleInstance databasesInstanceInfosItem) {
        if (this.databasesInstanceInfos == null) {
            this.databasesInstanceInfos = new ArrayList<>();
        }
        this.databasesInstanceInfos.add(databasesInstanceInfosItem);
        return this;
    }

    public UpgradePrecheckRequest withDatabasesInstanceInfos(
        Consumer<List<PreCheckForUpgradeDatabasesSingleInstance>> databasesInstanceInfosSetter) {
        if (this.databasesInstanceInfos == null) {
            this.databasesInstanceInfos = new ArrayList<>();
        }
        databasesInstanceInfosSetter.accept(this.databasesInstanceInfos);
        return this;
    }

    /**
     * **参数解释**：  升级预检查实例信息。  **约束限制**：  不涉及。
     * @return databasesInstanceInfos
     */
    public List<PreCheckForUpgradeDatabasesSingleInstance> getDatabasesInstanceInfos() {
        return databasesInstanceInfos;
    }

    public void setDatabasesInstanceInfos(List<PreCheckForUpgradeDatabasesSingleInstance> databasesInstanceInfos) {
        this.databasesInstanceInfos = databasesInstanceInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradePrecheckRequest that = (UpgradePrecheckRequest) obj;
        return Objects.equals(this.databasesInstanceInfos, that.databasesInstanceInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databasesInstanceInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradePrecheckRequest {\n");
        sb.append("    databasesInstanceInfos: ").append(toIndentedString(databasesInstanceInfos)).append("\n");
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
