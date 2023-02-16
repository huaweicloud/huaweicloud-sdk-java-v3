package com.huaweicloud.sdk.imagesearch.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v2.model.AddDataRestInfoImageInfoObjects;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 搜索图像的相关信息，不同服务类型返回信息不同，具体可参见服务类型说明。
 */
public class SearchRestInfoImageInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="box")
    
    
    private String box;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    
    private BigDecimal category;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category_name")
    
    
    private String categoryName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="objects")
    
    
    private List<AddDataRestInfoImageInfoObjects> objects = null;
    
    public SearchRestInfoImageInfo withBox(String box) {
        this.box = box;
        return this;
    }

    


    /**
     * 用于搜索的主体目标框。
     * @return box
     */
    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    

    public SearchRestInfoImageInfo withCategory(BigDecimal category) {
        this.category = category;
        return this;
    }

    


    /**
     * 用于搜索的主体类目序号。
     * @return category
     */
    public BigDecimal getCategory() {
        return category;
    }

    public void setCategory(BigDecimal category) {
        this.category = category;
    }

    

    public SearchRestInfoImageInfo withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    


    /**
     * 用于搜索的主体类目名称。
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    

    public SearchRestInfoImageInfo withObjects(List<AddDataRestInfoImageInfoObjects> objects) {
        this.objects = objects;
        return this;
    }

    
    public SearchRestInfoImageInfo addObjectsItem(AddDataRestInfoImageInfoObjects objectsItem) {
        if(this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    public SearchRestInfoImageInfo withObjects(Consumer<List<AddDataRestInfoImageInfoObjects>> objectsSetter) {
        if(this.objects == null) {
            this.objects = new ArrayList<>();
        }
        objectsSetter.accept(this.objects);
        return this;
    }

    /**
     * 搜索图像中的所有主体列表。
     * @return objects
     */
    public List<AddDataRestInfoImageInfoObjects> getObjects() {
        return objects;
    }

    public void setObjects(List<AddDataRestInfoImageInfoObjects> objects) {
        this.objects = objects;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchRestInfoImageInfo searchRestInfoImageInfo = (SearchRestInfoImageInfo) o;
        return Objects.equals(this.box, searchRestInfoImageInfo.box) &&
            Objects.equals(this.category, searchRestInfoImageInfo.category) &&
            Objects.equals(this.categoryName, searchRestInfoImageInfo.categoryName) &&
            Objects.equals(this.objects, searchRestInfoImageInfo.objects);
    }
    @Override
    public int hashCode() {
        return Objects.hash(box, category, categoryName, objects);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchRestInfoImageInfo {\n");
        sb.append("    box: ").append(toIndentedString(box)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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

