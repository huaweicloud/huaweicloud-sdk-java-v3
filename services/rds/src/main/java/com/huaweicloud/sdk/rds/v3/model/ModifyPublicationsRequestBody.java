package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改发布详情。
 */
public class ModifyPublicationsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_options")

    private SubscriptionOption subscriptionOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_schedule")

    private OperateUsedJobSchedule jobSchedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_select_all_table")

    private Boolean isSelectAllTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_tables")

    private List<String> extendTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<PublicationTableInfoRequest> tables = null;

    public ModifyPublicationsRequestBody withSubscriptionOptions(SubscriptionOption subscriptionOptions) {
        this.subscriptionOptions = subscriptionOptions;
        return this;
    }

    public ModifyPublicationsRequestBody withSubscriptionOptions(
        Consumer<SubscriptionOption> subscriptionOptionsSetter) {
        if (this.subscriptionOptions == null) {
            this.subscriptionOptions = new SubscriptionOption();
            subscriptionOptionsSetter.accept(this.subscriptionOptions);
        }

        return this;
    }

    /**
     * Get subscriptionOptions
     * @return subscriptionOptions
     */
    public SubscriptionOption getSubscriptionOptions() {
        return subscriptionOptions;
    }

    public void setSubscriptionOptions(SubscriptionOption subscriptionOptions) {
        this.subscriptionOptions = subscriptionOptions;
    }

    public ModifyPublicationsRequestBody withJobSchedule(OperateUsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
        return this;
    }

    public ModifyPublicationsRequestBody withJobSchedule(Consumer<OperateUsedJobSchedule> jobScheduleSetter) {
        if (this.jobSchedule == null) {
            this.jobSchedule = new OperateUsedJobSchedule();
            jobScheduleSetter.accept(this.jobSchedule);
        }

        return this;
    }

    /**
     * Get jobSchedule
     * @return jobSchedule
     */
    public OperateUsedJobSchedule getJobSchedule() {
        return jobSchedule;
    }

    public void setJobSchedule(OperateUsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
    }

    public ModifyPublicationsRequestBody withIsSelectAllTable(Boolean isSelectAllTable) {
        this.isSelectAllTable = isSelectAllTable;
        return this;
    }

    /**
     * 是否选择所有数据表。
     * @return isSelectAllTable
     */
    public Boolean getIsSelectAllTable() {
        return isSelectAllTable;
    }

    public void setIsSelectAllTable(Boolean isSelectAllTable) {
        this.isSelectAllTable = isSelectAllTable;
    }

    public ModifyPublicationsRequestBody withExtendTables(List<String> extendTables) {
        this.extendTables = extendTables;
        return this;
    }

    public ModifyPublicationsRequestBody addExtendTablesItem(String extendTablesItem) {
        if (this.extendTables == null) {
            this.extendTables = new ArrayList<>();
        }
        this.extendTables.add(extendTablesItem);
        return this;
    }

    public ModifyPublicationsRequestBody withExtendTables(Consumer<List<String>> extendTablesSetter) {
        if (this.extendTables == null) {
            this.extendTables = new ArrayList<>();
        }
        extendTablesSetter.accept(this.extendTables);
        return this;
    }

    /**
     * 全选所有表后需要去除的表。
     * @return extendTables
     */
    public List<String> getExtendTables() {
        return extendTables;
    }

    public void setExtendTables(List<String> extendTables) {
        this.extendTables = extendTables;
    }

    public ModifyPublicationsRequestBody withTables(List<PublicationTableInfoRequest> tables) {
        this.tables = tables;
        return this;
    }

    public ModifyPublicationsRequestBody addTablesItem(PublicationTableInfoRequest tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public ModifyPublicationsRequestBody withTables(Consumer<List<PublicationTableInfoRequest>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 发布数据表。
     * @return tables
     */
    public List<PublicationTableInfoRequest> getTables() {
        return tables;
    }

    public void setTables(List<PublicationTableInfoRequest> tables) {
        this.tables = tables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyPublicationsRequestBody that = (ModifyPublicationsRequestBody) obj;
        return Objects.equals(this.subscriptionOptions, that.subscriptionOptions)
            && Objects.equals(this.jobSchedule, that.jobSchedule)
            && Objects.equals(this.isSelectAllTable, that.isSelectAllTable)
            && Objects.equals(this.extendTables, that.extendTables) && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionOptions, jobSchedule, isSelectAllTable, extendTables, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyPublicationsRequestBody {\n");
        sb.append("    subscriptionOptions: ").append(toIndentedString(subscriptionOptions)).append("\n");
        sb.append("    jobSchedule: ").append(toIndentedString(jobSchedule)).append("\n");
        sb.append("    isSelectAllTable: ").append(toIndentedString(isSelectAllTable)).append("\n");
        sb.append("    extendTables: ").append(toIndentedString(extendTables)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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
