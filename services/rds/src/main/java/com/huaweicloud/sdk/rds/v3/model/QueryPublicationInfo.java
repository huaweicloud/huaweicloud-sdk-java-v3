package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 发布详情。
 */
public class QueryPublicationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_name")

    private String publicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_database")

    private String publicationDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_count")

    private Integer subscriptionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_options")

    private SubscriptionOptionsResult subscriptionOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_schedule")

    private UsedJobSchedule jobSchedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_select_all_table")

    private Boolean isSelectAllTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_tables")

    private List<String> extendTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<PublicationTableInfoResponse> tables = null;

    public QueryPublicationInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 发布id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryPublicationInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 发布状态。normal，abnormal，creating，modifying，createfail
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QueryPublicationInfo withPublicationName(String publicationName) {
        this.publicationName = publicationName;
        return this;
    }

    /**
     * 发布名。
     * @return publicationName
     */
    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public QueryPublicationInfo withPublicationDatabase(String publicationDatabase) {
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

    public QueryPublicationInfo withSubscriptionCount(Integer subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
        return this;
    }

    /**
     * 订阅数。
     * @return subscriptionCount
     */
    public Integer getSubscriptionCount() {
        return subscriptionCount;
    }

    public void setSubscriptionCount(Integer subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
    }

    public QueryPublicationInfo withSubscriptionOptions(SubscriptionOptionsResult subscriptionOptions) {
        this.subscriptionOptions = subscriptionOptions;
        return this;
    }

    public QueryPublicationInfo withSubscriptionOptions(Consumer<SubscriptionOptionsResult> subscriptionOptionsSetter) {
        if (this.subscriptionOptions == null) {
            this.subscriptionOptions = new SubscriptionOptionsResult();
            subscriptionOptionsSetter.accept(this.subscriptionOptions);
        }

        return this;
    }

    /**
     * Get subscriptionOptions
     * @return subscriptionOptions
     */
    public SubscriptionOptionsResult getSubscriptionOptions() {
        return subscriptionOptions;
    }

    public void setSubscriptionOptions(SubscriptionOptionsResult subscriptionOptions) {
        this.subscriptionOptions = subscriptionOptions;
    }

    public QueryPublicationInfo withJobSchedule(UsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
        return this;
    }

    public QueryPublicationInfo withJobSchedule(Consumer<UsedJobSchedule> jobScheduleSetter) {
        if (this.jobSchedule == null) {
            this.jobSchedule = new UsedJobSchedule();
            jobScheduleSetter.accept(this.jobSchedule);
        }

        return this;
    }

    /**
     * Get jobSchedule
     * @return jobSchedule
     */
    public UsedJobSchedule getJobSchedule() {
        return jobSchedule;
    }

    public void setJobSchedule(UsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
    }

    public QueryPublicationInfo withIsSelectAllTable(Boolean isSelectAllTable) {
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

    public QueryPublicationInfo withExtendTables(List<String> extendTables) {
        this.extendTables = extendTables;
        return this;
    }

    public QueryPublicationInfo addExtendTablesItem(String extendTablesItem) {
        if (this.extendTables == null) {
            this.extendTables = new ArrayList<>();
        }
        this.extendTables.add(extendTablesItem);
        return this;
    }

    public QueryPublicationInfo withExtendTables(Consumer<List<String>> extendTablesSetter) {
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

    public QueryPublicationInfo withTables(List<PublicationTableInfoResponse> tables) {
        this.tables = tables;
        return this;
    }

    public QueryPublicationInfo addTablesItem(PublicationTableInfoResponse tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public QueryPublicationInfo withTables(Consumer<List<PublicationTableInfoResponse>> tablesSetter) {
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
    public List<PublicationTableInfoResponse> getTables() {
        return tables;
    }

    public void setTables(List<PublicationTableInfoResponse> tables) {
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
        QueryPublicationInfo that = (QueryPublicationInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.publicationName, that.publicationName)
            && Objects.equals(this.publicationDatabase, that.publicationDatabase)
            && Objects.equals(this.subscriptionCount, that.subscriptionCount)
            && Objects.equals(this.subscriptionOptions, that.subscriptionOptions)
            && Objects.equals(this.jobSchedule, that.jobSchedule)
            && Objects.equals(this.isSelectAllTable, that.isSelectAllTable)
            && Objects.equals(this.extendTables, that.extendTables) && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            publicationName,
            publicationDatabase,
            subscriptionCount,
            subscriptionOptions,
            jobSchedule,
            isSelectAllTable,
            extendTables,
            tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryPublicationInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    publicationName: ").append(toIndentedString(publicationName)).append("\n");
        sb.append("    publicationDatabase: ").append(toIndentedString(publicationDatabase)).append("\n");
        sb.append("    subscriptionCount: ").append(toIndentedString(subscriptionCount)).append("\n");
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
