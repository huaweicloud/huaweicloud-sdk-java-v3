package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 拓扑树节点信息。
 */
public class TreeNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent")

    private String parent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_id")

    private Long realId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private Long appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_admin")

    private Boolean isAdmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_root")

    private Boolean isRoot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private Long businessId;

    /**
     * 节点类型。
     */
    public static final class NodeTypeEnum {

        /**
         * Enum BUSINESS for value: "BUSINESS"
         */
        public static final NodeTypeEnum BUSINESS = new NodeTypeEnum("BUSINESS");

        /**
         * Enum SUB_BUSINESS for value: "SUB_BUSINESS"
         */
        public static final NodeTypeEnum SUB_BUSINESS = new NodeTypeEnum("SUB_BUSINESS");

        /**
         * Enum APPLICATION for value: "APPLICATION"
         */
        public static final NodeTypeEnum APPLICATION = new NodeTypeEnum("APPLICATION");

        /**
         * Enum ENVIRONMENT for value: "ENVIRONMENT"
         */
        public static final NodeTypeEnum ENVIRONMENT = new NodeTypeEnum("ENVIRONMENT");

        private static final Map<String, NodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeTypeEnum> createStaticFields() {
            Map<String, NodeTypeEnum> map = new HashMap<>();
            map.put("BUSINESS", BUSINESS);
            map.put("SUB_BUSINESS", SUB_BUSINESS);
            map.put("APPLICATION", APPLICATION);
            map.put("ENVIRONMENT", ENVIRONMENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodeTypeEnum(String value) {
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
        public static NodeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NodeTypeEnum(value));
        }

        public static NodeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodeTypeEnum) {
                return this.value.equals(((NodeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private NodeTypeEnum nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    public TreeNode withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 拓扑树节点id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TreeNode withParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * 拓扑树节点的父节点。
     * @return parent
     */
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public TreeNode withRealId(Long realId) {
        this.realId = realId;
        return this;
    }

    /**
     * 拓扑树节点的实际id。
     * @return realId
     */
    public Long getRealId() {
        return realId;
    }

    public void setRealId(Long realId) {
        this.realId = realId;
    }

    public TreeNode withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 拓扑树节点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 拓扑树节点展示名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TreeNode withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 组件名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public TreeNode withAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 组件id。
     * @return appId
     */
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public TreeNode withIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    /**
     * 是否是管理节点。
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public TreeNode withIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
        return this;
    }

    /**
     * 是否是根节点。
     * @return isRoot
     */
    public Boolean getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
    }

    public TreeNode withBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id。
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public TreeNode withNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型。
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
    }

    public TreeNode withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TreeNode withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否是默认的节点。
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TreeNode that = (TreeNode) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.parent, that.parent)
            && Objects.equals(this.realId, that.realId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.isAdmin, that.isAdmin)
            && Objects.equals(this.isRoot, that.isRoot) && Objects.equals(this.businessId, that.businessId)
            && Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.region, that.region)
            && Objects.equals(this.isDefault, that.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            parent,
            realId,
            name,
            displayName,
            appName,
            appId,
            isAdmin,
            isRoot,
            businessId,
            nodeType,
            region,
            isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TreeNode {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    realId: ").append(toIndentedString(realId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
        sb.append("    isRoot: ").append(toIndentedString(isRoot)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
