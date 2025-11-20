package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestoreInst2ExistReq
 */
public class RestoreInst2ExistReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private Object source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private Object target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_node_relations")

    private List<DataNodeRelation> dataNodeRelations = null;

    public RestoreInst2ExistReq withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * 数据恢复源。
     * @return source
     */
    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public RestoreInst2ExistReq withTarget(Object target) {
        this.target = target;
        return this;
    }

    /**
     * 数据恢复目标。
     * @return target
     */
    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public RestoreInst2ExistReq withDataNodeRelations(List<DataNodeRelation> dataNodeRelations) {
        this.dataNodeRelations = dataNodeRelations;
        return this;
    }

    public RestoreInst2ExistReq addDataNodeRelationsItem(DataNodeRelation dataNodeRelationsItem) {
        if (this.dataNodeRelations == null) {
            this.dataNodeRelations = new ArrayList<>();
        }
        this.dataNodeRelations.add(dataNodeRelationsItem);
        return this;
    }

    public RestoreInst2ExistReq withDataNodeRelations(Consumer<List<DataNodeRelation>> dataNodeRelationsSetter) {
        if (this.dataNodeRelations == null) {
            this.dataNodeRelations = new ArrayList<>();
        }
        dataNodeRelationsSetter.accept(this.dataNodeRelations);
        return this;
    }

    /**
     * 关联dn。
     * @return dataNodeRelations
     */
    public List<DataNodeRelation> getDataNodeRelations() {
        return dataNodeRelations;
    }

    public void setDataNodeRelations(List<DataNodeRelation> dataNodeRelations) {
        this.dataNodeRelations = dataNodeRelations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreInst2ExistReq that = (RestoreInst2ExistReq) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.target, that.target)
            && Objects.equals(this.dataNodeRelations, that.dataNodeRelations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target, dataNodeRelations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreInst2ExistReq {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    dataNodeRelations: ").append(toIndentedString(dataNodeRelations)).append("\n");
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
