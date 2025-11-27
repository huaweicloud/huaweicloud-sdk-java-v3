package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建发布详情。
 */
public class CreatePublicationsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_name")

    private String publicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_database")

    private String publicationDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_create_snapshot_immediately")

    private String isCreateSnapshotImmediately;

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

    public CreatePublicationsRequestBody withPublicationName(String publicationName) {
        this.publicationName = publicationName;
        return this;
    }

    /**
     * 发布名称。  发布名称长度可在5～64个字符之间，由字母、数字或下划线组成，不能包含其他特殊字符。
     * @return publicationName
     */
    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public CreatePublicationsRequestBody withPublicationDatabase(String publicationDatabase) {
        this.publicationDatabase = publicationDatabase;
        return this;
    }

    /**
     * 发布数据库名。
     * @return publicationDatabase
     */
    public String getPublicationDatabase() {
        return publicationDatabase;
    }

    public void setPublicationDatabase(String publicationDatabase) {
        this.publicationDatabase = publicationDatabase;
    }

    public CreatePublicationsRequestBody withIsCreateSnapshotImmediately(String isCreateSnapshotImmediately) {
        this.isCreateSnapshotImmediately = isCreateSnapshotImmediately;
        return this;
    }

    /**
     * 是否立即创建快照。
     * @return isCreateSnapshotImmediately
     */
    public String getIsCreateSnapshotImmediately() {
        return isCreateSnapshotImmediately;
    }

    public void setIsCreateSnapshotImmediately(String isCreateSnapshotImmediately) {
        this.isCreateSnapshotImmediately = isCreateSnapshotImmediately;
    }

    public CreatePublicationsRequestBody withSubscriptionOptions(SubscriptionOption subscriptionOptions) {
        this.subscriptionOptions = subscriptionOptions;
        return this;
    }

    public CreatePublicationsRequestBody withSubscriptionOptions(
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

    public CreatePublicationsRequestBody withJobSchedule(OperateUsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
        return this;
    }

    public CreatePublicationsRequestBody withJobSchedule(Consumer<OperateUsedJobSchedule> jobScheduleSetter) {
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

    public CreatePublicationsRequestBody withIsSelectAllTable(Boolean isSelectAllTable) {
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

    public CreatePublicationsRequestBody withExtendTables(List<String> extendTables) {
        this.extendTables = extendTables;
        return this;
    }

    public CreatePublicationsRequestBody addExtendTablesItem(String extendTablesItem) {
        if (this.extendTables == null) {
            this.extendTables = new ArrayList<>();
        }
        this.extendTables.add(extendTablesItem);
        return this;
    }

    public CreatePublicationsRequestBody withExtendTables(Consumer<List<String>> extendTablesSetter) {
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

    public CreatePublicationsRequestBody withTables(List<PublicationTableInfoRequest> tables) {
        this.tables = tables;
        return this;
    }

    public CreatePublicationsRequestBody addTablesItem(PublicationTableInfoRequest tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public CreatePublicationsRequestBody withTables(Consumer<List<PublicationTableInfoRequest>> tablesSetter) {
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
        CreatePublicationsRequestBody that = (CreatePublicationsRequestBody) obj;
        return Objects.equals(this.publicationName, that.publicationName)
            && Objects.equals(this.publicationDatabase, that.publicationDatabase)
            && Objects.equals(this.isCreateSnapshotImmediately, that.isCreateSnapshotImmediately)
            && Objects.equals(this.subscriptionOptions, that.subscriptionOptions)
            && Objects.equals(this.jobSchedule, that.jobSchedule)
            && Objects.equals(this.isSelectAllTable, that.isSelectAllTable)
            && Objects.equals(this.extendTables, that.extendTables) && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationName,
            publicationDatabase,
            isCreateSnapshotImmediately,
            subscriptionOptions,
            jobSchedule,
            isSelectAllTable,
            extendTables,
            tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePublicationsRequestBody {\n");
        sb.append("    publicationName: ").append(toIndentedString(publicationName)).append("\n");
        sb.append("    publicationDatabase: ").append(toIndentedString(publicationDatabase)).append("\n");
        sb.append("    isCreateSnapshotImmediately: ")
            .append(toIndentedString(isCreateSnapshotImmediately))
            .append("\n");
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
