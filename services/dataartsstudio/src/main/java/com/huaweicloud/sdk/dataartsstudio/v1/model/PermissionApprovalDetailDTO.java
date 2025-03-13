package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 审批详细信息
 */
public class PermissionApprovalDetailDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    /**
     * 数据源类型 - HIVE数据源 - DWS数据源 - [DLI数据源](tag:nohcs)
     */
    public static final class DatasourceTypeEnum {

        /**
         * Enum HIVE for value: "HIVE"
         */
        public static final DatasourceTypeEnum HIVE = new DatasourceTypeEnum("HIVE");

        /**
         * Enum DWS for value: "DWS"
         */
        public static final DatasourceTypeEnum DWS = new DatasourceTypeEnum("DWS");

        /**
         * Enum DLI for value: "DLI"
         */
        public static final DatasourceTypeEnum DLI = new DatasourceTypeEnum("DLI");

        private static final Map<String, DatasourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatasourceTypeEnum> createStaticFields() {
            Map<String, DatasourceTypeEnum> map = new HashMap<>();
            map.put("HIVE", HIVE);
            map.put("DWS", DWS);
            map.put("DLI", DLI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatasourceTypeEnum(String value) {
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
        public static DatasourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatasourceTypeEnum(value));
        }

        public static DatasourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatasourceTypeEnum) {
                return this.value.equals(((DatasourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_type")

    private DatasourceTypeEnum datasourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<PermissionApprovalDetailDTOPermissions> permissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposers")

    private List<PermissionApprovalDetailDTOProposers> proposers = null;

    public PermissionApprovalDetailDTO withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public PermissionApprovalDetailDTO withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public PermissionApprovalDetailDTO withDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据源类型 - HIVE数据源 - DWS数据源 - [DLI数据源](tag:nohcs)
     * @return datasourceType
     */
    public DatasourceTypeEnum getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
    }

    public PermissionApprovalDetailDTO withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 超时时间
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public PermissionApprovalDetailDTO withPermissions(List<PermissionApprovalDetailDTOPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }

    public PermissionApprovalDetailDTO addPermissionsItem(PermissionApprovalDetailDTOPermissions permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public PermissionApprovalDetailDTO withPermissions(
        Consumer<List<PermissionApprovalDetailDTOPermissions>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * 申请权限详情列表
     * @return permissions
     */
    public List<PermissionApprovalDetailDTOPermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionApprovalDetailDTOPermissions> permissions) {
        this.permissions = permissions;
    }

    public PermissionApprovalDetailDTO withProposers(List<PermissionApprovalDetailDTOProposers> proposers) {
        this.proposers = proposers;
        return this;
    }

    public PermissionApprovalDetailDTO addProposersItem(PermissionApprovalDetailDTOProposers proposersItem) {
        if (this.proposers == null) {
            this.proposers = new ArrayList<>();
        }
        this.proposers.add(proposersItem);
        return this;
    }

    public PermissionApprovalDetailDTO withProposers(
        Consumer<List<PermissionApprovalDetailDTOProposers>> proposersSetter) {
        if (this.proposers == null) {
            this.proposers = new ArrayList<>();
        }
        proposersSetter.accept(this.proposers);
        return this;
    }

    /**
     * 申请人详情列表
     * @return proposers
     */
    public List<PermissionApprovalDetailDTOProposers> getProposers() {
        return proposers;
    }

    public void setProposers(List<PermissionApprovalDetailDTOProposers> proposers) {
        this.proposers = proposers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionApprovalDetailDTO that = (PermissionApprovalDetailDTO) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.permissions, that.permissions)
            && Objects.equals(this.proposers, that.proposers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, clusterName, datasourceType, expireTime, permissions, proposers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionApprovalDetailDTO {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    proposers: ").append(toIndentedString(proposers)).append("\n");
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
