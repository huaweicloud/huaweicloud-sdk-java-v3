package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListFlavorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private List<String> publicBorderGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private List<Integer> category = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_all")

    private Boolean listAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_sold_out")

    private Boolean flavorSoldOut;

    public ListFlavorsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 参数解释：上一页最后一条记录的ID。  约束限制： - 必须与limit一起使用。 - 不指定时表示查询第一页。 - 该字段不允许为空或无效的ID。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListFlavorsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 参数解释：每页返回的个数。  取值范围：0-2000  默认取值：2000
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListFlavorsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 参数解释：是否反向查询。  约束限制： - 必须与limit一起使用。 - 当page_reverse=true时，若要查询上一页，marker取值为当前页返回值的previous_marker。  取值范围： - true：查询上一页。 - false：查询下一页，默认。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListFlavorsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListFlavorsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListFlavorsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 参数解释：规格ID。  支持多值查询，查询条件格式：*id=xxx&id=xxx*。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListFlavorsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListFlavorsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListFlavorsRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 参数解释：规格名称。  支持多值查询，查询条件格式：*name=xxx&name=xxx*。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListFlavorsRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ListFlavorsRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListFlavorsRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 参数解释：规格类别。  取值范围： - L4和L7 表示四层网络型和七层应用型flavor。 [- gateway 表示网关型LB的flavor，目前只支持弹性计费类型。当前仅支持欧洲局点。](tag:hws_eu) - L4_elastic和L7_elastic 表示弹性扩缩容实例的下限规格。 - L4_elastic_max、L7_elastic_max[和gateway_elastic_max](tag:hws_eu) 表示弹性扩缩容实例的上限规格。  支持多值查询，查询条件格式：*type=xxx&type=xxx*。
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public ListFlavorsRequest withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 参数解释：是否查询公共规格。  取值范围：true表示公共规格，所有租户可见。false表示私有规格，为当前租户所有。
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public ListFlavorsRequest withPublicBorderGroup(List<String> publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    public ListFlavorsRequest addPublicBorderGroupItem(String publicBorderGroupItem) {
        if (this.publicBorderGroup == null) {
            this.publicBorderGroup = new ArrayList<>();
        }
        this.publicBorderGroup.add(publicBorderGroupItem);
        return this;
    }

    public ListFlavorsRequest withPublicBorderGroup(Consumer<List<String>> publicBorderGroupSetter) {
        if (this.publicBorderGroup == null) {
            this.publicBorderGroup = new ArrayList<>();
        }
        publicBorderGroupSetter.accept(this.publicBorderGroup);
        return this;
    }

    /**
     * 站点pbg。  支持多值查询，查询条件格式：*public_border_group=xxx&public_border_group=xxx*。
     * @return publicBorderGroup
     */
    public List<String> getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(List<String> publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ListFlavorsRequest withCategory(List<Integer> category) {
        this.category = category;
        return this;
    }

    public ListFlavorsRequest addCategoryItem(Integer categoryItem) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        this.category.add(categoryItem);
        return this;
    }

    public ListFlavorsRequest withCategory(Consumer<List<Integer>> categorySetter) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        categorySetter.accept(this.category);
        return this;
    }

    /**
     * 站点category。  支持多值查询，查询条件格式：*category=xxx&category=xxx*。
     * @return category
     */
    public List<Integer> getCategory() {
        return category;
    }

    public void setCategory(List<Integer> category) {
        this.category = category;
    }

    public ListFlavorsRequest withListAll(Boolean listAll) {
        this.listAll = listAll;
        return this;
    }

    /**
     * 设置list_all=true时，返回当前租户所有的弹性上限规格（l4_elastic_max、l7_elastic_max）。否则只返回该租户弹性上限规格中最大的规格（l4类型优先比较cps指标，然后是带宽；l7类型优先比较https cps指标然后是qps指标）。
     * @return listAll
     */
    public Boolean getListAll() {
        return listAll;
    }

    public void setListAll(Boolean listAll) {
        this.listAll = listAll;
    }

    public ListFlavorsRequest withFlavorSoldOut(Boolean flavorSoldOut) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlavorsRequest that = (ListFlavorsRequest) obj;
        return Objects.equals(this.marker, that.marker) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.pageReverse, that.pageReverse) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.shared, that.shared)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.category, that.category) && Objects.equals(this.listAll, that.listAll)
            && Objects.equals(this.flavorSoldOut, that.flavorSoldOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker,
            limit,
            pageReverse,
            id,
            name,
            type,
            shared,
            publicBorderGroup,
            category,
            listAll,
            flavorSoldOut);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    listAll: ").append(toIndentedString(listAll)).append("\n");
        sb.append("    flavorSoldOut: ").append(toIndentedString(flavorSoldOut)).append("\n");
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
