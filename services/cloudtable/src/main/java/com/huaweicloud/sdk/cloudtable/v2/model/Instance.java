package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Instance */
public class Instance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_num")

    private Integer cuNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lemon_num")

    private Integer lemonNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nics> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tsd_num")

    private Integer tsdNum;

    public Instance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /** 集群所在可用区的ID。
     * 
     * @return availabilityZone */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Instance withCuNum(Integer cuNum) {
        this.cuNum = cuNum;
        return this;
    }

    /** CloudTable集群计算单元节点数目，默认为2。
     * 
     * @return cuNum */
    public Integer getCuNum() {
        return cuNum;
    }

    public void setCuNum(Integer cuNum) {
        this.cuNum = cuNum;
    }

    public Instance withLemonNum(Integer lemonNum) {
        this.lemonNum = lemonNum;
        return this;
    }

    /** CloudTable集群Lemon节点数目，默认为2。
     * 
     * @return lemonNum */
    public Integer getLemonNum() {
        return lemonNum;
    }

    public void setLemonNum(Integer lemonNum) {
        this.lemonNum = lemonNum;
    }

    public Instance withNics(List<Nics> nics) {
        this.nics = nics;
        return this;
    }

    public Instance addNicsItem(Nics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public Instance withNics(Consumer<List<Nics>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /** 集群所在网络信息。
     * 
     * @return nics */
    public List<Nics> getNics() {
        return nics;
    }

    public void setNics(List<Nics> nics) {
        this.nics = nics;
    }

    public Instance withTsdNum(Integer tsdNum) {
        this.tsdNum = tsdNum;
        return this;
    }

    /** CloudTable集群TSD节点数目，默认为2。
     * 
     * @return tsdNum */
    public Integer getTsdNum() {
        return tsdNum;
    }

    public void setTsdNum(Integer tsdNum) {
        this.tsdNum = tsdNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Instance instance = (Instance) o;
        return Objects.equals(this.availabilityZone, instance.availabilityZone)
            && Objects.equals(this.cuNum, instance.cuNum) && Objects.equals(this.lemonNum, instance.lemonNum)
            && Objects.equals(this.nics, instance.nics) && Objects.equals(this.tsdNum, instance.tsdNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone, cuNum, lemonNum, nics, tsdNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Instance {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    cuNum: ").append(toIndentedString(cuNum)).append("\n");
        sb.append("    lemonNum: ").append(toIndentedString(lemonNum)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    tsdNum: ").append(toIndentedString(tsdNum)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
