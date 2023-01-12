package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 点的id类型，仅持久化图需要填写。  &gt; 点ID类型确定后，将无法更改，请用户谨慎选择!
 */
public class ListGraphsRespVertexIdType  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id_type")
    
    
    private String idType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id_length")
    
    
    private Integer idLength;

    public ListGraphsRespVertexIdType withIdType(String idType) {
        this.idType = idType;
        return this;
    }

    


    /**
     * id类型，目前支持固定长度fixedLengthString和hash两种点ID类型。  - fixedLengthString：固定长度String格式下，实际点ID直接用于内部存储与计算，用户需指定一长度，实际点ID不可超过此长度。长度过大，可能影响查询性能，建议用户根据数据集状态进行设置。  - hash：哈希格式下，内部计算时将实际点ID转换成哈希码进行存储与计算，对实际点ID长度无限制，但是存在极低的概率(约10^(-43))出现点ID碰撞。若用户无法确定点ID的最大长度，建议选择哈希类型。
     * @return idType
     */
    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    

    public ListGraphsRespVertexIdType withIdLength(Integer idLength) {
        this.idLength = idLength;
        return this;
    }

    


    /**
     * 当id_type取值为fixedLengthString时必填，取值范围：1-128。
     * @return idLength
     */
    public Integer getIdLength() {
        return idLength;
    }

    public void setIdLength(Integer idLength) {
        this.idLength = idLength;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGraphsRespVertexIdType listGraphsRespVertexIdType = (ListGraphsRespVertexIdType) o;
        return Objects.equals(this.idType, listGraphsRespVertexIdType.idType) &&
            Objects.equals(this.idLength, listGraphsRespVertexIdType.idLength);
    }
    @Override
    public int hashCode() {
        return Objects.hash(idType, idLength);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGraphsRespVertexIdType {\n");
        sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
        sb.append("    idLength: ").append(toIndentedString(idLength)).append("\n");
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

