package com.huaweicloud.sdk.eip.v3.model;

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
 * 公网IP池详情
 */
public class PublicipPoolShowResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    /**
     * 取值, spec_bgp(专属离散动态), spec_sbgp(专属离散静态)
     */
    public static final class TypeEnum {

        /**
         * Enum SPEC_BGP for value: "spec_bgp"
         */
        public static final TypeEnum SPEC_BGP = new TypeEnum("spec_bgp");

        /**
         * Enum SPEC_SBGP for value: "spec_sbgp"
         */
        public static final TypeEnum SPEC_SBGP = new TypeEnum("spec_sbgp");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("spec_bgp", SPEC_BGP);
            map.put("spec_sbgp", SPEC_SBGP);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private BillingInfoDict billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_common")

    private Boolean isCommon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagsInfo> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_share_bandwidth_types")

    private List<String> allowShareBandwidthTypes = null;

    public PublicipPoolShowResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 公网IP池id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicipPoolShowResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 公网IP池名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublicipPoolShowResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PublicipPoolShowResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 取值, spec_bgp(专属离散动态), spec_sbgp(专属离散静态)
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PublicipPoolShowResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublicipPoolShowResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PublicipPoolShowResp withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 池子大小
     * minimum: 0
     * maximum: 999999
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PublicipPoolShowResp withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已经使用的ip数量
     * minimum: 0
     * maximum: 999999
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public PublicipPoolShowResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 公网IP池创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public PublicipPoolShowResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 公网IP池更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PublicipPoolShowResp withBillingInfo(BillingInfoDict billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    public PublicipPoolShowResp withBillingInfo(Consumer<BillingInfoDict> billingInfoSetter) {
        if (this.billingInfo == null) {
            this.billingInfo = new BillingInfoDict();
            billingInfoSetter.accept(this.billingInfo);
        }

        return this;
    }

    /**
     * Get billingInfo
     * @return billingInfo
     */
    public BillingInfoDict getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(BillingInfoDict billingInfo) {
        this.billingInfo = billingInfo;
    }

    public PublicipPoolShowResp withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 功能说明：中心还是边缘。公网IP池取值为center
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public PublicipPoolShowResp withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 功能说明：是否共享
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public PublicipPoolShowResp withIsCommon(Boolean isCommon) {
        this.isCommon = isCommon;
        return this;
    }

    /**
     * 功能说明：是否公共池
     * @return isCommon
     */
    public Boolean getIsCommon() {
        return isCommon;
    }

    public void setIsCommon(Boolean isCommon) {
        this.isCommon = isCommon;
    }

    public PublicipPoolShowResp withTags(List<TagsInfo> tags) {
        this.tags = tags;
        return this;
    }

    public PublicipPoolShowResp addTagsItem(TagsInfo tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PublicipPoolShowResp withTags(Consumer<List<TagsInfo>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 默认不显示。用户标签
     * @return tags
     */
    public List<TagsInfo> getTags() {
        return tags;
    }

    public void setTags(List<TagsInfo> tags) {
        this.tags = tags;
    }

    public PublicipPoolShowResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 功能说明：企业项目ID。最大长度36字节,带“-”连字符的UUID格式,或者是字符串“0”。创建弹性公网IP时,给弹性公网IP绑定企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PublicipPoolShowResp withAllowShareBandwidthTypes(List<String> allowShareBandwidthTypes) {
        this.allowShareBandwidthTypes = allowShareBandwidthTypes;
        return this;
    }

    public PublicipPoolShowResp addAllowShareBandwidthTypesItem(String allowShareBandwidthTypesItem) {
        if (this.allowShareBandwidthTypes == null) {
            this.allowShareBandwidthTypes = new ArrayList<>();
        }
        this.allowShareBandwidthTypes.add(allowShareBandwidthTypesItem);
        return this;
    }

    public PublicipPoolShowResp withAllowShareBandwidthTypes(Consumer<List<String>> allowShareBandwidthTypesSetter) {
        if (this.allowShareBandwidthTypes == null) {
            this.allowShareBandwidthTypes = new ArrayList<>();
        }
        allowShareBandwidthTypesSetter.accept(this.allowShareBandwidthTypes);
        return this;
    }

    /**
     * 功能说明：表示此publicip可以加入的共享带宽类型列表，如果为空列表，则表示该           publicip不能加入任何共享带宽 约束：publicip只能加入到有该带宽类型的共享带宽中
     * @return allowShareBandwidthTypes
     */
    public List<String> getAllowShareBandwidthTypes() {
        return allowShareBandwidthTypes;
    }

    public void setAllowShareBandwidthTypes(List<String> allowShareBandwidthTypes) {
        this.allowShareBandwidthTypes = allowShareBandwidthTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicipPoolShowResp publicipPoolShowResp = (PublicipPoolShowResp) o;
        return Objects.equals(this.id, publicipPoolShowResp.id) && Objects.equals(this.name, publicipPoolShowResp.name)
            && Objects.equals(this.status, publicipPoolShowResp.status)
            && Objects.equals(this.type, publicipPoolShowResp.type)
            && Objects.equals(this.description, publicipPoolShowResp.description)
            && Objects.equals(this.projectId, publicipPoolShowResp.projectId)
            && Objects.equals(this.size, publicipPoolShowResp.size)
            && Objects.equals(this.used, publicipPoolShowResp.used)
            && Objects.equals(this.createdAt, publicipPoolShowResp.createdAt)
            && Objects.equals(this.updatedAt, publicipPoolShowResp.updatedAt)
            && Objects.equals(this.billingInfo, publicipPoolShowResp.billingInfo)
            && Objects.equals(this.publicBorderGroup, publicipPoolShowResp.publicBorderGroup)
            && Objects.equals(this.shared, publicipPoolShowResp.shared)
            && Objects.equals(this.isCommon, publicipPoolShowResp.isCommon)
            && Objects.equals(this.tags, publicipPoolShowResp.tags)
            && Objects.equals(this.enterpriseProjectId, publicipPoolShowResp.enterpriseProjectId)
            && Objects.equals(this.allowShareBandwidthTypes, publicipPoolShowResp.allowShareBandwidthTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            type,
            description,
            projectId,
            size,
            used,
            createdAt,
            updatedAt,
            billingInfo,
            publicBorderGroup,
            shared,
            isCommon,
            tags,
            enterpriseProjectId,
            allowShareBandwidthTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicipPoolShowResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    isCommon: ").append(toIndentedString(isCommon)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    allowShareBandwidthTypes: ").append(toIndentedString(allowShareBandwidthTypes)).append("\n");
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
