package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateMessageDoV2
 */
public class CreateMessageDoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_ids")

    private List<String> accessoryIds = null;

    public CreateMessageDoV2 withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 留言内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CreateMessageDoV2 withAccessoryIds(List<String> accessoryIds) {
        this.accessoryIds = accessoryIds;
        return this;
    }

    public CreateMessageDoV2 addAccessoryIdsItem(String accessoryIdsItem) {
        if (this.accessoryIds == null) {
            this.accessoryIds = new ArrayList<>();
        }
        this.accessoryIds.add(accessoryIdsItem);
        return this;
    }

    public CreateMessageDoV2 withAccessoryIds(Consumer<List<String>> accessoryIdsSetter) {
        if (this.accessoryIds == null) {
            this.accessoryIds = new ArrayList<>();
        }
        accessoryIdsSetter.accept(this.accessoryIds);
        return this;
    }

    /**
     * 附件id
     * @return accessoryIds
     */
    public List<String> getAccessoryIds() {
        return accessoryIds;
    }

    public void setAccessoryIds(List<String> accessoryIds) {
        this.accessoryIds = accessoryIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMessageDoV2 that = (CreateMessageDoV2) obj;
        return Objects.equals(this.content, that.content) && Objects.equals(this.accessoryIds, that.accessoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, accessoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageDoV2 {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    accessoryIds: ").append(toIndentedString(accessoryIds)).append("\n");
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
