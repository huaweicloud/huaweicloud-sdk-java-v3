package com.huaweicloud.sdk.workspace.v2.model;

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
 * 池桌面详情
 */
public class PoolDesktopsDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private Map<String, List<AddressInfo>> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_addresses")

    private List<String> ipAddresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_list")

    private List<String> userList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group_list")

    private List<String> userGroupList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_type")

    private String desktopType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorInfo flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_status")

    private String loginStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_user_infos")

    private List<AttachInstancesUserInfo> attachUserInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private VolumeDetail rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<VolumeDetail> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group")

    private String userGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_type")

    private String siteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_name")

    private String siteName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product")

    private ProductDetailInfo product;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    /**
     * 上网方式。 - NAT：表示NAT上网方式。 - EIP：表示EIP上网方式。 - BOTH：表示两种上网方式都支持。
     */
    public static final class InternetModeEnum {

        /**
         * Enum NAT for value: "NAT"
         */
        public static final InternetModeEnum NAT = new InternetModeEnum("NAT");

        /**
         * Enum EIP for value: "EIP"
         */
        public static final InternetModeEnum EIP = new InternetModeEnum("EIP");

        /**
         * Enum BOTH for value: "BOTH"
         */
        public static final InternetModeEnum BOTH = new InternetModeEnum("BOTH");

        private static final Map<String, InternetModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InternetModeEnum> createStaticFields() {
            Map<String, InternetModeEnum> map = new HashMap<>();
            map.put("NAT", NAT);
            map.put("EIP", EIP);
            map.put("BOTH", BOTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InternetModeEnum(String value) {
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
        public static InternetModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InternetModeEnum(value));
        }

        public static InternetModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InternetModeEnum) {
                return this.value.equals(((InternetModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_mode")

    private InternetModeEnum internetMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_attaching_eip")

    private Boolean isAttachingEip;

    /**
     * 分配状态。 - ATTACHED：已分配。 - UNATTACH：未分配 表示未关联。 - DEATTACHED：已解分配。 - ATTACHING：分配中。 - DEATTACHING：解分配中。 - ATTACHFAIL：分配失败。 - DEATTACHFAIL：解分配失败。 - WAITING：等待被分配中,描述从批量分配（解分配）下发到转入分配（解分配）的中间状态 同时方便单个关联流程的状态独立性。 - ATTACH_FAIL_CAN_ATTACH_AGAIN：分配失败,还可以再关联。 - DEATTACH_FAIL_CAN_DEATTACH_AGAIN：解分配失败,还可以再解分配。
     */
    public static final class AttachStateEnum {

        /**
         * Enum ATTACHED for value: "ATTACHED"
         */
        public static final AttachStateEnum ATTACHED = new AttachStateEnum("ATTACHED");

        /**
         * Enum UNATTACH for value: "UNATTACH"
         */
        public static final AttachStateEnum UNATTACH = new AttachStateEnum("UNATTACH");

        /**
         * Enum DEATTACHED for value: "DEATTACHED"
         */
        public static final AttachStateEnum DEATTACHED = new AttachStateEnum("DEATTACHED");

        /**
         * Enum ATTACHING for value: "ATTACHING"
         */
        public static final AttachStateEnum ATTACHING = new AttachStateEnum("ATTACHING");

        /**
         * Enum DEATTACHING for value: "DEATTACHING"
         */
        public static final AttachStateEnum DEATTACHING = new AttachStateEnum("DEATTACHING");

        /**
         * Enum ATTACHFAIL for value: "ATTACHFAIL"
         */
        public static final AttachStateEnum ATTACHFAIL = new AttachStateEnum("ATTACHFAIL");

        /**
         * Enum DEATTACHFAIL for value: "DEATTACHFAIL"
         */
        public static final AttachStateEnum DEATTACHFAIL = new AttachStateEnum("DEATTACHFAIL");

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final AttachStateEnum WAITING = new AttachStateEnum("WAITING");

        /**
         * Enum ATTACH_FAIL_CAN_ATTACH_AGAIN for value: "ATTACH_FAIL_CAN_ATTACH_AGAIN"
         */
        public static final AttachStateEnum ATTACH_FAIL_CAN_ATTACH_AGAIN =
            new AttachStateEnum("ATTACH_FAIL_CAN_ATTACH_AGAIN");

        /**
         * Enum DEATTACH_FAIL_CAN_DEATTACH_AGAIN for value: "DEATTACH_FAIL_CAN_DEATTACH_AGAIN"
         */
        public static final AttachStateEnum DEATTACH_FAIL_CAN_DEATTACH_AGAIN =
            new AttachStateEnum("DEATTACH_FAIL_CAN_DEATTACH_AGAIN");

        private static final Map<String, AttachStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AttachStateEnum> createStaticFields() {
            Map<String, AttachStateEnum> map = new HashMap<>();
            map.put("ATTACHED", ATTACHED);
            map.put("UNATTACH", UNATTACH);
            map.put("DEATTACHED", DEATTACHED);
            map.put("ATTACHING", ATTACHING);
            map.put("DEATTACHING", DEATTACHING);
            map.put("ATTACHFAIL", ATTACHFAIL);
            map.put("DEATTACHFAIL", DEATTACHFAIL);
            map.put("WAITING", WAITING);
            map.put("ATTACH_FAIL_CAN_ATTACH_AGAIN", ATTACH_FAIL_CAN_ATTACH_AGAIN);
            map.put("DEATTACH_FAIL_CAN_DEATTACH_AGAIN", DEATTACH_FAIL_CAN_DEATTACH_AGAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AttachStateEnum(String value) {
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
        public static AttachStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AttachStateEnum(value));
        }

        public static AttachStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AttachStateEnum) {
                return this.value.equals(((AttachStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_state")

    private AttachStateEnum attachState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_resource_id")

    private String billResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private Integer process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inconsistent_types")

    private List<String> inconsistentTypes = null;

    public PoolDesktopsDetailInfo withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public PoolDesktopsDetailInfo withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 桌面名。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public PoolDesktopsDetailInfo withAddresses(Map<String, List<AddressInfo>> addresses) {
        this.addresses = addresses;
        return this;
    }

    public PoolDesktopsDetailInfo putAddressesItem(String key, List<AddressInfo> addressesItem) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        this.addresses.put(key, addressesItem);
        return this;
    }

    public PoolDesktopsDetailInfo withAddresses(Consumer<Map<String, List<AddressInfo>>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 桌面IP地址列表。
     * @return addresses
     */
    public Map<String, List<AddressInfo>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<AddressInfo>> addresses) {
        this.addresses = addresses;
    }

    public PoolDesktopsDetailInfo withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    public PoolDesktopsDetailInfo addIpAddressesItem(String ipAddressesItem) {
        if (this.ipAddresses == null) {
            this.ipAddresses = new ArrayList<>();
        }
        this.ipAddresses.add(ipAddressesItem);
        return this;
    }

    public PoolDesktopsDetailInfo withIpAddresses(Consumer<List<String>> ipAddressesSetter) {
        if (this.ipAddresses == null) {
            this.ipAddresses = new ArrayList<>();
        }
        ipAddressesSetter.accept(this.ipAddresses);
        return this;
    }

    /**
     * IP地址列表。
     * @return ipAddresses
     */
    public List<String> getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public PoolDesktopsDetailInfo withUserList(List<String> userList) {
        this.userList = userList;
        return this;
    }

    public PoolDesktopsDetailInfo addUserListItem(String userListItem) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        this.userList.add(userListItem);
        return this;
    }

    public PoolDesktopsDetailInfo withUserList(Consumer<List<String>> userListSetter) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        userListSetter.accept(this.userList);
        return this;
    }

    /**
     * 用户列表
     * @return userList
     */
    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public PoolDesktopsDetailInfo withUserGroupList(List<String> userGroupList) {
        this.userGroupList = userGroupList;
        return this;
    }

    public PoolDesktopsDetailInfo addUserGroupListItem(String userGroupListItem) {
        if (this.userGroupList == null) {
            this.userGroupList = new ArrayList<>();
        }
        this.userGroupList.add(userGroupListItem);
        return this;
    }

    public PoolDesktopsDetailInfo withUserGroupList(Consumer<List<String>> userGroupListSetter) {
        if (this.userGroupList == null) {
            this.userGroupList = new ArrayList<>();
        }
        userGroupListSetter.accept(this.userGroupList);
        return this;
    }

    /**
     * 用户组列表
     * @return userGroupList
     */
    public List<String> getUserGroupList() {
        return userGroupList;
    }

    public void setUserGroupList(List<String> userGroupList) {
        this.userGroupList = userGroupList;
    }

    public PoolDesktopsDetailInfo withDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }

    /**
     * 桌面类型。  - DEDICATED：专属桌面。
     * @return desktopType
     */
    public String getDesktopType() {
        return desktopType;
    }

    public void setDesktopType(String desktopType) {
        this.desktopType = desktopType;
    }

    public PoolDesktopsDetailInfo withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public PoolDesktopsDetailInfo putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public PoolDesktopsDetailInfo withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 桌面元数据。  - charging_mode 周期套餐标识，1表示包周期，0表示按需。 - image_name 创建桌面的镜像名称。 - bill_resource_id 镜像计费资源ID。 - metering.image_id 镜像ID。 - metering.resourcespeccode 桌面资源编码。 - metering.resourcetype 桌面资源类型。 - os_bit 操作系统位数：32或64。 - os_type 操作系统类型：Linux、Windows或Others。 - desktop_os_version 操作系统版本。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public PoolDesktopsDetailInfo withFlavor(FlavorInfo flavor) {
        this.flavor = flavor;
        return this;
    }

    public PoolDesktopsDetailInfo withFlavor(Consumer<FlavorInfo> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new FlavorInfo();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public FlavorInfo getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorInfo flavor) {
        this.flavor = flavor;
    }

    public PoolDesktopsDetailInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 桌面状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PoolDesktopsDetailInfo withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态。  - scheduling：创建中，正在进行调度。 - block_device_mapping：创建中，正在准备磁盘。 - networking：创建中，正在准备网络。 - spawning：创建中，正在内部创建。 - rebooting：重启中。 - reboot_pending：重启中，正在下发重启。 - reboot_started：重启中，开始内部重启。 - rebooting_hard：强制重启中。 - reboot_pending_hard：强制重启中，正在下发重启。 - reboot_started_hard：强制重启中，开始内部重启。 - rebuilding：重建中。 - rebuild_block_device_mapping：重建中，正在准备磁盘。 - rebuild_spawning：重建中，正在内部重建。 - migrating：热迁移中。 - resize_prep：调整规格中，正在准备阶段。 - resize_migrating：调整规格中，正在迁移阶段。 - resize_migrated：调整规格中，已经完成迁移。 - resize_finish：调整规格中，正在完成调整。 - resize_reverting：调整规格中，正在回退调整。 - powering-off：停止中。 - powering-on：启动中。 - deleting：删除中。 - deleteFailed：删除失败。
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public PoolDesktopsDetailInfo withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 桌面创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public PoolDesktopsDetailInfo withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public PoolDesktopsDetailInfo addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public PoolDesktopsDetailInfo withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 桌面安全组。
     * @return securityGroups
     */
    public List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public PoolDesktopsDetailInfo withLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
        return this;
    }

    /**
     * 桌面的登录状态。  - UNREGISTER：表示桌面未注册时的状态（桌面启动后，会自动注册）。关机后也会出现未注册的状态。 - REGISTERED：表示桌面注册以后，等待用户连接的状态。 - CONNECTED：表示用户已经成功登录，正在使用桌面。 - DISCONNECTED：表示桌面与客户端断开会话后显示的状态，可能为关闭客户端窗口，或客户端与桌面网络断开引起。
     * @return loginStatus
     */
    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public PoolDesktopsDetailInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面所属用户。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PoolDesktopsDetailInfo withAttachUserInfos(List<AttachInstancesUserInfo> attachUserInfos) {
        this.attachUserInfos = attachUserInfos;
        return this;
    }

    public PoolDesktopsDetailInfo addAttachUserInfosItem(AttachInstancesUserInfo attachUserInfosItem) {
        if (this.attachUserInfos == null) {
            this.attachUserInfos = new ArrayList<>();
        }
        this.attachUserInfos.add(attachUserInfosItem);
        return this;
    }

    public PoolDesktopsDetailInfo withAttachUserInfos(Consumer<List<AttachInstancesUserInfo>> attachUserInfosSetter) {
        if (this.attachUserInfos == null) {
            this.attachUserInfos = new ArrayList<>();
        }
        attachUserInfosSetter.accept(this.attachUserInfos);
        return this;
    }

    /**
     * 桌面已分配的用户信息列表。
     * @return attachUserInfos
     */
    public List<AttachInstancesUserInfo> getAttachUserInfos() {
        return attachUserInfos;
    }

    public void setAttachUserInfos(List<AttachInstancesUserInfo> attachUserInfos) {
        this.attachUserInfos = attachUserInfos;
    }

    public PoolDesktopsDetailInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public PoolDesktopsDetailInfo withRootVolume(VolumeDetail rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public PoolDesktopsDetailInfo withRootVolume(Consumer<VolumeDetail> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new VolumeDetail();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public VolumeDetail getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(VolumeDetail rootVolume) {
        this.rootVolume = rootVolume;
    }

    public PoolDesktopsDetailInfo withDataVolumes(List<VolumeDetail> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public PoolDesktopsDetailInfo addDataVolumesItem(VolumeDetail dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public PoolDesktopsDetailInfo withDataVolumes(Consumer<List<VolumeDetail>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 数据盘列表。
     * @return dataVolumes
     */
    public List<VolumeDetail> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<VolumeDetail> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public PoolDesktopsDetailInfo withUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * 桌面用户所属的用户组。  - sudo：Linux管理员组。 - default：Linux默认用户组。 - administrators：Windows管理员组。管理员拥有对该桌面的完全访问权，可以做任何需要的更改（禁用操作除外）。 - users：Windows标准用户组。标准用户可以使用大多数软件，并可以更改不影响其他用户的系统设置。
     * @return userGroup
     */
    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public PoolDesktopsDetailInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public PoolDesktopsDetailInfo withSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }

    /**
     * 站点类型
     * @return siteType
     */
    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    public PoolDesktopsDetailInfo withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * 站点名字
     * @return siteName
     */
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public PoolDesktopsDetailInfo withProduct(ProductDetailInfo product) {
        this.product = product;
        return this;
    }

    public PoolDesktopsDetailInfo withProduct(Consumer<ProductDetailInfo> productSetter) {
        if (this.product == null) {
            this.product = new ProductDetailInfo();
            productSetter.accept(this.product);
        }

        return this;
    }

    /**
     * Get product
     * @return product
     */
    public ProductDetailInfo getProduct() {
        return product;
    }

    public void setProduct(ProductDetailInfo product) {
        this.product = product;
    }

    public PoolDesktopsDetailInfo withOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    /**
     * 创建桌面时加入的OU名称。
     * @return ouName
     */
    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public PoolDesktopsDetailInfo withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 操作系统版本号。
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public PoolDesktopsDetailInfo withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * SID
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public PoolDesktopsDetailInfo withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 包周期产品的订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public PoolDesktopsDetailInfo withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public PoolDesktopsDetailInfo addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PoolDesktopsDetailInfo withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 桌面标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public PoolDesktopsDetailInfo withInternetMode(InternetModeEnum internetMode) {
        this.internetMode = internetMode;
        return this;
    }

    /**
     * 上网方式。 - NAT：表示NAT上网方式。 - EIP：表示EIP上网方式。 - BOTH：表示两种上网方式都支持。
     * @return internetMode
     */
    public InternetModeEnum getInternetMode() {
        return internetMode;
    }

    public void setInternetMode(InternetModeEnum internetMode) {
        this.internetMode = internetMode;
    }

    public PoolDesktopsDetailInfo withIsAttachingEip(Boolean isAttachingEip) {
        this.isAttachingEip = isAttachingEip;
        return this;
    }

    /**
     * 桌面是否正在绑定EIP。
     * @return isAttachingEip
     */
    public Boolean getIsAttachingEip() {
        return isAttachingEip;
    }

    public void setIsAttachingEip(Boolean isAttachingEip) {
        this.isAttachingEip = isAttachingEip;
    }

    public PoolDesktopsDetailInfo withAttachState(AttachStateEnum attachState) {
        this.attachState = attachState;
        return this;
    }

    /**
     * 分配状态。 - ATTACHED：已分配。 - UNATTACH：未分配 表示未关联。 - DEATTACHED：已解分配。 - ATTACHING：分配中。 - DEATTACHING：解分配中。 - ATTACHFAIL：分配失败。 - DEATTACHFAIL：解分配失败。 - WAITING：等待被分配中,描述从批量分配（解分配）下发到转入分配（解分配）的中间状态 同时方便单个关联流程的状态独立性。 - ATTACH_FAIL_CAN_ATTACH_AGAIN：分配失败,还可以再关联。 - DEATTACH_FAIL_CAN_DEATTACH_AGAIN：解分配失败,还可以再解分配。
     * @return attachState
     */
    public AttachStateEnum getAttachState() {
        return attachState;
    }

    public void setAttachState(AttachStateEnum attachState) {
        this.attachState = attachState;
    }

    public PoolDesktopsDetailInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PoolDesktopsDetailInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 桌面的子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public PoolDesktopsDetailInfo withBillResourceId(String billResourceId) {
        this.billResourceId = billResourceId;
        return this;
    }

    /**
     * 桌面计费资源ID
     * @return billResourceId
     */
    public String getBillResourceId() {
        return billResourceId;
    }

    public void setBillResourceId(String billResourceId) {
        this.billResourceId = billResourceId;
    }

    public PoolDesktopsDetailInfo withProcess(Integer process) {
        this.process = process;
        return this;
    }

    /**
     * 桌面任务进度， 取值范围0-100以及null，null表示该桌面无任务，0-100表明该任务进度的百分比。
     * @return process
     */
    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public PoolDesktopsDetailInfo withInconsistentTypes(List<String> inconsistentTypes) {
        this.inconsistentTypes = inconsistentTypes;
        return this;
    }

    public PoolDesktopsDetailInfo addInconsistentTypesItem(String inconsistentTypesItem) {
        if (this.inconsistentTypes == null) {
            this.inconsistentTypes = new ArrayList<>();
        }
        this.inconsistentTypes.add(inconsistentTypesItem);
        return this;
    }

    public PoolDesktopsDetailInfo withInconsistentTypes(Consumer<List<String>> inconsistentTypesSetter) {
        if (this.inconsistentTypes == null) {
            this.inconsistentTypes = new ArrayList<>();
        }
        inconsistentTypesSetter.accept(this.inconsistentTypes);
        return this;
    }

    /**
     * 桌面与桌面池不一致的规格类型:  - PRODUCT: 产品ID不一致 - IMAGE: 镜像ID不一致
     * @return inconsistentTypes
     */
    public List<String> getInconsistentTypes() {
        return inconsistentTypes;
    }

    public void setInconsistentTypes(List<String> inconsistentTypes) {
        this.inconsistentTypes = inconsistentTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolDesktopsDetailInfo that = (PoolDesktopsDetailInfo) obj;
        return Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.computerName, that.computerName)
            && Objects.equals(this.addresses, that.addresses) && Objects.equals(this.ipAddresses, that.ipAddresses)
            && Objects.equals(this.userList, that.userList) && Objects.equals(this.userGroupList, that.userGroupList)
            && Objects.equals(this.desktopType, that.desktopType) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.status, that.status)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.created, that.created)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.loginStatus, that.loginStatus) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.attachUserInfos, that.attachUserInfos)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.dataVolumes, that.dataVolumes) && Objects.equals(this.userGroup, that.userGroup)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.siteType, that.siteType) && Objects.equals(this.siteName, that.siteName)
            && Objects.equals(this.product, that.product) && Objects.equals(this.ouName, that.ouName)
            && Objects.equals(this.osVersion, that.osVersion) && Objects.equals(this.sid, that.sid)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.internetMode, that.internetMode)
            && Objects.equals(this.isAttachingEip, that.isAttachingEip)
            && Objects.equals(this.attachState, that.attachState)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.billResourceId, that.billResourceId)
            && Objects.equals(this.process, that.process)
            && Objects.equals(this.inconsistentTypes, that.inconsistentTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId,
            computerName,
            addresses,
            ipAddresses,
            userList,
            userGroupList,
            desktopType,
            metadata,
            flavor,
            status,
            taskStatus,
            created,
            securityGroups,
            loginStatus,
            userName,
            attachUserInfos,
            productId,
            rootVolume,
            dataVolumes,
            userGroup,
            availabilityZone,
            siteType,
            siteName,
            product,
            ouName,
            osVersion,
            sid,
            orderId,
            tags,
            internetMode,
            isAttachingEip,
            attachState,
            enterpriseProjectId,
            subnetId,
            billResourceId,
            process,
            inconsistentTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolDesktopsDetailInfo {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
        sb.append("    userGroupList: ").append(toIndentedString(userGroupList)).append("\n");
        sb.append("    desktopType: ").append(toIndentedString(desktopType)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    loginStatus: ").append(toIndentedString(loginStatus)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    attachUserInfos: ").append(toIndentedString(attachUserInfos)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    internetMode: ").append(toIndentedString(internetMode)).append("\n");
        sb.append("    isAttachingEip: ").append(toIndentedString(isAttachingEip)).append("\n");
        sb.append("    attachState: ").append(toIndentedString(attachState)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    billResourceId: ").append(toIndentedString(billResourceId)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    inconsistentTypes: ").append(toIndentedString(inconsistentTypes)).append("\n");
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
