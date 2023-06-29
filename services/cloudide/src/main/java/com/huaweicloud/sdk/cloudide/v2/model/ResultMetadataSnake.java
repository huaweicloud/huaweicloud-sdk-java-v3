package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResultMetadataSnake
 */
public class ResultMetadataSnake {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_type")

    private String metadataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_items")

    private List<Map<String, Object>> metadataItems = null;

    public ResultMetadataSnake withMetadataType(String metadataType) {
        this.metadataType = metadataType;
        return this;
    }

    /**
     * 元数据类型
     * @return metadataType
     */
    public String getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(String metadataType) {
        this.metadataType = metadataType;
    }

    public ResultMetadataSnake withMetadataItems(List<Map<String, Object>> metadataItems) {
        this.metadataItems = metadataItems;
        return this;
    }

    public ResultMetadataSnake addMetadataItemsItem(Map<String, Object> metadataItemsItem) {
        if (this.metadataItems == null) {
            this.metadataItems = new ArrayList<>();
        }
        this.metadataItems.add(metadataItemsItem);
        return this;
    }

    public ResultMetadataSnake withMetadataItems(Consumer<List<Map<String, Object>>> metadataItemsSetter) {
        if (this.metadataItems == null) {
            this.metadataItems = new ArrayList<>();
        }
        metadataItemsSetter.accept(this.metadataItems);
        return this;
    }

    /**
     * 元数据列表
     * @return metadataItems
     */
    public List<Map<String, Object>> getMetadataItems() {
        return metadataItems;
    }

    public void setMetadataItems(List<Map<String, Object>> metadataItems) {
        this.metadataItems = metadataItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResultMetadataSnake that = (ResultMetadataSnake) obj;
        return Objects.equals(this.metadataType, that.metadataType)
            && Objects.equals(this.metadataItems, that.metadataItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadataType, metadataItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultMetadataSnake {\n");
        sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
        sb.append("    metadataItems: ").append(toIndentedString(metadataItems)).append("\n");
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
