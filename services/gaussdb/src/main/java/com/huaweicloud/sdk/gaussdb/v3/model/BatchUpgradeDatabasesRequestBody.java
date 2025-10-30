package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpgradeDatabasesRequestBody
 */
public class BatchUpgradeDatabasesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases_instance_infos")

    private List<UpgradeDatabasesSingleInstance> databasesInstanceInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private String delay;

    public BatchUpgradeDatabasesRequestBody withDatabasesInstanceInfos(
        List<UpgradeDatabasesSingleInstance> databasesInstanceInfos) {
        this.databasesInstanceInfos = databasesInstanceInfos;
        return this;
    }

    public BatchUpgradeDatabasesRequestBody addDatabasesInstanceInfosItem(
        UpgradeDatabasesSingleInstance databasesInstanceInfosItem) {
        if (this.databasesInstanceInfos == null) {
            this.databasesInstanceInfos = new ArrayList<>();
        }
        this.databasesInstanceInfos.add(databasesInstanceInfosItem);
        return this;
    }

    public BatchUpgradeDatabasesRequestBody withDatabasesInstanceInfos(
        Consumer<List<UpgradeDatabasesSingleInstance>> databasesInstanceInfosSetter) {
        if (this.databasesInstanceInfos == null) {
            this.databasesInstanceInfos = new ArrayList<>();
        }
        databasesInstanceInfosSetter.accept(this.databasesInstanceInfos);
        return this;
    }

    /**
     * 要版本升级的批量实例。
     * @return databasesInstanceInfos
     */
    public List<UpgradeDatabasesSingleInstance> getDatabasesInstanceInfos() {
        return databasesInstanceInfos;
    }

    public void setDatabasesInstanceInfos(List<UpgradeDatabasesSingleInstance> databasesInstanceInfos) {
        this.databasesInstanceInfos = databasesInstanceInfos;
    }

    public BatchUpgradeDatabasesRequestBody withDelay(String delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 是否延迟升级。
     * @return delay
     */
    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpgradeDatabasesRequestBody that = (BatchUpgradeDatabasesRequestBody) obj;
        return Objects.equals(this.databasesInstanceInfos, that.databasesInstanceInfos)
            && Objects.equals(this.delay, that.delay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databasesInstanceInfos, delay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpgradeDatabasesRequestBody {\n");
        sb.append("    databasesInstanceInfos: ").append(toIndentedString(databasesInstanceInfos)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
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
