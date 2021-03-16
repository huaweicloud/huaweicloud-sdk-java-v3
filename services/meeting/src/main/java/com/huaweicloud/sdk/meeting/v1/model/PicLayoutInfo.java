package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.SubPicLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PicLayoutInfo
 */
public class PicLayoutInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x")
    
    private Integer x;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="y")
    
    private Integer y;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subPicLayoutInfoList")
    
    private List<SubPicLayoutInfo> subPicLayoutInfoList = null;
    
    public PicLayoutInfo withX(Integer x) {
        this.x = x;
        return this;
    }

    


    /**
     * 多画面布局的宽度
     * minimum: 1
     * @return x
     */
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    

    public PicLayoutInfo withY(Integer y) {
        this.y = y;
        return this;
    }

    


    /**
     * 多画面布局的高度
     * minimum: 1
     * @return y
     */
    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    

    public PicLayoutInfo withSubPicLayoutInfoList(List<SubPicLayoutInfo> subPicLayoutInfoList) {
        this.subPicLayoutInfoList = subPicLayoutInfoList;
        return this;
    }

    
    public PicLayoutInfo addSubPicLayoutInfoListItem(SubPicLayoutInfo subPicLayoutInfoListItem) {
        this.subPicLayoutInfoList.add(subPicLayoutInfoListItem);
        return this;
    }

    public PicLayoutInfo withSubPicLayoutInfoList(Consumer<List<SubPicLayoutInfo>> subPicLayoutInfoListSetter) {
        if(this.subPicLayoutInfoList == null ){
            this.subPicLayoutInfoList = new ArrayList<>();
        }
        subPicLayoutInfoListSetter.accept(this.subPicLayoutInfoList);
        return this;
    }

    /**
     * 子画面布局具体列表
     * @return subPicLayoutInfoList
     */
    public List<SubPicLayoutInfo> getSubPicLayoutInfoList() {
        return subPicLayoutInfoList;
    }

    public void setSubPicLayoutInfoList(List<SubPicLayoutInfo> subPicLayoutInfoList) {
        this.subPicLayoutInfoList = subPicLayoutInfoList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PicLayoutInfo picLayoutInfo = (PicLayoutInfo) o;
        return Objects.equals(this.x, picLayoutInfo.x) &&
            Objects.equals(this.y, picLayoutInfo.y) &&
            Objects.equals(this.subPicLayoutInfoList, picLayoutInfo.subPicLayoutInfoList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y, subPicLayoutInfoList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PicLayoutInfo {\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    subPicLayoutInfoList: ").append(toIndentedString(subPicLayoutInfoList)).append("\n");
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

