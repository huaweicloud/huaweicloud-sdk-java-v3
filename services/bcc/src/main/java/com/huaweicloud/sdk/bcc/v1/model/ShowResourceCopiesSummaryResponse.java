package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowResourceCopiesSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    /**
     * 资源类型：Server-云服务器，Volume-云硬盘，Sfs-Turbo-高性能文件存储，Workspace-云桌面，MySQL-MySQL，PostgreSQL-PostgreSQL，SQLServer-SQLServer，MariaDB-MariaDB，GaussDB-GaussDB
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum SERVER for value: "Server"
         */
        public static final ResourceTypeEnum SERVER = new ResourceTypeEnum("Server");

        /**
         * Enum VOLUME for value: "Volume"
         */
        public static final ResourceTypeEnum VOLUME = new ResourceTypeEnum("Volume");

        /**
         * Enum SFS_TURBO for value: "Sfs-Turbo"
         */
        public static final ResourceTypeEnum SFS_TURBO = new ResourceTypeEnum("Sfs-Turbo");

        /**
         * Enum WORKSPACE for value: "Workspace"
         */
        public static final ResourceTypeEnum WORKSPACE = new ResourceTypeEnum("Workspace");

        /**
         * Enum MYSQL for value: "MySQL"
         */
        public static final ResourceTypeEnum MYSQL = new ResourceTypeEnum("MySQL");

        /**
         * Enum POSTGRESQL for value: "PostgreSQL"
         */
        public static final ResourceTypeEnum POSTGRESQL = new ResourceTypeEnum("PostgreSQL");

        /**
         * Enum SQLSERVER for value: "SQLServer"
         */
        public static final ResourceTypeEnum SQLSERVER = new ResourceTypeEnum("SQLServer");

        /**
         * Enum MARIADB for value: "MariaDB"
         */
        public static final ResourceTypeEnum MARIADB = new ResourceTypeEnum("MariaDB");

        /**
         * Enum GAUSSDB for value: "GaussDB"
         */
        public static final ResourceTypeEnum GAUSSDB = new ResourceTypeEnum("GaussDB");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("Server", SERVER);
            map.put("Volume", VOLUME);
            map.put("Sfs-Turbo", SFS_TURBO);
            map.put("Workspace", WORKSPACE);
            map.put("MySQL", MYSQL);
            map.put("PostgreSQL", POSTGRESQL);
            map.put("SQLServer", SQLSERVER);
            map.put("MariaDB", MARIADB);
            map.put("GaussDB", GAUSSDB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "copy_type")

    private String copyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_copy_counts")

    private Integer totalCopyCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_copy_counts")

    private Integer completedCopyCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_copy_counts")

    private Integer failedCopyCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private List<GetResourceCopySummaryResponseSummary> summary = null;

    public ShowResourceCopiesSummaryResponse withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目ID
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public ShowResourceCopiesSummaryResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowResourceCopiesSummaryResponse withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型：Server-云服务器，Volume-云硬盘，Sfs-Turbo-高性能文件存储，Workspace-云桌面，MySQL-MySQL，PostgreSQL-PostgreSQL，SQLServer-SQLServer，MariaDB-MariaDB，GaussDB-GaussDB
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ShowResourceCopiesSummaryResponse withCopyType(String copyType) {
        this.copyType = copyType;
        return this;
    }

    /**
     * 副本类型
     * @return copyType
     */
    public String getCopyType() {
        return copyType;
    }

    public void setCopyType(String copyType) {
        this.copyType = copyType;
    }

    public ShowResourceCopiesSummaryResponse withTotalCopyCounts(Integer totalCopyCounts) {
        this.totalCopyCounts = totalCopyCounts;
        return this;
    }

    /**
     * 总副本数
     * minimum: 0
     * maximum: 2147483647
     * @return totalCopyCounts
     */
    public Integer getTotalCopyCounts() {
        return totalCopyCounts;
    }

    public void setTotalCopyCounts(Integer totalCopyCounts) {
        this.totalCopyCounts = totalCopyCounts;
    }

    public ShowResourceCopiesSummaryResponse withCompletedCopyCounts(Integer completedCopyCounts) {
        this.completedCopyCounts = completedCopyCounts;
        return this;
    }

    /**
     * 完成的备份总数, key -> ResourceCopyStatisticsKeyEnum.COMPLETED.getValue()
     * minimum: 0
     * maximum: 2147483647
     * @return completedCopyCounts
     */
    public Integer getCompletedCopyCounts() {
        return completedCopyCounts;
    }

    public void setCompletedCopyCounts(Integer completedCopyCounts) {
        this.completedCopyCounts = completedCopyCounts;
    }

    public ShowResourceCopiesSummaryResponse withFailedCopyCounts(Integer failedCopyCounts) {
        this.failedCopyCounts = failedCopyCounts;
        return this;
    }

    /**
     * 失败的备份总数, key -> ResourceCopyStatisticsKeyEnum.FAILED.getValue()
     * minimum: 0
     * maximum: 2147483647
     * @return failedCopyCounts
     */
    public Integer getFailedCopyCounts() {
        return failedCopyCounts;
    }

    public void setFailedCopyCounts(Integer failedCopyCounts) {
        this.failedCopyCounts = failedCopyCounts;
    }

    public ShowResourceCopiesSummaryResponse withSummary(List<GetResourceCopySummaryResponseSummary> summary) {
        this.summary = summary;
        return this;
    }

    public ShowResourceCopiesSummaryResponse addSummaryItem(GetResourceCopySummaryResponseSummary summaryItem) {
        if (this.summary == null) {
            this.summary = new ArrayList<>();
        }
        this.summary.add(summaryItem);
        return this;
    }

    public ShowResourceCopiesSummaryResponse withSummary(
        Consumer<List<GetResourceCopySummaryResponseSummary>> summarySetter) {
        if (this.summary == null) {
            this.summary = new ArrayList<>();
        }
        summarySetter.accept(this.summary);
        return this;
    }

    /**
     * 统计信息
     * @return summary
     */
    public List<GetResourceCopySummaryResponseSummary> getSummary() {
        return summary;
    }

    public void setSummary(List<GetResourceCopySummaryResponseSummary> summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceCopiesSummaryResponse that = (ShowResourceCopiesSummaryResponse) obj;
        return Objects.equals(this.epsId, that.epsId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.copyType, that.copyType)
            && Objects.equals(this.totalCopyCounts, that.totalCopyCounts)
            && Objects.equals(this.completedCopyCounts, that.completedCopyCounts)
            && Objects.equals(this.failedCopyCounts, that.failedCopyCounts)
            && Objects.equals(this.summary, that.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epsId,
            regionId,
            resourceType,
            copyType,
            totalCopyCounts,
            completedCopyCounts,
            failedCopyCounts,
            summary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceCopiesSummaryResponse {\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    copyType: ").append(toIndentedString(copyType)).append("\n");
        sb.append("    totalCopyCounts: ").append(toIndentedString(totalCopyCounts)).append("\n");
        sb.append("    completedCopyCounts: ").append(toIndentedString(completedCopyCounts)).append("\n");
        sb.append("    failedCopyCounts: ").append(toIndentedString(failedCopyCounts)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
