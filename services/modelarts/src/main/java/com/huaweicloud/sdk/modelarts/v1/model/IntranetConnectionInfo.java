package com.huaweicloud.sdk.modelarts.v1.model;

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
 * 内网接入信息
 */
public class IntranetConnectionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant_user_name")

    private String applicantUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_domain_name")

    private String ownerDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_list")

    private List<String> urlList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_url_list")

    private List<String> customUrlList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dispatcher_group_id")

    private String dispatcherGroupId;

    /**
     * **参数解释：** 接入粒度：SERVICE、GLOBAL **取值范围：** 不涉及。
     */
    public static final class TypeEnum {

        /**
         * Enum SERVICE for value: "SERVICE"
         */
        public static final TypeEnum SERVICE = new TypeEnum("SERVICE");

        /**
         * Enum GLOBAL for value: "GLOBAL"
         */
        public static final TypeEnum GLOBAL = new TypeEnum("GLOBAL");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SERVICE", SERVICE);
            map.put("GLOBAL", GLOBAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maos_network_name")

    private String maosNetworkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    public IntranetConnectionInfo withApplicantUserName(String applicantUserName) {
        this.applicantUserName = applicantUserName;
        return this;
    }

    /**
     * **参数解释：** 申请方用户名。 **取值范围：** 不涉及。
     * @return applicantUserName
     */
    public String getApplicantUserName() {
        return applicantUserName;
    }

    public void setApplicantUserName(String applicantUserName) {
        this.applicantUserName = applicantUserName;
    }

    public IntranetConnectionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 内网接入id。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IntranetConnectionInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 申请描述。 **取值范围：** 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public IntranetConnectionInfo withOwnerDomainName(String ownerDomainName) {
        this.ownerDomainName = ownerDomainName;
        return this;
    }

    /**
     * **参数解释：** 审核方domain name。  **取值范围：** 不涉及。
     * @return ownerDomainName
     */
    public String getOwnerDomainName() {
        return ownerDomainName;
    }

    public void setOwnerDomainName(String ownerDomainName) {
        this.ownerDomainName = ownerDomainName;
    }

    public IntranetConnectionInfo withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * **参数解释：** 内网访问场景。 **约束限制：** 不涉及。 **取值范围：** - POOL：用户资源池接入场景 - VPC：用户VPC接入场景 **默认取值：** 不涉及。
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public IntranetConnectionInfo withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * **参数解释：** 服务ID。 **取值范围：** 不涉及。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public IntranetConnectionInfo withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * **参数解释：** 服务名。 **取值范围：** 不涉及。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public IntranetConnectionInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 内网接入状态，支持列表查询。 **约束限制：** 不涉及。 **取值范围：** - APPROVING：审批中 - REJECTED：拒绝 - CONNECTING：接入中 - CONNECTED：已接入 - CANCELED：已取消 - FAILED：失败 - DELETING：删除中 **默认取值：** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IntranetConnectionInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释：** 子网ID。 **取值范围：** 不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public IntranetConnectionInfo withUrlList(List<String> urlList) {
        this.urlList = urlList;
        return this;
    }

    public IntranetConnectionInfo addUrlListItem(String urlListItem) {
        if (this.urlList == null) {
            this.urlList = new ArrayList<>();
        }
        this.urlList.add(urlListItem);
        return this;
    }

    public IntranetConnectionInfo withUrlList(Consumer<List<String>> urlListSetter) {
        if (this.urlList == null) {
            this.urlList = new ArrayList<>();
        }
        urlListSetter.accept(this.urlList);
        return this;
    }

    /**
     * **参数解释：** 访问地址列表。
     * @return urlList
     */
    public List<String> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<String> urlList) {
        this.urlList = urlList;
    }

    public IntranetConnectionInfo withCustomUrlList(List<String> customUrlList) {
        this.customUrlList = customUrlList;
        return this;
    }

    public IntranetConnectionInfo addCustomUrlListItem(String customUrlListItem) {
        if (this.customUrlList == null) {
            this.customUrlList = new ArrayList<>();
        }
        this.customUrlList.add(customUrlListItem);
        return this;
    }

    public IntranetConnectionInfo withCustomUrlList(Consumer<List<String>> customUrlListSetter) {
        if (this.customUrlList == null) {
            this.customUrlList = new ArrayList<>();
        }
        customUrlListSetter.accept(this.customUrlList);
        return this;
    }

    /**
     * **参数解释：** 访问地址列表。
     * @return customUrlList
     */
    public List<String> getCustomUrlList() {
        return customUrlList;
    }

    public void setCustomUrlList(List<String> customUrlList) {
        this.customUrlList = customUrlList;
    }

    public IntranetConnectionInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释：** VPC ID。 **取值范围：** 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public IntranetConnectionInfo withDispatcherGroupId(String dispatcherGroupId) {
        this.dispatcherGroupId = dispatcherGroupId;
        return this;
    }

    /**
     * **参数解释：** 服务绑定的dispatcher组ID。 **取值范围：** 不涉及。
     * @return dispatcherGroupId
     */
    public String getDispatcherGroupId() {
        return dispatcherGroupId;
    }

    public void setDispatcherGroupId(String dispatcherGroupId) {
        this.dispatcherGroupId = dispatcherGroupId;
    }

    public IntranetConnectionInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 接入粒度：SERVICE、GLOBAL **取值范围：** 不涉及。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public IntranetConnectionInfo withMaosNetworkName(String maosNetworkName) {
        this.maosNetworkName = maosNetworkName;
        return this;
    }

    /**
     * **参数解释：** 资源池网络名称。 **取值范围：** 不涉及。
     * @return maosNetworkName
     */
    public String getMaosNetworkName() {
        return maosNetworkName;
    }

    public void setMaosNetworkName(String maosNetworkName) {
        this.maosNetworkName = maosNetworkName;
    }

    public IntranetConnectionInfo withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * **参数解释：** 服务类型。 **取值范围：** 不涉及。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public IntranetConnectionInfo withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释：** 资源池ID。 **取值范围：** 不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public IntranetConnectionInfo withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 不涉及。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public IntranetConnectionInfo withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 修改时间。 **取值范围：** 不涉及。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntranetConnectionInfo that = (IntranetConnectionInfo) obj;
        return Objects.equals(this.applicantUserName, that.applicantUserName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.message, that.message) && Objects.equals(this.ownerDomainName, that.ownerDomainName)
            && Objects.equals(this.scene, that.scene) && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.urlList, that.urlList)
            && Objects.equals(this.customUrlList, that.customUrlList) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.dispatcherGroupId, that.dispatcherGroupId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.maosNetworkName, that.maosNetworkName)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.poolId, that.poolId)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicantUserName,
            id,
            message,
            ownerDomainName,
            scene,
            serviceId,
            serviceName,
            status,
            subnetId,
            urlList,
            customUrlList,
            vpcId,
            dispatcherGroupId,
            type,
            maosNetworkName,
            serviceType,
            poolId,
            createAt,
            updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntranetConnectionInfo {\n");
        sb.append("    applicantUserName: ").append(toIndentedString(applicantUserName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    ownerDomainName: ").append(toIndentedString(ownerDomainName)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    urlList: ").append(toIndentedString(urlList)).append("\n");
        sb.append("    customUrlList: ").append(toIndentedString(customUrlList)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    dispatcherGroupId: ").append(toIndentedString(dispatcherGroupId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    maosNetworkName: ").append(toIndentedString(maosNetworkName)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
