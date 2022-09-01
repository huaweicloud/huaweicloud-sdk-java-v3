package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAssociatedWikisResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wikis")

    @JacksonXmlProperty(localName = "wikis")

    private List<AttachWikiDetail> wikis = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    public ListAssociatedWikisResponse withWikis(List<AttachWikiDetail> wikis) {
        this.wikis = wikis;
        return this;
    }

    public ListAssociatedWikisResponse addWikisItem(AttachWikiDetail wikisItem) {
        if (this.wikis == null) {
            this.wikis = new ArrayList<>();
        }
        this.wikis.add(wikisItem);
        return this;
    }

    public ListAssociatedWikisResponse withWikis(Consumer<List<AttachWikiDetail>> wikisSetter) {
        if (this.wikis == null) {
            this.wikis = new ArrayList<>();
        }
        wikisSetter.accept(this.wikis);
        return this;
    }

    /**
     * 关联的wiki列表
     * @return wikis
     */
    public List<AttachWikiDetail> getWikis() {
        return wikis;
    }

    public void setWikis(List<AttachWikiDetail> wikis) {
        this.wikis = wikis;
    }

    public ListAssociatedWikisResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAssociatedWikisResponse listAssociatedWikisResponse = (ListAssociatedWikisResponse) o;
        return Objects.equals(this.wikis, listAssociatedWikisResponse.wikis)
            && Objects.equals(this.total, listAssociatedWikisResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wikis, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssociatedWikisResponse {\n");
        sb.append("    wikis: ").append(toIndentedString(wikis)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
