package com.huaweicloud.sdk.aos.v1.model;

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
 * 部署目标信息。
 */
public class DeploymentTargets {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<String> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids")

    private List<String> domainIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids_uri")

    private String domainIdsUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit_ids")

    private List<String> organizationalUnitIds = null;

    /**
     * 租户ID筛选类型，仅支持资源栈集权限模型是SERVICE_MANAGED时指定该参数。默认为NONE  用户可以指定不同的筛选类型，通过domain_ids或domain_ids_uri 指定或排除部署的用户信息，以增加或限制部署目标用户范围，实现不同的部署策略。     * `INTERSECTION` - 从所提供的 OUs 中选择指定用户进行部署。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。    * `DIFFERENCE` - 从所提供的 OUs 中排除指定用户部署。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。    * `UNION` - 除了部署到提供的 OUs 外，还将部署到指定的账户中。用户可以通过同时指定organizational_unit_ids 和 domain_ids/domain_ids_uri 以实现在同一请求中部署整个OU和来自不同OU的特定个人账户。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。创建资源栈实例（CreateStackInstances）除外，该API 不允许指定使用该类型。    * `NONE` - 只部署在指定 OUs 中的所有账户。该类型下domain_ids和domain_ids_uri字段必须为空。
     */
    public static final class DomainIdFilterTypeEnum {

        /**
         * Enum INTERSECTION for value: "INTERSECTION"
         */
        public static final DomainIdFilterTypeEnum INTERSECTION = new DomainIdFilterTypeEnum("INTERSECTION");

        /**
         * Enum DIFFERENCE for value: "DIFFERENCE"
         */
        public static final DomainIdFilterTypeEnum DIFFERENCE = new DomainIdFilterTypeEnum("DIFFERENCE");

        /**
         * Enum UNION for value: "UNION"
         */
        public static final DomainIdFilterTypeEnum UNION = new DomainIdFilterTypeEnum("UNION");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final DomainIdFilterTypeEnum NONE = new DomainIdFilterTypeEnum("NONE");

        private static final Map<String, DomainIdFilterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainIdFilterTypeEnum> createStaticFields() {
            Map<String, DomainIdFilterTypeEnum> map = new HashMap<>();
            map.put("INTERSECTION", INTERSECTION);
            map.put("DIFFERENCE", DIFFERENCE);
            map.put("UNION", UNION);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DomainIdFilterTypeEnum(String value) {
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
        public static DomainIdFilterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DomainIdFilterTypeEnum(value));
        }

