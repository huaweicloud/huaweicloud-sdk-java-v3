package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListInstancesRequestBody
 */
public class ListInstancesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim_name")

    private List<String> dimName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<List<String>> ids = null;

    public ListInstancesRequestBody withDimName(List<String> dimName) {
        this.dimName = dimName;
        return this;
    }

    public ListInstancesRequestBody addDimNameItem(String dimNameItem) {
        if (this.dimName == null) {
            this.dimName = new ArrayList<>();
        }
        this.dimName.add(dimNameItem);
        return this;
    }

    public ListInstancesRequestBody withDimName(Consumer<List<String>> dimNameSetter) {
        if (this.dimName == null) {
            this.dimName = new ArrayList<>();
        }
        dimNameSetter.accept(this.dimName);
        return this;
    }

    /**
     * **参数解释：** DNS批量查询接口支持查询的维度。 **约束限制：** 不涉及。 **取值范围：** - dns_public_zone_id：公网域名ID - dns_public_recordset_id：公网记录集ID，需与dns_public_zone_id组合使用 - dns_private_zone_id：内网域名ID - vpc_id：VPC ID，需与dns_private_zone_id组合使用 **默认取值：** 不涉及。
     * @return dimName
     */
    public List<String> getDimName() {
        return dimName;
    }

    public void setDimName(List<String> dimName) {
        this.dimName = dimName;
    }

    public ListInstancesRequestBody withIds(List<List<String>> ids) {
        this.ids = ids;
        return this;
    }

    public ListInstancesRequestBody addIdsItem(List<String> idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public ListInstancesRequestBody withIds(Consumer<List<List<String>>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * DNS上报的资源ID列表。
     * @return ids
     */
    public List<List<String>> getIds() {
        return ids;
    }

    public void setIds(List<List<String>> ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesRequestBody that = (ListInstancesRequestBody) obj;
        return Objects.equals(this.dimName, that.dimName) && Objects.equals(this.ids, that.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimName, ids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRequestBody {\n");
        sb.append("    dimName: ").append(toIndentedString(dimName)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
