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
 * 添加图像数据的相关信息，不同服务类型返回信息不同，具体可参见服务类型说明。
 */
public class AddDataRestInfoImageInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="face_num")
    
    
    private BigDecimal faceNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="objects")
    
    
    private List<AddDataRestInfoImageInfoObjects> objects = null;
    
    public AddDataRestInfoImageInfo withFaceNum(BigDecimal faceNum) {
        this.faceNum = faceNum;
        return this;
    }

    


    /**
     * 添加的人脸数量。
     * @return faceNum
     */
    public BigDecimal getFaceNum() {
        return faceNum;
    }

    public void setFaceNum(BigDecimal faceNum) {
        this.faceNum = faceNum;
    }

    

    public AddDataRestInfoImageInfo withObjects(List<AddDataRestInfoImageInfoObjects> objects) {
        this.objects = objects;
        return this;
    }

    
    public AddDataRestInfoImageInfo addObjectsItem(AddDataRestInfoImageInfoObjects objectsItem) {
        if(this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    public AddDataRestInfoImageInfo withObjects(Consumer<List<AddDataRestInfoImageInfoObjects>> objectsSetter) {
        if(this.objects == null) {
            this.objects = new ArrayList<>();
        }
        objectsSetter.accept(this.objects);
        return this;
    }

    /**
     * 添加的主体列表。
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
        AddDataRestInfoImageInfo addDataRestInfoImageInfo = (AddDataRestInfoImageInfo) o;
        return Objects.equals(this.faceNum, addDataRestInfoImageInfo.faceNum) &&
            Objects.equals(this.objects, addDataRestInfoImageInfo.objects);
    }
    @Override
    public int hashCode() {
        return Objects.hash(faceNum, objects);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDataRestInfoImageInfo {\n");
        sb.append("    faceNum: ").append(toIndentedString(faceNum)).append("\n");
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

