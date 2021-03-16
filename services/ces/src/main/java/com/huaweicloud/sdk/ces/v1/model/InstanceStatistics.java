package com.huaweicloud.sdk.ces.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 资源分组中的资源信息统计。
 */
public class InstanceStatistics  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unhealth")
    
    private Integer unhealth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type_statistics")
    
    private String typeStatistics;

    public InstanceStatistics withUnhealth(Integer unhealth) {
        this.unhealth = unhealth;
        return this;
    }

    


    /**
     * 该资源分组中当前处在告警状态的资源个数。
     * @return unhealth
     */
    public Integer getUnhealth() {
        return unhealth;
    }

    public void setUnhealth(Integer unhealth) {
        this.unhealth = unhealth;
    }

    

    public InstanceStatistics withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 该资源分组中资源的总个数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public InstanceStatistics withTypeStatistics(String typeStatistics) {
        this.typeStatistics = typeStatistics;
        return this;
    }

    


    /**
     * 该资源分组中选择的资源类型个数，如资源分组添加了弹性云服务、弹性公网IP和带宽则值为2。
     * @return typeStatistics
     */
    public String getTypeStatistics() {
        return typeStatistics;
    }

    public void setTypeStatistics(String typeStatistics) {
        this.typeStatistics = typeStatistics;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceStatistics instanceStatistics = (InstanceStatistics) o;
        return Objects.equals(this.unhealth, instanceStatistics.unhealth) &&
            Objects.equals(this.total, instanceStatistics.total) &&
            Objects.equals(this.typeStatistics, instanceStatistics.typeStatistics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(unhealth, total, typeStatistics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceStatistics {\n");
        sb.append("    unhealth: ").append(toIndentedString(unhealth)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    typeStatistics: ").append(toIndentedString(typeStatistics)).append("\n");
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

