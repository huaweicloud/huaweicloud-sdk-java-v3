package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListSfsTurbosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sfs_turbos")

    private List<SfsTurboRsp> sfsTurbos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListSfsTurbosResponse withSfsTurbos(List<SfsTurboRsp> sfsTurbos) {
        this.sfsTurbos = sfsTurbos;
        return this;
    }

    public ListSfsTurbosResponse addSfsTurbosItem(SfsTurboRsp sfsTurbosItem) {
        if (this.sfsTurbos == null) {
            this.sfsTurbos = new ArrayList<>();
        }
        this.sfsTurbos.add(sfsTurbosItem);
        return this;
    }

    public ListSfsTurbosResponse withSfsTurbos(Consumer<List<SfsTurboRsp>> sfsTurbosSetter) {
        if (this.sfsTurbos == null) {
            this.sfsTurbos = new ArrayList<>();
        }
        sfsTurbosSetter.accept(this.sfsTurbos);
        return this;
    }

    /**
     * sfs-turbo资源列表。
     * @return sfsTurbos
     */
    public List<SfsTurboRsp> getSfsTurbos() {
        return sfsTurbos;
    }

    public void setSfsTurbos(List<SfsTurboRsp> sfsTurbos) {
        this.sfsTurbos = sfsTurbos;
    }

    public ListSfsTurbosResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * sfs-turbo资源总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSfsTurbosResponse that = (ListSfsTurbosResponse) obj;
        return Objects.equals(this.sfsTurbos, that.sfsTurbos) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sfsTurbos, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSfsTurbosResponse {\n");
        sb.append("    sfsTurbos: ").append(toIndentedString(sfsTurbos)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
