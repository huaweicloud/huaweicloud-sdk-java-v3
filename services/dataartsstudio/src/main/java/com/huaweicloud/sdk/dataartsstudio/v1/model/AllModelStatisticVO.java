package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AllModelStatisticVO
 */
public class AllModelStatisticVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequent")

    private List<ModelStatisticVO> frequent = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private List<ModelStatisticVO> top = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic")

    private List<ModelStatisticVO> logic = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical")

    private List<ModelStatisticVO> physical = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dwr")

    private ModelStatisticVO dwr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dm")

    private ModelStatisticVO dm;

    public AllModelStatisticVO withFrequent(List<ModelStatisticVO> frequent) {
        this.frequent = frequent;
        return this;
    }

    public AllModelStatisticVO addFrequentItem(ModelStatisticVO frequentItem) {
        if (this.frequent == null) {
            this.frequent = new ArrayList<>();
        }
        this.frequent.add(frequentItem);
        return this;
    }

    public AllModelStatisticVO withFrequent(Consumer<List<ModelStatisticVO>> frequentSetter) {
        if (this.frequent == null) {
            this.frequent = new ArrayList<>();
        }
        frequentSetter.accept(this.frequent);
        return this;
    }

    /**
     * 是否为常用。
     * @return frequent
     */
    public List<ModelStatisticVO> getFrequent() {
        return frequent;
    }

    public void setFrequent(List<ModelStatisticVO> frequent) {
        this.frequent = frequent;
    }

    public AllModelStatisticVO withTop(List<ModelStatisticVO> top) {
        this.top = top;
        return this;
    }

    public AllModelStatisticVO addTopItem(ModelStatisticVO topItem) {
        if (this.top == null) {
            this.top = new ArrayList<>();
        }
        this.top.add(topItem);
        return this;
    }

    public AllModelStatisticVO withTop(Consumer<List<ModelStatisticVO>> topSetter) {
        if (this.top == null) {
            this.top = new ArrayList<>();
        }
        topSetter.accept(this.top);
        return this;
    }

    /**
     * 首层模型。
     * @return top
     */
    public List<ModelStatisticVO> getTop() {
        return top;
    }

    public void setTop(List<ModelStatisticVO> top) {
        this.top = top;
    }

    public AllModelStatisticVO withLogic(List<ModelStatisticVO> logic) {
        this.logic = logic;
        return this;
    }

    public AllModelStatisticVO addLogicItem(ModelStatisticVO logicItem) {
        if (this.logic == null) {
            this.logic = new ArrayList<>();
        }
        this.logic.add(logicItem);
        return this;
    }

    public AllModelStatisticVO withLogic(Consumer<List<ModelStatisticVO>> logicSetter) {
        if (this.logic == null) {
            this.logic = new ArrayList<>();
        }
        logicSetter.accept(this.logic);
        return this;
    }

    /**
     * 逻辑模型。
     * @return logic
     */
    public List<ModelStatisticVO> getLogic() {
        return logic;
    }

    public void setLogic(List<ModelStatisticVO> logic) {
        this.logic = logic;
    }

    public AllModelStatisticVO withPhysical(List<ModelStatisticVO> physical) {
        this.physical = physical;
        return this;
    }

    public AllModelStatisticVO addPhysicalItem(ModelStatisticVO physicalItem) {
        if (this.physical == null) {
            this.physical = new ArrayList<>();
        }
        this.physical.add(physicalItem);
        return this;
    }

    public AllModelStatisticVO withPhysical(Consumer<List<ModelStatisticVO>> physicalSetter) {
        if (this.physical == null) {
            this.physical = new ArrayList<>();
        }
        physicalSetter.accept(this.physical);
        return this;
    }

    /**
     * 物理模型。
     * @return physical
     */
    public List<ModelStatisticVO> getPhysical() {
        return physical;
    }

    public void setPhysical(List<ModelStatisticVO> physical) {
        this.physical = physical;
    }

    public AllModelStatisticVO withDwr(ModelStatisticVO dwr) {
        this.dwr = dwr;
        return this;
    }

    public AllModelStatisticVO withDwr(Consumer<ModelStatisticVO> dwrSetter) {
        if (this.dwr == null) {
            this.dwr = new ModelStatisticVO();
            dwrSetter.accept(this.dwr);
        }

        return this;
    }

    /**
     * Get dwr
     * @return dwr
     */
    public ModelStatisticVO getDwr() {
        return dwr;
    }

    public void setDwr(ModelStatisticVO dwr) {
        this.dwr = dwr;
    }

    public AllModelStatisticVO withDm(ModelStatisticVO dm) {
        this.dm = dm;
        return this;
    }

    public AllModelStatisticVO withDm(Consumer<ModelStatisticVO> dmSetter) {
        if (this.dm == null) {
            this.dm = new ModelStatisticVO();
            dmSetter.accept(this.dm);
        }

        return this;
    }

    /**
     * Get dm
     * @return dm
     */
    public ModelStatisticVO getDm() {
        return dm;
    }

    public void setDm(ModelStatisticVO dm) {
        this.dm = dm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AllModelStatisticVO that = (AllModelStatisticVO) obj;
        return Objects.equals(this.frequent, that.frequent) && Objects.equals(this.top, that.top)
            && Objects.equals(this.logic, that.logic) && Objects.equals(this.physical, that.physical)
            && Objects.equals(this.dwr, that.dwr) && Objects.equals(this.dm, that.dm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequent, top, logic, physical, dwr, dm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllModelStatisticVO {\n");
        sb.append("    frequent: ").append(toIndentedString(frequent)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    physical: ").append(toIndentedString(physical)).append("\n");
        sb.append("    dwr: ").append(toIndentedString(dwr)).append("\n");
        sb.append("    dm: ").append(toIndentedString(dm)).append("\n");
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
