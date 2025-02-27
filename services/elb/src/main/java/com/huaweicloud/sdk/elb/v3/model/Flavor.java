package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 负载均衡器规格信息。
 */
public class Flavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private FlavorInfo info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_sold_out")

    private Boolean flavorSoldOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private Integer category;

    public Flavor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数解释：规格ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flavor withInfo(FlavorInfo info) {
        this.info = info;
        return this;
    }

    public Flavor withInfo(Consumer<FlavorInfo> infoSetter) {
        if (this.info == null) {
            this.info = new FlavorInfo();
            infoSetter.accept(this.info);
        }

        return this;
    }

    /**
     * Get info
     * @return info
     */
    public FlavorInfo getInfo() {
        return info;
    }

    public void setInfo(FlavorInfo info) {
        this.info = info;
    }

    public Flavor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数解释：规格名称。  取值范围：  网络型有如下规格：   - L4_flavor.elb.s1.small: 小型 I   - L4_flavor.elb.s2.small: 小型 II   - L4_flavor.elb.s1.medium: 中型 I   - L4_flavor.elb.s2.medium: 中型 II   - L4_flavor.elb.s1.large: 大型 I   - L4_flavor.elb.s2.large: 大型 II   - L4_flavor.elb.pro.max: 四层弹性规格  应用型有如下规格：   - L7_flavor.elb.s1.small: 小型 I   - L7_flavor.elb.s2.small: 小型 II   - L7_flavor.elb.s1.medium: 中型 I   - L7_flavor.elb.s2.medium: 中型 II   - L7_flavor.elb.s1.large: 大型 I   - L7_flavor.elb.s2.large: 大型 II   - L7_flavor.elb.s1.extra-large: 超大型 I   - L7_flavor.elb.s2.extra-large: 超大型 II   - L7_flavor.elb.pro.max: 七层弹性规格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flavor withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 参数解释：是否公共规格。  取值范围： - true表示公共规格，所有租户可见。 - false表示私有规格，为当前租户所有。
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public Flavor withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 参数解释：项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Flavor withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 参数解释：规格类别。  取值范围：   - L4和L7 表示四层网络型和七层应用型flavor。   [- gateway 表示网关型LB的flavor，目前只支持弹性计费类型。当前仅支持欧洲局点。](tag:hws_eu)   - L4_elastic和L7_elastic 表示弹性扩缩容实例的下限规格。已废弃，请勿使用。   - L4_elastic_max、L7_elastic_max[和gateway_elastic_max](tag:hws_eu) 表示弹性扩缩容实例的上限规格。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Flavor withFlavorSoldOut(Boolean flavorSoldOut) {
        this.flavorSoldOut = flavorSoldOut;
        return this;
    }

    /**
     * 参数解释： [是否售罄。](tag:hws) [是否无法购买该规格的LB。](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,fcs,dt,ctc,cmcc,tm,sbc,hk_sbc,hk_tm,hk_vdf,srg,ct)  取值范围： - true：[已售罄，将](tag:hws)无法购买该规格的LB。 - false：[未售罄，](tag:hws)可购买该规格的LB。
     * @return flavorSoldOut
     */
    public Boolean getFlavorSoldOut() {
        return flavorSoldOut;
    }

    public void setFlavorSoldOut(Boolean flavorSoldOut) {
        this.flavorSoldOut = flavorSoldOut;
    }

    public Flavor withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 参数解释：网络公共边界组，如：center
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public Flavor withCategory(Integer category) {
        this.category = category;
        return this;
    }

    /**
     * 参数解释：网络公共边界组编码。  取值范围：0表示center，21表示homezone。
     * @return category
     */
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Flavor that = (Flavor) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.info, that.info)
            && Objects.equals(this.name, that.name) && Objects.equals(this.shared, that.shared)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.flavorSoldOut, that.flavorSoldOut)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, info, name, shared, projectId, type, flavorSoldOut, publicBorderGroup, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    flavorSoldOut: ").append(toIndentedString(flavorSoldOut)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
