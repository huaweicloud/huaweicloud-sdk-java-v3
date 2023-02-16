package com.huaweicloud.sdk.imagesearch.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v2.model.DeleteInfo;
import com.huaweicloud.sdk.imagesearch.v2.model.DeleteRestInfoItems;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 删除数据的相关信息。
 */
public class DeleteRestInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    
    private List<DeleteRestInfoItems> items = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_info")
    
    
    private DeleteInfo deleteInfo;

    public DeleteRestInfo withItems(List<DeleteRestInfoItems> items) {
        this.items = items;
        return this;
    }

    
    public DeleteRestInfo addItemsItem(DeleteRestInfoItems itemsItem) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public DeleteRestInfo withItems(Consumer<List<DeleteRestInfoItems>> itemsSetter) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 删除数据列表。
     * @return items
     */
    public List<DeleteRestInfoItems> getItems() {
        return items;
    }

    public void setItems(List<DeleteRestInfoItems> items) {
        this.items = items;
    }

    

    public DeleteRestInfo withDeleteInfo(DeleteInfo deleteInfo) {
        this.deleteInfo = deleteInfo;
        return this;
    }

    public DeleteRestInfo withDeleteInfo(Consumer<DeleteInfo> deleteInfoSetter) {
        if(this.deleteInfo == null ){
            this.deleteInfo = new DeleteInfo();
            deleteInfoSetter.accept(this.deleteInfo);
        }
        
        return this;
    }


    /**
     * Get deleteInfo
     * @return deleteInfo
     */
    public DeleteInfo getDeleteInfo() {
        return deleteInfo;
    }

    public void setDeleteInfo(DeleteInfo deleteInfo) {
        this.deleteInfo = deleteInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteRestInfo deleteRestInfo = (DeleteRestInfo) o;
        return Objects.equals(this.items, deleteRestInfo.items) &&
            Objects.equals(this.deleteInfo, deleteRestInfo.deleteInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(items, deleteInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteRestInfo {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    deleteInfo: ").append(toIndentedString(deleteInfo)).append("\n");
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

