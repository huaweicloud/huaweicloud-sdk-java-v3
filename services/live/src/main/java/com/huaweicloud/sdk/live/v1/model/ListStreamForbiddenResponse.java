package com.huaweicloud.sdk.live.v1.model;

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
public class ListStreamForbiddenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocks")

    @JacksonXmlProperty(localName = "blocks")

    private List<StreamForbiddenList> blocks = null;

    public ListStreamForbiddenResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询结果的总元素数量
     * minimum: 0
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListStreamForbiddenResponse withBlocks(List<StreamForbiddenList> blocks) {
        this.blocks = blocks;
        return this;
    }

    public ListStreamForbiddenResponse addBlocksItem(StreamForbiddenList blocksItem) {
        if (this.blocks == null) {
            this.blocks = new ArrayList<>();
        }
        this.blocks.add(blocksItem);
        return this;
    }

    public ListStreamForbiddenResponse withBlocks(Consumer<List<StreamForbiddenList>> blocksSetter) {
        if (this.blocks == null) {
            this.blocks = new ArrayList<>();
        }
        blocksSetter.accept(this.blocks);
        return this;
    }

    /**
     * 禁播黑名单列表
     * @return blocks
     */
    public List<StreamForbiddenList> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<StreamForbiddenList> blocks) {
        this.blocks = blocks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStreamForbiddenResponse listStreamForbiddenResponse = (ListStreamForbiddenResponse) o;
        return Objects.equals(this.total, listStreamForbiddenResponse.total)
            && Objects.equals(this.blocks, listStreamForbiddenResponse.blocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, blocks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStreamForbiddenResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
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
