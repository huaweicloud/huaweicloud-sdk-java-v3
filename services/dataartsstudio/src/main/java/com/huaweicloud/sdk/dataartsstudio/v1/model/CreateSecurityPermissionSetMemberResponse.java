package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateSecurityPermissionSetMemberResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 成员类型, 用户/用户组/工作空间角色(废弃)/集群角色, USER, USER_GROUP, WORKSPACE_ROLE, CLUSTER_ROLE
     */
    public static final class MemberTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final MemberTypeEnum USER = new MemberTypeEnum("USER");

        /**
         * Enum USER_GROUP for value: "USER_GROUP"
         */
        public static final MemberTypeEnum USER_GROUP = new MemberTypeEnum("USER_GROUP");

        /**
         * Enum WORKSPACE_ROLE for value: "WORKSPACE_ROLE"
         */
        public static final MemberTypeEnum WORKSPACE_ROLE = new MemberTypeEnum("WORKSPACE_ROLE");

        /**
         * Enum CLUSTER_ROLE for value: "CLUSTER_ROLE"
         */
        public static final MemberTypeEnum CLUSTER_ROLE = new MemberTypeEnum("CLUSTER_ROLE");

        private static final Map<String, MemberTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MemberTypeEnum> createStaticFields() {
            Map<String, MemberTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("USER_GROUP", USER_GROUP);
            map.put("WORKSPACE_ROLE", WORKSPACE_ROLE);
            map.put("CLUSTER_ROLE", CLUSTER_ROLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MemberTypeEnum(String value) {
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
        public static MemberTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MemberTypeEnum(value));
        }

        public static MemberTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MemberTypeEnum) {
                return this.value.equals(((MemberTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_type")

    private MemberTypeEnum memberType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_name")

    private String memberName;

    /**
     * 成员状态, NORMAL, UNFINISHED
     */
    public static final class MemberStatusEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final MemberStatusEnum NORMAL = new MemberStatusEnum("NORMAL");

        /**
         * Enum UNFINISHED for value: "UNFINISHED"
         */
        public static final MemberStatusEnum UNFINISHED = new MemberStatusEnum("UNFINISHED");

        private static final Map<String, MemberStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MemberStatusEnum> createStaticFields() {
            Map<String, MemberStatusEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("UNFINISHED", UNFINISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MemberStatusEnum(String value) {
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
        public static MemberStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MemberStatusEnum(value));
        }

        public static MemberStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MemberStatusEnum) {
                return this.value.equals(((MemberStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_status")

    private MemberStatusEnum memberStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    /**
     * 集群类型(仅集群角色需要), MRS, DWS, DLI
     */
    public static final class ClusterTypeEnum {

        /**
         * Enum MRS for value: "MRS"
         */
        public static final ClusterTypeEnum MRS = new ClusterTypeEnum("MRS");

        /**
         * Enum DWS for value: "DWS"
         */
        public static final ClusterTypeEnum DWS = new ClusterTypeEnum("DWS");

        /**
         * Enum DLI for value: "DLI"
         */
        public static final ClusterTypeEnum DLI = new ClusterTypeEnum("DLI");

        private static final Map<String, ClusterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterTypeEnum> createStaticFields() {
            Map<String, ClusterTypeEnum> map = new HashMap<>();
            map.put("MRS", MRS);
            map.put("DWS", DWS);
            map.put("DLI", DLI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClusterTypeEnum(String value) {
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
        public static ClusterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClusterTypeEnum(value));
        }

        public static ClusterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterTypeEnum) {
                return this.value.equals(((ClusterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private ClusterTypeEnum clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deadline")

    private Long deadline;

    public CreateSecurityPermissionSetMemberResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateSecurityPermissionSetMemberResponse withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * 权限集id
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public CreateSecurityPermissionSetMemberResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateSecurityPermissionSetMemberResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateSecurityPermissionSetMemberResponse withMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * 成员类型, 用户/用户组/工作空间角色(废弃)/集群角色, USER, USER_GROUP, WORKSPACE_ROLE, CLUSTER_ROLE
     * @return memberType
     */
    public MemberTypeEnum getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
    }

    public CreateSecurityPermissionSetMemberResponse withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * 成员id
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public CreateSecurityPermissionSetMemberResponse withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * 成员名称
     * @return memberName
     */
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public CreateSecurityPermissionSetMemberResponse withMemberStatus(MemberStatusEnum memberStatus) {
        this.memberStatus = memberStatus;
        return this;
    }

    /**
     * 成员状态, NORMAL, UNFINISHED
     * @return memberStatus
     */
    public MemberStatusEnum getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MemberStatusEnum memberStatus) {
        this.memberStatus = memberStatus;
    }

    public CreateSecurityPermissionSetMemberResponse withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间(仅工作空间角色需要)
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public CreateSecurityPermissionSetMemberResponse withClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型(仅集群角色需要), MRS, DWS, DLI
     * @return clusterType
     */
    public ClusterTypeEnum getClusterType() {
        return clusterType;
    }

    public void setClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
    }

    public CreateSecurityPermissionSetMemberResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id(仅集群角色需要)
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateSecurityPermissionSetMemberResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称(仅集群角色需要)
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateSecurityPermissionSetMemberResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 2147483647
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateSecurityPermissionSetMemberResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public CreateSecurityPermissionSetMemberResponse withDeadline(Long deadline) {
        this.deadline = deadline;
        return this;
    }

    /**
     * 到期时间
     * minimum: 0
     * maximum: 2147483647
     * @return deadline
     */
    public Long getDeadline() {
        return deadline;
    }

    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSecurityPermissionSetMemberResponse that = (CreateSecurityPermissionSetMemberResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.permissionSetId, that.permissionSetId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.memberType, that.memberType) && Objects.equals(this.memberId, that.memberId)
            && Objects.equals(this.memberName, that.memberName) && Objects.equals(this.memberStatus, that.memberStatus)
            && Objects.equals(this.workspace, that.workspace) && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.deadline, that.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            permissionSetId,
            projectId,
            instanceId,
            memberType,
            memberId,
            memberName,
            memberStatus,
            workspace,
            clusterType,
            clusterId,
            clusterName,
            createTime,
            createUser,
            deadline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityPermissionSetMemberResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    memberName: ").append(toIndentedString(memberName)).append("\n");
        sb.append("    memberStatus: ").append(toIndentedString(memberStatus)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
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
