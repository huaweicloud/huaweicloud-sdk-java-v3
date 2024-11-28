package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询别名响应消息体
 */
public class ListAliasResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aliases")

    private List<AliasEntity> aliases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAliasResponseBody withAliases(List<AliasEntity> aliases) {
        this.aliases = aliases;
        return this;
    }

    public ListAliasResponseBody addAliasesItem(AliasEntity aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    public ListAliasResponseBody withAliases(Consumer<List<AliasEntity>> aliasesSetter) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<>();
        }
        aliasesSetter.accept(this.aliases);
        return this;
    }

    /**
     * 密钥关联的所有别名
     * @return aliases
     */
    public List<AliasEntity> getAliases() {
        return aliases;
    }

    public void setAliases(List<AliasEntity> aliases) {
        this.aliases = aliases;
    }

    public ListAliasResponseBody withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAliasResponseBody withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListAliasResponseBody that = (ListAliasResponseBody) obj;
        return Objects.equals(this.aliases, that.aliases) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aliases, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAliasResponseBody {\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
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
