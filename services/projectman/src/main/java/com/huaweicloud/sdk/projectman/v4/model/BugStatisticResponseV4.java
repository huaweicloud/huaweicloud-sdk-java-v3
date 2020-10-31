package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Bug信息
 */
public class BugStatisticResponseV4  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="critical_num")
    
    private Integer criticalNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="defect_index")
    
    private Double defectIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module")
    
    private String module;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="normal_num")
    
    private Integer normalNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="serious_num")
    
    private Integer seriousNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tip_num")
    
    private Integer tipNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public BugStatisticResponseV4 withCriticalNum(Integer criticalNum) {
        this.criticalNum = criticalNum;
        return this;
    }

    


    /**
     * 重要程度为关键的缺陷数
     * @return criticalNum
     */
    public Integer getCriticalNum() {
        return criticalNum;
    }

    public void setCriticalNum(Integer criticalNum) {
        this.criticalNum = criticalNum;
    }

    public BugStatisticResponseV4 withDefectIndex(Double defectIndex) {
        this.defectIndex = defectIndex;
        return this;
    }

    


    /**
     * DI
     * @return defectIndex
     */
    public Double getDefectIndex() {
        return defectIndex;
    }

    public void setDefectIndex(Double defectIndex) {
        this.defectIndex = defectIndex;
    }

    public BugStatisticResponseV4 withModule(String module) {
        this.module = module;
        return this;
    }

    


    /**
     * 模块
     * @return module
     */
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public BugStatisticResponseV4 withNormalNum(Integer normalNum) {
        this.normalNum = normalNum;
        return this;
    }

    


    /**
     * 重要程度为一般的缺陷数
     * @return normalNum
     */
    public Integer getNormalNum() {
        return normalNum;
    }

    public void setNormalNum(Integer normalNum) {
        this.normalNum = normalNum;
    }

    public BugStatisticResponseV4 withSeriousNum(Integer seriousNum) {
        this.seriousNum = seriousNum;
        return this;
    }

    


    /**
     * 重要程度为严重的缺陷数
     * @return seriousNum
     */
    public Integer getSeriousNum() {
        return seriousNum;
    }

    public void setSeriousNum(Integer seriousNum) {
        this.seriousNum = seriousNum;
    }

    public BugStatisticResponseV4 withTipNum(Integer tipNum) {
        this.tipNum = tipNum;
        return this;
    }

    


    /**
     * 重要程度为提示的缺陷数
     * @return tipNum
     */
    public Integer getTipNum() {
        return tipNum;
    }

    public void setTipNum(Integer tipNum) {
        this.tipNum = tipNum;
    }

    public BugStatisticResponseV4 withTotal(Integer total) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BugStatisticResponseV4 bugStatisticResponseV4 = (BugStatisticResponseV4) o;
        return Objects.equals(this.criticalNum, bugStatisticResponseV4.criticalNum) &&
            Objects.equals(this.defectIndex, bugStatisticResponseV4.defectIndex) &&
            Objects.equals(this.module, bugStatisticResponseV4.module) &&
            Objects.equals(this.normalNum, bugStatisticResponseV4.normalNum) &&
            Objects.equals(this.seriousNum, bugStatisticResponseV4.seriousNum) &&
            Objects.equals(this.tipNum, bugStatisticResponseV4.tipNum) &&
            Objects.equals(this.total, bugStatisticResponseV4.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(criticalNum, defectIndex, module, normalNum, seriousNum, tipNum, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BugStatisticResponseV4 {\n");
        sb.append("    criticalNum: ").append(toIndentedString(criticalNum)).append("\n");
        sb.append("    defectIndex: ").append(toIndentedString(defectIndex)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    normalNum: ").append(toIndentedString(normalNum)).append("\n");
        sb.append("    seriousNum: ").append(toIndentedString(seriousNum)).append("\n");
        sb.append("    tipNum: ").append(toIndentedString(tipNum)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

