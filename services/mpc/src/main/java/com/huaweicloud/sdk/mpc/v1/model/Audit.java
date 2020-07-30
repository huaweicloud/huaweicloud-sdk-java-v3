package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Audit
 */
public class Audit  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="position")
    
    private Integer position;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="index")
    
    private Integer index;

    public Audit withPosition(Integer position) {
        this.position = position;
        return this;
    }

    


    /**
     * 内容质检位置。  取值如下： - 1: 表示原始片源检查。 - 2：表示转码后片源检查，转码后的片源分辨率必须为720p及以上，且格式需与原始片源一致。 
     * minimum: 1
     * maximum: 2
     * @return position
     */
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Audit withIndex(Integer index) {
        this.index = index;
        return this;
    }

    


    /**
     * 转码模板ID索引。此索引必须为TransPresetID中的一个。 index从0开始，表示对应的是第几路的校验，比如一进六出，需要对第4路检查，就输入3。  >- 如对原片源质检，此字段不填。 >- 原始分辨率和转码后的分辨率都必须是1280*720及之上。 >- 若对转码后片源检测，必须和原始分辨率一致。 
     * minimum: 0
     * maximum: 2147483647
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Audit audit = (Audit) o;
        return Objects.equals(this.position, audit.position) &&
            Objects.equals(this.index, audit.index);
    }
    @Override
    public int hashCode() {
        return Objects.hash(position, index);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Audit {\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

