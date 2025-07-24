package com.huaweicloud.sdk.clouddc.v1.model;

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
public class ListIDcsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcs")

    private List<IDc> idcs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListIDcsResponse withIdcs(List<IDc> idcs) {
        this.idcs = idcs;
        return this;
    }

    public ListIDcsResponse addIdcsItem(IDc idcsItem) {
        if (this.idcs == null) {
            this.idcs = new ArrayList<>();
        }
        this.idcs.add(idcsItem);
        return this;
    }

    public ListIDcsResponse withIdcs(Consumer<List<IDc>> idcsSetter) {
        if (this.idcs == null) {
            this.idcs = new ArrayList<>();
        }
        idcsSetter.accept(this.idcs);
        return this;
    }

    /**
     * Get idcs
     * @return idcs
     */
    public List<IDc> getIdcs() {
        return idcs;
    }

    public void setIdcs(List<IDc> idcs) {
        this.idcs = idcs;
    }

    public ListIDcsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListIDcsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIDcsResponse that = (ListIDcsResponse) obj;
        return Objects.equals(this.idcs, that.idcs) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcs, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIDcsResponse {\n");
        sb.append("    idcs: ").append(toIndentedString(idcs)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