        public static DomainIdFilterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DomainIdFilterTypeEnum) {
                return this.value.equals(((DomainIdFilterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id_filter_type")

    private DomainIdFilterTypeEnum domainIdFilterType;

    public DeploymentTargets withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    public DeploymentTargets addRegionsItem(String regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public DeploymentTargets withRegions(Consumer<List<String>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 用户指定资源栈集操作所涉及的区域。  *在DeployStackSet API中，根据用户输入regions和domain_ids列表，以笛卡尔积的形式选择资源栈集中存在的资源栈实例进行部署。如果指定了没有被资源栈集所管理的region，则会报错。*
     * @return regions
     */
    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public DeploymentTargets withDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }

    public DeploymentTargets addDomainIdsItem(String domainIdsItem) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        this.domainIds.add(domainIdsItem);
        return this;
    }

    public DeploymentTargets withDomainIds(Consumer<List<String>> domainIdsSetter) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        domainIdsSetter.accept(this.domainIds);
        return this;
    }

    /**
     * 当资源栈集权限模型是SELF_MANAGED时，用户指定包含本次操作涉及到的租户ID内容。  *在DeployStackSet API中，如果指定该参数，根据用户输入的domain_ids列表和regions列表，以笛卡尔积的形式选择资源栈集中存在的资源栈实例进行部署。如果指定了没有被资源栈集所管理的domain_id，则会报错。*  当资源栈集权限模型是SERVICE_MANAGED时，该参数需结合domain_id_filter_type使用。用于指定资源栈集操作涉及到的，从所提供的OU中指定或排除部署的租户ID信息，或除提供的OU外，还进行额外部署的租户ID信息。  domain_ids和domain_ids_uri 有且仅有一个存在。
     * @return domainIds
     */
    public List<String> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
    }

    public DeploymentTargets withDomainIdsUri(String domainIdsUri) {
        this.domainIdsUri = domainIdsUri;
        return this;
    }

    /**
     * 当资源栈集权限模型是SELF_MANAGED时，用户指定包含本次操作涉及到的租户ID内容文件的OBS地址。  内容格式要求每个租户ID以逗号（,）分隔，支持换行。当前仅支持csv文件，且文件的编码格式须为UTF-8。文件内容大小不超过100KB。  上传的csv文件应尽量避免Excel操作，以防出现读取内容不一致的问题。推荐使用记事本打开确认内容是否符合预期。  *在DeployStackSet API中，如果指定该参数，根据用户输入的domain_ids_uri文件内容和regions列表，以笛卡尔积的形式选择资源栈集中存在的资源栈实例进行部署。如果内容包含了没有被资源栈集所管理的domain_id，则会报错。*  当资源栈集权限模型是SERVICE_MANAGED时，该参数需结合domain_id_filter_type使用。链接文件内容用于指定资源栈集操作涉及到的，从所提供的OU中指定或排除部署的租户ID信息，或除提供的OU外，还进行额外部署的租户ID信息。  domain_ids和domain_ids_uri有且仅有一个存在。
     * @return domainIdsUri
     */
    public String getDomainIdsUri() {
        return domainIdsUri;
    }

    public void setDomainIdsUri(String domainIdsUri) {
        this.domainIdsUri = domainIdsUri;
    }

    public DeploymentTargets withOrganizationalUnitIds(List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }

    public DeploymentTargets addOrganizationalUnitIdsItem(String organizationalUnitIdsItem) {
        if (this.organizationalUnitIds == null) {
            this.organizationalUnitIds = new ArrayList<>();
        }
        this.organizationalUnitIds.add(organizationalUnitIdsItem);
        return this;
    }

    public DeploymentTargets withOrganizationalUnitIds(Consumer<List<String>> organizationalUnitIdsSetter) {
        if (this.organizationalUnitIds == null) {
            this.organizationalUnitIds = new ArrayList<>();
        }
        organizationalUnitIdsSetter.accept(this.organizationalUnitIds);
        return this;
    }

    /**
     * 组织单元（Organizational Unit，缩写OU）ID列表，仅在资源栈集权限模型是SERVICE_MANAGED时，才允许指定该参数。  用户指定的Organization组织部署的ID列表，可以是根组织（Root）ID，也可以是某些组织单元的ID。  创建资源栈实例 （CreateStackInstances）API 必须指定该参数，该API 会异步校验OU IDs 的合法性，校验有效的OU IDs 及其所有非空子OU ID 都会被资源栈集记录管理。该API允许指定没有或者已经被资源栈集管理的OU IDs。   * 若资源栈集不自动部署，空子OU不会被资源栈集记录管理（特指子OU下无成员账号或部署排除其下所有成员账号）。*   * 【暂不支持】若资源栈集开启自动部署，空子OU也会被资源栈集记录管理（特指子OU下无成员账号或部署排除其下所有成员账号），自动部署仅针对成员账号变动，不针对其他组织结构变化，例如新增OU等，新增OU不会自动被资源栈集管理。*  部署或删除资源栈实例（DeployStackSet、UpdateStackInstances、DeleteStackInstances） API，只允许指定已经被资源栈集管理的OU IDs。若指定了没有被资源栈集记录管理的OU IDs，则会报错。  删除资源栈实例 （DeleteStackInstances）API 必须指定该参数。  用户可以通过获取资源栈集元数据（ShowStackSetMetadata）API ，获取通过创建资源栈实例（CreateStackInstances）API 请求指定过的OU IDs。  资源栈集不仅会部署到目标 OU 中的用户，同时还会部署所有子 OU 下的用户。指定该参数后，资源栈集会根据用户输入的 OU 列表下所有的用户信息（包含子 OU 下的用户）和region列表，以笛卡尔积的形式，选择资源栈实例进行创建或部署。  *资源栈集不会选择组织管理员作为部署目标，进行资源栈实例的创建或部署，即使组织管理员位于给与的组织或组织的 OU 中。*
     * @return organizationalUnitIds
     */
    public List<String> getOrganizationalUnitIds() {
        return organizationalUnitIds;
    }

    public void setOrganizationalUnitIds(List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
    }

    public DeploymentTargets withDomainIdFilterType(DomainIdFilterTypeEnum domainIdFilterType) {
        this.domainIdFilterType = domainIdFilterType;
        return this;
    }

    /**
     * 租户ID筛选类型，仅支持资源栈集权限模型是SERVICE_MANAGED时指定该参数。默认为NONE  用户可以指定不同的筛选类型，通过domain_ids或domain_ids_uri 指定或排除部署的用户信息，以增加或限制部署目标用户范围，实现不同的部署策略。     * `INTERSECTION` - 从所提供的 OUs 中选择指定用户进行部署。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。    * `DIFFERENCE` - 从所提供的 OUs 中排除指定用户部署。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。    * `UNION` - 除了部署到提供的 OUs 外，还将部署到指定的账户中。用户可以通过同时指定organizational_unit_ids 和 domain_ids/domain_ids_uri 以实现在同一请求中部署整个OU和来自不同OU的特定个人账户。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。创建资源栈实例（CreateStackInstances）除外，该API 不允许指定使用该类型。    * `NONE` - 只部署在指定 OUs 中的所有账户。该类型下domain_ids和domain_ids_uri字段必须为空。
     * @return domainIdFilterType
     */
    public DomainIdFilterTypeEnum getDomainIdFilterType() {
        return domainIdFilterType;
    }

    public void setDomainIdFilterType(DomainIdFilterTypeEnum domainIdFilterType) {
        this.domainIdFilterType = domainIdFilterType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeploymentTargets that = (DeploymentTargets) obj;
        return Objects.equals(this.regions, that.regions) && Objects.equals(this.domainIds, that.domainIds)
            && Objects.equals(this.domainIdsUri, that.domainIdsUri)
            && Objects.equals(this.organizationalUnitIds, that.organizationalUnitIds)
            && Objects.equals(this.domainIdFilterType, that.domainIdFilterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions, domainIds, domainIdsUri, organizationalUnitIds, domainIdFilterType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentTargets {\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
        sb.append("    domainIdsUri: ").append(toIndentedString(domainIdsUri)).append("\n");
        sb.append("    organizationalUnitIds: ").append(toIndentedString(organizationalUnitIds)).append("\n");
        sb.append("    domainIdFilterType: ").append(toIndentedString(domainIdFilterType)).append("\n");
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
