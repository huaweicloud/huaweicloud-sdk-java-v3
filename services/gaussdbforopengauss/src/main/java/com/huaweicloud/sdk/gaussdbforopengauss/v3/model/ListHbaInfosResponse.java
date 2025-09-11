package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListHbaInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hba_confs")

    private List<HbaConfResult> hbaConfs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    public ListHbaInfosResponse withHbaConfs(List<HbaConfResult> hbaConfs) {
        this.hbaConfs = hbaConfs;
        return this;
    }

    public ListHbaInfosResponse addHbaConfsItem(HbaConfResult hbaConfsItem) {
        if (this.hbaConfs == null) {
            this.hbaConfs = new ArrayList<>();
        }
        this.hbaConfs.add(hbaConfsItem);
        return this;
    }

    public ListHbaInfosResponse withHbaConfs(Consumer<List<HbaConfResult>> hbaConfsSetter) {
        if (this.hbaConfs == null) {
            this.hbaConfs = new ArrayList<>();
        }
        hbaConfsSetter.accept(this.hbaConfs);
        return this;
    }

    /**
     * **参数解释**: 客户端接入配置列表。
     * @return hbaConfs
     */
    public List<HbaConfResult> getHbaConfs() {
        return hbaConfs;
    }

    public void setHbaConfs(List<HbaConfResult> hbaConfs) {
        this.hbaConfs = hbaConfs;
    }

    public ListHbaInfosResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: hba配置总数。 **取值范围**: [0, 2^31-1]，取决于实际查询大小。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHbaInfosResponse that = (ListHbaInfosResponse) obj;
        return Objects.equals(this.hbaConfs, that.hbaConfs) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hbaConfs, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHbaInfosResponse {\n");
        sb.append("    hbaConfs: ").append(toIndentedString(hbaConfs)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
