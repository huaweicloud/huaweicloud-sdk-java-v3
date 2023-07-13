package com.huaweicloud.sdk.cbs.v1.model;

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
public class ExecuteGetCharactersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "characters")

    private List<Character> characters = null;

    public ExecuteGetCharactersResponse withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 配额
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public ExecuteGetCharactersResponse withTotal(Integer total) {
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

    public ExecuteGetCharactersResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ExecuteGetCharactersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 返回数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ExecuteGetCharactersResponse withCharacters(List<Character> characters) {
        this.characters = characters;
        return this;
    }

    public ExecuteGetCharactersResponse addCharactersItem(Character charactersItem) {
        if (this.characters == null) {
            this.characters = new ArrayList<>();
        }
        this.characters.add(charactersItem);
        return this;
    }

    public ExecuteGetCharactersResponse withCharacters(Consumer<List<Character>> charactersSetter) {
        if (this.characters == null) {
            this.characters = new ArrayList<>();
        }
        charactersSetter.accept(this.characters);
        return this;
    }

    /**
     * 形象列表
     * @return characters
     */
    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteGetCharactersResponse that = (ExecuteGetCharactersResponse) obj;
        return Objects.equals(this.quota, that.quota) && Objects.equals(this.total, that.total)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.count, that.count)
            && Objects.equals(this.characters, that.characters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quota, total, offset, count, characters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteGetCharactersResponse {\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
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
